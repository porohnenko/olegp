--Single select
----------------------------------------------------
select* from [Student]
select* from [Progress]
select distinct IDReport,PIN from  [Progress]

select [Mark] �⬥⪠ from [Progress]
select distinct [Mark] �⬥⪠ from [Progress]

--Multi select
----------------------------------------------------
SELECT StName ���, Student.NRecordBook [� ����⪨],
             NameReport [��� ����⭮��],NameSubject [�������� �।���],
             TeachName [�९�����⥫�], Mark �業��
 FROM Progress   JOIN Student
		ON Student.NRecordBook=Progress.NRecordBook
                              JOIN Report 
       ON Progress.IDReport=Report.IDReport 
                              JOIN Subjects
       ON Progress.IDSubject =Subjects.IDSubject
                              JOIN teacher
       ON Progress.PIN=teacher.PIN
