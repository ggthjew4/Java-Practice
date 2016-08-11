//: containers/SlowMap.java
// A Map implemented with ArrayLists.
package containers;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {
	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();

	public V put(K key, V value) {
		return null;
	}

	public V get(Object key) { // key is type Object, not K
		return null;
	}

	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		return set;
	}

	public static void main(String[] args) {
		SlowMap<String, String> m = new SlowMap<String, String>();
		m.putAll(Countries.capitals(15));
		System.out.println(m);
		System.out.println(m.get("BULGARIA"));
		System.out.println(m.entrySet());
	}
}
