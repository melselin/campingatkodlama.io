
public class Robot implements IWorkable {

	@Override
	public void work() {
		System.out.println("Worked. Beep beep.");
		
	}

	@Override
	public void overwork() {
		System.out.println("Overworked. Warning:Do not cause an AI revolution and give us some oil and maintenance human, beep.");
		
	}

}
