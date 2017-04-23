package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by shadaziz on 4/22/17.
 */
public class fileParser {
    public static int[] parse() throws FileNotFoundException {
        File file = new File("INPUT.TXT");
        Scanner input = new Scanner(file);
        int[] fileInput = new int[233];

        while (input.hasNext()){
            int place = input.nextInt();
            int value = input.nextInt();
            fileInput[place-1] = value;
        }

        return fileInput;
    }
}
