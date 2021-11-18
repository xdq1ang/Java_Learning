# if   else
```
int=1;
if(i==1){
    System.out.println(i);
}else{
    System.out.println(i);
}

```

```
if(i==1){
    ...
}else if(i==2){
    ...
}else if(i==3){
    ...
}else{
    ...
}
```

# switch case
```
int i=1;
switch(i){
    case 1:
        System.out.println("星期一");
        break;
    case 2:
        ...;
        break;
    case 3:
        ...;
        break;
    default:
        ...;
        break;
}
```
> tips:

switch(表达式)表达式可以使用的变量有：
- byte
- short
- char
- int
- 枚举
- String

1. case后面不必须时常量
2. default是可选的
3. break可以跳出switch语句块，如果没有break则会执行到switch末尾

# 循环结构
## for循环
```
public class Test {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            System.out.println("Hello World");
            System.out.println(i);
        }
    }
}
```
## while循环
```
public class WhileTest {
    public static void main(String[] args){
        int i=0;
        while(i<100){
            i++;
            System.out.println(i);
        }
    }
    
}
```

## do while
```
public class WhileTest {
    public static void main(String[] args){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(m<=100);
    }
}
```
## break continue
- reak结束当前层循环
- continue跳过当次循环
- return结束整个方法

