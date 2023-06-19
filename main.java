package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> set = new ArrayList<>(Arrays.asList(1,2,3));
		//System.out.println(get_subsets(set));
		
		Random_subset get_random_subset = (s) -> {
			
			List<List<Integer>> subsets = get_subsets(s);
			Random r = new Random();
			int x = r.nextInt(subsets.size());
			return subsets.get(x);
			
		};
		
		System.out.println(rand_subset(get_random_subset,set));
		
	
}
	
	private static List<Integer> rand_subset(Random_subset quem_usa,List<Integer> isso){
		return quem_usa.random_subset(isso);
	}
	
	private static List<List<Integer>> get_subsets(List<Integer> set){
		
		List<List<Integer>> subsets = new ArrayList<>();
		
		subsets.add(new ArrayList<>());
		ger_subsets(set,subsets);
		subsets.add(set);
		
		return subsets;
	}
	
	private static boolean in_list(List<Integer> set,List<List<Integer>> subsets){
		
		for(int i = 0;i < subsets.size();i++){
			List<Integer> subset = subsets.get(i);
			if(set.size() == subset.size()) {
				int l = set.size();
				int c = 0;
				for(int j = 0;j < l;j++){
					if(subset.get(j) == set.get(j)){
						c++;
					}
				}
				if(c == l){
					return true;
				}
			}
		}
		return false;
		
	}
	
	private static void ger_subsets(List<Integer> set,List<List<Integer>> subsets){
		
		
		if(set.size() == 1){
			return;
		}
		
		for(int i = 0;i < set.size();i++) {
			int x = set.remove(i);
			List<Integer> copy_set = new ArrayList<>();
			copy_set.addAll(set);
			if(set.size() >= 0 && !in_list(copy_set,subsets)) {
				
				subsets.add(copy_set);
				ger_subsets(set,subsets);
			}

			set.add(i,x);
			
		}
		
	}
	
}	
