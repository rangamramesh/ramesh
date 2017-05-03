package com.kitten;

public class Kitten {
	public String name;
	public static Person Owner;
	int age=0;
	
	public String name(String newname){
		name=newname+" the "+Person.getName();
		return name;
		
	}
    public void haveBirthday(){
    	age++;
    }
   public String toString(){
	   
	return name+" is "+age+" and belongs to "+Person.getName();
	   
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static Person getOwner() {
	return Owner;
}
public static void setOwner(Person owner) {
	Owner = owner;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	

	

}
