package IntervalTime;

/**
 * @author Guillermo Vigueras, Julio García
 *
 */
public class TimeSec implements Time {

  private int totalSecs;
  private int sign;

  public TimeSec() {
    sign = 1;
    totalSecs = 0;
  }

  public TimeSec(int s) {
    sign = s < 0 ? -1 : 1;
    totalSecs = Math.abs(s);
  }

  public boolean equals(Object o){
    if(o==this) return true;

    if(o instanceof Time) {
      Time t = (Time) o;
      return sign==t.getSign() && totalSecs==Math.abs(t.timeInSeconds());
    } else
      return false;

  }

  public String toString(){
    String sign = this.sign==-1 ? "-" : "";
    return sign+getHour()+":"+getMins()+":"+getSecs();
  }

  public int getHour() {
    return totalSecs / 3600;
  }

  public int getMins() {
    return (totalSecs % 3600) / 60;
  }

  public int getSecs() {
    return totalSecs % 60;
  }

  public int getSign() {
    return sign;
  }

  public int timeInSeconds(){
    return sign*totalSecs;
  }

  public Time suma(Time t) {
    return new TimeSec(timeInSeconds()+t.timeInSeconds());
  }

  public Time resta(Time t) {
    return new TimeSec(timeInSeconds()-t.timeInSeconds());
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



