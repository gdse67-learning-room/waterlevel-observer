/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import view.ControllerRoom;
import view.NoticeBoardWindow;

/**
 *
 * @author danu
 */
public class Main {
    public static void main(String[] args) {
        NoticeBoardWindow nw = new NoticeBoardWindow();
        
        ControllerRoom cr = new ControllerRoom();
        cr.nw = nw;
        
        MainWindow mainWindow = new MainWindow(cr);
        
        
    }
}
