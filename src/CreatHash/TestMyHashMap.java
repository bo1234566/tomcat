package CreatHash;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyMap<String,Object> map = new MyHashMap<>();
        map.put("name","zuozhe");
        map.put("age","23");
        map.put(null,"zuozhe2");
        System.out.println(map.get("name"));
        System.out.println(map.get(null));
        map.put("name","zuozhe111");
        System.out.println(map.get("name"));
    }
}
