import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		//saber porcentaje de ni�os y ni�as en un curso.
		int ni�o;
		int ni�a;
		int total;
		double porcentaje1;
		double porcentaje2;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese cantidad de ni�os: " );
		ni�o=entrada.nextInt();
		System.out.println("ingrese cantidad de ni�as: " );
		ni�a=entrada.nextInt();
		
		total= ni�o+ni�a;
		System.out.println("Total de alumnos del curso es: " + total);
		porcentaje1=(ni�o*100)/total;
		porcentaje2=(ni�a*100)/total;
		
		System.out.println("El porcentaje de ni�os en el curso es "+ porcentaje1 + "%");
		System.out.println("El porcentaje de ni�as en el curso es "+ porcentaje2 + "%");
		
	}

}
