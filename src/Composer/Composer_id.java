package Composer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Composer_id {
    private String composer_id;
    private String first_name;
    private String last_name;
    private String birth_place;
    private String death_date;
    private String death_place;
    private String wiki_page;


    public String getFirst_name() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            first_name = arr[1];
        }
        fileReader.close();
        return first_name;
    }

    public String getLast_name() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            last_name = arr[2];
        }
        fileReader.close();
        return last_name;
    }

    public String getBirth_place() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            birth_place = arr[3];
        }
        fileReader.close();
        return birth_place;
    }

    public String getDeath_date() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            death_date = arr[4];
        }
        fileReader.close();
        return death_date;
    }

    public String getDeath_place() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            death_place = arr[5];
        }
        fileReader.close();
        return death_place;
    }

    public String getWiki_page() throws FileNotFoundException {
        File file = new File("./Task/files/task7788/composers.csv");
        Scanner fileReader = new Scanner(file);
        String header = fileReader.nextLine();
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            wiki_page = arr[6];
        }
        fileReader.close();
        return wiki_page;
    }
}
