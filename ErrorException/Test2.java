package ErrorException;

class Age {
    int age=500;
    public void ageJuge() throws Exception{
        if (age>0 && age<150){
            System.out.println("年龄合法");
        }else{
            throw new Exception("年龄不合法");
        }
    }
}
public class Test2{
    public static void main(String[] args){
        Age a = new Age();
        try{
            a.ageJuge();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
