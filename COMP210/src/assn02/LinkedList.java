package assn02;

class Node{
    int _value;
    Node _nextNode;
    Node(int val){ //constructs a Node object
        _value=val;
        _nextNode=null;
    }
}
public class LinkedList{
    Node _head;
    int _size;
    LinkedList(int value){
        _head=new Node(value); //calls the node class to construct a node object
        _size=1;
    }
    public Node insertNode(int value){
        Node node=new Node(value);
        node._nextNode=_head;
        _head=node;
        _size++;
        return(_head);
    }
    public Node searchNode(int i){
        if (i>_size){
            return null;
        }
        Node ptr=_head;
        if (i==0){
            return _head;
        }
        else{
            for (int j=1; j<=i; j++){
                ptr=ptr._nextNode;
            }
        }
        return ptr;
    }
    public static void main(String[] args){
        String[] j=new String[2];
        LinkedList ll=new LinkedList(10);
        ll.insertNode(20);
        ll.insertNode(40);
        ll.insertNode(30);
        System.out.println(ll.searchNode(3));
        System.out.println(1);
    }
}

