public class LTC92_ReverseLinkedList2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,2,4,5,6,7);
        int left = 2;
        int right = 4
        reverseBetween(head,left, right);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode root = new ListNode(0);
        root.next = head;

        //left를 사용하여 start 위치까지갈건데, 아래포문을 돌리면 시작점이 하나 더 뒤로가버려서
        //root를 따라가야함
        ListNode start = root;
        for (int i=0; i<left-1; i++) {
            start = start.next;
        }

        //end 설정
        ListNode end = start.next;

        for (int i=0; i<right-left; i++) {

            //start 의 next 보관
            ListNode tmp = start.next;

            //start.next 는 end 의 next for문돌릴수록 start 에서 1 씩 더 멀어질것임
            start.next = end.next;

            //end 의 포지션은 그대로 두고 next 만 뒤로 뒤로 계속이동
            end.next = end.next.next;

            //start 의 next.next에 보관해뒀던 찐 next 붙임
            start.next.next = tmp;
        }

        return root.next;

    }


}