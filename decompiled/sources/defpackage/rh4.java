package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rh4 extends h2 {
    public final pj w;
    public final ArrayList x;
    public final List y;

    public rh4(pj pjVar, n74 n74, ArrayList arrayList, vo4 vo4) {
        if (vo4.b == arrayList.size() + 1) {
            int i = vo4.b;
            if (i != 0) {
                float[] fArr = vo4.a;
                int i2 = 0;
                float f = 0.0f;
                if (fArr[0] != 0.0f) {
                    h.q("First outline progress value is expected to be zero");
                    throw null;
                } else if (i == 0) {
                    kj6.i("FloatList is empty.");
                    throw null;
                } else if (fArr[i - 1] == 1.0f) {
                    this.w = pjVar;
                    this.y = n74;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        if (vo4.b(i3) - vo4.b(i2) > 1.0E-4f) {
                            arrayList2.add(new qh4(this, (qc1) arrayList.get(i2), f, vo4.b(i3)));
                            f = vo4.b(i3);
                        }
                        i2 = i3;
                    }
                    qh4 qh4 = (qh4) b81.k(1, arrayList2);
                    float f2 = qh4.c;
                    if (1.0f >= f2) {
                        qh4.c = f2;
                        qh4.d = 1.0f;
                        this.x = arrayList2;
                        return;
                    }
                    h.q("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
                    throw null;
                } else {
                    h.q("Last outline progress value is expected to be one");
                    throw null;
                }
            } else {
                kj6.i("FloatList is empty.");
                throw null;
            }
        } else {
            h.q("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof qh4)) {
            return false;
        }
        return super.contains((qh4) obj);
    }

    public final int f() {
        return this.x.size();
    }

    public final Object get(int i) {
        return (qh4) this.x.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof qh4)) {
            return -1;
        }
        return super.indexOf((qh4) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof qh4)) {
            return -1;
        }
        return super.lastIndexOf((qh4) obj);
    }
}
