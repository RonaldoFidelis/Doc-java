A Java Stream API foi introduzida no Java 8 para oferecer uma maneira mais expressiva e funcional de lidar com operações
em coleções de dados. Ela permite que os desenvolvedores realizem operações de processamento de dados de maneira concisa
e eficiente, utilizando uma abordagem funcional e de alto nível. Vamos explorar os conceitos e características
importantes da Stream API:

### Conceitos Básicos:

1. **Stream:**
    - Uma Stream em Java é uma sequência de elementos que pode ser processada de forma sequencial ou paralela.
    - Não é uma estrutura de dados, mas sim uma sequência de dados que pode ser manipulada.
    - As operações em uma Stream podem ser executadas em um pipeline, onde o resultado de uma operação é a entrada para
      a próxima.

2. **Operações Intermediárias e Terminais:**
    - As operações em uma Stream podem ser divididas em duas categorias: operações intermediárias e terminais.
    - Operações intermediárias processam a Stream e retornam uma nova Stream, permitindo que você encadeie várias
      operações. Exemplos: `filter`, `map`, `distinct`.
    - Operações terminais produzem um resultado ou um efeito colateral. Exemplos: `collect`, `forEach`, `count`.

### Exemplo Básico:

```java
List<String> lista=Arrays.asList("java","python","c++","javascript");

        long count=lista.stream()
        .filter(s->s.length()>3)
        .count();

        System.out.println(count); // Saída: 3
```

Neste exemplo, a `Stream` é criada a partir de uma lista de strings. A operação `filter` filtra os elementos com
comprimento maior que 3, e a operação `count` retorna o número de elementos que atendem ao critério.

### Características Principais:

1. **Operações de Filtragem e Mapeamento:**
    - `filter`: Filtra os elementos com base em uma condição.
    - `map`: Transforma cada elemento usando uma função.

2. **Operações de Redução:**
    - `reduce`: Combina os elementos para produzir um resultado. Pode ser usado para soma, multiplicação, concatenação,
      etc.

3. **Operações de Ordenação:**
    - `sorted`: Ordena os elementos da Stream.

4. **Operações de Coletor:**
    - `collect`: Converte os elementos da Stream em uma coleção ou outro tipo de resultado.

5. **Operações de Agrupamento e Particionamento:**
    - `groupingBy`: Agrupa os elementos com base em uma função.
    - `partitioningBy`: Particiona os elementos em dois grupos com base em uma condição booleana.

6. **Operações de Iteração e Verificação:**
    - `forEach`: Executa uma ação para cada elemento da Stream.
    - `anyMatch`, `allMatch`, `noneMatch`: Verifica se algum, todos ou nenhum elemento atende a uma condição.

### Streams Paralelas:

- Uma das características mais poderosas da Stream API é a capacidade de realizar operações de forma paralela.
- A criação de uma Stream paralela é tão simples quanto chamar o método `parallel()` em uma Stream existente.

```java
long count=lista.parallelStream()
        .filter(s->s.length()>3)
        .count();
```

### Considerações Finais:

- **Imutabilidade:** Streams são geralmente imutáveis; cada operação cria uma nova Stream em vez de modificar a
  original.

- **Lazy Evaluation:** As operações em uma Stream são avaliadas apenas quando necessário, permitindo a otimização de
  recursos.

- **Compatibilidade Funcional:** A Stream API é projetada para trabalhar bem com expressões lambda, interfaces
  funcionais e métodos de referência.

A Stream API é uma ferramenta poderosa que simplifica e melhora o código relacionado ao processamento de coleções em
Java, proporcionando maior expressividade e possibilitando a paralelização eficiente de operações.