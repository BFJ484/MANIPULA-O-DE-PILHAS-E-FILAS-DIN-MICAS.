
public class Fila {
    private Elemento inicio;
    private Elemento fim;

    public Fila() {
        inicio = null;
        fim = null;
    }
    public void enfileirar(int dado) {
        Elemento novo = new Elemento();
        novo.valor = dado;
        novo.proximo = null;

        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }
    public int desenfileirar() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int removido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        System.out.println("Removido da fila: " + removido);
        return removido;
    }
    public void mostrar() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Conteúdo da fila (início → fim): ");
        Elemento atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
    public Elemento getInicio() {
        return inicio;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}
