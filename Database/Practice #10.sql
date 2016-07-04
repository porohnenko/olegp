--������� �������������, ��������������� ���� ���������� � ������� Student.
CREATE VIEW VStudentNOINSERT
AS SELECT INN, StName, SPasport, NPasport,DataPassport, NameDeptPasport
FROM Student

INSERT INTO VStudentNOINSERT
VALUES ('1111111117','������ �.�.','8701','192304','01.06.2002','��� �.����');
--------------------------------------------------------------------------------------------------
--������� �������������, ����������� ��������, ����  � �������������� ������ ������  � ��������� ������ 
--POIT15-010 (IDGroup=3181) � ������� Student.
CREATE VIEW VStudentNOINSERTPOIT150101
AS SELECT NRecordBook, StName, SPasport, IDGroup, NPasport, DataPassport, NameDeptPasport, INN
FROM Student WHERE IDGroup = 3181

INSERT INTO VStudentNOINSERTPOIT150101
values(999, 'ADITYENDRA MISHRA*','MN', 3181, 999999, '1905-04-11','RUVD*', '149851')

delete from VStudentNOINSERTPOIT150101 where NRecordBook = 999

select * from Student
select * from VStudentNOINSERTPOIT150101
--------------------------------------------------------------------------------------------------
--������� ������������� ��� ������ ���� ������ �� ������������ ���������.
CREATE VIEW VPROGRESS
AS SELECT NameGroup [������], S.NRecordBook [� �������], StName [��� ��������], 
NameSubject[�������� ����������], NameReport[��� ����������], NTerm[� ��������],
PIN [������������������� ����� �������������], Mark[������] 
FROM Progress P INNER JOIN Student S
ON P.NRecordBook=S.NRecordBook INNER JOIN SGroup SG
ON S.IDGroup=SG.IDGroup INNER JOIN Subjects SB
ON P.IDSubject=SB.IDSubject INNER JOIN Report R
ON P.IDReport=R.IDReport

SELECT * FROM VPROGRESS; 
--------------------------------------------------------------------------------------------------
--������� ������������ ���������  �� ���������� Database  �� 2 ��������. 
SELECT * FROM VProgress
WHERE [�������� ����������]='Database' AND [� ��������]=2
--------------------------------------------------------------------------------------------------
--������� ������� ���� �� ������ ������ ��������� � ������ ��������.
select ������, cast(AVG(������*1.0) AS NUMERIC(3,1))[������� ������] from VPROGRESS
where [� ��������]=1 GROUP BY ������
--------------------------------------------------------------------------------------------------
--������� ������������� ��� ������ ���� ������ �� ������������ ���������, 
--������� ����� ��������������, ������� �� ��� ���� ����������. 
CREATE VIEW ProgressWithTeachers
AS SELECT [��� ��������],[������],[� �������],[�������� ����������],[��� ����������],
[� ��������],[������������������� ����� �������������], TeachName [��� �������������],
[������] 
from VPROGRESS V inner join Teacher T
on V.[������������������� ����� �������������] = T.PIN

select * from ProgressWithTeachers