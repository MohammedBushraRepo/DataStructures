import java.util.LinkedList;

public class HashTable {
    //private because its implementation detail, no need to expose this class outside our hashtable class
    private class Entry{

        private int key;
        private String value;


        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    // now we need an array of linked list , with 5 for simplicity
    private LinkedList<Entry>[] entries = new LinkedList[5];

    // implement put method
    public void put(int key , String value){
        // pass the key to create it's hashed index
        var index = hash(key);
        //now we need to look at the cell of this index , if its null we need to set as instant of linked list class
        if (entries[index] == null)
            entries[index] = new LinkedList<>();
        // to avoid adding double entries we need to loop over the array and do check
        var bucket = entries[index]; // we use it alot to shortcut
        for (var entry : bucket){
            // in each iteration we need to check the key of each entry
            if (entry.key==key) {
                entry.value = value;
                return;
            }
        }

        // if its not add then we add it to the end of our bucket
        // if we had entries we add the new at last
        var entry = new Entry(key,value);
        bucket.addLast(entry);

    }

    //implement get method
    public String get(int key){
        //once again we should use our hash function , to figured out at which index we had stord this value
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            // we need to iterate over this bucket and check every entry , if we find entry with the same key we should return its value
            //otherwise that's mean we don't have this key value
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }
        return null;
    }


    public void remove(int key){
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            throw new IllegalStateException();
        // if it is not empty we iterate over the bucket and get each key and compare it with the entry
        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }

        throw new IllegalStateException();


    }

    // implementation of hash function , make private because its implentaion details
    private int hash(int key){
        return key % entries.length;// simplest hash algorithm
    }

}
