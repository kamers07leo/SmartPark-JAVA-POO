package Model;

public class Cliente extends Pessoa {

	private boolean mensalista;
	private boolean pagamentoMensalista;

	public Cliente() {
		
	}

	public Cliente(String nome, Long cpf, String telefone, boolean mensalista) {
		super(nome, cpf, telefone);
		this.mensalista = mensalista;
		this.pagamentoMensalista = false;
	}

	public boolean isMensalista() {
		return mensalista;
	}

	public void setMensalista(boolean mensalista) {
		this.mensalista = mensalista;
	}
	
	public boolean isPagamentoMensalista() {
		return pagamentoMensalista;
	}

	public void setPagamentoMensalista(boolean pagamentoMensalista) {
		this.pagamentoMensalista = pagamentoMensalista;
	}

	@Override
	public String toString() {
		return "Cliente Mensalista: " + mensalista  + ", Nome: " + super.getNome() + ", CPF: "
				+ super.getCpf() + ", Telefone: " + super.getTelefone() + "]";
	}
	
	
}
