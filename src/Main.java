import operations.CreditCard;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Sc = new  Scanner(System.in);
        System.out.println( "Номер счёта: 123456" );
        System.out.println( "Дата открытия:10.08.1987 ");
        System.out.println( "Имя владельца:Андрей " );
        CreditCard creditCard = new CreditCard(0);
        for (; ; ) {
            System.out.println("\nВведите операцию, которую хотите совершить: \n\nadd - внести деньги на счет \ncheck - проверить остаток на счету \nwithdraw - снять деньги со счета \nexit - выйти");
            Scanner scanner = new Scanner(System.in);
            String opName = scanner.nextLine();
            if (opName.equals("add")) {

                System.out.println("Введите сумму");
                int i = scanner.nextInt();
                creditCard.add(i);
                System.out.println("Внесенны деньги на сумму " + i);

            } else if (opName.equals("check")) {
                int moneyNow = creditCard.check();
                System.out.println("Остаток на счету: " + moneyNow);
            } else if (opName.equals("withdraw")) {
                System.out.println("Введите сумму");
                int i = scanner.nextInt();
                creditCard.withdraw(i);
                System.out.println("Было списано со счета: " + i);
            } else if (opName.equals("exit")) {
                break;
            } else System.out.println("Неправильно введены данные");
        }
    }
}
