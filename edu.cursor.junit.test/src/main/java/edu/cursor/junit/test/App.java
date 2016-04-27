package edu.cursor.junit.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	List<String> yura = new ArrayList<>();

	public int add(int a, int b) {
		return a + b;
	}

	public int div(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return a / b;
		}
	}

	public String returnText(String b) {
		return b;
	}

	public int loop(int c) {
		for (int i = 0; i < 5; i++) {
			c++;
		}
		return c;
	}
}
