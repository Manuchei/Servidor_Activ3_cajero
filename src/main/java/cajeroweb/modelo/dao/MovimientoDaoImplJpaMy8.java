package cajeroweb.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cajeroweb.modelo.entidades.Cuenta;
import cajeroweb.modelo.entidades.Movimiento;
import cajeroweb.modelo.repository.MovimientoRepository;

@Repository
public class MovimientoDaoImplJpaMy8 implements MovimientoDao {

	@Autowired
	private MovimientoRepository movimientoRepository;

	@Override
	public List<Movimiento> obtenerMovimientosPorCuenta(Cuenta cuenta) {
		return movimientoRepository.findByCuenta(cuenta);
	}

	@Override
	public Movimiento guardarMovimiento(Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}
}