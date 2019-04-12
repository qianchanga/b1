public class ThreadA extends Thread {
    Redmoney redmoney;
    public ThreadA(Redmoney redmoney){
        this.redmoney=redmoney;
    }

    public void run(){
     synchronized (redmoney){
     if(redmoney.sizes<redmoney.getMonry().length){
         System.out.println(Thread.currentThread().getName()+":"+redmoney.getMonry()[(redmoney.sizes)]);
         redmoney.sizes=redmoney.sizes+1;
     }else {
         System.out.println(Thread.currentThread().getName()+"很遗憾");
     }

     }
    }
}
