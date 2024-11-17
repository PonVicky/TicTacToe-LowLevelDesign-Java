# Tic Tac Toe Game - Low-Level Design (Java)

This repository contains a simple **Tic Tac Toe** game implemented in Java, showcasing the principles of **low-level design (LLD)**. The project emphasizes clean code, modular structure, and object-oriented programming (OOP) practices.

---

## 📖 Features

- **Two-player game**: Play as X or O in a turn-based format.
- **Best navigation**: Navigate the positions through the numbers 1-9.
- **Win detection**: Automatically detects row, column, or diagonal wins.
- **Draw detection**: Ends the game if the board is full without a winner.
- **Input validation**: Ensures valid moves and prevents overwriting.

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Design Principles**:
  - Low Level Design(LLD)
  - Object-Oriented Programming (OOP)
  - Separation of Concerns

---

### Key Components
1. **Board**: Represents the game board and handles board-related operations.
2. **Player**: Encapsulates player details (e.g., name, symbol).
3. **Main**: Manages the game logic, including turn rotation and win/draw conditions.
4. **Winning**: Validates player inputs for winning positions.

---

🖥️ How to Play
1.Players alternate turns to place their symbol (X or O) on the board.
2.The first player to align their symbols horizontally, vertically, or diagonally wins.
3.If the board is full and no player has won, the game ends in a draw.

---

🎨 Demo
Here’s a sneak peek of the game in action:

                                            --------------------------------------------------------
                                            --               WelCome to Tic-Tac-Toe               --
                                            --------------------------------------------------------
                                            
                                            Enter Player1 name: vicky
                                            Enter Player2 name: raja
                                            - - -
                                            - - -
                                            - - -
                                            vicky enter your position(1-9): 
                                            5
                                            - - -
                                            - X -
                                            - - -
                                            raja enter your position(1-9): 
                                            2
                                            - - O
                                            - X -
                                            - - -
