package pl.wiktor.interfaces;

public interface NewInterface {

	String ITEM = "DECLARED CONSTANT";

	void printText();

	static void showStatic() {
		System.out.println("Call static method from interface!");
	}

	default void show() {

		System.out.println("Hello from default method");

	}


}