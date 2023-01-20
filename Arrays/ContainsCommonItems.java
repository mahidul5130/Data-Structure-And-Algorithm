/**
 * ContainsCommonItems
 */
public class ContainsCommonItems {
    public boolean CheckCommon(String[] arr1, String[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr1 =  new String[4];
        String[] arr2 =  new String[3];

        arr1[0] = "a";
        arr1[1] = "b";
        arr1[2] = "c";
        arr1[3] = "x";

        
        arr2[0] = "z";
        arr2[1] = "y";
        arr2[2] = "x";

        ContainsCommonItems obj = new ContainsCommonItems();
        boolean result = obj.CheckCommon(arr1, arr2);

        System.out.println(result);
    }
}