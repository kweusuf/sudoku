package sudoku;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import exception.InsertException;

public class EliminationPuzzleSolver {

	static List<List> puzzle;

	private static void loadPuzzle(List<List> puzzle1) {
		puzzle = puzzle1;
	}

	public static void solveUsingEliminationOfPossibilitiesMethod(List<List> puzzleInput) {
		loadPuzzle(puzzleInput);
		LoadPuzzle.printSudokuState(puzzle);
		int i = 1;
		while (!LoadPuzzle.checkIfEmptyPositionsExist(puzzle)) {

			int oldStateSum = LoadPuzzle.getSumOfPuzzle(puzzle);

			System.out.println("Pass number: " + i);
			Map<Integer, Set<Integer>> possibilityMap = solveByFindingOutPossibilities(puzzle);
			// Check for entry in map where possibility is single then continue.
			if(!checkIfSinglePossibilityExists(possibilityMap)) {
				// Logic of choosing one from multiple possibilities.
				// Here we'll require a validator which does not rely on sum to validate solution.
			}
			System.out.println("Sum : " + LoadPuzzle.getSumOfPuzzle(puzzle));
			i++;

			if (oldStateSum == LoadPuzzle.getSumOfPuzzle(puzzle)) {
				System.out.println("Cannot proceed with current strategy!");
				break;
			}

		}
		LoadPuzzle.printSudokuState(puzzle);
	}

	private static boolean checkIfSinglePossibilityExists(Map<Integer, Set<Integer>> possibilityMap) {
		for(Set<Integer> possibility : possibilityMap.values()) {
			if(possibility.size() == 1) {
				return true;
			}
		}
		return false;
	}

	public static Map<Integer, Set<Integer>> solveByFindingOutPossibilities(List<List> puzzle) {

		loadPuzzle(puzzle);

		Map<Integer, Set<Integer>> possibilityMap = new HashMap<Integer, Set<Integer>>();

		int x = 0;
		int y = 0;

		for (List<Integer> list : puzzle) {
			if (x > 8) {
				x = 0;
			}
			for (Integer i : list) {
				// Check if it is filled - then we don't want to calculate the possibilities.
				if (i == 0) {
					processThePossibilities(puzzle, possibilityMap, x, y);
				}
				x++;
			}
			y++;
		}

		System.out.println("Remaining Possibilities are: " + possibilityMap.toString());
		return possibilityMap;
	}

	private static void processThePossibilities(List<List> puzzle, Map<Integer, Set<Integer>> possibilityMap, int x,
			int y) {
		// Check the row, column and grid for possibilities.
		Set<Integer> possibilities = new HashSet(
				Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		Set<Integer> emptySet = new HashSet<Integer>();
		findNumbersInRow(emptySet, x, y);
		findNumbersInColumn(emptySet, x, y);
		findNumbersInGrid(emptySet, x, y);

		// Do diff of possibilities and emptySet;
		possibilities.removeAll(emptySet);
//					System.out.println("(" + x + ", " + y + ") = " + possibilities.toString());
		possibilityMap.put((10 * (y + 1)) + (x + 1), possibilities);
		if (possibilities.size() == 1) {
			// Replace the digit into the puzzle!
			try {
				LoadPuzzle.insertValueIntoPuzzle(puzzle, possibilities.iterator().next(), x, y);
			} catch (InsertException e) {
				System.out.println("Tried to insert value into non empty cell!");
			}

		}
	}

	private static void findNumbersInGrid(Set<Integer> emptySet, int x, int y) {
		int gridId = identifyGridNumber(x, y);
		Set<Integer> gridValues = findValuesInGrid(gridId);
		emptySet.addAll(gridValues);
	}

	private static void findNumbersInColumn(Set<Integer> emptySet, int x, int y) {
		// x coordinate denotes the column number.
		for (int i = 0; i < 9; i++) {
			emptySet.add((Integer) puzzle.get(i).get(x));
		}
	}

	private static void findNumbersInRow(Set<Integer> emptySet, int x, int y) {
		// y coordinate will denote the row number.
		emptySet.addAll(puzzle.get(y));
	}

	public static Set<Integer> findValuesInGrid(int gridId) {

		Set<Integer> result = new HashSet<Integer>();

		switch (gridId) {
		case 1:
			result.addAll(puzzle.get(0).subList(0, 3));
			result.addAll(puzzle.get(1).subList(0, 3));
			result.addAll(puzzle.get(2).subList(0, 3));
			break;
		case 2:
			result.addAll(puzzle.get(0).subList(3, 6));
			result.addAll(puzzle.get(1).subList(3, 6));
			result.addAll(puzzle.get(2).subList(3, 6));
			break;
		case 3:
			result.addAll(puzzle.get(0).subList(6, 9));
			result.addAll(puzzle.get(1).subList(6, 9));
			result.addAll(puzzle.get(2).subList(6, 9));
			break;
		case 4:
			result.addAll(puzzle.get(3).subList(0, 3));
			result.addAll(puzzle.get(4).subList(0, 3));
			result.addAll(puzzle.get(5).subList(0, 3));
			break;
		case 5:
			result.addAll(puzzle.get(3).subList(3, 6));
			result.addAll(puzzle.get(4).subList(3, 6));
			result.addAll(puzzle.get(5).subList(3, 6));
			break;
		case 6:
			result.addAll(puzzle.get(3).subList(6, 9));
			result.addAll(puzzle.get(4).subList(6, 9));
			result.addAll(puzzle.get(5).subList(6, 9));
			break;
		case 7:
			result.addAll(puzzle.get(6).subList(0, 3));
			result.addAll(puzzle.get(7).subList(0, 3));
			result.addAll(puzzle.get(8).subList(0, 3));
			break;
		case 8:
			result.addAll(puzzle.get(6).subList(3, 6));
			result.addAll(puzzle.get(7).subList(3, 6));
			result.addAll(puzzle.get(8).subList(3, 6));
			break;
		case 9:
			result.addAll(puzzle.get(6).subList(6, 9));
			result.addAll(puzzle.get(7).subList(6, 9));
			result.addAll(puzzle.get(8).subList(6, 9));
			break;
		default:
			break;
		}

		if (result.contains(0)) {
			result.remove(0);
		}

		return result;
	}

	private static int identifyGridNumber(int x, int y) {

		if (x <= 2) {
			if (y <= 2) {
				return 1;
			} else if (y > 2 && y <= 5) {
				return 4;
			} else if (y > 5) {
				return 7;
			}
		} else if (x > 2 && x <= 5) {
			if (y <= 2) {
				return 2;
			} else if (y > 2 && y <= 5) {
				return 5;
			} else if (y > 5) {
				return 8;
			}
		} else if (x > 5) {
			if (y <= 2) {
				return 3;
			} else if (y > 2 && y <= 5) {
				return 6;
			} else if (y > 5) {
				return 9;
			}
		}
		return 0;
	}
}
