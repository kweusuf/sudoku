package sudoku;

import java.util.Arrays;
import java.util.List;

public class PuzzleSolutions {

	/*
	 * Solution:
	 *  4 2 7 | 5 8 6 | 9 1 3 
	 *  6 8 3 | 1 7 9 | 2 5 4 
	 *  9 1 5 | 3 2 4 | 6 8 7
	 * ----------------------- 
	 *  8 7 1 | 9 6 2 | 3 4 5 
	 *  3 4 9 | 8 1 5 | 7 2 6 
	 *  2 5 6 | 4 3 7 | 8 9 1 
	 * ----------------------- 
	 *  1 3 2 | 6 5 8 | 4 7 9 
	 *  5 9 8 | 7 4 3 | 1 6 2 
	 *  7 6 4 | 2 9 1 | 5 3 8
	 */
	
	public static List<List> initPuzzleEasy2Solution() {
		List<Integer> row1 = Arrays.asList(new Integer[] { 4, 2, 7, 5, 8, 6, 9, 1, 3 });
		List<Integer> row2 = Arrays.asList(new Integer[] { 6, 8, 3, 1, 7, 9, 2, 5, 4 });
		List<Integer> row3 = Arrays.asList(new Integer[] { 9, 1, 5, 3, 2, 4, 6, 8, 7 });
		List<Integer> row4 = Arrays.asList(new Integer[] { 8, 7, 1, 9, 6, 2, 3, 4, 5 });
		List<Integer> row5 = Arrays.asList(new Integer[] { 3, 4, 9, 8, 1, 5, 7, 2, 6 });
		List<Integer> row6 = Arrays.asList(new Integer[] { 2, 5, 6, 4, 3, 7, 8, 9, 1 });
		List<Integer> row7 = Arrays.asList(new Integer[] { 1, 3, 2, 6, 5, 8, 4, 7, 9 });
		List<Integer> row8 = Arrays.asList(new Integer[] { 5, 9, 8, 7, 4, 3, 1, 6, 2 });
		List<Integer> row9 = Arrays.asList(new Integer[] { 7, 6, 4, 2, 9, 1, 5, 3, 8 });
	
		List<List> puzzle = Arrays.asList(new List[] { row1, row2, row3, row4, row5, row6, row7, row8, row9 });
	
		return puzzle;
	}

}
