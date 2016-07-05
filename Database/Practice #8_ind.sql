EXEC SP_HELP SalaryCosts
-----------------------------------------------------------------------------------------

alter table [TeachersOfHighSchool].[dbo].[SalaryCosts]
	add constraint CheckTeachSal check([SalaryRate] <= 14000000);
alter table [TeachersOfHighSchool].[dbo].[SalaryCosts] drop constraint CheckTeachSal;
-----------------------------------------------------------------------------------------

-- �������� ������� ����� �� ���� ��������, ��������� �����
-- FOREIGN KEY, ��� ���� ���������� ����� ���������� �������� ���, ���
-- ��� ����������.
alter table dbo.SalaryCosts
add CONSTRAINT SalaryCostsForeign 
FOREIGN KEY (Department) REFERENCES dbo.Departments(NameDepartment) 
ON DELETE CASCADE
alter table dbo.SalaryCosts drop constraint SalaryCostsForeign;

-----------------------------------------------------------------------------------------

-- ���������� �� ���������� ����������� FOREIGN KEY � ����������,
-- ��������� � ���������� Student. ��� ��� ������������ ��� ���������
-- �����������.
ALTER TABLE SalaryCosts
with check
CHECK CONSTRAINT ALL

EXEC SP_HELP SalaryCosts
-----------------------------------------------------------------------------------------

-- ��������� ����������� �������� ����� � ������� SalaryCosts. ������� �
-- ������� SalaryCosts ������ �������������.
-- ����������� ���������� ����� ����������� �����������.
-- ��������� ��� ����������� �������� ��� ����, ����� �����
-- ���������� �����������, � ��� ������ � ��������� Student ���������������
-- �������� ����������� ���� ������.
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsForeign
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsTeachName
ALTER TABLE dbo.SalaryCosts
NOCHECK CONSTRAINT SalaryCostsNameDepartment

insert into SalaryCosts (TeacherName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('�������� �.�.****','���*****', 2016-03-05,2016-02-01 ,168,12000000)
	
ALTER TABLE dbo.SalaryCosts
CHECK CONSTRAINT ALL

-----------------------------------------------------------------------------------------
-- �������� � ������� Student ������� Single, ��� ������ VARCHAR(3),
-- �������� �������� �� ��������� ����. ������� �������.
ALTER TABLE dbo.Teachers
ADD Smoke VARCHAR(3) NOT NULL DEFAULT 'No';

-----------------------------------------------------------------------------------------

-- �������� � ������� Student ������� AVGMark, ��� NUMERIC (5,2). �
-- ������� ����� ��������� ������� ������ ��������. �� ������� ���� ������� � ����
-- ������ ���� ��� ����, ����� � ���������� ������������������ � ������� ����
-- ������ ��������� ������ � ��������, ��������� ������� ��� ��� � �����
-- ����������� �������� ����� ����������� �������. ������ ����� - �����
-- �������, ���������� ��������� ������, ���������� �� ��������� ���
-- ���������� � ������� ������, �� ������� �������� � �������.
ALTER TABLE dbo.Departments
ADD AVGSalary NUMERIC (10,2) NOT NULL DEFAULT 0;

-----------------------------------------------------------------------------------------

-- �������� ����� ����� � ������������ � �������� (��. ������� 1).
-- ��������� ������ - ������ �� ������� ��������� �������� �������� �
-- ���������� ���������? ��� ���������� �����������, ����� ��� ��������� ��
-- �� ����������?
ALTER TABLE dbo.Departments
ALTER COLUMN Head VARCHAR(100)

ALTER TABLE dbo.Departments
ALTER COLUMN AVGSalary NUMERIC (5,3)

EXEC SP_HELP SalaryCosts

ALTER TABLE dbo.Departments
ADD AVGtime NUMERIC (10,2) NOT NULL DEFAULT 0;

alter table dbo.Employees
add CONSTRAINT checkId check (Id <= 999999);
 
alter table dbo.Employees
ALTER COLUMN Name VARCHAR(100)

ALTER TABLE dbo.SalaryCosts
ALTER COLUMN SalaryMonth date
-----------------------------------------------------------------------------------------

-- ������������� ������� Progress � ������� Uspev.
EXEC SP_RENAME 'SalaryCosts','SalaryCosts***';
-----------------------------------------------------------------------------------------

-- ������������ ������� �������� ��������������� � ����������
-- ������� �������.
EXEC SP_RENAME 'SalaryCosts***','SalaryCosts';







