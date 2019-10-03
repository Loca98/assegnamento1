public class Amministratore extends Persona {

    public Amministratore(String _nome, String _cognome, String _email, String _pwd) {
        super(_nome, _cognome, _email, _pwd);
    }

    public void AggiungiUtente(Circolo _circolo1, Persona _persona){
        Persona[] _nuovaLista = new Persona[_circolo1.listaPersone.length+1];
        System.arraycopy(_circolo1.listaPersone, 0, _nuovaLista, 0, _circolo1.listaPersone.length);
        _nuovaLista[_nuovaLista.length-1] = _persona;

        System.out.println(this.nome + " ha aggiunto " + _persona.nome);

        _circolo1.listaPersone = new Persona[_nuovaLista.length];
        _circolo1.listaPersone = _nuovaLista;
    }

    public void RimuoviUtente(Circolo _circolo1, Persona _persona){

        for(int i = 0; i<_circolo1.listaPersone.length;i++) {
            if(_circolo1.listaPersone[i] == _persona){

                Persona tmp = _circolo1.listaPersone[i];
                _circolo1.listaPersone[i] = _circolo1.listaPersone[_circolo1.listaPersone.length-1];
                _circolo1.listaPersone[_circolo1.listaPersone.length-1] = tmp;

                System.out.println(this.nome + " ha cancellato " + _circolo1.listaPersone[_circolo1.listaPersone.length-1].nome);

                Persona[] _nuovaLista = new Persona[_circolo1.listaPersone.length-1];
                System.arraycopy(_circolo1.listaPersone, 0, _nuovaLista, 0, _nuovaLista.length);

                _circolo1.listaPersone = new Persona[_nuovaLista.length];
                _circolo1.listaPersone = _nuovaLista;
            }
        }
    }

    public void ModificaUtente(Circolo _circolo, Persona _persona, String _param, String _value){
        //TODO
    }

    public void AggiungiAttivita(Circolo _circolo, Attivita _attivita){
        Attivita[] _nuovaLista = new Attivita[_circolo.listaAttivita.length+1];
        System.arraycopy(_circolo.listaAttivita, 0, _nuovaLista, 0, _circolo.listaAttivita.length);
        _nuovaLista[_nuovaLista.length-1] = _attivita;

        if(_attivita instanceof Corso){
            System.out.println(this.nome + " ha aggiunto il corso " + _attivita.nome);
        }else if (_attivita instanceof Gara){
            System.out.println(this.nome + " ha aggiunto la gara " + _attivita.nome);
        }

        _circolo.listaAttivita = new Attivita[_nuovaLista.length];
        _circolo.listaAttivita = _nuovaLista;
    }

    public void RimuoviAttivita(Circolo _circolo, String _nomeAttivita){
        for(int i=0; i<_circolo.listaAttivita.length; i++){
            if(_circolo.listaAttivita[i].nome == _nomeAttivita){
                if(_circolo.listaAttivita[i] instanceof Corso){
                    System.out.println(this.nome + " ha rimosso il corso " + _circolo.listaAttivita[i].nome);
                }else if(_circolo.listaAttivita[i] instanceof Gara){
                    System.out.println(this.nome + " ha rimosso la gara " + _circolo.listaAttivita[i].nome);
                }

                Attivita tmp = _circolo.listaAttivita[i];
                _circolo.listaAttivita[i] = _circolo.listaAttivita[_circolo.listaAttivita.length-1];
                _circolo.listaAttivita[_circolo.listaAttivita.length-1] = tmp;

                Attivita[] _nuovaLista = new Attivita[_circolo.listaAttivita.length-1];
                System.arraycopy(_circolo.listaAttivita, 0, _nuovaLista, 0, _nuovaLista.length);

                _circolo.listaAttivita = new Attivita[_nuovaLista.length];
                _circolo.listaAttivita = _nuovaLista;
            }
        }
    }

    public void ModificaAttivita(Circolo _circolo, String _param, String _value){
        //TODO
    }


}
