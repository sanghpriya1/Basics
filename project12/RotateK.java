package project12;



public class RotateK {

	public static void main(String[] args) {
		int[] arr = new int[] {1,1,2,3};
		int length = arr.length;
		ListNode head = null;
		ListNode temp = null;
		for (int i = 0; i < length; ++i) {
			if (head == null) {
				ListNode node = new ListNode(arr[i], null);
				head = node;
				temp = head;
			} else {
				ListNode node = new ListNode(arr[i], null);
				temp.next = node;
				temp = temp.next;
			}
		}
		
		ListNode curr = head;
		int prev_data = Integer.MIN_VALUE;
		ListNode res_head = null;
		ListNode res_tail = null;
//		
//		while (curr != null) {
//			if (prev_data == Integer.MIN_VALUE) {
//				if (curr.next == null) {
//					// single node 
//					res_head = head;
//					curr = curr.next;
//				} else {
//					if (curr.val == curr.next.val) {
//						prev_data = curr.val;
//						curr = curr.next;
//					} else {
//						if (res_head == null) {
//							res_head = curr;
//							res_tail = curr;
//						} else {
//							res_tail.next = curr;
//							res_tail = res_tail.next;
//						}
//						prev_data = curr.val;
//						curr = curr.next;
//						res_tail.next = null;
//					}
//				}
//			} else {
//				if (prev_data == curr.val) {
//					curr = curr.next;
//				} else {
//					if (curr.next != null && curr.val == curr.next.val) {
//						prev_data = curr.val;						
//						curr = curr.next;
//					} else {
//						if (res_head == null) {
//							res_head = curr;
//							res_tail = curr;
//						} else {
//							res_tail.next = curr;
//							res_tail = res_tail.next;
//						}
//						prev_data = curr.val;
//						curr = curr.next;
//						res_tail.next = null;
//					}
//				}
//			}
//		}
//		
//	    

		
		while(curr != null) {
			if(curr.next != null && curr.next.val == curr.val) {
				int data = curr.val;
				while(curr != null && data == curr.val) {
					curr = curr.next;
				}												
			}
			else {
				if(res_head == null) {
     				res_head = curr;
	   			    res_tail = curr;
				}
				else 
				{	
					res_tail.next = curr;
					res_tail = res_tail.next;					
				}
				res_tail.next = null;
				curr = curr.next;
			}									
		}
		
		while (res_head != null) {
			System.out.print(res_head.val);
			res_head = res_head.next;
			if (res_head != null)
				System.out.print("->");
		}

	}
}
