DECLARE @a INT
DECLARE @str CHAR(30)
SET @a = (SELECT COUNT(*) FROM Authors)
     IF @a >2
         BEGIN
            SET @str = '���������� ������� ������ 2'
            SELECT @str
        END
    ELSE
        BEGIN
            SET @str = '���������� ������� = ' + str(@a)
            SELECT @str
       END
----------------------------------------------------------------------------------------------
--1. ���������� ���������� ����������� � ������� Deliveries. ���� �� � ������� �� 2 �� 5, 
--�� ������ �� ��������, � ��������� ������ ������� ��������� ���� "� ������� ... ��������-���" 
--(������ ���������� ��������� ������ ���������� �����������).

use DB_books
DECLARE @b INT
DECLARE @str1 CHAR(45)
SET @b = (SELECT COUNT(*) FROM Deliveries)
IF @b > 2 and @b < 5
BEGIN
    SET @str1 = '...'
            SELECT @str1
END
ELSE 
BEGIN
	SET @str1 = '� ������� ' + str(@b) + ' �����������'
			select @str1 [���������]
end
----------------------------------------------------------------------------------------------
--2. ���������� ����� ������� ���� � ������� �������. ���� ���������� ����� � ��������� �� 1000 �� 5000, 
--�� ������ �� ��������, � ��������� ������ ������� ��������� ���� "����� ������� = �" (������ ���������� 
--��������� ������ �����).
use DB_books
DECLARE @c INT
DECLARE @str2 CHAR(45)
set @c = (select SUM(Cost) from Purchases)

if @c > 1000 and @c < 5000
	begin
		set @str2 = '...'
		select @str2 [���������]
	end
else 
	begin 
		set @str2 = '����� ������� = ' + STR(@c)
		select @str2 [���������]
	end
----------------------------------------------------------------------------------------------
--3. ���������� ������� ��������� ������� ���� � ������� �������. ���� ���������� ��������� 
--� ��������� �� 1000 �� 5000, �� ������ �� ��������, � ��������� ������ ������� ��-������� ���� 
--"������� ��������� ������� = �" (������ ���������� ��������� ������ ����-��� ���������).
use DB_books
DECLARE @d INT
DECLARE @str3 CHAR(45)
set @d = (select AVG(Cost) from Purchases)

if @d > 1000 and @d < 5000
	begin
		set @str3 = '...'
		select @str3 [���������]
	end
else 
	begin 
		set @str3 = '������� ��������� ������� =' + STR(@d)
		select @str3 [���������]
	end
----------------------------------------------------------------------------------------------
--4. ���������� ����������� ��������� ������� ���� � ������� �������. ���� ���������� ��������� 
--� ��������� �� 200 �� 300, �� ������ �� ��������, � ��������� ������ ������� ��-������� ���� 
--"����������� ��������� ������� = �" (������ ���������� ��������� ������ ���������).
use DB_books
DECLARE @f INT
DECLARE @str4 CHAR(45)
set @f = (select MIN(Cost) from Purchases)

if @f > 200 and @f < 300
	begin
		set @str4 = '...'
		select @str4 [���������]
	end
else 
	begin 
		set @str4 = '������� ��������� ������� =' + STR(@f)
		select @str4 [���������]
	end
----------------------------------------------------------------------------------------------
--���� WHILE
----------------------------------------------------------------------------------------------
--5. ���������� ���������� ������� � ������� Authors. ���� ������� ������ 15, ������ � ����� 
--���������� ������ � ������� � �������������� ������������ �������� ��������� ����, � ������
--����� ������ ������� �������� '����� �� ��������'.
use DB_books
DECLARE @g INT
DECLARE @val INT
SET @g = (select COUNT(*) from Authors)
set @val = @g + 1
while @val < 15
	begin
	insert into Authors (Code_author,name_author) values (@val+900000,'***����� �� ��������***')
	set @val = @val + 1
	end
select * from Authors ORDER BY Code_author
----------------------------------------------------------------------------------------------
--6. ���������� ���������� ������� � ������� �����������. ���� ������� ������ 20, ������ 
--� ����� ���������� ������ � ������� � �������������� ������������ �������� ��������� ����, 
--� ������ �������� ������������ ������� �������� '�� ��������'.
use DB_books
DECLARE @i INT
DECLARE @val1 INT
SET @i = (select COUNT(*) from Publishing_house)
set @val1 = @i + 1
while @val1 < 20
	begin
		insert into Publishing_house(Code_publish,Publish,City) values (@val1,'�� ��������','�� ��������')
		set @val1 = @val1 + 1
	end
select * from Publishing_house ORDER BY City
----------------------------------------------------------------------------------------------
--7. ���������� ���������� ������� � ������� �����������. ���� ������� ������ 17, ������ 
--� ����� ���������� ������ � ������� � �������������� ������������ �������� ��������� ����, 
--� ������ �������� ���������� ������� �������� '�� ��������'.
use DB_books
DECLARE @h INT
DECLARE @val2 INT
SET @h = (select COUNT(*) from Deliveries)
set @val2 = @h + 1
while @val2 < 17
	begin
		insert into Deliveries(Code_delivery,Name_delivery) values (@val2,'�� ��������')
		set @val2 = @val2 + 1
	end
select * from Deliveries ORDER BY Name_delivery
