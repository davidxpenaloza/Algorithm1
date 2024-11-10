import java.util.Scanner; //import the Scanner class for user input

/**
 * Write a description of class Marks here.
 *
 * @author (David Penaloza)
 * @version (Algorithm1)
 */
public class Marks //A pucblic class named Marks is defined
{

    /**
     * Constructor for objects of class Marks
     */
    public static void main(String[] args) //The main method, is the entry point of Java application.
    {
        int numberOfStudents = 30; //The number of students to 30 is inicializated.
        float[] mark = new float[numberOfStudents]; //An array is created to store marks for each student, where each value is float.
        Scanner scanner = new Scanner(System.in);//A scanner object was created for user input
        
        System.out.println("Give marks to 30 students"); //Prompt user to enter marks
        System.out.println("Enter the assignment name: "); //Prompt user to enter the assignment name 
        String assignmentName = scanner.nextLine(); //Read the assigenment name from user input
        System.out.println("Enter the marks: \n");//Prompt user to enter marks for the students and change of Line to the next
        //Code for avoid the loop from the use the sentence "continue". 
        //The user needs to write the adequate value. When users execute the true value according the problem condition. 
        //Then, they can entered the next value. Otherwise a message will be displayed: "invalide mark, please enter again"
        
        //Get marks from the user with validation
        for(int i=0; i<numberOfStudents; i++){ //create variable i as a counter, the next condition is a loop's condition, finally is a increment the value of i by 1 after each iteration.
            
            float temp; //The temporary variable temp is defined to store current input
            //Started to create do-while loop, the code block will excecute once, before analizing if condition is not false.
            do{
                temp = scanner.nextFloat(); //read float input for the marks
                if(temp<0 || temp>30){ //Condition
                   
                    System.out.println("Invalide marks,please enter again");//inform user wrong value started  
                }
                } while (temp<0 || temp>30); //Condition is repeated until correct input is started
                mark[i] = temp; // In the array is store the valid mark
            
            }
        //Showed user marks
        System.out.println("Entered marks"); //Is the header for marks put on view
        for(int j=0; j<numberOfStudents; j++){ //create variable "j" as a counter, the next condition is a loop's condition, finally is a increment the value of "j" by 1 after each iteration.          
            System.out.println(mark[j]); //The mark of each student is printed
            
        }
        
        //Calcute mark Max
        float Markmax=0; // The variable Markmax is initialize in cero and defined as float
        for(int k=0; k<numberOfStudents; k++){ //create variable "k" as a counter, the next condition is a loop's condition, finally is a increment the value of "k" by 1 after each iteration.
           if (mark[k] > Markmax) {//If the current mark fulfill the condition
                Markmax = mark[k]; //Then, the maximum value of the mark will update
            
            } 
        }
        
        //Calcute mark Min
        float Markmin = mark[0]; // The variable Markmin is initialize with the initial mark and defined as float
        for(int t=0; t<numberOfStudents; t++){ //create variable "t" as a counter, the next condition is a loop's condition, finally is a increment the value of "t" by 1 after each iteration.
            if (mark[t] < Markmin) { //If the current mark fulfill the condition
                Markmin = mark[t]; //Then, the minimun value of the mark will update
            
            } 
        }
             
        System.out.println("\nAssignment Name: "+ assignmentName); //The assignment name is printed
        System.out.println("The maximun value of Mark is: " + Markmax); //The maximum value is printed
        System.out.println("The minimun value of Mark is: " + Markmin); //The minimun value is printed

        
    }
}
