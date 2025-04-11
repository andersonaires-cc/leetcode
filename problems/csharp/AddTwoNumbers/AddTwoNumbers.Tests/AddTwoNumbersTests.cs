using Xunit;
using AddTwoNumbersApp;

namespace AddTwoNumbersApp.Tests
{
    public class SolutionTests
    {
        [Fact]
        public void Test_342_plus_465_should_be_807()
        {
            // Arrange: 342 = 2 -> 4 -> 3
            var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
            // 465 = 5 -> 6 -> 4
            var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
            var solution = new Solution();

            // Act
            var result = solution.AddTwoNumbers(l1, l2);

            // Assert: 807 = 7 -> 0 -> 8
            Assert.Equal(7, result.val);
            Assert.Equal(0, result.next.val);
            Assert.Equal(8, result.next.next.val);
            Assert.Null(result.next.next.next);
        }

        [Fact]
        public void Test_addition_with_carry_overflow()
        {
            // 999 = 9 -> 9 -> 9
            var l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
            // 1 = 1
            var l2 = new ListNode(1);
            var solution = new Solution();

            var result = solution.AddTwoNumbers(l1, l2);

            // 1000 = 0 -> 0 -> 0 -> 1
            Assert.Equal(0, result.val);
            Assert.Equal(0, result.next.val);
            Assert.Equal(0, result.next.next.val);
            Assert.Equal(1, result.next.next.next.val);
            Assert.Null(result.next.next.next.next);
        }

        [Fact]
        public void Test_empty_lists_should_return_null()
        {
            var solution = new Solution();
            var result = solution.AddTwoNumbers(null, null);
            Assert.Null(result);
        }

        [Fact]
        public void Test_one_null_list()
        {
            var l1 = new ListNode(5, new ListNode(9));
            ListNode l2 = null;
            var solution = new Solution();

            var result = solution.AddTwoNumbers(l1, l2);

            Assert.Equal(5, result.val);
            Assert.Equal(9, result.next.val);
            Assert.Null(result.next.next);
        }
    }
}
