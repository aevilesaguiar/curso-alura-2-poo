package banco;

public class TestaGetESet {

	public static void main(String[] args) {


		Conta conta= new Conta(1337,1515);

		
		System.out.println(conta.getNumero());
		
		Cliente nome = new Cliente();
		
		nome.setNome("Angela Maria");
		System.out.println(nome.getNome());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
		
	System.out.println(titularDaConta);
		

	}

}
