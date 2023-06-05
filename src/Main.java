import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkYearIsLeap(2023);

        recommendVersion( int clientOs = 2;
        int clientYear = 2023);

        int deliveryDays = calculateDeliveryDays( int distance = 55);
        System.out.println("Время дставки " + deliveryDays);

    }

    public static void checkYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не являтся високосным");
        }
    }

    public static void recommendVersion(int clientOs, int clientYear) {
        int currentYear = LocalDate.now().getYear();
        int iOS = 0;
        int android = 1;

        if (clientOs == iOS) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию  для iOS");
            } else {
                System.out.println("Установите облегченную версию  для iOS");
            }
        } else if (clientOs == android) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию  для Android");
            } else {
                System.out.println("Установите облегченную версию  для Android");
            } else{
                System.out.println("Извините, ОС не поддерживается");
            }
        }

    }

    public static int calculateDeliveryDays(int distance) {

        int deliveryDays = -1;
        int days = 0;

        if (distance <= 20) {
            deliveryDays = days + 1;
        } else if (distance <= 60) ; {
            deliveryDays = days + 2;
        } else if (distance <= 100) ; {
            deliveryDays = days + 3;
        }
        return deliveryDays;
    }
}


