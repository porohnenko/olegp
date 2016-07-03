--Написать триггер, запрещающий корректировать данные в таблице PROGRESS между сессиями.

CREATE TRIGGER ProgressTerm
   ON Progress
   FOR UPDATE, DELETE
AS
   IF  EXISTS
( SELECT 'TRUE'      
     FROM Progress
	WHERE (DATEPART(mm,getDATE())<>'01' AND NTerm  %2=1)
              OR (DATEPART(mm,getDATE())<>'06' AND  NTerm  %2=0))
BEGIN       
RAISERROR('Нельзя исправлять оценку!!!',16,1)
/*-- Откат транзакции в случае возникновения ошибки*/
	ROLLBACK TRAN
END
------------

UPDATE Progress SET mark=9 WHERE NRecordBook='133'
DELETE FROM Progress WHERE NRecordBook='133'
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

CREATE TRIGGER UpdateProgress
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
SET mark=10
WHERE NRecordBook='135'
