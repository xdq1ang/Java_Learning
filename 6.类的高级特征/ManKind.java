public class ManKind {
    int sex=1;
    int salary=0;
    public ManKind(){
        System.out.println("ManKind类的无参数构造器被调用了");
    }
    public ManKind(int sex,int salary){//自定义显示构造器之后就会覆盖默认构造器；
       this.sex=sex;
       this.salary=salary; 
    }
    public void manOrWoman(){
        if (sex==1){
            System.out.println("is man");
        }else if(sex==0){
            System.out.println("is woman");
        }
    }
    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else if(salary!=0){
            System.out.println("job");
        }
    }
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
