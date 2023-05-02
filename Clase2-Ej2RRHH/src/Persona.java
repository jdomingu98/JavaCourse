/* EJERCICIO NUMERO 2:
	ESTRUCTURA DEL PROGRAMA:
		- Implementar clases: Clase de Persona y Clase de Empleado. Donde cada clase debe tener atributos propios de la misma.
			Persona: Nombre, Apellido, Ciudad, Edad
		- Aplicar herencia entre clases
		- Implementar Interfaces
		- Ficheros
		- Manejo de fechas
	ENUNCIADO:
		Nos contrataron de una empresa para desarrollar un sistema de recursos humanos, donde por consola se debe ingresar
			la siguiente información de los empleados:
		- Posición: El cargo que tiene actualmente
		- Salario: El salario que tiene actualmente
		- Fecha de ingreso: La fecha en la que ingreso (AÑO, MES, DIA)
	En base a esta información, se debe implementar una interfaz que calcule lo siguiente:
		- Salario_neto: Salario * 0.80
	El programa debe generar un archivo de salida que se llame "informacion_empleados_fechaDeHoy") Donde la fecha de hoy
	esta almacenada en una variable.
	
	(!) Hacer para al menos 3 empleados (!)
	ENTREGABLES:
		- Codigo del proyecto. */

public abstract class Persona
{
	String	nombre;
	String	apellido;
	String	ciudad;
	int		edad;
}
