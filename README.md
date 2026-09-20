![Badge de Status](https://img.shields.io/badge/status-em_desenvolvimento-yellow)
![Badge de Licença](https://img.shields.io/badge/license-MIT-blue)

---

## 📌 Sobre o Projeto

O obejetivo desse trabalho é uma elaboração de um CRUD de um gerenciador de senhas para a disciplina de Programação Desktop, produzida com a biblioteca javafx
no intuíto de produzir interfaces gráficas com interação com o usuário, afim de obter competências práticas discorridas em sala de aula par a obtenção
de nota. Sua finalidade é adquirir conhecimentos por produção de interfaces usando javafx e sua integração com o usuário no quesito de criar, listar,
atualizar e deletar possibilitando um panorama aplicável do uso da linguagem JAVA. Em suma O **Gerenciador de Senhas** é uma aplicação desktop desenvolvida
em Java que permite ao utilizador realizar a gestão completa (CRUD) das suas credenciais. O sistema resolve o problema de memorização de múltiplas palavras-passe,
oferecendo também uma funcionalidade para a geração automática de combinações fortes e aleatórias.


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
- **Interface Gráfica:** Java Swing / AWT
- **Ambiente de Desenvolvimento:** Eclipse IDE
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
- [Eclipse IDE](https://www.eclipse.org/downloads/) configurado.

### Passo a Passo

1. Clone o repositório ou importe o projeto no Eclipse:
   ```bash
   git clone [https://github.com/seu-usuario/Gerenciador-de-Senhas.git](https://github.com/seu-usuario/Gerenciador-de-Senhas.git)