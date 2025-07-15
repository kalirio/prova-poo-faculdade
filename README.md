# Sistema de Gestão de Mídias Digitais

Este projeto é a implementação de um sistema para gerenciar diferentes tipos de mídias em uma biblioteca digital, desenvolvido como parte da avaliação de Programação Orientada a Objetos (POO) da faculdade. O programa demonstra o uso de conceitos fundamentais de POO, como encapsulamento, herança, polimorfismo, métodos construtores e atributos estáticos.

---

## Requisitos do Projeto (Prova Prática)

### 1. Classe Base: Mídia
Crie uma classe `Midia` com os seguintes atributos:
* `titulo` (String): obrigatório.
* `autor` (String): obrigatório.
* `anoPublicacao` (int): obrigatório.
* `numeroMidias` (static int): um atributo estático que mantém a contagem total de mídias cadastradas.

**Métodos:**
* Um construtor que inicializa todos os atributos obrigatórios e incrementa `numeroMidias`.
* Métodos `get` e `set` para cada atributo (exceto `numeroMidias`, que será apenas para leitura).
* Um método chamado `exibirInformacoes()` que exibe todos os dados da mídia.

### 2. Classes Derivadas:
Crie duas subclasses de `Midia`:

#### Livro:
* **Atributo adicional:** `numeroPaginas` (int): obrigatório.
* Sobrescreve o método `exibirInformacoes()` para incluir `numeroPaginas`.

#### Filme:
* **Atributo adicional:** `duracaoMinutos` (int): obrigatório.
* Sobrescreve o método `exibirInformacoes()` para incluir `duracaoMinutos`.

### 3. Classe Principal: BibliotecaDigital
Crie uma classe principal para permitir que o usuário gerencie as mídias na biblioteca digital. O programa deve ter as seguintes funcionalidades:
* **Cadastrar mídia:** O usuário escolhe entre Livro ou Filme e insere os dados necessários.
* **Alterar dados de uma mídia:** O usuário pode alterar as informações de uma mídia específica pelo seu título.
* **Excluir mídia:** O usuário pode remover uma mídia pelo título.
* **Consultar mídias:** O programa exibe a lista de todas as mídias cadastradas e as informações de cada uma.
* **Exibir total de mídias registradas:** Mostra a contagem de mídias usando o atributo estático `numeroMidias`.
* O programa deve ser executado em um loop até o usuário optar por sair.

---

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Ambiente de Desenvolvimento:** Eclipse

---
