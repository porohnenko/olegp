-- Задание 1
-- Вывести личный номер преподавателя, факультет и оклад преподавателей для тех
-- преподавателей, у которых оклад выше среднего оклада в ВУЗе.
use TeachersOfHighSchool
select EmployeeNumber [Личный номер], Department [Факультет], SalaryRate [Оклад]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- Задание 2
-- Вывести личный номер преподавателя, факультет и зп преподавателей для тех
-- преподавателей, у которых зп  ниже средней
-- зп по факультету, в котором они преподают.

select EmployeeNumber [Личный номер], Department [Факультет], Salary [Итог]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers /* N1, SalaryCosts D1, Departments S1
					where N1.TeachName = D1.TeachName and D1.Department = S1.NameDepartment*/)
-----------------------------------------------------------------------------------------

-- Задание 3
-- Вывести название факультетов, на которых среднЯЯ зп БОЛЬШЕ  средней зп по ВУЗу.
DECLARE @avgSalaryByFaculty float
DECLARE @avgSalaryByUniver decimal(10,2)

set @avgSalaryByFaculty = (select AVG(Salary) from SalaryCosts S1, Departments D1, Teachers T1
					where S1.TeacherName = T1.TeachName and S1.Department = D1.NameDepartment);
set @avgSalaryByUniver = (select AVG(Salary) from Teachers);
					
select NameDepartment [Факультет], @avgSalaryByFAculty [Средняя з/п по факультету],
	   @avgSalaryByUniver [Средняя з/п по ВУЗу]
	from Departments 
	where @avgSalaryByFaculty <= @avgSalaryByUniver
	
select Department, DistanceFromTheCenter
from Teachers T
inner join SalaryCosts S on T.TeachName = S.TeacherName
inner join 
-----------------------------------------------------------------------------------------					
-- Задание 4
select TeachName, Department, FacultyAdress, Salary
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeacherName and T.Adress = D.FacultyAdress 
	and T.Salary > (select AVG(Salary) from Teachers)

select AVG(Salary) [average salary] from Teachers 
-----------------------------------------------------------------------------------------
-- Задание 5
--Вывести все названия видов отчетности и названия дисциплин по тем
--дисциплинам, по которым не было получено ни одной отличной оценки.
ALTER TABLE dbo.Departments
ADD DistanceFromTheCenter int;

select NameReport, s.NameSubject
	from Progress p, Subjects s, Report r
	where p.IDSubject = s.IDSubject and p.IDReport = r.IDReport
	and s.NameSubject NOT IN (select s.NameSubject from Progress p, Subjects s
	where p.IDSubject = s.IDSubject and p.Mark >= 9 group by s.NameSubject)
	group by s.NameSubject, r.NameReport;
-----------------------------------------------------------------------------------------
-- Задание 6
--Используя операторы над множествами, вывести имена всех студентов,
--которые сдали экзамен по дисциплине Проектирование баз данных или по
--дисциплине Организация баз данных.
select [StName],[NameReport],[NameSubject]
	from Progress P, Subjects S, Student St,Report R
	where P.IDReport = R.IDReport
	and P.NRecordBook = St.NRecordBook
	and P.IDSubject = S.IDSubject
	and R.NameReport like 'Testing'
	and S.NameSubject in ('Database')
	

