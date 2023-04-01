import java.util.Scanner;

// /*Write a program that averages the synsets created for three months April, May and June. Declare and initialize variable to the synset entered for each month. Compute the average and write out the results, something like this:
// Synsets Entered for April: 12 
// Synsets Entered for May : 14 
// Synsets Entered for June: 8 
// Average Synset Entered: 11.333333 

// Check that your program prints the correct results.*/

// public class average_sunset_
// {
//     public static void main(String args[])
//     {
//         int April=12;
//         int May=14;
//         int June=8;
//         double Average=(April +May + June)/3.0;
//         System.out.println("Synsets Entered for April: "+ April);
//         System.out.println("Synsets Entered for May: "+ May);
//         System.out.println("Synsets Entered for June: "+ June);
//         System.out.println("Average Synset Entered:  "+ Average);
//     }
// }/
/*Write a program that computes summation of 1 to n numbers where  n can be any positive number. 
Declare and initialize variables and print the output as Value of n is : 5 
Sum of first  5 positive numbers  : 15 
Check the correctness of the result. */

// public class java_practice
// {

//     public static void main(String[] args) 
//     {
//         int n=5;
//         int summation=0;
//         for(int i=1;i<=n;i++) 
//         {
//         summation+=i;
//         }
//         System.out.println("The Value of N is: "+ n);
//         System.out.println("The Sum of first N Natural Number is: "+ summation);
//     }
// }
/*Write a program that uses two arrays of size 5.
One string array for storing names of students and one int array for storing marks obtained by the students. 
Assign values to the elements in the arrays. 
Print names and marks of students who have scored more than 35 marks.*/
// public class java_practice 
// {

//     public static void main(String args[]) 
//     {
//         String sort_names[];
//         int sort_marks[];
//         sort_names=new String[5];
//         sort_marks=new int[5];
//         sort_names[0]="Abhinav";
//         sort_names[1]="Anurag";
//         sort_names[2]="Chinmay";
//         sort_names[3]="Vivek";
//         sort_names[4]="Rajesh";
//         sort_marks[0]=34;
//         sort_marks[1]=38;
//         sort_marks[2]=30;
//         sort_marks[3]=45;
//         sort_marks[4]=100;
//         for(int i=0;i<5;i++)
//         {
//         if (sort_marks[i]>35) 
//         {
//             System.out.print("Names: "+ sort_names[i]);
//             System.out.println("  Marks: "+ sort_marks[i]);
//         }
//         }
//     }
// }
/*Write a program same as the above, 
but don’t use numbers (like 0, 1, 2…etc) to access the elements in the array.
Declare an int variable ‘i’ and use it as an index into the arrays.*/

public class java_practice {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create string array for storing names of students
        String[] names = new String[5];
        // Create int array for storing marks obtained by the students
        int[] marks = new int[5];

        // Assign values to the elements of the arrays
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks obtained by " + names[i] + ": ");
            marks[i] = sc.nextInt();
            // Consume newline character left by nextInt() method
            sc.nextLine();
        }

        // Print names and marks of students who have scored more than 35 marks
        System.out.println("Names and marks of students who have scored more than 35 marks:");
        for (int i = 0; i < 5; i++) {
            if (marks[i] > 35) {
                System.out.println(names[i] + ": " + marks[i]);
            }
        }

        // Close the scanner
        sc.close();
    }
}