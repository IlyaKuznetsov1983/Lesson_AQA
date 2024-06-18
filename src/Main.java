import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] testArr = {
                  {"123", "098", "765", "432"},
                  {"109", "876", "543", "210"},
                  {"987", "654", "321", "234"},
                  {"567", "890", "Q", "000"},
        };

        try {
            printSum(testArr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void printSum(String[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > 3 || j > 3) throw new MyArraySizeException("Неверный размер массива! Массив должен быть 4х4");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    String infoMessage = String.format(
                            "Символ - '%s', находящийся в %d-й ячейке %d-го массива, нельзя привести к типу int",
                            array[i][j], j + 1, i + 1
                    );
                    throw new MyArrayDataException(infoMessage);
                }

            }
        }

        System.out.println("Сумма элементов массива = " + sum);
    }
}