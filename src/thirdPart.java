public class thirdPart {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("задача 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + salary;
        }
            System.out.println("Накопление за год составит: " + total + " руб");


        // Задача 2
        System.out.println("Задача 2");
        int salary1 = 29000;
        int total1 = 0;
        for (int m = 1; m <= 12; m ++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println("Накопление за год составит: " + total1 + " руб");
    }
}
