/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author stpap
 */
public class Cars {
    
    private int cid;
    private String cbrand;
    private String cmodel;
    private String chorsepower;

    public Cars(String cbrand, String cmodel, String chorsepower) {
        this.cbrand = cbrand;
        this.cmodel = cmodel;
        this.chorsepower = chorsepower;
    }

    public Cars(int cid, String cbrand, String cmodel, String chorsepower) {
        this.cid = cid;
        this.cbrand = cbrand;
        this.cmodel = cmodel;
        this.chorsepower = chorsepower;
    }

    public Cars() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand;
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }

    public String getChorsepower() {
        return chorsepower;
    }

    public void setChorsepower(String chorsepower) {
        this.chorsepower = chorsepower;
    }

    @Override
    public String toString() {
        return cid + " ---> " + cbrand + "-" + cmodel + "-" + chorsepower;
    }
    
}
