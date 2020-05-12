Sudoku Solver:

We'll require two strategies which will need to be run in sync with each other to successfully solve a typical problem. The more hard sudoku problems will obviously require a brute force approach but these strategies will be sufficient on their own in case of simple problems and can work in sync in case of problems with medium hardness.

Strategy 1:
You have your problem. Create a 9x9 grid and we'll have the temporary entries from 1-9 in each of them.
Copy an entry form you problem to the new grid and re-evaluate the temporary entries. Basically purge the copied entry from the row and column of the cell as well as the sub grid(3x3).
Once you are done copying the provided entries from the problem, find for an entry with temporary values which definitely points to a particular number. Move this number to final value and repeat the previous rule.

Strategy 2:
This is the traditional strategy for solving a sudoku problem.
Basically, based on the current values, take a number from 1-9 and try filling by checking all cells and finding a particular one where the possibility is 100%.


How to give input: We'll use a 9x9 array to represent the puzzle.

We'll load the values in a 9x9 array and will dynamically compute the temp values for each cell when required. - Initial thought.