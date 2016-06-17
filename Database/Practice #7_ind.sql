-- Задание 1
-- Вывести имя преподавателя, факультет и оклад преподавателей для тех
-- преподавателей, у которых оклад выше среднего оклада в ВУЗе.

select TeachName [Name], Department, SalaryRate
	from Teachers N, SalaryCosts D, SalaryCosts S
	where N.TeachName = D.TeachName 
	and SalaryRate > (select AVG(SalaryRate) from SalaryCosts D1)
---------------------------------------------------------------------------------------