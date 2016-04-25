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









----------------------------------------------------------------------------------
--Задание 3
--Вывести ФИО, личные номера и должность всех преподавателей, у которых оклад выше 11 млн.руб.

select T.TeachName [ФИО], T.Post [Должность], T.EmployeeNumber [Личный номер], S.SalaryRate [Оклад]
	from Teachers T inner join SalaryCosts S
		on T.TeachName=S.TeachName
	where SalaryRate >= 11000000
	
----------------------------------------------------------------------------------
--Задание 4
--Вывести имена всех преподавателей, которые ведут дисциплины на факультете 'ФКСИС'.

select T.TeachName [ФИО], S.Department [Факультет]
	from Teachers T join SalaryCosts S 
		on T.TeachName = S.TeachName
		where S.Department = 'ФКСИС'
group by T.TeachName,S.Department
----------------------------------------------------------------------------------
--Задание 5
--Вывести ФИО и личные номера преподавателей факультета ФКСИС, у которых зарплата выше 12 млн.руб. Личные номера расположить в порядке возрастания.

select distinct T.EmployeeNumber [Личный номер], S.TeachName [ФИО], T.Salary [з/п, руб.]
	from SalaryCosts S inner join Teachers T
		on S.TeachName = T.TeachName 
		where S.Department = 'ФКСИС'
order by T.EmployeeNumber
----------------------------------------------------------------------------------
--Задание 6
--Вывести имена руководителей факультетов и название факультетов, ФИО преподавателей которые работали в текущем месяце сверх нормы.

select distinct T.TeachName [ФИО преподавателя], D.NameDepartment [Факультет], D.Head [Руководитель], S.FullTimer [Отработанное время, ч]
	from SalaryCosts S join Teachers T
		on S.TeachName = T.TeachName
		join Departments D
		on S.Department = D.NameDepartment
where FullTimer > 168
order by D.NameDepartment
----------------------------------------------------------------------------------
--Задание 7
--Вывести имена преподавателей которые преподают как на ИЭФ так и на ФТ.

select distinct T.TeachName [Имя преподавателя]
	from SalaryCosts S join Teachers T
	on S.TeachName = T.TeachName
where S.Department = 'ИЭФ' and 
T.TeachName = (select S2.TeachName from SalaryCosts S2 where S2.TeachName = T.TeachName and S2.Department= 'ФТ' )

----------------------------------------------------------------------------------