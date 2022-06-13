package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConsultaPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "cod_paciente")
	private Paciente paciente;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "cod_medico")
	private Medico medico;
	
	@Id
	private Integer horaConsulta;

	public ConsultaPK(Paciente paciente, Medico medico, Integer horaConsulta) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.horaConsulta = horaConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Integer getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(Integer horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	@Override
	public String toString() {
		return "ConsultaPK [paciente=" + paciente + ", medico=" + medico + ", horaConsulta=" + horaConsulta + "]";
	}

	
}
