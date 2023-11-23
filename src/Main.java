//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y
public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(56, 89);
        Point point2 = new Point(71, 43);
        System.out.println("Le coordinate di punto1 sono: x= " + point1.x()+ ", y = " + point1.y());
        System.out.println("Le coordinate di punto2 sono: x= " + point2.x()+ ", y = " + point2.y());


        double distance = point1.calDistance(point2);
        System.out.println("Distanza tra punto 1 e punto 2: " + distance);
        }
    }
