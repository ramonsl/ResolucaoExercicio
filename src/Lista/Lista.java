package Lista;

public class Lista {
    int qtd;
    int tam;
    Elemento inicio;
    Elemento fim;

    public boolean addInicio(Elemento e){
        if(inicio==null){
            inicio =e;
            fim=e;
            qtd ++;
        }else{
         //   e.proximo=inicio;
            inicio=e;
            qtd++;

        }

        return true;
    }


    public boolean addFim(Elemento e){
        if(inicio==null){
            inicio =e;
            fim=e;
            qtd ++;
        }else{


          ///  fim.proximo=e;
            fim=e;
            qtd++;

        }

        return true;
    }

    public void mostrar(){
        if(inicio==null){
            System.out.println("lista vazia");
        }else{
            Elemento aux=inicio;
            while (aux!=null){
                System.out.println(aux.toString());
           //     aux=aux.proximo;
            }
        }
    }
}
