package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: zu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zu2 extends k2 implements Serializable {
    public static yu2 g(k2 k2Var, k2 k2Var2, int i, rc8 rc8, Class cls) {
        return new yu2(k2Var, Collections.EMPTY_LIST, k2Var2, new xu2(i, rc8, true), cls);
    }

    public static yu2 h(k2 k2Var, Object obj, k2 k2Var2, int i, rc8 rc8, Class cls) {
        int i2 = i;
        k2 k2Var3 = k2Var2;
        return new yu2(k2Var, obj, k2Var3, new xu2(i2, rc8, false), cls);
    }
}
