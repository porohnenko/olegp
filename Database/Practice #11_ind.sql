
--------------------------------------------------------------------------------------------
--������� 1
--������� �������, ����������� ���������� ����� � ������� dbo.Teachers.

create trigger LockAddLinesToTeachers
on dbo.Teachers
for insert as print '������� ����� ���������!'
rollback tran

--------------------------------------------------------------------------------------------
--������� 2
--������� �������, ����������� ���������� ����� � ������� dbo.Departments.

create trigger LockUpdateLinesIntoDepartments
on dbo.Departments
for update as print '��������� ����� ���������!'
rollback tran

--------------------------------------------------------------------------------------------
--������� 3
--������� �������, ����������� ���������� ����� � ������� dbo.SalaryCosts.

create trigger LockUpdateLinesIntoSalaryCosts
on dbo.SalaryCosts
for update as print '��������� ����� ���������!'
rollback tran

--------------------------------------------------------------------------------------------
--������� 4
--������� �������� ���������, ����������� ������� ����� � ������� Progress � �������, 
--������� ����� ����������� �� ������� ����� � ����� ������������ ������� ���� ��������� 
--�������� � �������� ��� ������� � ������� ���� (�� ���������).


go
create procedure AddLinesToSalaryCosts
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


create trigger AddLinesCalcAvrgMark
on Departments
FOR INSERT AS
IF EXISTS
( SELECT 'TRUE' FROM Departments)
begin
select AVG(SalaryCosts.SalaryRate) [AVG Salary] from SalaryCosts
end

