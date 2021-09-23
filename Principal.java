public class Principal {
	public static void main(String[] args) {
		Locadora l = new Locadora();
		l.setCodigo(76876);
		l.setNome(" Harry Potter ");
		l.setValor(5.00);
		l.devolver();
		
		l.mostra();		
		l.retirar();	
		l.mostra();
		
		try {
			l.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}