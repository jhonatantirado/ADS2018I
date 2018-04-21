package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class LogReader implements Iterable<LogLine> {
    private final int sizeLogLines;
    private final int sizeUniqueIps;
    private Collection<String> uniqueIps;

    public LogReader(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
        
        //Array List no es bueno para busquedas
        //Un Hash es mejor
        //this.uniqueIps = new ArrayList<String>();
        
        this.uniqueIps = new HashSet<String>();
    }

    public Iterator<LogLine> iterator() {
        return new LogReaderIterator(this.sizeLogLines, this.sizeUniqueIps);
    }

    @SuppressWarnings("unused")
    public int readAllLogs() {
        int sizeLogLines = 0;
        for (LogLine line : this) {
            String ip = line.getIP();
            sizeLogLines++;
        }
        return sizeLogLines;
    }

    public int getSizeUniqueIps() {
    	//complejidad cuadratica porque tiene un FOR y una busqueda CONTAINS
    	//el problema esta en la busqueda
    	//se puede aplicar busqueda binaria ya que esta ordenado?

        for (LogLine logLine : this) {
            String ip = logLine.getIP();
            if (!this.uniqueIps.contains(ip)) {
                this.uniqueIps.add(ip);
            }
        }
        return this.uniqueIps.size();
    }
}
