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

kotlinjs_user_app/  
├── build.gradle.kts # Configuração Gradle (Kotlin Multiplatform / JS)  
├── settings.gradle.kts # Nome do root project  
├── index.html # Página principal (carrega bundle gerado)  
├── styles.scss # Estilos (SCSS) — importável no build  
├── src/  
│ └── main/  
│ └── kotlin/  
│ └── app/  
│ ├── Main.kt # Ponto de entrada  
│ ├── FormPage.kt # Componente do formulário  
│ └── ListPage.kt # Componente de listagem  
└── README.md # (este arquivo — documentação)  

---

## 🔧 Pré-requisitos
- **Java JDK 17+** (obrigatório)
- **Gradle** (opcional — se não tiver, você pode gerar o *wrapper* local com `gradle wrapper`)
- Navegador moderno (Chrome, Edge, Firefox)

---

## 🚀 Como executar (modo recomendado — usando Gradle)

1. Abra o terminal na raiz do projeto (`kotlinjs_user_app/`).

---

2. (Opcional — só se você não tiver o wrapper) Gere o wrapper:
```bash
gradle wrapper
```

---

3. Limpe (opcional, mas recomendado):
```bash
# Windows (PowerShell / CMD)
gradlew.bat clean
```

---

4. Rode em modo de desenvolvimento:


Se o seu build estiver baseado no plugin antigo kotlin("js"):
```bash
./gradlew jsBrowserDevelopmentRun
```

Se o seu build estiver configurado como Kotlin Multiplatform (js target):
```bash
./gradlew browserDevelopmentRun
```

Após compilar, o terminal geralmente informa o endereço (por exemplo http://localhost:8080 ou http://localhost:5173) — abra esse endereço no navegador.

---

## 📦 Gerar build de produção

# geração do bundle otimizado
```bash
./gradlew jsBrowserProductionWebpack
```

Arquivos otimizados serão colocados em:
```bash
build/distributions/
```
Você pode então servir esses arquivos com qualquer servidor estático (Nginx, Apache, etc.).

---

## 📜 Licença

Licenciado sob a MIT License 

---

## ✍ Autor
Desenvolvido por Luis Gustavo Ferreira Leite  🚀
