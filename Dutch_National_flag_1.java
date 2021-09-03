package Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Dutch_National_flag_1 {
	public static enum Color { RED,WHITE, BLUE }
	public static void dutchFlagPartition(int pivotlndex , List<Color> A) {
	Color pivot = A.get(pivotlndex);
	// First pass: group elements smaller than pivot.
	for (int i = 0; i < A.size(); ++i) {
	// Look for a smaller element.
	for (int j = i + 1; j < A.size(); ++j){
	if (A.get(j).ordinal() < pivot.ordinal()){
	Collections.swap(A , i, j);
	break ;
	}
	}
	}
	// Second pass: group elements larger than pivot.
	for (int i = A.size() - 1 ; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); --i) {
	// Look for a larger element. Stop when we reach an element less
	// than pivot, since first pass has moved them to the start of A.
	for (int j = i - 1; j >= 0&& A.get(j).ordinal() >= pivot.ordinal();
	--j) {
	if (A.get(j).ordinal() > pivot.ordinal()){
	Collections.swap(A , i, j);
	break ;
	}
	}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pivot_index=2;
		List<Color> e=new ArrayList<Color>();
		e.add(Color.BLUE);
		e.add(Color.RED);
		e.add(Color.WHITE);
		e.add(Color.RED);
		e.add(Color.BLUE);
		e.add(Color.BLUE);
		e.add(Color.WHITE);
		System.out.println("Enter the elements in array:\n"+e);
		dutchFlagPartition(pivot_index,e);
		//Collections.sort(e);
		System.out.println("The Array after executing the DNFS Algorithm is: ");
		System.out.println(e);
		
		
		

	}

}
