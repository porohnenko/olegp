EXEC SP_HELP Progress
-----------------------------------------------------------------------------------------
-- Задание 1
-- Введите ограничение на оценку в отношении Успеваемость. Оценка не
-- должна превышать 5 баллов. Номер семестра не должен превышать 10.
alter table Progress 
	with check
	add constraint CheckProgressMark check((Mark <= 10) and (NTerm < 10));
alter table Progress drop constraint CheckProgressMark;
-----------------------------------------------------------------------------------------
--Пример 2
--Ввести ограничения FOREIGN KEY для таблицы Uplan. Таблица Uplan
--ссылается на таблицу Subject по атрибуту IDSubject.
ALTER TABLE UPlan
ADD CONSTRAINT PlanSubjectForeign FOREIGN KEY
(IDSubject) REFERENCES Subjects(IDSubject);
-----------------------------------------------------------------------------------------
--Пример 3
--Ввести ограничения FOREIGN KEY для таблицы UPlan таким образом,
--чтобы при удалении из таблицы Subject записей по тому или иному
--предмету, были бы удалены и соответствующие этим предметам записи из
--таблицы UPlan.
ALTER TABLE UPlan
ADD CONSTRAINT PlanSubjectForeign
FOREIGN KEY (IDSubject) REFERENCES Subjects(IDSubject)
ON DELETE CASCADE;
-----------------------------------------------------------------------------------------
--Пример 4
--Удалить ограничение FOREIGN KEY на атрибуте IDSubject в таблице Uplan.
ALTER TABLE UPlan
DROP CONSTRAINT PlanSubjectForeign
-------------------------------------------------------------------------------------------
--Пример 5
--Добавить ограничение FOREIGN KEY для столбца IDGroup в таблице
--Student1. Все данные в таблице Student проверить на соответствие новому
--ограничению.
ALTER TABLE Student
WITH CHECK
ADD CONSTRAINT StudentIDGroupForeign
FOREIGN KEY (IDGroup) REFERENCES SGroup(IDGroup)
-----------------------------------------------------------------------------------------
--Пример 6
--Если такое ограничение уже существует, то вам для апробации этой команды
--придется его удалить.
--Добавить ограничение FOREIGN KEY для столбца IDGroup в таблице
--Student. Все данные в таблице Student введенные на момент создания
--ограничения проверке не подлежат.
ALTER TABLE Student
WITH NOCHECK
ADD CONSTRAINT StudentIDGroupForeign
FOREIGN KEY (IDGroup) REFERENCES SGroup(IDGroup)
-----------------------------------------------------------------------------------------
--Пример 7
--Отключить все ограничения в таблице Progress.
ALTER TABLE Progress
NOCHECK CONSTRAINT ALL
-----------------------------------------------------------------------------------------
--Пример 8
--Подключить все ограничения в таблице Progress.
ALTER TABLE Progress
CHECK CONSTRAINT ALL
-----------------------------------------------------------------------------------------
--Пример 9
--Отключить ограничение в ProgressMarkCheсk для столбца Mark
--таблицы Progress.
ALTER TABLE Progress
NOCHECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--Пример 10
--Подключить ограничение в ProgressMarkCheck для столбца Mark
--таблицы Progress.
ALTER TABLE Progress
СHECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--Пример 11
--Подключить ограничение в ProgressMarkCheck для столбца Mark
--таблицы Progress и проверить корректность всех ранее введенных значений
--на соответствие этому ограничению.
ALTER TABLE Progress
WITH CHECK
CHECK CONSTRAINT CheckProgressMark
-----------------------------------------------------------------------------------------
--Пример 12
--Добавить столбец YearBegin (год начала учебы в институте) в таблицу
--Student, задав тип данных Datetime.
ALTER TABLE Student
ADD YearBegin Datetime;
-----------------------------------------------------------------------------------------
--Пример 13
--Добавить столбец IDFacultet (Код факультета) в таблицу SGroup, задав
--тип данных INT и определив значение по умолчанию 1.
ALTER TABLE SGroup
ADD IDFacultet INT DEFAULT 1;
-----------------------------------------------------------------------------------------
--Пример 14
--Добавить в таблицу SGroup, содержащую данные, столбец IDFacultet,
--установив для него ограничение NOT NULL.
ALTER TABLE SGroup
ADD IDFacultet INT NOT NULL
DEFAULT 1;
-----------------------------------------------------------------------------------------
--Пример 15
--Добавить в таблицу SGroup, содержащую данные, столбец IDFacultet,
--установив для него ограничение NOT NULL.
--Добавляем столбец:
ALTER TABLE SGroup
ADD IDFacultet INT;
--Заполняем столбец IDFacultet:
UPDATE SGroup SET IDFacultet=1
--Назначаем ограничение NOT NULL:
ALTER TABLE SGroup
ALTER COLUMN IDFacultet INT NOT NULL
-----------------------------------------------------------------------------------------
--Пример 16
--Увеличить ширину столбца NameGroup, увеличив ее до 20 символов.
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(20)
-----------------------------------------------------------------------------------------
--Пример 17
--Уменьшить размер столбца NameGroup до 15 символов
--(предполагается, что ранее она была увеличена до 20 символов).
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(15)
--Если столбец все-таки необходимо изменить, то сначала следует
--удалить ограничение SgroupNameGroupUnique
ALTER TABLE SGroup
DROP CONSTRAINT SGroupIDGroupUnique
--Затем уменьшить ширину столбца.
ALTER TABLE SGroup
ALTER COLUMN NameGroup VARCHAR(15)
-----------------------------------------------------------------------------------------
 EXEC SP_RENAME 'Subjects','Subjects05';
 EXEC SP_RENAME 'Subjects05','Subjects';
-----------------------------------------------------------------------------------------
--Пример 18
--Удалить таблицу Subject.
--На таблицу Subject ссылается как таблица Progress, так и таблица
--UPlan. В связи с этим удалению таблицы Subject должно предшествовать
--удаление ограничения ProgressSubjectForeign из таблицы Progress и
--ограничения Plan SubjectForeign из таблицы UPlan.
ALTER TABLE Progress
DROP CONSTRAINT ProgressSubjectForeign
ALTER TABLE UPlan
DROP CONSTRAINT PlanSubjectForeign
--**************************************************
DROP TABLE Subjects--********************************
--**************************************************


