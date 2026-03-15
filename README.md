# Sistema de Cadastro de Alunos

Aplicação Spring Boot com Thymeleaf para gerenciamento e cadastro de alunos.

## Tecnologias

Java
Thymeleaf  
Maven  
Bean Validation (Jakarta Validation)

## Como Executar

### Pré-requisitos

Java 21 instalado  
Maven instalado (ou usar o wrapper ./mvnw)

### Executando

```bash
# Usando Maven Wrapper
./mvnw spring-boot:run

# Ou usando Maven instalado
mvn spring-boot:run
```

A aplicação será iniciada na porta 8080.

## URLs Disponíveis

| URL | Método | Descrição |
|-----|-------|-----------|
| /alunos | GET | Listar todos os alunos |
| /alunos/novo | GET | Formulário para cadastrar novo aluno |
| /alunos/editar/{id} | GET | Formulário para editar aluno |
| /alunos/salvar | POST | Salvar aluno (criar/atualizar) |
| /alunos/excluir/{id} | POST | Excluir aluno |

## Estrutura do Projeto

```
com.biopark.alunos/
├── CadastroAlunosApplication.java    # Classe principal
├── controller/
│   └── AlunoController.java          # Controlador MVC
├── service/
│   └── AlunoService.java             # Regras de negócio
├── repository/
│   └── AlunoRepository.java          # Armazenamento em memória
└── model/
    └── Aluno.java                    # Entidade Aluno
```

## Funcionalidades

- Criar, editar e excluir alunos.
- Listagem de alunos cadastrados.
- Validação de formulários.
- Interface web utilizando Thymeleaf.
- Estilização com CSS customizado.

## Interface

A aplicação possui:

- Página de listagem de alunos
- Formulário para cadastro e edição
- Botões de ação para editar e excluir

## Autor

Projeto desenvolvido para fins acadêmicos.
Eduardo Lemos.