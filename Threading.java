package com.company;

/* class MyTask{
     void executeTask(){
        for (int doc=1;doc<=10;doc++){
            System.out.println("@@ Printing Document #"+ doc + " Printer2");
        }
    }
} */

// MyTask Is-A Thread
/* class MyTask extends Thread{
    @Override
    public void run(){
        for (int doc=1;doc<=10;doc++){
            System.out.println("@@ Printing Document #"+ doc + " Printer2");
        }
    }
} */

class CA {

}

//class MyTask extends CA, Thread{ -> Error | Multiple Inheritance isn't supported in Java
class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for (int doc=1;doc<=10;doc++){
            System.out.println("@@ Printing Document #"+ doc + " Printer2");
        }
    }
}

class YourTask  implements Runnable{
    @Override
    public void run(){
        for (int doc=1;doc<=10;doc++){
            System.out.println("** Printing Document #"+ doc + " Printer3");
        }
    }
}


public class Threading {
    public static void main(String[] args) {
        // Whatever I write in here will be executed by main thread
        // threads always execute the jobs in a sequence

         // Job1
        System.out.println("==Application Started==");

        // Job2
        // MyTask task = new MyTask(); // Child Thread / Worker Thread
         // task.start(); // -> start shall  internally execute run method

        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();

//        Thread yourTask = new Thread(new YourTask());
        // YourTask.start();

        new Thread(new YourTask()).start();


            // Till Job2 is not finished, below written jobs are waiting and are not executed
        // In case job2 is a long running operation, i.e several documents are supposed to be printed
        // In such a use case OS/JVM shall give a message that app is not responding
       // Some sluggish behaviour in app can be observerd  -> App seems to hang

        // Now, main and MyTask are executing both parallely or concurrently !!

         // Job3
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("^^ Printing Document #" + doc + " Printer1");
        }
            // Job 4
        System.out.println("==Application Finished==");
    }
}
