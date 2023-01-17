public class searchElement{
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        arr[5] = 30;
        arr[6] = 35;
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 30){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}