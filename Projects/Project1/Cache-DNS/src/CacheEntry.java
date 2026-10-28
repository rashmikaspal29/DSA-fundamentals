/******************************************
 *  Author : Rashmi Kaspal
 *  Created On : 10/08/2026
 *  File : Kaspal_Project1
 *  Description: This program simulates a browser’s DNS cache by storing URLs and their corresponding IP addresses
 *  and managing entries using the Least Recently Used (LRU) policy.
 *******************************************/

public class CacheEntry{

    private String name;
    private String value;


    public CacheEntry(String name, String value){
        this.name = name; 
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public String getValue(){
        return value;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String toString(){
        return "Name:"+name + "   " + "Value: "+value + "\n";
    }

}