package ru.ifmo.java.blockingServer;

import ru.ifmo.java.commonPartsOfComputeServer.ServerMetrics4;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

public interface Worker extends Runnable {
    static Worker create(ServerMetrics4 serverMetrics4,
                         List<Double> list,
                         ExecutorService executorService,
                         Function<List<Double>, Runnable> getWriterTask) {
        return new WorkerImpl(serverMetrics4, list, executorService, getWriterTask);
    }

    ServerMetrics4 getServerMetrics();
}