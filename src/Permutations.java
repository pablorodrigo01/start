import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute(str, "", permutations);
        return permutations;
    }

    private void permute(String str, String prefix, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                permute(remaining, prefix + ch, permutations);
            }
        }
    }
}
