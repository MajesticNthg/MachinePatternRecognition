public class Level1 {
    public static boolean LineAnalysis(String line) {
        if (line.charAt(0) != '*' && line.charAt(line.length() - 1) != '*') return false;

        for (int x = 0; x < line.length() / 2; x++) {
            if (line.charAt(x) != line.charAt(line.length() - x - 1)) return false;
        }
        return true;
    }
}

