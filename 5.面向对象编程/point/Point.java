package point;
public class Point{
    public static void main(String[] args){
        Point1 P=new Point1(1,2,3);
        System.out.println(P.x+P.y+P.z);
    }
}

class Point1 {
    int x;
    int y;
    int z;
    public Point1(int X,int Y,int Z){
        x=X;
        y=Y;
        z=Z;
    }
    public void setPoint(int i,int j,int k){
        x=i;
        y=j;
        z=k;
    }
}
