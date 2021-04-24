package Java.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
		while(testCases>0){
			String line = in.nextLine();
			Matcher matcher = pattern.matcher(line);

			boolean invalid = true;
			while (matcher.find()) {
				System.out.println(matcher.group(2));
				invalid = false;
			}

			if (invalid)
				System.out.println("None");

			testCases--;
		}
	}
}



