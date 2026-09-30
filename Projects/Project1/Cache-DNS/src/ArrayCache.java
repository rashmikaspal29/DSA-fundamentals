public class ArrayCache{
    
    // entries:CacheEntry[]???
    private CacheEntry[] entries;
    private int numEntries;
    private int numHits;
    private int numMisses;

    public ArrayCache(){

        entries = new CacheEntry[10];
        this.numEntries = 0;
        this.numHits = 0;
        this.numMisses = 0;

    }

    public ArrayCache(int size){
        entries = new CacheEntry[size];
        this.numEntries = 0;
        this.numHits = 0;
        this.numMisses = 0;
    }

    public void put(String name, String value){

        if(numEntries == entries.length){
            shiftEntries(numEntries);
            entries[0] = new CacheEntry(name, value);
        
        }

        if(numEntries < entries.length){
            numEntries++;
        }
    }

    public String get(String name){

        for(int i = 0; i < entries.length - 1; i++){


            if(entries[i].equals(name)){

                CacheEntry tempName = entries[i];
                int currIndex = entries[i].indexOf();
                shiftEntries(currIndex);
                entries[0] = tempName;

                return name;

            }

            if()
        }
        
    }

    public int getHits(){
        return numHits;
    }

    public int getMisses(){
        return numMisses;
    }

    public void clear(){
        numEntries = 0;
        numHits = 0;
        numMisses = 0;
    }

    public boolean isEmpty(){

        if(numEntries != 0){
            return false;
        }
        return true;
    }

    private void shiftEntries(int endIndex){
        
        for(int i = endIndex; i <-1; i--){
            entries[i] = entries[i-1];
        }
    }
}
