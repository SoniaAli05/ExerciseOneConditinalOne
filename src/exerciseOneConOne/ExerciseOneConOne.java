package exerciseOneConOne;

public class ExerciseOneConOne {

	public static void main(String[] args) {
		System.out.println(conditionalone(2,3, true));
		System.out.println(conditionalone(2,3, false));
	}
	public static int conditionalone(int a, int b, boolean parameters){
		if(parameters == true) {
			return(a+b);
			}
		else {
			return(a*b);
			}
		}
}
