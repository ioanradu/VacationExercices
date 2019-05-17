public class StringDataCounter {
    public static void main(String[] args) {
        String str = "Notre Dame is a very old cathedral in Paris, France. It is one of France's most famous landmarks and many people visit it each year. The cathedral is on a small island on the River Seine. It is the cathedral of the Catholic Archdiocese of Paris, one of 23 archdioceses in France. The cathedral was built during two centuries. It is a very good example of Gothic Architecture in France. At the time it was finished, the cathedral was the biggest such building in Western Europe. Between 1844 and 1864, the building was renovated under the direction of Eugène Viollet-le-Duc, who incorporated elements into the design that the medieval building had not possessed before. The two rose windows which ornate the transept are among the biggest in Europe: each has a diameter of 13m.";

        System.out.println("number of words: " + countWords(str));
        int[] vowelsAndConsonant = countVowelsAndConsonant(str);
        System.out.println("number of vowels : " + vowelsAndConsonant[0]);
        System.out.println("number of consonants : " + vowelsAndConsonant[1]);
        System.out.println("number of sentences: " + countSentences(str));
        System.out.print("number of proper nouns: ");
        showProperNouns(str);
    }

    public static int countWords(String input) {
        String[] strArray = input.split(" ");
        int numberOfWords = strArray.length;
        return numberOfWords;
    }

    public static int[] countVowelsAndConsonant(String input) {
        int[] count = new int[2];
        int vowelsCount = 0;
        int consonantCount = 0;
        String sir = input.toLowerCase();
        String vowels = "aeiou";
        char[] inputCharArray = sir.toCharArray();
        for (char c : inputCharArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (Character.isLetter(c)) {
                consonantCount++;
            }
        }
        count[0] = vowelsCount;
        count[1] = consonantCount;
        return count;
    }

    public static int countSentences(String input) {
        String[] strArray = input.split("\\.");
        int numberOfSentences = strArray.length;
        return numberOfSentences;
    }

    public static void showProperNouns(String input) {
        String[] strArray = input.split(" ");
        System.out.print("number of proper nouns: ");

        for (int i = 0; i < strArray.length; i++) {
            //verificam daca primul caracter din cuvant este o litera mare apoi sarim cuvintele care sunt cu litera mare dar nu sunt substantive proprii (It, The, At, Between)
            if (Character.isUpperCase(strArray[i].charAt(0))) {
                if (strArray[i].equals("It") || strArray[i].equals("The") || strArray[i].equals("At") || strArray[i].equals("Between")) {
                    continue;

                } else if (strArray[i].contains(",")) {
                    String[] array2 = strArray[i].split("\\,");
                    System.out.print(array2[0] + ", ");

                } else if (strArray[i].contains(".")) {
                    String[] array2 = strArray[i].split("\\.");
                    System.out.print(array2[0] + ", ");

                } else if (strArray[i].contains("'")) {
                    String[] array2 = strArray[i].split("\\'");
                    System.out.print(array2[0] + ", ");

                } else if (strArray[i].contains(":")) {
                    String[] array2 = strArray[i].split("\\:");
                    System.out.print(array2[0]);

                } else {
                    System.out.print(strArray[i] + ", ");
                }
            }
        }
    }
}