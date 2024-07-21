package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {


    //4月の新入生リスト
    List<String> freshmen = List.of(
        "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivan", "John",
        "Kate", "Liam", "Mia", "Nina", "Olivia", "Paul", "Quinn", "Rose", "SOS", "Tom", "Uma",
        "Vera", "Will", "Xena", "Yara", "Zoe");
    System.out.println(freshmen);
    System.out.println(freshmen.size() + "人の新入生が入りました。");

    //DeathNoteに名前3文字以下の生徒の名前を書く
    List<String> alive = freshmen.stream()
        .filter(name -> name.length() > 3)
        .toList();

    //5月の生徒リスト
    System.out.println(alive);
    System.out.println(alive.size() + "人が生き残りました");

  }
}
