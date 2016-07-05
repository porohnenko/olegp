 -- Вывести личный номер преподавателя, факультет и оклад преподавателей для тех
-- преподавателей, у которых оклад выше среднего оклада в ВУЗе.
use TeachersOfHighSchool
select EmployeeNumber [Личный номер], Department [Факультет], SalaryRate [Оклад]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- Вывести личный номер преподавателя, факультет и оклад преподавателей для тех
-- преподавателей, у которых зп  ниже средней
-- зп по факультету, в котором они преподают.

select EmployeeNumber [Личный номер], Department [Факультет], Salary [Итог]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers)
-----------------------------------------------------------------------------------------

select distinct TeachName, Department, FacultyAdress, Salary
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeacherName and T.Adress = D.FacultyAdress 
	and T.Salary > (select AVG(Salary) from Teachers)

select AVG(Salary) [average salary] from Teachers 
-----------------------------------------------------------------------------------------
--Используя операторы над множествами, вывести имена всех студентов,
--которые сдали экзамен по дисциплине Проектирование баз данных или по
--дисциплине Организация баз данных.
select distinct TeachName,Post,Department
	from dbo.Teachers T, Departments D, SalaryCosts S
	where T.TeachName = S.TeacherName
	and S.Department = D.NameDepartment
	and D.NameDepartment like 'ИИТ'
	or S.Department in ('ФКСИС')
	

