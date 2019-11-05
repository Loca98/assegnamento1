# Assegnamento del corso "Ingegneria del Software" - Ing. Sistemi Informativi

L’obiettivo è definire le classi del sistema software che dovrà gestire un circolo sportivo utilizzando
in modo appropriato le tecniche di ereditarietà e composizione.
Il circolo è definito da un insieme di persone e di attività.
Ogni persona è definita da: nome, cognome, indirizzo email (usato come login per l’accesso al
sistema) e password.
Le persone possono avere il ruolo di soci e amministratori.
Le attività possono essere gare o corsi e sono entrambe descritte da un nome e dalle persone a loro
iscritte
I soci possono:
- iscriversi a gare e corsi
- cancellare l’iscrizione a gare e corsi
Gli amministratori, oltre ad eseguire le operazioni di socio possono:
- aggiungere e rimuovere soci e amministratori e modificare i loro dati
- aggiungere e rimuovere gare e corsi e modificare i loro dati
Le classi del sistema dovranno gestire liste di persone e attività che saranno implementate da semplici
array che, per aggiungere e rimuovere elementi, sfrutteranno il metodo “System.arraycopy”.
Definite le classi, bisognerà implementare una semplice simulazione che:
1) crea dei piccoli insiemi iniziali di amministratori, soci e attività
2) sceglie un amministratore che aggiunge, rimuove e modifica dei soci
3) sceglie un socio che si iscrive a una gara e a un corso e poi cancella l’iscrizione di una delle
due attività
4) Infine presenta le informazioni possedute da soci, amministratori e attività
Ovviamente, l’avanzamento corretto della simulazione dovranno essere descritte tramite semplici
operazione di scrittura su console.
Il sistema dovrà essere consegnato come un “progetto maven” condiviso con il docente tramite un
sito di condivisione (e.g., Dropbox e Google drive). Il docente alla sua ricezione invierà una risposta
di ricezione. Il sistema dovrà essere consegnato non più tardi di una settimana dall’ultimo laboratorio
riguardante l’assegnamento (i.e., in base alla difficoltà, un assegnamento potrà coinvolgere più di una
lezione in laboratorio).

## Credits
Cosmin Gugoasa - 282322 - L.I.S.I.

