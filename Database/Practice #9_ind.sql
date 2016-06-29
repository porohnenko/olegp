use [TeachersOfHighSchool]
go
create proc TeachersView
as
begin
	select * from Teachers
end

execute TeachersView;
-------------------------------------------------------------------------------
--����� ������������� �� EmployeeNumber

go
create proc TeachersFind 
@EmployeeNumber int output
as
begin
	select * from Teachers
	where Teachers.EmployeeNumber = @EmployeeNumber
end

execute TeachersFind 1538;
-------------------------------------------------------------------------------
--��������: ���� �� ������������� � �� ������ ���������
go
create proc TeachersFindMinSalary1
@MinSalary int output
as
begin
	select * from Teachers
	where Teachers.Salary <= @MinSalary
end

execute TeachersFindMinSalary1 14000000;
-------------------------------------------------------------------------------
--���������� ������ ���������� 
go
create proc AddFaculty
@NameDepartment varchar(35),
@Head varchar(15),
@Adress varchar(35),
@Location varchar(35),
@Phone int
as
begin 
	insert into dbo.Departments (NameDepartment,Head,Adress,Location,Phone)
	values (@NameDepartment, @Head, @Adress, @Location, @Phone)
end
execute AddFaculty '���', '���������� �.�.', '�.������ 6', '�����',  2938548 
-------------------------------------------------------------------------------
go
create proc NameTeachersByFacultyAdress
@Adress varchar(35)
as
begin
	select * from SalaryCosts
	join Departments on SalaryCosts.TeachName = SalaryCosts.TeachName 
	where Departments.Adress = @Adress
end
execute	NameTeachersByFacultyAdress '������ 9'

