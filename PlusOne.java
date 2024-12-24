public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        // Пример 1
        int[] digits1 = {1, 2, 3};
        System.out.println("Ввод: [1, 2, 3] -> Вывод: " + java.util.Arrays.toString(solution.plusOne(digits1)));

        // Пример 2
        int[] digits2 = {4, 3, 2, 1};
        System.out.println("Ввод: [4, 3, 2, 1] -> Вывод: " + java.util.Arrays.toString(solution.plusOne(digits2)));

        // Пример 3
        int[] digits3 = {9};
        System.out.println("Ввод: [9] -> Вывод: " + java.util.Arrays.toString(solution.plusOne(digits3)));

        // Пример 4 (дополнительный тест)
        int[] digits4 = {9, 9, 9};
        System.out.println("Ввод: [9, 9, 9] -> Вывод: " + java.util.Arrays.toString(solution.plusOne(digits4)));
    }
}
