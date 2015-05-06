/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author asi
 */
public class Hero {
    
    public String name = "Hero name";
    public String[] skill = new String[4];
    public String type = "Hero type";
    
    public String attack(){
        return " attacked with ";
    }
    
    public String block(){
        return " blocked with ";
    }    
}