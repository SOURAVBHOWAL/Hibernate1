
public class String1 {

	public static void main(String[] args) {
		String s1=new String("abc");
		String s2="abcb";
		String s3="abc";
		s1="abc";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println();
//		int[] arr1= {1,2,3};
//		int[] arr2={1,2,3};
//		System.out.println(arr1.hashCode());
//		System.out.println(arr2.hashCode());
//		Integer a1=1;
//		Integer a2=1;
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println(s1.contentEquals(s3));
 //		s1="edf";
//		System.out.println(System.identityHashCode(s1));

	}

}
