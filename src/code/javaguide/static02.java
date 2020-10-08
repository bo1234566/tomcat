package code.javaguide;

public class static02 {
    private static02(){

    }
    private static final static02 Instance = new static02();
    public static static02 getInstance(){
        return Instance;
    }

    public static void main(String[] args) {
        static02 st2 = static02.getInstance();
    }
}
