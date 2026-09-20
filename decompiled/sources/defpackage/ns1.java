package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: ns1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum ns1 {
    z(true),
    A(true),
    B(true),
    C(false),
    D(true),
    E(true),
    F(true),
    G(true),
    H(true),
    I(true),
    J(true),
    K(true),
    L(true),
    M(true);
    
    public static final Set x = null;
    public static final Set y = null;
    public final boolean w;

    static {
        ns1[] values = values();
        ArrayList arrayList = new ArrayList();
        for (ns1 ns1 : values) {
            if (ns1.w) {
                arrayList.add(ns1);
            }
        }
        x = dt0.g1(arrayList);
        y = qs.r1(values());
    }

    /* access modifiers changed from: public */
    ns1(boolean z2) {
        this.w = z2;
    }
}
