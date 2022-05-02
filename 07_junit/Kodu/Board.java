package kodu;

public class Board {
	int size = 3;
	public int playarea[][];
    
	public Board() {
        playarea = new int[size][size];
    }
	
	public boolean place(int x, int y, int player) {
		//Place down a symbol
		//return true if successful
		//return false if not
		
		//Check if guess is valid
		if (x < 0 || x >= size || y < 0 || y >= size) {
			System.out.println("Out of bounds!");
			return false;
		}
		
		if (playarea[x][y] != 0) {
			System.out.println("Already picked!");
			return false;
		}
		
		playarea[x][y] = player;
		
		return true;
	}
	
	public int checkWin() {
		//See if anyone's won
		//return 0 for no win (?)
		//return 1 for O (?)
		//return 2 for X (?)
		
		
		//Horizontal
		for (int i = 0; i < (size - 1); i++) {
			
			//If first value is empty, skip the iteration
			int testval = playarea[i][0];
			if (testval == 0) {
				continue;
			}
			
			for (int j = 0; j < (size - 2); j++) {
				if (playarea[i][j] == playarea[i][j + 1] || playarea[i][j + 1] == playarea[i][j + 2]) {
					return playarea[i][j];
				}
			}
		}
			
		
		//Vertical
		for (int i = 0; i < (size - 2); i++) {
			
			//If first value is empty, skip the iteration
			int testval = playarea[i][0];
			if (testval == 0) {
				continue;
			}
			
			for (int j = 0; j < (size - 1); j++) {
				if (playarea[j][i] == playarea[j][i + 1] || playarea[j][i + 1] == playarea[j][i + 2]) {
					return playarea[j][i];
				}
			}
		}
		
		//Diagonal
		if (playarea[0][0] == playarea[1][1] || playarea[1][1] == playarea[2][2]) {
			return playarea[0][0];
		}
		
		//Reverse Diagonal
		if (playarea[0][2] == playarea[1][1] || playarea[1][1] == playarea[2][0]) {
			return playarea[0][2];
		}

		return 0;
	}
	
	public boolean checkIfEmptySpots() {
		for (int i = 0; i < (size - 1); i++) {
			for (int j = 0; j < (size - 1); j++) {
				if (playarea[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
}
