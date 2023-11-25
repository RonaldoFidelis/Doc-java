### DAO ###

Resumo: O DAO é um padrão de design que fornece um interface abstrata para
algum tipo de armazenamento de dados ou mecanismos de persistência (tecnologia
ou abordagem utilizada para armazenar e recuperar dados de forma duradoura,
ou seja, para persistir dados além do tempo de execução de um programa
ou aplicação. ). Ou seja, o padrão DAO isola a lógica de acesso aos dados
do restante do código.

A implementação do padrão DAO geralmente envolve a criação de uma classe que
fornece métodos CRUD (Create, Read, Update, Delete) para interagir com os dados
armazenados. Vamos explorar os principais componentes e conceitos associados
ao padrão DAO:

### Explicação detalhada (com exemplo) ###

O padrão DAO (Data Access Object) é um padrão de design que fornece uma interface abstrata para algum tipo de
armazenamento de dados ou mecanismo de persistência, como um banco de dados. O objetivo principal do padrão DAO é isolar
a lógica de acesso aos dados do restante do código, facilitando a manutenção e a substituição do mecanismo de
persistência sem afetar a lógica de negócios da aplicação.

A implementação do padrão DAO geralmente envolve a criação de uma classe que fornece métodos CRUD (Create, Read, Update,
Delete) para interagir com os dados armazenados. Vamos explorar os principais componentes e conceitos associados ao
padrão DAO:

### Componentes do Padrão DAO:

1. **Interface DAO (Data Access Object):**
    - Define uma interface ou contrato para as operações CRUD que serão realizadas no armazenamento de dados.
    - Exemplos de métodos típicos incluem `create`, `read`, `update`, `delete` e talvez métodos de consulta específicos.

   ```java
   public interface UserDao {
       User getById(int userId);
       List<User> getAll();
       void create(User user);
       void update(User user);
       void delete(int userId);
   }
   ```

2. **Classe de Implementação DAO:**
    - Fornece a implementação concreta dos métodos definidos na interface DAO.
    - Interage diretamente com o mecanismo de persistência (por exemplo, banco de dados) para realizar operações CRUD.

   ```java
   public class UserDaoImpl implements UserDao {
       @Override
       public User getById(int userId) {
           // Implementação para recuperar um usuário pelo ID
       }

       @Override
       public List<User> getAll() {
           // Implementação para recuperar todos os usuários
       }

       @Override
       public void create(User user) {
           // Implementação para criar um novo usuário
       }

       // Implementações para update e delete
   }
   ```

3. **Entidade (Modelo de Dados):**
    - Representa os dados que serão persistidos.
    - Mapeia diretamente para a estrutura da tabela no caso de bancos de dados relacionais.

   ```java
   public class User {
       private int userId;
       private String username;
       private String email;
       // ... outros atributos, getters e setters
   }
   ```

### Uso do Padrão DAO:

O uso do padrão DAO envolve a criação de instâncias da interface DAO e a chamada de seus métodos para interagir com os
dados:

```java
public class Main {
  public static void main(String[] args) {
    UserDao userDao = new UserDaoImpl();

    // Criar um novo usuário
    User newUser = new User(1, "john_doe", "john@example.com");
    userDao.create(newUser);

    // Recuperar um usuário pelo ID
    User retrievedUser = userDao.getById(1);
    System.out.println("Retrieved User: " + retrievedUser);

    // Atualizar o usuário
    retrievedUser.setEmail("john.doe@example.com");
    userDao.update(retrievedUser);

    // Recuperar todos os usuários
    List<User> allUsers = userDao.getAll();
    System.out.println("All Users: " + allUsers);

    // Excluir o usuário
    userDao.delete(1);
  }
}
```

### Vantagens do Padrão DAO:

1. **Separação de Responsabilidades:**
    - Isola a lógica de acesso aos dados da lógica de negócios, facilitando a manutenção e a compreensão do código.

2. **Reutilização de Código:**
    - Permite a reutilização dos métodos de acesso aos dados em diferentes partes da aplicação.

3. **Flexibilidade:**
    - Facilita a troca do mecanismo de persistência sem afetar a lógica de negócios. Por exemplo, você pode mudar de um
      banco de dados relacional para um banco de dados NoSQL sem modificar a lógica de negócios.

4. **Testabilidade:**
    - Torna mais fácil testar a lógica de negócios sem depender do acesso real aos dados. Mocks ou implementações de
      teste podem ser usados para simular o acesso aos dados.

### Desafios e Considerações:

1. **Manutenção de Código:**
    - À medida que a aplicação cresce, a manutenção de múltiplos DAOs pode se tornar desafiadora. Frameworks como Spring
      Data JPA ajudam a simplificar a implementação do DAO.

2. **Complexidade:**
    - Pode introduzir complexidade adicional, especialmente para operações que envolvem várias entidades e
      relacionamentos complexos.

3. **JPA e ORM:**
    - Em aplicações Java EE ou Spring, o uso de Java Persistence API (JPA) e Object-Relational Mapping (ORM) frameworks
      como Hibernate pode reduzir a necessidade de implementar manualmente classes DAO, pois eles fornecem
      funcionalidades semelhantes.

O padrão DAO é especialmente útil em cenários em que a lógica de acesso aos dados é complexa ou quando se deseja
garantir uma separação clara entre a lógica de negócios e o acesso aos dados.