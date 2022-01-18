package HiloConNombre;

public class HiloThread extends Thread{
	
	//Atributos
	
	//Metodos
	public HiloThread (int id) {
		super();
	}
	
	public HiloThread (String nombre)	{
		super(nombre);
			}
	

	public void run()	{
		//codigo del hilo
		System.out.println("Mi nombre es " + getName() + " y mi ID es " +getId());
	}
	
}
