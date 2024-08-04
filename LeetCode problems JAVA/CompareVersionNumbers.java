import java.util.Arrays;
import java.util.List;

public class CompareVersionNumbers {
    public static void main(String[] args) {

        System.out.println(compareVersion("7.7.2.2", "7.9"));
    }


    public static int compareVersion(String version1, String version2) {
        List<Integer> version1Components = Arrays.stream(version1.split("\\."))
                .map(Integer::parseInt)
                .toList();
        List<Integer> version2Components = Arrays.stream(version2.split("\\."))
                .map(Integer::parseInt)
                .toList();

        int maxLength = Math.max(version1Components.size(), version2Components.size());

        for (int i = 0; i < maxLength; i++) {
            int v1Component = i < version1Components.size() ? version1Components.get(i) : 0;
            int v2Component = i < version2Components.size() ? version2Components.get(i) : 0;

            if (v1Component > v2Component) {
                return 1;
            } else if (v1Component < v2Component) {
                return -1;
            }
        }

        return 0;
    }
}
