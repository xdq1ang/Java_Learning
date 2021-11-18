package annotation;

import java.lang.annotation.*;



@Target(ElementType.FIELD)//这个注解类是给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的生命周期
@Documented//注解放在文档中
@interface  TestAnn{
    public int id() default 0;
    public String desc() default "";
}


public class diyinterface {
    @TestAnn(id=100,desc="姓名")
    String name;
}