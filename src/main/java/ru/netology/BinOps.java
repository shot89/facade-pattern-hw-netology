package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        try {
            int arg0 = Integer.parseInt(a, 2);
            int arg1 = Integer.parseInt(b, 2);
            return Integer.toBinaryString(arg0 + arg1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Incorrect data, cannot parse int by input binary String");
        }
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        try {
            int arg0 = Integer.parseInt(a, 2);
            int arg1 = Integer.parseInt(b, 2);
            return Integer.toBinaryString(arg0 * arg1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Incorrect data");
        }
    }
}
