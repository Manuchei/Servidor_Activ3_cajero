package cajeroweb.modelo.dao;

import java.util.List;
import cajeroweb.modelo.entidades.Cuenta;
import cajeroweb.modelo.entidades.Movimiento;

public interface MovimientoDao {

	// Con este método obtenemos los movimientos de la cuenta
	List<Movimiento> obtenerMovimientosPorCuenta(Cuenta cuenta);

	// COn este metodo guardamos los movimientos
	Movimiento guardarMovimiento(Movimiento movimiento);

}
