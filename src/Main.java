
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Teste da Pilha ===");
        Pilha pilha = new Pilha();
        pilha.empilhar(1);
        pilha.empilhar(3);
        pilha.empilhar(5);
        pilha.mostrar();
        pilha.desempilhar();
        pilha.mostrar();
        System.out.println();

        System.out.println("=== Teste da Fila ===");
        Fila fila = new Fila();
        fila.enfileirar(2);
        fila.enfileirar(4);
        fila.enfileirar(6);
        fila.mostrar();
        fila.desenfileirar();
        fila.mostrar();
        System.out.println();

        System.out.println("=== Merge com Filas (Lista Encadeada) ===");
        Fila A = new Fila();
        A.enfileirar(10);
        A.enfileirar(30);
        A.enfileirar(50);

        Fila B = new Fila();
        B.enfileirar(5);
        B.enfileirar(20);
        B.enfileirar(40);
        B.enfileirar(60);

        Fila C = MergeLista.juntar(A, B);
        C.mostrar();
        System.out.println();
      
        System.out.println("=== Merge com Vetores ===");
        int[] vetorA = {7, 15, 25};
        int[] vetorB = {3, 8, 20, 30};

        int[] vetorC = MergeVetor.juntar(vetorA, 3, vetorB, 4);

        System.out.print("Resultado do merge: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
