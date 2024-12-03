package Dictionnaire;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class exo1 {
    public static void main(String[] args){

        Thread thread1 = new Thread(()-> {
            for(int i = 0 ; i < 5; i++){
                System.out.println("Tread 1 en cours");
                try{
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread1.start();

        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        for(Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()){
            Thread thread = entry.getKey();
            StackTraceElement[] stackTrace = entry.getValue();

            System.out.println("Thread: " + thread.getName());
            for(StackTraceElement element : stackTrace){
                System.out.println(element);
            }
            System.out.println();
        }
        try{
            thread1.join();
        }catch ( InterruptedException e){
            e.printStackTrace();
        }

    }
}