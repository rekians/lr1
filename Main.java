import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int day_now = 17;
        int month_now = 03;
        int year_now = 2023;
        int day = 0;
        int month = 0;
        int year = 0;
        int yearOld = 0;
        int monthOld = 0;
        int dayOld = 0;
        int day_old_ost = 0;




        System.out.println("Введите день вашего рождения");
        if (scanner.hasNextInt()){
            day = scanner.nextInt();
            dayOld = day_now - day;
            if ((day > 31) || (day < 1)) {
                System.out.println("Данные дня введены некорректно");
                System.exit(0);
            }
            System.out.println("Введите месяц вашего рождения");

            if (scanner.hasNextInt()){
                month = scanner.nextInt();
                monthOld = month_now - month;
                if ((month > 12) || (month < 1)) {
                    System.out.println("Данные месяца введены некорректно");
                    System.exit(0);
                }
                System.out.println("Введите год вашего рождения");

                if (scanner.hasNextInt()){
                    year = scanner.nextInt();
                    if (year > 2022) {
                        System.out.println("Данные года введены некорректно");
                        System.exit(0);
                    }
                    yearOld = year_now - year;
                }
                else {
                    System.out.println("Введите целые числа в качестве значений!");
                    scanner.next();
                }

            }
            else {
                System.out.println("Введите целые числа в качестве значений!");
                scanner.next();
            }
        }
        else {
            System.out.println("Введите целые числа в качестве значений!");
            scanner.next();
        }
        /*Пытаемся избежать отрицательных чисел */

        dayOld = dayOld + (yearOld * 365) + (monthOld * 30);
        day_old_ost = dayOld % 365;
        yearOld = (dayOld - day_old_ost) / 365;
        dayOld =  day_old_ost % 30;
        monthOld = (day_old_ost - dayOld) / 30;
        System.out.println(yearOld + " лет, " + monthOld + " месяцев, " + dayOld + " дней.");

        scanner.close();
    }
}