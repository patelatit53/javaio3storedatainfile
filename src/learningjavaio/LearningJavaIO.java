package learningjavaio;

import java.io.*;
import java.util.ArrayList;

public class LearningJavaIO {

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to JavaIO");

        BufferedReader kin = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Type \"End\" to stop entering data?");

        ArrayList<String> al = new ArrayList<String>();
        System.out.print("Enter String --> ");
        String str = kin.readLine();
        while (!str.equals("End")) {
            al.add(str);
            System.out.print("Enter String --> ");
            str = kin.readLine();
        }

        FileWriter fw = new FileWriter("D:\\documents\\output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw, true);

        System.out.println("Printing Strings:");

        for (String s : al) {
            System.out.println(s);
            pw.println(s);
        }

        String max = al.get(0);
        for (int k = 1; k < al.size(); k++) {
            if (max.compareTo(al.get(k)) < 0) {
                max = al.get(k);
            }
        }

        System.out.println("The Highest String is " + max);
        pw.println("The Highest String is " + max);
    }
}