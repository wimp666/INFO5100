import java.util.Map;

public class MyHashMap<K, V> {
	private static final int SIZE = 16;
	private Entry<K, V>[] table;
	
	public MyHashMap() {
		table = new Entry[SIZE];
	}
 
	class Entry<K, V> implements Map.Entry<K,V>{
		K key;
		V value;
		Entry<K, V> next;
 
		Entry(K k, V v) {
			key = k;
			value = v;
		}
 
		public V getValue() {
			return value;
		}
 
		@Override
		public V setValue(V value) {
			this.value = value;
			return value;
		}
 
		public K getKey() {
			return key;
		}
	}
 
	public Entry<K, V> get(K k) {
		int hash = k.hashCode() % SIZE;
		Entry<K, V> e = table[hash];
		while(e != null) {
			if(e.key.equals(k)) {
				return e;
			}
			e = e.next;
		}
		return null;
	}
	
	public void remove(K k, V v) {
		int hash = k.hashCode() % SIZE;
		Entry<K, V> e = table[hash];
		Entry<K, V> pre = table[hash];
		while(e != null) {
			if(e.key.equals(k)) {
				pre.next = e.next;
			}			
			pre = e;
			e = e.next;
		}
	}
 

	public void put(K k, V v) {
		int hash = k.hashCode() % SIZE;
		Entry<K, V> e = table[hash];
		if(e != null){			
			while(e.next != null){
				if(e.key.equals(k)){
					e.value = v;
					return ;
				}
				e = e.next;
			}
			Entry<K, V> entryInOldBucket = new Entry<>(k,v);
			e.next = entryInOldBucket;
		}
		else{
		    Entry<K, V> entryInNewBucket = new Entry<>(k,v);
		    table[hash] = entryInNewBucket;
		}
 
	}
}