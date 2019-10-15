public class PilhaEncadeada {

    private Node top;
    private int tamanho;

    private class Node {
        public Integer element;
        public Node prev;

        public Node(Integer e) {
            element = e;
            prev = null;
        }
    }

    public PilhaEncadeada(){
        top=null;
        tamanho=0;
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push (int element){
        Node topo = new Node(element);

        topo.prev=top;

        top=topo;
        tamanho++;
    }

    public int top (){
        if (isEmpty()) throw new IllegalArgumentException("Pilha vazia");
        return top.element;
    }

    public int pop (){
        if (isEmpty()) throw new IllegalArgumentException("Pilha vazia");
        int element = top.element;
        top=top.prev;
        tamanho--;
        return element;
    }

    public String toString(){
        String pilhaStr = "Pilha: [";
        if (isEmpty()) {pilhaStr=pilhaStr+"]"; return pilhaStr;}

        pilhaStr=pilhaStr+ top.element;

        Node aux = top.prev;

        for (int i=1; i<size(); i++){
            pilhaStr=pilhaStr+ ", "  +  aux.element;
            aux=aux.prev;
        }

        pilhaStr=pilhaStr+"]";

        return pilhaStr;

    }


}
