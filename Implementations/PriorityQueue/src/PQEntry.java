public class PQEntry<K,V> implements EntryInterface<K,V> {

    private V value;
    private K key;

    public PQEntry(V value, K key){
        this.value = value;
        this.key = key;
    }

    public V getValue(){
        return value;
    }

    public K getKey(){
        return key;
    }

    public String toString(){
        return "Value: "+ value + " | " + "Keys: "+ key;
    }
    
}
