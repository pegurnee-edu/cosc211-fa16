# Dungeons and the Crawling Through of Them

- **Distributed:** *October 4th*
- **Due:** *October 25th*

### Description:

You will be responsible for creating a text-based *Dungeon Crawler* game. The game should allow players to explore a randomly generated dungeon gathering loot and killing monsters. The theme (Sci-Fi, Fantasy, Lovecraftian Horror, etc) is up to you.

### Spec:

- The dungeon must be randomly generated each time the game begins - that includes room types, monsters, and loot gained
- A `Player` represents the player as an avatar in the game
  - Contains information about loot and treasure picked up
  - Also holds user information about player name, current health, and rooms explored
  - If at any point the player's health reaches zero, the game ends
- A `Dungeon` contains a collection of `DungeonRoom`s
- `DungeonRoom` is an abstract class with at least two room types - `LootRoom` and `MonsterRoom`
  - `LootRoom`s contain some amount of `Treasure` or `Loot`
    - `Treasure` and `Loot` help determine end game score
    - `Loot` can be used in game to help - recover health, monster fights, explore area
  - `MonsterRoom`s contain a `Monster` to be dealt with
    - `Monster` is an abstract class with at least three concrete derived classes
    - When encountered `Monster`s can be fought or fled from
      - Fighting and fleeing should be determined pseudo-randomly
      - should have some element of potential loss - either treasure or health or both
- At game end - death or completing the dungeon - the user score should be determined and displayed
  - high scores should be recorded into a save file
- Users will also have the ability to save the state of the game and return to it at a later time

## Expectations:

- work in pairs - two people
- good documentation (javadocs and readmes) will be observed
- all source code will show proper/consistent formatting
- code compiles and runs something

## Deliverables:

- Final Project:
  1. Print out of all source code due 12:00pm on the 25th
  1. Demo/walkthrough in class/office hours
  1. Individual writeup of the responsibilities for the group members

## Requirements for success:

- Abstract classes for `DungeonRoom` and `Monster`
- File I/O for saving games and high scores

### Legal Notice

*Please appropriately cite text or concepts taken straight from wikipedia and other games you've played*
