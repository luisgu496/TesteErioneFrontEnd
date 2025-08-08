
Kotlin/JS React - Cadastro de Usuários
=====================================

Projeto Kotlin/JS + React que implementa o teste de frontend:
- Formulário com Nome, CPF, Telefone, Email
- Lista com criar, editar, excluir
- Persistência em localStorage com 3 usuários iniciais
- Estilos via SCSS (arquivo styles.scss)
- Uso de Kotlin/JS (multiplatform target JS IR)

Importante: O zip inclui o código fonte. Para rodar você precisa do Gradle wrapper. Se não houver gradlew no zip, rode `gradle wrapper` localmente (é simples). As instruções abaixo assumem que você possui o Gradle wrapper ou o Gradle instalado.

Executando (recomendado com Gradle wrapper)
1. Abra um terminal na pasta do projeto.
2. Geração do build de desenvolvimento:
   - Unix/macOS:
     ./gradlew jsBrowserDevelopmentRun
   - Windows:
     gradlew.bat jsBrowserDevelopmentRun
3. Abra o navegador em http://localhost:8080

Gerar build de produção:
./gradlew jsBrowserProductionWebpack
Os artefatos ficarão em build/distributions (inclui index.html e Kotlin JS bundle).

Se você preferir, posso gerar também um ZIP com o Gradle wrapper incluso (gradlew + gradle/wrapper + jar). Peça se quiser.
