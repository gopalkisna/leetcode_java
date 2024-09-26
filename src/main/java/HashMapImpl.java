package src.main.java;

class Entry<K, V>{
    K key;
    V val;

    public K getK() {
        return key;
    }

    public void setK(K key) {
        this.key = key;
    }

    public V getV() {
        return val;
    }

    public void setV(V val) {
        this.val = val;
    }


    @Override
    public int hashCode() {
        int prime = 13;
        int mul = 11;
        if (key != null) {
            int hashCode = prime * mul + key.hashCode();
            return hashCode;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass().getName() != o.getClass().getName()) {
            return false;
        }
        Entry e = (Entry) o;
        if (this.key == e.key) {
            return true;
        }
        return false;
    }
}



public class HashMapImpl<K, V> {

    private float loadfactor = 0.75f;
    private int capacity = 100;
    private int size =0;

    private Entry<K,V> table[] = new Entry[capacity];

    private int Hashing(int hashcode){
        return hashcode % capacity;
    }

    public int size(){
        return this.size;
    }

    public V put(K key, V val){
        V ret = null;
        int hashCode = key.hashCode();
        int location = Hashing(hashCode);
        Entry<K, V> entry = null;

        entry = table[location];

        if(entry != null && entry.getK() == key){
            ret = entry.getV();
        }else{
            Entry<K,V> newEntry = new Entry<>();
            newEntry.setK(key);
            newEntry.setV(val);
            table[location] = newEntry;
            size++;
        }

        return ret;
    }

    public static void main(String[] args) {
        HashMapImpl<Integer, String> hashMap = new HashMapImpl<>();
        hashMap.put(10, "Apple");
        hashMap.put(1, "Orange");
        hashMap.put(79, "Grape");
        System.out.println(hashMap);
        //System.out.println("Val at 79 "+hashMap.get(79));

    }
}
