package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    //4月の時の新入生生徒のリスト
    List<String> freshemen = List.of("Ali", "Bob", "Charlie", "David", "Eve", "Frank", "Grace",
        "Han", "Iva", "John", "Kate", "Liam", "Mia", "Amy", "Elizabeth", "SOS");
    System.out.println(freshemen);
    System.out.println(+freshemen.size() + "人の新入生がいます。");

    //名前3文字以下の生徒の名前をDeathNoteに書く
    List<String> aliveStudents = freshemen.stream()
        .filter(name -> name.length() > 3)
        .toList();

    //まだ生きている生徒たちのリスト
    System.out.println(aliveStudents);
    System.out.println(+aliveStudents.size() + "人の生徒が生き残りました。");

  }
}
