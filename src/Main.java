import Calculate.DataAnalysis;

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
        byte comand = 0;
        while(true)
        {
            System.out.println("Введите команду");
            System.out.println("1 - Произвести описательный анализ");
            System.out.println("2 - Произвести расчет средних величин");
            System.out.println("3 - Произвести расчет процентилей распределения");
            System.out.println("4 - Произвести расчет показателей рассеивания");
            System.out.println("0 - Закрыть программу");
            comand = scanner.nextByte();
            switch (comand)
            {
                case 1: dataAnalysis.calculateAll();
                case 2: dataAnalysis.calculateAverageValuesAll();
                case 3: dataAnalysis.calculateDistriburionPercentilesAll();
                case 4: dataAnalysis.calculateDispersionRatesAll();
                case 0: return;
            }
        }
    }
}