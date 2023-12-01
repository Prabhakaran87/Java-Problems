import java.util.Scanner;

public class Table1 {
    public static void main(String[] args) {
        int input;
        System.out.println("Press 1 for multiplication table :\n Press 2 for subtraction table :\n Press 3 for addition table\n Press 4 for division table ");
        Scanner scan=new Scanner(System.in);
        input =scan.nextInt();
        switch(input){
            case 1:
            multiplication_method();
            break;
            case 2:
            subtraction_method();
            break;
            case 3:
            addition_Method();
            break;
            case 4:
            division_Method();
            break;
            default:
            System.out.println("enter the correct value");
            break;
        }
        scan.close();
    }
    public static void addition_Method(){
        int tableNumber3, limit3;
        System.out.println("enter the table number");
        Scanner scan3=new Scanner(System.in);
        tableNumber3=scan3.nextInt();
        System.out.println("enter the limit");
        limit3=scan3.nextInt();
        for (int i=1; i<=limit3; i++) {
            System.out.println(i +" + "+ tableNumber3 +" = "+(i+tableNumber3));

        }
        scan3.close();
    }
    public static void division_Method(){
        int tableNumber4, limit4;
        System.out.println("enter the table number");
        Scanner scan4=new Scanner(System.in);
        tableNumber4=scan4.nextInt();
        System.out.println("enter the limit");
        limit4=scan4.nextInt();
        for (int i=1; i<=limit4; i++) {
            System.out.println(i +" + "+ tableNumber4 +" = "+(i/tableNumber4));

        }
        scan4.close();
    }

    public static void multiplication_method(){
        int tableNumber1, limit1;
        System.out.println("enter the table number");
        Scanner scan1=new Scanner(System.in);
        tableNumber1=scan1.nextInt();
        System.out.println("enter the limit");
        limit1=scan1.nextInt();
        for (int i=1; i<=limit1; i++){
            System.out.println(i +" * "+ tableNumber1 +" = "+(i*tableNumber1));
        }
        scan1.close();
    }
    public static void subtraction_method(){
        int tableNumber2,limit2;
        System.out.println("enter the table number");
        Scanner scan2=new Scanner(System.in);
        tableNumber2=scan2.nextInt();
        System.out.println("enter the limit");
        limit2=scan2.nextInt();
        for (int i=1; i<=limit2; i++){
            System.out.println(i+" - "+tableNumber2+ " = "+(i-tableNumber2));
        }
        scan2.close();
    }
}
