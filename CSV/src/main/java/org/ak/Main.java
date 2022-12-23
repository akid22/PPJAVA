package org.ak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String csvFile = "src/main/resources/Persons.csv"; // name of your CSV file
        String line = "";
        String csvSplitBy = ","; // separator used in the CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // skip the first line (header)
            br.readLine();

            while ((line = br.readLine()) != null) {
                // split the line by the separator
                String[] fields = line.split(csvSplitBy);

                // create a Person object from the fields
                Person person = new Person(fields[0], Integer.parseInt(fields[1]), fields[2]);

                // print the Person object
                System.out.println(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}