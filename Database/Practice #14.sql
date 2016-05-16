--—оздать локальную таблицу с названием TEMP и пол€ми типа дата/врем€, 
--длинное целое, строка. 
--ƒобавить в нее две записи с данными и вывести результат на экран. 

declare @TEMP table(A datetime, B int, C varchar(30))
insert into @TEMP (A,B,C) select SalaryMonth, FullTimer, TeachName from [dbo].[SalaryCosts]
select * from @TEMP