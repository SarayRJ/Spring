package es.studium.PrimerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		// Iniciamos el contexto
		// Establecemos la conexión con el contenedor de IoC
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans2.xml");

		// Utilizamos los beans.
		// Obtenemos un objeto bean Saludo y podemos hacerlo
		// de tres formas diferentes.

		/*
		 * 1) Pasando como parámetro el id del bean que queremos obtener. Nos obliga a
		 * hacer un casting
		 */
		Saludo saludo = (Saludo) appContext.getBean("saludamos");
		/* Solamente proporcionamos el tipo del bean que queramos obtener */
		// 2) Pasando dos parámetros. El id y la clase del bean, ESTE ES EL MEJOR.
		Saludo saludo2 = appContext.getBean("saludamos", Saludo.class);

		/*
		 * 3) Pasando como parámetro la clase del bean. Salta una excepción si el bean
		 * está repetido.
		 */
		// Saludo saludo3 = appContext.getBean(Saludo.class);
		// Obtenemos el valor del atributo del bean y lo
		// mostramos por consola.

		System.out.println(saludo.getSaludo());

		((ClassPathXmlApplicationContext) appContext).close();

	}

}
