package MinMaxArray;
import java.util.Scanner;
public class MinMaxArrayTester
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Inserire la lunghezza del vettore da costruire:");
int lunghezza = in.nextInt();
if (lunghezza < 1)
System.out.println("Errore: numero inserito non valido!");
else
{
int[] myArray = new int[lunghezza];
for(int i = 0; i < myArray.length; i++)
{
System.out.println("Inserire un intero da aggiungere nella posizione " + i);
myArray[i] = in.nextInt();
}
MinMaxArray pluto = new MinMaxArray(myArray);
System.out.println("numero minimo: ");
System.out.println(pluto.getMin());
System.out.println("numero massimo: ");
System.out.println(pluto.getMax());
System.out.println("La lunghezza del vettore e':" + pluto.getLength());
}
}
}