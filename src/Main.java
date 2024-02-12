import java.util.Scanner;
class calculator{
    public static int input(String x){
        Scanner sc= new Scanner(System.in);
        System.out.println(x);
        return sc.nextInt();
    }
    public static int add(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int x= input("enter 1st number");
        int y = input("enter 2nd number");
        System.out.print(add(x,y));
    }
}