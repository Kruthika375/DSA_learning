public class LL {

    static Node head;
    static Node tail;
    static int size;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }

        public Node(int data){
            this.data=data;
        }
    }

    public static void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;
        if(tail==null){
            tail=node;
        }
        size+=1;
    }

    public static void display(){
        Node temp= head;
        if(head==null || tail==null){
            System.out.println();
        }
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public static void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        Node node= new Node(val);
        tail.next= node;
        tail=node;

        size+=1;
    }

    public static void insert(int val, int index){
        if(index==0){
            insertFirst(val);
        }
        if(index==size){
            insertLast(val);
        }
        Node temp= head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next= node;
        size++;
    }

    public static int deleteFirst(){
        int val= head.data;
        head=head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public static int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val=tail.data;
        Node secondLast= get(size-2);
        tail=secondLast;
        tail.next=null;

        size--;
        return val;
    }
    public static Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val=prev.next.data;
        prev.next=prev.next.next;

        size--;
        return val;
    }

    public static Node find(int val){
        Node temp = head;
        while (temp!=null){
            if(temp.data==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public static int middleNode(){
//        Node temp= head;
//        int cnt=0;
//        while (temp!=null){
//            temp=temp.next;         //TC: O(n+n/2)   SC: O(1)
//            cnt++;
//        }
//        int mid=cnt/2;
//        Node node= head;
//        for(int i=0;i<mid;i++){
//            node=node.next;
//        }
//        return node.data;

        Node slow= head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }


}


