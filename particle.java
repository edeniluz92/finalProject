/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalp;

/**
 *
 * @author USER
 */
public class particle {
    int x;
    int y;
    double w;
    double val;
    particle(int x,int y,double w){
        this.w=w;
        this.x=x;
        this.y=y;
        this.val=1;
    }
    particle (particle p){
        this.x=p.x;
        this.y=p.y;
        this.w=p.w;
        this.val=1;
    }
}
