package com.company;

import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {



        //part 1
        Server server = new Server(4);

        System.out.println("\n\n------------- Часть 1 -------------\n");
        for (int i = 0; i < server.getLimitVehicle(); i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
            switch (randomNum) {
                case 1:
                    server.addTransport(0, new Car());
                    break;
                case 2:
                    server.addTransport(1, new Bicycle());
                    break;
                case 3:
                    server.addTransport(2, new RollerSkates());
                    break;
                case 4:
                    server.addTransport(3, new Jumpers());
                    break;
                default:
                    break;
            }
        }

        int[] countVehicles = server.getCountVehicles();
        System.out.println("\nИтого:");
        System.out.println(countVehicles[0] + " автомобилей выехало.");
        System.out.println(countVehicles[1] + " велосипедов выехало.");
        System.out.println(countVehicles[2] + " роликовых коньков выехало.");
        System.out.println(countVehicles[3] + " джамперов выехало.\n\n------------- Часть 2 -------------\n");






        //part 2
        Server server2 = new Server(3);

        Stack<Bus> stackBus = new Stack<>();
        stackBus.push(new Bus("Mersedes", 150, 20000, 40));
        stackBus.push(new Bus("BMW", 180, 18000, 38));
        stackBus.push(new Bus("Volkswagen", 130, 22000, 42));
        stackBus.push(new Bus("GAZ", 150, 20000, 41));
        stackBus.push(new Bus("URAL", 200, 18000, 32));
        stackBus.push(new Bus("Ford", 120, 23000, 40));

        Stack<TractorWheel> stackTw= new Stack<>();
        stackTw.push(new TractorWheel("Star", 120, 4000));
        stackTw.push(new TractorWheel("Mersedes-benz", 100, 5000));
        stackTw.push(new TractorWheel("Belarus", 150, 4500));
        stackTw.push(new TractorWheel("Kubota", 120, 4000));
        stackTw.push(new TractorWheel("Valtra", 90, 5000));
        stackTw.push(new TractorWheel("McCormick", 110, 4500));

        Stack<TractorCrawl> stackTc = new Stack<>();
        stackTc.push(new TractorCrawl("Niva", 100, 3800));
        stackTc.push(new TractorCrawl("Lada", 90, 5500));
        stackTc.push(new TractorCrawl("Claas", 130, 3500));
        stackTc.push(new TractorCrawl("Deutz-Fahr", 120, 3800));
        stackTc.push(new TractorCrawl("Iseki", 90, 5300));
        stackTc.push(new TractorCrawl("Landini", 110, 3500));


        for (int i = 0; i < server.getLimitVehicle(); i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
            switch (randomNum) {
                case 1:
                    server2.addTransportRun(0, stackBus.pop());
                    break;
                case 2:
                    server2.addTransportRun(1, stackTw.pop());
                    break;
                case 3:
                    server2.addTransportRun(2, stackTc.pop());
                    break;
                default:
                    break;
            }
        }

        int[] countVehiclesRun = server2.getCountVehicles();
        System.out.println("\nИтого:");
        System.out.println(countVehiclesRun[0] + " автобусов выехало.");
        System.out.println(countVehiclesRun[1] + " колёсных тракторов выехало.");
        System.out.println(countVehiclesRun[2] + " гусеничных тракторов выехало.");
    }
}
