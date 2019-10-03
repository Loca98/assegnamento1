public class Persona {
    String nome;
    String cognome;
    String email;
    String pwd;

    public Persona(String _nome, String _cognome, String _email, String _pwd) {
        nome = _nome;
        cognome = _cognome;
        email = _email;
        pwd = _pwd;
    }

    public void Iscrivi(Attivita _attivita) {

        Persona[] nuovaLista = new Persona[_attivita.listaPersone.length+1];

        System.arraycopy(_attivita.listaPersone, 0, nuovaLista, 0, _attivita.listaPersone.length);
        nuovaLista[nuovaLista.length-1] = this;

        _attivita.listaPersone = new Persona[nuovaLista.length];
        _attivita.listaPersone = nuovaLista;

    }

    public void Disiscriviti(Attivita _attivita) {
        for(int i=0; i<_attivita.listaPersone.length; i++) {
            if(_attivita.listaPersone[i] == this) {
                Persona tmp = _attivita.listaPersone[i];
                _attivita.listaPersone[i] = _attivita.listaPersone[_attivita.listaPersone.length-1];
                _attivita.listaPersone[_attivita.listaPersone.length-1] = tmp;

                System.out.println(_attivita.listaPersone[i].nome + " si è disiscritta da " + _attivita.nome);

                Persona[] nuovaLista = new Persona[_attivita.listaPersone.length-1];
                System.arraycopy(_attivita.listaPersone, 0, nuovaLista, 0, nuovaLista.length);

                _attivita.listaPersone = new Persona[nuovaLista.length];
                _attivita.listaPersone = nuovaLista;


            }
        }
    }

}

