public class Hilo4 extends Thread 
{	
   public void run()
   {
       int x=1;
       

	while (x<10)
	{
	   System.out.println("Hola soy un codigo");
	   x++;
	}
	
	if (x >= 10)
	{
          System.out.println("He terminado");
	}




   }

}