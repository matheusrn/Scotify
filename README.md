## Scotify ##
Esse projeto tem como objetivo aplicar os conhecimentos adquiridos em sala de aula a respeito de Design Patterns.

----------
O Projeto
-------------
No projeto é implementado um sistema semelhante ao  Spotify, onde, o usuário deve-se autenticar para ter acesso a ele, pode pesquisar por músicas, fazer upgrade de sua conta além de funções diferenciadas para cada tipo de usuário como: Menus, locais onde serão buscadas as músicas, etc.

----------
**Observação: As funcionalidades da aplicação resumem-se apenas a prints em tela!**

----------
Patterns utilizados
-------------

**Proxy**:
No projeto, o Proxy é usado como autenticador de usuário, ou seja, caso seja passado um usuário desconhecido ele não irá permitir que o indivíduo acesse o sistema.

**Porque usar o proxy?**
Com ele é possível fazer o controle de quem acessa a aplicação! Dando assim um pouco mais de segurança. Uma vantagem ao usa-lo é que posso identificar o usuário e escolher as ações que serão tomadas a partir do seu tipo de usuário.

----------

**Strategy**:
O Strategy é usado em três situações: 

- Mostrar uma propagando caso o usuário for comum ou uma mensagem de boas-vindas caso o usuário seja premium.
- Juntamente com o padrão factory, que será citado a frente, irá decidir qual menu que será carregado ao entrar na aplicação, onde a ação irá mudar de acordo com o nível de cada usuário.
- Juntamente com o padrão Observer, que também será citado a frente, irá decidir onde será efetuada a busca das músicas que serão passadas pelos usuários, onde o local será mudado de acordo com o nível do usuário.

**Porque usar o Strategy?**
Com o estrategy é possível alterar comportamentos da aplicação sem que seja necessário compila-lo novamente.  Por exemplo,  é possível que o usuário se torne premium e ao se tornar premium ele terá opções diferente de um usuário normal, sem o Strategy teria que ser feita toda uma "gambiarra" ou recompilar o código para essas opções ficassem disponíveis.

----------

**Observer**:
O Observer é usado para simular um ambiente onde o usuário acessa a aplicação de um lugar diferente, onde e ele gera uma notificação avisando sobre esse acesso.

**Porque usar o Observer?**
Porque mantenho o usuário sempre informado sobre qualquer coisa que acontece em sua conta. Isso tem várias vantagens como por exemplo segurança, pois ele "sempre" sera notificado caso o acesso esteja sendo efetuado em um outro dispositivo, o que por um acaso, não pode ser ele. 

----------

**Factory**:
Ele é usado como um "instanciador" de view, ou seja,  todas as chamadas de view é passadas para a ele e ele decide o que fazer.

**Porque usar o Factory?**
Pois eu concentro a responsabilidade de chamar "views" em apenas um lugar. Isso é muito bom pois a manutenção do código fica muito mais fácil e mais rápida de se fazer. 

----------

**Chain of Responsibility**:
Ele  é usado como um buscador de música, onde, dependendo do nível do usuário ele irá buscar em lugares diferentes.

**Porque usar a Chain?**
Pois posso trabalhar com vários bancos "nós" em minha aplicação e posso decidir como será feito o acesso a esses bancos. Por exemplo, na aplicação, o usuário comum ao pesquisar uma música, a chain vai somente na nuvem buscar esse arquivo, já o usuário premium, a chain busca primeiro localmente e se não achar procura na nuvem.
