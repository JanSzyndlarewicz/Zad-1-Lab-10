package Package_ReachDestination;

import Package_RouteType.Route_1;
import Package_RouteType.Route_2;
import Package_TransportType.Transport_1;

public class Project_1 extends ReachDestination{

    public Project_1(){
        this.tt = new Transport_1();
        this.setAlgorytmInfoTransport("Algorytm nr 1 na wybranie środka transportu1");
        this.rt = new Route_2();
        this.setAlgorytmInfoRoute("Algorytm nr 2 na wybranie drogi1");
    }


    @Override
    public void printInfo() {
        System.out.println("\nProjekt 1 wykorzystuje " + this.getAlgorytmInfoTransport());
        System.out.println("Projekt 1 wykorzystuje " + this.getAlgorytmInfoRoute());
    }
}
