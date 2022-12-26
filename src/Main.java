public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1!");
        int sum = 0;
        int [] arr = generateRandomArray();
        for(int b1: arr){
            sum+=b1;
        }
        System.out.println("Сумма трат за месяц :" + sum);
    }
    public static void task2() {
        System.out.println("Задача 2!");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты в день :" + min);
        System.out.println("Максимальные затраты в день:" + max);
    }

    public static void task3() {
        System.out.println("Задача 3!");
        int[] numberArray = generateRandomArray();
        int sum = 0;
        for (int i : numberArray) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) numberArray.length + "рублей");
    }
    public static void task4() {
        System.out.println("Задача 4!");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1;i>=0; i--) {
            System.out.print(reverseFullName[i]);
            
        }
    }
}