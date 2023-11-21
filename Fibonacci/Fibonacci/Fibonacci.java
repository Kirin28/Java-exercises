package animals;

public class Fibonacci {
	public int fibonacci(int number) {
		if (number == 0) {
			return 0;
		} else if (number == 1) {
			return 1;
		}  else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
	public static void main (String[] args) {
		Fibonacci test = new Fibonacci();
		test.fibonacci(10);
	}

}
