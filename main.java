import demo.docente;

public class main{
	public static void main(String[] args){
		docente obj = new docente();

		obj.askData();
		System.out.println(obj.returnFullName());
		System.out.println(obj.SueldoBruto());
		System.out.println(obj.CalcDescuento(obj.SueldoBruto()));
		System.out.println(obj.SueldoNeto(obj.SueldoBruto(),obj.CalcDescuento(obj.SueldoBruto())));
	}
}