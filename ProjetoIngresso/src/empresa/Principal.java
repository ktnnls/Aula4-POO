package empresa;

public class Principal {

	public static void main(String[] args) {
		IngressoVip iv = new IngressoVip("Rock in Quebrada",200,100);
		
		iv.info();
		System.out.println("----------------");
		
		Ingresso i = new Ingresso("Rock in Xique Xique", 50);
		i.info();
	}

}
