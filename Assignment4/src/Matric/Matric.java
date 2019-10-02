package Matric;

public class Matric {
	int[][] matric;
	int col;
	int row;
	
	Matric(int[][] M){
		matric = M;
		row = matric.length;
		col = matric[0].length;
	}
	
	public Matric multi(Matric B) {
		Matric res = new Matric(new int[row][col]);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				res.matric[i][j] += this.matric[i][j] * B.matric[j][i];
			}
		}
		return res;
	}
}
