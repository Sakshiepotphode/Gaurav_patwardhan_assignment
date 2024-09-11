

 public class circleCircum {

void areaOfCircle(int r) {
double pi= 3.14, area;
 area = pi*r*r;
 System.out.println("Area of circle="+ area);
 }

 void circumferenceOfCircle(int r) {
 double pi=3.14, circumference;
 circumference=2*pi*r;
 System.out.println("Circumference of circle="+circumference);
 }

 public static void main(String args[]) {
 circleCircum obj = new circleCircum();
 obj.areaOfCircle(8);
 obj.circumferenceOfCircle(5);
 }

 }