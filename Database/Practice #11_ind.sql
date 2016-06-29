
--------------------------------------------------------------------------------------------
--Задание 1
--Создать триггер, запрещающий добавление строк в таблицу dbo.Teachers.

create trigger LockAddLinesToTeachers
on dbo.Teachers
for insert as print 'Вставка строк запрещена!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 2
--Создать триггер, запрещающий обновление строк в таблице dbo.Departments.

create trigger LockUpdateLinesIntoDepartments
on dbo.Departments
for update as print 'Изменение строк запрещено!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 3
--Создать триггер, запрещающий обновление строк в таблице dbo.SalaryCosts.

create trigger LockUpdateLinesIntoSalaryCosts
on dbo.SalaryCosts
for update as print 'Изменение строк запрещено!'
rollback tran

--------------------------------------------------------------------------------------------
--Задание 4
--Создать хранимую процедуру, выполняющую вставку строк в таблицу Progress и триггер, 
--который будет срабатывать на вставку строк и будет подсчитывать средний балл вводимого 
--студента и выводить его фамилию и средний балл (по экзаменам).


go
create procedure AddLinesToSalaryCosts
@NameDepartment varchar(35),
@Head varchar(15),
@Adress varchar(35),
@Location varchar(35),
@Phone int
as
begin 
	insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values (@NameDepartment, @Head, @Adress, @Location, @Phone)
end

execute AddFaculty 'ФРЭ', 'Короткевич А.В.', 'П.Бровки 6', 'Минск',  2938548 


create trigger AddLinesCalcAvrgMark
on Departments
FOR INSERT AS
IF EXISTS
( SELECT 'TRUE' FROM Departments)
begin
select AVG(SalaryCosts.SalaryRate) [AVG Salary] from SalaryCosts
end

