<h1 align="left">Challenge-ONE-Forum-Alura</h1>
<img src="https://github.com/Gui-Rigaud/Challenge-ONE-Forum-Alura/assets/115510639/fc625d4e-e6a3-4447-bcbc-253d6453a02f" />

<p>
  Este projeto trata-se de uma api que realiza as tarefas principais do Fórum da Alura na parte do back-end.
</p>

<h1 align="left">Status do Projeto</h1>
<p>
  <img src="https://img.shields.io/badge/STATUS-CONCLUÍDO-green" />
</p>

# :hammer: Funcionalidades do projeto

- `Autenticar usuário`:  Para conseguir realizar o CRUD (Create, Read, Update e Delete) dos tópicos, é nessário ter um usuário e senha cadastrados no banco de dados e gerar um token a partir da autenticação.
- `Criar um tópico`: Para criar um novo tópico, é necessário fazer uma requisição do tipo POST para o servidor da API na rota "/topicos" com um body JSON contendo: título, mensagem, autor e curso.
- `Listar tópicos`: Para listar os tópicos existentes, é preciso fazer uma requisição do tipo GET para o servidor da API na rota "/topicos".
- `Detalhar um tópico`: Para detalhar um único tópico, é preciso fazer uma requisição do tipo GET para o servidor da API na rota "/topicos/{id}", onde o campo "id" corresponde ao id do tópico.
- `Deletar um tópico`: Para deletar um único tópico, é preciso fazer uma requisição do tipo DELETE para o servidor da API na rota "/topicos/{id}", onde o campo "id" corresponde ao id do tópico.

# 📁 Acesso ao projeto

Para que o projeto seja executado, é necessário [baixá-lo](https://github.com/Gui-Rigaud/Challenge-ONE-Forum-Alura/archive/refs/heads/main.zip).

# 🛠️ Abrir e rodar o projeto

Após baixar o projeto e extraí-lo para uma pasta local, você pode abrir com o IntelliJ IDE. Após isso, faça:

- Abra o arquivo "pom.xml";
- Clique no ícone referente ao Maven no canto superior direito;
- CLique em "Reload All Maven Projects".

Depois de realizar esse procedimento, será preciso executar o projeto. Para isso, faça:

- Abra o arquivo "ApiApplication.java" na pasta `src/main/java/forum/alura/api`;
- Execute-o.

Após aparecer todos os logs do Spring, ao fim aparecerá algo como: Started ApiApplication.

# Autores

| [<img src="https://avatars.githubusercontent.com/Gui-Rigaud" width=115><br><sub>Guilherme Rigaud</sub>](https://github.com/Gui-Rigaud) | 
| :---: |
