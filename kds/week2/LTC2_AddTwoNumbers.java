public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,2,4,5);
        ListNode head2 = new ListNode(1,3,5,6);
        addTwoNumbers(head1, head2);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //결과 담을 list ne ListNode(0) 이아니라 null 로 하면 node.next 하기어렵다.
        //그래서 null 이 아닌 new list 로 ~
        ListNode node = new ListNode(0);
        ListNode root = node;

        int sum = 0;

        //l1,l2 둘중에 하나가 null 일수도있고 올림처리하면 sum이 1 이상이되는데
        //만약 l1, l2 둘다없는데 마지막 올림처리 1이 있다면 누락되므로 해당 조건문 삽입
        while (l1 != null || l2 != null || sum > 0) {

            //더하고 위치 옮기고~
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            //나머지값을 list에 넣고
            node.next = new ListNode(sum%10);

            //올려야되는게 있으면 (carry) sum에 넣어둠
            sum /= 10;
            node = node.next;
        }
        return root.next;
    }

}
