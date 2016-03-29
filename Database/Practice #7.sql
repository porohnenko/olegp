-- ������� 1
-- ������� ��� ��������, �������� �������� � ������ ��������� ��� ���
-- ���������, � ������� ������ �� ��� ��� ���� ���������� ���� �������
-- ������ �� ���� ����� ����������.

select [StName], [NameSubject],[Mark]
	from Student ST, Subjects S, Progress P
	where P.IDSubject = S.IDSubject and ST.NRecordBook = P.NRecordBook
	and Mark > (select AVG(Mark) from Progress P1, Subjects S1
					where S1.IDSubject = P.IDSubject and S1.IDSubject = P1.IDSubject)
---------------------------------------------------------------------------------------

-- ������� 2
-- ������� ��� ��������, �������� �������� � ������ ��������� ��� ���
-- ���������, � ������� ������ �� ��� ��� ���� ���������� ���� �������
-- ������ �� ������, � ������� ��� ���������.

select [StName], [NameSubject],[Mark]
	from Student ST, Subjects S, Progress P
	where P.IDSubject = S.IDSubject and ST.NRecordBook = P.NRecordBook
	and Mark > (select AVG(Mark) from Progress P1, Student ST1
					where ST1.IDGroup = ST.IDGroup and ST1.NRecordBook = P1.NRecordBook)
-----------------------------------------------------------------------------------------

-- ������� 3
-- ������� ����� ���������, � ������� ������� ������ ����� �������
-- ������ �� ������, � ������� ������ �������.

select [StName]
	from Student ST, Progress P, SGroup G
	where ST.NRecordBook = P.NRecordBook and ST.IDGroup = G.IDGroup
	and (select AVG(Mark) from Progress P1, Student ST1
					where ST1.NRecordBook = P.NRecordBook and ST1.NRecordBook = P1.NRecordBook)
	>
	(select AVG(Mark) from Progress P2, Student ST2
					where ST2.IDGroup = ST.IDGroup and ST2.NRecordBook = P2.NRecordBook)

-----------------------------------------------------------------------------------------					
-- ������� 4
-- ������� ����� ��������� ���������� � �������� ���������, ��
-- ������� ��� ������� ��������.

select [StName], [NameSubject]
	from Student ST, Subjects S, Progress P, UPlan U
	where ST.NRecordBook = P.NRecordBook and S.IDSubject = P.IDSubject
	and Mark > 9
	and U.NTerm = 1
	





