import java.util.Scanner;
public class nestMethod {
    int length;
    int breadth;
    int height;
    nestMethod(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    int  perimeter(){
        return 4*(length+breadth);
    }
    int area(){
        int peri= perimeter();
        System.out.println("perimeter: "+peri);
        return length*breadth;
    }
    int volume(){
        int area= area();
        System.out.println("area: "+area);
        return length*breadth*height;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entere length: ");
        int length= sc.nextInt();
        System.out.println("Entere breadth: ");
        int breadth= sc.nextInt();
        System.out.println("Entere height: ");
        int height= sc.nextInt();
        nestMethod nm= new nestMethod(length,breadth,height);
        System.out.println("Volume:" +nm.volume());
    }
}
