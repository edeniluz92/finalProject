package finalp;

public class sensor {
	int x;
	int y;
	double dist;
	int valume;
        double snr;
        double snrDemo;
	int s;
        double ang;
	public sensor(int x,int y,double d,int v,int s,int snrDemo){
                this.snrDemo=snrDemo;
                this.ang=Math.random()*360;
		this.x=x;
		this.y=y; 
		this.dist=d;
		this.valume=v;
                this.snr=v;
		this.s=s;
	}
        @Override
	public String toString(){
		
		return " "+ s;
		
	}
        public String print (){
            return "#valume: "+this.valume+"#dist: "+ this.dist;
        }
	
}
