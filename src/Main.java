import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2001;
        whatYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientAndroid = 1;
        int clientDeviceYear = 2023;
        softForPhone(clientAndroid, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней для доставки: " + deliveryDay(deliveryDistance));
        }
//======================================================================================//
        public static void whatYear ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        public static void softForPhone ( int system, int year){
            int currentYear = LocalDate.now().getYear();
            switch (system) {
                case 0:
                    if (currentYear <= year) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для iOS по ссылке");
                    }
                    break;
                case 1:
                    if (currentYear <= year) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                    break;
            }
        }

        public static int deliveryDay ( int distance){
            int day = 1;
            if (distance > 20) {
                day++;
            }
            if (distance > 60) {
                day++;
            }
            if (distance > 100) {
                System.out.println("Доставки нет");
            }
            return day;
        }
}
