public class RecursionFunOne {
	public static int countOddDigits(int num) {
		if (num > 0) {
			int temp = num % 10;
			if (temp % 2 == 0) {
				return 1 + countOddDigits(num / 10);
			}
			return 0 + countOddDigits(num / 10);
		}
		return 0;
	}
}