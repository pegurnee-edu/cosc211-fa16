# Redoing an Undo

- **Distributed:** *November 15th*
- **Due:** *December 6th*

### Description:

You will be responsible for creating the undo/redo functionality of a word processor. The system should allow users to enter and delete rows of text, then allow the user to undo or redo those actions.

### Spec:

- When the system starts, the user is given a choice to load a `Document` or create a new one
  - in either case, a filename must be provided
- At the main menu the user is given six options:
  - add line - which allows a user to enter some new text at the end of the `Document`
  - delete line - which allows a user to delete any given line of text in the `Document`
  - undo - which undoes the most recent `Action` (either add or delete of a line)
  - redo - which redoes the most recent `Action` that had been undone
  - print - prints out the current `Document` to the standard output
  - quit - saves and closes the current edits to the filesystem
- both add line and delete line should be `Action`s that can be undone and/or redone
- file writing should only happen on quit

## Expectations:

- work in pairs - two people
- good documentation (javadocs and readmes) will be observed
- all source code will show proper/consistent formatting
- code compiles and runs something

## Deliverables:

- Final Project:
  1. Print out of all source code due 12:00pm on the 6th
  1. Demo/walkthrough in class/office hours
  1. Individual writeup of the responsibilities for the group members

## Requirements for success:

- A `Stack` data structure for undoing and redoing actions
- An understanding of how undo/redo works in file processors - you cannot redo something that has not been undone
- File I/O for loading/saving `Documents`

### Legal Notice

*Please appropriately cite text or concepts taken straight from wikipedia or stackoverflow*
