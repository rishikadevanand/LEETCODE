// Last updated: 9/28/2026, 2:40:38 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11 
12class Solution {
13    public ListNode swapPairs(ListNode head) {
14
15        if(head == null || head.next == null) return head;
16
17        ListNode prev = new ListNode(0);
18        ListNode dummy = prev;
19        prev.next = head;
20
21        while(prev.next != null && prev.next.next != null){
22            ListNode first = prev.next;
23            ListNode second = prev.next.next;
24
25            first.next = second.next;
26            second.next = first;
27            prev.next = second;
28
29            prev = first;
30        }
31 
32        return dummy.next;
33    //    ArrayList<Integer> lst = new ArrayList<>();
34    //    ListNode curr = head;
35    //    while(head != null){
36    //     lst.add(head.val);
37    //     head = head.next;
38    //    }
39
40    //    int i = 0 ;
41    //    while(i < lst.size() && i+1 < lst.size()){
42    //         int temp1 = lst.get(i);
43    //         lst.set(i,lst.get(i+1));
44    //         lst.set(i+1,temp1);
45    //         i += 2;            
46    //    }
47
48    //    ListNode res = new ListNode(0);
49    //    ListNode dummy = res;
50    //    i = 0;
51    //    while(i < lst.size()){
52    //     res.next = new ListNode(lst.get(i));
53    //     res = res.next; 
54    //     i += 1;
55    //    }
56
57    //    return dummy.next;
58    }
59}
60
61
62
63
64
65 // ListNode res = head;
66        // while(head != null && head.next != null){
67        //     int temp = head.next.val;
68        //     head.next.val = head.val;
69        //     head.val = temp;
70        //     head = head.next.next;
71        // }
72        // return res;