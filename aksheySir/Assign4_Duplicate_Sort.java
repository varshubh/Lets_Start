package aksheySir;

import java.util.*;

public class Assign4_Duplicate_Sort {

	public static void main(String[] args) {
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
		String s[] = str.split(" ");
		Integer f;
		Map <String, Integer> map = new LinkedHashMap <String, Integer>();
		for(int i=0;i<s.length;i++){
			f = map.get(s[i]);
			if(f==null)
			{
				map.put(s[i],1);
			}
			else
			{
				map.put(s[i], f+1);
			}
		}
		List <String> listU = new ArrayList<String>();
		List <String> listD = new ArrayList<String>();
		for(Map.Entry<String, Integer> m : map.entrySet()){
			if((Integer)m.getValue()==1){
				listU.add((String) m.getKey());
			}
			else{
				while((Integer)m.getValue()>0){
					listD.add((String) m.getKey());
					f=m.getValue();
					f--;
					m.setValue(f);
				}
			}
		}
		Collections.sort(listU);
		for(int i=0;i<listU.size();i++)
			System.out.print(listU.get(i)+" ");
		for(int i=0;i<listD.size();i++)
			System.out.print(listD.get(i)+" ");
	}

}
