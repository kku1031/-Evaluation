package sampleTest;

public class Calculator {

	public int add(int i, int j) {
		return i+j;
	}
	public int add(int i, String string) {
		return i+Integer.parseInt(string);
	}
	public int add(String string, int j) {
		return Integer.parseInt(string)+j;
	}
	public int add(String string, String string2) {
		return Integer.parseInt(string)+Integer.parseInt(string2);
	}

}
