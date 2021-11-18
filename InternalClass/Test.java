package InternalClass;

public class Test {
    int i;
    public int z;
    private int k;
    class A{
        public void setTest3Fields(){
            Test.this.i=1;
            Test.this.z=2;
            Test.this.k=3;
        }
    }

    public void setInfo(){
        new A().setTest3Fields();//new 内部类对象后

    }
    public void showInfo(){
        System.out.println(this.i);
        System.out.println(this.z);
        System.out.println(this.k);

    }
    public static void main(String[] aegs){
        Test t = new Test();
        t.setInfo();
        t.showInfo();
    }
}
