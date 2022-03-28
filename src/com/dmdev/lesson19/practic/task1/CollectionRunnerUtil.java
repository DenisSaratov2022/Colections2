package com.dmdev.lesson19.practic.task1;

import java.util.List;
import java.util.ListIterator;

public final class CollectionRunnerUtil {
        private static final String Target_Value = "****";
        private static final int Target_size = 4;
        private CollectionRunnerUtil () {

        }

    public static void markLength4 (List<String> list) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length()==Target_size) {
                listIterator.set(Target_Value);
                listIterator.add(nextValue);
            }
        }

    }
}
