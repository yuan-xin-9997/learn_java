public class draft {
    public static void main(String[] args){
        fact();
    }
    public  fact(){
        //int[] a = new int[100];
        int[] a = {1,2,3,4,5};
//        for (int i = 0; i < 100; i++){
//            a[i] = i;
//        }
        for(int ele: a){
            System.out.println(ele);
        }
    }
}
