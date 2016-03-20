import java.util.Scanner;
/*Problem - A loop in a linked list occurs when following the linked list chain brings you back where you started. For example,
 * link 1 points to link 2 which points to link 3 which points to lin1, to link2, to link3, to link1... and you go round in an infinite
 * loop. Each test case here involves asingle-ended singly-linked list with a potential loop. Output the data of the link whose
 * pointer has caused the linked list to loop back to a previous point. In the above example, it would be whatever data is stored
 * in link 3.
 * Input - There is no input. The linked list is created automatically
 * Ouput - Output the String stored in the link which causes the list to loop back to a previous link. If there is no loop output "OK".
 * If the linked list is empty output "empty".
 * 
 */
public class WhatCausesTheLoop {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        Link[] array = new Link[num];
        for(int i=0;i<num;i++){
            array[i]=new Link(myscanner.nextLine());    
        }
        while(myscanner.hasNext()){
            int select=myscanner.nextInt();
            int next=myscanner.nextInt();
            if(next!=-1){
                array[select].next=array[next];
            }
        }
        LinkedList mylist = new LinkedList();
        if(num>0){
            mylist.first=array[0];
        }
        System.out.println(findloop(mylist));
    }
	public static String findloop(LinkedList mylist){
        if(mylist.isEmpty()){
            return("empty");
        }
        Link[] checklist = new Link[100];
        int counter=0;
        Link forwards = mylist.first;
        while(forwards.next!=null){
            checklist[counter]=forwards;
            Link temp=forwards;
            forwards=forwards.next;
            for(int i=0;i<counter;i++){
                if(forwards==checklist[i]){
                    return(temp.data);
                }
            }
            counter++;
        }
        return("OK");
        
    }
}

class Link{
	public String data;
	public Link next;
    
    public Link(String input){
        data=input;
        next=null;
    }
}

class LinkedList {
	public Link first;

	public LinkedList( ){
		first=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}
    
    public void insertHead(Link insert){
        if(isEmpty()){
            first=insert;
        }else{
            insert.next=first;
            first=insert;
        }
    }
}


