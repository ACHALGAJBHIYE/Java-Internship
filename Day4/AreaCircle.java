public class AreaCircle{
    public static void main(String[] args){
        float radius = 5.6f, area;
        area = 3.14f * radius * radius;
        System.out.println("Area = " + area);
        System.out.printf("Area = %.2f" , area);//Note this line
        /*
         *  Here we used formatted print statement like we print in c
         */
    }
}