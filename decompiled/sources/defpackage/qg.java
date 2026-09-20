package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: qg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg extends Handler {
    public static final qg a = new Handler();

    public final void publish(LogRecord logRecord) {
        int i;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = pg.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        message.getClass();
        pg.a(loggerName, i, message, logRecord.getThrown());
    }

    public final void close() {
    }

    public final void flush() {
    }
}
