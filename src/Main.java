import Calculate.DataAnalysis;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu.mainMenu();
    }
}

class Menu
{
    public static void mainMenu()
    {
        DataAnalysis dataAnalysis = new DataAnalysis();
        Scanner scanner = new Scanner(System.in);
        byte command = 0;
        while(true)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("Введите команду");
            System.out.println("1 - Произвести описательный анализ");
            System.out.println("2 - Произвести расчет средних величин");
            System.out.println("3 - Произвести расчет процентилей распределения");
            System.out.println("4 - Произвести расчет показателей рассеивания");
            System.out.println("0 - Закрыть программу");
            System.out.println("--------------------------------------------------");


            if(scanner.hasNextByte()) command = scanner.nextByte();
            else {System.out.println("Ошибка ввода, повторите команду"); scanner.next();continue;}

            switch (command) {
                case 1: dataAnalysis.calculateAll();break;
                case 2: dataAnalysis.calculateAverageValuesAll();break;
                case 3: dataAnalysis.calculateDistriburionPercentilesAll();break;
                case 4: dataAnalysis.calculateDispersionRatesAll();break;
                case 0: System.out.println("Завершение работы");return;
                }


        }
    }
}