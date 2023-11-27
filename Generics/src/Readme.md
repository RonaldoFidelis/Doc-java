Em Java, generics é uma característica introduzida na versão 5.0 (J2SE 5.0), que permite que classes e métodos operem
com tipos de dados de maneira mais flexível e segura em relação a tipos. A principal vantagem de usar generics é a
detecção de erros de tipo em tempo de compilação, o que ajuda a evitar bugs relacionados a tipos em tempo de execução.

Aqui estão alguns conceitos e aspectos importantes relacionados a generics em Java:

1. **Declaração de Classes e Métodos Genéricos:**
    - **Classes Genéricas:** Uma classe genérica é declarada com um ou mais parâmetros de tipo, representados por nomes
      de tipo entre colchetes `< >`. Exemplo:

      ```java
      public class Caixa<T> {
          private T conteudo;
 
          // construtor, métodos, etc.
      }
      ```

    - **Métodos Genéricos:** Métodos também podem ser genéricos, permitindo que a tipagem seja especificada ao nível do
      método. Exemplo:

      ```java
      public <T> T obterConteudo(Caixa<T> caixa) {
          return caixa.getConteudo();
      }
      ```

2. **Uso de Tipos Genéricos:**
    - **Instanciação de Classes Genéricas:** Ao criar uma instância de uma classe genérica, você fornece o tipo de
      argumento entre os colchetes. Exemplo:

      ```java
      Caixa<Integer> caixaDeInteiro = new Caixa<>();
      Caixa<String> caixaDeString = new Caixa<>();
      ```

    - **Chamada de Métodos Genéricos:** Ao chamar métodos genéricos, o tipo de argumento pode ser inferido
      automaticamente ou especificado explicitamente. Exemplo:

      ```java
      Integer conteudoInteiro = obterConteudo(caixaDeInteiro);
      String conteudoString = obterConteudo(caixaDeString);
      ```

3. **Curingas (Wildcards):**
    - Curingas permitem maior flexibilidade ao trabalhar com tipos genéricos. O curinga `?` representa um tipo
      desconhecido e pode ser usado em lugares onde o tipo exato não é importante.

      ```java
      public void imprimirConteudo(Caixa<?> caixa) {
          System.out.println(caixa.getConteudo());
      }
      ```

4. **Restrições e Bounded Wildcards:**
    - É possível impor restrições nos tipos genéricos usando bounded wildcards. Por exemplo, `<? extends Number>`
      significa "qualquer tipo que seja uma subclasse de Number".

      ```java
      public void processarNumeros(Caixa<? extends Number> caixaNumeros) {
          // operações com números
      }
      ```

5. **Erasure (Apagamento de Tipo):**
    - Em tempo de execução, as informações sobre tipos genéricos são apagadas (erasure). O Java usa esse conceito para
      manter a compatibilidade com versões mais antigas que não possuíam generics. Isso significa que, em tempo de
      execução, as instâncias de classes genéricas não têm informações sobre os tipos de parâmetros de tipo usados.

6. **Vantagens:**
    - **Segurança de Tipos:** A principal vantagem é a detecção de erros de tipo em tempo de compilação, proporcionando
      maior segurança no uso de tipos.
    - **Reusabilidade de Código:** Código genérico é mais flexível e pode ser reutilizado para diferentes tipos de
      dados.

Em resumo, generics em Java fornecem uma maneira poderosa de tornar o código mais flexível e seguro em relação a tipos.
Permite criar classes e métodos que podem ser utilizados com diferentes tipos de dados, enquanto a detecção de erros em
tempo de compilação ajuda a evitar problemas relacionados a tipos em tempo de execução.