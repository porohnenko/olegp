-- Задание 1
-- Вывести личный номер преподавателя, факультет и оклад преподавателей для тех
-- преподавателей, у которых оклад выше среднего оклада в ВУЗе.
use TeachersOfHighSchool
select EmployeeNumber [Личный номер], Department [Факультет], SalaryRate [Оклад]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeachName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- Задание 2
-- Вывести личный номер преподавателя, факультет и зп преподавателей для тех
-- преподавателей, у которых зп  ниже средней
-- зп по факультету, в котором они преподают.

select EmployeeNumber [Личный номер], Department [Факультет], Salary [Итог]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeachName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers /* N1, SalaryCosts D1, Departments S1
					where N1.TeachName = D1.TeachName and D1.Department = S1.NameDepartment*/)
-----------------------------------------------------------------------------------------

-- Задание 3
-- Вывести звание преподавателей, у которых средний зп равен среднему
-- зп по факультету, в котором он преподает.

select EmployeeNumber [Ученая степень]
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeachName and S.Department = D.NameDepartment
	and (select Max(Salary) from Teachers T1)
	=
	(select Min(Salary) from SalaryCosts S1, Departments D1
					where S1.Department = D1.NameDepartment)

-----------------------------------------------------------------------------------------					
-- Задание 4
-- Вывести имена студентов отличников и название предметов, по
-- которым они сдавали экзамены.

select [StName], [NameSubject]
	from Student ST, Subjects S, Progress P, Report R
	where ST.NRecordBook = P.NRecordBook and S.IDSubject = P.IDSubject and P.IDReport = R.IDReport
	and Mark > 8
	--and U.NTerm = 1
-----------------------------------------------------------------------------------------
-- Задание 5
--Вывести все названия видов отчетности и названия дисциплин по тем
--дисциплинам, по которым не было получено ни одной отличной оценки.
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
	

