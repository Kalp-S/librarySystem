/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalassignmnet;

public class Laptops {

    private double cost;
    private int totalLaptop;
    private int availableLaptop;
    private int id;

    /**
     * Abstraction Function: represents the characteristics of laptops The rep
     * invariant is: id!= null,cost!=null,availableLaptop!=null cost>=0
     * totalLaptops>=0 availableLaptops>=0
     *
     * @param ID
     * @param c
     * @param tL
     */
    public boolean repOk(){
        if(totalLaptop!= (int)totalLaptop ||cost!=(double)cost||availableLaptop!=(int)availableLaptop||id!=(int)id){
            return false;
        }
        
        return true;
    }
    public Laptops(int ID, double c, int tL) {
        id = ID;
        cost = c;
        totalLaptop = tL;
        availableLaptop = totalLaptop;

    }

    /*
        *Requires: p>=0
        *Effects: changes the cost
        *Modifies:
     */
    public void setCost(double p) {
        cost = p;
    }

    /*
        *Requires:t>=0
        *Effects: changes the totalLaptops
        *Modifies:
     */
    public void setTotalLaptop(int t) {
        totalLaptop = t;
    }

    /*
        *Requires: t>=0
        *Effects: changes the number of available laptops
        *Modifies:
     */
    public void setAvailableLaptop(int t) {
        availableLaptop = t;
    }

    /*
        *Requires: 
        *Effects:returns the cost
        *Modifies:
     */
    public double getCost() {
        return cost;
    }

    /*
        *Requires:
        *Effects: returns the total laptops
        *Modifies:
     */
    public int getTotalLaptop() {
        return totalLaptop;
    }

    /*
        *Requires: 
        *Effects: returns the id
        *Modifies:
     */
    public int getId() {
        return id;
    }

    /*
        *Requires: 
        *Effects: returns the available laptops
        *Modifies:
     */
    public int getAvailableLaptop() {
        return availableLaptop;
    }

    /*
        *Requires: 
        *Effects: returns the state of isAvailble
        *Modifies:
     */
    public boolean isAvailable() {
        if (availableLaptop == 0) {
            return false;
        } else {
            return true;
        }
    }
}
