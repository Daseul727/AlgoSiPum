public class LTC328_OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,2,4,5);
        oddEvenList(head)
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode oddEvenList(ListNode head) {
        //홀짝 만들어
        ListNode odd = head;
        ListNode even = head.next;

        //얘는 나중에 odd에 합칠것임
        ListNode evenFirst = even;

        while (even != null && even.next != null) {

            //2칸 앞에있는거 가져오고
            odd.next = odd.next.next;
            even.next = even.next.next;

            //위치옮겨줌
            odd = odd.next;
            even = even.next;
        }

        //odd와 even 다발을 합침
        odd.next = evenFirst;
        return head;
    }
}