
public class DlinkedList {
	

	private Dlink first;
	private Dlink last;


	public  DlinkedList()      //constructor 
	{
		first= null;
		last=null;
	}
	
	public boolean isEmpty()           // true if no links
	{
		return(first==null);
	}
	
	public void insertT(String N, String S, String D, String T){ //insert teacher
	    Dlink newLink = new Dlink(N,S,D,T);
	    if(isEmpty())
	      last = newLink;
	    else
	      first.previous = newLink;
	    newLink.next = first;
	    first = newLink;
	}
	
	public void insertSS(String N, int ID , String T){  //insert student who attended
	    Dlink newLink = new Dlink(N,ID,T);
	    if(isEmpty())
	      last = newLink;
	    else
	      first.previous = newLink;
	    newLink.next = first;
	    first = newLink;
	 } 
	
        public void insertS(String N, int ID){  //insert student
	    Dlink newLink = new Dlink(N,ID);
	    if(isEmpty())
	      last = newLink;
	    else
	      first.previous = newLink;
	    newLink.next = first;
	    first = newLink;
	 } 
        
        
	public Dlink displayT(){    //dispaly one teacher
	   Dlink temp = first;
	   System.out.println("\nYour Data:> \n");
	  
	   temp.displayLinkT();
	   temp = temp.next;
	   
	   return temp;
	  }
	 
	public Dlink displayAllT(){  //display all booked teachers
	   Dlink temp = first;
	   System.out.println("\nClasses List:> \n");
	   int i = 1;
	   while( temp != null){
	    System.out.print(i + "-  ");
	    temp.displayLinkT();
	    temp = temp.next;
	    System.out.println("--------------------------\n");
	    i++;
	   }
	   return temp;
	  } 
	  
	   
	public int searchTime(String D, String T){ //search about booked time
	    Dlink temp= first;
	    int current = 0;
	    while(temp != null){
	        if(temp.Day.equals(D) && temp.Time.equals(T))
                {  
                    current = 1;
                    break;
                }
	        temp=temp.next;
	       }
	    return current;
	   }
	   
        public Dlink searchTeacher(String N){  //seearch about teacher
           Dlink current=first;
           while(!current.Tname.equals(N))
            {
            if (current.next==null)
                return null;
            else
                current = current.next;
            }
            return current;
        }
        
	public Dlink displayST(String name){  // dispay specific teachers who found
	   Dlink temp = first;
           while( temp != null){
	   if( temp.Tname.equals(name)){
           System.out.println("\n--------------------------\n");
	   temp.displayLinkT();}
	   temp = temp.next; } 
	   return temp;
	}

         public Dlink displaySS(String name){  // dispaly specific students who attended
	    Dlink temp = first;
            //int i;
	    while( temp != null)
                if(temp.Tname.equals(name)){
    	      temp.displayLinkSS();
    	      temp = temp.next;
    	      System.out.println("------------------------------\n");
    	     // i++;
	    }
	    return temp;
	   }



}
