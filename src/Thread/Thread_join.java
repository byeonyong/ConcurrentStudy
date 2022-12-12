public class Thread_join {

//  join은 join을 사용해준 해당 thread가 끝날때까지 기다렸다가 다음 코드 실행하는것 의미함
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{

            try {
                System.out.println("Thread :" + Thread.currentThread().getName());
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }

        });
        thread.start();
        System.out.println("Thread :" + Thread.currentThread().getName());
        
//        thread.join() 은 예외처리를 해줘야 함. 기다리는 동안 interrupt 발생할수도 있기 때문에 처리 해줘야하기 때문
        try{
            thread.join();    
        }catch(IllegalStateException e){
            e.printStackTrace();
        }
        
        System.out.println(thread + "is finished");
    }
}
