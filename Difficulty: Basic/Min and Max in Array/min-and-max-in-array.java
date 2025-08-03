// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
A generic class is a class that can work with any data type, instead of being locked to a specific one.
It uses type parameters like <T>, <K, V>, etc. to make the class flexible.
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        return new Pair(arr[0],arr[arr.length-1]);
        
    }
}
