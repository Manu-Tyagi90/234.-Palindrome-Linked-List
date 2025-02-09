class ListNode {
  int val;
  ListNode next;  
  ListNode (int val, ListNode next) {
  this.val = val;
  this.next = next;
  }
  ListNode (int val) {
  this.val = val;
  }
}

public class SolutionApproach1 {
  public static boolean isPalindrome(ListNode l1) {
    if(l1==null) return true;
    ListNode slow = l1;
    ListNode fast = l1;
    while(fast!=null && fast.next!=null) {
          slow = slow.next;
          fast = fast.next.next;
    }
    ListNode l3 = reverse(slow); 
    ListNode l4 = l1;
     while(l3!=null ) {
        if(l3.val != l4.val)  return false;
        l3 =l3.next;
        l4 = l4.next;
        
     }      
return true;
  
  }

public static ListNode reverse(ListNode l1){
    ListNode prev = null;
    ListNode current = l1;
  while(current != null) {
      ListNode nextNode = current.next;
      current.next = prev;
      prev = current;
      current = nextNode;
    }
return prev;
  }

public static void main(String[] manu) {
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
    System.out.println(isPalindrome(l1));

    ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
    System.out.println(isPalindrome(l2));

    ListNode l3 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, null)))));
    System.out.println(isPalindrome(l3)); 
}
}

