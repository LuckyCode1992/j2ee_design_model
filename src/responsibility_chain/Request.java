package responsibility_chain;

/**
 * 请求者
 */
public class Request {
    private int day ;

    public Request(int day) {
        this.day = day;
    }

    public Request() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
