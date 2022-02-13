/*Write a program RightTriangle that takes three int command-line arguments
and determines whether they constitute the side lengths of some right triangle. */
public class RightTriangle {
    public static void main(String[] args) {
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);  
       boolean arePositive = (a >= 0) && (b >= 0) && (c >= 0); 
       boolean answer = ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)) && arePositive;
    

       System.out.println(answer);
    }
}