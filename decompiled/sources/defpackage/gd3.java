package defpackage;

import android.graphics.Path;

/* renamed from: gd3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gd3 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ gd3(int i, int i2, eh5 eh5) {
        this.w = 1;
        this.x = i;
        this.y = eh5;
        this.z = i2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        int i2 = this.z;
        int i3 = this.x;
        Object obj2 = this.y;
        switch (i) {
            case b85.b:
                ((dh5) obj).g((eh5) obj2, i3, i2, 0.0f);
                return vs7;
            case 1:
                eh5 eh5 = (eh5) obj2;
                ((dh5) obj).g(eh5, dh4.C(((float) (i3 - eh5.w)) / 2.0f), dh4.C(((float) (i2 - eh5.x)) / 2.0f), 0.0f);
                return vs7;
            case 2:
                ((dh5) obj).g((eh5) obj2, i3, i2, 0.0f);
                return vs7;
            default:
                eh ehVar = (eh) obj2;
                jc5 jc5 = (jc5) obj;
                zg zgVar = jc5.a;
                int d = jc5.d(i3);
                int d2 = jc5.d(i2);
                CharSequence charSequence = zgVar.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder p = pb4.p("start(", d, ") or end(", d2, ") is out of range [0..");
                    p.append(length);
                    p.append("], or start > end!");
                    zb3.a(p.toString());
                }
                Path path = new Path();
                zf7 zf7 = zgVar.d;
                zf7.f.getSelectionPath(d, d2, path);
                int i4 = zf7.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, (float) i4);
                }
                eh ehVar2 = new eh(path);
                ehVar2.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(jc5.f)) & 4294967295L));
                eh.a(ehVar, ehVar2);
                return vs7;
        }
    }

    public /* synthetic */ gd3(Object obj, int i, int i2, int i3) {
        this.w = i3;
        this.y = obj;
        this.x = i;
        this.z = i2;
    }
}
