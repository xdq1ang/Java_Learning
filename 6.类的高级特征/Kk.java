public class Kk extends Kids {
    public void test(){//ManKind -> Kinds -> Kk
        super.salary=1;//这是ManKind的成员变量       
        super.employeed();//追溯方法
        super.getSalary();

    }
}
