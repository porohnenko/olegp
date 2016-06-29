-- ������� 1
-- ������� ������ ����� �������������, ��������� � ����� �������������� ��� ���
-- ��������������, � ������� ����� ���� �������� ������ � ����.
use TeachersOfHighSchool
select EmployeeNumber [������ �����], Department [���������], SalaryRate [�����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeachName and D.Department = S.NameDepartment
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------
-- ������� 2
-- ������� ������ ����� �������������, ��������� � �� �������������� ��� ���
-- ��������������, � ������� ��  ���� �������
-- �� �� ����������, � ������� ��� ���������.

select EmployeeNumber [������ �����], Department [���������], Salary [����]
	from Teachers N, SalaryCosts D, Departments S
	where N.TeachName = D.TeachName and D.Department = S.NameDepartment
	and Salary <(select AVG(Salary) from Teachers /* N1, SalaryCosts D1, Departments S1
					where N1.TeachName = D1.TeachName and D1.Department = S1.NameDepartment*/)
-----------------------------------------------------------------------------------------

-- ������� 3
-- ������� ������ ��������������, � ������� ������� �� ����� ��������
-- �� �� ����������, � ������� �� ���������.

select EmployeeNumber [������ �������]
	from Teachers T, SalaryCosts S, Departments D
	where T.TeachName = S.TeachName and S.Department = D.NameDepartment
	and (select Max(Salary) from Teachers T1)
	=
	(select Min(Salary) from SalaryCosts S1, Departments D1
					where S1.Department = D1.NameDepartment)

-----------------------------------------------------------------------------------------					
-- ������� 4
-- ������� ����� ��������� ���������� � �������� ���������, ��
-- ������� ��� ������� ��������.

select [StName], [NameSubject]
	from Student ST, Subjects S, Progress P, Report R
	where ST.NRecordBook = P.NRecordBook and S.IDSubject = P.IDSubject and P.IDReport = R.IDReport
	and Mark > 8
	--and U.NTerm = 1
-----------------------------------------------------------------------------------------
-- ������� 5
--������� ��� �������� ����� ���������� � �������� ��������� �� ���
--�����������, �� ������� �� ���� �������� �� ����� �������� ������.
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
	

