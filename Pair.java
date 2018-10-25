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
public class Pair <T,S> {
    private T first;
    private S second;
    public Pair(T fi, S se){
        first = fi;
        second = se;
    }
    public T getFirst(){
        return first;
    }
    public S getSecond(){
        return second;
    }
    public String toString(){
        return first.toString() + " " + second.toString();
    }

    
}
