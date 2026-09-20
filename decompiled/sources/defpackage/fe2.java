package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: fe2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fe2 implements Serializable, Comparator {
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((de2) obj).c, ((de2) obj2).c);
    }
}
