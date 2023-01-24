import java.text.DecimalFormat;

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
    public static void task1 () {
        System.out.println("Задача 1");
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + 15_000;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Мы накопим 2_459_000 рублей спустя " + (i+1) + " месяцев");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i-- ; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int growth = 17 - 8;
        for (int i = 1; i < 11; i++) {
            population = (int) (population + population / 1000.0 * growth);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double savings = 15_000;
        int i = 1;
        DecimalFormat decimalFormat = new DecimalFormat();
        while (savings < 12_000_000) {
            savings = savings + savings * 0.07;
            System.out.println("Месяц " + i + ", вклад составляет " + decimalFormat.format(savings) + " рублей");
            i++;
        }
        System.out.println("Итого потребуется " + (i - 1) + " месяцев, вклад составит " + decimalFormat.format(savings) + " рублей");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double savings = 15_000;
        int i = 1;
        DecimalFormat decimalFormat = new DecimalFormat();
        while (savings < 12_000_000) {
            savings = savings + savings * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", вклад составляет " + decimalFormat.format(savings) + " рублей");
            }
            i++;
        }
        System.out.println("Итого потребуется " + (i - 1) + " месяцев, вклад составит " + decimalFormat.format(savings) + " рублей");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double savings = 15_000;
        int i = 1;
        DecimalFormat decimalFormat = new DecimalFormat();
        while (i < 109) {
            savings = savings + savings * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", вклад составляет " + decimalFormat.format(savings) + " рублей");
            }
            i++;
        }
        System.out.println("Итого через " + (i - 1) + " месяцев(9лет), вклад составит " + decimalFormat.format(savings) + " рублей");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int i = 5;
        while (i < 32) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
            i += 7;
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int today = 2023;
        int past = today - 200;
        int future = today + 100;
        for (int i = past; i < future; i++) {
            if (i % 79 == 0) {
                System.out.println("В " + i + " году комета пролетит рядом с Землей");
            }
        }
    }
}