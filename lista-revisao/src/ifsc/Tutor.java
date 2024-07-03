package ifsc;

public class Tutor {
	
	private String nomeCompleto;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	//  agregacao 1...1 (se fosse mais ArrayList
	private Gato gato;

	public Gato getGato() {
		return gato;
	}

	public void setGato(Gato gato) {
		this.gato = gato;
	}

}
