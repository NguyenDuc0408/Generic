/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thlan2;

/**
 *
 * @author Dell
 */
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Pair<Students,HomeWorks>> ds = new ArrayList<Pair<Students,HomeWorks>>();
        System.out.println("Nhap so luong sinh vien:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            Pair<Students,HomeWorks> p = new Pair<Students,HomeWorks>(new Students(sc), new HomeWorks(sc));
            ds.add(p);
        }
        Collections.sort(ds,new Comparator<Pair<Students, HomeWorks>>(){
            @Override
            public int compare(Pair<Students, HomeWorks> a, Pair<Students, HomeWorks> b) {
                if (a.getFirst().getCode() < b.getFirst().getCode()) return -1;
                else if (a.getFirst().getCode() < b.getFirst().getCode()) return 1;
                else return 0;
            }
            
        });
        Iterator i = ds.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
