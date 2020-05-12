package sudoku;

import java.util.ArrayList;
import java.util.List;

import exception.InsertException;

public class LoadPuzzle {

	public static void printSudokuState(List<List> puzzle) {
		int i = 0;
		for (List<Integer> row : puzzle) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("-----------------------");
			}
			System.out.println(" " + row.get(0) + " " + row.get(1) + " " + row.get(2) + " | " + row.get(3) + " "
					+ row.get(4) + " " + row.get(5) + " | " + row.get(6) + " " + row.get(7) + " " + row.get(8));
			i++;
		}
		System.out.println();
	}

	private static List<List> initEmptyGrid() {
		List<List> puzzle = new ArrayList<List>();
		List<Integer> row = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			row.add(0);
		}
		for (int i = 1; i <= 9; i++) {
			puzzle.add(row);
		}
		return puzzle;
	}

	public static void insertValueIntoPuzzle(List<List> puzzle, Integer value, int x, int y) throws InsertException {

		// Integers x and y are coordinates where we want to insert value into the
		// puzzle.
		// Check if the value is zero first.
		if ((x < 9 && y < 9)) {
			if ((Integer) puzzle.get(y).get(x) == 0) {
				List<Integer> row = puzzle.get(y);
				row.set(x, value);
				puzzle.set(y, row);
			} else {
				throw new InsertException("Cannot insert value! The position is not empty!");
			}
		}
	}

	public static boolean checkIfEmptyPositionsExist(List<List> puzzle) {

		Integer grandTotal = getSumOfPuzzle(puzzle);

		if (grandTotal == 405) {
			return true;
		} else {
			return false;
		}
	}

	public static Integer getSumOfPuzzle(List<List> puzzle) {
		Integer grandTotal = 0;

		for (List list : puzzle) {
			grandTotal += list.stream().mapToInt(i -> (Integer) i).sum();
		}
		return grandTotal;
	}

	public static boolean checkIfPreviousAndNextStatesAreSame(List<List> puzzleOld, List<List> puzzle) {
		if (getSumOfPuzzle(puzzleOld).equals(getSumOfPuzzle(puzzle))) {
			return true;
		}
		return false;
	}
}
