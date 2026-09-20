package defpackage;

import java.io.PrintStream;

/* renamed from: d56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d56 {
    public static final int a;
    public static final int b;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property != null && !property.isEmpty()) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    break;
                } else if (strArr[i3].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                } else {
                    i3++;
                }
            }
        }
        i = 1;
        a = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        b = i2;
    }

    public static final void a(String str, Throwable th) {
        b().println("SLF4J(E): ".concat(str));
        b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(b());
    }

    public static PrintStream b() {
        if (b81.B(a) != 1) {
            return System.err;
        }
        return System.out;
    }

    public static final void c(String str) {
        if (b81.B(3) >= b81.B(b)) {
            b().println("SLF4J(W): ".concat(str));
        }
    }
}
