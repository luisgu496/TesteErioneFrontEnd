# 🖥️ Kotlin User App (Kotlin/JS + React)

Aplicação **Kotlin/JS + React** para o teste de front-end — cadastro simples de usuários (Nome, CPF, Telefone, Email) com validação, edição, exclusão e **persistência em `localStorage`**.

---

## 🚀 Funcionalidade
- Duas páginas (Formulário e Lista) — navegação por hash (`#/form`, `#/list`).
- Campos: Nome completo, CPF, Telefone, Email.
- Operações: Criar, Listar, Editar e Excluir.
- Validações básicas (CPF 11 dígitos, Telefone 10–11 dígitos, Email com `@`).
- Persistência local em `localStorage`, com 3 usuários iniciais.
- Estilos (SCSS) seguindo o guia de cores fornecido.
- Código em Kotlin (Kotlin/JS) usando wrappers React.

---

##  📂 Estrutura do projeto

kotlin-user-app/
├── gradle/ # Arquivos internos do Gradle  
│ └── wrapper/  
│ ├── gradle-wrapper.jar  
│ └── gradle-wrapper.properties  
│  
├── src/  
│ └── main/  
│ ├── kotlin/ # Código Kotlin do projeto  
│ │ ├── App.kt # Componente principal React  
│ │ ├── Main.kt # Ponto de entrada da aplicação  
│ │ ├── components/ # Componentes React reutilizáveis  
│ │ │ ├── Form.kt  
│ │ │ ├── UserList.kt  
│ │ │ └── UserItem.kt  
│ │ └── models/ # Modelos de dados  
│ │ └── User.kt  
│ │  
│ ├── resources/ # Arquivos estáticos  
│ │ ├── index.html  
│ │ └── styles.css  
│  
├── .gitignore # Arquivos e pastas ignorados pelo Git  
├── build.gradle.kts # Configuração do Gradle e plugins  
├── gradlew # Script Unix para rodar o Gradle Wrapper  
├── gradlew.bat # Script Windows para rodar o Gradle Wrapper  
└── README.md # Documentação do projeto  


---

## 🛠️ Como Executar Localmente

### 1️⃣ Pré-requisitos
- **Java JDK 17+**
- **Gradle**
- Navegador moderno (Chrome, Edge, Firefox...)

---

### 2️⃣ Clonar o repositório
```bash
git clone https://github.com/luisgu496/TesteErioneFrontEnd/tree/main
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

Após compilar, o Gradle abrirá automaticamente o projeto no seu navegador.

---

## 📦 Build de Produção

Para gerar os arquivos otimizados:

```bash
./gradlew jsBrowserProductionWebpack
```
Arquivos otimizados serão colocados em:

```bash
build/distributions/
```

