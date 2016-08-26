//: containers/SlowMap.java
// A Map implemented with ArrayLists.
package containers;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class E04_SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();

	public V put(K key, V value) {
		if(key != null && !keys.contains(key)){
			keys.add(key);
			values.add(value);				
			return get(key);
		}else{
			return null;
		}
	}

	public V get(Object key) { // key is type Object, not K
		if(keys.contains(key)){
			return values.get(keys.indexOf(key));
		}else{
			return null;
		}
	}

	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Map.Entry<K, V> mapEntry;
		
		for(int i = 0 ; i < this.keys.size() ; i++){
			
			int j = i;
			mapEntry = new Map.Entry<K, V>() {
				@Override
				public K getKey() {
					return keys.get(j);
				}
				@Override
				public V getValue() {
					return values.get(j);
				}
				@Override
				public V setValue(V value) {
					V v = getValue();
					values.set(j, value);
					return v;
				}
			};
			
			set.add(mapEntry);
		}
		return set;
	}

	public static void main(String[] args) {
		E04_SlowMap<String, String> m = new E04_SlowMap<String, String>();
		m.putAll(Countries.capitals(15));
		System.out.println(m);
		System.out.println(m.get("BURUNDI"));
		System.out.println(m.entrySet());
	}
}
