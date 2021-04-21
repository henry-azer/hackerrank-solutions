package Java.DataStructures;

import java.util.*;

class JavaStack {

	private static final Scanner scan = new Scanner(System.in);
	private static final List<Character> leftBrackets = Arrays.asList('<', '{', '[', '(');
	private static final List<Character> rightBrackets = Arrays.asList('>', '}', ']', ')');

	public static void main(String []argh) {

		while (scan.hasNext()) {
			String input = scan.next();
			Stack<Character> stack = new Stack<>();

			boolean result = stackBalancedExpressions(stack, input);
			System.out.println(result);
		}
	}

	private static boolean stackBalancedExpressions(Stack<Character> stack, String input) {
		for (char ch: input.toCharArray()) {
			if (isLeftBracket(ch)) stack.push(ch);

			if (isRightBracket(ch)) {
				if (stack.empty()) return false;

				char top = stack.pop();
				if (!isBracketsMatch(top, ch)) return false;
			}
		}

		return stack.isEmpty();
	}

	private static boolean isBracketsMatch(char right, char left) {
		return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
	}

	private static boolean isRightBracket(char ch) {
		return rightBrackets.contains(ch);
	}

	private static boolean isLeftBracket(char ch) {
		return leftBrackets.contains(ch);
	}
}



