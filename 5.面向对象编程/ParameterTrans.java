public class ParameterTrans {
    public static void swap(int i){
        i=6;
        System.out.println("swap方法中的i参数值为:"+i);
    }
    public static void main(String[] args){
        int a=0;
        swap(a);//这里传入的不是a本身，只是a的值的拷贝。swap(a)不会对a本身改变
        System.out.println("main方法中a的值为:"+a);
    }
}


//大致过程
//int a=0    在栈中开辟内存，存储的值为0；
//swap(a)    会先调用swap方法：
//                            传入时： 在栈中开辟内存存储的值为a那里复制过来的值，为0
//                            i=6  :   把i的值改为6