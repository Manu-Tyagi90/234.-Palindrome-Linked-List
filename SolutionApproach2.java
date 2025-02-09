class ListNode {
int val;
ListNode next;
ListNode (int x, ListNode y) {
    val = x;
    next = y;
  }
ListNode (int x) {
    val = x;
  }
}

public class SolutionApproach2 {
static int arr[] = new int[100000];
private static boolean isPalindrome(ListNode l1) {
    ListNode l2 = l1; int i=0;
    while(l2!=null) {
      arr[i++] = l2.val;
      l2 = l2.next;
    } 
    int left = 0,r = i-1;
    while(left<r){
      if(arr[left++] != arr[r--]) return false; 
      }  
    return true;
    }
}
