package exerciciometodosjava;

public class Saudacao {
	
	public static void mensagem(double hora) {
		
		if (hora>5 && hora<=12) {
			BomDia();
		} else if (hora>12 && hora<=18) {
			BoaTarde();
		} else if (hora>18 && hora<=24 || hora>24 && hora<=5) {
			BoaNoite();
		} else  if (hora<0 || hora > 24) {
			System.out.println("Hora inválida!");
		}
		
		

		
	}
	
	public static void BomDia() {
		System.out.println("Bom dia!");
	}
	
	public static void BoaTarde() {
		System.out.println("Boa Tarde!");
	}
	
	public static void BoaNoite() {
		System.out.println("Boa Noite!");
	}	
}
