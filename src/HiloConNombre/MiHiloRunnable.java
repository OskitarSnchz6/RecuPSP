package HiloConNombre;

public class MiHiloRunnable {
	public static void main(String[] args) {

        //Primero, construye un objeto MiHilo.
        HiloRunable uno=new HiloRunable("Jamaica");
        HiloRunable dos=new HiloRunable("Fiji");
        
        //Luego, construye un hilo de ese objeto.
        Thread hilo1=new Thread(uno);
        Thread hilo2=new Thread(dos);

        //Finalmente, comienza la ejecución del hilo.
        hilo1.start();
        hilo2.start();

        for (int i=0; i<50;i++){
        }try{
            Thread.sleep(100);
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
	}
}