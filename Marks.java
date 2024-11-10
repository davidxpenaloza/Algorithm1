import java.util.Scanner;

/**
 * Write a description of class Marks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Marks
{
    // instance variables 

    /**
     * Constructor for objects of class Marks
     */
    public static void main(String[] args)
    {
        int numberOfStudents = 10;
        float[] mark = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give marks to 10 students");
        
        //assignment name
        System.out.println("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();
        System.out.println("Enter the marks: \n");
        //Code for avoid the loop from the use the sentence "continue". 
        //The user needs to write the adequate value. When users execute the true value according the problem condition. 
        //Then, they can entered the next value. Otherwise a message will be displayed: "invalide mark, please enter again"
        
        //Get marks from the user with validation
        for(int i=0; i<numberOfStudents; i++){
            
            float temp;

            do{
                temp = scanner.nextFloat();
                if(temp<0 || temp>10){
                   
                    System.out.println("Invalide marks,please enter again");    
                }
                } while (temp<0 || temp>10);
                mark[i] = temp;
            
            }
        //Showed user marks
        System.out.println("Entered marks");
        for(int i=0; i<numberOfStudents; i++){
            System.out.println(mark[i]);
            
        }
        
        //Calcute mark Max
        float Markmax=0;
        for(int i=0; i < numberOfStudents; i++){
            if (mark[i] > Markmax) {
                Markmax = mark[i];
            
            } 
        }
        
        //Calcute mark Min
        float Markmin = mark[0];
        for(int i=0; i < numberOfStudents; i++){
            if (mark[i] < Markmin) {
                Markmin = mark[i];
            
            } 
        }
             
        System.out.println("\nAssignment Name: "+ assignmentName);
        System.out.println("The maximun value of Mark is: " + Markmax);
        System.out.println("The minimun value of Mark is: " + Markmin);

        
    }
}
