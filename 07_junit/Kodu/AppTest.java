package kodu;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {	
	Board gameBoard;

	
    @Test public void testHorizontal() {
		gameBoard = new Board();
		gameBoard.place(1, 0, 1);
		gameBoard.place(1, 1, 1);
		gameBoard.place(1, 2, 1);
		assertEquals(1, gameBoard.checkWin());
    }
	
    @Test public void testVertical() {
		gameBoard = new Board();
		gameBoard.place(0, 0, 1);
		gameBoard.place(1, 0, 1);
		gameBoard.place(2, 0, 1);
		assertEquals(1, gameBoard.checkWin());
    }
	
    @Test public void testDiagonal() {
		gameBoard = new Board();
		gameBoard.place(0, 0, 1);
		gameBoard.place(1, 1, 1);
		gameBoard.place(2, 2, 1);
		assertEquals(1, gameBoard.checkWin());
    }

    @Test public void testReverseDiagonal() {
		gameBoard = new Board();
		gameBoard.place(0, 2, 1);
		gameBoard.place(1, 1, 1);
		gameBoard.place(2, 0, 1);
		assertEquals(1, gameBoard.checkWin());
    }
}
