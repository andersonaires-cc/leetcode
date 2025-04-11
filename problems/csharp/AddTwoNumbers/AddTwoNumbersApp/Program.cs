using System;
using AddTwoNumbersApp;

class Program
{
    static void Main()
    {
        // Lista 1: 2 → 4 → 3 (representa 342)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Lista 2: 5 → 6 → 4 (representa 465)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Soma as duas listas
        Solution solution = new Solution();
        ListNode result = solution.AddTwoNumbers(l1, l2);

        // Imprime o resultado: deve ser 7 → 0 → 8
        Console.Write("Resultado: ");
        while (result != null)
        {
            Console.Write(result.val);
            if (result.next != null) Console.Write(" → ");
            result = result.next;
        }
        Console.WriteLine(); // nova linha
    }
}
