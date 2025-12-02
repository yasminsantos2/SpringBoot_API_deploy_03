<div align="center">

<h1>🩺 <strong>VollMed API – Plataforma Clínica | Spring Boot 3</strong></h1>

<p>
API RESTful desenvolvida em <strong>Java 17 + Spring Boot 3</strong>, seguindo boas práticas corporativas,
com autenticação JWT, migrações com Flyway e documentação via Swagger.
</p>

<p>
<strong>✔ API REST • ✔ Boas práticas • ✔ JWT • ✔ SOLID • ✔ Flyway • ✔ OpenAPI • ✔ Testes</strong>
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
A <strong>VollMed API</strong> simula o backend de uma plataforma clínica, permitindo o cadastro e 
gerenciamento de médicos, pacientes, consultas e autenticação de usuários.
</p>

<ul>
<li>Arquitetura limpa com separação por camadas</li>
<li>Segurança com JWT</li>
<li>Migrações automáticas com Flyway</li>
<li>Documentação interativa com Swagger</li>
<li>Aplicação preparada para produção com variáveis de ambiente</li>
</ul>

<hr>

<h2>🏗 <strong>Arquitetura</strong></h2>

<pre>
Cliente → Controller → Service/Domain → Repository → MySQL
                      ↓
                Security + JWT
</pre>

<ul>
<li><strong>controller/</strong> — Entrada das requisições REST</li>
<li><strong>domain/</strong> — Regras de negócio, DTOs, entidades</li>
<li><strong>infra/</strong> — Segurança e componentes gerais</li>
<li><strong>db/migration/</strong> — Scripts versionados pelo Flyway</li>
</ul>

<hr>

<h2>▶ <strong>Como Rodar o Projeto</strong></h2>

<h3>1️⃣ Requisitos</h3>

<ul>
<li>Java 17</li>
<li>MySQL</li>
<li>Porta 8081 livre</li>
</ul>

<h2>🗄 <strong>Faça o Git Clone do projeto</h2>


<pre>https://github.com/yasminsantos2/SpringBoot_API_deploy_03.git</pre>

<hr>

<h2>🗄 <strong>Banco de Dados</strong></h2>

<p>Crie o banco antes de iniciar a API:</p>

<pre>CREATE DATABASE vollmed_api3;</pre>

<p>O Flyway criará automaticamente todas as tabelas ao iniciar o projeto.</p>

<hr>

<h2>▶️ <strong>Executando a Aplicação</strong></h2>

<h3>Opção recomendada (IntelliJ IDEA)</h3>

<ol>
  <li>Abrir o projeto no <strong>IntelliJ IDEA</strong>.</li>
  <li>Selecionar a configuração <strong>ApiApplication</strong> no topo.</li>
  <li>Clicar no botão verde <strong>Run ▶</strong>.</li>
</ol>

<p>API disponível em:</p>
<pre>http://localhost:8081</pre>


<hr>

<h2>📘 <strong>Swagger</strong></h2>

<p>Documentação interativa da API:</p>

<pre>http://localhost:8081/swagger-ui/index.html</pre>

<hr>
<hr>

<h2>🔐 <strong>Autenticação (JWT)</strong></h2>

<h3>Endpoint:</h3>

<pre>POST /login</pre>

<h4>Body de exemplo:</h4>

<pre>
{
  "login": "ana.souza@voll.med",
  "senha": "123456"
}
</pre>

<p>Para acessar endpoints protegidos:</p>
<pre>Authorization: Bearer SEU_TOKEN_AQUI</pre>


<h2>🎓 <strong>Principais conceitos aplicados</strong></h2>

<ul>
<li>REST + boas práticas HTTP</li>
<li>Princípios SOLID</li>
<li>Spring Security + JWT</li>
<li>Flyway para versionamento de banco</li>
<li>OpenAPI/Swagger</li>
<li>Testes automatizados</li>
</ul>

<hr>

<h2>👨‍💻 <strong>Autora</strong></h2>

<p>
<strong>Yasmin Costa</strong><br>
Desenvolvedora Backend & Especialista em APIs Java
</p>

<hr>

<div align="center">
<h3>✨ Obrigado por visitar este projeto!  
<br>⭐ Se este repositório te inspirou, deixe uma estrela no GitHub!</h3>
</div>
