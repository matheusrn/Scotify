## Scotify ##
Esse projeto tem como objetivo aplicar os conhecimentos adquiridos em sala de aula a respeito de Design Patterns.

----------
O Projeto
-------------
No projeto é implementado um sistema semelhante ao  Spotify, onde, o usuário deve-se autenticar para ter acesso a ele, pode pesquisar por músicas, fazer upgrade de sua conta além de funções diferenciadas para cada tipo de usuário

<i class="icon-asterisk"></i> **As funcionalidades da aplicação resumem-se apenas a prints em tela!**

----------
Patterns utilizados
-------------

<i class="icon-key"></i> **Proxy**
No projeto, o Proxy é usado como autenticador de usuário, ou seja, caso seja passado um usuário desconhecido ele não ira permitir que o individuo acesse o sistema.

<i class="icon-key"></i> **Strategy**
O Strategy é usado um duas situações: 

- Mostrar uma propagando caso o usuário for comum ou uma mensagem de de boas vindas caso o usuário seja premium.
- Juntamente com o padrão factory, que será citado a frente, irá decidir qual menu que será carregado ao entrar na aplicação, onde a ação irá mudar de acordo com o nível de cada usuário.
