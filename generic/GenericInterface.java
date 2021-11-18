package generic;

public class GenericInterface {
    public static void main(String[] args){
        IBClass b = new IBClass();
        IBClass<String> b1 = new IBClass<String>();
        IBClass1 b2 = new IBClass1();
        //IBClass1<String> b2 = new IBClass1<String>();会报错,因为IBClass1()没有泛型形式参数
    }
}

interface IB<T>{
    T test(T key);
}
/*
* 未传入泛型实参时：在声明类的时候需要将泛型声明一起加到类中(与泛型类的定义相同)
*
* */
class IBClass<T> implements IB<T>{
    @Override
    public T test(T key){
        return(key);
    }
}

/*
 * 如果实现接口时指定了接口的泛型的具体数据类型（传入实参String）
 * 它的所有方法的泛型都要替换成具体的数据类型
 *
 * */
class IBClass1 implements IB<String>{

    @Override
    public String test(String key) {
        return key;
    }
}