package alejandro.figueroa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.TransactionManager;
import javax.transaction.Transactional;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

import alejandro.figueroa.entidades.Transaccion;

@Repository
public class TransaccionDAO {
	
	@PersistenceContext(unitName = "unidadPersistencia")
	private EntityManager em;
	
	@Transactional
	public void guardar(Transaccion t) {
		em.persist(t);
	}

	
}
