--������ 1
--��������� �������� ����������, ��������� �������� SET
DECLARE @AvgMark NUMERIC (5,2) 
SET @AvgMark=(SELECT CAST(AVG(Mark*1.0) AS NUMERIC(5,2)) FROM Progress)
SELECT @AvgMark [������� ������ ���� ���������]
------------------------------------------------------------------------------------------
--������ 2
--������� �������� ���������, ������� ������ ������ ��������� � �� ������� 
--������� � ������������� �� �� �����.
CREATE PROCEDURE NameStudent
AS 
SELECT StName [���], NRecordBook [� �������]
FROM Student
ORDER BY StName ASC

EXEC NameStudent
------------------------------------------------------------------------------------------
--������ 3
--������� �������� ���������, �������  ������� ���������� ������� Student 
--��� ��������  ������, �� ��������� ��������� �������� � ��������� ������ ���-03.
CREATE PROC PStudent
@NameGroup VARCHAR (20)='POIT15-010'
AS
SELECT * 
FROM Student ST INNER JOIN SGroup SG
ON ST.IDGroup=SG.IDGroup
WHERE NameGroup=@NameGroup 

EXEC PStudent 
------------------------------------------------------------------------------------------
--������ 4
--������� �������� ���������, �������  ������� ���������� ������� Student 
--��� ��������  ������. �������� ������,  ������������ �� ���������, �� ��������
CREATE PROC PStudent1
@NameGroup VARCHAR (20) OUTPUT
AS
SELECT * 
FROM Student ST INNER JOIN SGroup SG
ON ST. IDGroup=SG. IDGroup
WHERE NameGroup = @NameGroup

EXEC PStudent
EXEC PStudent 'POIT15-012' 
------------------------------------------------------------------------------------------
--������ 5
--������� �������� ���������, �������  ������ ������ � ������� Student.
CREATE PROC PStudentINSERT
 @NRecordBook		VARCHAR(6),
 @INN				VARCHAR(10),
 @StName			VARCHAR(35),
 @IDGroup			INT,
 @SPasport			VARCHAR(4),
 @NPasport			VARCHAR(6),
 @DataPasport		DATETIME,
 @NameDeptPasport	VARCHAR(35) 
AS
   INSERT INTO  Student   
   (NRecordBook,INN,StName,IDGroup,SPasport,NPasport,
    DataPassport,NameDeptPasport) 
   VALUES
   (@NRecordBook,@INN,@StName,@IDGroup,@SPasport,@NPasport,
    @DataPasport,@NameDeptPasport)

EXEC PStudentINSERT
	'050008',
	'1111111110',
	'������ �.�.',
	3,
	'8701',
	'192320',
	'01.11.2002',
	'���� �.����'
------------------------------------------------------------------------------------------
--������ 6
--������� �������� ���������, ��������� ��� ��������� ���������� ������� Student.
CREATE PROC PStudentView
AS
SELECT * FROM STUDENT

EXEC PStudentView
------------------------------------------------------------------------------------------

--������ 7
--������� ��������� PStudent .
DROP PROC PStudentView 
------------------------------------------------------------------------------------------

