package reto;

public class Funciones2 {
public static int Celsiustemperatura(int n1) {
	return (n1 * 9 / 5) + 32;
} //de celsius a farenheit
public static int FarenheitTemperatura(int n1) {
	return (n1 - 32) * 5 / 9;
} //de farenheit a celsius
public static double litrosVolumen(int n1) {
	return n1 * 0.264172;
}// de litros a galones
public static double galonesVolumen(int n1) {
	return n1*3.785;
}//de galones a litros
}
