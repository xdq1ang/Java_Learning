public class Kids extends ManKind {
    int yearsOld=10;
    public Kids(){
        super();
        System.out.println("Kids类的无参数构造器被调用了");
    }
    public void printAge(){
        System.out.println(this.yearsOld);
    }
    public static void main(String[] args){
        Kids someKid=new Kids();
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
    public int getYearsOld() {
        return yearsOld;
    }
    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
