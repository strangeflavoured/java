import java.util.List;
import java.util.ArrayList;

public class odd{
	public static Integer getElement(List<Integer> list, Integer n) {
		int res;
		int i=2*n-1;
		try{

			res=list.get(i);
		} catch (ArrayIndexOutOfBoundsException ex){
			res=-1;
		}	
		return res;
	}
	public static void main(String[] args){
		List<Integer> list=new ArrayList<>();
		for (int i=0;i<1000;i++){
			list.add(i);
		}
		int res=getElement(list,69);
		System.out.println(res);	
	}
}