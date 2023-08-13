# RockPaperScissor

A Java program that implements a simple Rock-Paper-Scissors game with a sentinel loop structure. The program allows the user to play the game against the computer until the user enters a sentinel value of -1, at which point the game's win/lose/draw totals are displayed. Here's a breakdown of the code:

    Import Statements: Importing the Scanner class to read user input.

    main Method: This is the entry point of the program.

    Variables: I have declared pWins (player wins), cWins (computer wins), and draw (draws) to keep track of game results.

    Infinite Loop: The program enters an infinite loop using while (true) to repeatedly play the game.

    Game Logic: Inside the loop, the program generates a random choice for the computer (0 for scissor, 1 for rock, 2 for paper), prompts the user for their choice, and then compares the choices to determine the winner.

    Sentinel Value: If the user enters a negative value, the loop is terminated using the break statement.

    Output: The program displays the computer's choice, the user's choice, and whether the user won, lost, or had a draw. It increments the corresponding counters (pWins, cWins, draw) based on the game result.

    Program Results: After the loop ends, the program displays the overall game results, including the number of rounds played, player wins, computer wins, and draws.

Overall, the code is well-structured and effectively implements the Rock-Paper-Scissors game with the desired functionality.
