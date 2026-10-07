public class ArrayCache{

    // entries:CacheEntry[]???
    private CacheEntry[] entries;
    private int numEntries;
    private int numHits;
    private int numMisses;

    public ArrayCache() {
        this(10); // can i extend tho?

    }

    public ArrayCache(int size) {
        entries = new CacheEntry[size];
        this.numEntries = 0;
        this.numHits = 0;
        this.numMisses = 0;
    }

    public void put(String name, String value) {

        if (numEntries == entries.length) {
            shiftEntries(numEntries);
            entries[0] = new CacheEntry(name, value);

        }

        if (numEntries < entries.length) {
            shiftEntries(numEntries);
            entries[0] = new CacheEntry(name, value);
            numEntries++;
        }
    }


    //we have problem here!!! return problem
    public String get(String name) {

        CacheEntry tempName;
        for (int i = 0; i < entries.length - 1; i++) {

            if ((entries[i].getName()).equals(name)) {
                
                tempName = entries[i]; // it says to save CacheEntry not the name
                int currIndex = i;// i just need to find the index here now(you did because you want to shift everything except the last elememnt of the array)
                shiftEntries(currIndex);
                entries[0] = tempName; // how do i get the index of that element right there?
                numHits++;

                return tempName.getValue(); // return ip girllll

            } 
        } 
        numMisses++;
        return null;     // if(!(entries[i].getName()).equals(name)){

    }
        

    public int getHits() {
        return numHits;
    }

    public int getMisses() {
        return numMisses;
    }

    // is it necessary?
    public int getEntries() {
        return numEntries;
    }

    public void clear() {
        numEntries = 0;
        numHits = 0;
        numMisses = 0;
    }

    public boolean isEmpty() {

        if (numEntries != 0) {
            return false;
        }
        return true;
    }

    private String returnCacheArray(){
        String result = "";
        for(int i = 0; i < entries.length; i++){
            result += entries[i].getName() + "    " + entries[i].getValue() + "/n";
        }
        return result;
    }


    @Override
    public String toString() {

        return "Entries: " + numEntries+ "\n" +
        "    Hits: " + getHits() + "\n" +
        "   Misses: " + getMisses() + "\n" + 
        returnCacheArray();

        // you have  to do for loop here and then return the string
            
            
    }

    private void shiftEntries(int endIndex) {

        for (int i = endIndex; i > 
            0; i--) {
            entries[i] = entries[i - 1];
        }
    }
}
