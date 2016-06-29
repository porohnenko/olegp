use [TeachersOfHighSchool]
CREATE TABLE Employees
(
    Id int,
    Name varchar(50) not null,
    Photo varbinary(max) not null
)

INSERT INTO Employees (Id, Name, Photo) 
SELECT 10, 'John', BulkColumn 
FROM Openrowset( Bulk 'd:\MY\Git\olegp\Database\employee.jpg', Single_Blob) as EmployeePicture

UPDATE Employees SET [Photo] = (SELECT
 MyImage.* from Openrowset(Bulk
 'd:\MY\Git\olegp\Database\employee.jpg', Single_Blob) MyImage)
 where Id = 10
 
 select * from Employees
---------------------------------------------------------------------------------------------------
 
 Create Table EmployeeProfile1 ( 
    EmpId int, 
    EmpName varchar(50) not null, 
    EmpPhoto varbinary(max) not null ) 
Go

Insert EmployeeProfile1 
   (EmpId, EmpName, EmpPhoto) 
   Select 1001, 'Vadivel', BulkColumn 
   from Openrowset( Bulk 'd:\MY\Git\olegp\Database\employee1.jpg', Single_Blob) as EmployeePicture

select * from EmployeeProfile1