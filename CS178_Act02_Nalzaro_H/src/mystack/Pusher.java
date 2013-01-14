package mystack;

public class Pusher extends Thread {
	
	 private MyStack myStack;

     Pusher(MyStack stack){
         this.myStack = stack;
     }
    @Override
    public void run(){
    	int i;
        System.out.println("The result");
        System.out.println("------------------------------------");
        if(myStack.last < this.myStack.stack.length){
            for(i = 0; i < 10; i++){

            	System.out.println( this.getName() + "The system pushed " + i);
                System.out.println("------------------------------------");
            }
        }
        
    }

}
