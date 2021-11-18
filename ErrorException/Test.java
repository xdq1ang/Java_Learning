package ErrorException;

public class Test {
    public static void main(String[] args){
        String[] strs = new String[]{"a","b","c"};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(strs[i]);
            }
        }catch(Exception e){//捕获任何异常
            System.out.println("发生了异常");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println(0);//捕获异常中一定会执行的代码
        }
    }
}
