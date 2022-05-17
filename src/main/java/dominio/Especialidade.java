package dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidade {
	
	@Id
	private int idEspecialidade;
	
	private String especialidade;
	
	public Especialidade(int idEspecialidade, String especialidade) {
		super();
		this.idEspecialidade = idEspecialidade;
		this.especialidade = especialidade;
	}

	public int getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(int idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Especialidade [idEspecialidade=" + idEspecialidade + ", especialidade=" + especialidade + "]";
	}
	
	
}
