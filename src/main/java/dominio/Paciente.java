package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@Column(name = "cod_paciente")
	@NotNull
	private int codPaciente;
	
	private String nome;
	
	private String telefone;
	
	@Column(name = "data_aniversario")
	private Date dataAniversario;
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
	
	public Paciente() {
	}

	public Paciente(@NotNull int codPaciente, String nome, String telefone, Date dataAniversario, Endereco endereco) {
		super();
		this.codPaciente = codPaciente;
		this.nome = nome;
		this.telefone = telefone;
		this.dataAniversario = dataAniversario;
		this.endereco = endereco;
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
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

	@Override
	public String toString() {
		return "Paciente [codPaciente=" + codPaciente + ", nome=" + nome + ", telefone=" + telefone
				+ ", dataAniversario=" + dataAniversario + ", endereco=" + endereco + "]";
	}
	
	
}
