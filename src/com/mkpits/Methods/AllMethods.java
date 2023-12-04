package com.mkpits.Methods;

public class AllMethods {

	public static void main(String[] args) {
		
		AllMethods obj = new AllMethods();
		obj.getName("Harsh gupta");
		obj.getNumber(6394550077l);
		obj.getEmail();
		obj.getGender();
	}
	
//return type with no argument	
    public  char getGender() {
    char ch = 'M';
    return ch;	
	}
//no return type with no argument
	public void getEmail() {
		 String mail = "harshg1807@gmail.com";
		System.out.println( mail);
	}
//return type with argument
	public  long getNumber(long number) {
		return  number;	
	}
//no return type with argument
	public  void getName(String name) {
		System.out.println(name);
	}
}
