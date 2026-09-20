package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: yo0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yo0 {
    public final uq4 a;
    public final k26 b;
    public final Collection c;
    public final vr2 d;
    public final no0[] e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yo0(uq4 uq4, no0[] no0Arr, vr2 vr2) {
        this(uq4, (k26) null, (Collection) null, vr2, (no0[]) Arrays.copyOf(no0Arr, no0Arr.length));
        uq4.getClass();
    }

    public /* synthetic */ yo0(uq4 uq4, no0[] no0Arr) {
        this(uq4, no0Arr, (vr2) e7.J);
    }

    public yo0(uq4 uq4, k26 k26, Collection collection, vr2 vr2, no0... no0Arr) {
        this.a = uq4;
        this.b = k26;
        this.c = collection;
        this.d = vr2;
        this.e = no0Arr;
    }

    public /* synthetic */ yo0(Collection collection, no0[] no0Arr) {
        this(collection, no0Arr, (vr2) e7.L);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public yo0(Collection collection, no0[] no0Arr, vr2 vr2) {
        this((uq4) null, (k26) null, collection, vr2, (no0[]) Arrays.copyOf(no0Arr, no0Arr.length));
        collection.getClass();
    }
}
