import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] Arregloc = new double[20];
        Scanner t = new Scanner(System.in);

        for (int i = 0; i < Arregloc.length; i++) {
            System.out.print((i+1) + ". Ingresa un valor: ");
            Arregloc[i] = t.nextDouble();
        }

        System.out.println("Numero \tCuadrado \tCubo");
        for (int i = 0; i < Arregloc.length; i++) {
            double numero = Arregloc[i];
            double numero2= numero*numero;
            double numero3= numero*numero*numero;
            System.out.println(numero+"\t" +"\t"+numero2 + "\t"+ "\t"+numero3);
        }
    }
}