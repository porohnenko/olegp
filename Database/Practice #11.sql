--�������� �������, ����������� �������������� ������ � ������� PROGRESS ����� ��������.

CREATE TRIGGER ProgressTerm
   ON Progress
   FOR INSERT, UPDATE, DELETE
AS
   IF  EXISTS
( SELECT 'TRUE'      
     FROM Progress
	WHERE (DATEPART(mm,getDATE())<>'01' AND NTerm  %2=1)
              OR (DATEPART(mm,getDATE())<>'06' AND  NTerm  %2=0))
BEGIN       
RAISERROR('������ ���������� ������!!!',20,1)
/*-- ����� ���������� � ������ ������������� ������*/
	ROLLBACK TRAN
END
------------
UPDATE Progress SET mark=2 WHERE NRecordBook='133'
INSERT INTO Progress VALUES ('133',1,2,1,4,5)
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

CREATE TRIGGER Update1Progress
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
SET mark=4 
WHERE NRecordBook='135'
