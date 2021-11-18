package generic;

/*
* 此处的泛型T可以随意取名，表示类的类型。
* */
public class GenericClass<T> {
    public static void main(String[] args){
        A<String> a = new A<String>();
        a.setKey("a");
        System.out.println(a.getKey());
    }
}
class A<T> {
    private T key;
    public void setKey(T key){
        this.key=key;
    }
    public T getKey(){
        return this.key;
    }
}