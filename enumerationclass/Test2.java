package enumerationclass;

enum FX implements showInfo {
    SHANG("上"),
    XIA("下"),
    ZUO("左"),
    YOU("右");
    private final String desc;
    private FX(String desc){
        this.desc=desc;
    }
    public void show(){
        System.out.println(this.desc);
    }

    @Override
    public void test1() {
        System.out.println("这是实现的接口");
    }
}
