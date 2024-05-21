public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы ввели неправильные данные");
        }


        System.out.println("Задача 2");

        clientOs = 0;
        int clientDeviceYear = 2017;

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

        int year = 1596;

        if (year % 400 == 0 && year % 4 == 0 || year % 100 != 0) {
            System.out.printf("%s год является високосным \n", year);
        } else {
            System.out.printf("%s год не является високосным \n", year);
        }

        System.out.println("Задача 4");

        int deliveryDistance = 99;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней на доставку: %s\n", deliveryDays);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.printf("Потребуется дней на доставку: %s\n", deliveryDays + 1);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.printf("Потребуется дней на доставку: %s\n", deliveryDays + 2);
        }
        if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("Задача 5");

        int monthNumber = 13;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Неверное значение");
        } else switch (monthNumber) {

            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
        }
    }
}
