public class removecycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Check whether cycle exists
    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Remove cycle
    public static void removecycle() {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // Finding meeting point
        slow = head;
        Node prev = null; // meeting point ke phle wale ko point krega islie null se intialize kia

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle
        prev.next = null;
    }

    public static void main(String args[]) {

        head = new Node(1);

        Node temp = new Node(2);
        head.next = temp;

        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(iscycle());

        removecycle();

        System.out.println(iscycle());
    }
}