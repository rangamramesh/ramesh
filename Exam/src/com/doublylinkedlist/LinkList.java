package com.doublylinkedlist;

public class LinkList {
	public Link head;
	public int size;
	
	public LinkList(){
		head=null;
		size=0;
	}
	public void addfront(int data){
     if(head==null){
    	 head=new Link(null,data,null);
    	 
     }
     else{
    	 Link newLink=new Link(null,data,head);
    	 head.previus=newLink;
    	 head=newLink;
    	 
     }
     size++;
	}
	public void addNext(int data){
	     if(head==null){
	    	 head=new Link(null,data,null);
	    	 
	     }
	     else{
	    	 Link current=head;
	    	 while(current.next!=null){
	    		 current=current.next;
	    	 }
	    	 Link newLink=new Link(current,data,null);
	    	 current.next=newLink;
	    	 
	     }
	     size++;
		}
	public void removeFront(){
		if(head==null) return;
		
		head=head.next;
		head.previus=null;
		size--;
		
	}
	public void removeEnd(){
		if(head==null) return;
		if(head.next==null){
			head=null;
			size--;
			}
		Link current=head;
		while(current.next.next!=null){
			current=current.next;
		}
		current.next=null;
		size--;
		
	}
	public void insertAT(int data,int index){
		if(head==null) return;
		if(index < 1 ||index>size) return;
		 Link current =head;
		 int i=1;
		 while(index>i){
			 current=current.next;
			 i++;
		 }
		 if(current.previus==null){
			 Link newLink=new Link(null,data,current);
					 current.previus.next=newLink;
					 current.previus=newLink;
		 }
		 else
		 {
			 Link newLink=new Link(current.previus,data,current);
			 current.previus.next=newLink;
			 current.previus=newLink;
		 }
		 size++;
		 }
	public void removeAt(int index){
		if(head==null) return;
		if(index<1 || index>size) return;
		
		Link current=head;
		int i=1;
		while(i<index){
			current=current.next;
			i++;
		}
		if(current.next ==null){
			current.previus.next=null;
			
		}
		else if(current.previus==null){
			current=current.next;
			current.previus=null;
			head=current;
		}
		else{
			current.previus.next=current.next;
			current.next.previus=current.previus;
			
		}
		size++;
			
	}
	public int size(){
		return size;
		
	}

	public String toString(){
		Link current=head;
		String Result="[";
		while(current!=null){
			Result+=current.data+" ";
			
			current=current.next;
		}
		Result+="]";
		return Result;
	}
	
}
