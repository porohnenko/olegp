--Single select
----------------------------------------------------
select* from [Student]
select* from [Progress]
select distinct IDReport,PIN from  [Progress]

select [Mark] Отметка from [Progress]
select distinct [Mark] Отметка from [Progress]

--Multi select
----------------------------------------------------
SELECT StName ФИО, Student.NRecordBook [№ зачётки],
             NameReport [Вид отчётности],NameSubject [Название предмета],
             TeachName [Преподаватель], Mark Оценка
 FROM Progress   JOIN Student
		ON Student.NRecordBook=Progress.NRecordBook
                              JOIN Report 
       ON Progress.IDReport=Report.IDReport 
                              JOIN Subjects
       ON Progress.IDSubject =Subjects.IDSubject
                              JOIN teacher
       ON Progress.PIN=teacher.PIN
