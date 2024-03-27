package pjAula7;

/* Classe de Modelagem Conceitual de Produto
 * @autor Caio Rodrigues da Silva
 * @data 26/03/2024
 */

public class Produto {

	private int codigo;
	private String descricao;
	private float quantidade;
	private boolean status;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return " Codigo " + getCodigo() + " Descricao " + getDescricao() + " Quantidade " + getQuantidade()
				+ (isStatus() ? " Ativo " : " Inativo");
	}

}
