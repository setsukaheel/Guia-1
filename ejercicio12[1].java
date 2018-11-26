import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// //Cálculo del cuadrado de los primeros N números naturales
		int N;
		int c=0;
		int i=0;

		Scanner entrada=new Scanner(System.in);
		System.out.print("ingrese un valor: ");
	    N=entrada.nextInt();
	    while(i<N){
	    c=i*i;
	   
	    System.out.println("El cuadrado de "+i+" es " + c);
	    i++;
	    }
		

	}

}