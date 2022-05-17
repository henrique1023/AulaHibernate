package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@Column(name = "num_benefic")
	private int numBeneficiario;
	
	private String nome;
	
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	public Paciente(int numBeneficiario, String nome, String telefone, Endereco endereco) {
		this.numBeneficiario = numBeneficiario;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public int getNumBeneficiario() {
		return numBeneficiario;
	}
	public void setNumBeneficiario(int numBeneficiario) {
		this.numBeneficiario = numBeneficiario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Paciente [numBeneficiario=" + numBeneficiario + ", nome=" + nome + ", telefone=" + telefone
				+ ", endereco=" + endereco + "]";
	}
	
	
}
