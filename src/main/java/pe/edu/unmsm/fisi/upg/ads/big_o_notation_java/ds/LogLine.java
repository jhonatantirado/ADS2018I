package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

public class LogLine {
    int counter;

    public LogLine(int counter) {
        this.counter = counter;
    }

    public String getIP() {
        return "ip-" + counter;
    }
}
