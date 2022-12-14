package Package_Main;

import Package_ReachDestination.Project_1;
import Package_ReachDestination.Project_2;
import Package_RouteType.ChooseRouteType;
import Package_RouteType.Route_1;
import Package_TransportType.ChooseTransportType;
import Package_TransportType.Transport_1;

public class ReachDestination {
    public ReachDestination(){
    }
    public static void main(String[] args) {
        Project_1 p1 = new Project_1();
        Project_2 p2 = new Project_2();

        p1.doStrategy(1);
        p1.doStrategy(2);
        p1.printInfo();

        System.out.println("\n\n");

        p2.doStrategy(1);
        p2.doStrategy(2);
        p2.printInfo();

        System.out.println("\n\n Zmiana Algorytmów");
        p2.setNewStrategy(1, new Transport_1(), "Algorytm 1 na wybranie środka transportu", (ChooseRouteType)null, "");
        p2.doStrategy(1);
        p2.printInfo();

        System.out.println("\n\n");
        p1.setNewStrategy(2, (ChooseTransportType)null, "", new Route_1(), "Algorytm 1 na znalezienie trasy");
        p1.doStrategy(2);
        p1.printInfo();

    }
}