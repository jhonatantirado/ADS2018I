package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.Arrays;
import java.util.List;

// Complexity: O(log2 N)
public class Logarithmic {

	public static void main(String[] args) {
		int NEEDLE = 64;
		Logarithmic logarithmic = new Logarithmic();
		List<Integer> valueList = Arrays.asList(2, 4, 4, 5, 7, 10, 23, 25, 64);
		try {
			Integer position = logarithmic.binarySearch(valueList, NEEDLE, 0, valueList.size() - 1);
			System.out.println(position == null ? "Not found" : "Found at position: " + position);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Integer binarySearch(List<Integer> valueList, int needle, int min, int max) throws Exception {
        int midpoint = (max + min) / 2;
        if (valueList.size() > 0 && valueList.get(midpoint) == needle) {
            return midpoint;
        }
        if (min >= max) {
            return null;
        }
        if (valueList.get(midpoint) > needle) {
            return binarySearch(valueList, needle, min, midpoint - 1);
        }
        return binarySearch(valueList, needle, midpoint + 1, max);
    }
}
