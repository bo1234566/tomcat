package code.javaguide;

public class static00 {
        private static00(){
        }
        private volatile static static00 Instance;
        public static static00 getInstance(){
            if(Instance == null){
                synchronized (static00.class){
                    if(Instance == null){
                        Instance = new static00();
                    }
                }
            }
            return  Instance;
        }

    public static void main(String[] args) {
        static00 sta00 = static00.getInstance();
    }
    }


