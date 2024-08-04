public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,2,4,5);
        reverseList(head1);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode rev = null;

        while (head != null) {

            //이젠 공식이다. next 보관하고
            ListNode next = head.next;

            //hea.next 는 기존 list
            head.next = rev;

            //기존 list를 현재기준으로 재설정
            rev = head;

            //한칸 앞으로~
            head = next;
        }
        return rev;

    }
}