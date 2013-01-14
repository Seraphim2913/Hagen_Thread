package mystack;

public class MyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyStack stack = new MyStack(100);
	        
	        for(int i = 0; i<2 ; i++){
	            Pusher push = new Pusher(stack);
	            push.setName("Thread Pusher " + String.valueOf(i) + ": ");
	            push.start();
	        }

	        for(int i = 0; i<1 ; i++){
	            Popper pop = new Popper(stack);
	            pop.setName("Thread Popper " + String.valueOf(i) + ": ");
	            pop.start();
	        }

	    }

	}

