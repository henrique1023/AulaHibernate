package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.ConsultaPK;
import dominio.Endereco;
import dominio.Especialidade;
import dominio.Medico;
import dominio.Paciente;

public class Programa {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco(null, "Rua dos loucos", 5, 05656, null);
		Paciente p1 = new Paciente(1, "joão", "1188552222", e1);
		Especialidade esp1 = new Especialidade(22, "pediatra");
		Medico medico = new Medico(12, "Joaquim", "11255226222", e1, esp1);
		ConsultaPK consulta = new ConsultaPK(p1, medico);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		em.persist(e1);
		em.persist(p1);
		em.persist(esp1);
		em.persist(medico);
		
		em.getTransaction().commit();
		System.out.println("Pronto" + e1 + p1 + esp1 + medico+ consulta);
		
		em.close();
		emf.close();
	}

}
