package com;

public class DeleteDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;
        
        ListNode cntr = head;
        
        int size = 0;
        
        while(cntr != null) {
        	size++;
        	cntr = cntr.next;
        }
        if(size == 0) {
        	return null;
        }
        while(temp!=null) {
            
            if(temp.next != null) {
                if(temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                    
                }else {
                    temp = temp.next;
                }
            }else {
                break;
            }
            
        }
        
        return head;
        
    }
    
    public static void main(String[] args) {
        
        DeleteDuplicate dd = new DeleteDuplicate();
        
        int[] array = {1,1,1,1,1,1,2,3,4,5};
        
        ListNode head = new ListNode(array[0]);
        ListNode last = head;
        
        int i=0;
        
        for(i=1;i<array.length;i++) {//Makes the linked list
            ListNode ele = new ListNode(array[i]);
            last.next = ele;
            last = ele;
        }
        
        head = dd.deleteDuplicates(head);
        
        System.out.println("List after removing duplicates: ");
        
        while(head != null){
          
          System.out.print(head.val + " ");
          head = head.next;
        }

    }

}