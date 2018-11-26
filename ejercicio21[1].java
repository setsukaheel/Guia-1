import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		// Crear cuadrado de asteriscos ingresando un entero
		
		int N;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		N=entrada.nextInt();
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(i==0){System.out.print("*");
				}else {
					if(i==N-1){System.out.print("*");
					}else {
						if(j==0){System.out.print("*");
						}else {
							if(j==N-1){System.out.print("*");
							}else {
							System.out.print(" ");
							}
						}
					}	
				}
			}
			System.out.println();
			}
		entrada.close();
        }
}

