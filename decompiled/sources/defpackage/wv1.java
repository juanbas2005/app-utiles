package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: wv1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv1 {
    public final List a;

    public wv1(ht5 ht5) {
        ht5.getClass();
        List list = ht5.y;
        if ((ht5.x & 1) == 1) {
            int i = ht5.z;
            list.getClass();
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    bt5 bt5 = (bt5) next;
                    if (i2 >= i) {
                        bt5.getClass();
                        at5 r = bt5.r(bt5);
                        r.z |= 2;
                        r.B = true;
                        bt5 = r.g();
                        if (!bt5.a()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList.add(bt5);
                    i2 = i3;
                } else {
                    sg3.Z();
                    throw null;
                }
            }
            list = arrayList;
        }
        list.getClass();
        this.a = list;
    }

    public bt5 a(int i) {
        return (bt5) this.a.get(i);
    }

    public /* synthetic */ wv1(List list) {
        this.a = list;
    }
}
