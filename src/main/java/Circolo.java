public class Circolo {
    String nome;
    Persona [] listaPersone;
    Attivita [] listaAttivita;

    public Circolo(String _nome, Persona [] _listaPersone, Attivita [] _listaAttivita) {
        nome = _nome;
        listaPersone = _listaPersone;
        listaAttivita = _listaAttivita;
    }

    public void StampaPersone() {
        for(int i=0; i<listaPersone.length; i++) {
            if(listaPersone[i] instanceof Socio) {
                System.out.println("Socio : " + listaPersone[i].nome + " " + listaPersone[i].cognome);
            }else if(listaPersone[i] instanceof Amministratore) {
                System.out.println("Amministratore : " + listaPersone[i].nome + " " + listaPersone[i].cognome);
            }
        }
    }

    public void StampaAttivita() {
        for(int i=0; i<listaAttivita.length; i++) {
            if(listaAttivita[i] instanceof Gara){
                System.out.println("Gara : " + listaAttivita[i].nome);
            }else if(listaAttivita[i] instanceof Corso){
                System.out.println("Corso : " + listaAttivita[i].nome);
            }
        }
    }

}
