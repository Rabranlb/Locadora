public class Principal {
	public static void main(String[] args) {
		Locadora l = new Locadora();
		l.codigo(123);
		l.setNome("A Era do Gelo");
		l.setValor(2.50);
		l.devolver();
		
		f.mostra();
		
		f.retirar();
		
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}