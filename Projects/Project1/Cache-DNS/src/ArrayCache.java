/******************************************
 *  Author : Rashmi Kaspal
 *  Created On : 10/08/2026
 *  File : Kaspal_Project1
 *  Description: This program simulates a browser’s DNS cache by storing URLs and their corresponding 
 * IP addresses and managing entries using the Least Recently Used (LRU) policy.
 *******************************************/


public class ArrayCache{

    
    private CacheEntry[] entries;
    private int numEntries;
    private int numHits;
    private int numMisses;

    public ArrayCache() {
        this(10); 

    }

    public ArrayCache(int size) {
        this.entries = new CacheEntry[size];
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
            numEntries++;
            shiftEntries(numEntries);
            entries[0] = new CacheEntry(name, value);
            
        }
    }


    public String get(String name) {

        CacheEntry tempName;
        for (int i = 0; i < numEntries; i++) {
            if ((entries[i].getName()).equals(name)) {
                
                tempName = entries[i];
                int currIndex = i;
                shiftEntries(currIndex+1);
                entries[0] = tempName; 
                numHits++;

                return tempName.getValue(); 

            } 
        } 
        numMisses++;
        return null;  

    }
        

    public int getHits() {
        return numHits;
    }

    public int getMisses() {
        return numMisses;
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
        for(int i = 0; i < numEntries; i++){
            result += entries[i].toString();
        }
        return result;
    }


    @Override
    public String toString() {

        return "Entries: " + numEntries + "\n" +
        "    Hits: " + getHits() + "\n" +
        "   Misses: " + getMisses() + "\n" + 
        returnCacheArray();

        // you have  to do for loop here and then return the string
            
        
    }

    private void shiftEntries(int endIndex) {

        for (int i = endIndex-1; i > 0; i--) {
            entries[i] = entries[i - 1];
        }
    }
}
