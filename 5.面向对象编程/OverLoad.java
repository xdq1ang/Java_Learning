public class OverLoad {
    public int add(int x,int y){
        return x+y;
    }
    public double add(double x,double y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args){
        OverLoad OL=new OverLoad();
        System.out.println(OL.add(1,2,3));
        System.out.println(OL.add(1.0,2.0));
        System.out.println(OL.add(1,2,3));
    }
    
}
