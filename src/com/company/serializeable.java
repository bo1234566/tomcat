package com.company;


import java.io.*;

public  class serializeable implements Serializable {
    private transient String name;
     private static   Integer age;
    private  Integer score;
    private  long serializeableid ;
    public void  setName(String s){
        this.name = s;
    }
    public void  setAge(int a){
        this.age = a;
    }
    public void  setScore(int b){
        this.score = b;
    }
    @Override
    public String toString() {
        return "Student:" + 'n' +
                "name = " + this.name + 'n' +
                "age = " + this.age + 'n' +
                "score = " + this.score + 'n'
                ;
    }
public static void main(String[] arg) throws IOException, ClassNotFoundException {
   serialize();
       deserialize();
    System.out.println("!!");
}
    public static void serialize() throws IOException {

        serializeable student = new serializeable();
        student.setName("CodeSheep");
        student.setAge(18);
        student.setScore(1000);

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(new File("student1.txt")));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        System.out.println("序列化成功！已经生成student.txt文件");
        System.out.println("==============================================");
    }
    public static void deserialize(  ) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream =
                new ObjectInputStream( new FileInputStream( new File("student1.txt") ) );
        serializeable student = (serializeable) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("反序列化结果为：");
        System.out.println( student );
    }
}