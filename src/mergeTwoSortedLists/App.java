package mergeTwoSortedLists;

public class App {
    public static void main( String[] a){
        ListNode ln1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(8))));
        ListNode ln2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
    
        Solution s = new Solution();
        
        ln1 = s.mergeTwoLists(ln1, ln2);
        
        while( ln1 != null){
            System.out.println( ln1.val );
            
            ln1 = ln1.next;

        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {};
    ListNode(int val) { this.val = val; };
    ListNode(int val, ListNode next) { this.val = val; this.next = next; };
 }
 
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(); 
        ListNode currentNode = head;
        

        while ( list1 != null && list2 != null ){
            if(list1.val < list2.val){
                currentNode.next = list1;
                list1 = list1.next;

            } else {
                currentNode.next = list2;
                list2 = list2.next;
                
            }

            currentNode = currentNode.next;
        }

        if( list1 != null) {
            currentNode.next = list1;

        } else currentNode.next = list2;

        return head.next;
    }
}
