-- ������� 1
-- ������� ��� �������������, ��������� � ����� �������������� ��� ���
-- ��������������, � ������� ����� ���� �������� ������ � ����.

select TeachName [Name], Department, SalaryRate
	from Teachers N, SalaryCosts D, SalaryCosts S
	where N.TeachName = D.TeachName 
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------