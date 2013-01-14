package mystack;

public class Popper extends Thread{

 private MyStack stack;
     
     Popper(MyStack stack){
         this.stack = stack;
     }
    @Override
    public void run(){
    	int i;
        if(this.stack.last != -1){
            for(i = 0; i < 10; i++){
            stack.pop();
            System.out.println(this.getName() + "The system Popped " + i);
            System.out.println("------------------------------------");
            }
        }
    }
}
