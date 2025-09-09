# TDE1 – Pilha, Fila e Merge

- **Elemento**: nó que armazena um inteiro e a referência para o próximo.  
- **Pilha (Pilha.java)**: estrutura LIFO (último a entrar é o primeiro a sair).  
  Métodos: `empilhar`, `desempilhar`, `mostrar`.  
- **Fila (Fila.java)**: estrutura FIFO (primeiro a entrar é o primeiro a sair).  
  Métodos: `enfileirar`, `desenfileirar`, `mostrar`.  
- **MergeLista (MergeLista.java)**: recebe duas filas ordenadas (lista encadeada) e gera uma terceira fila também ordenada.  
- **MergeVetor (MergeVetor.java)**: mesmo processo de merge, mas usando vetores.  
- **Main (Main.java)**: executa todos os testes das estruturas.  

---

##  Como executar

Basta rodar o arquivo `Main.java`. Ele demonstra:

1. Pilha funcionando  
2. Fila funcionando  
3.1 Merge entre duas filas (lista encadeada)  
3.2 Merge entre dois vetores  

### Compilar:
```bash
javac src/*.java
Executar:
bash
Copiar código
java -cp src Main
📝 Exemplos utilizados
Pilha
java
Copiar código
Pilha pilha = new Pilha();
pilha.empilhar(1);
pilha.empilhar(3);
pilha.empilhar(5);
pilha.mostrar();
pilha.desempilhar();
pilha.mostrar();
Saída esperada:

csharp
Copiar código
Conteúdo da pilha (topo → base): 5 3 1
Removido da pilha: 5
Conteúdo da pilha (topo → base): 3 1
Fila
java
Copiar código
Fila fila = new Fila();
fila.enfileirar(2);
fila.enfileirar(4);
fila.enfileirar(6);
fila.mostrar();
fila.desenfileirar();
fila.mostrar();
Saída esperada:

java
Copiar código
Conteúdo da fila (início → fim): 2 4 6
Removido da fila: 2
Conteúdo da fila (início → fim): 4 6
Merge (listas)
java
Copiar código
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
Saída esperada:

java
Copiar código
Conteúdo da fila (início → fim): 5 10 20 30 40 50 60
Merge (vetores)
java
Copiar código
int[] vetorA = {7, 15, 25};
int[] vetorB = {3, 8, 20, 30};

int[] vetorC = MergeVetor.juntar(vetorA, 3, vetorB, 4);

for (int i = 0; i < vetorC.length; i++) {
    System.out.print(vetorC[i] + " ");
}
Saída esperada:

Copiar código
3 7 8 15 20 25 30
🔹 Extras
Você pode alterar os valores que são inseridos na pilha, fila ou vetores no código para realizar outros testes.

Sempre que um elemento é removido de uma estrutura, o programa mostra qual foi o valor retirado.

Para o merge, basta trocar os valores de A, B, vetorA ou vetorB para gerar diferentes combinações.


