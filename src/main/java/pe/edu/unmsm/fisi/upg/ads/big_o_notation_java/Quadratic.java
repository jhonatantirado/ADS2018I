package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

//Complexity: O(N*N)
public class Quadratic {

	public static void main(String[] args) {
		long N = 20;
		Quadratic quadratic = new Quadratic();
		quadratic.createAllPairs(N);
	}

	public void createAllPairs(long N) {
        long x = 0;
        long y = 0;
        while (x < N) {
            y = 0;
            while (y < N) {
                System.out.println(String.format("%d, %d", x, y));
                y = y + 1;
            }
            x = x + 1;
        }
    }
}
