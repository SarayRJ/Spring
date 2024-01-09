package e.studium.InyeccionDependencia;

public class Principal {

	public static void main(String[] args) {
		// Estamos inyectando la dependencia, al pasar como parámetro el constructor de
		// la clase Vehiculo3 la instancia de un objeto de la clase MotorDiesel que
		// implementa la interfaz IMotor.

		Vehiculo3 cocheDiesel = new Vehiculo3(new MotorDiesel());
		Vehiculo3 cocheGasolina = new Vehiculo3(new MotorGasolina());
	}

}
