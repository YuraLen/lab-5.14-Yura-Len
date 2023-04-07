import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" --- 1 task --- ");

        String firstString = "";
        String word = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5 ; i++) {
            word = sc.next();
            firstString = firstString.concat(word + " ");
        }
        System.out.println(firstString);

        System.out.println(" --- 2 task --- ");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            word = scan.next();
            System.out.println(word.substring(0, 1));
        }

        System.out.println(" --- 3 task --- ");
        Scanner scann = new Scanner(System.in);

        double a, b, c, maxNum;

        System.out.print("Введіть перше дійсне число: ");
        if(scann.hasNextDouble()){
            a = scann.nextDouble();
            System.out.print("Введіть друге дійсне число:");
            if(scann.hasNextDouble()){
                b = scann.nextDouble();
                System.out.print("Введіть третє дійсне число: ");
                if(scann.hasNextDouble()){
                    c = scann.nextDouble();
                    maxNum = a;
                    if (b > maxNum){
                        maxNum = b;
                    }

                    if (c > maxNum){
                        maxNum = c;
                    }
                    System.out.println("Найбільше дійсне число: " + maxNum);
                } else {
                    System.out.println("Ви ввели не дійсне число");
                }
            } else {
                System.out.println("Ви ввели не дійсне число");
            }
        } else {
            System.out.println("Ви ввели не дійсне число");
        }

        System.out.println(" --- 4 task --- ");

        Scanner input = new Scanner(System.in);
        String string1, string2 = "";

        System.out.println("Вкажіть перше ім'я");
        string1 = input.next();
        System.out.println("Вкажіть друге ім'я");
        string2 = input.next();

        if(string1.equalsIgnoreCase(string2)){
            System.out.println("Імена співпадають!");
        } else {
            System.out.println("Імена не співпадають!");
        }

        System.out.println(" --- 5 task --- ");

        Scanner scannner = new Scanner(System.in);
        String str1, str2 = "";

        System.out.println("Введіть дані: ");
        str1 = scannner.next();
        System.out.println("Інші дані: ");
        str2 = scannner.next();

        if(str1.length() > str2.length()){
            System.out.println("Перший рядок більший за кількістю символів другого рядка");
        } else if (str2.length() > str1.length()){
            System.out.println("Другий рядок більший за кількістю символів першого рядка");
        } else {
            System.out.println("Кількість символів рівна!");
        }
    }
}