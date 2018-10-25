/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thlan2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Students implements Comparable<Students>{
    private String name;
    private int code;
    public Students(Scanner sc){
        System.out.println("Nhap ten cua sinh vien");
        String m = sc.nextLine();
        name = m;
        System.out.println("Nhap ma cua sinh vien");
        int c = Integer.parseInt(sc.nextLine());        
        code = c;
    }
    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
    
    public String toString(){
        return "Ten sinh vien: "+name + " code: "+code;
    }

    @Override
    public int compareTo(Students t) {
        if (code < t.getCode()) return -1;
        else if (code > t.getCode()) return 1;
        else return 0;
    }
}
