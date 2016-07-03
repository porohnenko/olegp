--Создать представление, предотвращающее ввод информации в таблицу Student.
CREATE VIEW VStudentNOINSERT
AS SELECT INN, StName, SPasport, NPasport,DataPassport, NameDeptPasport
FROM Student

INSERT INTO VStudentNOINSERT
VALUES ('1111111117','Ипатов В.И.','8701','192304','01.06.2002','УВД г.Ухты');
--------------------------------------------------------------------------------------------------
--Создать представление, разрешающее просмотр, ввод  и редактирование только данных  о студентах группы 
--POIT15-010 (IDGroup=3181) в таблице Student.
CREATE VIEW VStudentNOINSERTPOIT150101
AS SELECT NRecordBook, StName, SPasport, IDGroup, NPasport, DataPassport, NameDeptPasport, INN
FROM Student WHERE IDGroup = 3181

INSERT INTO VStudentNOINSERTPOIT150101
values(999, 'ADITYENDRA MISHRA*','MN', 3181, 999999, '1905-04-11','RUVD*', '149851')

delete from VStudentNOINSERTPOIT150101 where NRecordBook = 999

select * from Student
select * from VStudentNOINSERTPOIT150101
--------------------------------------------------------------------------------------------------
--Создать представление для вывода всех данных об успеваемости студентов.
CREATE VIEW VPROGRESS
AS SELECT NameGroup [Группа], S.NRecordBook [№ зачетки], StName [Имя студента], 
NameSubject[Название дисциплины], NameReport[Вид отчетности], NTerm[№ семестра],
PIN [Персонифицированный номер преподавателя], Mark[Оценка] 
FROM Progress P INNER JOIN Student S
ON P.NRecordBook=S.NRecordBook INNER JOIN SGroup SG
ON S.IDGroup=SG.IDGroup INNER JOIN Subjects SB
ON P.IDSubject=SB.IDSubject INNER JOIN Report R
ON P.IDReport=R.IDReport

SELECT * FROM VPROGRESS; 
--------------------------------------------------------------------------------------------------
--Вывести успеваемость студентов  по дисциплине Database  во 2 семестре. 
SELECT * FROM VProgress
WHERE [Название дисциплины]='Database' AND [№ семестра]=2
--------------------------------------------------------------------------------------------------
--Вывести средний балл по каждой группе студентов в первом семестре.
select Группа, cast(AVG(Оценка*1.0) AS NUMERIC(3,1))[Средняя оценка] from VPROGRESS
where [№ семестра]=1 GROUP BY Группа
--------------------------------------------------------------------------------------------------
--Создать представление для вывода всех данных об успеваемости студентов, 
--включая имена преподавателей, ведущих те или иные дисциплины. 
CREATE VIEW ProgressWithTeachers
AS SELECT [Имя студента],[Группа],[№ зачетки],[Название дисциплины],[Вид отчетности],
[№ семестра],[Персонифицированный номер преподавателя], TeachName [Имя преподавателя],
[Оценка] 
from VPROGRESS V inner join Teacher T
on V.[Персонифицированный номер преподавателя] = T.PIN

select * from ProgressWithTeachers