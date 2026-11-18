import java.util.List;
import java.util.ArrayList;

public class PQHeap<K,V>  { // 1. why does it extends tho?

    private EntryInterface<K,V> entry;
    private List<EntryInterface<K,V>> heap;

    
    public PQHeap(){
        heap = new ArrayList<>();
        
    }

    private void insert(V value, K key){

        PQEntry<K, V> entry = new PQEntry<>(value, key);

        heap.add(entry);
        upHeap(heap.size()-1);

    }
    public void upHeap(int index){

        int indx=heap.size();


        while(indx>0){

            int parentIdx = (index-1)/2;

            if(parentIdx.compare(indx)>=0){

            }


        }



    }



    
     
}
