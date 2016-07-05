 -- ������� ������ ����� �������������, ��������� � ����� �������������� ��� ���
-- ��������������, � ������� ����� ���� �������� ������ � ����.
use TeachersOfHighSchool
select EmployeeNumber [������ �����], Department [���������], SalaryRate [�����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- ������� ������ ����� �������������, ��������� � ����� �������������� ��� ���
-- ��������������, � ������� ��  ���� �������
-- �� �� ����������, � ������� ��� ���������.

select EmployeeNumber [������ �����], Department [���������], Salary [����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers)
-----------------------------------------------------------------------------------------

select distinct TeachName, Department, FacultyAdress, Salary
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeacherName and T.Adress = D.FacultyAdress 
	and T.Salary > (select AVG(Salary) from Teachers)

select AVG(Salary) [average salary] from Teachers 
-----------------------------------------------------------------------------------------
--��������� ��������� ��� �����������, ������� ����� ���� ���������,
--������� ����� ������� �� ���������� �������������� ��� ������ ��� ��
--���������� ����������� ��� ������.
select distinct TeachName,Post,Department
	from dbo.Teachers T, Departments D, SalaryCosts S
	where T.TeachName = S.TeacherName
	and S.Department = D.NameDepartment
	and D.NameDepartment like '���'
	or S.Department in ('�����')
	

