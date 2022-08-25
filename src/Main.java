public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int [] payments = new int [30] ;
        for (int i = 0; i < payments.length; i++) {
            payments [i]= ((int)(Math.random() * 100_000) + 100_000) ;
            System.out.print(payments[i] + "  ");
        }
        System.out.println();

        // TASK 1.
        int monthPayments = 0;
        for (int i = 0; i < payments.length; i++) {
            monthPayments = monthPayments + payments[i] ;
        }
        System.out.println("Сумма трат за месяц составила " + monthPayments + " рублей.");

        // TASK 2.
        int maxPayment = 99_999 ;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i]>maxPayment) {
                maxPayment = payments[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayment +" рублей.");

        int minPayment = 200_001 ;
        for (int i = payments.length - 1 ; i >= 0 ; i--) {
            if (payments [i] < minPayment) {
                minPayment = payments[i] ;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей.");

        // Task 3.
        var averagePayment = (double) monthPayments / payments.length ;
        System.out.printf("Средняя сумма трат за день составила %.7f рублей.", averagePayment);
        System.out.println();

        // Task 4.
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}