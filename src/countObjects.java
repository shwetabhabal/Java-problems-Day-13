public  class countObjects {
    static int count=0;
    countObjects(){
        count++;
    }
    static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        countObjects obj1 = new countObjects();
        countObjects obj2 = new countObjects();
        countObjects obj3 = new countObjects();
        System.out.println("count: "+countObjects.getCount());
    }
}
