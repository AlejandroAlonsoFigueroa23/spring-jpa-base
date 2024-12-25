package alejandro.figueroa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACCIONES")
public class Transaccion {

	@Id
	@Column(name = "ID_TRANSACCION")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransaccion;
}
