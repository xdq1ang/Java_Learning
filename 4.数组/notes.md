# 一维数组
## 数组声明方式：
- int a[];
- int[] a;
- Mydata[] c;对象数组
## 数组初始化
### 动态初始化
```
int[] arr = new int[3];  //声明数组容量
int arr[]=new int[3];
arr[0]=3;
arr[1]=9;
arr[2]=8;
```
### 静态初始化
```
int a[]=new int[]{3,9,8};
int a[]={1,1,1};
int[] a=new int[]{1,1,1};
int[] a = {3,9,8};
```
# 二维数组
```
int [][] li=new[][]{     //数组大小未定
    {1,2},
    {3,4}
}

int [][] li = new [2][3]    //数组大小设置为(2，3)
```

输出数组的长度
`System.out.println(arr3.length);`

# 多维数组
数组的每一个元素都是数组

声明
- 静态初始化：`int [][] li =new int[][]{{1,2},{1,2}};`
- 动态初始化：`int [][] li =new int[2][3];` 数组的大小为(2,3)
- 半动态初始化：`int [][] li = new int[2][];`可以只定义第一维度大小

>tips:
`int[] x,y[];`x是一维数组，y是二维数组

# 练习
## 1.获取数组所有元素的和
```
int[][] arr=new int[][]{
    {3,8,2},
    {2,7},
    {9,0,1,6}
};
```

答案
```
int sum=0;
for(int i=0;i<arr4.length;i++){
    for(int j=0;j<arr4[i].length;j++){
        sum+=arr4[i][j];
    }
}
System.out.println(sum);
```

### 注意
一维数组：
- `int[]x`    
- `int x[]`

二维数组：
- `int[][] x`  
- `int x[][]`  
- `int []x[]`

`int[] x,y[];`x是一维数组，y是二维数组

## 2.求最大值
```
int arr5[]=new int[]{4,2,7,1,3,5};
int max=arr5[0];
for(int n=0;n<arr5.length;n++){
    if(arr5[n]>max){
        max=arr5[n];
    }
}
System.out.println("max is :"+max);
```
## 3.复制
```
int arr5[]=new int[]{4,2,7,1,3,5};
int arr5_copy[]=new int[arr5.length];
arr5_copy=arr5;
System.out.println(arr5);
System.out.println(arr5_copy);
arr5[0]=222;
System.out.println(arr5_copy[0]);

out:
[I@372f7a8d
[I@372f7a8d
222
```
结论：

不能直接把数组赋值，赋值的话只是引用内存中已存在的数据。
需要用循环单个修改数组内每一个基本数据类型的数据

## 4.数组逆置
```
int arr6[]=new int[]{4,234,66,21,3};
int tmp=0;
for (int i=0,j=arr6.length-1;i<j;i++,j--){
    tmp=arr6[i];
    arr6[i]=arr6[j];
    arr6[j]=tmp;
}
```
