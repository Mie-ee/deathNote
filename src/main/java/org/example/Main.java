package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //生徒にIDを付ける
    Map<Integer, String> studentMap = new HashMap<>();
    for (int i = 0; i < alive.size(); i++) {
      studentMap.put(i + 1, alive.get(i));
    }
    System.out.println(studentMap);

    //IDが偶数の生徒をDeathNoteに書く
    for (int i = 1; i <= studentMap.size(); i++) {
      if (i % 2 == 0) {
        studentMap.remove(i);
      }
    }

    //6月の生徒リスト
    System.out.println(studentMap);
  }
}
