
public class Pilha {
    private Elemento topo;

    public Pilha() {
        topo = null;
    }
    public void empilhar(int dado) {
        Elemento novo = new Elemento();
        novo.valor = dado;
        novo.proximo = topo;
        topo = novo;
    }
    public int desempilhar() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int removido = topo.valor;
        topo = topo.proximo;
        System.out.println("Removido da pilha: " + removido);
        return removido;
    }
    public void mostrar() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.print("Conteúdo da pilha (topo → base): ");
        Elemento atual = topo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
