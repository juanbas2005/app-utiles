package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* renamed from: iu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iu4 {
    public final Context a;
    public final ht4 b = new ht4(this, new et4(this, 0));
    public final tb1 c;
    public final Activity d;
    public boolean e;
    public final g30 f;
    public final boolean g;

    public iu4(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.c = new tb1(context, (byte) 0);
        Iterator it = cl6.S(new tm3(25), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.d = (Activity) obj;
        this.f = new g30(2, this);
        this.g = true;
        ox4 ox4 = this.b.s;
        ox4.a(new hu4(ox4));
        this.b.s.a(new n8(this.a));
        new z97(new et4(this, 1));
    }

    public static void b(iu4 iu4, Object obj, wu4 wu4) {
        iu4.getClass();
        obj.getClass();
        iu4.b.l(obj, wu4);
    }

    public final void a(vr2 vr2, Object obj) {
        obj.getClass();
        ht4 ht4 = this.b;
        ht4.getClass();
        ht4.l(obj, uq3.G(vr2));
    }

    public final void c() {
        ht4 ht4 = this.b;
        if (!ht4.f.isEmpty()) {
            qt4 f2 = ht4.f();
            f2.getClass();
            if (ht4.m(f2.x.a, true, false)) {
                ht4.b();
            }
        }
    }
}
