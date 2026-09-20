package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: wg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wg1 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wg1(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.w = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.x = i;
        this.B = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    public final Object y(Object obj) {
        k51 k51;
        ly5 ly5;
        int i;
        Object obj2;
        int i2;
        int i3 = this.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.B;
        int i4 = this.x;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i3) {
            case b85.b:
                je2 je2 = (je2) obj6;
                je2 je22 = (je2) obj5;
                je2 je23 = (je2) obj4;
                je2 je24 = (je2) obj3;
                gk gkVar = (gk) obj;
                if (((cw1) gkVar.d()).a == 1) {
                    k51 = new k51(i52.j(je2, new f81(4)).a(i52.e(je22, 2)), i52.f(je23, 2).a(i52.k(je2, new ah1(i4, 0))));
                } else {
                    k51 = new k51(i52.j(je2, new ah1(i4, 0)).a(i52.e(je22, 2)), i52.k(je2, new f81(4)).a(i52.f(je23, 2)));
                }
                return gkVar.a(k51, new bv6(new yg(7, je24)));
            case 1:
                aq4 aq4 = (aq4) obj5;
                bd5 bd5 = (bd5) obj3;
                dy3 dy3 = (dy3) obj;
                aq4.setValue(dy3);
                ((bd5) obj4).e((int) (dy3.k() >> 32));
                View view = ((o98) obj6).a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i5 = rect.top;
                int i6 = rect.bottom;
                dy3 dy32 = (dy3) aq4.getValue();
                if (dy32 == null || !dy32.n()) {
                    ly5 = ly5.e;
                } else {
                    ly5 = z85.c(dy32.d(0), pv8.O(dy32.k()));
                }
                int i7 = i5 + i4;
                int i8 = i6 - i4;
                float f = ly5.b;
                if (f <= ((float) i6)) {
                    float f2 = ly5.d;
                    if (f2 >= ((float) i5)) {
                        i = dh4.C(Math.max(f - ((float) i7), ((float) i8) - f2));
                        bd5.e(Math.max(i, 0));
                        return vs7;
                    }
                }
                i = i8 - i7;
                bd5.e(Math.max(i, 0));
                return vs7;
            case 2:
                ArrayList arrayList = (ArrayList) obj5;
                aq4 aq42 = (aq4) obj4;
                ad5 ad5 = (ad5) obj3;
                dh5 dh5 = (dh5) obj;
                bd bdVar = ((xz1) obj6).b;
                ll1 b = bdVar.b();
                ed5 ed5 = bdVar.l;
                oq1 oq1 = bdVar.i;
                ad5 ad52 = bdVar.j;
                yz1 yz1 = yz1.w;
                float c = b.c(yz1);
                float f3 = -((float) i4);
                jo7 jo7 = pv4.a;
                if (!((Boolean) aq42.getValue()).booleanValue() || c != f3) {
                    if (!((Boolean) aq42.getValue()).booleanValue()) {
                        aq42.setValue(Boolean.TRUE);
                    }
                    ad5.e(f3);
                    xy1 xy1 = new xy1(0);
                    xy1.a(yz1, ad5.d());
                    xy1.a(yz1.x, 0.0f);
                    ArrayList arrayList2 = xy1.a;
                    float[] fArr = xy1.b;
                    int size = arrayList2.size();
                    fArr.getClass();
                    bb0.a0(size, fArr.length);
                    float[] copyOfRange = Arrays.copyOfRange(fArr, 0, size);
                    copyOfRange.getClass();
                    ll1 ll1 = new ll1(arrayList2, copyOfRange);
                    if (!Float.isNaN(ad52.d())) {
                        obj2 = ll1.a(ad52.d());
                        if (obj2 == null) {
                            obj2 = oq1.getValue();
                        }
                    } else {
                        obj2 = oq1.getValue();
                    }
                    if (!sg3.e(bdVar.b(), ll1)) {
                        bdVar.m.setValue(ll1);
                        mq4 mq4 = bdVar.f;
                        qq4 qq4 = mq4.b;
                        qq4 qq42 = mq4.b;
                        boolean g = qq4.g();
                        if (g) {
                            try {
                                ad adVar = bdVar.n;
                                float c2 = bdVar.b().c(obj2);
                                if (!Float.isNaN(c2)) {
                                    adVar.a(c2, 0.0f);
                                    ed5.setValue((Object) null);
                                }
                                bdVar.f(obj2);
                                bdVar.h.setValue(obj2);
                                qq42.k((Object) null);
                            } catch (Throwable th) {
                                qq42.k((Object) null);
                                throw th;
                            }
                        }
                        if (!g) {
                            ed5.setValue(obj2);
                        }
                    }
                }
                float d = ad5.d();
                if (z65.o((bdVar.e() - d) / (0.0f - d), 0.0f, 1.0f) != 0.0f) {
                    int size2 = arrayList.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        dh5.k(dh5, (eh5) arrayList.get(i9), 0, 0);
                    }
                }
                return vs7;
            default:
                h06 h06 = (h06) obj6;
                List list = (List) obj5;
                vr vrVar = (vr) obj4;
                a37 a37 = (a37) obj3;
                dh5 dh52 = (dh5) obj;
                Object obj7 = h06.w;
                if (obj7 != null) {
                    eh5 eh5 = (eh5) obj7;
                    if (eh5.x > 0) {
                        dh5.k(dh52, eh5, 0, 0);
                        i2 = dh52.r0(b98.d) + ((eh5) h06.w).x;
                        if (list != null) {
                            pe2 pe2 = wr.e;
                            if (!sg3.e(vrVar, pe2)) {
                                i4 -= i2;
                            }
                            int[] iArr = new int[list.size()];
                            int size3 = list.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                iArr[i10] = ((eh5) list.get(i10)).x;
                                if (i10 < list.size() - 1) {
                                    int i11 = iArr[i10];
                                    float f4 = b98.a;
                                    iArr[i10] = dh52.r0(((lx1) a37.getValue()).w) + i11;
                                }
                            }
                            int[] iArr2 = new int[list.size()];
                            vrVar.s0(dh52, i4, iArr, iArr2);
                            if (vrVar.equals(pe2)) {
                                i2 = 0;
                            }
                            int size4 = list.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                dh5.k(dh52, (eh5) list.get(i12), 0, iArr2[i12] + i2);
                            }
                        }
                        return vs7;
                    }
                }
                i2 = 0;
                if (list != null) {
                }
                return vs7;
        }
    }

    public /* synthetic */ wg1(Object obj, int i, Object obj2, aq4 aq4, o37 o37, int i2) {
        this.w = i2;
        this.y = obj;
        this.x = i;
        this.z = obj2;
        this.A = aq4;
        this.B = o37;
    }
}
