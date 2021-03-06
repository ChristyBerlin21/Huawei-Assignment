//Student Database Table creation

CREATE TABLE Student (std_id integer, name varchar(25), age integer,mobile_no integer,reg_no integer, batch int);

//Teacher Database Table Creation

CREATE TABLE Staff (staff_id integer,name varchar(25), domain varchar(10),dept varchar(10));

//Insertion of Student data to the database

INSERT INTO Student(std_id,name,age,mobile_no,reg_no,batch)
VALUES (1,’Akshara’, 20, 8765843797, 87668376,2020 );
VALUES (2,’Archana’, 20, 73973893734, 87668377,2020);
VALUES (3, ‘Aruna’, 19, 77396431479, 87668378, 2021);
VALUES (4, ‘Berlin’, 19, 7480473956, 87668379, 2021);
VALUES (5, ‘Blessi’, 20, 9346438875, 87668387, 2020);
VALUES (6,’Clamendeena’, 20, 8767843897, 87668389,2020 );
VALUES (7,’Deepika’, 19, 739738937346, 87668398,2021);
VALUES (8, ‘Devika’, 20, 778946431479, 87668345, 2020);
VALUES (9, ‘Hari Priya’, 19, 7480473956, 87668384, 2021);
VALUES (10, ‘Hema’, 20, 9346430075, 87668365, 2020);

//Insertion of Teachers data to the database

INSERT INTO Staff(staff_id,name,domain,dept)
VALUES (1,’Aarthi’, ‘IT’, ‘CSE’);
VALUES (2, ‘Beula’, ‘DBMS’ , ‘CSE’);
VALUES (3, ‘Clara’,’EG’ , ‘MECH’);
VALUES (4, ‘Devi’, ‘DS’ , ‘CSE’);
VALUES (5, ‘Eeswari’ , ‘CE’ , ‘CSE’);
VALUES (6, ‘Gayathri’, ‘MPMC’ ,’ECE’);
VALUES (7,’Jeyashree’ ,’Audrino’,’CSE’);
VALUES (8, ‘Pooja’,’DAA’,’CSE’);
VALUES (9, ‘Ravathi’,’TOC,’CSE’);
VALUES (10, ‘Sakthi’,’ML’,’CSE’);

//Query to fetch all students from batch 2020

SELECT * from Student WHERE  batch=2020;

//Query to fetch all teachers from CSE department

SELECT * from Staff WHERE dept=’CSE’;

//Query to edit atleast 3 records from student database

UPDATE Student set reg_no=87668321 WHERE std_id=7;
UPDATE Student set std_id=21 WHERE name = Blessi;
UPDATE Student set age = 19 WHERE reg_no = 87668378;

//Query to delete 2 records from teachers table

DELETE FROM Staff WHERE name = ‘Pooja’;
DELETE FROM Staff WHERE domain = ‘DBMS’;