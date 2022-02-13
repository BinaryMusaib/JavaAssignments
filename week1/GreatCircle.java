/*Write a program GreatCircle.java that takes four double command-line arguments
 x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points
 on the surface of the earth—and prints 
 the great-circle distance (in kilometers) between them. 
Use the following Haversine formula*/
public class GreatCircle {
    public static void main(String[] args) {
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double lon1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double lon2 = Math.toRadians(Double.parseDouble(args[3]));
        double earthRadius = 6371.0;

        //formala using law of cosines
        //double distance = earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));

        //another way of implementing haversine's Formula, it's little overwhelming ;)
        /*double haversineFormula = 2 * (Math.asin(Math.sqrt(Math.pow(Math.sin((lat2 - lat1) / 2), 2)
        + Math.cos(lat1) * Math.cos(lat2)
        * Math.pow(Math.sin((lon2 - lon1) / 2),2))));*/

        double haversineFormula = Math.pow(Math.sin((lat2 - lat1) / 2), 2)
                 + Math.cos(lat1) * Math.cos(lat2)
                 * Math.pow(Math.sin((lon2 - lon1) / 2),2);
        double distance = 2 * Math.asin(Math.sqrt(haversineFormula));
         System.out.println((earthRadius * distance) + " kilometers");
    }
}