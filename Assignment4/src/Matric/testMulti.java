package Matric;

public class testMulti {

	public static void main(String[] args) {
		int[][] ma = {{1, 0, 0}, {-1, 0, 3}};
		int[][] mb = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
		Matric A = new Matric(ma);
		Matric B = new Matric(mb);
		Matric C = A.multi(B);
		for(int[] i : C.matric) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
