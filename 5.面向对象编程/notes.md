---
title: Java-类
date: 2021/8/16 21:17:25
categories: Java
---



## 1. 类的定义

Java代码是由众多不同功能的类构成

类的组成：
- 属性：对应类中的成员变量
- 方法：对应类中的成员方法

code 1:

方法的返回值类型。

```java
public class Person{
    String name;
    int age;
    public void showName(){
        System.out.println("姓名："+name);
    }
    public int getAge(){
       return age; 
    }
}
```

code 2:

在方法中加入参数。

```java
public class Animal {
    String name;
    int eye;
    int legs;
    public void eat(String food){  //方法加入参数
        System.out.println("吃的是："+food);
    }
    public void move(String moveType){
        System.out.println("移动方式是："+moveType);
    }
}
```

code 3:

类的实例化，方法调用。

```java
public class OOTest{
    public static void main(String[] args){
        //实例化前面定义的类
        //和变量声明类似
        // int i=0
        //变量类型 变量名 = new **(**)
        Person person = new Person(); 
        person.name="张三";
        person.age=25;
        person.showName();
        int age1=person.getAge();
        System.out.println("age is :"+age1);
    }
}
```



## 2.类的属性

语法格式：

修饰符 类型 属性名=初值；

> tips:修饰符private(公有的)：该属性只能由该类的方法访问
>
> 修饰符public(私有的)：该属性可以被该类以外的方法访问

定义一个Person1，具有一个私有属性 age

```java
public class Person1 {
    public String name="xdqiang";
    private int age;
    public void showAge(){
        System.out.println(age);
    }   
}
```

在主函数实例化，并对属性初始化

报错找不到这个属性

![image-20210816202652944](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20210816202652944.png)

```java
class test {
  public static void main(String[] args) {
    Person1 person2 = new Person1();
    person2.age=12; //会找不到这个属性
    person2.name="xdiang";
  }

}
```



### 2.1. 属性的分类

- 成员变量：类内，方法体外

  - 实例变量（不以static修饰）：类实例化成对象之后才能使用`public String name = "xdqiang;"`

  - 类变量（以static修饰）：类不需要实例化也可以使用`public static String sex="男";`。用`类名.属性;`调用。也叫类变量。

    ![image-20210816204009649](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20210816204009649.png)

- 局部变量（方法体内），存储在栈内。

  - 形参（方法签名中定义的变量）

    ![image-20210816204150307](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20210816204150307.png)

  - 方法局部变量（在方法内定义）

    ![image-20210816204314177](https://gitee.com/xdqiang/picbed/raw/master/imgOfBlog/image-20210816204314177.png)

  - 代码块局部变量（在代码块内定义）



## 3.类的方法

多个参数可以用逗号隔开

```java
class test{
    public void eat(String food,int eage){
    }
}
```



- 方法只有在被调用的时候才会执行。

- 没有返回值时用void修饰。

- 方法内可以调用方法。

- 方法内不可以定义方法

- 同一个类中方法可以直接互相调用，不用new去实例化对象。

  ```java
  public class Person{
  	public void run(){
  		
  	} 
  	public void showName(){
  		run();
      }
  }
  ```

  

## 4.类的实例化

类实例化时要初始化属性。不初始化则默认为空值（null，0）
方法只有被调用的时候才会被执行

### 匿名对象

可以不定义对象的句柄，而直接调用这个对象的方法。这样的对象叫做匿名对象

- 非匿名：`Person person = new Person();`

- 匿名`new Person().shout();`

使用情况

- 如果对一个对象只需一次方法调用，那么可以使用匿名对象。
- 经常把匿名对象作为实参传递给一个方法调用



