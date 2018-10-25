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
public class HomeWorks {
    private String name;
    public HomeWorks(Scanner sc){
        System.out.println("Nhap ten bai tap");
        name = sc.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Bai tap: "+name;
    }
}
