<p align="center">
  <a href="./README.en.md">
    <img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge">
  </a>
</p>

# Bank System (Java)

Projeto de estudo desenvolvido em Java com foco em Programação Orientada a Objetos (POO) e estruturação em camadas.

## Objetivo

Simular um sistema bancário simples, aplicando conceitos de:

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Abstração
* Separação de responsabilidades
* Estrutura em camadas (Controller, Service, Repository, Model)

Este projeto não tem foco em produção, mas sim em aprendizado e prática de arquitetura de software em Java.

---

##  Conceitos aplicados

* Classes e objetos
* Herança e polimorfismo (Pessoa PF / PJ)
* Encapsulamento de regras de negócio
* Validação de dados (CPF, CNPJ, Senha)
* Organização em camadas:

  * Model (entidades)
  * Service (regras de negócio)
  * Controller (fluxo do sistema)
  * Repository (armazenamento em memória)

---

## 📁 Estrutura do projeto

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

## Funcionalidades

* Cadastro de pessoas físicas e jurídicas
* Criação de contas bancárias
* Validação de CPF e CNPJ
* Validação de senha com regras básicas
* Operações básicas de conta (dependendo da implementação)

---

## Regras de negócio

* Senha deve ter no mínimo 8 caracteres
* Senha deve conter pelo menos 1 símbolo
* CPF e CNPJ possuem validações específicas
* Estrutura de dados armazenada em memória (sem banco de dados)

---

## Como executar

1. Clone o repositório:

```bash
git clone https://github.com/lucascarvalho-oliveira/bank-system.git
```

2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

3. Execute a classe:

```
src/app/Main.java
```

---

## Limitações do projeto

* Não utiliza banco de dados
* Não possui persistência de dados
* Não possui API REST
* Não simula concorrência ou transações reais

---

## Objetivo de aprendizado

Este projeto foi criado para praticar:

* Estruturação de projetos Java
* Organização em camadas
* Lógica de programação aplicada
* Boas práticas de POO

---

## 👨‍💻 Autor

Desenvolvido por Lucas Carvalho como parte de estudos em Análise e Desenvolvimento de Sistemas (ADS).
