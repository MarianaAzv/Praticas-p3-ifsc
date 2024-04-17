package ifsc;

public class Produto {

	private String Fabricante;

	private Long CodBarras;

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public Long getCodBarras() {

		return CodBarras;
	}

	public void setCodBarras(Long codBarras) {
		CodBarras = codBarras;
	}

}
