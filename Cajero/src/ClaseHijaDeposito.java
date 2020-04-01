
public class ClaseHijaDeposito extends ClasePadreAbstracta {

	
		@Override
		public void Transacciones() {
			System.out.print("¿Cuanto desea depositar?");
			Deposito();
			
			transacciones = getSaldo();
			setSaldo(transacciones + deposito);
			System.out.println("-----------------------------------");
			System.out.println("Usted depositó: " + deposito);
			System.out.println("Su saldo actual es de: "+ getSaldo());
			System.out.println("-----------------------------------");
		}
}
