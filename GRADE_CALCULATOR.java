import java.util.*;
public class GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of books");
        int n = sc.nextInt();
        sc.nextLine();
        String[] books = new  String[n];
        int[] marks = new  int[n];
        int totalMarks =0;
        for (int i = 0; i < n; i++) {

            System.out.println("Enter a  name of books "+(i+1));
            books[i] = sc.nextLine();
            System.out.println("Enter a  marks of books "+(i+1));
            marks[i] = sc.nextInt();
            sc.nextLine();
            while (marks[i] < 0 || marks[i]>100){
                System.out.println("Invaid Marks! Enter a  marks of books "+(i+1));
                marks[i] = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.println("**********************************************");
        System.out.println("Book Name\t Marks");
        System.out.println("**********************************************");
        for (int i = 0; i < n; i++){
            System.out.println(books[i]+"\t\t"+marks[i]+"\n");
            totalMarks += marks[i];
        }
        int totalObt = n * 100;
        double Percentage = ((double)totalMarks / totalObt)*100 ;
        if(Percentage>=90){
            System.out.println("Your Garde is A+");
        }
        else if (Percentage >= 80){
            System.out.println("Your Garde is A");
        }
        else if (Percentage >= 70){
            System.out.println("Your Garde is B+");
        }
        else if (Percentage >= 60){
            System.out.println("Your Garde is B");
        }
        else if (Percentage >= 50){
            System.out.println("Your Garde is C");
        }
        else if (Percentage >= 40){
            System.out.println("Your Garde is D");
        }
        else {
            System.out.println("Your Garde is F");
        }
        System.out.println("total Marks "+totalMarks +"\t Average Percentage "+Percentage+"%");
        System.out.println("**********************************************");
    }
}