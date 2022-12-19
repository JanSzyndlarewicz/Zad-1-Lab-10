package Package_ReachDestination;

import Package_RouteType.Route_1;
import Package_RouteType.Route_3;
import Package_TransportType.Transport_2;
import Package_TransportType.Transport_3;

public class Project_3 extends ReachDestination{

    public Project_3(){
        this.tt = new Transport_3();
        this.setAlgorytmInfoTransport("Algorytm nr 3 na wybranie środka transportu");
        this.rt = new Route_3();
        this.setAlgorytmInfoRoute("Algorytm nr 3 na wybranie drogi");
    }
    @Override
    public void printInfo() {
        System.out.println("\nProjekt 3 wykorzystuje " + this.getAlgorytmInfoTransport());
        System.out.println("Projekt 3 wykorzystuje " + this.getAlgorytmInfoRoute());
    }
}
