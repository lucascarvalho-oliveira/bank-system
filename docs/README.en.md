<p align="center">
  <a href="../README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Bank System (Java)

Study project developed in Java with a focus on Object-Oriented Programming (OOP) and layered architecture.

## Objective

Simulate a simple banking system, applying concepts of:

* Object-Oriented Programming (OOP)
* Encapsulation
* Abstraction
* Separation of responsibilities
* Layered architecture (Controller, Service, Repository, Model)

This project is not focused on production, but rather on learning and practicing software architecture in Java.

---

##Applied concepts

* Classes and objects
* Inheritance and polymorphism (Person PF / PJ)
* Encapsulation of business rules
* Data validation (CPF, CNPJ, Password)
* Layered structure:

  * Model (entities)
  * Service (business rules)
  * Controller (system flow)
  * Repository (in-memory storage)

---

## Project structure

```
src/
 ├── app/
 │    └── Main.java
 │
 ├── controller/
 │    ├── ContaController.java
 │    └── PessoaController.java
 │
 ├── model/
 │    ├── Conta.java
 │    ├── Pessoa.java
 │    ├── PessoaPF.java
 │    ├── PessoaPJ.java
 │    ├── CPF.java
 │    ├── CNPJ.java
 │    └── Senha.java
 │
 ├── service/
 │    ├── ContaService.java
 │    ├── PessoaService.java
 │    └── SenhaService.java
 │
 └── repository/
      └── PessoaRepository.java
```

---

## Features

* Registration of individuals and companies
* Bank account creation
* CPF and CNPJ validation
* Password validation with basic rules
* Basic account operations (depending on implementation)

---

## Business rules

* Password must have at least 8 characters
* Password must contain at least 1 special character
* CPF and CNPJ have specific validations
* Data stored in memory (no database)

---

## How to run

1. Clone the repository:

```bash
git clone https://github.com/lucascarvalho-oliveira/bank-system.git
```

2. Open the project in a Java IDE (IntelliJ, Eclipse or VS Code)

3. Run the class:

```
src/app/Main.java
```

---

## Project limitations

* No database usage
* No data persistence
* No REST API
* No concurrency or real transaction simulation

---

## Learning purpose

This project was created to practice:

* Java project structure
* Layered architecture
* Applied programming logic
* OOP best practices

---

## Author

Developed by Lucas Carvalho as part of studies in Systems Analysis and Development (ADS).
