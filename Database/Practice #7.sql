-- Задание 1
-- Вывести имя студента, название предмета и оценку студентов для тех
-- студентов, у которых оценка по той или иной дисциплине выше средней
-- оценки по этой самой дисциплине.

select [StName], [NameSubject],[Mark]
	from Student ST, Subjects S, Progress P
	where P.IDSubject = S.IDSubject and ST.NRecordBook = P.NRecordBook
	and Mark > (select AVG(Mark) from Progress P1, Subjects S1
					where S1.IDSubject = P.IDSubject and S1.IDSubject = P1.IDSubject)
---------------------------------------------------------------------------------------

-- Задание 2
-- Вывести имя студента, название предмета и оценку студентов для тех
-- студентов, у которых оценка по той или иной дисциплине выше средней
-- оценки по группе, в которой они обучаются.

select [StName], [NameSubject],[Mark]
	from Student ST, Subjects S, Progress P
	where P.IDSubject = S.IDSubject and ST.NRecordBook = P.NRecordBook
	and Mark > (select AVG(Mark) from Progress P1, Student ST1
					where ST1.IDGroup = ST.IDGroup and ST1.NRecordBook = P1.NRecordBook)
-----------------------------------------------------------------------------------------

-- Задание 3
-- Вывести имена студентов, у которых средняя оценка равна средней
-- оценке по группе, в которой учится студент.

select [StName]
	from Student ST, Progress P, SGroup G
	where ST.NRecordBook = P.NRecordBook and ST.IDGroup = G.IDGroup
	and (select AVG(Mark) from Progress P1, Student ST1
					where ST1.NRecordBook = P.NRecordBook and ST1.NRecordBook = P1.NRecordBook)
	=
	(select AVG(Mark) from Progress P2, Student ST2
					where ST2.IDGroup = ST.IDGroup and ST2.NRecordBook = P2.NRecordBook)

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
	



