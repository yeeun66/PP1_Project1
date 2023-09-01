package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD {
    ArrayList<Word> list;
    Scanner s;
    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }
    public Object add() {
        // 사용자에게 입력 받는 부분
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    public void addWord() {
        // 리스트에 추가하는 부분
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다.\n");
    }

    public int update(Object obj) {
        return 0;
    }

    public int delete(Object obj) {
        return 0;
    }

    public void selectOne(int id) {

    }

    public void listAll() {
        System.out.println("------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i+1 + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("------------------------------");
    }
}
