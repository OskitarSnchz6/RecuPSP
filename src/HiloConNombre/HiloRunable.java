package HiloConNombre;

class HiloRunable implements Runnable {
    String nombreHilo;

    HiloRunable(String nombre){
        nombreHilo=nombre;
    }
    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aquí
    public void run(){
        try {
            for (int i=0; i<10; i++){
                Thread.sleep(200);
                System.out.println(i+" "+nombreHilo);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("FIN! " + nombreHilo);
    }
}