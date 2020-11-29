# Análise e Desenvolvimento de Sistemas - Design Patterns
##### Professor: Filipe Guelber

##### Aluno: gabrielcorreiadev@gmail.com: Gabriel Correia da Silva
##### Aluno: daniel_amorimpacheco@hotmail.com: Daniel de Amorim Pereira Pacheco

## Ranking Speedrun Demon's Souls
Demon's souls e um jogo de rpg exclusivo do playstation, produzido pela FromSoftware 
foi o criador do genero souls like, sendo um jogo absurdamente dificil muitos jogadores fazem speedrun (refere-se finalizar um determinado jogo no menor tempo possível) do jogo, Assim decidimos criar um Ranking para essas Speedrun.

## Pattern Utilizados
 - State = Usado para determinar dificuldade do jogo onde em Demon's Souls quanto mais o jogador morre o mundo do jogo fica mais dificil
 - Singleton = Usando para monitorar as posição dos jogadores no ranking onde ele e ordenado deacordo com tempo de finalização do jogo.(Menor tempo fica no topo)
 - Facade = Apresenta uma interface simple onde somente mostra a posição do jogador

