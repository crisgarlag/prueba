import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner sc;
	public static void main(String[] args) {
		ArrayList<Bebida> bebidaList= new ArrayList<Bebida>();
		Bebida cocaCola=new Bebida("CocaCola",1.30F);
		Bebida fantaNaranja=new Bebida("Fanta de Naranja",1.20F);
		Bebida fantaLimon=new Bebida("Fanta de Limon",1.20F);
		Bebida agua=new Bebida("Agua",1.00F);
		float recaudacion=0.0F;
		int num=0;
		
		do{
			num= maquina();
			switch(num) {
			case 1: bebidaList.add(cocaCola);
					break;
			case 2:bebidaList.add(fantaNaranja);
					break;
			case 3:bebidaList.add(fantaLimon);
					break;
			case 4:bebidaList.add(agua);
					break;
			case 5:System.out.println("HASTA PRONTO");
				   System.out.println("INFORME DE VENTAS");
				   for(Bebida ele:bebidaList) {
					   System.out.println(ele.toString());
					   recaudacion+= ele.getPrecio();
				   }
				   System.out.println("RECAUDACION: " + recaudacion);
					break;
			default:System.out.println("Opcion incorrecta");			
			}
		}while(num!=5);
		sc.close();
		

	}
	public static int maquina() {
		sc= new Scanner(System.in);
		System.out.println("\n");
		System.out.println("MAQUINA DE BEBIDAS");
		System.out.println("--------------------------");
		System.out.println("1. Coca Cola ------1,30 €");
		System.out.println("2. Fanta Naranja --1,20 €");	
		System.out.println("3. Fanta Limon ----1,20 €");	
		System.out.println("4. Agua -----------1,00 €");	
		System.out.println("5. Apagar la Maquina");	
		System.out.println("--------------------------");
		System.out.println("¿Que opcion elige?");
		return sc.nextInt();
	}

}
