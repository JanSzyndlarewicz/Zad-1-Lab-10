package Package_Main;

import Package_ReachDestination.Project_1;
import Package_ReachDestination.Project_2;
import Package_ReachDestination.Project_3;
import Package_RouteType.ChooseRouteType;
import Package_RouteType.Route_1;
import Package_RouteType.Route_2;
import Package_RouteType.Route_3;
import Package_TransportType.ChooseTransportType;
import Package_TransportType.Transport_1;
import Package_TransportType.Transport_2;
import Package_TransportType.Transport_3;

import java.util.Scanner;


public class ReachDestination {
    public ReachDestination() {
    }

    public static void menu() {
        System.out.println("'\n-----Menu-----");
        System.out.println("0 - Zakończ program");
        System.out.println("1 - Wyświetl informacje o wybranej strategii");
        System.out.println("2 - Wykonaj całą strategię");
        System.out.println("3 - Część strategii");
        System.out.println("4 - Zmień część strategii");
        System.out.println("5 - Zmień projekt");
    }

    public static void menuProjekt() {
        System.out.println("1 - Projekt nr 1");
        System.out.println("2 - Projekt nr 2");
        System.out.println("3 - Projekt nr 3");
        System.out.print("Wybierz projekt: ");
    }

    public static void setNewStrategy(int nrStrategy, int whichPart, Package_ReachDestination.ReachDestination p) {
        if (whichPart == 1) {
            switch (nrStrategy) {
                case 1: {
                    p.setNewStrategy(whichPart, new Transport_1(), "Algorytm 1 na wybranie środka transportu (rower)", (ChooseRouteType) null, "");
                    break;
                }
                case 2: {
                    p.setNewStrategy(whichPart, new Transport_2(), "Algorytm 2 na wybranie środka transportu (samochód)", (ChooseRouteType) null, "");
                    break;
                }
                case 3: {
                    p.setNewStrategy(whichPart, new Transport_3(), "Algorytm 3 na wybranie środka transportu (autobus)", (ChooseRouteType) null, "");
                    break;
                }
                default: {
                    System.out.println("Brak strategii");
                    break;
                }

            }
        } else if (whichPart == 2) {
            switch (nrStrategy) {
                case 1: {
                    p.setNewStrategy(2, (ChooseTransportType) null, "", new Route_1(), "Algorytm 1 na znalezienie trasy");
                    break;
                }
                case 2: {
                    p.setNewStrategy(2, (ChooseTransportType) null, "", new Route_2(), "Algorytm 2 na znalezienie trasy");
                    break;
                }
                case 3: {
                    p.setNewStrategy(2, (ChooseTransportType) null, "", new Route_3(), "Algorytm 3 na znalezienie trasy");
                    break;
                }
                default: {
                    System.out.println("Brak strategii");
                    break;

                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userChoiceProject;
        int userChoiceEdition;

        Package_ReachDestination.ReachDestination p;


        do {
            menuProjekt();

            userChoiceProject = scan.nextInt();

            switch (userChoiceProject) {
                case 1: {
                    p = new Project_1();

                    break;
                }

                case 2: {
                    p = new Project_2();

                    break;
                }

                case 3:{
                    p = new Project_3();
                    break;
                }

                default:{
                    p = new Project_1();
                }
            }

            do {
                menu();

                userChoiceEdition = scan.nextInt();

                switch (userChoiceEdition) {

                    case 0: {
                        System.out.println("Koniec działania programu");
                        break;
                    }
                    case 1: {
                        p.printInfo();
                        break;
                    }
                    case 2: {
                        p.doAllStrategy();
                        break;
                    }
                    case 3: {
                        int whichPart;
                        System.out.println("Którą część strategii wyświetlić?");
                        whichPart = scan.nextInt();
                        p.doOneStrategy(whichPart);
                        break;
                    }
                    case 4: {
                        int whichPart;
                        int nrStrategy;

                        do {
                            System.out.println("Wybierz którą strategię edytować");
                            System.out.println("1 - ChooseTransportType");
                            System.out.println("2 - ChooseRouteType");
                            whichPart = scan.nextInt();
                        } while (whichPart < 1 || whichPart > 2);

                        do {
                            System.out.println("Wybierz nr strategii:");
                            nrStrategy = scan.nextInt();
                        } while (nrStrategy < 1 || nrStrategy > 3);

                        setNewStrategy(nrStrategy, whichPart, p);

                        break;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        System.out.println("Niepoprawne dane");
                    }
                }
            } while (userChoiceEdition != 5);

        } while (userChoiceProject < 1 || userChoiceProject > 2 || userChoiceEdition == 5);

    }
}