public class secondPart {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("задача 1");
        for (int y = 1904; y <= 2096; y = y + 4 ) {
            if (y % 100 != 0 || y % 400 == 0)
                System.out.println(y + " год является високосным");}

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}

        //Задача 3
        System.out.println("Задача 3");
        for (int a = 1; a <= 512; a = a * 2) {
            System.out.println(a);}
        }
}
