/******************************************
 *  Author : Scott Fiery   
 *  Created On : Thu Sep 17 2026
 *  File : Fingerprint.java
 *  Description: 
 *******************************************/

public class Fingerprint {
    private String path;

    public Fingerprint(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Fingerprint [path=" + path + "]";
    }
}








