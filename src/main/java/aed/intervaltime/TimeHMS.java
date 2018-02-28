package IntervalTime;

/**
 * @author Guillermo Vigueras, Julio García
 *
 */
public class TimeHMS implements Time {

  private int hour;
  private int mins;
  private int secs;
  private int sign;

  public TimeHMS(){
    sign = 1;

    hour = 0;
    mins = 0;
    secs = 0;
  }

  public TimeHMS(int sgn,int h,int m,int s){

    // need to pass the sign as argument for the case when hour=0
    sign = sgn < 0 ? -1 : 1;

    hour = Math.abs(h);
    mins = Math.abs(m) % 60;
    secs = Math.abs(s) % 60;
  }

  public boolean equals(Object o){
    if(o==this) return true;
    if(o instanceof Time){
      Time t = (Time) o;
      return sign==t.getSign() && hour==t.getHour()
        && mins==t.getMins() && secs==t.getSecs();
    }else
      return false;


  }

  public String toString(){

    String sign = this.sign==-1 ? "-" : "";

    return sign+hour+":"+mins+":"+secs;
  }

  public int getHour() {
    return hour;
  }


  public int getMins() {
    return mins;
  }

  public int getSecs() {
    return secs;
  }

  public int getSign() {
    return sign;
  }

  public int timeInSeconds(){
    return sign*(hour*3600+mins*60+secs);
  }

  private Time secondsToTime(int totalSecs){
    return new TimeHMS(totalSecs < 0 ? -1 : 1,Math.abs(totalSecs / 3600),
                       Math.abs((totalSecs % 3600) / 60),Math.abs(totalSecs % 60));

  }

  public Time suma(Time t) {
    return secondsToTime(timeInSeconds()+t.timeInSeconds());
  }

  public Time resta(Time t) {
    return secondsToTime(timeInSeconds()-t.timeInSeconds());
  }

  public boolean less(Time t) {
      // COMPLETAR
	  return false;
  }

  public boolean lessEq(Time t) {
    // COMPLETAR
	  return false;
  }

}
