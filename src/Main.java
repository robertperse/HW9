public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 8000;
        arr[1] = 20000;
        arr[2] = 14000;
        arr[3] = 7000;
        arr[4] = 13000;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int minArr = arr[0];
        int maxArr = arr[0];
        for (final int current : arr) {
            if (current > maxArr) {
                maxArr = current;
            }
            if (current < minArr) {
                minArr = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minArr + " рублей. Максимальная сумма трат за неделю составила " + maxArr + " рублей");

        int avgPerWeek = 0;
        int sum1 = 0;
        for (int element : arr) {
            sum1 += element;
            avgPerWeek = sum1 / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + avgPerWeek + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int start = 0;
        int end = reverseFullName.length - 1;
        while (start < end) {
            char position = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = position;
            start++;
            end--;
        }
        System.out.println(new String(reverseFullName));
    }
}