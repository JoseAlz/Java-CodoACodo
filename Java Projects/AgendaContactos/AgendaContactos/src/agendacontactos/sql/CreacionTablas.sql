/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Marce
 * Created: 16/06/2021
 */




create table persona (
    id integer not null generated always as identity, -- Id autonumético
    nombre varchar(20) not null,
    apellidos varchar(40) not null,
    telefono varchar(15),
    email varchar(30),
    provincia integer not null,
    fecha_nacimiento date,
    num_hijos smallint,
    estado_civil char(1),
    salario decimal(7,2),
    jubilado boolean,
    foto varchar(30),
    constraint id_persona_pk primary key (id),
    constraint prov_persona_fk foreign key (provincia) references provincia (id)
    

);

