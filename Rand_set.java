package misc;

import java.util.ArrayList;
import java.util.List;

public class Rand_set implements Random_subset{

	private List<Integer> set;
	
	Rand_set(ArrayList<Integer> set){
		this.set = set;
	}
	
	public List<Integer> get_set(){
		return set;
	}
	
	@Override
	public List<Integer> random_subset(List<Integer> set) {
		return random_subset(set);
	}

}
