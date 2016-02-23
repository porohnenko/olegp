--create database Students_progress 
--drop table SGroup
--drop table Students
use Students_progress

create table Student 
	(NRecordBook INT not null PRIMARY KEY, 
	StName Varchar(35),
	IDGroup INT CONSTRAINT StudentsSGroup foreign key (IDGroup) references SGroup,
	SPasport Varchar(4) not null CONSTRAINT StudentSPasportUnique UNIQUE,
	NPasport Varchar(6) not null CONSTRAINT StudentNPasportUnique UNIQUE,
	DataPassport DateTime not null CONSTRAINT StudentDataPassportUnique UNIQUE,
	NameDeptPasport Varchar(35) not null CONSTRAINT StudentNameDeptPasportUnique UNIQUE,
	INN Varchar(10) CONSTRAINT StudentINNUnique UNIQUE)
	
create table Teacher 
	(PIN int not null PRIMARY KEY,
	TeachName varchar(35),
	DeptName varchar(35),
	TeachPost varchar(35),
	DateHire datetime)
	
create table Progress
	(IDReport int not null,
	IDSubject int not null,
	NRecordBook int not null,
	NTerm numeric(4,0) not null,
	PIN int,
	Mark smallint,
	CONSTRAINT ProgressPrimaryForeign PRIMARY KEY(NrecordBook,IDSubject,IDReport,PIN),
	CONSTRAINT ProgressIDReportForeign foreign key(IDReport) REFERENCES Report,
	CONSTRAINT ProgressIDSubjectForeign foreign key(IDSubject) REFERENCES Subjects,
	CONSTRAINT ProgressPINForeign foreign key(PIN)REFERENCES Teacher,
	CONSTRAINT ProgressNRecordBookForeign foreign key(NRecordBook)REFERENCES Student)
	
create table UPlan
	(IDSubject int not null,
	NTerm varchar(2) not null,
	IDWork int not null,
	IDGroup int not null,
	PIN int,
	Clock numeric(3,0),
	CONSTRAINT UPlanPrimaryForeign PRIMARY KEY (IDSubject, IDWork, IDGroup, PIN),
	CONSTRAINT UPlanIDWorkForeign foreign key(IDWork) REFERENCES Work,
	CONSTRAINT UPlanPINForeign foreign key(PIN) REFERENCES Teacher,
	CONSTRAINT UPlanIDSubjectForeign foreign key(IDSubject) REFERENCES Subjects,
	CONSTRAINT UPlanIDGroupForeign foreign key(IDGroup) REFERENCES SGroup)
	
create table Subjects
	(IDSubject int not null PRIMARY KEY,
	NameSubject varchar(35) CONSTRAINT SubjectsNameSubject UNIQUE)
	
create table Report
	(IDReport int not null PRIMARY KEY,
	NameReport varchar(35) CONSTRAINT ReportNameReport UNIQUE)
	
create table Work
	(IDWork int not null PRIMARY KEY,
	NameWork varchar(35))
	
create table SGroup 
	(IDGroup INT CONSTRAINT IDGroupPrimary PRIMARY KEY, 
	NameGroup Varchar(15) CONSTRAINT SGroupIDGroupUnique UNIQUE)	
	
--------------------------------------------------------------------------------------------------
--Practice lab #2

use Students_progress

insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(130, ' ADITYENDRA MISHRA ', 'MP', 645849, 2015-07-09,'RUVD', '32156')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(131, ' ALOK CHANDRA PATIL ', 'MD', 459845, 2015-06-09,'RUVD1', '15812')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(132, ' AMBER SAHU ', 'MW', 498663, 2015-08-23,'RUVD2', '89612')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(133, ' AMRITA CHOUBEY ', 'MQ', 785285, 2015-11-30,'RUVD3', '85621')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(134, ' BHUPENDRA ARYA ', 'MR', 894615, 2015-12-25,'RUVD4', '96325')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(135, ' DEEPAK VERMA ', 'MF', 741296, 2015-10-22,'RUVD5', '90812')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(136, ' GARIMA PAL  ', 'MY', 526349, 2015-03-15, 'RUVD6', '78945')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(137, ' LOKENDRA KUMAR BAIRWA ', 'MH', 785421, 2015-02-14,'RUVD7', '678988')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(138, ' MASOORUDDIN ', 'MU', 974614, 2015-05-13,'RUVD8', '496116')
insert into dbo.Student (NRecordBook, StName, SPasport, NPasport, DataPassport, NameDeptPasport, INN)
	values(139, ' PRATIBHA RAMCHANDANI ', 'MI', 412697, 2015-09-12,'RUVD9', '46512')
	
------------------------------------------------------------------------------------------------------
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3181, 'POIT15-010')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3182, 'POIT15-011')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3183, 'POIT15-012')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3184, 'POIT15-013')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3185, 'POIT15-014')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3186, 'POIT15-015')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3187, 'POIT15-016')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3188, 'POIT15-017')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3189, 'POIT15-018')
insert into dbo.SGroup (IDGroup,NameGroup) 
	values (3190, 'POIT15-019')
	
------------------------------------------------------------------------------------------------------

insert into dbo.Teacher (PIN,TeachName,DeptName,TeachPost,DateHire)
	values (1169, 'NAMRATA MODI', 'POIT', 'Master',2013-01-09)
insert into dbo.Teacher (PIN,TeachName,DeptName,TeachPost,DateHire)
	values (1235, 'NEHA GARG', 'POIT', 'Bachelor ',2012-01-09)
insert into dbo.Teacher (PIN,TeachName,DeptName,TeachPost,DateHire)
	values (9864, 'POURUSH SRIVASTAVA', 'POIT', 'Master',2011-01-09)
insert into dbo.Teacher (PIN,TeachName,DeptName,TeachPost,DateHire)
	values (4332, 'PRACHI GANGWAR', 'POIT', 'Doctor',2010-01-09)
insert into dbo.Teacher (PIN,TeachName,DeptName,TeachPost,DateHire)
	values (7865, 'RACHANA YADAV', 'POIT', 'Bachelor ',2009-01-09)
	
------------------------------------------------------------------------------------------------------

insert into dbo.Work (IDWork,NameWork)
values (015,'Lection')
insert into dbo.Work (IDWork,NameWork)
values (016,'Practice work')
insert into dbo.Work (IDWork,NameWork)
values (017,'Laboratory work')

------------------------------------------------------------------------------------------------------

insert into Subjects (IDSubject,NameSubject)
values (8165,'OOP')
insert into Subjects (IDSubject,NameSubject)
values (9816,'JAVA')
insert into Subjects (IDSubject,NameSubject)
values (7573,'C#')
insert into Subjects (IDSubject,NameSubject)
values (3863,'Database')
insert into Subjects (IDSubject,NameSubject)
values (3873,'Computer networks')

------------------------------------------------------------------------------------------------------

insert into Report (IDReport,NameReport)
values (1110001,'Examenation')
insert into Report (IDReport,NameReport)
values (1110015,'Testing')
insert into Report (IDReport,NameReport)
values (1110020,'Academic Year Project')

------------------------------------------------------------------------------------------------------
update Student 
	set IDGroup='3181'
	where NRecordBook='130'
update Student 
	set IDGroup='3182'
	where NRecordBook='131'
update Student 
	set IDGroup='3183'
	where NRecordBook='132'
update Student 
	set IDGroup='3181'
	where NRecordBook='133'
update Student 
	set IDGroup='3184'
	where NRecordBook='134'
update Student 
	set IDGroup='3181'
	where NRecordBook='135'
update Student 
	set IDGroup='3182'
	where NRecordBook='136'
update Student 
	set IDGroup='3183'
	where NRecordBook='137'	
update Student 
	set IDGroup='3184'
	where NRecordBook='138'
update Student 
	set IDGroup='3181'
	where NRecordBook='139'	
------------------------------------------------------------------------------------------------------

insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110020,8165,130,1,1169,9)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110015,9816,131,1,1235,8)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110020,7573,132,1,9864,9)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110001,3863,133,2,4332,9)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110015,3873,134,2,7865,9)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110020,8165,135,1,1169,9)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110001,3863,136,2,4332,8)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110015,3863,137,2,7865,7)
insert into Progress (IDReport,IDSubject,NRecordBook,NTerm,PIN,Mark)
values (1110020,8165,139,1,1169,10)

------------------------------------------------------------------------------------------------------

insert into UPlan (IDSubject,NTerm,IDWork,IDGroup,PIN,Clock)
values (8165,1,015,3181,1169,40)






delete from Progress;