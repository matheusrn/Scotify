## Scotify ##
Esse projeto tem como objetivo aplicar os conhecimentos adquiridos em sala de aula a respeito de Design Patterns.

----------
O Projeto
-------------
No projeto é implementado um sistema semelhante ao  Spotify, onde, o usuário deve-se autenticar para ter acesso a ele, pode pesquisar por músicas, fazer upgrade de sua conta além de funções diferenciadas para cada tipo de usuário como: Menus, locais onde serão buscados as músicas, etc.

<i class="icon-asterisk"></i> **As funcionalidades da aplicação resumem-se apenas a prints em tela!**

----------
Patterns utilizados
-------------

**Proxy**
No projeto, o Proxy é usado como autenticador de usuário, ou seja, caso seja passado um usuário desconhecido ele não ira permitir que o individuo acesse o sistema.

**Strategy**
O Strategy é usado um três situações: 

- Mostrar uma propagando caso o usuário for comum ou uma mensagem de de boas vindas caso o usuário seja premium.
- Juntamente com o padrão factory, que será citado a frente, irá decidir qual menu que será carregado ao entrar na aplicação, onde a ação irá mudar de acordo com o nível de cada usuário.
- Juntamente com o padrão Observer, que também será citado a frente, irá decidir onde será efetuada a busca das músicas que serão passadas pelos usuários, onde o local será mudado de acordo com o nível do usuário.

**Observer**
O Observer é usado para simular um ambiente onde o usuário acessa a aplicação de um lugar diferente, onde e ele gera uma notificação avisando sobre esse acesso.

**Factory**
Ela é usada como um "instanciador" de view, ou seja,  todas as chamadas de view é passada para a ela e ela decide o que fazer.

**Chain of Responsibility**
