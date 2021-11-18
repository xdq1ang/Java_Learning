public class WhileTest {
    public static void main(String[] args){
        int i=0;
        while(i<100){
            i++;
            System.out.println(i);
        }

        do{
            System.out.println("do while "+i);
            i++;
        }while(i<=100);
    }
    
}
