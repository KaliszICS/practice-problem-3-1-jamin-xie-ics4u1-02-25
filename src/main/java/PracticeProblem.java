public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int num) {
		num = Math.abs(num);

		if (num < 10) {
			return num;
		}

		return sumOfDigits(num/10) + sumOfDigits(num%10);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}

		if (num < 0) {
			return 0;
		}

		return factorial(num - 1) * num;
	}

}
