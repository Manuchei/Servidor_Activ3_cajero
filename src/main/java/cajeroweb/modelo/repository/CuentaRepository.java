package cajeroweb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cajeroweb.modelo.entidades.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

	@Query("SELECT c FROM Cuenta c WHERE c.idCuenta = ?1")
	public Cuenta buscarPorCuenta(int idCuenta);

	public Cuenta findByIdCuenta(int idCuenta);

}