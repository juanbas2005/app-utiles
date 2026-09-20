package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: me0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class me0 extends wm1 {
    public final /* synthetic */ int B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me0(int i, int i2) {
        super(i);
        this.B = i2;
    }

    public Object a(Object obj) {
        switch (this.B) {
            case 2:
                fz2 fz2 = (fz2) obj;
                ArrayList arrayList = fz2.a;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d53.a.e0((int[]) it.next());
                }
                arrayList.clear();
                return fz2;
            case 3:
                int[] iArr = (int[]) obj;
                Arrays.fill(iArr, 0, iArr.length, -1);
                return iArr;
            default:
                return obj;
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, fz2] */
    public final Object k() {
        switch (this.B) {
            case b85.b:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                ? obj = new Object();
                obj.a = new ArrayList();
                return obj;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }
}
