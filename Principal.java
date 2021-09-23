public class Principal {
	public static void main(String[] args) {
		Locadora l = new Locadora();
		l.setCodigo(123);
		l.setNome(" Harry Potter ");
		l.setValor(2.50);
		l.devolver();
		
		l.mostra();		
		l.retirar();	
		l.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}