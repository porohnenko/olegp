--������� 28
--������� ������������� ��� ��������� ���� ������ � ����� ����������� ����� ������
CREATE VIEW TeachersViewAdress
AS SELECT T.TeachName, AcademicTitleDegree, NameDepartment, D.FacultyAdress, Location
FROM Teachers T, SalaryCosts S, Departments D
WHERE T.TeachName = S.TeacherName and S.Department = D.NameDepartment

SELECT * FROM TeachersViewAdress
--------------------------------------------------------------------------------------
--������� 29
--������� ������������� ��� ������ ������ ��������.
CREATE VIEW TeachersViewSalary
AS SELECT T.TeachName, D1.NameDepartment, T.Salary
FROM Teachers T,SalaryCosts S, Departments D1
WHERE T.TeachName = S.TeacherName and S.Department = D1.NameDepartment

SELECT * FROM TeachersViewSalary
--------------------------------------------------------------------------------------
--������� ������������� ��� ������ ���������� � ��������������, ������� ������ 
--"�.�.�., ���������" � ���������� �� ������ "��������� 39".
CREATE VIEW TeachersViewInfo
as select TeachName [��� �������������], Post[���������], AcademicTitleDegree [������],
EmployeeNumber [������ �����], Department [���������]
FROM Teachers T INNER JOIN Departments D
ON T.Adress = D.FacultyAdress INNER JOIN SalaryCosts S
ON T.TeachName = S.TeacherName
where T.AcademicTitleDegree = '�.�.�., ���������' and D.FacultyAdress = '��������� 39'

SELECT * FROM TeachersViewInfo 