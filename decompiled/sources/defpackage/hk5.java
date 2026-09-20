package defpackage;

import java.util.ArrayList;

/* renamed from: hk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hk5 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ik5 x;

    public /* synthetic */ hk5(ik5 ik5, int i) {
        this.w = i;
        this.x = ik5;
    }

    public final Object b() {
        zr3[] childSerializers;
        ArrayList arrayList;
        zr3[] typeParametersSerializers;
        int i = this.w;
        ik5 ik5 = this.x;
        switch (i) {
            case b85.b:
                av2 av2 = ik5.b;
                if (av2 == null || (childSerializers = av2.childSerializers()) == null) {
                    return dh4.x;
                }
                return childSerializers;
            case 1:
                av2 av22 = ik5.b;
                if (av22 == null || (typeParametersSerializers = av22.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (zr3 descriptor : typeParametersSerializers) {
                        arrayList.add(descriptor.getDescriptor());
                    }
                }
                return uq3.m(arrayList);
            default:
                return Integer.valueOf(fb5.l(ik5, (ll6[]) ik5.j.getValue()));
        }
    }
}
