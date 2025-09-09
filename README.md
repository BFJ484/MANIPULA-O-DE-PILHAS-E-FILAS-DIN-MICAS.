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

 Rodar o arquivo `Main.java`. Ele demonstra:

1. Pilha funcionando  
2. Fila funcionando  
3.1 Merge entre duas filas (lista encadeada)  
3.2 Merge entre dois vetores  

## Exemplos Utilizados
Pilha:
Inserções: 1, 3, 5, 7

Remoções: 2 elementos

Resultado: 3 → 1 → Null

Fila:
Inserções: 2, 4, 6, 8

Remoções: 2 elementos

Resultado: 6 → 8 → Null

Merge (Listas Encadeadas):
Fila A: 1 → 3 → 5 → 7 → 9 → Null

Fila B: 2 → 4 → 6 → 8 → Null

Resultado: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8 → 9 → Null

Merge (Vetores):
Vetor A: {1, 3, 5, 7, 9}

Vetor B: {2, 4, 6, 8}

Resultado: {1, 2, 3, 4, 5, 6, 7, 8, 9}

## Extras
Você pode alterar os valores que são inseridos na pilha, fila ou vetores no código para realizar outros testes.

Sempre que um elemento é removido de uma estrutura, o programa mostra qual foi o valor retirado.

Para o merge, basta trocar os valores de A, B, vetorA ou vetorB para gerar diferentes combinações.


