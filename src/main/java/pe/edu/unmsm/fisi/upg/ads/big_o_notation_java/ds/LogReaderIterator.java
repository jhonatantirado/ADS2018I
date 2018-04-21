package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LogReaderIterator implements Iterator<LogLine> {
    private int counter = 0;
    private final int sizeLogLines;
    private final int sizeUniqueIps;

    public LogReaderIterator(int sizeLogLines, int sizeUniqueIps) {
        this.sizeLogLines = sizeLogLines;
        this.sizeUniqueIps = sizeUniqueIps;
    }

    public boolean hasNext() {
        return this.counter < this.sizeLogLines;
    }

    public LogLine next() {
        if (this.hasNext()) {
            this.counter++;
            return new LogLine(this.counter % this.sizeUniqueIps);
        }
        throw new NoSuchElementException();
    }
}
