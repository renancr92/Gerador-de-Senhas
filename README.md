
## 📌 Sobre o Projeto

O objetivo desse trabalho é uma elaboração de um CRUD sobre um gerenciador de senhas para a disciplina de Programação Desktop, produzida em JavaFX, um conjunto de 
ferramentas e uma biblioteca (framework) para da linguagem Java usada para criar interfaces gráficas de usuário (GUI) modernas em aplicativos de desktop. 
Com finalidade de obter competências práticas discorridas em sala de aula para obtenção de nota. Competênicas essas que seriam adquirir conhecimentos usando javafx e sua integração 
com o usuário no quesito de criar, listar, atualizar e deletar, possibilitando um panorama aplicável do uso da linguagem JAVA em interfaces. Em suma O **Gerenciador de Senhas** 
é uma aplicação desktop desenvolvida em Javafx que permite ao utilizador realizar a gestão completa (CRUD) das suas credenciais. O sistema resolve o problema de memorização de 
múltiplas palavras-passe, oferecendo também uma funcionalidade para a geração automática de combinações fortes e aleatórias.


## 🚀 Funcionalidades

As funcionalides do projeto incluem:

- [x] **Criar (Create):** Registo de novas credenciais (serviço/site, nome de utilizador e palavra-passe).
- [x] **Listar (Read):** Visualização de todas as senhas guardadas.
- [x] **Atualizar (Update):** Edição das informações de acessos existentes.
- [x] **Remover (Delete):** Eliminação de credenciais que já não são necessárias.
- [x] **Gerador de Senhas:** Criação automática de palavras-passe fortes e aleatórias.
- [x] **Interface Gráfica (GUI):** Navegação simples e intuitiva através da `TelaPrincipal`.

---

## 🛠️ Tecnologias Utilizadas

As teconologias presentes no desenvolvimento são:

- **Linguagem:** Java (JDK 8 ou superior)
- **Interface Gráfica:** Javafx
- **Ambiente de Desenvolvimento:** Eclipse IDE, VS code etc
- **Controlo de Versões:** Git & GitHub

## 🏗️ Estrutura do Código

A arquitetura do projeto está organizada no pacote `gerenciadorDesenhas` com os seguintes módulos principais:

* `Senha.java`: Classe modelo (Entity) que representa os dados da credencial.
* `GeradorSenha.java`: Lógica responsável pela geração de combinações de senhas aleatórias.
* `TelaPrincipal.java`: Interface gráfica do utilizador para interação com o sistema.
* `App.java` / `Main.java`: Ponto de entrada (Entry Point) da aplicação.


## 📂 Como Executar o Projeto

### Pré-requisitos
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado.
- [Eclipse IDE](https://www.eclipse.org/downloads/), VS code configurado e instalado.

### Passo a Passo

1. Clone o repositório ou importe o projeto no Eclipse, VS code:
   ```bash
   git clone https://github.com/renancr92/Gerenciador-de-Senhas.git