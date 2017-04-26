package com.theironyard.charlotte;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //File f = new File("books.txt");
        Book b = new Book();
        //ArrayList<String> books = new ArrayList<>();
        Scanner scanAsk = new Scanner(System.in);
        File f = new File("books.txt");

        // FileReader fr = new FileReader();
        // fw.write("Alice\n");
        // fw.write("Bob\n");
        // fw.write("Charlie\n");
        // fw.close();

        // read line-by-line
        // Scanner ask = new Scanner(f);
        // while (ask.hasNext()) {
        //    System.out.println(ask.nextLine());
        // }

        // read entire file
        // ask = new Scanner(f);
        // ask.useDelimiter("\\Z");
        // String contents = ask.next();
        // System.out.println(contents);

        // read entire file

        Scanner scanUpdate = new Scanner(f);
        scanUpdate.useDelimiter("\\Z");

        if (scanUpdate.hasNext()) {
            String fileContents = scanUpdate.next();
            System.out.println(fileContents);
        } else {
            System.out.println("The contents of this file are currently empty.");
        }

        FileWriter fw = new FileWriter(f);

        // Ask user if they'd like to update this file
        System.out.println();
        System.out.println("Hi, would you like to update the contents of this file?");
        System.out.println("Please enter y or n.");

        if (scanAsk.nextLine().equals("y")) {

            // "What is the title?"
            System.out.println("Hi, what is your favorite book?");
            b.title = scanAsk.nextLine();
            fw.write(b.title + "\n");

            // "Who is the Author?"
            System.out.println("Who is the author of the book: " + b.title + "?");
            b.author = scanAsk.nextLine();
            fw.write(b.author + "\n");

            // "What is the genre for this book?"
            System.out.println("What is this books genre?");
            b.genre = scanAsk.nextLine();
            fw.write(b.genre + "\n");
            fw.close();

            // "How many copies have been sold?"
             System.out.println("How many copies have been sold?");
             b.copiesSold = Integer.valueOf(scanAsk.nextLine());
             fw.write(b.copiesSold + "\n");
             fw.close();

            // "Is the book available on iTunes?"
            System.out.println("Is this book available on iTunes, y or n?");
            b.iTunesAvail = Boolean.valueOf(scanAsk.nextLine());
            fw.write(b.iTunesAvail + "\n");
            fw.close();

            // read entire file
            Scanner read = new Scanner(f);
            read.useDelimiter("\\Z");
            String contents = read.next();
            System.out.println(contents);
            } else {
            System.out.println("Okay, thanks anyway!");
        }
    }
}
    // Write a program that asks the user about a book
    // ask for at least five different attributes like
    // title, author, genre, copies sold, available on iTunes.

    // save the information to a file
    // When the program runs again, it should read the file
    // and print out the data.

    // Prompt the user to answer at least five different
    // questions about a good or service.
    // Save the information into a file.
    // When the program first boots, read the file and display
    // the contents.
    // Give the user the ability to update the information
    // and re-save it to the file.