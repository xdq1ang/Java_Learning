public class CommonEmployee extends Employee {
    public CommonEmployee(String name,String id,double salary){
        super(name,id,salary);
    }
    @Override
    public void work() {
        System.out.println("CommoEmployee is working !");
        
    }
}
