package Package_ReachDestination;

import Package_RouteType.ChooseRouteType;
import Package_TransportType.ChooseTransportType;

public abstract class ReachDestination {
    protected ChooseRouteType rt;
    protected ChooseTransportType tt;

    private String algorytmInfoRoute;
    private String algorytmInfoTransport;

    public ReachDestination(){
    }

    public void doStrategy(int nrStrategy){
        switch (nrStrategy){
            case 1:{
                this.tt.ChooseTransport();
                break;
            }
            case 2:{
                this.rt.ChooseRoute();
                break;
            }
            default:{
                System.out.println("Brak wybranej strategii");
            }
        }
    }

    public void setNewStrategy(int nrStrategy, ChooseTransportType tt, String algorytmInfoRoute, ChooseRouteType rt, String algorytmInfoTransport){
        switch (nrStrategy){
            case 1:{
                if(tt != null){
                    this.tt = tt;
                    this.algorytmInfoTransport = algorytmInfoTransport;
                }
                break;
            }
            case 2:{
                if(rt != null){
                    this.rt = rt;
                    this.algorytmInfoRoute = algorytmInfoRoute;
                }
                break;
            }
            default:{
                System.out.println("Brak wybranej strategii");
                break;
            }
        }
    }

    public abstract void printInfo();

    public ChooseRouteType getRt() {
        return rt;
    }

    public void setRt(ChooseRouteType rt) {
        this.rt = rt;
    }

    public ChooseTransportType getTt() {
        return tt;
    }

    public void setTt(ChooseTransportType tt) {
        this.tt = tt;
    }

    public String getAlgorytmInfoRoute() {
        return algorytmInfoRoute;
    }

    public void setAlgorytmInfoRoute(String algorytmInfoRoute) {
        this.algorytmInfoRoute = algorytmInfoRoute;
    }

    public String getAlgorytmInfoTransport() {
        return algorytmInfoTransport;
    }

    public void setAlgorytmInfoTransport(String algorytmInfoTransport) {
        this.algorytmInfoTransport = algorytmInfoTransport;
    }
}
