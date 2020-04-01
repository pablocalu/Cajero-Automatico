import java.util.Scanner;

public abstract class ClasePadreAbstracta {
	
	protected int transacciones, deposito, retiro;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);
	
	
	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;
		
		do {
			do{
				System.out.println("Por favor, seleccione una opción: ");	
				System.out.println("	1. Consulta de saldo.");
				System.out.println("	2. Retiro de efectivo.");
				System.out.println("	3. Depósito de efectivo.");
				System.out.println("	4. Salir.");
				seleccion = entrada.nextInt();
			
				if(seleccion >= 1 && seleccion <=4) {
				bandera = 1;
				} else {
					System.out.println("--------------------------------");
					System.out.println("Opción no disponible, reintente.");
					System.out.println("--------------------------------");
				}
			
			} while(bandera == 0);
			
			if(seleccion == 1) {
				ClasePadreAbstracta mens = new ClaseHijaConsulta();
				mens.Transacciones();
				
			} else if(seleccion == 2) {
				ClasePadreAbstracta mens = new ClaseHijaRetiro();
				mens.Transacciones();
				
			} else if (seleccion == 3) {
				ClasePadreAbstracta mens = new ClaseHijaDeposito();
				mens.Transacciones();
				
			} else if (seleccion == 4) {
				
				System.out.println("------------------------");
				System.out.println("¡Gracias! Vuelva pronto.");
				System.out.println("------------------------");
				bandera = 2;
			}
			
			
			
		} while(bandera !=2);
		
		
	}
	
	public void Retiro() {
		
		retiro = entrada.nextInt();
		
	}
	
	public void Deposito() {
		
		deposito = entrada.nextInt();
	}
	
	public abstract void Transacciones();
	
	
	public int getSaldo() {
		
		return saldo;
	}
	
	
	public void setSaldo(int saldo) {
		
		this.saldo= saldo;
	}
	
	
	

}
