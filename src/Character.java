import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        int linerNumber;
        String line;
        char[] currentLine;
        char[] charRecord = new char[26];
        int[] timesRecord = new int[26];
        int arrayNumber;

        for (int i = 0; i < 26; i++) {
            int record = i+65;
            charRecord[i] = (char) record;
//            System.out.print(charRecord[i]);
        }
        for (int j = 0; j < timesRecord.length ; j++) {
            timesRecord[j] = 0;
        }

        Scanner scannerln = new Scanner(System.in);
        linerNumber = scannerln.nextInt();
        Scanner scannercl = new Scanner(System.in);

        while (linerNumber != 0){

            line = scannercl.nextLine();
            line = line.toUpperCase();
            line = line.replaceAll(" ","");
            currentLine = line.toCharArray();
//            System.out.print(currentLine);

            for (char c : currentLine  ) {
//                System.out.print(c);
                while ((int)c -65 >=0 && (int)c-65 <=26) {
//                    System.out.print(c);
                    arrayNumber = (int) c - 65;
                    timesRecord[arrayNumber] = timesRecord[arrayNumber] + 1;
                    break;
//                    System.out.print(timesRecord[arrayNumber]);
                }

            }

        linerNumber--;
        }
        int maxIndex= 0;
        for (int m = 0; m < timesRecord.length; m++) {
            for (int z = 0; z < timesRecord.length; z++) {
                if (timesRecord[maxIndex]==0){
                    maxIndex = z;
                } else if (timesRecord[z]>timesRecord[maxIndex] && timesRecord[maxIndex]!=0) {
                    maxIndex = z;
                }
            }
            while(timesRecord[maxIndex] != 0){
                System.out.print(charRecord[maxIndex]);
                timesRecord[maxIndex]=0;
                break;
            }


        }


    }
}
