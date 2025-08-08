# 🖥️ Kotlin User App

Aplicação **Fullstack Kotlin + React** (Kotlin/JS) para gerenciamento de usuários, com funcionalidades de **CRUD** (Criar, Listar, Editar e Excluir) e execução diretamente no navegador.

---

## 🚀 Tecnologias Utilizadas
- **Kotlin/JS (IR Compiler)** — Desenvolvimento front-end em Kotlin compilado para JavaScript.
- **React** — Biblioteca para construção de interfaces interativas.
- **Gradle** — Automação de build e gerenciamento de dependências.
- **Webpack** — Empacotamento e otimização do código para o navegador.

---

## 📋 Funcionalidades
- Cadastro de usuários com validação.
- Listagem de usuários cadastrados.
- Edição de dados de usuários.
- Exclusão de registros.
- Interface amigável e responsiva.

---

## 📂 Estrutura do Projeto

kotlin-user-app/   
├── gradle/ # Arquivos internos do Gradle   
│ └── wrapper/   
│ ├── gradle-wrapper.jar   
│ └── gradle-wrapper.properties   
│   
├── src/ main/ kotlin/ app/  # Código Kotlin do projeto    
│   ├── Main.kt # Ponto de entrada da aplicação   
│   ├── FormPage.kt  
│   └── List Page.kt   
│   
├── build.gradle.kts # Configuração do Gradle e plugins   
├── settings.gradle.kts  
├── index.html  
├── gradlew # Script Unix para rodar o Gradle Wrapper     
├── gradlew.bat # Script Windows para rodar o Gradle Wrapper   
├── styles.scss  
└── README.md # Documentação do projeto   


---

## 🛠️ Como Executar Localmente

### 1️⃣ Pré-requisitos
- **Java JDK 17+**
- **Gradle** (opcional, pois o wrapper `gradlew` já está incluso)
- Navegador moderno (Chrome, Edge, Firefox...)

---

### 2️⃣ Clonar o repositório
```bash
git clone https://github.com/seu-usuario/kotlin-user-app.git
cd kotlin-user-app
```
---

### 3️⃣ Limpar e preparar o projeto
```bash
./gradlew clean
```
---

### 4️⃣ Rodar o projeto no navegador
```bash
./gradlew jsBrowserDevelopmentRun
```
---

## 📦 Build de Produção

Para gerar os arquivos otimizados:
```bash
./gradlew jsBrowserProductionWebpack
```

Os arquivos finais estarão na pasta:
```bash
build/distributions/
```
---

## 
