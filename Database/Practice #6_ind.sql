select TeachName
	from [Teachers] where TeachName like '%ен%'
	
select TeachName
	from [Teachers] where TeachName like '%о[ ]%'
	
select Adress
	from [Teachers] where Adress like '%ов[^ ]%'

----------------------------------------------------------------------------------
--Задание 3
--Вывести имена и номера зачеток всех студентов, у которых нет ни одной оценки 3.

select [S].[NRecordBook] [№ зачетной книжки], [StName] [ФИО], [Mark][Отметка]
	from [Student] S inner join [Progress] P
		on [S].[NRecordBook]=[P].[NRecordBook]
	where Mark>=7
	GROUP BY S.NRecordBook, StName,P.Mark
----------------------------------------------------------------------------------
--Задание 4
--Вывести имена всех преподавателей, которые ведут дисциплину Базы данных.

select [T].[PIN],T.TeachName
	from [Progress] P join [Teacher] T
		on P.PIN = T.PIN
		inner join [Subjects] S
		on P.IDSubject = S.IDSubject
	where S.NameSubject = 'Database'
group by T.PIN, T.TeachName
----------------------------------------------------------------------------------
--Задание 5
--Вывести все дисциплины, по которым сдается экзамен. Название дисциплин расположить в порядке возрастания.

select distinct P.IDReport [Код вида контроля], S.NameSubject [Наименование предмета]
	from [Progress] P inner join [Report] R
		on P.IDReport = R.IDReport 
		inner join [Subjects] S
		on P.IDSubject = S.IDSubject
	where R.NameReport = 'Examenation'
order by S.NameSubject,P.IDReport
----------------------------------------------------------------------------------
--Задание 6
--Вывести имена преподавателей и название дисциплин, которые они ведут, если по этим дисциплинам выставлена хоть одна оценка.

select distinct [T].TeachName [Имя преподавателя], S.NameSubject [Наименование дисциплины]
	from [Progress] P join [Teacher] T
		on P.PIN = T.PIN
		join [Subjects] S
		on S.IDSubject = P.IDSubject
where Mark is not null
order by T.TeachName, S.NameSubject
----------------------------------------------------------------------------------
--Задание 7
--Вывести имена преподавателей которые преподают как в 5 так и в 6 семестрах.

select distinct [T].TeachName [Имя преподавателя]
	from [UPlan] U join [Teacher] T
		on U.PIN = T.PIN
where U.NTerm between '1' and '2'
----------------------------------------------------------------------------------
-------------------------------------
