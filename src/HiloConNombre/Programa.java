package HiloConNombre;

public class Programa {
	public static void main (String[] args)	{
		
		HiloThread hilo1 = new HiloThread("Oscar");
		hilo1.start();
		System.out.println("Se ha creado el hilo " + hilo1.getName());
	}
}
