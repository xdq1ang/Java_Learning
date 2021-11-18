public final class FinalPerson {
    int age;
    String name;
    final String SEX="男";//final修饰的是常量必须显示赋值
    final static String SEX1="男";//final和static一起修饰就是全局常量

    
}

// class Person5 extends FinalPerson{    会报错，不能被继承

// }