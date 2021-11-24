package javareflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("javareflection.Student");//通过包名.类名获取指定类的Class实例
            Class superClazz = clazz.getSuperclass();//获取父类
            System.out.println(superClazz.getName());
            Class[] interfaces = clazz.getInterfaces();//获取当前类的接口
            for(Class c : interfaces){
                System.out.println(c.getName());
            }

            Constructor[] cons = clazz.getConstructors();//返回Class实例对应类的公用构造方法数组。
            for (Constructor c : cons){
                System.out.println(c.getName());//输出构造方法名称
                System.out.println("构造方法修饰符"+c.getModifiers());//获取方法的修饰符。1为public

            }
            Constructor[] cons1 = clazz.getDeclaredConstructors();//返回所有构造方法（包括公用和私有）
            for (Constructor c : cons1){
                System.out.println(c.getName());//输出构造方法名称
                System.out.println("构造方法修饰符"+c.getModifiers());//获取方法的修饰符。1为public,2为private

            }
            //方法1：调用无参数构造器
            Object obj = null;
            try {
                obj = clazz.newInstance();

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Student stu1 = (Student)obj;
            System.out.println("new对象:"+stu1.school);
            //方法2：调用指定参数类型的构造器
            Constructor c = null;
            try {
                c = clazz.getConstructor(String.class);
                obj = c.newInstance("第一中学");
            } catch (Exception e) {
                e.printStackTrace();
            }

            Student stu2 = (Student)obj;
            System.out.println("new对象:"+stu2.school);
            //方法3：获取私有构造方法
            try {
                Constructor c1 = clazz.getDeclaredConstructor(String.class,int.class);
                c1.setAccessible(true);//解除私有封装
                Student stu3 = (Student)c1.newInstance("zhangsna",12);
            } catch (Exception e) {
                e.printStackTrace();
            }

            //获取方法
            //Method[] ms = clazz.getMethods();//获取类的所有公用方法
            Method[] ms = clazz.getDeclaredMethods();//获取类的所有方法（包括公有和私有）
            for(Method m:ms){
                System.out.println("获取方法名"+m.getName());
                System.out.println("获取返回值类型"+m.getReturnType());
                System.out.println("获取修饰符"+m.getModifiers());
                Class[] pcs = m.getParameterTypes();//获取参数类型
                if(pcs!=null&&pcs.length>0){
                    for(Class pc:pcs){
                        System.out.println("参数类型："+pc.getName());

                    }
                }
                System.out.println("-----------------------------");
            }

            //获取类以及父类的公有属性
            Field[] fs = clazz.getFields();//返回数组
            for(Field f : fs){
                System.out.println("修饰符:"+f.getModifiers());
                System.out.println("属性类型:"+f.getType());
                System.out.println("属性名称:"+f.getName());
            }
            System.out.println("----------------------");
            //获取本类所有属性(包括公有和私有)
            Field[] fs1 = clazz.getDeclaredFields();//返回数组
            for(Field f : fs1){
                System.out.println("修饰符:"+f.getModifiers());
                System.out.println("属性类型:"+f.getType());
                System.out.println("属性名称:"+f.getName());
            }
            //获取类所在的包
            Package p = clazz.getPackage();
            System.out.println("类所在的包为："+p.getName());
            //反射调用指定方法
            try {

                Method m = clazz.getMethod("setInfo",String.class,String.class);
                //反射调用重载方法
                Method m2 = clazz.getMethod("setInfo",int.class);
                //获取有返回值的方法
                Method m3 = clazz.getMethod("getSchool");
                Constructor con1 = clazz.getConstructor();
                Object obj1 = con1.newInstance();
                m.invoke(obj1,"zhangsnan","第一中学");//参数1是需要实例化的对象，后面是当前方法的实际参数

                //反射调用私有方法
                Method m1 = clazz.getDeclaredMethod("test",String.class);
                m1.setAccessible(true);//解除私有封装
                m1.invoke(obj1,"Li");
            } catch (Exception e) {
                e.printStackTrace();
            }
            //调用指定属性
            try {
                Constructor con = clazz.getConstructor();
                Student stu3 = (Student)con.newInstance();
                Field f = clazz.getField("school");
                Field f2 = clazz.getDeclaredField("privateFields");
                f2.setAccessible(true);//接触私有封装
                f.set(stu3,"第三中学");
                f2.set(stu3,"测试私有属性");
                String school = (String)f.get(stu3);//获取stu3对象的school属性值
                String pf = (String)f2.get(stu3);
                System.out.println("对象stu3的属性值为:"+school);
                System.out.println("对象stu3的私有属性值为:"+pf);
            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
