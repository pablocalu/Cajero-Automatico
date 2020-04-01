
public class ClaseHijaRetiro extends ClasePadreAbstracta{
	
	@Override
	public void Transacciones() {
		System.out.print("¿Cuanto desea retirar? ");
		Retiro();
		if(retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("------------------------------------");
			System.out.println("Usted retiró: " + retiro);
			System.out.println("Su saldo actual es de: " + getSaldo());
			System.out.println("------------------------------------");
		} else {
			System.out.println("-------------------");
			System.out.println("Saldo insuficiente.");
			System.out.println("-------------------");
		}
	}
}
