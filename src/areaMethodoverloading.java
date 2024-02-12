import java.util.Scanner;
public class areaMethodoverloading {
    public static int area(int a){
        return a*a;
    }
    public static int area(int l, int b){
        return l*b;
    }
    public static float area(float r){
//        float pi=3.14f;
        return 3.14f*r*r;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int a= sc.nextInt();
        System.out.println("area of square: "+area(a));
        System.out.println("Enter length of rectangle: ");
        int l= sc.nextInt();
        System.out.println("Enter breadth of rectangle: ");
        int b= sc.nextInt();
        System.out.println("area of rectangle: "+area(l,b));
        System.out.println("Enter radius: ");
        float r= sc.nextInt();
        System.out.println("area of circle: "+area(r));
    }
}
