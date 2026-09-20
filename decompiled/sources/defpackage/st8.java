package defpackage;

import java.util.AbstractMap;

/* renamed from: st8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class st8 extends mt8 {
    public final /* synthetic */ tt8 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public st8(tt8 tt8) {
        super(2);
        this.B = tt8;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        ut8 ut8 = this.B.C;
        return new AbstractMap.SimpleImmutableEntry(ut8.y.E.get(i), ut8.z.get(i));
    }

    public final int size() {
        return this.B.C.z.size();
    }
}
