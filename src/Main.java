public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        {
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int y = 12_000_000;
        for (int i = 0; i < 10; ++i) {
            y += (y / 1000 * 17) - (y / 1000 * 8);
            System.out.println("Год " + (i + 1) + ", численность населения составляет " + y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        int enoughMoney = 12_000_000;
        int month = 0;
        while (deposit < enoughMoney) {
            deposit *= 1.07;
            ++month;
                System.out.println("Месяц " + month + " сумма накоплений " + deposit);
            }
        }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15_000;
        int enoughMoney = 12_000_000;
        int month = 0;
        while (deposit < enoughMoney) {
            deposit *= 1.07;
            ++month;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + deposit);

            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        int countMonth = 108;
        for (int i = 1; i <= countMonth; ++i) {
            deposit *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + deposit);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 31; i = i + 7) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int finalYear = currentYear + 100;
        int i;
        for (i = startYear; i <= finalYear; i++) {
            if (i % 79 == 0) {
                System.out.println("Пролет кометы в " + i + " году");
            }
        }
    }
}