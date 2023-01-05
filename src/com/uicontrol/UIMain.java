package com.uicontrol;

public class UIMain {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var texBox = new TextBox();
        show(texBox);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
