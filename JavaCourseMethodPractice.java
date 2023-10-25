

class  cal{
    public static int add(int a, int b ){
        int c = a+b;
        return c;
    }
    public static int add(int a, int b,int d ){
        int c = a+b+d;
        return c;
    }

    public static void add(int[]arr){
        int ans=0;
        for (int e:arr){
            ans+=e;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(add(4,5,6));


        int[]arr ={1,2,3,4,5};
        add(arr);


        add(new int[]{1,2,3,4,5});

    }
}