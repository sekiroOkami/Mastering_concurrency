import java.util.*;

/**
 * Write a description of class SerialMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SerialMain
{
    public static void main(String[] args) {
        double matrix1[][] = MatrixGenerator.generate(2000, 2000);
        double matrix2[][] = MatrixGenerator.generate(2000, 2000);
        double resultSerial[][] = new double[matrix1.length][matrix2[0].length];

        Date start = new Date();
        SerialMultiplier.multiply(matrix1, matrix2, resultSerial);
        Date end=new Date();
        System.out.printf("Serial: %d%n",end.getTime()-start.getTime());
    }
}
