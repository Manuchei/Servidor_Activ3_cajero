package cajeroweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cajeroweb.modelo.entidades.Movimiento;
import cajeroweb.modelo.entidades.Cuenta;
import java.util.List;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {

	List<Movimiento> findByCuenta(Cuenta cuenta);

	List<Movimiento> findByOperacion(String operacion);
}
