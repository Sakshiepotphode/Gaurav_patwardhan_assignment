public class rectangleAreaPerimeter {
 int area;
 int perimeter;

 void areaOfRectangle(int l,int b) {
 area=l*b;
 System.out.println("Area of rectangle"+area);
 }
 void perimeterOfRectangle(int l , int b) {
 perimeter = 2 *(l*b);
 System.out.println("Perimeter of Rectangle"+perimeter);
 }
public static void main(String args[]) {
 rectangleAreaPerimeter obj = new rectangleAreaPerimeter();
 obj.areaOfRectangle(8, 5);
 obj.perimeterOfRectangle(8, 5);
}
}