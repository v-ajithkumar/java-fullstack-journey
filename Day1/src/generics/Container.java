package generics;

public class Container <T>{
	T container;
	
	Container(T container){
		this.container = container;
	}
	
	public void print() {
		System.out.println(container);
	}
	
	
	
}
