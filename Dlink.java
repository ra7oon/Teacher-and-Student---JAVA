
public class Dlink {	
	
	//public String Position;
	public String Tname;
        public String Sname;
	public String Subject;
	public String Day;
	public String Time;
	public int StudentID,I;
	public Dlink next;
	public Dlink previous;
	
	
	/*----- Constructor ---------*/
	public Dlink(String N, String S, String D, String T) //For teachers
	{
		Tname = N;
		Subject = S;
		Day = D;
		Time = T;
	}
	
	public Dlink(String SN, int ID , String TN) //For student who want to attend
	{
            Sname = SN;    
	    StudentID = ID;
            Tname = TN;

	}
        
        
        public Dlink(String  SN, int ID)   //For students
        {
            Sname = SN;    
            StudentID = ID; 
        }        
	
	public void displayLinkT() //For one teacher 
	{	
	  
	      System.out.print("Teacher name is : " + Tname + "\n");
	      System.out.print("The subjet is : " + Subject + "\n");
	      System.out.print("Day : " + Day + "\t Time : " + Time + "\n");
	      System.out.print("------------------------------------\n");
           
	}
	
	public void displayLinkS() // For one student 
	{	
	  
	      System.out.print("Student name is : " + Sname + "\n");
	      System.out.print("The student ID is : " + StudentID + "\n");
	      System.out.print("The subjet is : " + Subject + "\n");
              System.out.print("Day : " + Day + "\t Time : " + Time + "\n");
              System.out.print("------------------------------------\n");
           
	}
	
          public void displayLinkSS()  // For student who attend
	{	
	  
	      System.out.print("Teacher name is : " + Tname + "\n");
              System.out.print("------------------------------------\n");
              System.out.print("Student name is : " + Sname + "\n");
	      System.out.print("The student ID is : " + StudentID + "\n");

	}
}
