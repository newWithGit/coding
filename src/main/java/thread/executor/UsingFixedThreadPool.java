package thread.executor;

import thread.common.LoopTaskA;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Executor ex = Executors.newFixedThreadPool(5);
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        ex.execute(new LoopTaskA());
        System.out.println(((ExecutorService) ex).isShutdown());
        ((ExecutorService) ex).shutdown();
        System.out.println(((ExecutorService) ex).isShutdown());
        ex.execute(new LoopTaskA());

        System.out.println("Main thread ends");
    }
}
