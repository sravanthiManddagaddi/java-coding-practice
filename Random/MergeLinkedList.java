package Coding.Random;

public class MergeLinkedList {
    public static void main(String[] args) {
//        LinkedList<Integer> ll1 = new LinkedList<>();
//        LinkedList<Integer> ll2 = new LinkedList<>();
        int[] ll1 = {1,2,3};
        int[] ll2 = {1,3,4};

        for(int i=0; i<ll1.length;i++){
            for(int j =0;j<ll2.length;j++){
                ListNode l1 = new ListNode(ll1[i]);
                ListNode l2 = new ListNode(ll2[j]);
                System.out.println(mergeTwoLists(l1,l2).val);
            }
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
