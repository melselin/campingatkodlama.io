
public class Worker implements IWorkable,IFeedable,IPayable {

	@Override
	public void work() {
		System.out.println("Worked a shift.");
		
	}

	@Override
	public void overwork() {
		System.out.println("Overworked.");
		
	}

}
