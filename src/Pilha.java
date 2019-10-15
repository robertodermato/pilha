public class Pilha {

    private int tamanho;
    private int top;
    private Integer [] lista;

    public Pilha(){
        tamanho=10;
        top=-1;
        lista = new Integer[10];
    }

    public Pilha (int tam){
        this.tamanho=tam;
        top=-1;
        lista = new Integer[tam];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top<0;
    }

    public void push (int element){
        if (size()==tamanho) throw new IllegalArgumentException("Pilha cheia");
        lista[top+1]=element;
        top++;
    }

    public int top (){
        if (isEmpty()) throw new IllegalArgumentException("Pilha vazia");
        return lista[top];
    }

    public int pop (){
        if (isEmpty()) throw new IllegalArgumentException("Pilha vazia");
        int element = lista[top];
        lista[top]=null;
        top--;
        return element;
    }

    public String toString(){
        String pilhaStr = "Pilha: [";
        if (isEmpty()) {pilhaStr=pilhaStr+"]"; return pilhaStr;}

        pilhaStr=pilhaStr+ lista[0];
        for (int i=1; i<size(); i++){
            pilhaStr=pilhaStr+ ", "  +  lista[i];
        }

        pilhaStr=pilhaStr+"]";

        return pilhaStr;

    }
}
