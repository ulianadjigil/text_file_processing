package com.company;
import java.io.*;
import java.util.*;
import java.io.File;


import static java.util.Collections.*;

public class Main {

    public static void main(String[] args)  {

        System.out.println("Найрідше зустрічаються слова: " +
                rarestWords("/Users/ulana/Desktop/IdeaProjects_1 семестр/Lab1.2.5/src/com/company/File.txt"));

    }

    public static List<String> rarestWords(String filename)  {

        List<String> result = new ArrayList<>();
        Map<String, Integer> count;
        try {
             count = findWords(filename);
            Integer minValue = Collections.min(count.values());


            count.forEach((w, v) -> {
                if(v == minValue){
                    result.add(w);
                }
            });
        }
        catch (NoSuchElementException e){
            System.out.println("Exception! NoSuchElementException!");
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        return result;
    }

    public static Map<String, Integer> findWords(String filename)  {
        Map<String, Integer> words = new HashMap<>();
        try{
            File file = new File(filename);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (String word : line.split(" ")) {
                    words.put(word, words.getOrDefault(word, 0) + 1);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Exception! File.txt not found!");
        } catch (NullPointerException e) {
            System.out.println("Exception! File.txt is empty!");
        } catch (IOException e) {
            e.printStackTrace();
        }


        words.keySet().removeIf(i -> i.matches("\\W") || i.matches("") );

        return words;
    }

}

