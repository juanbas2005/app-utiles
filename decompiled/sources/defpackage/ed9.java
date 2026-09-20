package defpackage;

import java.io.File;

/* renamed from: ed9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed9 extends fd9 {
    public int b;

    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    public final String b() {
        return "logInternal";
    }

    public final int c() {
        return 44;
    }

    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed9) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        this.b = -1391114360;
        return -1391114360;
    }
}
