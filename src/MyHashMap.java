
public class MyHashMap<K, V> implements MyMap<K, V>{

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private float loadFactor = 0;
    private int initCapacity = 0;
    private Entry<K, V>[] table = null;

    // 默认构造函数
    public MyHashMap(){
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.initCapacity = DEFAULT_INITIAL_CAPACITY;
        table = new Entry[this.initCapacity];
    }

    // 自定义构造函数
    public MyHashMap(int initCapacity, float loadFactor){
        this.loadFactor = loadFactor;
        this.initCapacity = initCapacity;
        table = new Entry[this.initCapacity];
    }

    private int hash(K key){
        int h;
        return (key == null) ? 0 : Math.abs((h = key.hashCode())) ^ (h >>> 16);
    }

    @Override
    public V put(K key, V value) {
        // 确定index
        int index = hash(key) % initCapacity;
        if(table[index] != null){
            Entry<K, V> e = table[index];
            Entry<K, V> e2 = null;
            while(e != null){
                if(hash(e.key) == hash(key) && e.key.equals(key)){
                    // 如果键相同，则更新值
                    e.value = value;
                }
                // 遍历链表判断是否已经存在相同的key
                e2 = e;
                e = e.next;
            }
            // 如果不存在相同的key，则直接插到尾结点的后面
            e2.next = new Entry<>(key, value, null, index);
        }else{
            // 如果table[index]处为空，则直接插入
            Entry<K, V> e = new Entry<>(key, value, null, index);
            table[index] = e;
        }
        return value;
    }

    @Override
    public V get(K key) {
        // 根据key，计算下标index
        int index = hash(key) % initCapacity;
        Entry<K, V> e = table[index];
        if(e == null){
            return null;
        }

        // 遍历index处的链表找到key
        while(e != null){
            if(e.key == null && key == null || hash(e.key) == hash(key) && e.key.equals(key)){
                return e.value;
            }
            e = e.next;
        }
        return null;
    }

    // HashMap中存储节点信息的数据结构
    class Entry<K, V> implements MyMap.Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;
        int index;  // 记录下标

        Entry(K key, V val, Entry<K, V> next, int index){
            this.key = key;
            this.value = val;
            this.next = next;
            this.index = index;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}