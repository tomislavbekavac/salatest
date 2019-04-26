/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Tomislav
 * Created: 26.04.2019.
 */

drop database if exists sala;
create database sala character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < "F:sala.sql"
use sala;
create table svadba(
	sifra			int not null primary key auto_increment,
	mladenci 		int not null,
	jelovnik		int,
	osoblje			int,
	cijena			decimal(18,2),
	datum			datetime,
	broj_gostiju	varchar(50),
	stolovi			varchar(50),
	komentar		varchar(500)
);

create table jelovnik(
	sifra			int not null primary key auto_increment,
	jelo			int,
	pice			int
);

create table jelo(
	sifra 			int not null primary key auto_increment,
	glavno_jelo		varchar(300),
	predjelo		varchar(300),
	kolaci			varchar(300),
	torte			varchar(300),
	svedski_stol	varchar(300)
);

create table pice(
	sifra			int not null primary key auto_increment,
	bezalkoholno	varchar(300),
	pivo			varchar(300),
	vino			varchar(300),
	zesta			varchar(300)
);

create table osoblje(
	sifra 			int not null primary key auto_increment,
	konobar			varchar(80),
	kuhar			varchar(80),
	pomocni_kuhar	varchar(80)
);

create table osoblje_svadba(
	svadba			int not null,
	osoblje 		int not null
);

create table mladenci(
	sifra			int not null primary key auto_increment,
	mladozenja		varchar(100),
	mlada			varchar(100),
	mobitel			varchar(20),
	ugovor			varchar(50)
);

alter table svadba add foreign key (mladenci) references mladenci(sifra);
alter table svadba add foreign key (jelovnik) references jelovnik(sifra);

alter table jelovnik add foreign key (jelo) references jelo(sifra);
alter table jelovnik add foreign key (pice) references pice(sifra);

alter table osoblje_svadba add foreign key (svadba) references svadba(sifra);
alter table osoblje_svadba add foreign key (osoblje) references osoblje(sifra);

insert into mladenci(sifra,mladozenja,mlada,mobitel,ugovor) 
values (null,'Marko Marulic','Mladena Marulic','099123456','122345');

insert into mladenci(sifra,mladozenja,mlada,mobitel,ugovor) 
values (null,'Ivan Ivanovac','Ivana Ivanovac','0987654321','123456789');

insert into osoblje(sifra,konobar,kuhar,pomocni_kuhar) 
values (null,'Zlatko Zlatarevic','Ivan Vidovic','Anica Ana');

insert into pice(sifra,bezalkoholno,pivo,vino,zesta) 
values (null,'cola','pan','kutjevacko','pelin');

insert into jelo(sifra,glavno_jelo,predjelo,kolaci,torte,svedski_stol)
values (null,'svinjetina','juha','domaci','ledeni vjetar','meza');

insert into jelovnik(sifra,jelo,pice) 
values(null,1,1);

insert into svadba(sifra,mladenci,jelovnik,osoblje,cijena,datum,broj_gostiju,stolovi,komentar) 
values(null,1,1,1,16750.00,'2007-03-11','400','ravni','najam');

insert into svadba(sifra,mladenci,jelovnik,osoblje,cijena,datum,broj_gostiju,stolovi,komentar) 
values(null,2,1,1,2500.00,'2019-02-02','250 sa tamburasima i slikarima','okrugli svi','2 vegeterijanca');