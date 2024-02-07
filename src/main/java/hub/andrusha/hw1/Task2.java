package hub.andrusha.hw1;

import java.util.Scanner;

public class Task2
{
    public static double[] days = new double[30];
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
            System.out.println("Меню:");
            System.out.println("1 - Ввести расход за день");
            System.out.println("2 - Траты за месяц");
            System.out.println("3 - Самая большая сумма расхода за месяц");
            System.out.println("4 - Конвертировать накопления");
            System.out.println("0 - Выход с программы");
            System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
            System.out.println("Выберите пункт");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Введите номер дня: ");
                    int d = scan.nextInt();
                    if (d <= 30 & d > 0){
                        System.out.println("Введите расходы: ");
                        double amount = scan.nextDouble();
                        if (amount < 0)
                        {
                            System.out.println("Введите корректную сумму!");
                        }
                        else
                        {
                            days[d - 1] = amount;
                            System.out.println("Успешно!");
                        }
                    }
                    else
                    {
                        System.out.println("Введите корректный день!");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 29; i++)
                    {
                        System.out.println(i+1 + " день: " + days[i] + " руб");
                    }
                    break;
                case 3:
                    double max = 0.0;
                    for (double day : days) {
                        if (day > max) {
                            max = day;
                        }

                    }
                    if (max > 0){
                        System.out.println("Максимальный расход: " + max);
                    }
                    else
                    {
                        System.out.println("Введите расходы!");
                    }

                    break;
                case 4:
                    converter(); break;
                case 0:
                    System.exit(0);
                    break;

            }
        }
    }
    public static void converter()
    {
        boolean novalue = true;
        for (int i = 0; i < days.length; i++)
        {
            if (days[i] > 0)
            {
                double euroAmount = Math.round(days[i] / 97);
                double dollarAmount = Math.round(days[i] / 91);
                double yaniAmount = Math.round(days[i] / 13);
                System.out.println("День " + (i + 1) + ": " + "\nЕвро   | " + euroAmount + "\nДоллар | " + dollarAmount + "\nЮани   | " + yaniAmount + "\n ");
                novalue = false;
            }
        }
        if (novalue)
        {
            System.out.println("Нет расходов!");
        }
    }
}