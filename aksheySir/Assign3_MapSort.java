package aksheySir;

import java.util.*;

public class Assign3_MapSort {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "z");
		map.put(2, "b");
		map.put(3, "a");
		map.put(4, "c");
		map.put(5, "d");
		map.put(6, "e");
		map.put(7, "y");
		map.put(8, "n");
		map.put(9, "j");
		map.put(10, "m");
		map.put(11, "f");
		System.out.println("Unsorted Map");
		printMap(map);
		System.out.println("Sort by Value");
		map = sortByValue(map);
		printMap(map);
	}

	private static Map<Integer, String> sortByValue(Map<Integer, String> map) {
		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1,
					Map.Entry<Integer, String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		Map<Integer, String> sorted = new LinkedHashMap<Integer, String>();
		for (Map.Entry<Integer, String> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		return sorted;
	}

	private static void printMap(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key :\t" + entry.getKey() + " value :\t"
					+ entry.getValue());
		}

	}

}
