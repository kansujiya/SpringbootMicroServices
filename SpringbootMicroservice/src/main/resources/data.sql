
insert into user values(1001, sysdate(), 'suresh');
insert into user values(1002, sysdate(), 'Kansuji');

insert into post values(1101, 'My first post', 1001);
insert into post values(1102, 'My second post', 1001);

insert into sessions values(9001,'Keynote - The Golden Age of Software',45,'');
insert into speakers values(3002,'Barbara','Williams','Senior DBA','Contoso','Test');


--INSERT INTO sessions (session_id,session_name,session_length,session_description)
--VALUES (1,'Keynote - The Golden Age of Software',45,''),
--       (2,'A Better Way to Access Data with Spring Data',60,''),
--       (3,'A Deep Dive Into Spring IoC',60,''),
--       (4,'Building RESTful APIs with Spring Data Rest',60,''),
--       (5,'Spring Integration Quick Start',60,''),
--       (6,'Building Microservices with Spring',60,'');
--
--INSERT INTO speakers (speaker_id,first_name,last_name,title,company,speaker_bio)
--VALUES (1,'Sergio','Becker','Senior Developer','MicroOcean Software','Test'),
--       (2,'James','Lowrey','Solutions Architect','Fabrikam Industries','Test'),
--       (3,'Gloria','Franklin','Enerprise Architect','Carved Rock Online','Test'),
--       (4,'Lori','Vanhoose','Java Technical Lead','National Bank','Test'),
--       (5,'Raymond','Hall','Senior Developer','City Power and Electric','Test'),
--       (6,'Sam','Vasquez','Software Analyst','Globalmantics Consulting','Test'),
--       (7,'Justin','Clark','Principal Engineer','Tangerine Hippopotamus Consulting','Test'),
--       (8,'Barbara','Williams','Senior DBA','Contoso','Test');