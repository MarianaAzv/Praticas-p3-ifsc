package ifsc;

public class Smartphone extends Produto {

	private String dimensoesTela;
	private long armazenamento;

	public String getDimensoesTela() {
		return dimensoesTela;
	}

	public void setDimensoesTela(String dimensoesTela) {
		this.dimensoesTela = dimensoesTela;
	}

	public long getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(long armazenamento) {
		this.armazenamento = armazenamento;
	}
}
