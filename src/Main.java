public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Вы ввели неправильные данные");
            }
        }

        System.out.println("Задача 2");

        clientOs = 1;
        int clientDeviceYear = 2111;

        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");

        int year = 1589;

        if (year % 400 == 0) {

        }


    }
}