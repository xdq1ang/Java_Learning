package getarea;

public class TriAngle{
    public static void main(String[] args){ 
    getTriAngle Tri=new getTriAngle();
    Tri.getArea(8,1);
    }
}

class getTriAngle {
    private double base;
    private double height;
    public void getArea(double b,double h){
        base=b;
        height=h;
        System.out.println(0.5*base*height);

    }
    
}
