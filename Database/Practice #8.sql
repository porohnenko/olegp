EXEC SP_HELP Progress
-----------------------------------------------------------------------------------------
-- ������� 1
-- ������� ����������� �� ������ � ��������� ������������. ������ ��
-- ������ ��������� 5 ������. ����� �������� �� ������ ��������� 10.
alter table Progress 
	with check
	add constraint CheckProgressMark check((Mark <= 10) and (NTerm < 10));
alter table Progress drop constraint CheckProgressMark;
-----------------------------------------------------------------------------------------
--������ 2
--������ ����������� FOREIGN KEY ��� ������� Uplan. ������� Uplan
--��������� �� ������� Subject �� �������� IDSubject.
ALTER TABLE UPlan
ADD CONSTRAINT PlanSubjectForeign FOREIGN KEY
(IDSubject) REFERENCES Subjects(IDSubject);
-----------------------------------------------------------------------------------------
--������ 3
--������ ����������� FOREIGN KEY ��� ������� UPlan ����� �������,
--����� ��� �������� �� ������� Subject ������� �� ���� ��� �����
--��������, ���� �� ������� � ��������������� ���� ��������� ������ ��
--������� UPlan.
ALTER TABLE UPlan
ADD CONSTRAINT PlanSubjectForeign
FOREIGN KEY (IDSubject) REFERENCES Subjects(IDSubject)
ON DELETE CASCADE;
-----------------------------------------------------------------------------------------
--������ 4
--������� ����������� FOREIGN KEY �� �������� IDSubject � ������� Uplan.
ALTER TABLE UPlan
DROP CONSTRAINT PlanSubjectForeign
-------------------------------------------------------------------------------------------
--������ 5
--�������� ����������� FOREIGN KEY ��� ������� IDGroup � �������
--Student1. ��� ������ � ������� Student ��������� �� ������������ ������
--�����������.
ALTER TABLE Student
WITH CHECK
ADD CONSTRAINT StudentIDGroupForeign
FOREIGN KEY (IDGroup) REFERENCES SGroup(IDGroup)
-----------------------------------------------------------------------------------------
--������ 6
--���� ����� ����������� ��� ����������, �� ��� ��� ��������� ���� �������
--�������� ��� �������.
--�������� ����������� FOREIGN KEY ��� ������� IDGroup � �������
--Student. ��� ������ � ������� Student ��������� �� ������ ��������
--����������� �������� �� ��������.
ALTER TABLE Student
WITH NOCHECK
ADD CONSTRAINT StudentIDGroupForeign
FOREIGN KEY (IDGroup) REFERENCES SGroup(IDGroup)
-----------------------------------------------------------------------------------------
--������ 7
--��������� ��� ����������� � ������� Progress.
ALTER TABLE Progress
NOCHECK CONSTRAINT ALL
-----------------------------------------------------------------------------------------
--������ 8
--���������� ��� ����������� � ������� Progress.
ALTER TABLE Progress
CHECK CONSTRAINT ALL
-----------------------------------------------------------------------------------------
--������ 9
--��������� ����������� � ProgressMarkChe�k ��� ������� Mark
--������� Progress.
ALTER TABLE Progress
NOCHECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--������ 10
--���������� ����������� � ProgressMarkCheck ��� ������� Mark
--������� Progress.
ALTER TABLE Progress
�HECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--������ 11
--���������� ����������� � ProgressMarkCheck ��� ������� Mark
--������� Progress � ��������� ������������ ���� ����� ��������� ��������
--�� ������������ ����� �����������.
ALTER TABLE Progress
WITH CHECK
CHECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--������ 12
--�������� ������� YearBegin (��� ������ ����� � ���������) � �������
--Student, ����� ��� ������ Datetime.
ALTER TABLE Student
ADD YearBegin Datetime;
-----------------------------------------------------------------------------------------
--������ 13
--�������� ������� IDFacultet (��� ����������) � ������� SGroup, �����
--��� ������ INT � ��������� �������� �� ��������� 1.
ALTER TABLE SGroup
ADD IDFacultet INT DEFAULT 1;
-----------------------------------------------------------------------------------------
--������ 14
--�������� � ������� SGroup, ���������� ������, ������� IDFacultet,
--��������� ��� ���� ����������� NOT NULL.
ALTER TABLE SGroup
ADD IDFacultet INT NOT NULL
DEFAULT 1;
-----------------------------------------------------------------------------------------
--������ 15
--�������� � ������� SGroup, ���������� ������, ������� IDFacultet,
--��������� ��� ���� ����������� NOT NULL.
--��������� �������:
ALTER TABLE SGroup
ADD IDFacultet INT;
--��������� ������� IDFacultet:
UPDATE SGroup SET IDFacultet=1
--��������� ����������� NOT NULL:
ALTER TABLE SGroup
ALTER COLUMN IDFacultet INT NOT NULL
-----------------------------------------------------------------------------------------
--������ 16
--��������� ������ ������� NameGroup, �������� �� �� 20 ��������.
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(20)
-----------------------------------------------------------------------------------------
--������ 17
--��������� ������ ������� NameGroup �� 15 ��������
--(��������������, ��� ����� ��� ���� ��������� �� 20 ��������).
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(15)
--���� ������� ���-���� ���������� ��������, �� ������� �������
--������� ����������� SgroupNameGroupUnique
ALTER TABLE SGroup
DROP CONSTRAINT SGroupIDGroupUnique
--����� ��������� ������ �������.
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(15)
-----------------------------------------------------------------------------------------
 EXEC SP_RENAME 'Subjects','Subjects05';
 EXEC SP_RENAME 'Subjects05','Subjects';
-----------------------------------------------------------------------------------------
--������ 18
--������� ������� Subject.
--�� ������� Subject ��������� ��� ������� Progress, ��� � �������
--UPlan. � ����� � ���� �������� ������� Subject ������ ��������������
--�������� ����������� ProgressSubjectForeign �� ������� Progress �
--����������� Plan SubjectForeign �� ������� UPlan.
ALTER TABLE Progress
DROP CONSTRAINT ProgressSubjectForeign
ALTER TABLE UPlan
DROP CONSTRAINT PlanSubjectForeign
--**************************************************
DROP TABLE Subjects--********************************
--**************************************************


