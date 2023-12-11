
    alter table utente_ticket 
       drop 
       foreign key FKmqhveuwe3tfpjrvk2tewpsjuu;

    alter table utente_ticket 
       drop 
       foreign key FKm9gjfwe47ks2jp69ime3th574;

    drop table if exists ticket;

    drop table if exists utente;

    drop table if exists utente_ticket;

    alter table ticket 
       drop 
       foreign key FKskcfi3nncwmdx913qt4c27tf1;

    drop table if exists ticket;

    drop table if exists utente;
