--�������� �������, ����������� �������������� ������ � ������� PROGRESS ����� ��������.

CREATE TRIGGER ProgressTerm
   ON Progress
   FOR UPDATE, DELETE
AS
   IF  EXISTS
( SELECT 'TRUE'      
     FROM Progress
	WHERE (DATEPART(mm,getDATE())<>'01' AND NTerm  %2=1)
              OR (DATEPART(mm,getDATE())<>'06' AND  NTerm  %2=0))
BEGIN       
RAISERROR('������ ���������� ������!!!',16,1)
/*-- ����� ���������� � ������ ������������� ������*/
	ROLLBACK TRAN
END
------------

UPDATE Progress SET mark=9 WHERE NRecordBook='133'
DELETE FROM Progress WHERE NRecordBook='133'
--------------------------------------------------------------------------------------------
--�������� �������, ��������� ������ � ������� Progress ����������� � ������� ��������� �� 
--��������� Student.

CREATE TRIGGER StudentProgress
   ON Student
   FOR INSERT, UPDATE, DELETE
AS
   DECLARE @COUNT int
   SELECT @COUNT=COUNT(*) FROM DELETED
-- ��������� ��������� �� �� ������� ������� Student  �����-���� ������.
-- ���� ��, �� �������� ���������� ��������� � �� ��������� �������
IF @COUNT>0
   BEGIN
       DELETE FROM PROGRESS
 	FROM DELETED D
         JOIN PROGRESS P
          ON D.NRecordBook=P.NRecordBook
   END
--------------------------------------------------------------------------------------------
--������� �������, ����������� ���������� ������ � ��������� Progress �� ����� �������. 

CREATE TRIGGER UpdateProgress
   ON PROGRESS   FOR  UPDATE
  AS
   IF  EXISTS
    ( SELECT 'TRUE'      
 	FROM INSERTED I
         LEFT JOIN DELETED D
          ON D.NRecordBook=I.NRecordBook
		WHERE I.mark>D.mark)
BEGIN       
RAISERROR('������ ���������� ������!!!',16,1)  
-- ����� ���������� � ������ ������������� ������
	ROLLBACK TRAN
END


UPDATE Progress 
SET mark=10
WHERE NRecordBook='135'
