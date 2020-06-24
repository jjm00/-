package com.edrain.calendar_lazy;

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class Memo extends RealmObject {

    @Override
    public String toString() {
        return "Memo{" +
                "text='" + text + '\'' +
                '}';
    }

    @Required
    private String text;

    public Memo() {
        this.text = "empty!";
    }
    public Memo(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
