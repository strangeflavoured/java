public class limit{
	protected static class Sum{
		private double val;
		void set(){
			val=0;
		}
		void add(double b){
			val=val+b;
		}
	}

	static double pot(int i){
		double d=1/Math.pow(2,i);
		return d;
	}

	public static void main(String[] args){
		Sum s=new Sum();
		s.set();
		int j=1;
		double el;
		do {			
			el=pot(j);
			s.add(el);
			j+=1;
		} while (el!=0);
		System.out.println(s.val);
	}
}