package ar.com.codoacodo;

public class Main {

	//voy a darle play al programa
	public static void main(String[] args) {
			
		System.out.println("hola mundo");
			
		//voy a crear una instancia de la clase Auto
				
		Auto miPrimerAuto = new Auto();//nace mi auto
		/*
		 * Auto miPrimerAuto; defini un objeto(no nacio)
		 * miPrimerAuto = new Auto(); nace
		 * esta forma es util para usar en if si quiero que nazca con
		 * determinado constructor, primero defino el objeto
		 * y dependiendo la rama del if nace con ciertas caracteristicas
		 */
		
		
		//aca ya puedo usar los metodos de ese auto	
		miPrimerAuto.mostrarInfo();
			
		//ejecutar el metodo encender()
		miPrimerAuto.encender();
			
		miPrimerAuto.mostrarInfo();
	}
}
