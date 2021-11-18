public class test1 {
    public static void main(String[] args){
        System.out.print("sss\n");
        System.out.println("sss\n");
        byte b = 1;
        short s = 2;
        long l = 3l;
        boolean b1=false;
        int i = 4;
        float f1 = 8.0f;
        double d1 = 8.0;
        char c= 's';
        String str = "good!";//引用类型的数据可以初始化为null
        /*
        引用类型的数据可以初始化为null
        内存中只会存在一个good morning!字符串（引用类型）
        但是基本数据类型可能存在多个相同的数据
         */
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(b1);
        System.out.println(i);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(str);

        byte b0=1;
        int m = b0;
        //byte b6=m;
        //小容量数据可以转化为大容量数据，
        //反过来不行
        /*
        多种类型数据混合运算时，
        先把数据转化为容量最大的数据类型再计算
        */
        int n =1;
        short j=2;
        byte k=3;
        System.out.println(n+j+k);

        /*
        char a="a";
        char进行数学运算时先转化为asc码再计算
         */
        int  i0=1;
        int i1=20;
        int i3=3;
        int o=i0>i1 ? (i0>i3 ? i0:i3):(i1>i3? i1:i3);
        System.out.print(o);
    }    
}
