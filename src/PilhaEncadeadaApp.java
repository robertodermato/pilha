public class PilhaEncadeadaApp {

    public static void main(String[] args) {

        PilhaEncadeada pilhaA = new PilhaEncadeada();

        System.out.println(pilhaA);

        pilhaA.push(4);
        pilhaA.push(5);
        pilhaA.push(6);

        System.out.println(pilhaA);

        System.out.println("Topo é: " + pilhaA.top());

        System.out.println("Remoção do topo");

        pilhaA.pop();

        System.out.println(pilhaA);

        System.out.println("Remoção de mais 2 itens");

        pilhaA.pop();
        pilhaA.pop();

        System.out.println(pilhaA);

        System.out.println("Tentativa de dar mais um pop");

        pilhaA.pop();
    }
}

