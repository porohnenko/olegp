--Написать триггер, запрещающий корректировать данные в таблице PROGRESS между сессиями.

CREATE TRIGGER ProgressTerm
   ON Progress
   FOR INSERT, UPDATE, DELETE
AS
   IF  EXISTS
( SELECT 'TRUE'      
     FROM Progress
	WHERE (DATEPART(mm,getDATE())<>'01' AND NTerm  %2=1)
              OR (DATEPART(mm,getDATE())<>'06' AND  NTerm  %2=0))
BEGIN       
RAISERROR('Нельзя исправлять оценку!!!',20,1)
/*-- Откат транзакции в случае возникновения ошибки*/
	ROLLBACK TRAN
END
------------
UPDATE Progress SET mark=2 WHERE NRecordBook='133'
INSERT INTO Progress VALUES ('133',1,2,1,4,5)
--------------------------------------------------------------------------------------------
--Написать триггер, удаляющий строки в таблице Progress относящиеся к записям удаляемым из 
--отношения Student.

CREATE TRIGGER StudentProgress
   ON Student
   FOR INSERT, UPDATE, DELETE
AS
   DECLARE @COUNT int
   SELECT @COUNT=COUNT(*) FROM DELETED
-- Проверяем удалялись ли из главной таблицы Student  какие-либо записи.
-- Если да, то удаление необходимо выполнить и из зависимой таблицы
IF @COUNT>0
   BEGIN
       DELETE FROM PROGRESS
 	FROM DELETED D
         JOIN PROGRESS P
          ON D.NRecordBook=P.NRecordBook
   END
--------------------------------------------------------------------------------------------
--Создать триггер, запрещающий исправлять оценку в отношении Progress на более высокую. 

CREATE TRIGGER Update1Progress
   ON PROGRESS   FOR  UPDATE
  AS
   IF  EXISTS
    ( SELECT 'TRUE'      
 	FROM INSERTED I
         LEFT JOIN DELETED D
          ON D.NRecordBook=I.NRecordBook
		WHERE I.mark>D.mark)
BEGIN       
RAISERROR('Нельзя исправлять оценку!!!',16,1)  
-- Откат транзакции в случае возникновения ошибки
	ROLLBACK TRAN
END


UPDATE Progress 
SET mark=4 
WHERE NRecordBook='135'

--------------------------------------------------------------------------------------------
--Задание 1
--Создать триггер, запрещающий добавление строк в таблицу UPlan.

create trigger LockAddLinesToUPlan
on dbo.UPlan
for insert as print 'Вставка строк запрещена!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 2
--Создать триггер, запрещающий обновление строк в таблице SUBJECTS.

create trigger LockUpdateLinesIntoSubjects
on dbo.Subjects
for update as print 'Изменение строк запрещено!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 3
--Создать триггер, запрещающий обновление строк в таблице WORK.

create trigger LockUpdateLinesIntoWork
on dbo.Work
for update as print 'Изменение строк запрещено!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 4
--Создать хранимую процедуру, выполняющую вставку строк в таблицу Progress и триггер, 
--который будет срабатывать на вставку строк и будет подсчитывать средний балл вводимого 
--студента и выводить его фамилию и средний балл (по экзаменам).

use Students_progress
go
create procedure AddLinesToProgress
@IDReport INT,
@IDSubject INT,
@NRecordBook INT,
@Nterm INT,
@PIN INT,
@Mark INT
as 
insert into dbo.Progress(IDReport,IDSubject,NRecordBook,Nterm,PIN,Mark)
values (@IDReport, @IDSubject, @NRecordBook, @Nterm, @PIN, @Mark)
create trigger AddLinesSelectStudentCalcAvrgMark
on dbo.Progress
as insert 