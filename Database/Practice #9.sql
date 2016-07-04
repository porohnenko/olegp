--Пример 1
--Присвоить значения переменным, используя оператор SET
DECLARE @AvgMark NUMERIC (5,2) 
SET @AvgMark=(SELECT CAST(AVG(Mark*1.0) AS NUMERIC(5,2)) FROM Progress)
SELECT @AvgMark [Средняя оценка всех студентов]
------------------------------------------------------------------------------------------
--Пример 2
--Создать хранимую процедуру, которая создаёт список студентов и их номеров 
--зачёток и упорядочивает их по имени.
CREATE PROCEDURE NameStudent
AS 
SELECT StName [ФИО], NRecordBook [№ зачётки]
FROM Student
ORDER BY StName ASC

EXEC NameStudent
------------------------------------------------------------------------------------------
--Пример 3
--Создать хранимую процедуру, которая  выводит содержимое таблицы Student 
--для заданной  группы, по умолчанию выводятся сведения о студентах группы АИС-03.
CREATE PROC PStudent
@NameGroup VARCHAR (20)='POIT15-010'
AS
SELECT * 
FROM Student ST INNER JOIN SGroup SG
ON ST.IDGroup=SG.IDGroup
WHERE NameGroup=@NameGroup 

EXEC PStudent 
------------------------------------------------------------------------------------------
--Пример 4
--Создать хранимую процедуру, которая  выводит содержимое таблицы Student 
--для заданной  группы. Название группы,  используемое по умолчанию, не задается
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
--Пример 5
--Создать хранимую процедуру, которая  вводит данные в таблицу Student.
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
	'Ипатов В.И.',
	3,
	'8701',
	'192320',
	'01.11.2002',
	'ГОВД г.Ухты'
------------------------------------------------------------------------------------------
--Пример 6
--Создать хранимую процедуру, выводящую для просмотра содержимое таблицы Student.
CREATE PROC PStudentView
AS
SELECT * FROM STUDENT

EXEC PStudentView
------------------------------------------------------------------------------------------

--Пример 7
--Удалить процедуру PStudent .
DROP PROC PStudentView 
------------------------------------------------------------------------------------------

