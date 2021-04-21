package Java.DataStructures;

import java.util.*;

class JavaMap {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String []argh) {
		HashMap<String, Integer> map = new HashMap<>();

		int n = scan.nextInt();
		scan.nextLine();

		for(int i = 0; i < n; i++) {
			String name = scan.nextLine();
			int phone = scan.nextInt();
			scan.nextLine();

			map.put(name, phone);
		}

		while(scan.hasNext()) {
			String s = scan.nextLine();

			if (map.containsKey(s)) System.out.println(s + "=" + map.get(s));
			else System.out.println("Not found");
		}
	}
}



