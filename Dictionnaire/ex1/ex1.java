package Dictionnaire.ex1;

import java.util.Map;

public class ex1 {
    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            for(int i = 1; i <=5 ; i++){
            System.out.println("Thread");
                try{
                Thread.sleep(1000);
                }catch(InterruptedException e){
                e.printStackTrace();
                }

            }
        });

        thread1.start();

        try{
            Thread.sleep(500);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Map<Thread,StackTraceElement[]> traces = Thread.getAllStackTraces();
        for(Map.Entry<Thread, StackTraceElement[]> entry : traces.entrySet()){
            Thread thread = entry.getKey();
            StackTraceElement[]  stackTrace =  entry.getValue();

            System.out.println(thread.getName());
            for(StackTraceElement stackTraceElements : stackTrace ){
                System.out.println(stackTraceElements);
            }
            System.out.println();
        }
        try{
            thread1.join();

        }catch(InterruptedException e){
            e.printStackTrace();
        }
    



    }
}
