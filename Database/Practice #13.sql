DECLARE @a INT, @b numeric(10,2)
SET @a = 20
SET @b = (@a+@a)/15
SELECT @b --����� �� ����� ����������


DECLARE @a INT
SELECT @a = COUNT(*) FROM Authors

--� ������ ������� � ���������� ���������� ��������� �������� �� ���������� �������.
DECLARE @str CHAR(30)
SELECT @str = name_author FROM Authors

--��������� �������� ���� SET � SELECT
DECLARE @a INT
SET @a = (SELECT COUNT(*) FROM Authors)

--������ � ����� � ��������
--�������� SET DATEFORMAT dmy | ymd | mdy ������ ������� ���������� ����������� ����.

SET DATEFORMAT dmy
DECLARE @d DateTime
SET @d = '31.01.2005 13:23:15'
SET @d = @d+1
SELECT @d [����]


--�������� ��������� ������� ����� ���������� ���� TABLE
--����������� ����� DECLARE � ��������� � ������� �������� �������, �� �����, ��������, 
--�������� �� ���������, � ����� �������� ���� PRIMARY KEY ��� UNIQUE.

DECLARE @mytable TABLE(id INT, myname CHAR(20) DEFAULT '������� ���')
INSERT INTO @mytable(id) VALUES (1)
SELECT * FROM @mytable

use DB_BOOKS
DECLARE @mytable TABLE(id INT, myname CHAR(20) DEFAULT '������� ���')
INSERT @mytable SELECT Code_publish, City FROM Publishing_house
SELECT * FROM @mytable

--�������������� ����� ����������
--������� CAST ���������� ��������, ��������������� � ���������� ����:
--CAST(@���������� ��� �������� AS ���������_���_������)

DECLARE @d DateTime, @str char(20)
SET @d = '02.05.2016 19:28:00'
SET @str = CAST(@d AS Char(20))
SELECT @str

DECLARE @a INT
DECLARE @str CHAR(30)
SET @a = (SELECT COUNT(*) FROM Authors)
IF @a >10
BEGIN
SET @str = '���������� ������� ������ 10'
SELECT @str
END
ELSE
BEGIN
SET @str = '���������� ������� = ' + str(@a)
SELECT @str
END

--���� While
DECLARE @a INT
SET @a = 1
WHILE @a <100
BEGIN
PRINT @a -- ����� �� ����� �������� ����������
IF (@a>40) AND (@a<50)
BREAK
PRINT @a -- ����� �� ����� �������� ����������
IF (@a>40) AND (@a<50)
BREAK --����� � ���������� 1-� ������� �� ������
ELSE
SET @a = @a+rand()*10
CONTINUE
END
PRINT @a


DECLARE MyCursor1 SCROLL CURSOR FOR (select * from Authors)
DECLARE @i bigint, @s char(30), @date smalldatetime
OPEN MyCursor1
FETCH FIRST FROM MyCursor1 INTO @i, @s, @date
PRINT @i
PRINT @s
PRINT @date
CLOSE MyCursor1
DEALLOCATE MyCursor1


DECLARE MyCursor1 SCROLL CURSOR FOR (select * from Authors)
DECLARE @i bigint, @s char(30), @d datetime
OPEN MyCursor1
FETCH FIRST FROM MyCursor1 INTO @i, @s, @d
WHILE @@FETCH_STATUS = 0
BEGIN
FETCH NEXT FROM MyCursor1 INTO @i, @s, @d
PRINT @i
PRINT @s
PRINT @d
END
CLOSE MyCursor1
DEALLOCATE MyCursor1