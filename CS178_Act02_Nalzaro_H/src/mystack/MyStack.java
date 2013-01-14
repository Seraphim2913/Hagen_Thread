package mystack;

public class MyStack {
	
	 public String[] stack;
	    public int last;

	    /**
	     * @param args the command line arguments
	     */
	   MyStack(int size){
	      this.stack = new String[size];
	      this.last = -1;
	   }

	   public synchronized  void push(String element){
	       if(++this.last < this.stack.length)
	       {
	           stack[this.last] = element;
	       }
	   }

	   public synchronized void pop(){
		   new String();
	       
	       if(this.last != -1){
	          this.last--;
	       }
	   }

}
