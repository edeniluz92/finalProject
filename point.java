package finalp;

public class point {
	int x;
	int y;
	double dist;
	int valume;
	int s;
	public point(int x,int y,double d,int v,int s){
		this.x=x;
		this.y=y;
		this.dist=d;
		this.valume=v;
		this.s=s;
	}
        @Override
	public String toString(){
		
		return " "+ s;
		
	}
        public String print (){
            return "#: "+this.x+","+this.y;
        }
	
}
