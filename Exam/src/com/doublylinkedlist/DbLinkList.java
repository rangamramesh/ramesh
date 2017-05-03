package com.doublylinkedlist;

public class DbLinkList {

	public static void main(String[] args) {
		LinkList lt=new LinkList();
		lt.addfront(10);
		lt.addfront(15);
		lt.addfront(25);
		lt.addfront(65);
		lt.addfront(12);
		lt.addfront(60);
		lt.addfront(12);
		System.out.println(lt);
		lt.removeFront();
		System.out.println(lt);
		lt.removeEnd();
		System.out.println(lt);
		System.out.println(lt.size);
		LinkList lt1=new LinkList();
		lt1.addNext(12);
		lt1.addNext(16);
		lt1.addNext(19);
		lt1.addNext(22);
		lt1.addNext(25);
		lt1.addNext(27);
		lt1.addNext(18);
		lt1.addNext(23);
		lt1.insertAT(85, 3);
		
		System.out.println("this is after inser"+lt1);
		lt1.removeAt(2);
		lt1.removeFront();
		System.out.println(lt1);
		lt1.removeEnd();
		System.out.println(lt1);
		System.out.println(lt1.size);
	}

}
