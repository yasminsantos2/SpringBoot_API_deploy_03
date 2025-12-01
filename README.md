<div align="center">

<h1>🩺 <strong>VollMed API – Plataforma Clínica | Spring Boot 3</strong></h1>

<p>
API RESTful corporativa desenvolvida em <strong>Java 17 + Spring Boot 3</strong>, 
seguindo princípios profissionais aprendidos nos cursos de especialização:
</p>

<p>
<strong>✔ API RESTful • ✔ Boas práticas • ✔ Segurança com JWT • ✔ SOLID • ✔ Flyway • ✔ OpenAPI • ✔ Testes Automatizados • ✔ Deploy</strong>
</p>

<br>

<img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge">
<img src="https://img.shields.io/badge/Spring_Boot-3.0.0-darkgreen?style=for-the-badge">
<img src="https://img.shields.io/badge/MySQL-8.0-orange?style=for-the-badge">
<img src="https://img.shields.io/badge/JWT-Security-red?style=for-the-badge">
<img src="https://img.shields.io/badge/Flyway-Migrations-yellow?style=for-the-badge">
<img src="https://img.shields.io/badge/OpenAPI-Swagger-purple?style=for-the-badge">

</div>

<hr>

<h2>📌 <strong>Sobre o Projeto</strong></h2>

<p>
A <strong>VollMed API</strong> é uma aplicação corporativa desenvolvida durante a formação 
<strong>Java + Spring Boot</strong>.  
Ela representa um backend profissional utilizado em ambientes reais para gestão clínica: médicos, pacientes, consultas e autenticação de usuários.
</p>

<p>Este projeto demonstra habilidades avançadas de backend, como:</p>

<ul>
<li>Arquitetura limpa com separação de camadas</li>
<li>Uso correto do protocolo HTTP</li>
<li>Autenticação e autorização com JWT</li>
<li>Documentação automática com OpenAPI/Swagger</li>
<li>Versionamento de banco com Flyway</li>
<li>Testes automatizados com Spring Test + Security Test</li>
<li>Preparação para deploy com profiles e variáveis de ambiente</li>
</ul>

<hr>

<h2>🏗 <strong>Arquitetura da Aplicação</strong></h2>

<pre>
Cliente → Controller → Service/Domain → Repository → MySQL
                      ↓
                Security + JWT
</pre>

<p>A organização segue padrões usados em empresas:</p>

<ul>
<li><strong>controller/</strong> — Entrada de requisições REST</li>
<li><strong>domain/</strong> — Regras de negócio, DTOs, entidades</li>
<li><strong>infra/</strong> — Segurança, JWT, configurações</li>
<li><strong>db/migration/</strong> — Scripts SQL versionados pelo Flyway</li>
</ul>

<hr>

<h2>🗄 <strong>Banco de Dados</strong></h2>

<p>
O projeto utiliza <strong>MySQL</strong>.  
Para iniciar, basta criar o banco:
</p>

<pre>
CREATE DATABASE vollmed_api3;
</pre>

<p>
O Flyway criará automaticamente todas as tabelas ao subir a aplicação.
</p>

<hr>

<h2>⚙ <strong>Configuração da Aplicação</strong></h2>

<p>Arquivo <code>application.properties</code>:</p>

<pre>
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api3
spring.datasource.username=root
spring.datasource.password=SENHA_AQUI

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.error.include-stacktrace=never

api.security.token.secret=${JWT_SECRET:12345678}

server.port=8081
</pre>

<hr>

<h2>▶ <strong>Como Rodar o Projeto</strong></h2>

<h3>1️⃣ Requisitos</h3>

<ul>
<li>Java 17 instalado</li>
<li>MySQL rodando</li>
<li>Porta 8081 livre</li>
</ul>

<h3>2️⃣ Rodando pela primeira vez</h3>

<p>O projeto já possui Maven Wrapper, então não precisa instalar Maven.</p>

<h4>Windows (PowerShell ou CMD):</h4>

<pre>
.\mvnw spring-boot:run
</pre>

<h4>Linux / Mac:</h4>

<pre>
./mvnw spring-boot:run
</pre>

<p>API iniciará em:</p>

<pre>
http://localhost:8081
</pre>

<hr>

<h2>🔐 <strong>Autenticação com JWT</strong></h2>

<h3>1️⃣ Login</h3>

<pre>
POST /login
Content-Type: application/json
</pre>

<h4>Body:</h4>

<pre>
{
  "login": "usuario@email.com",
  "senha": "123456"
}
</pre>

<h4>Resposta:</h4>

<pre>
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5..."
}
</pre>

<h3>2️⃣ Acesso a rotas protegidas</h3>

<pre>
Authorization: Bearer SEU_TOKEN_AQUI
</pre>

<hr>

<h2>📘 <strong>Swagger / OpenAPI</strong></h2>

<p>A documentação da API é gerada automaticamente:</p>

<pre>
http://localhost:8081/swagger-ui/index.html
</pre>

<p>Inclui:</p>

<ul>
<li>descrição de endpoints</li>
<li>modelos de entrada e saída</li>
<li>testes via interface web</li>
</ul>

<hr>

<h2>🧪 <strong>Build e Testes</strong></h2>

<h3>Gerar build:</h3>

<pre>
.\mvnw clean package
</pre>

<h3>Rodar testes:</h3>

<pre>
.\mvnw test
</pre>

<h3>Rodar o JAR gerado:</h3>

<pre>
java -jar target/api-0.0.1-SNAPSHOT.jar
</pre>

<hr>

<h2>🎓 <strong>Conteúdos abordados (da formação)</strong></h2>

<ul>
<li><strong>API RESTful</strong> — controle de requisições, respostas, verbos HTTP</li>
<li><strong>Boas práticas corporativas</strong> — validação, paginação, versionamento</li>
<li><strong>Autenticação JWT</strong> — filtros, tokens, refresh</li>
<li><strong>SOLID</strong> — separação de responsabilidades</li>
<li><strong>Flyway</strong> — versionamento de scripts SQL</li>
<li><strong>Swagger</strong> — documentação profissional</li>
<li><strong>Testes automatizados</strong> — testes de integração, mocks</li><h1 align="center">🚀 Executando o Projeto VollMed API – Spring Boot 3</h1>

<hr>

<h2>🛠️ 1️⃣ Requisitos</h2>

<ul>
  <li>Java 17 instalado</li>
  <li>MySQL instalado e executando</li>
  <li>Porta <strong>8081</strong> livre</li>
</ul>

<hr>

<h2>🗄️ 2️⃣ Criar o Banco de Dados</h2>

<p>Antes de rodar a aplicação, crie o banco no MySQL:</p>

<pre>CREATE DATABASE vollmed_api3;</pre>

<p>O Flyway criará as tabelas automaticamente quando a aplicação iniciar.</p>

<hr>

<h2>⚙️ 3️⃣ Configurar o <code>application.properties</code></h2>

<p>O arquivo deve conter:</p>

<pre>
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api3
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.error.include-stacktrace=never
api.security.token.secret=${JWT_SECRET:12345678}
server.port=8081
</pre>

<hr>

<h2>▶️ 4️⃣ Rodando a Aplicação</h2>

<p>O projeto usa Maven Wrapper, então <strong>não precisa instalar o Maven</strong>.</p>

<h3>Windows:</h3>

<pre>.\mvnw spring-boot:run</pre>

<h3>Linux / Mac:</h3>

<pre>./mvnw spring-boot:run</pre>

<p>API disponível em:</p>

<pre>http://localhost:8081</pre>

<hr>

<h2>🧪 5️⃣ Testar Autenticação (JWT)</h2>

<h3>Requisição de Login:</h3>

<pre>
POST /login
Content-Type: application/json
</pre>

<h4>Body:</h4>

<pre>
{
  "login": "usuario@email.com",
  "senha": "123456"
}
</pre>

<h4>Resposta:</h4>

<pre>
{ "token": "eyJhbGciOiJIUzI1NiIsInR5..." }
</pre>

<hr>

<h2>📘 6️⃣ Documentação Swagger</h2>

<p>Acesse para visualizar os endpoints da API:</p>

<pre>http://localhost:8081/swagger-ui/index.html</pre>

<hr>

<h2 align="center">✨ Pronto! Seu projeto está rodando com sucesso.</h2>

<li><strong>Deploy com variáveis de ambiente</strong></li>
</ul>

<hr>

<h2>👨‍💻 <strong>Autor</strong></h2>

<p>
<strong>Yasmin Costa</strong><br>
Desenvolvedor Backend & Especialista em APIs Java<br>
Aplicações corporativas • APIs REST • Automação • Cloud • Segurança
</p>

<hr>

<div align="center">
<h3>✨ Obrigado por visitar este projeto!  
<br>⭐ Se este repositório te inspirou, deixe uma estrela no GitHub!</h3>
</div>
