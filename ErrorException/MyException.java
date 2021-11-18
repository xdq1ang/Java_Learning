package ErrorException;

public class MyException extends Exception{
    private int idnumber;
    public MyException(String message,int id){
        super(message);
        this.idnumber=id;
    }
    public int getId(){
        return idnumber;
    }
}
class MyExceptionTest{
    static int age;
    public static void test(int age) throws MyException{
        if (age>0 && age<150){
            MyExceptionTest.age =age;
        }else{
            throw new MyException("年龄超超出范围",1);
        }
    }
    public static void main(String[] args){
        try {
            MyExceptionTest.test(200);
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}

