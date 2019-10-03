public class Main {

    public static void main(String[] args) {

        Persona [] persone = {
                new Socio("Mattia", "a", "s1@gmail.com", "aaa"),
                new Socio("Martina", "b", "s2@gmail.com", "ccc"),
                new Socio("Cosmin", "c", "s3@gmail.com", "eee"),
                new Amministratore("Gabriele", "d", "a1@gmail.com", "ddd"),
                new Amministratore("Ana", "e", "a2@gmail.com", "eee")
        };

        Attivita [] attivita = {
                new Gara("Briscola"),
                new Corso("Biliardo")
        };

        Circolo circolo1 = new Circolo("circolo1", persone, attivita);
        circolo1.StampaPersone();
        circolo1.StampaAttivita();

        circolo1.listaPersone[1].Iscrivi(circolo1.listaAttivita[1]);
        circolo1.listaAttivita[1].StampaIscrizioni();

        circolo1.listaPersone[1].Disiscriviti(circolo1.listaAttivita[1]);
        circolo1.listaAttivita[1].StampaIscrizioni();

        ((Amministratore)circolo1.listaPersone[3]).RimuoviUtente(circolo1, circolo1.listaPersone[2]);
        circolo1.StampaPersone();

        ((Amministratore)circolo1.listaPersone[3]).AggiungiUtente(circolo1, new Socio("Lorenzo", "f", "lolc@gmail.com", "fff"));
        circolo1.StampaPersone();

        ((Amministratore)circolo1.listaPersone[3]).AggiungiAttivita(circolo1, new Corso("Yoga", new Persona[0]));
        circolo1.StampaAttivita();

        ((Amministratore)circolo1.listaPersone[3]).RimuoviAttivita(circolo1, "Biliardo");
        circolo1.StampaAttivita();

    }
}
