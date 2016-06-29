--Single select
-------------------------------------------------------------------------------
select* from [Departments]
select* from [Teachers]
select distinct [Teachers].[TeachName],[Teachers].Post from [Teachers]

select [Departments].NameDepartment [Факультет] from [Departments]
select distinct [Departments].NameDepartment [Факультет] from [Departments]

--Multi select
-------------------------------------------------------------------------------
SELECT Teachers.TeachName ФИО, Teachers.Post [Должность],
             Teachers.EmployeeNumber [Личный номер],Departments.NameDepartment [Факультет],
             [SalaryCosts].[SalaryRate][Оклад], [Teachers].Salary [з/п]
 FROM SalaryCosts JOIN Teachers
		ON SalaryCosts.TeachName = Teachers.TeachName
                              JOIN Departments 
       ON SalaryCosts.Department = Departments.NameDepartment 
                              
-------------------------------------------------------------------------------



