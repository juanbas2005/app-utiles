package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: l92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class l92 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l92(o98 o98, int i, aq4 aq4, bd5 bd5) {
        this.w = 0;
        this.y = o98;
        this.x = i;
        this.z = aq4;
        this.A = bd5;
    }

    public final Object b() {
        ly5 ly5;
        int i;
        int i2 = this.w;
        Object obj = this.A;
        int i3 = this.x;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i2) {
            case b85.b:
                bd5 bd5 = (bd5) obj;
                View view = ((o98) obj3).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i4 = rect.top;
                int i5 = rect.bottom;
                dy3 dy3 = (dy3) ((aq4) obj2).getValue();
                if (dy3 == null || !dy3.n()) {
                    ly5 = ly5.e;
                } else {
                    ly5 = z85.c(dy3.d(0), pv8.O(dy3.k()));
                }
                int i6 = i4 + i3;
                int i7 = i5 - i3;
                float f = ly5.b;
                if (f <= ((float) i5)) {
                    float f2 = ly5.d;
                    if (f2 >= ((float) i4)) {
                        i = dh4.C(Math.max(f - ((float) i6), ((float) i7) - f2));
                        bd5.e(Math.max(i, 0));
                        return vs7.a;
                    }
                }
                i = i7 - i6;
                bd5.e(Math.max(i, 0));
                return vs7.a;
            case 1:
                StringBuilder q = b81.q("Can not interpret the string '", (String) obj3, "' as ");
                q.append(((x15) ((z15) obj2).a.get(i3)).b);
                q.append(": ");
                q.append(((y15) obj).c());
                return q.toString();
            default:
                return "Expected " + ((v47) obj3).b + " but got " + ((CharSequence) obj2).subSequence(i3, ((f06) obj).w).toString();
        }
    }

    public /* synthetic */ l92(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.x = i;
        this.A = obj3;
    }
}
