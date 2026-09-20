package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e96 extends ry3 {
    public static final e96 c = new e96("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e96(String str, int i) {
        super(str);
        this.b = i;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        switch (this.b) {
            case b85.b:
                int size = list.size();
                b42 b42 = b42.w;
                if (size == 0) {
                    return oh4.d0(k31.j(j), k31.i(j), b42, xc4.M);
                }
                if (size != 1) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        eh5 y = ((gh4) list.get(i3)).y(j);
                        i = Math.max(y.w, i);
                        i2 = Math.max(y.x, i2);
                        arrayList.add(y);
                    }
                    return oh4.d0(m31.g(j, i), m31.f(j, i2), b42, new of(3, arrayList));
                }
                eh5 y2 = ((gh4) list.get(0)).y(j);
                return oh4.d0(m31.g(j, y2.w), m31.f(j, y2.x), b42, new wd(y2, 6));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
