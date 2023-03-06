public class General 
{
	public static void main (String []args)
	{
		ReproductorHilo reproducir = new ReproductorHilo();
		reproducir.start();	
		hilosprueba1 calcular = new hilosprueba1();
		calcular.start();
		Hilo3 adicionar = new Hilo3();
		adicionar.start();
		Hilo4 imprimir = new Hilo4();
		imprimir.start();
	}
}