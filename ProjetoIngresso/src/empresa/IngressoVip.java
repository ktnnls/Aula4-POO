package empresa;

public class IngressoVip extends Ingresso {
	double adicional;
	
	public IngressoVip(String nomeEvento, double valor, double adicional) {
		super(nomeEvento, valor);
		this.adicional = adicional;
}
	
	@Override
    void info() {
		super.info();
		System.out.println("Valor adicional: R$ " + adicional);
		System.out.println("Total do ingresso: R$ " + (valor + adicional));
		
	}
}