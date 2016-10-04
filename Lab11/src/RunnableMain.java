/*Author: Colm Carey	Date:12/04/16
 * 
  Creating a Thread using the Runnable Interface
  Rename your ThreadedMain class and save it as RunnableMain (don't forget to rename your constructors).
  Alter statement 3 (from Task 4 above) to the following:
 Thread t = new Thread(new RunnableMain);
 */

public class RunnableMain extends Thread {
	
	
	
static int num; // counts number of objects constructed
	
	
	public RunnableMain( ) { // run as default when thread has no name
		
		System.out.println(getName()+ "Is Alive !");
		}
	
	public RunnableMain( String name){  // run as default when thread has a name
		
		super(name);
		}

	public void run(){
		System.out.println(getName()+ "Is Alive !");  //  print name and message Is Alive !
		
	}
	// MAIN METHOD
	 static public void main(String[] args) {
		
		 System.out.println("Hello World!");
		 Thread printAll = new RunnableMain("Joe Bloggs"+" "); 
		 printAll.start(); //run the thread
		 printAll.yield() ;  // print in order of hello world - joe bloggs is alive - goodbye from main
		 System.out.println("Goodbye from main"); 
	  }

}



