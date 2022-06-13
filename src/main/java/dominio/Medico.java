package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Medico {
	
	@Id
	@Column(name = "cod_medico")
	@NotNull
	private int codigo;
	
	private String nome;
	private String contato;
	private String email;
	
	@Column(name = "data_aniversario")
	private Date dataAniversario;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "id_especialidade")
	private Especialidade espec;
	
	public Medico() {
		// TODO Auto-generated constructor stub
	}

	public Medico(@NotNull int codigo, String nome, String contato, String email, Date dataAniversario,
			Endereco endereco, Especialidade espec) {
		this.codigo = codigo;
		this.nome = nome;
		this.contato = contato;
		this.email = email;
		this.dataAniversario = dataAniversario;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
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
		return "Medico [codigo=" + codigo + ", nome=" + nome + ", contato=" + contato + ", email=" + email
				+ ", dataAniversario=" + dataAniversario + ", endereco=" + endereco + ", espec=" + espec + "]";
	}

	
	
}
