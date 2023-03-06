public class Hilo3 extends Thread 
{	
   public void run()
   {
       int x=1;
       

	while (x<100)
	{
	  System.out.println(x);
	  x++;
	}


   }

}