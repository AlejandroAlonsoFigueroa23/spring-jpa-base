package alejandro.figueroa.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import alejandro.figueroa.dao.TransaccionDAO;
import alejandro.figueroa.entidades.Transaccion;

@Controller
public class ControladorInicio {
	
	@Autowired
	private TransaccionDAO trxDAO;
	
	@RequestMapping(value = "/hola")
	public String holaMundo() {
		this.trxDAO.guardar(new Transaccion());
		return "hola";
	}

}
