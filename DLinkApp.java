import java.util.Scanner;
public class DLinkApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DlinkedList teacher = new DlinkedList();
        Dlink t;
        DlinkedList student = new DlinkedList();
        DlinkedList studentAttended= new DlinkedList();
        int Position;
        String TName = "";
        String SName = "";
        String Subject = "";
        String Day = "";
        String Time = "";
        int StudentID = 0;
        int ch = 1;
        
        while(ch != 0){
            System.out.print("Please enter your position :>\n");
            System.out.println("1- Teacher\n2- Student");
            Position = input.nextInt();
        switch(Position){
        case 1:
                System.out.println("\nEnter your data :-");
                System.out.print("Your Name :  ");
                TName = input.next();
                System.out.print("Subject :  ");
                Subject = input.next();
                System.out.print("\nDo you want to book a time or view your students ?");
                System.out.println("\n1 - Book time\n2 - View students");
                ch = input.nextInt();
            switch(ch){
                case 1:    
                System.out.print("Enter day and time you want to book :\n");
                System.out.print("Day :  ");
                Day = input.next();
                System.out.print("Time :  ");
                Time = input.next();
                //search if the time is booked or no
                while(teacher.searchTime(Day,Time) == 1){
                    System.out.println("This time is not available\nPlease enter another time.\n");
                    System.out.print("Day :  ");
                    Day = input.next();
                    System.out.print("Time :  ");
                    Time = input.next();
                }
                teacher.insertT(TName,Subject,Day,Time);
                System.out.println("Your time booked\n");
                teacher.displayT();
                break; 
                case 2:
                     if(studentAttended.isEmpty())
                     {
                        System.out.print("You don't have students\n");
                     }
                     else
                        studentAttended.displaySS(TName);        
                break;
                default:  
                System.out.print("Wrong Choise\n");    
             }
        break;
        case 2:
                System.out.println("\nEnter your data :-");
                        System.out.print("Student Name :  ");
                        SName = input.next();
                        System.out.print("StudentID :  ");
                        StudentID = input.nextInt();
                               
                System.out.print("Do you want to see all classes or search about specific teacher ?");
                System.out.println("\n1 - Classes list\n2 - Search about specific teacher");
                ch = input.nextInt();
                switch(ch){
                    case 1:
                         if(teacher.isEmpty())
                             System.out.print("There is No classes  are available\n");
                         else
                             teacher.displayAllT();
                         break;
                    case 2:
                         if(teacher.isEmpty())
                             System.out.print("There is No teachers are available\n");
                         else 
                         {
                             System.out.print("Enter Teacher Name :  ");
                             TName = input.next();
                         //search if the teacher has any classes
                         //display the teacher's classes
                             t=teacher.searchTeacher(TName);
                        if(t != null){
                        System.out.println("Teacher classes:");
                        teacher.displayST(TName);    
                        System.out.print("\nIf you want to attend the class enter 1 or 0 to go to tha home :  ");
                        ch = input.nextInt();
                        switch(ch){
                            case 0:
                        student.insertS(SName,StudentID);    
                        break;
                            case 1:                                
                        studentAttended.insertSS(SName,StudentID,TName);
                        System.out.print("You are attended now\n");
                        break;
                            default:  
                            System.out.print("Wrong Choise\n");
                        }
                        }                     
                        else
                        System.out.print("This teacher not found\n");
                        }
                break;
                default: 
                    System.out.print("Wrong Choise\n");
                }
            System.out.print("\nIf you want to another servise enter 1 or enter 0 to end the progrem :> ");
            ch = input.nextInt();
            break;
        default:  
                System.out.print("Wrong Choise\n");
        }
        }
       System.out.println("\n\n*** Thank you for using our system ***");
    }
}