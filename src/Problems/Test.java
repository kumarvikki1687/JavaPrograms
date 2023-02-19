package Problems;

public class Test {

    public static void main(String[] args) {
        String name = "Vikki";
        String finalName = "";
        for(int i = name.length()-1; i>=0;i--) {
            finalName+=name.charAt(i);
        }
        System.out.println(finalName.toUpperCase());
    }
}
