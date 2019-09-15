package project11_1;

import java.util.ArrayList;
import java.util.Collections;

public class GenericManager<T extends Comparable>{
	private ArrayList<T> cList;

	public GenericManager() {
		cList = new ArrayList<T>();
	}
	
	public void add(T a) {
		cList.add(a);
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		for(int i=0; i<cList.size(); i++) {
			if(((cList.get(i)).equals(a))) return (cList.get(i)).toString();
			}
		return null;
	}
	
	public String toString() {
		String a=null;
		for(int i=0; i<cList.size(); i++) {
			a+=cList.get(i);
		}
		return a;
	}
}
