package IntervalTime;

public interface Time{

	public int getHour();
	public int getMins();
	public int getSecs();
	public int getSign();

	public int timeInSeconds();

	public Time suma(Time t);
	public Time resta(Time t);
	public boolean less (Time t);
	public boolean lessEq (Time t);
}
