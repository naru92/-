package ch06_varargs;

public class VarArgExample {
	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(VarArg.concatenate("", "100","200","300"));
		System.out.println(VarArg.concatenate("", strArr));
		System.out.println(VarArg.concatenate("", new String[] {"1","2","3"}));
		System.out.println("["+VarArg.concatenate("", new String[0])+"]");
		System.out.println("["+VarArg.concatenate(",", new String[0])+"]");
		System.out.println("["+VarArg.concatenate(",")+"]");
	}
}
