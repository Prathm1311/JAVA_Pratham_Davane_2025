
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of math ");
        int math = sc.nextInt();
        System.out.print("Enter Marks of physic ");
        int physic = sc.nextInt();
        System.out.print("Enter Marks of chemistry ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Marks of biology ");
        int biology = sc.nextInt();
        System.out.print("Enter Marks of history ");
        int history = sc.nextInt();
        float persentage = (math + physic + chemistry + biology + history)/5;
        if( persentage >= 90 && persentage <= 100 ){
            System.out.print("A Grade with " + persentage + "%");
        }
        else if (persentage >= 80 && persentage < 90){
            System.out.print("B Grade with " + persentage + "%");
        }
        else if(persentage >= 70 && persentage < 80){
            System.out.print("C Grade  with " + persentage + "%");
        }
        else if(persentage < 70 ){
            System.out.println("Fail with "+ persentage+"%");
        }
        else{
            System.out.println("We have no Problem in System cheak You have Entered marks");
        }

    }
}
