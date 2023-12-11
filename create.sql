
    create table ticket (
        data_chiusura date,
        data_inserimento date,
        id integer not null auto_increment,
        descrizione varchar(255),
        tipologia varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table utente (
        id integer not null auto_increment,
        cognome varchar(255),
        email varchar(255),
        nome varchar(255),
        password varchar(255),
        ruolo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table utente_ticket (
        ticket_id integer not null,
        utenti_id integer not null
    ) engine=InnoDB;

    alter table utente_ticket 
       add constraint FKmqhveuwe3tfpjrvk2tewpsjuu 
       foreign key (ticket_id) 
       references ticket (id);

    alter table utente_ticket 
       add constraint FKm9gjfwe47ks2jp69ime3th574 
       foreign key (utenti_id) 
       references utente (id);

    create table ticket (
        data_chiusura date,
        data_inserimento date,
        id integer not null auto_increment,
        id_utente integer,
        utente_id integer not null,
        descrizione varchar(255),
        tipologia varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table utente (
        id integer not null auto_increment,
        cognome varchar(255),
        email varchar(255),
        nome varchar(255),
        password varchar(255),
        ruolo varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table ticket 
       add constraint FKskcfi3nncwmdx913qt4c27tf1 
       foreign key (utente_id) 
       references utente (id);
