package sudoku;

import java.util.Arrays;
import java.util.List;

public class Puzzles {

	public static List<List> initPuzzleEasy() {
		List<Integer> row1 = Arrays.asList(new Integer[] { 0, 8, 7, 0, 5, 0, 0, 0, 0 });
		List<Integer> row2 = Arrays.asList(new Integer[] { 4, 9, 0, 0, 3, 6, 1, 0, 0 });
		List<Integer> row3 = Arrays.asList(new Integer[] { 5, 1, 0, 9, 8, 2, 0, 0, 4 });
		List<Integer> row4 = Arrays.asList(new Integer[] { 0, 0, 0, 0, 0, 5, 4, 0, 6 });
		List<Integer> row5 = Arrays.asList(new Integer[] { 7, 0, 0, 0, 6, 9, 0, 1, 0 });
		List<Integer> row6 = Arrays.asList(new Integer[] { 1, 0, 0, 0, 4, 0, 7, 5, 0 });
		List<Integer> row7 = Arrays.asList(new Integer[] { 2, 0, 0, 8, 1, 3, 6, 0, 9 });
		List<Integer> row8 = Arrays.asList(new Integer[] { 9, 4, 0, 0, 0, 7, 0, 3, 0 });
		List<Integer> row9 = Arrays.asList(new Integer[] { 0, 0, 0, 0, 0, 4, 8, 0, 7 });
	
		List<List> puzzle = Arrays.asList(new List[] { row1, row2, row3, row4, row5, row6, row7, row8, row9 });
	
		return puzzle;
	}
	/*
	 * Puzzle 2: 
	 *  0 2 0 | 5 0 6 | 0 1 0 
	 *  6 0 3 | 1 7 9 | 0 0 0 
	 *  0 1 0 | 3 0 0 | 0 0 0
	 * ----------------------- 
	 *  0 0 1 | 0 0 2 | 3 4 0 
	 *  3 4 9 | 0 1 0 | 0 2 6 
	 *  2 0 6 | 4 0 7 | 8 0 0 
	 * ----------------------- 
	 *  0 0 0 | 6 5 8 | 0 0 0 
	 *  5 0 8 | 7 4 3 | 0 6 0 
	 *  7 6 0 | 0 0 1 | 0 0 0
	 */
	public static List<List> initPuzzleEasy2() {
		List<Integer> row1 = Arrays.asList(new Integer[] { 0, 2, 0, 5, 0, 6, 0, 1, 0 });
		List<Integer> row2 = Arrays.asList(new Integer[] { 6, 0, 3, 1, 7, 9, 0, 0, 0 });
		List<Integer> row3 = Arrays.asList(new Integer[] { 0, 1, 0, 3, 0, 0, 0, 0, 0 });
		List<Integer> row4 = Arrays.asList(new Integer[] { 0, 0, 1, 0, 0, 2, 3, 4, 0 });
		List<Integer> row5 = Arrays.asList(new Integer[] { 3, 4, 9, 0, 1, 0, 0, 2, 6 });
		List<Integer> row6 = Arrays.asList(new Integer[] { 2, 0, 6, 4, 0, 7, 8, 0, 0 });
		List<Integer> row7 = Arrays.asList(new Integer[] { 0, 0, 0, 6, 5, 8, 0, 0, 0 });
		List<Integer> row8 = Arrays.asList(new Integer[] { 5, 0, 8, 7, 4, 3, 0, 6, 0 });
		List<Integer> row9 = Arrays.asList(new Integer[] { 7, 6, 0, 0, 0, 1, 0, 0, 0 });
	
		List<List> puzzle = Arrays.asList(new List[] { row1, row2, row3, row4, row5, row6, row7, row8, row9 });
	
		return puzzle;
	}

	public static List<List> initPuzzleMedium1() {
		List<Integer> row1 = Arrays.asList(new Integer[] { 0, 4, 0, 5, 0, 0, 0, 3, 0 });
		List<Integer> row2 = Arrays.asList(new Integer[] { 0, 0, 0, 0, 1, 0, 0, 8, 5 });
		List<Integer> row3 = Arrays.asList(new Integer[] { 3, 8, 0, 6, 7, 0, 9, 0, 1 });
		List<Integer> row4 = Arrays.asList(new Integer[] { 9, 0, 0, 0, 0, 1, 6, 0, 0 });
		List<Integer> row5 = Arrays.asList(new Integer[] { 0, 3, 1, 0, 0, 0, 8, 0, 9 });
		List<Integer> row6 = Arrays.asList(new Integer[] { 8, 6, 4, 9, 0, 2, 0, 1, 7 });
		List<Integer> row7 = Arrays.asList(new Integer[] { 0, 9, 3, 4, 0, 0, 0, 0, 0 });
		List<Integer> row8 = Arrays.asList(new Integer[] { 0, 1, 8, 0, 0, 7, 0, 0, 0 });
		List<Integer> row9 = Arrays.asList(new Integer[] { 0, 0, 6, 1, 9, 0, 0, 0, 0 });
	
		List<List> puzzle = Arrays.asList(new List[] { row1, row2, row3, row4, row5, row6, row7, row8, row9 });
	
		return puzzle;
	}

}
