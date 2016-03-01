select TeachName
	from [Teacher] where TeachName like '%[a][r]%'
	
select TeachName
	from [Teacher] where TeachName like '%[H][]%'
	
select StName
	from [Student] where StName like '%[E][]%'

----------------------------------------------------------------------------------
--������� 3
--�뢥�� ����� � ����� ���⮪ ��� ��㤥�⮢, � ������ ��� �� ����� �業�� 3.

select [S].[NRecordBook] [� ���⭮� ������], [StName] [���], [Mark][�⬥⪠]
	from [Student] S inner join [Progress] P
		on [S].[NRecordBook]=[P].[NRecordBook]
	where Mark>=7
	GROUP BY S.NRecordBook, StName,P.Mark
----------------------------------------------------------------------------------
--������� 4
--�뢥�� ����� ��� �९�����⥫��, ����� ����� ���樯���� ���� ������.

select [T].[PIN],T.TeachName
	from [Progress] P join [Teacher] T
		on P.PIN = T.PIN
		inner join [Subjects] S
		on P.IDSubject = S.IDSubject
	where S.NameSubject = 'Database'
group by T.PIN, T.TeachName
----------------------------------------------------------------------------------
--������� 5
--�뢥�� �� ���樯����, �� ����� ᤠ���� �����. �������� ���樯��� �ᯮ������ � ���浪� �����⠭��.

select distinct P.IDReport [��� ���� ����஫�], S.NameSubject [������������ �।���]
	from [Progress] P inner join [Report] R
		on P.IDReport = R.IDReport 
		inner join [Subjects] S
		on P.IDSubject = S.IDSubject
	where R.NameReport = 'Examenation'
order by S.NameSubject,P.IDReport
----------------------------------------------------------------------------------
--������� 6
--�뢥�� ����� �९�����⥫�� � �������� ���樯���, ����� ��� �����, �᫨ �� �⨬ ���樯����� ���⠢���� ��� ���� �業��.

select distinct [T].TeachName [��� �९�����⥫�], S.NameSubject [������������ ���樯����]
	from [Progress] P join [Teacher] T
		on P.PIN = T.PIN
		join [Subjects] S
		on S.IDSubject = P.IDSubject
where Mark is not null
order by T.TeachName, S.NameSubject
----------------------------------------------------------------------------------
--������� 7
--�뢥�� ����� �९�����⥫�� ����� �९����� ��� � 5 ⠪ � � 6 ᥬ�����.

select distinct [T].TeachName [��� �९�����⥫�]
	from [UPlan] U join [Teacher] T
		on U.PIN = T.PIN
where U.NTerm between '1' and '2'
----------------------------------------------------------------------------------
-------------------------------------
