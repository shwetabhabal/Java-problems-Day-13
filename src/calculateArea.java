import java.util.Scanner;
public class calculateArea {
     int length;
     int breadth;
     int base;
     int height;
     calculateArea(int length, int breadth, int base, int height){
        this.length = length;
        this.breadth= breadth;
        this.base = base;
        this.height = height;
    }
    public int rect(){
        return length*breadth;
    }
    public int triangle(){
         return (base*height)/2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length: ");
        int length = sc.nextInt();
        System.out.println("enter breadth: ");
        int breadth = sc.nextInt();
        System.out.println("enter base: ");
        int base = sc.nextInt();
        System.out.println("enter height: ");
        int height = sc.nextInt();
        calculateArea area= new calculateArea(length,breadth,base, height);
        System.out.println("area of rectangle: "+area.rect());
        System.out.println("area of rectangle: "+area.triangle());
    }
}
