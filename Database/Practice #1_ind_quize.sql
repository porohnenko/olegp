create database TeachersOfHighSchool

use TeachersOfHighSchool

create table Teachers(
		TeachName			varchar(35) not null primary key,
		Post				varchar(20) not null,
		AcademicTitleDegree varchar(20) not null,
		Adress				varchar(35) not null,
		Phone				int not null,
		MaritalStatus		varchar(35) not null,
		Children			varchar(35) not null,
		EmployeeNumber		int not null,
		Salary				int not null,
		EnrollmentDate		datetime not null)
		
create table Departments (
		NameDepartment		varchar(35) not null primary key,
		Head				varchar(15) not null,
		Adress				varchar(35) not null,
		Location			varchar(35) not null,
		Phone				int not null)
		
create table SalaryCosts (
		TeachName			varchar(35) not null,
		Department			varchar(35) not null,
		DateOfIssue			datetime not null,
		SalaryMonth			datetime not null,
		FullTimer			int not null,
		SalaryRate			int not null,
		CONSTRAINT SalaryCostsPrimaryForeign PRIMARY KEY (TeachName,Department),
		CONSTRAINT  SalaryCostsTeachName FOREIGN KEY (TeachName) REFERENCES Teachers,
		CONSTRAINT  SalaryCostsNameDepartment FOREIGN KEY (Department) REFERENCES Departments)
		
