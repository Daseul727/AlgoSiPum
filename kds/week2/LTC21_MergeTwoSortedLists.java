public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,2,4,5);
        ListNode head2 = new ListNode(1,3,5,6);
        merge1(head1, head2);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode merge1(ListNode l1, ListNode l2) {

        //비교하다못해 끝까지오면 return 다른쪽
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        //작은쪽의 next를 재설정
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
    }

}
