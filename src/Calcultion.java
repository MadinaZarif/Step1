import java.util.Scanner;

public class Calcultion {
    public static void main(String[] args) {
       //
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Напишите сумму: ");
            int numZakaz = scan.nextInt();
            System.out.println("Вводите нужную сумму: ");
            int numZakaz1 = scan.nextInt();

            Scanner number = new Scanner(System.in);
            System.out.println("Выбирайте условие: " );
            String simbol = number.nextLine();

            switch (simbol){
                case "+":
                    int plus = numZakaz+numZakaz1;
                    System.out.println("Плюсовая сумма: " + plus);
                    break;

                case "*":
                    int mult = numZakaz * numZakaz1;
                    System.out.println("Умножение: " + mult);
                    break;
                case "-":
                    int minus = numZakaz - numZakaz1;
                    System.out.println("Минус: " + minus);
                    break;
                case "/":
                    int delenie = numZakaz / numZakaz1;
                    System.out.println("Деление: " + delenie);
                    break;

                default:
                    System.out.println("Неправильный знак: " + simbol);
            }

            if (simbol.equals("=")){
                System.out.println("Выход из системы");
                break;
            }else{
                continue;
            }
        }

    }
}
