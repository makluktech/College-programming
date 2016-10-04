/*Author: Colm Carey	Date:12/04/16
 ** To try thread sample from common drive
 */
public class CountThreadRun implements Runnable {
   private int start;
   private int finish;

   public CountThreadRun(int from, int to) {
      this.start = from;
      this.finish = to;
   }

   public void run() {
      System.out.println(Thread.currentThread() + " started executing...");
      
      for (int i=start; i <= finish; i++) 
      {
         System.out.print (i + " ");
      }
     System.out.println(Thread.currentThread() + " finished executing.");
   }
}
