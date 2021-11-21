package javareflection;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Class clazz = p.getClass();//clazz对象包含对象P所属的Person类的所有信息

        //Class实例化的四中方法
        Class c0 = Person.class;//通过类名创建指定类的Class的实例
        Class c1 = p.getClass();//通过类的实例对象的getClass()方法就能获取的实例对应的类的Class实例
        try {
            Class c2 = Class.forName("javareflection.Person");//通过Class的静态方法forName()来获取指定路径（全路径：包名.类名）类的Class实例。
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ClassLoader cl = p.getClass().getClassLoader();
        try {
            Class c3 = cl.loadClass("javareflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
