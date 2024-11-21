package cajeroweb.modelo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import cajeroweb.modelo.entidades.Cuenta;
import cajeroweb.modelo.repository.CuentaRepository;

public class CuentaDaoImplJpaMy8 implements CuentaDao {

	@Autowired
	private CuentaRepository crepo;

	@Override
	public Cuenta login(int idCuenta) {
		// TODO Auto-generated method stub
		return crepo.buscarPorCuenta(idCuenta);
	}

}
