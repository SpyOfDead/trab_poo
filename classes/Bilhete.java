package projetoCompleto;

/**
 *
 * @author xremi and Vini
 * 
 */
public class Bilhete {

	private int id;
	private double preco = 15;
	private Pessoa pessoa;

	public Bilhete(int id, String primeiroNome, String segundoNome) {

		pessoa = new Pessoa(id, primeiroNome, segundoNome);
		this.id = id;
		this.descontoDoBilhete();

	}

	public Bilhete(int id, String primeiroNome, String segundoNome, String sexo, String paisDeOrigem, int anoNascimento,
			int mesNascimento, int diaNascimento) {

		pessoa = new Pessoa(id, primeiroNome, segundoNome, sexo, paisDeOrigem, anoNascimento, mesNascimento,
				diaNascimento);
		this.id = id;
		this.descontoDoBilhete();

	}

	public void descontoDoBilhete() {

		int idade = pessoa.calcularIdade();
		boolean verificador = pessoa.calcularIdade() != 0;

		if (verificador) {

			if (idade <= 9) {

				preco = preco - preco * (25 / 100);
			}
			if (idade <= 18 && idade > 9) {

				preco = preco - preco * (10 / 100);

			} else {
				System.out.println("Sem desconto!\n");
			}
		}

	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String toString() {
		return "ID: " + id + "\nPreço: " + preco + "\n" + pessoa;
	}

	public boolean equals(Object bilhete) {
		if (bilhete != null && this.getClass() == bilhete.getClass()) {

			Bilhete aux = (Bilhete) bilhete;

			return this.id == aux.id && this.preco == aux.preco && this.pessoa.equals(aux.getPessoa());

		}

		return false;

	}

}
