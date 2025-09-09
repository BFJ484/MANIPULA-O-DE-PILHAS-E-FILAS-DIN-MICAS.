
public class MergeLista {

    public static Fila juntar(Fila A, Fila B) {
        Fila C = new Fila();

        while (!A.estaVazia() && !B.estaVazia()) {
            if (A.getInicio().valor <= B.getInicio().valor) {
                C.enfileirar(A.desenfileirar());
            } else {
                C.enfileirar(B.desenfileirar());
            }
        }
        while (!A.estaVazia()) {
            C.enfileirar(A.desenfileirar());
        }

        while (!B.estaVazia()) {
            C.enfileirar(B.desenfileirar());
        }

        return C;
    }
}
