<div align="center">

<img src="https://play-lh.googleusercontent.com/7hOg_ahIxf6fVS5uFOqb65vuJN5BarfxAb5r6X20z1KevKVPfGXX7GcfwlVrMBETFaTl" width=220>

Projeto Integrador, referente ao terceiro período do curso de Sistemas para Internet,<br>
da faculdade <strong>UNIESP</strong>, projeto ministrado pelo <strong>Professor Kelson Victor Praxedes de Almeida</strong>.<br>
O projeto tem por objetivo, criar um sistema para atender a comunidade, que traga alguma causa social.

![-----------------------------------------------------](
https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png
)
# Grupo:
Carlos Augusto Alves Bezerra de Santana  
Ewerton Alexander de Oliveira Batista  
Hugo Oliveira Facundo de Almeida<br>
Luan Antony Rocha de Aguiar  
Wagner de Sousa Patrício Junior

![-----------------------------------------------------](
https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png
)
</div>

# Projeto:

### Nome: 
AdotaPet

### Objetivo:

Funciona como uma rede de apoio formada por pessoas interessadas<br>
em ajudar cães e gatos, principalmente os que vivem na rua.

### Descrição:

O projeto visa reunir informações dos animais de estimação, disponíveis para adoção
ou em situação de risco e abandono.
É possível incluir fotos, dados de contato dos donos dos animais e informações sobre
as características dos pets.
Baseado em geolocalização, o aplicativo apresenta ao usuário os pets disponíveis para
adoção.

<div align="center">
  

![-----------------------------------------------------](
https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png
)
</div>

# Front-end:

Abaixo segue imagens do prtótipo (Front-end) do Projeto AdotaPet<br>e um link para visualizar na prática a funcionalidade em front-end.

<div align="center">

<img src="https://github.com/Ewertonalex/AdotaPet/blob/main/Front/tela%20login.png" width=180>
<img src="https://github.com/Ewertonalex/AdotaPet/blob/main/Front/2%20Pets%20para%20ado%C3%A7%C3%A3o.png" width=180>
<img src="https://github.com/Ewertonalex/AdotaPet/blob/main/Front/3%20Pet%20escolhido.png" width=180>
<img src="https://github.com/Ewertonalex/AdotaPet/blob/main/Front/responsavel.png" width=180>
  
</div>

* <strong>Protótipo</strong><br>Clique para ver o Protótipo<br>prático do projeto 👇 <br>
[<img src="https://play-lh.googleusercontent.com/7hOg_ahIxf6fVS5uFOqb65vuJN5BarfxAb5r6X20z1KevKVPfGXX7GcfwlVrMBETFaTl" width=115><br>](https://www.figma.com/proto/VfJ8FRem49mSlF67TjqzSL/AdotaPet?node-id=1%3A9&scaling=scale-down&page-id=0%3A1&starting-point-node-id=1%3A9)<br>

<div align="center">
  

![-----------------------------------------------------](
https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.png
)
</div>


# Back-end:

### Desenvolvimento:

#### Classe PetsController:

Foram criados alguns endpoints que visam cadastrar um novo pet, buscar pets cadastrados ou por Id e Excluir Pet, detalhados a baixo.

- <strong>/adoteme:</strong><br>
Endpoint de Verbo HTTP <strong>POST</strong>, que tem o objetivo de cadastrar um novo Pet no sistema;
- <strong>/pets:</strong><br>
Endpoint de Verbo HTTP <strong>GET</strong>, que tem o objetivo buscar todos os Pets cadastrados no sistema;
- <strong>/petsById/{id}:</strong><br>
Endpoint de Verbo HTTP <strong>GET</strong>, que tem o objetivo buscar Pets cadastrados no sistema por Id;
- <strong>/petsdelete/{id}:</strong><br>
Endpoint de Verbo HTTP <strong>DELETE</strong>, que tem o objetivo de excluir um Pet do sistema, através de seu Id.

#### Classe ClienteController:

Foram criados alguns endpoints que visam cadastrar um novos usuários, buscar usuários cadastrados ou por Id e Excluir usuário, detalhados a baixo.

- <strong>/cliente:</strong><br>
Endpoint de Verbo HTTP <strong>POST</strong>, que tem o objetivo de cadastrar um novo usuário no sistema;
- <strong>/all:</strong><br>
Endpoint de Verbo HTTP <strong>GET</strong>, que tem o objetivo buscar todos os usuários cadastrados no sistema;
- <strong>/clienteById/{id}:</strong><br>
Endpoint de Verbo HTTP <strong>GET</strong>, que tem o objetivo buscar usuários cadastrados no sistema por Id;
- <strong>/clientedelete/{id}:</strong><br>
Endpoint de Verbo HTTP <strong>DELETE</strong>, que tem o objetivo de excluir um usuário do sistema, através de seu Id.


### Ferramentas e Tecnologias utilizadas:

- Java
- IntelliJ IDEA
- Postman
- PostgreSQL
- Spring Boot

