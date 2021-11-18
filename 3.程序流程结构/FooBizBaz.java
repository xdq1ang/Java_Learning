public class FooBizBaz {
    public static void main(String[] args){
        for (int i=1;i<151;i++){
            String str="";
            str+=i;
            if(i%3==0){
                str+=" foo";
            }
            if(i%5==0){
                str+=" biz";
            }
            if(i%7==0){
               str+=" baz";
            }
        System.out.println(str);
        }
    }
    
}
