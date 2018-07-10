package hotelPattern;

public class Woods extends Hotel{
	Woods(Cost regular, Cost rewarded, Integer rating) {
		this.rating=rating;
		this.regular=new Cost(regular);
		this.rewarded=new Cost(rewarded);
	}
	@Override
	public int calculateBill(int weekDays, int weekEnds, String str) {
		int bill=0;
		if(str.equalsIgnoreCase("regular") || str.equalsIgnoreCase("1")){
			bill=regular.weekDayPrice*weekDays;
			bill=bill+regular.weekEndPrice*weekEnds;
		}
		else if(str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("2")){
			bill=rewarded.weekDayPrice*weekDays;
			bill=bill+rewarded.weekEndPrice*weekEnds;
		}
		return bill;
	}
}
