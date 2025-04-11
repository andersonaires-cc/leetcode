namespace AddTwoNumbersApp
{
    public class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int val = 0, ListNode next = null)
        {
            this.val = val;
            this.next = next;
        }
    }
    public class Solution
    {
        public  ListNode AddTwoNumbers(ListNode l1, ListNode l2)
        {
            if (l1 == null && l2 == null)
                return null; 

            var dummyHead = new ListNode(0);
            var current = dummyHead;
            var carry = 0;

            while (l1 != null || l2 != null || carry != 0)
            {
                var val1 = GetValueAndMoveNext(ref l1);
                var val2 = GetValueAndMoveNext(ref l2);

                var sum = val1 + val2 + carry;
                carry = sum >= 10 ? 1 : 0; // Mais explícito que sum / 10

                current.next = new ListNode(sum % 10);
                current = current.next;
            }

            return dummyHead.next;
        }

        private static int GetValueAndMoveNext(ref ListNode node)
        {
            if (node == null)
                return 0;

            var value = node.val;
            node = node.next;
            return value;
        }
    }
}