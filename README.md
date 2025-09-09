 TDE1 – Pilha, Fila e Merge

- **Elemento**: nó que armazena um inteiro e a referência para o próximo.
- **Pilha (Pilha.java)**: estrutura LIFO (último a entrar é o primeiro a sair).  
  Métodos: `empilhar`, `desempilhar`, `mostrar`.
- **Fila (Fila.java)**: estrutura FIFO (primeiro a entrar é o primeiro a sair).  
  Métodos: `enfileirar`, `desenfileirar`, `mostrar`.
- **MergeLista (MergeLista.java)**: recebe duas filas ordenadas (lista encadeada) e gera uma terceira fila também ordenada.
- **MergeVetor (MergeVetor.java)**: mesmo processo de merge, mas usando vetores.
- **Main (Main.java)**: executa todos os testes das estruturas.

---

 Como executar
Basta rodar o arquivo `Main.java`. Ele demonstra:

1. Pilha funcionando  
2. Fila funcionando  
3.1 Merge entre duas filas (lista encadeada)  
3.2 Merge entre dois vetores  

 Compilar:
```bash
javac src/*.java

Exemplos utilizados

Pilha: insere 1, 3, 5; remove uma vez; imprime o estado.
Saída: Conteúdo da pilha (topo → base): 3 1

Fila: insere 2, 4, 6; remove uma vez; imprime o estado.
Saída: Conteúdo da fila (início → fim): 4 6

Merge (listas):
A = [10, 30, 50], B = [5, 20, 40, 60]
Resultado → C = [5, 10, 20, 30, 40, 50, 60]

Merge (vetores):
vetA = {7, 15, 25}, vetB = {3, 8, 20, 30}
Resultado → vetC = {3, 7, 8, 15, 20, 25, 30}

Extras

Você pode alterar os valores que são inseridos na pilha, fila ou vetores no código para realizar outros testes.

Sempre que um elemento é removido de uma estrutura, o programa mostra qual foi o valor retirado.
