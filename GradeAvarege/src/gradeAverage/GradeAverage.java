package gradeAverage;

import java.util.*;

public class GradeAverage {

    public static Scanner kbd = new Scanner(System.in);


    public static int sum( int[] gradeArray, int size){
        int sum = 0;
        int [] temp = gradeArray;
        for (int i = 0; i<gradeArray.length; i++){
            sum +=temp[i];
        }
        return sum;
    }

    
    public static double average(int[] gradeArray, int size){
        double average;
        int[] temp = gradeArray;
        int sum = 0;
        for (int i = 0; i<gradeArray.length; i++){
            sum +=temp[i];
        }


        average = (double)sum/(double)size;
        return average;
    }

    public static String letterGrade(double gradeAverage){
        String lettrGrade = "";

        int quotient = (int)gradeAverage/10; 
        int remainder = (int)gradeAverage%10; 

        switch(quotient){
        case 10:
            return "A+";
        case 9: 
            lettrGrade="A";
            break;
        case 8: 
            lettrGrade = "B";
            break;
        case 7: 
            lettrGrade="C";
            break;
        case 6: 
            lettrGrade = "D";
            break;
        default:
            return "F";

        }

        switch (remainder){
        case 0: case 1: case 2: case 3: case 4:
            lettrGrade+="-";
            break;
        case 7: case 8: case 9: 
            lettrGrade +="+";
        }

        return lettrGrade;
    }

    public static void DashLine(){
        for(int i = 0; i<20; i++){
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        int[] grades;
        int numGrades;
        double gradeAverage; 
        int total;

        String cont = "";

        do{

        System.out.print("HOW MANY GRADES DO YOU WISH TO ENTER?: ");

        numGrades = kbd.nextInt();
        grades = new int[numGrades];
        System.out.print("\n\nPLEASE ENTER " + numGrades + " GRADES:\n");


        for(int i = 0; i<grades.length; i++){

            grades[i]=kbd.nextInt();
            if(grades[i]>100 || grades[i]<0){
                System.out.println("GRADES CAN NOT EXCEED 100 or BE LESS THAN 1");
                i--;
            }               

        }

        total = sum(grades, numGrades);
        gradeAverage = average(grades,numGrades);


        DashLine();

        System.out.print("\nThe Total Sum is: " + total + "\n");

        System.out.printf("The Average is: %.2f \n",  gradeAverage);

        String ltrGrade;

        ltrGrade= letterGrade(gradeAverage);

        if(!(ltrGrade.equalsIgnoreCase("F"))){
            
            System.out.println("\nYour Final Letter Grade is a: "+ ltrGrade
                    +"\nYOU PASS!!");

        }
        else{
            System.out.println("\nYour Final Letter Grade is a: "+ ltrGrade
                    +"\nYOU FAILD!!");           
        }

        DashLine();

        System.out.println("\n\nDO YOU WANT TO ENTER MORE GRADES? Y or N");
        cont = kbd.next();
        for(int j = 0; j< 80; j++){
            System.out.println();
        }

        }while(cont.equalsIgnoreCase("y"));

        kbd.close();
    }

        }