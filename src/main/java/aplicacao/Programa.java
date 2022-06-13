package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.ConsultaPK;
import dominio.Endereco;
import dominio.Especialidade;
import dominio.Medico;
import dominio.Paciente;

public class Programa {

	public static void main(String[] args) throws ParseException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Endereco end = new Endereco(2, "Rua dos andes", 22, 0202020, "dadsdsdasd");
		Especialidade esp = new Especialidade(1, "Cardiologista");
		Paciente paciente = new Paciente(0, "João", "1198965694", sdf.parse("23/10/1519"), end);
		Medico med = new Medico(5, "Joaquim junior", "213213213", "5asdasasd@masdas.com", sdf.parse("15/05/1965"), end, esp);
		ConsultaPK consu = new ConsultaPK(paciente, med, 12);
		
		em.getTransaction().begin();
	
		em.persist(esp);
		em.persist(paciente);
		em.persist(med);	
		em.persist(end);
		em.persist(consu);
		
		em.getTransaction().commit();
		System.out.println("Pronto");
		
		em.close();
		emf.close();
		
	}

}
