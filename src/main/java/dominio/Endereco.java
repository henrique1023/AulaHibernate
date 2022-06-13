package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@Column(name = "id_endereco")
	private Integer idEndereco;
	
	private String logradouro;
	
	@Column(name = "num_porta", length = 4)
	private Integer numPorta;
	
	private Integer cep;
	
	private String complemento;
	
	
	public Endereco(Integer idEndereco, String logradouro, Integer numPorta, Integer cep, String complemento) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.numPorta = numPorta;
		this.cep = cep;
		this.complemento = complemento;
	}
	public Integer getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumPorta() {
		return numPorta;
	}
	public void setNumPorta(Integer numPorta) {
		this.numPorta = numPorta;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", numPorta=" + numPorta + ", cep="
				+ cep + ", complemento=" + complemento + "]";
	}
	
	
}
