package com.company;

public class Server {
    private int[] countVehicles;
    private int commonCountVehicles = 0;

    public Server (int size) {
        countVehicles = new int[size];
    }

    public int getLimitVehicle () {
        return 6;
    }


    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    public int[] getCountVehicles() {
        return countVehicles;
    }

    public void addTransport (int numberVehicles, Vehicle vehicle) {
        countVehicles[numberVehicles]++;
        commonCountVehicles++;
        vehicle.move(countVehicles[numberVehicles]);
    }

    public void addTransportRun (int numberVehicles, Run run){
        countVehicles[numberVehicles]++;
        commonCountVehicles++;
        run.move(countVehicles[numberVehicles]);
    }
}
