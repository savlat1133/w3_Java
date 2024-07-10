// 14. Write a Java program to find common elements between two arrays (string values).

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].equals(array2[j])){
                    set.add(array1[i]);
                }
            }
        }

        System.out.println(set);
    }
}
