//: containers/E18_SlowSet.java
/****************** Exercise 18 *****************
 * Using SlowMap.java for inspiration, create a
 * SlowSet.
 ***********************************************/
package containers;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SlowSet<K> extends AbstractSet<K> {
	private List<K> keys = new ArrayList<K>();

	public boolean add(K key) {
		if(!keys.contains(key)){
			keys.add(key);
			return true;
		}else{
			return false;			
		}
	}

	public Iterator<K> iterator() {
//		if(this.isEmpty()){
//			return Collections.<K>emptyList().iterator();
//		}
//		
//		return new Iterator<K>(){
//			private Node currentNode = null;
//			
//			@Override
//			public boolean hasNext() {
//
//				return false;
//			}
//
//			@Override
//			public K next() {
//				
//				return null;
//			}	
//		};
		return keys.iterator();
	}

	public int size() {
		return keys.size();
	}
}

public class E05_SlowSet {
	public static void main(String[] args) {
		SlowSet<String> slowSet = new SlowSet<String>();
		slowSet.addAll(Countries.names(10));
		slowSet.addAll(Countries.names(10));
		slowSet.addAll(Countries.names(10));
		System.out.println(slowSet);
	}
} /*
 * Output: [ALGERIA, ANGOLA, BENIN, BOTSWANA, BURKINA FASO, BURUNDI, CAMEROON,
 * CAPE VERDE, CENTRAL AFRICAN REPUBLIC, CHAD]
 */// :~
