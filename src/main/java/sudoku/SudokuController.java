package sudoku;

public class SudokuController {

	public static void main(String[] args) {
		
		EliminationPuzzleSolver.solveUsingEliminationOfPossibilitiesMethod(Puzzles.initPuzzleMedium1());
	}
}
