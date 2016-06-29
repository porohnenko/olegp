insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ФКП', 'Лихачевский Д.В.', 'Бровки 4', 'Минск',2938583)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ФИТУ', 'Шилин Ю.В.', 'Платонова 39', 'Минск',2932366)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ФКСИС', 'Прытков В.А.', 'Гикало 9', 'Минск',2938663)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ФТ', 'Чернухо  О.Д.', 'Бровки 8', 'Минск',2938565)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ИЭФ', 'Князева  Л.П.', 'Платонова 39', 'Минск',2932288)
insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values ('ИИТ', 'Назаренко  В.Г.', 'Козлова 28', 'Минск',2339348)
	
----------------------------------------------------------------------------------------------------------------------------------------

insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Цырельчук И.И.','заведующий кафедрой','ктн,доцент','Бровки 4',2938601,'married','n/a', 1521,12750000, 12.01)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Голенков В.В.','заведующий кафедрой','д.т.н., профессор','Платонова 39',2938050 ,'married','n/a', 1568,15000000, 10.03)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Малевич И.Ю.','заведующий кафедрой','д.т.н., профессор','Гикало 9',2938050 ,'married','n/a', 1538,15000000, 02.09)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Лапицкая Н.В.','заведующий кафедрой','ктн,доцент','Бровки 8',2938050 ,'married','n/a', 1568,13125300, 01.01)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Тарченко Н.В.','заведующий кафедрой','n/a','Платонова 39',2938050 ,'married','n/a', 1568,15000000, 02.05)
insert into dbo.Teachers (TeachName,Post,AcademicTitleDegree,Adress,Phone,MaritalStatus,Children,EmployeeNumber,Salary,EnrollmentDate)
	values	('Пинчук О.В.','заведующий кафедрой','Доцент,кфн,тьютор ФНиДО','Козлова 28',2938050 ,'married','n/a', 1568,15000000, 15.12)

----------------------------------------------------------------------------------------------------------------------------------------

insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Тарченко Н.В.','ИИТ', 2016-03-05,2016-02-01 ,168,10000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Лапицкая Н.В.','ИЭФ', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Малевич И.Ю.','ФТ', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Голенков В.В.','ФКСИС', 2016-03-05,2016-02-01 ,168,12000000)
insert into SalaryCosts (TeachName,Department,DateOfIssue,SalaryMonth,FullTimer,SalaryRate)
	values ('Пинчук О.В.','ФКСИС', 2016-03-05,2016-02-01 ,168,12000000)

----------------------------------------------------------------------------------------------------------------------------------------

update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='Голенков В.В.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='Голенков В.В.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='Лапицкая Н.В.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='Лапицкая Н.В.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='Малевич И.Ю.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='Малевич И.Ю.'

update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='Тарченко Н.В.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='Тарченко Н.В.'
	
update [dbo].[SalaryCosts] 
	set [DateOfIssue]= '2016-03-05 14:00:00'
	where [TeachName]='Цырельчук И.И.'
update [dbo].[SalaryCosts] 
	set [SalaryMonth] = '2016-02-05 00:00:00'
	where [TeachName]='Цырельчук И.И.'