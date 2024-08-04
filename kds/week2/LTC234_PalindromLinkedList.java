public class palindromeLL {
    public static void main(String[] args) {

        ListNode head = new ListNode(1,2,2,1);
        isPalindromeStack(head);

    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    /**
     * 속도 하
     * @param head
     * @return
     */
    public static boolean isPalindromeStack(ListNode head) {
        //stack 이랑 head랑 비교해야되서 가공용 으로 node 라는 변수생성
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();

        //stack 에 다 떄려박고
        while (node != null) {
            stack.add(node.val);
            node = node.next;
        }

        while (head != null) {

            //선입후출 방식의 stack 에서 뺴내서 비교. pop()을 사용하면 사용과 동시에 stack 에서 삭제
            if (stack.pop() != head.val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    /**
     * 속도 중
     * @param head
     * @return
     */
    public static boolean isPalindromeDeque(ListNode head) {
        //덱에 다 떄려박음
        while (head != null) {
            deque.add(head.val);
            head = head.next;
        }

        //덱 앞뒤를 빼내서 비교 & 홀수일경우에는 가운데숫자가 남아서 size가 1이므로 1이상
        while (!deque.isEmpty() && deque.size() > 1) {
            if(deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

    /**
     * 속도 상
     * @param head
     * @return
     */
    public static boolean isPalindromeListNode(ListNode head) {
        ListNode fast = head, slow = head;

        //홀수일때는 fast 는 있지만 fast.next는 없다.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //홀수일때 앞으로 넘겨주자
        if (fast!=null) {
            slow = slow.next;
        }

        //node 뒤집기~
        ListNode rev = null;
        while (slow != null) {

            //1. next 저장하고
            ListNode next = slow.next;

            //2. 가공한걸 next로 넣어주고
            slow.next = rev;

            //3. 현재기준으로 재가공 하고
            rev = slow;

            //4. 앞으로 전진~
            slow = next;
        }

        //rev가 기존 ListNode의 앞 반절이니까 rev가 기준!
        while(rev != null) {
            if (head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

    }

}