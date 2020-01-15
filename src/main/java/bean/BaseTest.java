package bean;

public class BaseTest {
    public static void main(String[] args) {
        //    MaoPaoPaiXun();

        //QueryFind();

        ZiFind();
    }

    //排序
    public static void MaoPaoPaiXun() {
        int[] arr = {8, 3, 9, 5, -3, -5, 10, -7};
        int m = 0;
        //定义 规则 左小, 右大  值互换
        for (int i = 0; i < arr.length - 1; i++) {//遍历的次数
            for (int j = 0; j < arr.length - i - 1; j++) {//遍历的过程
                if (arr[j] > arr[j + 1]) {
                    //顺序很重要
                    m = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = m;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void QueryFind() {
        int[] arr = {8, 3, 9, 5, -3, -5, 10, -7};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int m = arr[i];
                    arr[i] = arr[j];
                    arr[j] = m;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }


    //查询1-100 所有质数和
    public static void ZiFind() {
        int sum=0;
        for (int i = 2; i <= 100; i++) {
           //定义一个除数
           int j=2;
           while (i%j!=0){
               j++;
           }
           if(j==i){
               sum+=j;
           }
        }
        System.out.println(sum);
    }

}
