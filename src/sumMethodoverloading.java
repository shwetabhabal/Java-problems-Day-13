public class sumMethodoverloading {
    public static int sum(int x, int y){
        return x+y;
    }
    public static int sum(int x, int y, int z){
        return x+y+z;
    }
    public static int sum(int w, int x, int y, int z){
        return w+x+y+z;
    }

    public static void main(String[] args) {
        System.out.println("sum of 2 number: "+sum(1,2));
        System.out.println("sum of 3 number: "+sum(1,2, 3));
        System.out.println("sum of 4 number: "+sum(1,2,3,4));
    }
}
