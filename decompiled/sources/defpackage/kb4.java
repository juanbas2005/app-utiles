package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: kb4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class kb4 {
    public static final String d;
    public static final cb4 e = new kb4("NO_LOCKS", g22.A);
    public final du6 a;
    public final td0 b;
    public final String c;

    /* JADX WARNING: type inference failed for: r0v3, types: [cb4, kb4] */
    static {
        String str;
        String canonicalName = kb4.class.getCanonicalName();
        canonicalName.getClass();
        int K0 = d57.K0(0, 6, canonicalName, ".");
        if (K0 == -1) {
            str = "";
        } else {
            str = canonicalName.substring(0, K0);
        }
        d = str;
    }

    public kb4(String str) {
        this(str, new wv2(13, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ib4, hb4] */
    public final ib4 a(sr2 sr2) {
        return new hb4(this, sr2);
    }

    public final fb4 b(vr2 vr2) {
        return new fb4(this, new ConcurrentHashMap(3, 1.0f, 2), vr2, 1);
    }

    public final m70 c(vr2 vr2) {
        return new m70(this, new ConcurrentHashMap(3, 1.0f, 2), vr2, 3);
    }

    public v70 d(String str, Object obj) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return f21.l(sb, this.c, ")");
    }

    public kb4(String str, du6 du6) {
        td0 td0 = td0.G;
        this.a = du6;
        this.b = td0;
        this.c = str;
    }
}
