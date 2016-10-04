
/*
** Author:Colm Carey	Date: 23/02/2016
** Purpose: to write my own input class handling exception
*/


import java.io.*;

import.java.io.*;

public class ColmInput
{
	
 private static BufferedReader colmsIn;

 public static void init()
  {
   colmsIn = new BufferedReader(new InputStreamReader(System.in));
  }
 
 public static char getChar()
 {                
	 char c = 0;
	 
	 try
	   {
		 c = (char) System.in.read();
		 System.in.skip(2);
	   } 
	 catch(IOException e)
	 {
		 Sytem.out.printLn("Error in I/O");
	 }
	 return c;
	 
 }
 
 public static int getInt()
 {
	 
	 int o = "";
	 init();
	 try
	 {
		 0 =()
		 
	 }
	 
 }


}
