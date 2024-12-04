Lista de Atividades: 


1. Binary Search
   - Implemente o algoritmo Binary Search em uma lista ordenada e encontre o índice de um elemento dado.
   - Explique por que a lista deve estar ordenada para que o Binary Search funcione corretamente. Forneça exemplos.


A ordenação é essencial porque garante que possamos eliminar metades da lista de maneira confiável, já que os elementos seguem uma sequência lógica. Isso torna possível prever onde um determinado valor pode estar.

Ex: Lista: [2, 4, 7, 10, 15, 20, 25], Lista2: [25, 20, 15, 10, 7, 4, 2]


2. Interpolation Search  
   - Crie uma função que implemente o Interpolation Search e teste-a em listas ordenadas com intervalos uniformes e não uniformes. Compare com o Binary Search.
   - Identifique casos em que o Interpolation Search é mais eficiente que o Binary Search.


Quando o Interpolation Search é mais eficiente:
Distribuições Uniformes: Quando os valores estão distribuídos de forma uniforme, a interpolação geralmente encontra o valor em menos iterações do que a busca binária.
Grandes Listas: Para listas muito grandes e uniformes, o Interpolation Search pode ter um desempenho significativamente melhor.

Quando o Binary Search é melhor:
Distribuições Não Uniformes: Se a lista não for uniforme, o Interpolation Search pode ser menos eficiente, pois as estimativas de posição podem ser menos precisas.




3. Jump Search

   - Desenvolva o algoritmo Jump Search e determine o tamanho ideal do "salto" para uma lista de tamanho 
.  - Compare o tempo de execução do Jump Search com o Binary Search em listas de diferentes tamanhos.

| Tamanho da Lista | Jump Search (ms) | Binary Search (ms) | Relação (Jump / Binary) |
   |------------------:|-----------------:|-------------------:|------------------------:|
|            1.000  |           0,030 |             0,005  |                    6x  |
|           10.000  |           0,095 |             0,007  |                  ~14x  |
|          100.000  |           0,300 |             0,009  |                  ~33x  |
|        1.000.000  |           0,950 |             0,012  |                  ~79x  |


4. Exponential Search
   - Implemente o algoritmo Exponential Search para localizar um elemento em uma lista ordenada. Explique como ele combina elementos do Jump Search e Binary Search.
   - Analise o desempenho do Exponential Search em listas muito grandes e pequenas.

5. Shell Sort
   - Implemente o Shell Sort com diferentes sequências de intervalo (ex.: Shell, Knuth, Hibbard). Compare os tempos de execução.
   - Explique como a escolha da sequência de intervalos afeta a eficiência do algoritmo.

6. Merge Sort
   - Implemente o Merge Sort para ordenar uma lista de números inteiros. Explique o conceito de "dividir para conquistar" usado nesse algoritmo.
   - Modifique o Merge Sort para ordenar strings em ordem alfabética.

7. Selection Sort
   - Desenvolva o Selection Sort e acompanhe cada iteração mostrando como a lista é organizada passo a passo.
   - Analise o desempenho do Selection Sort em listas pequenas, médias e grandes.

8. Bucket Sort
   - Implemente o Bucket Sort para ordenar uma lista de números em ponto flutuante no intervalo [0, 1). Explique como os "baldes" são preenchidos e ordenados.
   - Adapte o Bucket Sort para ordenar números inteiros positivos em intervalos maiores.

9. Radix Sort
   - Implemente o Radix Sort para ordenar uma lista de números inteiros. Teste-o com números de diferentes tamanhos (ex.: 2 dígitos, 5 dígitos, 10 dígitos).
   - Explique como o algoritmo lida com bases diferentes (ex.: base 10 e base 2).

10. Quick Sort
    - Implemente o Quick Sort utilizando diferentes critérios para escolha do pivô (ex.: primeiro elemento, último elemento, elemento do meio).
    - Analise o desempenho do Quick Sort em listas quase ordenadas e completamente desordenadas.

11. Ternary Search
    - Desenvolva o algoritmo Ternary Search para localizar um elemento em uma lista ordenada. Compare seu desempenho com o Binary Search.
    - Identifique situações em que o Ternary Search seria mais eficiente que o Binary Search.

12. Comparação de Algoritmos de Busca
    - Construa uma tabela comparativa dos tempos de execução de Binary Search, Interpolation Search, Jump Search e Exponential Search em listas de tamanhos diferentes.

13. Comparação de Algoritmos de Ordenação
    - Ordene a mesma lista utilizando Shell Sort, Merge Sort, Selection Sort, Quick Sort, Bucket Sort e Radix Sort. Registre os tempos de execução e número de comparações realizadas.

14. Análise de Complexidade
    - Analise a complexidade de tempo e espaço de cada algoritmo de busca e ordenação listados.

15. Busca e Ordenação em Strings
    - Adapte os algoritmos de ordenação (Merge Sort e Quick Sort) para ordenar palavras em ordem alfabética.
    - Utilize Binary Search para verificar se uma palavra específica está presente em uma lista de palavras ordenadas.

16. Aplicação Prática de Busca
    - Use o Binary Search para procurar um livro específico por ISBN em uma lista ordenada de registros de biblioteca.

17. Busca e Ordenação em Dados Reais
    - Implemente Bucket Sort para ordenar as notas de uma turma de alunos, classificadas entre 0 e 100. Em seguida, utilize o Interpolation Search para encontrar um aluno com uma nota específica.

18. Ordenação Estável e Instável
    - Identifique quais algoritmos de ordenação da lista são estáveis e explique o que isso significa. Demonstre com exemplos.

19. Análise Visual dos Algoritmos  
    - Crie gráficos para ilustrar como os algoritmos de ordenação (Merge Sort, Quick Sort, Selection Sort) reorganizam os elementos a cada etapa.

20. Desafios de Implementação
    - Crie um programa que permita ao usuário escolher um algoritmo de busca e ordenação para ordenar uma lista ou procurar um elemento, oferecendo comparações automáticas entre os métodos.