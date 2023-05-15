## REST REPOSITORY
```
ficou faltando essa dependencia, mas não sabemos se será necessário
```

# Crud - Create Read Update Delete
```
id
nome
quantidade
valor
urlProduto

C - POST -> PostMapping
R - GET -> GetMapping
U - PUT -> PutMapping
D - DELETE -> DeleteMapping
```

# application.properties

spring.jpa.hibernate.ddl-auto=update -> se não tiver banco, ele cria

@Column -> para personalizar o comportamento da coluna

# Jpa -> faz a persistência do banco de dados
```
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>


<Entidade, qual o tipo da tua chave primária>
```

# Controller -> porta de entrada da minha aplicação