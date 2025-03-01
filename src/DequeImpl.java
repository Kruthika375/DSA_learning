public class DequeImpl {
    Node front;
    Node rear;
    static public class Node{
        Node prev;
        Node next;
        int data;

        Node(int data){
            this.data=data;
        }
    }
    public void insertFirst(Node node)  {
        if(node == null){
            System.out.println("Null cannot be inserted");
        }else if(this.front==null){
            front=rear=node;
        }else{
            front.prev=node;
            node.next=front;
            front=node;
        }
    }

    public void insertLast(Node node) {
        if(node==null){
            System.out.println("Null cannot be inserted");
        } else if(this.rear==null){
            front=rear=node;
        } else{
            node.prev=rear;
            rear.next=node;
            rear=node;
        }
    }

    public Node deleteFirst()  {
        if(this.front==null){
            return new Node(0);
        }else{
            Node temp= front;
            front=front.next;
            if(front==null){
                rear=null;
            }else{
                front.prev=null;
            }
            return temp;
        }
    }

    public Node deleteLast()  {
        if(this.rear==null){
            return new Node(0);
        }else{
            Node temp=rear;
            rear=rear.prev;
            if(rear==null){
                front=null;
            }else{
                rear.next=null;
            }
            return temp;
        }
    }

    public Node getFirst(){
        return front;
    }
    public Node getLast(){
        return rear;
    }
    public void print() {
        Node temp=front;
        if(temp==null){
            System.out.println("Deque is empty");
        }else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
