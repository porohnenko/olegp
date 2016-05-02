SELECT * FROM sys.fn_builtin_permissions('SERVER') ORDER BY permission_name;

execute sp_addlogin 'porohnenko','mypassword','Students_progress'
USE Students_progress
execute sp_adduser 'porohnenko'
GRANT ALL PRIVILEGES TO porohnenko

execute sp_addlogin 'admin1','mypassword','Students_progress'
USE Students_progress
execute sp_adduser 'admin1'
GRANT ALL PRIVILEGES TO admin1

--—оздадим роль Managers и включим в эту роль двух пользователей:
execute sp_addrole 'Managers';
execute sp_addrolemember 'Managers', 'porohnenko'
execute sp_addrolemember 'Managers', 'admin1'

--ѕредоставим права роли Managers
GRANT SELECT,INSERT,UPDATE,DELETE ON Progress TO porohnenko
GRANT SELECT,INSERT,UPDATE,DELETE ON Student TO admin1

--ѕриостановим право на выполнение вставки в таблицу Progress дл€ роли Managers:
REVOKE SELECT,INSERT,UPDATE,DELETE ON Progress TO Managers

--ѕосле выполнени€ этой команды оба пользовател€ лишаютс€ права выполнени€ операций SELECT,INSERT,UPDATE,DELETE с таблицой Progress
DENY SELECT,INSERT,UPDATE,DELETE ON Progress TO Managers