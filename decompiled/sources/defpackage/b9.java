package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: b9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b9 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b9(hw6 hw6, o81 o81, aq4 aq4, is2 is2, String str) {
        this.w = 8;
        this.x = hw6;
        this.y = o81;
        this.B = aq4;
        this.A = is2;
        this.z = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: g58} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        u44 u44;
        ze7 ze7;
        List list;
        ly5 ly5;
        float f;
        int i = this.w;
        boolean z2 = false;
        g58 g58 = null;
        vs7 vs7 = vs7.a;
        Object obj2 = this.x;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case b85.b:
                w8 w8Var = (w8) obj2;
                kw1 kw1 = (kw1) obj;
                w8Var.a = ((pv0) obj6).c((String) obj5, (hj8) obj4, new c9(0, (aq4) obj3));
                return new d9(0, w8Var);
            case 1:
                v44 v44 = (v44) obj;
                o44 o44 = ((og) obj6).a;
                v44.h = (hf7) obj2;
                v44.i = (c93) obj5;
                v44.c = (h17) obj4;
                v44.d = (vr2) obj3;
                if (o44 != null) {
                    u44 = o44.L;
                } else {
                    u44 = null;
                }
                v44.e = u44;
                if (o44 != null) {
                    ze7 = o44.M;
                } else {
                    ze7 = null;
                }
                v44.f = ze7;
                if (o44 != null) {
                    g58 = h49.w(o44, xy0.u);
                }
                v44.g = g58;
                return vs7;
            case 2:
                aq4 aq4 = (aq4) obj3;
                int intValue = ((Integer) obj).intValue();
                aq4.setValue(Boolean.valueOf(!((Boolean) aq4.getValue()).booleanValue()));
                ar7.H((o81) obj2, (e81) null, (r81) null, new eu0((Object) (s34) obj6, intValue, (Object) (re3) obj5, (Object) (yh0) obj4, (f61) null, 1), 3);
                return vs7;
            case 3:
                kw1 kw12 = (kw1) obj;
                return new vk1(this.x, (Set) obj6, (Set) obj5, (aq4) obj3, (aq4) obj4);
            case 4:
                sk3 sk3 = (sk3) obj2;
                vz3 vz3 = (vz3) obj;
                vz3.getClass();
                vd2 vd2 = new vd2(27);
                ig igVar = vz3.q;
                igVar.a(1, new uz3((vr2) null, new l20(2, vd2), new tm3(6), new fw0(-291643851, new qw0(2), true)));
                vz3.r = true;
                w52 w52 = sk3.e;
                igVar.a(w52.f(), new uz3(new e3(13, (Object) new vd2(28), (Object) w52), vz3.s, new y20(5, w52), new fw0(-1117249557, new ok3(w52, (qt4) obj6, sk3, (o81) obj5, (xz1) obj4, (a37) obj3), true)));
                return vs7;
            case 5:
                en4 en4 = (en4) obj2;
                h06 h06 = (h06) obj6;
                e06 e06 = (e06) obj5;
                zh6 zh6 = (zh6) obj4;
                d06 d06 = (d06) obj3;
                float floatValue = ((Float) obj).floatValue();
                an4 g = en4.g(en4.g);
                if (g != null) {
                    jz0 jz0 = en4.e;
                    long j = g.b;
                    long j2 = g.a;
                    ((z38) jz0.x).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((z38) jz0.y).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    an4 a = ((an4) h06.w).a(g);
                    h06.w = a;
                    float j3 = zh6.j(zh6.f(a.a));
                    e06.w = j3;
                    d06.w = !gr8.s(j3 - floatValue);
                }
                if (g != null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 6:
                ArrayList arrayList = (ArrayList) obj6;
                f06 f06 = (f06) obj5;
                ht4 ht4 = (ht4) obj4;
                Bundle bundle = (Bundle) obj3;
                zs4 zs4 = (zs4) obj;
                zs4.getClass();
                ((d06) obj2).w = true;
                int indexOf = arrayList.indexOf(zs4);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(f06.w, i2);
                    f06.w = i2;
                } else {
                    list = a42.w;
                }
                ht4.a(zs4.x, bundle, zs4, list);
                return vs7;
            case 7:
                o81 o81 = (o81) obj2;
                aq4 aq42 = (aq4) obj3;
                Context context = (Context) obj6;
                aq4 aq43 = (aq4) obj5;
                aq4 aq44 = (aq4) obj4;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    aq42.setValue(Boolean.TRUE);
                    ar7.H(o81, (e81) null, (r81) null, new w6(context, uri, aq42, aq43, aq44, (f61) null, 12), 3);
                }
                return vs7;
            case 8:
                hw6 hw6 = (hw6) obj2;
                o81 o812 = (o81) obj6;
                aq4 aq45 = (aq4) obj3;
                is2 is2 = (is2) obj4;
                String str = (String) obj5;
                if (((Boolean) obj).booleanValue()) {
                    String g2 = hw6.g();
                    if (g2 != null) {
                        aq45.setValue(g2);
                    } else {
                        ar7.H(o812, (e81) null, (r81) null, new ep2(is2, str, (f61) null, 4), 3);
                    }
                }
                return vs7;
            default:
                v35 v35 = (v35) obj6;
                hf7 hf7 = (hf7) obj5;
                u44 u442 = (u44) obj4;
                ky6 ky6 = (ky6) obj3;
                wy3 wy3 = (wy3) obj;
                wy3.a();
                tk0 tk0 = wy3.w;
                float d = ((uc1) obj2).c.d();
                if (d != 0.0f) {
                    long j4 = hf7.b;
                    int i3 = lg7.c;
                    int p = v35.p((int) (j4 >> 32));
                    cg7 d2 = u442.d();
                    if (d2 != null) {
                        ly5 = d2.a.c(p);
                    } else {
                        ly5 = new ly5(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float floor = (float) Math.floor((double) wy3.e0(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f2 = floor / 2.0f;
                    float f3 = ly5.a + f2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (tk0.e() >> 32)) - f2;
                    if (f3 > intBitsToFloat) {
                        f3 = intBitsToFloat;
                    }
                    if (f3 >= f2) {
                        f2 = f3;
                    }
                    if (((int) floor) % 2 == 1) {
                        f = ((float) Math.floor((double) f2)) + 0.5f;
                    } else {
                        f = (float) Math.rint((double) f2);
                    }
                    long floatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(ly5.b)) & 4294967295L);
                    long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(ly5.d)) & 4294967295L);
                    qk0 qk0 = tk0.w.c;
                    kb9 kb9 = tk0.z;
                    if (kb9 == null) {
                        kb9 = dh4.b();
                        kb9.r(1);
                        tk0.z = kb9;
                    }
                    Paint paint = (Paint) kb9.y;
                    ky6.a(d, tk0.e(), kb9);
                    if (!sg3.e((lt0) kb9.A, (Object) null)) {
                        kb9.l((lt0) null);
                    }
                    if (kb9.x != 3) {
                        kb9.j(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        kb9.q(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (kb9.f() != 0) {
                        kb9.o(0);
                    }
                    if (kb9.g() != 0) {
                        kb9.p(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        kb9.m(1);
                    }
                    qk0.e(floatToRawIntBits, floatToRawIntBits2, kb9);
                }
                return vs7;
        }
    }

    public /* synthetic */ b9(o81 o81, aq4 aq4, Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = o81;
        this.B = aq4;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ b9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
    }

    public /* synthetic */ b9(Object obj, Set set, Set set2, aq4 aq4, aq4 aq42) {
        this.w = 3;
        this.x = obj;
        this.y = set;
        this.z = set2;
        this.B = aq4;
        this.A = aq42;
    }
}
