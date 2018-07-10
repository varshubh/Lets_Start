package hotelPattern;

public abstract class Hotel {
	protected Cost regular=null;
	protected Cost rewarded=null;
	protected Integer rating=null;
	public abstract int calculateBill(int weekDays, int weekEnds, String str);
}
