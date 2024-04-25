--create table persoane (id integer not null primary key, nume varchar(40) not null,varsta int);
--insert into persoane (id,nume,varsta) values (1,'Ana',20);
--insert into persoane (id,nume,varsta) values (2,'Oana',21);
--insert into persoane (id,nume,varsta) values (3,'Ionel',22);
--insert into persoane (id,nume,varsta) values (4,'Dorel',23);
create table masini (id integer not null primary key, nr_inmatriculare varchar(15) not null, marca varchar(20), anf integer, culoare varchar(10), nrkm int);
insert into masini (id,nr_inmatriculare,marca,anf,culoare, nrkm) values (1,'TM 12 ABC', 'BMW', 2008, 'Black', 80000);
insert into masini (id,nr_inmatriculare,marca,anf,culoare, nrkm) values (2,'AR 12 XYZ', 'VW', 2012, 'White', 90000);
insert into masini (id,nr_inmatriculare,marca,anf,culoare, nrkm) values (3,'BH 12 OOP', 'Opel', 2019, 'Red', 120000);
insert into masini (id,nr_inmatriculare,marca,anf,culoare, nrkm) values (4,'CJ 12 GTS', 'Ferrari', 2021, 'Green', 30000);
insert into masini (id,nr_inmatriculare,marca,anf,culoare, nrkm) values (5,'GJ 99 ZXC', 'BMW', 1998, 'Black', 70000);



