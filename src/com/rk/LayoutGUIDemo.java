
package com.rk;

import com.rk.form.BorderLayoutForm;
import com.rk.form.BoxLayoutForm;
import com.rk.form.GridLayoutForm;

import javax.swing.JFrame;

public class LayoutGUIDemo {

    public static void main(String[] args) {
        JFrame frame = new BorderLayoutForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JFrame frame2 = new GridLayoutForm();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        
        JFrame frame3 = new BoxLayoutForm();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
}
