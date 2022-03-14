import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("words.txt");
        Scanner scanner = new Scanner(file);

        Random rand = new Random();

        ArrayList<String> list = new ArrayList<String>();

        while(scanner.hasNextLine()){

            list.add(scanner.nextLine());
        }

        int solutionIndex = rand.nextInt(list.size());
        String solutionWord = list.get(solutionIndex);
        int solutionWordLen = solutionWord.length();
        char[] solutionChars = new char[solutionWordLen];
        String[] matchingWords = new String[solutionWordLen];
        int[] matchingWordsCharIndex = new int[solutionWordLen];

        for(int i = 0; i < solutionWordLen; i++){

            solutionChars[i] = solutionWord.charAt(i);
        }

        int farthestChar = 0;

        for(int i = 0; i < solutionWordLen; i++){

            boolean match = false;
            int randomMatch;

            while(!match){

                randomMatch = rand.nextInt(list.size());
                if(randomMatch != solutionIndex) {

                    String potentialMatch = list.get(randomMatch);
                    for(int j = 0; j < potentialMatch.length(); j++){

                        if(solutionChars[i] == potentialMatch.charAt(j)){

                            matchingWords[i] = potentialMatch;
                            matchingWordsCharIndex[i] = j;

                            if(farthestChar <= j) {

                                farthestChar = j;
                            }
                            match = true;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(solutionWord);

        int numberOfSpaces;
        for(int i = 0; i < solutionWordLen; i++) {

            numberOfSpaces = farthestChar - matchingWordsCharIndex[i];
            for(int j = 0; j < numberOfSpaces; j++) {

                System.out.print(" ");
            }
            System.out.println(matchingWords[i]);
        }

        scanner.close();

    }
}
