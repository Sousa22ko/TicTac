package mechanics;

public class Tabuleiro {
	
	private char [][] tabuleiro;
	
	public Tabuleiro(){
		tabuleiro = new char[3][3];
		
		tabuleiro[0][0] = 0;
		tabuleiro[0][1] = 0;
		tabuleiro[0][2] = 0;
		tabuleiro[1][0] = 0;
		tabuleiro[1][1] = 0;
		tabuleiro[1][2] = 0;
		tabuleiro[2][0] = 0;
		tabuleiro[2][1] = 0;
		tabuleiro[2][2] = 0;
	}
	
	public void set(int i, int j, char l){
		
		tabuleiro[i][j] = l;
	}
	
	public char[][] getTabuleiro(){
		return tabuleiro;
	}

}
