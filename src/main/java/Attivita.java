public class Attivita {
    String nome;
    Persona[] listaPersone;

    public Attivita(String _nome, Persona [] _listaPersona) {
        nome = _nome;
        listaPersone = _listaPersona;
    }

    public Attivita(String _nome) {
        nome = _nome;
        listaPersone = new Persona[0];
    }

    public void StampaIscrizioni() {
        System.out.println("Iscritti a " + nome +  ": " + listaPersone.length);
        for(int i=0; i<listaPersone.length; i++) {
            System.out.println("[" + i + "] : " +  listaPersone[i].nome);
        }
    }


}
