package com.uicontrol;

public class UIMain {

    public static void main(String[] args) {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
    }

}
