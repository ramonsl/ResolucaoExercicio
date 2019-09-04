package Lista;

public class Main {
    public static void main(String[] args) {
        Lista minhaLista= new Lista();
        minhaLista.tam=10;
        Elemento e = new Elemento();
        e.ler();
        minhaLista.addInicio(e);
        Elemento i = new Elemento();
        i.ler();
        minhaLista.addInicio(i);
        Elemento u = new Elemento();
        u.ler();
        minhaLista.addFim(u);
        minhaLista.mostrar();
    }
}
