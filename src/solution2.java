class Solution2 {

    public boolean solution(String S) {// for checking if password length
        // is between 8 and 15
        if (!((S.length() >= 0)
                && (S.length() <= 100))) {
            return false;
        }

        // to check space
        if (S.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (S.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        // for special characters
        if (!(S.contains("@") || S.contains("#")
                || S.contains("!") || S.contains("~")
                || S.contains("$") || S.contains("%")
                || S.contains("^") || S.contains("&")
                || S.contains("*") || S.contains("(")
                || S.contains(")") || S.contains("-")
                || S.contains("+") || S.contains("/")
                || S.contains(":") || S.contains(".")
                || S.contains(", ") || S.contains("<")
                || S.contains(">") || S.contains("?")
                || S.contains("|"))) {
            return false;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (S.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (S.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        // if all conditions fails
        return true;
    }
}