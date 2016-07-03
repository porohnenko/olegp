-- ������� 1
-- ������� ������ ����� �������������, ��������� � ����� �������������� ��� ���
-- ��������������, � ������� ����� ���� �������� ������ � ����.
use TeachersOfHighSchool
select EmployeeNumber [������ �����], Department [���������], SalaryRate [�����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- ������� 2
-- ������� ������ ����� �������������, ��������� � �� �������������� ��� ���
-- ��������������, � ������� ��  ���� �������
-- �� �� ����������, � ������� ��� ���������.

select EmployeeNumber [������ �����], Department [���������], Salary [����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeacherName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers /* N1, SalaryCosts D1, Departments S1
					where N1.TeachName = D1.TeachName and D1.Department = S1.NameDepartment*/)
-----------------------------------------------------------------------------------------

-- ������� 3
-- ������� �������� �����������, �� ������� ������� �� ������  ������� �� �� ����.
DECLARE @avgSalaryByFaculty float
DECLARE @avgSalaryByUniver decimal(10,2)

set @avgSalaryByFaculty = (select AVG(Salary) from SalaryCosts S1, Departments D1, Teachers T1
					where S1.TeacherName = T1.TeachName and S1.Department = D1.NameDepartment);
set @avgSalaryByUniver = (select AVG(Salary) from Teachers);
					
select NameDepartment [���������], @avgSalaryByFAculty [������� �/� �� ����������],
	   @avgSalaryByUniver [������� �/� �� ����]
	from Departments 
	where @avgSalaryByFaculty <= @avgSalaryByUniver
	
select Department, DistanceFromTheCenter
from Teachers T
inner join SalaryCosts S on T.TeachName = S.TeacherName
inner join 
-----------------------------------------------------------------------------------------					
-- ������� 4
select TeachName, Department, FacultyAdress, Salary
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeacherName and T.Adress = D.FacultyAdress 
	and T.Salary > (select AVG(Salary) from Teachers)

select AVG(Salary) [average salary] from Teachers 
-----------------------------------------------------------------------------------------
-- ������� 5
--������� ��� �������� ����� ���������� � �������� ��������� �� ���
--�����������, �� ������� �� ���� �������� �� ����� �������� ������.
ALTER TABLE dbo.Departments
ADD DistanceFromTheCenter int;

select NameReport, s.NameSubject
	from Progress p, Subjects s, Report r
	where p.IDSubject = s.IDSubject and p.IDReport = r.IDReport
	and s.NameSubject NOT IN (select s.NameSubject from Progress p, Subjects s
	where p.IDSubject = s.IDSubject and p.Mark >= 9 group by s.NameSubject)
	group by s.NameSubject, r.NameReport;
-----------------------------------------------------------------------------------------
-- ������� 6
--��������� ��������� ��� �����������, ������� ����� ���� ���������,
--������� ����� ������� �� ���������� �������������� ��� ������ ��� ��
--���������� ����������� ��� ������.
select [StName],[NameReport],[NameSubject]
	from Progress P, Subjects S, Student St,Report R
	where P.IDReport = R.IDReport
	and P.NRecordBook = St.NRecordBook
	and P.IDSubject = S.IDSubject
	and R.NameReport like 'Testing'
	and S.NameSubject in ('Database')
	

