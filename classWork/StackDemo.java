package classWork;
interface Stack{
    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int size();
}
class ArrayStack implements Stack{
    private Object[] a;
    private int size;
    public ArrayStack(int capacity){
        a=new Object[capacity];
    }
    public boolean isEmpty(){
        return (size==0);
    }

    @Override
    public Object peek() {
        if(isEmpty())throw new IllegalStateException("Stack Empty");
        return a[size-1];
    }

    @Override
    public Object pop() {
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }

    @Override
    public void push(Object obj) {

    }

    @Override
    public int size() {
        return 0;
    }
}
public class StackDemo  {

}
