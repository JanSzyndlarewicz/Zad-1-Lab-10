package Package_ReachDestination;

import Package_RouteType.Route_1;
import Package_RouteType.Route_2;
import Package_TransportType.Transport_1;
import Package_TransportType.Transport_2;

public class Project_2 extends ReachDestination{

    public Project_2(){
        this.tt = new Transport_2();
        this.setAlgorytmInfoTransport("Algorytm nr 2 na wybranie środka transportu2");
        this.rt = new Route_1();
        this.setAlgorytmInfoRoute("Algorytm nr 1 na wybranie drogi2");
    }

    @Override
    public void printInfo() {
        System.out.println("\nProjekt 2 wykorzystuje " + this.getAlgorytmInfoTransport());
        System.out.println("Projekt 2 wykorzystuje " + this.getAlgorytmInfoRoute());
    }
}
