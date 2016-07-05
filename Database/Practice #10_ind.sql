--Задание 28
--Создать представление для просмотра базы данных с целью определения места работы
CREATE VIEW TeachersViewAdress
AS SELECT T.TeachName, AcademicTitleDegree, NameDepartment, D.FacultyAdress, Location
FROM Teachers T, SalaryCosts S, Departments D
WHERE T.TeachName = S.TeacherName and S.Department = D.NameDepartment

SELECT * FROM TeachersViewAdress
--------------------------------------------------------------------------------------
--Задание 29
--Создать представление для вывода табеля зарплаты.
CREATE VIEW TeachersViewSalary
AS SELECT T.TeachName, D1.NameDepartment, T.Salary
FROM Teachers T,SalaryCosts S, Departments D1
WHERE T.TeachName = S.TeacherName and S.Department = D1.NameDepartment

SELECT * FROM TeachersViewSalary
--------------------------------------------------------------------------------------
--Создать представление для вывода информации о преподавателях, имеющих звание 
--"д.т.н., профессор" и работающих по адресу "Платонова 39".
CREATE VIEW TeachersViewInfo
as select TeachName [Имя преподавателя], Post[Должность], AcademicTitleDegree [Звание],
EmployeeNumber [Личный номер], Department [Факультет]
FROM Teachers T INNER JOIN Departments D
ON T.Adress = D.FacultyAdress INNER JOIN SalaryCosts S
ON T.TeachName = S.TeacherName
where T.AcademicTitleDegree = 'д.т.н., профессор' and D.FacultyAdress = 'Платонова 39'

SELECT * FROM TeachersViewInfo 