# Programação Orientada a Objetos (POO) e Modificadores de Acesso em Java

## Sumário

1. [Introdução à POO](#introdução-à-poo)
2. [Conceitos Principais da POO](#conceitos-principais-da-poo)
    - [Classe](#classe)
    - [Objeto](#objeto)
    - [Herança](#herança)
    - [Polimorfismo](#polimorfismo)
    - [Encapsulamento](#encapsulamento)
    - [Abstração](#abstração)
3. [Modificadores de Acesso em Java](#modificadores-de-acesso-em-java)
    - [public](#public)
    - [protected](#protected)
    - [default (package-private)](#default-package-private)
    - [private](#private)
4. [Exemplo Prático](#exemplo-prático)

## Introdução à POO

A Programação Orientada a Objetos (POO) é um paradigma de programação que utiliza "objetos" para representar dados e métodos. Objetos são instâncias de classes, que podem ser consideradas como moldes ou estruturas que definem o comportamento e estado dos objetos.

## Conceitos Principais da POO

### Classe

Uma classe é uma blueprint (ou plano) para criar objetos. Ela define um conjunto de atributos e métodos que os objetos criados a partir dela terão.

```java
public class Carro {
    String marca;
    String modelo;
    int ano;

    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```

### Objeto

Um objeto é uma instância de uma classe. Quando a classe é definida, nenhum espaço de memória é alocado até que os objetos sejam instanciados.

```java
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2021;
        meuCarro.acelerar();
    }
}
```

### Herança

Herança é um mecanismo pelo qual uma classe (subclasse) pode herdar atributos e métodos de outra classe (superclasse).

```java
public class Veiculo {
    String cor;
    void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

public class Bicicleta extends Veiculo {
    int numeroDeMarchas;
}
```

### Polimorfismo

Polimorfismo permite que objetos de diferentes classes sejam tratados como objetos de uma classe comum. Existem duas formas principais de polimorfismo: sobrecarga de métodos e sobrescrita de métodos.

```java
public class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

public class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Saída: O cachorro late.
    }
}
```

### Encapsulamento

Encapsulamento é o princípio de esconder os detalhes internos de um objeto e permitir acesso apenas através de métodos públicos.

```java
public class ContaBancaria {
    private double saldo;

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

### Abstração

Abstração é o conceito de esconder os detalhes complexos e mostrar apenas as funcionalidades essenciais de um objeto.

```java
public abstract class Forma {
    abstract void desenhar();
}

public class Circulo extends Forma {
    @Override
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}
```

## Modificadores de Acesso em Java

Os modificadores de acesso controlam a visibilidade dos membros de uma classe (atributos e métodos) e das próprias classes.

### `public`

- **Visibilidade:** Acessível de qualquer lugar.
- **Uso:** Pode ser usado para classes, métodos e atributos.

```java
public class ExemploPublic {
    public int atributoPublico;
    public void metodoPublico() {
        System.out.println("Método público.");
    }
}
```

### `protected`

- **Visibilidade:** Acessível dentro do mesmo pacote e em subclasses.
- **Uso:** Pode ser usado para métodos e atributos, mas não para classes (exceto classes internas).

```java
public class ExemploProtected {
    protected int atributoProtegido;
    protected void metodoProtegido() {
        System.out.println("Método protegido.");
    }
}
```

### `default` (package-private)

- **Visibilidade:** Acessível apenas dentro do mesmo pacote.
- **Uso:** Este é o modificador padrão quando nenhum outro é especificado. Pode ser usado para classes, métodos e atributos.

```java
class ExemploDefault {
    int atributoDefault;
    void metodoDefault() {
        System.out.println("Método default.");
    }
}
```

### `private`

- **Visibilidade:** Acessível apenas dentro da própria classe.
- **Uso:** Pode ser usado para métodos e atributos, mas não para classes (exceto classes internas).

```java
public class ExemploPrivate {
    private int atributoPrivado;
    private void metodoPrivado() {
        System.out.println("Método privado.");
    }
}
```

## Exemplo Prático

```java
package meu.pacote;

public class Exemplo {
    public int atributoPublico;
    protected int atributoProtegido;
    int atributoDefault;
    private int atributoPrivado;

    public void metodoPublico() {
        System.out.println("Método público.");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido.");
    }

    void metodoDefault() {
        System.out.println("Método default.");
    }

    private void metodoPrivado() {
        System.out.println("Método privado.");
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        // Acessando todos os métodos
        exemplo.metodoPublico();    // Válido
        exemplo.metodoProtegido();  // Válido
        exemplo.metodoDefault();    // Válido
        // exemplo.metodoPrivado(); // Inválido, método privado
    }
}
```

Neste exemplo:

- `atributoPublico` e `metodoPublico` podem ser acessados de qualquer lugar.
- `atributoProtegido` e `metodoProtegido` podem ser acessados dentro do mesmo pacote e por subclasses.
- `atributoDefault` e `metodoDefault` só podem ser acessados dentro do mesmo pacote.
- `atributoPrivado` e `metodoPrivado` só podem ser acessados dentro da própria classe `Exemplo`.

## Considerações Finais

A compreensão e o uso adequado dos modificadores de acesso são essenciais para implementar o encapsulamento e manter a integridade e segurança dos dados em uma aplicação Java. Eles ajudam a controlar a visibilidade e acessibilidade dos componentes do seu código, promovendo um design mais robusto e modular.
