Em Java, uma interface pode conter métodos e também variáveis (constantes), mas não pode conter implementações de métodos. Uma interface é uma coleção de assinaturas de métodos abstratos e constantes (variáveis finais) que uma classe pode implementar.

A partir do Java 8, interfaces podem ter métodos com implementações padrão (default methods) e métodos estáticos, o que permite adicionar funcionalidades a interfaces sem quebrar a compatibilidade com as classes que as implementam. Os métodos padrão são implementações fornecidas na interface, enquanto os métodos estáticos são métodos associados à interface, mas não dependem de uma instância específica da interface.

Aqui está um exemplo simples de uma interface em Java:

```java
public interface MinhaInterface {
    // Método abstrato (sem implementação)
    void metodoAbstrato();

    // Método com implementação padrão (default method)
    default void metodoComImplementacaoPadrao() {
        System.out.println("Implementação padrão");
    }

    // Método estático
    static void metodoEstatico() {
        System.out.println("Método estático");
    }

    // Constante (variável final)
    int MINHA_CONSTANTE = 42;
}
```

Observe que, se uma classe implementar essa interface, ela deve fornecer uma implementação para o método abstrato `metodoAbstrato`. Ela pode optar por fornecer uma implementação diferente para o método com implementação padrão, mas não é obrigatória. Os métodos estáticos podem ser chamados diretamente na interface, sem criar uma instância da mesma.