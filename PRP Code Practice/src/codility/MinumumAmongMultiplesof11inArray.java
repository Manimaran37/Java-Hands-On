package codility;

import java.util.ArrayList;
import java.util.Collections;

public class MinumumAmongMultiplesof11inArray {
	
	public static void solution(int[] arr) {
		if(arr.length >=1 && arr.length <= 1000) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= -10000 && arr[i] <= 10000) {
					
					if(arr[i]%11==0) {								
						list.add(arr[i]);
					}	
				}
				else {
					break;
				}
			}
			System.out.println(Collections.min(list));
		}
		
	}

	public static void main(String[] args) {
		solution(new int[] {-6, -91, 1011, -100, 84, -22, 0 ,1, 473});

	}

}
