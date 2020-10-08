package code.javaguide;

public class static03 {
    private static03(){

    }
    private static class instancefactory{
        private static final static03  Instance = new static03();
    }
    public static static03 getInstanc(){
        return instancefactory.Instance;
    }

    public static void main(String[] args) {
        double d= 5/2;
        System.out.println(d);
    }
}
