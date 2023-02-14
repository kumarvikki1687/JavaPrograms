package Problems;
import java.util.Scanner;

class StringMatching {

    int getMatchingIndex(String string, String pattern) {

        int n = string.length();
        int m = pattern.length();

        for(int i=0;i<n-m+1;i++) {
            boolean nonMatchingFound = false;
            for(int j=0;j<m;j++) {
                if(string.charAt(i+j)!=pattern.charAt(j)) {
                    nonMatchingFound = true;
                    break;
                }
            }
            if(!nonMatchingFound) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String arg[]) {

        StringMatching ob = new StringMatching();
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        String pattern = sc.next();

        int result = ob.getMatchingIndex(string, pattern);
        System.out.println(result);

    }
}