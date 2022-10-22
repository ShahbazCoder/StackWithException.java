package Stack;

class Stack<T>{
    private T[] arr;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(){
        
        arr=(T[])(new Object[5]);
        top=0;
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==arr.length){
        	return true;
        }
        return false;
    }

    public boolean push(T value){
        if(isFull()){
        	throw new FullStackException("Stack is Full");
        }
        arr[top]=value;
        top++;
        return true;
    }

    public boolean pop(){
        if(isEmpty()){
            throw new EmptyStackException("Stack is Empty");
        }
        else{
            top--;
            return true;
        }
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException("Stack is Empty");
        }
        else{
            return arr[top-1];
        }
    }


    
    public String toString(){
        if(isEmpty()){
            return "\0";
        }
        else {
            String str = "";
            for (int i = top - 1; i >= 0; i--) {
                str += "|\t" + arr[i] + "\t|\n";
            }
            return str;
        }
    }
}
