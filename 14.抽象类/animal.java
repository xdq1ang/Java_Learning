public abstract class animal {
    public abstract void test();    
    public abstract void move();
}

class Dog extends animal{
    @Override
    public void test(){
        System.out.println("test dog");
    }
    @Override
    public void move(){
        System.out.println("dog run");
    }
}

class Fish extends animal{
    @Override
    public void test(){
        System.out.println("test fish");
    }
    @Override
    public void move(){
        System.out.println("fish swim");
    }
}