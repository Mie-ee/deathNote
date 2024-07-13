package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> students = new ArrayList<>();
    students.add("Ali");
    students.add("Bob");
    students.add("Cha");
    students.add("David");
    students.add("Eve");
    students.add("Frank");
    students.add("Iva");
    students.add("John");
    students.add("Kat");
    students.add("Liam");
    students.add("Mia");
    students.add("Nathan");
    students.add("Peter");
    students.add("Rachel");

    int st = students.size();
    int ast = 0;
    System.out.println(students);
    System.out.println("4月の時生徒の数は" + st + "人でした。");
    for (String student : students) {
      if (student.length() > 3) {
        System.out.println(student);
        ast++;
      }
    }
    System.out.println("５月の時生徒の数は" + ast + "人になった。");
  }
}
