package banco;

public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1254,152525);

		
		conta.deposita(200.00);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.getAgencia());
		conta.setAgencia(570);

		
		System.out.println(conta.getAgencia());
		
		System.out.println("O total das contas é:"+Conta.getTotal());//acessas método estático.


	}

}
