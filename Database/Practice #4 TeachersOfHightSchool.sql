insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('���', '����������� �.�.', '������ 4', '�����',2938583)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('����', '����� �.�.', '��������� 39', '�����',2932366)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('�����', '������� �.�.', '������ 9', '�����',2938663)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('��', '�������  �.�.', '������ 8', '�����',2938565)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('���', '�������  �.�.', '��������� 39', '�����',2932288)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('���', '���������  �.�.', '������� 28', '�����',2339348)
	
----------------------------------------------------------------------------------------------------------------------------------------

insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('��������� �.�.','���������� ��������','���,������','������ 4',2938601,'married','n/a', 1521,12750000, 12.01)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('�������� �.�.','���������� ��������','�.�.�., ���������','��������� 39',2938050 ,'married','n/a', 1568,15000000, 10.03)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('������� �.�.','���������� ��������','�.�.�., ���������','������ 9',2938050 ,'married','n/a', 1538,15000000, 02.09)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('�������� �.�.','���������� ��������','���,������','������ 8',2938050 ,'married','n/a', 1568,13125300, 01.01)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('�������� �.�.','���������� ��������','n/a','��������� 39',2938050 ,'married','n/a', 1568,15000000, 02.05)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('������ �.�.','���������� ��������','������,���,������ �����','������� 28',2938050 ,'married','n/a', 1568,15000000, 15.12)

----------------------------------------------------------------------------------------------------------------------------------------

insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('�������� �.�.','���', 2016-03-05,2016-02-01 ,168,10000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('�������� �.�.','���', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('������� �.�.','��', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('�������� �.�.','�����', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('������ �.�.','�����', 2016-03-05,2016-02-01 ,168,12000000)

----------------------------------------------------------------------------------------------------------------------------------------

update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='�������� �.�.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='�������� �.�.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='�������� �.�.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='�������� �.�.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='������� �.�.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='������� �.�.'

update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='�������� �.�.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='�������� �.�.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='��������� �.�.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='��������� �.�.'