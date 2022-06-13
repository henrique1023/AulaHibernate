package persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.SessionFactory;

import dominio.Paciente;

public class PacienteDao implements IObjDao<Paciente> {
	
	private SessionFactory sf;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public PacienteDao(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void insere(Paciente t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(t);
		transaction.commit();	
	}

	@Override
	public void modifica(Paciente t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(t);
		transaction.commit();
	}

	@Override
	public void remove(Paciente t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(t);
		transaction.commit();
	}

	@Override
	public Paciente busca(Paciente t) {
		EntityManager entityManager = sf.createEntityManager();
		t = entityManager.find(Paciente.class, t.getCodPaciente());
		return t;
	}

	@SuppressWarnings({ "unused", "unchecked" })
	@Override
	public List<Paciente> lista() {
		String sql = "Select * from paciente";
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		Query query = entityManager.createNativeQuery(sql);
		List<Object[]> pacienteResultSet = query.getResultList();
		List<Paciente> paciente = new ArrayList<>();
		for(Object[] e : pacienteResultSet) {
			Paciente pa = new Paciente();
			pa.setCodPaciente(Integer.parseInt(e[0].toString()));
			try {
				pa.setDataAniversario(sdf.parse(e[1].toString()));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			pa.setNome(e[2].toString());
			pa.setTelefone(e[3].toString());
//			pa.setEndereco();
			
			paciente.add(pa);
		}
	
		return paciente;
	}

}
