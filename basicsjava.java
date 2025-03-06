//Prob 1
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the values ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();
        String c = scan.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//Prob 2
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the values ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String b = scan.next();
        String c = scan.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//Prob 3
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the marks of the student");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a>=90)
        System.out.println("Grade A");
        else if(a>=80)
        System.out.println("Grade B");
        else if(a>=60)
        System.out.println("Grade C");
        else if(a>=35)
        System.out.println("Grade D");
        else
        System.out.println("Fail");
    }
}

//Prob 4
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a)
        { case 29:
        System.out.println("Small");
        break;
          case 30:
        System.out.println("Medium");
        break;
          case 38:
        System.out.println("Large");
        break;
          case 42:
        System.out.println("XLarge");
        break;
          default:
        System.out.println("Invalid");
        break;
        }
    }
}
