package InterfaceCalculos;

public class Principal {
	public static void main(String[]args) {
		Calculando cal = new Calculando();
		
		System.out.println("SOMA: ");
		System.out.println(cal.somar(13, 13));
		System.out.println("\nSUBTRAÇÃO: ");
		System.out.println(cal.sub(13, 3));
		System.out.println("\nMULTIPLICAÇÃO: ");
		System.out.println(cal.mult(5, 5));
		System.out.println("\nDIVISÃO: ");
		System.out.println(cal.div(9, 18));
		System.out.println("\nEXPOENTE: ");
		System.out.println(cal.exp(8, 5));
	}

}
