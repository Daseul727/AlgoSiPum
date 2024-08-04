public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,2,4,5);
        swapPairs(head1, head2);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {

        //가공할 node 선언
        ListNode node = head;

        //node.next 가 없으면 종료해야되므로 조건넣어줌
        while (node != null && node.next != null) {

            //기존꺼 보관하고
            int tmp = node.val;

            //next 값으로 바꾸고
            node.val = node.next.val;

            //next를 기존값으로
            node.next.val = tmp;

            //2개 바꼈으니까 2번전진
            node = node.next.next;
        }
        return head;
    }
}