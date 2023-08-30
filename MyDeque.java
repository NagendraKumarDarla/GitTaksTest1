package com.Practise;
import java.awt.HeadlessException;
import java.util.*;

public class MyDeque {
	
	

        public static void main(String[] args) {
        	// Scan the elements	
            Scanner in = new Scanner(System.in);
            Deque deque = new LinkedList<Integer>();
         	System.out.println("enter the size of array: ");
            int n=in.nextInt();
            // Store the elements into deque
            for(int i=0;i<n;i++) {
              	System.out.println("Enter the element_"+i+":");
             	deque.add(in.nextInt());
            }
            
            System.out.println(deque);
            System.out.println("Enter the size of contiguous array:");
            int array_size = in.nextInt();
            // Equation for no.of contiguous arrays can be generated based on size 
            System.out.println("Total number of contiguous arrays are:" +(n-(array_size-1)));
            
            //size of the array should be grater than size contiguous array(it should be sub set of orginal array)
            if(n>array_size)
            {
            	//final Set<int[]> arrays = new HashSet<int[]>();
//            	final Set<int[]> arrays = new HashSet<int[]>();
            	ArrayList<String> list = new ArrayList<>();
            	// In order to get listiterator 
            	LinkedList l=(LinkedList)deque;
                
            	//logic to get sub arrays. will explain if needed.
            	outer: for(int arrayNum=0;arrayNum<(n-(array_size-1));arrayNum++)
            	{
            		final int[] newArray = new int[array_size];	
            		Iterator<Integer> iter = l.listIterator(arrayNum);
            		int count = 0;
            		while(iter.hasNext())
            		 {            		
            		  if(count<array_size)
            		   {	
            			 for (int j = 0; j < array_size; j++)
            			   {
            				  System.out.println(iter.next());//This "iter" object is created on converted linkedlist from deque.
            				  
							  
            				  // try to add this element(iter.next) to newArray.
            				  newArray[j] =(int) l.get(j);
            				  //int i1 = l.get(j);
            				  count++;
            			   }
            			 int output=MyDeque.checkArray(newArray);
            			 if(output==array_size) 
            			 {
            			 System.out.println("max unique number of elements in contiguous array from given input are:"+output);
            			 break outer; 
            			 }
            		   }break;
                    }
//            	    arrays.add(newArray);
//            	    System.out.println("successfully added and Hashset size is:"+arrays.size());
                }
            }
        }

        public static int checkArray(int[] array) {
    	int count=1;
    	for (int i = 0; i < array.length - 1; i++)
    	{
    	    for (int k = 0; k < array.length - 1; k++)
    	    {
    	        if (array[i] != array[k + 1]) {
    	            System.out.println(array[i] + " not the same with  " + array[k + 1] + "\n");
    	            count++;
    	        }
    	    }
        }
		return count; 
   }
}
    
// above we can get hash set containg arrays. now we have to compare each element of array to get unique elements
//following code help you out
/*for (int i = 0; i < a.length - 1; i++) {
    for (int k = 0; k < a.length - 1; k++) {
        if (a[i] != a[k + 1]) {
            System.out.println(a[i] + " not the same with  " + a[k + 1] + "\n");
            // put some counter  
        }
    }
    // one more thing we can do is .. if we check counter while comparing elements so that counter value is equals to array_size
     then we can declare output as our final ouput. 
}
*/




/*           
            int m = in.nextInt();
            int j=1;
            Set<Integer> val =  new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                if(j==m){
                    int noF = deque.peekFirst();
                    int noL = deque.pollFirst();
                    int uVal = val.size();
                    if(noF > uVal){
                        deque.addFirst();
                    } else if(noL < uVal){
                        deque.addLast();
                    }
                    
                    val.clear();
                    //val =  new HashSet<Integers>();
                    j=0;
                }
                val.add(num);
                j++;
            }
            System.out.println(deque.pollLast());
        }
    }*/



