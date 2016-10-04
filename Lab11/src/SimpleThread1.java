/*Author: Colm Carey	Date:12/04/16
 ** Create a Simple Thread by sub classing class Thread
 *  Create a class called SimpleThread1 that extends Thread
 */
  // extends class Thread from java API
public class SimpleThread1 extends Thread{
	static int num; // counts number of objects constructed
	
		
		public SimpleThread1( ) { // run as default when thread has no name
			
			  this("Default "+num++);
			}
		
		public SimpleThread1( String name){  // run as default when thread has a name
			
			super(name);
			}

		public void run(){
			System.out.println(getName()+ "Is Alive !");  // print name and message Is Alive !
			
		}
	}


