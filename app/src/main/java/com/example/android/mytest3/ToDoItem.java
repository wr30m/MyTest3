package com.example.android.mytest3;

import java.util.UUID;

/**
 * Created by Justaway on 03.07.2017.
 */

public class ToDoItem {

    private String mToDoText;
    private UUID uuid;

    public ToDoItem(String mToDoText) {
        this.mToDoText = mToDoText;
        uuid = UUID.randomUUID();
    }

    public String getToDoText() {
        return mToDoText;
    }

    public void setToDoText(String toDoText) {
        mToDoText = toDoText;
    }



}
