/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Медленный указатель перемещается на один шаг за раз,
// а быстрый указатель перемещается на два шага за раз.
// Если есть цикл, быстрый указатель в конечном итоге встретит
// медленный указатель внутри цикла. Если цикла нет ,
// быстрый указатель достигнет конца списка.
// Алгоритм поиска цикла Флойда
// быстрый медленный подход // 2 указателя // «алгоритм черепахи и зайца»

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
            {
                return true;
            }
        }
        return false;        
    }
}