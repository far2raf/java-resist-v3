package ru.ifmo.java.commonUserInterface;

import ru.ifmo.java.common.ServerType;

import java.util.List;

public interface SettingsOfComplexTestingOfServerPerformance extends Iterable<SettingsOfServerPerformanceTesting> {
    static SettingsOfComplexTestingOfServerPerformance create(
            List<Integer> rangeOfVariableParameter,
            TypeOfVariableParameter typeOfVariableParameter,
            ServerType serverType,
            int numberOfClients,
            int sizeOfRequest,
            int numberOfRequestPerClient,
            int clientSleepTime
    ) {
        return new SettingsOfComplexTestingOfServerPerformanceImpl(rangeOfVariableParameter,
                typeOfVariableParameter,
                serverType,
                numberOfClients,
                sizeOfRequest,
                numberOfRequestPerClient,
                clientSleepTime
        );
    }

    List<Integer> getRangeOfVariableParameter();

    TypeOfVariableParameter getTypeOfVariableParameter();

    ServerType getServerType();

    int getSizeOfRequest();

    int getNumberOfRequestPerClient();

    int getNumberOfClients();

    int getClientSleepTime();
}
