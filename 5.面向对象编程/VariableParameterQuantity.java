public class VariableParameterQuantity {
    //方法一：
    //必须定义一个数组
    public void printInfo(String[] args){//打印的信息来源于参数的传递，但是每次传递的参数可能不同
        for (int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    //方法二：
    //可以不定义数组，也可以定义数组
    public void printInfo1(String...args){
        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void main(String[] args){
        String[] arg=new String[]{"xdqiang","11"};
        String[] arg1=new String[]{"ChongQ"};
        VariableParameterQuantity V=new VariableParameterQuantity();
        V.printInfo(arg);
        V.printInfo(arg1);
        V.printInfo1(arg);
        V.printInfo1("zhangsan","1");
    }
    
}
