package com.dmdev.lesson19.practic.task1;

import com.dmdev.lesson19.practic.task1.CollectionRunnerUtil;

import java.util.LinkedList;
import java.util.List;

public class MarkLengthTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        CollectionRunnerUtil.markLength4(list);
        System.out.println(list);
    }
}
