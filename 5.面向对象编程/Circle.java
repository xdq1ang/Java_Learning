public class Circle {
    public static void main(String[] args){
        Circle C1=new Circle();
        double area=C1.computeArea(1);
        System.out.println("area="+area);
    }

    public double computeArea(double r){
        return 3.14*r*r;
    }
    
}

