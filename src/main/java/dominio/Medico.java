package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medico {
	
	@Id
	@Column(name = "cod_medico")
	private int codigo;
	private String nome;
	private String contato;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "id_especialidade")
	private Especialidade espec;
	
	public Medico() {
		// TODO Auto-generated constructor stub
	}
	public Medico(int codigo, String nome, String contato, Endereco endereco, Especialidade espec) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
		this.espec = espec;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Especialidade getEspec() {
		return espec;
	}
	public void setEspec(Especialidade espec) {
		this.espec = espec;
	}
	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", nome=" + nome + ", contato=" + contato + ", endereco=" + endereco
				+ ", espec=" + espec + "]";
	}
	
	
}
