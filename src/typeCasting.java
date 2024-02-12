import java.util.Scanner;
public class typeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st byte number");
        byte b1= sc.nextByte();
        System.out.println("enter 2nd byte number");
        byte b2= sc.nextByte();
        int sum=b1+b2;
        System.out.println("sum of bytes: "+sum);
    }
}
