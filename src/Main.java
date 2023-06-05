
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expense = new int[30];

        for (int i = 0; i < expense.length; i++) {
            expense[i] = random.nextInt(100_000) + 100_000;
        }
        return expense;
    }
    public static void task1() {
        System.out.println("Задача1");
        int[] expense = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < expense.length; i++) {
            sum = sum + expense[i];
        }
        System.out.println("Сумма затрат за месяц составила " + sum);
    }
//        for (int element : arr) {
//            sum = sum + element;
//            System.out.println("Сумма затрат за месяц составила " + sum);
//        }
//    } По такому варианту выписывает несколько результатов!!!!===
    public static void task2() {
        System.out.println("Задача2");
        int[] expense = generateRandomArray();
        int maxArr = expense[0];
        int minArr = expense[0];
  //      expense[0] = 100_000;
//        int minArr = 200_000;

//        for (int i = 0; i < expense.length; i++) {
//            if (expense[i] > maxArr) {
//                maxArr = expense[i];
//            }
//        }
        for (int element : expense) {
            if (element < minArr) {
                minArr = element;
            }
            if (element > maxArr) {
                maxArr = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");
    }
    public static void task3() {
        System.out.println("Задача3");
        int[] expense = generateRandomArray();
        double sum = 0;
  //      int numberOfDays = 30;

        for (int i = 0; i < expense.length; i++) {
            sum += expense[i];
        }
  //      double average = sum / numberOfDays;
        System.out.println("Средняя сумма трат за месяц составила " + sum / expense.length + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}