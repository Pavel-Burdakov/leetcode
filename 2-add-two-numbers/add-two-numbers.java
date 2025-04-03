/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Создаем новый узел для хранения результата
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        // Проходим по обоим спискам до тех пор, пока есть узлы или остаток
        while (p != null || q != null || carry != 0) {
            int x = (p != null) ? p.val : 0; // Значение текущего узла первого списка
            int y = (q != null) ? q.val : 0; // Значение текущего узла второго списка
            int sum = carry + x + y; // Суммируем значения и остаток
            carry = sum / 10; // Обновляем остаток
            current.next = new ListNode(sum % 10); // Добавляем новую цифру в результат
            current = current.next; // Переходим к следующему узлу

            if (p != null) p = p.next; // Переходим к следующему узлу первого списка
            if (q != null) q = q.next; // Переходим к следующему узлу второго списка
        }

        return dummyHead.next; // Возвращаем результат, пропуская начальный узел
    }
}