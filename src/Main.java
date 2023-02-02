public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int clientDeviceYear = 2014;
        int clientOS = 1;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int year = 2001;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}