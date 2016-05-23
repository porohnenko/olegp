DECLARE @a float, @b float
SET @a = 20
--SET @b =1.5
SET @b = (@a+@a)/15
SELECT @b --вывод на экран результата

use Students_progress
DECLARE @value INT
SELECT @value=COUNT(*) FROM Studenе

--В данном примере в переменную поместится последнее значение из результата запроса.
DECLARE @str CHAR(30)
SELECT @str = name_author FROM Authors

--Сочетание ключевых слов SET и SELECT
DECLARE @value1 INT
SET @value1 = (SELECT COUNT(*) FROM Authors)

--Работа с датой и временем
--Оператор SET DATEFORMAT dmy | ymd | mdy задает порядок следования компонентов даты.

SET DATEFORMAT dmy --ymd --mdy
DECLARE @d DateTime
SET @d = '16.05.2016 20:30:15'
SET @d = @d+1
SELECT @d [Дата, время]


--Создание временной таблицы через переменную типа TABLE
--Объявляется через DECLARE с указанием в скобках столбцов таблицы, их типов, размеров, 
--значений по умолчанию, а также индексов типа PRIMARY KEY или UNIQUE.

DECLARE @mytable TABLE(id INT, myname CHAR(20) DEFAULT 'Олег Порохненко')
INSERT INTO @mytable(id) VALUES (51951651)
SELECT * FROM @mytable

use DB_BOOKS
DECLARE @mytable TABLE(id INT, myname CHAR(20) DEFAULT 'Олег Порохненко')
INSERT @mytable SELECT Code_publish, City FROM Publishing_house
SELECT * FROM @mytable

--Преобразование типов переменных
--Функция CAST возвращает значение, преобразованное к указанному типу:
--CAST(@переменная или значение AS требуемый_тип_данных)

DECLARE @d DateTime, @str char(20)
SET @d = '02.05.2016 19:28:00'
SET @str = CAST(@d AS Char(20))
SELECT @str [Дата, время]

DECLARE @a INT
DECLARE @str CHAR(30)
SET @a = (SELECT COUNT(*) FROM Authors)
IF @a > 5
BEGIN
SET @str = 'Количество авторов больше 5'
SELECT @str
END
ELSE
BEGIN
SET @str = 'Количество авторов = ' + str(@a)
SELECT @str
END

--цикл While
DECLARE @a INT
SET @a = 1
WHILE @a <100
BEGIN
PRINT @a -- вывод на экран значения переменной
IF (@a>40) AND (@a<50)
BREAK
PRINT @a -- вывод на экран значения переменной
IF (@a>40) AND (@a<50)
BREAK --выход и выполнение 1-й команды за циклом
ELSE
SET @a = @a+rand()*10
CONTINUE
END
PRINT @a


DECLARE MyCursor1 SCROLL CURSOR FOR (select * from Authors)
DECLARE @i bigint, @s char(30), @date smalldatetime
OPEN MyCursor1
FETCH FIRST FROM MyCursor1 INTO @i, @s, @date
PRINT @i
PRINT @s
PRINT @date
CLOSE MyCursor1
DEALLOCATE MyCursor1


DECLARE MyCursor1 SCROLL CURSOR FOR (select * from Authors)
DECLARE @i bigint, @s char(30), @d datetime
OPEN MyCursor1
FETCH FIRST FROM MyCursor1 INTO @i, @s, @d
WHILE @@FETCH_STATUS = 0
BEGIN
FETCH NEXT FROM MyCursor1 INTO @i, @s, @d
PRINT @i
PRINT @s
PRINT @d
END
CLOSE MyCursor1
DEALLOCATE MyCursor1