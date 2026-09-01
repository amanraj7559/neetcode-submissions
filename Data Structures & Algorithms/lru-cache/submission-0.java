class LRUCache {
    class Node{
        int val;
        int key;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    int capacity;
    Node head;
    Node tail;
    Map<Integer,Node> map=new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map.clear();
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;      
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node=map.get(key);
        deleteNode(node);
        insertNode(node);
        return node.val;        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            deleteNode(node);
            insertNode(node);
        }
        else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                map.remove(lru.key);
                deleteNode(lru);
            }
            Node node=new Node(key,value);
            map.put(key,node);
            insertNode(node);
        }
        
    }
    public void deleteNode(Node node){
        Node temp1=node.prev;
        Node temp2=node.next;
        temp1.next=temp2;
        temp2.prev=temp1;
    }
    public void insertNode(Node node){
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        node.next=temp;
        temp.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */