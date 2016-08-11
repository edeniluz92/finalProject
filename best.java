/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalp;

/**
 *
 * @author מיכל
 */
public class best implements Comparable<best> {
    sensor p1;
    sensor p2;
    int max;
    double dist;
    best (sensor p1,sensor p2,int max,double dist){
        this.p1=p1;
        this.p2=p2;
        this.max=max;
        this.dist=dist;
    }
    @Override
    public int compareTo(best other)
	{
		return Double.compare(other.max, this.max);
	}
}
