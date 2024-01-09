package e.studium.InyeccionDependencia;

public class Vehiculo3 {

	// Aqui separamos la dependencia de la clase Motor totalmente.

	private IMotor m;

	public Vehiculo3(IMotor motorVehiculo) {
		m = motorVehiculo;
	}

	public int getRevolucionesMotor() {
		return m.getRevoluciones();
	}

}
