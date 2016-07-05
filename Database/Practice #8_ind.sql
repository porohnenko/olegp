EXEC SP_HELP SalaryCosts
-----------------------------------------------------------------------------------------

alter table [TeachersOfHighSchool].[dbo].[SalaryCosts]
	add constraint CheckTeachSal check([SalaryRate] <= 14000000);
alter table [TeachersOfHighSchool].[dbo].[SalaryCosts] drop constraint CheckTeachSal;
-----------------------------------------------------------------------------------------

-- Создайте внешние ключи во всех таблицах, используя опцию
-- FOREIGN KEY, при этом установите опцию каскадного удаления там, где
-- это необходимо.
alter table dbo.SalaryCosts
add CONSTRAINT SalaryCostsForeign 
FOREIGN KEY (Department) REFERENCES dbo.Departments(NameDepartment) 
ON DELETE CASCADE
alter table dbo.SalaryCosts drop constraint SalaryCostsForeign;

-----------------------------------------------------------------------------------------

-- Проследите за изменением ограничения FOREIGN KEY в отношениях,
-- связанных с отношением Student. Еще раз восстановите все удаленные
-- ограничения.
ALTER TABLE SalaryCosts
with check
CHECK CONSTRAINT ALL

EXEC SP_HELP SalaryCosts
-----------------------------------------------------------------------------------------

-- Отключите ограничения внешнего ключа в таблице SalaryCosts. Введите в
-- таблицу SalaryCosts нового преподавателя.
-- Попытайтесь подключить ранее отключенное ограничение.
-- Выполните все необходимые действия для того, чтобы вновь
-- подключить ограничение, а все данные в отношении Student соответствовали
-- условиям целостности базы данных.
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsForeign
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsTeachName
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsNameDepartment

insert into SalaryCosts (TeacherName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Лапицкая Н.В.****','ИЭФ*****', 2016-03-05,2016-02-01 ,168,12000000)
	
ALTER TABLE dbo.SalaryCosts
CHECK CONSTRAINT ALL

-----------------------------------------------------------------------------------------
-- Добавить в таблицу Student столбец Single, тип данных VARCHAR(3),
-- назначив значение по умолчанию “Да”. Удалить столбец.
ALTER TABLE dbo.Teachers
ADD Smoke VARCHAR(3) NOT NULL DEFAULT 'No';

-----------------------------------------------------------------------------------------

-- Добавить в таблицу Student столбец AVGMark, тип NUMERIC (5,2). В
-- столбце будет храниться средняя оценка студента. Мы оставим этот столбец в базе
-- данных лишь для того, чтобы в дальнейшем продемонстрировать с помощью него
-- работу некоторых команд и процедур, написание которых как раз и будет
-- обусловлено наличием этого избыточного столбца. Отсюда вывод - такие
-- столбцы, содержащие расчетные данные, полученные на основании уже
-- хранящихся в таблице данных, не следует включать в таблицы.
ALTER TABLE dbo.Departments
ADD AVGSalary NUMERIC (10,2) NOT NULL DEFAULT 0;

-----------------------------------------------------------------------------------------

-- Изменить длины полей в соответствии с таблицей (см. Таблица 1).
-- Выполнить анализ - почему не удалось выполнить заданные операции с
-- некоторыми столбцами? Что необходимо предпринять, чтобы эти изменения всё
-- же произвести?
ALTER TABLE dbo.Departments
ALTER COLUMN Head VARCHAR(100)

ALTER TABLE dbo.Departments
ALTER COLUMN AVGSalary NUMERIC (5,3)

EXEC SP_HELP SalaryCosts

ALTER TABLE dbo.Departments
ADD AVGtime NUMERIC (10,2) NOT NULL DEFAULT 0;

alter table dbo.Employees
add CONSTRAINT checkId check (Id <= 999999);
 
alter table dbo.Employees
ALTER COLUMN Name VARCHAR(100)

ALTER TABLE dbo.SalaryCosts
ALTER COLUMN SalaryMonth date
-----------------------------------------------------------------------------------------

-- Переименовать таблицу Progress в таблицу Uspev.
EXEC SP_RENAME 'SalaryCosts','SalaryCosts***';
-----------------------------------------------------------------------------------------

-- Восстановить прежнее название переименованной в предыдущем
-- задании таблицы.
EXEC SP_RENAME 'SalaryCosts***','SalaryCosts';







