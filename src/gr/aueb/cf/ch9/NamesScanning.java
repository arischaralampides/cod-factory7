package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο δεδομένα
 */
public class NamesScanning {

    public static void main(String[] args) {
        String inFilePath = "C:/temp/names.txt";
        String outFilePath = "C:/temp/names-formatted.txt";
        String line;
        String[] tokens;
        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");   //ena h perisotera kommata kai mhden h perissotera spaces
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);       //auto grafei sto arxeio
                printFormatted(System.out, tokens);   //auto to grafoume an theloume na to vlepoume kai sthn konsola tautoxrona
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
    }
}