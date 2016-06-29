--Задание 28
--Создать представление для просмотра базы данных с целью определения места работы
CREATE VIEW TeachersViewAdress
AS SELECT T.TeachName, AcademicTitleDegree, NameDepartment, D.Adress, Location
FROM Teachers T, SalaryCosts S, Departments D
WHERE T.TeachName = S.TeachName and S.Department = D.NameDepartment

SELECT * FROM TeachersViewAdress
--------------------------------------------------------------------------------------
--Задание 29
--Создать представление для вывода табеля зарплаты.
CREATE VIEW TeachersViewSalary
AS SELECT T.TeachName, D1.NameDepartment, T.Salary
FROM Teachers T,SalaryCosts S, Departments D1
WHERE T.TeachName = S.TeachName and S.Department = D1.NameDepartment

SELECT * FROM TeachersViewSalary
--------------------------------------------------------------------------------------
--Создать представление для вывода информации о предметах, изучаемых в 3 семестре 
--студентами специальности  ИСТ.
CREATE VIEW TeachersViewSalary----- 