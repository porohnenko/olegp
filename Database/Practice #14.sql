--������� ��������� ������� � ��������� TEMP � ������ ���� ����/�����, 
--������� �����, ������. 
--�������� � ��� ��� ������ � ������� � ������� ��������� �� �����. 

declare @TEMP table(A datetime, B int, C varchar(30))
insert into @TEMP (A,B,C) select SalaryMonth, FullTimer, TeachName from [dbo].[SalaryCosts]
select * from @TEMP