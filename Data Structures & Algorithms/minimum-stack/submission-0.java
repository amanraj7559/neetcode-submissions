class MinStack {
    Stack<Integer> s;
    Stack<Integer> temp;
    int min=Integer.MAX_VALUE;

    public MinStack() {
        s=new Stack<>(); 
        temp=new Stack<>();    
        
    }
    
    public void push(int val) {
        
        if(temp.isEmpty() || val<=temp.peek()) temp.push(val);
        s.push(val);
        
    }
    
    public void pop() {
        
        int pop=s.pop();
        if(pop==temp.peek()) temp.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return temp.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */