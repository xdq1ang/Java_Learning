public class Manager extends Employee {
        public Manager(String name, String id, double salary) {
        super(name, id, salary);
        this.bonus=1000;
    }

        double bonus;
    
        @Override
        public void work() {
            System.out.println("Manager is working");
            
        }
        public String getName(){
            return this.name;
        }
        public String getId(){
            return this.id;
        }
        public double getSalary(){
            return this.salary;
        }
        public double getBonus(){
            return this.bonus;
        }
        
}
