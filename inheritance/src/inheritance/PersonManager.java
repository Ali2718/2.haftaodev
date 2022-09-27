package inheritance;

public interface PersonManager extends PersonManager {
	public void List() {
		System.out.println("Listelendi");
	}
	
	public void Add() {
		System.out.println("Eklendi");
	}


}
