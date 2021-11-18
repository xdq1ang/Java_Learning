public class array {
    public static void main(String[] args){
        int[] arr={1,2,3};
        int arr1[]={1,1,1};
        int a[]=new int[]{3,9,8};
        int[] a2=new int[]{1,1,1};
        int [] arr2=new int[2];
        int arr3[]=new int[2];
        arr3[0]=11;
        arr2[0]=1;

        System.out.println(arr3[0]);
        System.out.println(arr3.length);
        System.out.println("--------------分割线-------------");
        
        int[][] arr4=new int[][]{
            {3,8,2},
            {2,7},
            {9,0,1,6}
        };
        int sum=0;
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                sum+=arr4[i][j];
            }
        }
        System.out.println(sum);


        int arr5[]=new int[]{4,2,7,1,3,5};
        int max=arr5[0];
        for(int n=0;n<arr5.length;n++){
            if(arr5[n]>max){
                max=arr5[n];
            }
        }
        System.out.println("max is :"+max);

        int arr5_copy[]=new int[arr5.length];
        arr5_copy=arr5;

        System.out.println(arr5);
        System.out.println(arr5_copy);
        arr5[0]=222;
        System.out.println(arr5_copy[0]);

        int arr6[]=new int[]{4,234,66,21,3};
        int tmp=0;
        for (int i=0,j=arr6.length-1;i<j;i++,j--){
            tmp=arr6[i];
            arr6[i]=arr6[j];
            arr6[j]=tmp;
            
        }
        System.out.println("逆置后："+arr6[0]+","+arr6[1]+","+arr6[2]+","+arr6[3]+","+arr6[4]);

    }
}
