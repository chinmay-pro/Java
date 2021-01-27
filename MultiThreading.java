package com.company;

class Printer{
//   synchronized void printDocuments(int numOfCopies, String docName){
    void printDocuments(int numOfCopies, String docName){
        for (int i=1;i<=numOfCopies;i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing "+docName+" " + i);
        }
    }
}

class MyThread extends Thread{

    Printer pRef;

    MyThread(Printer p){
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocuments(10,"SamsProfile.pdf");
        }
    }
}

class YourThread extends Thread{

    Printer pRef;

    YourThread(Printer p){
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocuments(10,"TinasProfile.pdf");
        }
    }
}

public class MultiThreading {

    //main is representing main thread
    public static void main(String[] args) {
        System.out.println("==Application Started==");
        // I am having only 1 single object of Printer
        Printer printer = new Printer();
//        printer.printDocuments(10,"ChinmaysProfile.pdf");

           // Scenario is that we have multiple thread working on the same printer Object
        // If Multiple Threads are going to work on the same single Object we must Synchronize

            MyThread mRef = new MyThread(printer); //MyThread is having reference to the Printer object
            YourThread yRef = new YourThread(printer); //YourThread is having reference to the Printer object
            mRef.start();
        /*try {
            mRef.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        yRef.start();
        System.out.println("==Application Finished==");
    }
}
