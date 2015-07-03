package demo;
import java.util.Scanner;


public class docente{
	private String nombre;
	private String apellido;
	private String tipo;
	private int horas;

	Scanner sc = new Scanner(System.in);

	public docente(){
		nombre = "Nereida";
		apellido = "Bernal";
		tipo = "ciencias";
		horas = 3;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}	

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setTipo(int horas){
		this.horas = horas;
	}

	public void getNombre(){
		this.nombre = nombre;
	}

	public void getApellido(){
		this.apellido = apellido;
	}	

	public void getTipo(){
		this.tipo = tipo;
	}

	public void getHoras(){
		this.horas = horas;
	}


public void askData(){
	System.out.println("Escribe el nombre del docente: ");
	nombre = sc.nextLine();
	System.out.println("Escribe el apellido del docente: ");
	apellido = sc.nextLine();
	System.out.println("Escribe el tipo del docente: (ciencias/letras)");
	tipo = sc.nextLine();
	System.out.println("Escribe el número de horas: ");
	horas = Integer.parseInt(sc.nextLine());
}

public String returnFullName (){
	return this.nombre+ " " +this.apellido;
}

public double SueldoBruto(){
	double sueldo = 12000;
	if (tipo.equals("ciencias")){
		sueldo=sueldo/3*horas;
		System.out.println("Sueldo Bruto: "+sueldo);
		return sueldo;
	}
	else if (tipo.equals("letras")){
		sueldo=sueldo/5*horas;
		System.out.println("Sueldo Bruto: "+sueldo);
		return sueldo;}
	else
		return 0;
}

public double CalcDescuento(double sueldo){
	double desc = sueldo*.10;
	System.out.println("Descuento: "+desc);
	return desc;
}


public double SueldoNeto(double sueldo, double desc){
	double neto = sueldo - desc;
	System.out.println("Sueldo neto: "+neto);
	return neto;
}
}
