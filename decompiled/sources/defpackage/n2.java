package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: n2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n2 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Collection x;

    public /* synthetic */ n2(int i, Collection collection) {
        this.w = i;
        this.x = collection;
    }

    public final Object y(Object obj) {
        boolean contains;
        int i = this.w;
        Collection collection = this.x;
        switch (i) {
            case b85.b:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
