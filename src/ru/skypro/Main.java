package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int ClientOS = 0;

        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int ClientOS = 0;
        int ProductionYear = 2018;

        if (ClientOS == 0 && ProductionYear <= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (ClientOS == 0 && ProductionYear > 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (ClientOS == 1 && ProductionYear <= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3 () {
        int Year = 2021;

        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.println(Year + " Является высокосным");
        } else {
            System.out.println(Year + " Не является высокосным");

        }
    }

    public static void task4 () {
        int DeliveryDistance = 95;
        int DeliveryDays = 1;

        if (DeliveryDistance > 20) {
            DeliveryDays++;
        }
        if (DeliveryDistance > 60) {
            DeliveryDays++;
        }
        System.out.println("Дней доставки требуется " + DeliveryDays);
    }

    public static void task5 () {
        int MonthNumber = 12;

        switch (MonthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябырь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}

