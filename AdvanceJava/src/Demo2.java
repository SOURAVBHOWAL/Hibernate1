import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> l=List.of(7,1,2,3,4,4,5,6);
		Stream<Integer> s=l.stream();
		Stream<Integer> s1=l.stream().filter(n->n>=4);
		Stream<Integer> s2=l.stream().sorted();
		
		l.stream().filter(n->n>=4).sorted().forEach(System.out::print);
//		s.forEach(System.out::print);
//		s1.forEach(System.out::print);
//		s2.forEach(System.out::print);
		Set<Integer> hs=l.stream().collect(Collectors.toSet());
		hs.stream().forEach(System.out::print);
		int[] arr=l.stream().mapToInt(Integer::intValue).toArray();
		
		List<List<Integer>> td=List.of(List.of(1,2,3,4),List.of(4,5,6,4));
		int[][] a=td.stream().map(list->list.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
		
		int[] arr1= {1,2,3,3,5,6};
		List<Integer> l2=Arrays.stream(arr1).boxed().collect(Collectors.toList());
		System.out.println(l2);
		l.stream().sorted((c,b)->b-c).forEach(System.out::print);
		try {
			arr1[10]=9;
		}
		catch(Exception e){
			
		}
	}

}
