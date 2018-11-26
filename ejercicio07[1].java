import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		//saber porcentaje de niños y niñas en un curso.
		int niño;
		int niña;
		int total;
		double porcentaje1;
		double porcentaje2;
		Scanner entrada=new Scanner(System.in);
		System.out.println("ingrese cantidad de niños: " );
		niño=entrada.nextInt();
		System.out.println("ingrese cantidad de niñas: " );
		niña=entrada.nextInt();
		
		total= niño+niña;
		System.out.println("Total de alumnos del curso es: " + total);
		porcentaje1=(niño*100)/total;
		porcentaje2=(niña*100)/total;
		
		System.out.println("El porcentaje de niños en el curso es "+ porcentaje1 + "%");
		System.out.println("El porcentaje de niñas en el curso es "+ porcentaje2 + "%");
		
	}

}
