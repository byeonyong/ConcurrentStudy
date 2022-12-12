public class Thread_Interrupt {

//   while 돌다가 Interrupt가 발생하면 thread를 탈출하는거임
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
        while(true){
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("exit ! ");
                return; // return을 해줘서 종료가 되는거임 interrupt는 thread 종료를 시키는 명령어는 아님
            }
    
        }

        });
        thread.start();
        System.out.println("Thread :" + Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.interrupt();
    }
}
