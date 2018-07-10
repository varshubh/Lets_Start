package hotelPattern;

public class Cost {
	int weekDayPrice;
	int weekEndPrice;
	Cost(Cost a){
		weekDayPrice=a.weekDayPrice;
		weekEndPrice=a.weekEndPrice;
	}
	public Cost(int weekDayPrice, int weekEndPrice) {
		this.weekDayPrice=weekDayPrice;
		this.weekEndPrice=weekEndPrice;
	}
}
