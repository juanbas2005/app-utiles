package defpackage;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import java.util.ArrayList;

/* renamed from: qc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qc implements fi2 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public qc(fi2 fi2, e81 e81) {
        this.w = 5;
        this.x = e81;
        this.y = gh7.b(e81);
        this.z = new k05((Object) fi2, (f61) null, 29);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d8  */
    public final Object k(Object obj, f61 f61) {
        pc pcVar;
        int i;
        vi2 vi2;
        int i2;
        Object obj2 = obj;
        f61 f612 = f61;
        int i3 = this.w;
        boolean z2 = false;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (i3) {
            case b85.b:
                h06 h06 = (h06) obj5;
                if (f612 instanceof pc) {
                    pcVar = (pc) f612;
                    int i4 = pcVar.C;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pcVar.C = i4 - Integer.MIN_VALUE;
                        Object obj6 = pcVar.A;
                        i = pcVar.C;
                        if (i != 0) {
                            o85.q(obj6);
                            el3 el3 = (el3) h06.w;
                            if (el3 != null) {
                                el3.o(new AnchoredDragFinishedSignal());
                                pcVar.z = obj2;
                                pcVar.C = 1;
                                if (el3.j0(pcVar) == p81) {
                                    return p81;
                                }
                            }
                        } else if (i == 1) {
                            obj2 = pcVar.z;
                            o85.q(obj6);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o81 o81 = (o81) obj4;
                        h06.w = ar7.H(o81, (e81) null, r81.z, new p0((gs2) obj3, obj2, o81, (f61) null, 3), 1);
                        return vs7;
                    }
                }
                pcVar = new pc(this, f612);
                Object obj62 = pcVar.A;
                i = pcVar.C;
                if (i != 0) {
                }
                o81 o812 = (o81) obj4;
                h06.w = ar7.H(o812, (e81) null, r81.z, new p0((gs2) obj3, obj2, o812, (f61) null, 3), 1);
                return vs7;
            case 1:
                mm7 mm7 = (mm7) obj4;
                np5 np5 = (np5) obj5;
                if (((Boolean) obj2).booleanValue()) {
                    z2 = ((Boolean) ((gs2) ((aq4) obj3).getValue()).H(mm7.a.H0(), mm7.d.getValue())).booleanValue();
                }
                np5.setValue(Boolean.valueOf(z2));
                return vs7;
            case 2:
                df3 df3 = (df3) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (df3 instanceof r23) {
                    arrayList.add(df3);
                } else if (df3 instanceof s23) {
                    arrayList.remove(((s23) df3).a);
                } else if (df3 instanceof dk2) {
                    arrayList.add(df3);
                } else if (df3 instanceof ek2) {
                    arrayList.remove(((ek2) df3).a);
                } else if (df3 instanceof eo5) {
                    arrayList.add(df3);
                } else if (df3 instanceof fo5) {
                    arrayList.remove(((fo5) df3).a);
                } else if (df3 instanceof do5) {
                    arrayList.remove(((do5) df3).a);
                }
                ar7.H((o81) obj4, (e81) null, (r81) null, new ju1((vh2) obj3, (df3) dt0.H0(arrayList), (f61) null, 3), 3);
                return vs7;
            case 3:
                fi2 fi2 = (fi2) obj4;
                d06 d06 = (d06) obj5;
                if (f612 instanceof vi2) {
                    vi2 = (vi2) f612;
                    int i5 = vi2.C;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vi2.C = i5 - Integer.MIN_VALUE;
                        Object obj7 = vi2.A;
                        i2 = vi2.C;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    obj2 = vi2.z;
                                    o85.q(obj7);
                                    if (!((Boolean) obj7).booleanValue()) {
                                        d06.w = true;
                                        vi2.z = null;
                                        vi2.C = 3;
                                        if (fi2.k(obj2, vi2) == p81) {
                                            return p81;
                                        }
                                    }
                                } else if (i2 != 3) {
                                    h.s("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            o85.q(obj7);
                        } else {
                            o85.q(obj7);
                            if (d06.w) {
                                vi2.z = null;
                                vi2.C = 1;
                                if (fi2.k(obj2, vi2) == p81) {
                                    return p81;
                                }
                            } else {
                                vi2.z = obj2;
                                vi2.C = 2;
                                obj7 = ((gs2) obj3).H(obj2, vi2);
                                if (obj7 == p81) {
                                    return p81;
                                }
                                if (!((Boolean) obj7).booleanValue()) {
                                }
                            }
                        }
                        return vs7;
                    }
                }
                vi2 = new vi2(this, f612);
                Object obj72 = vi2.A;
                i2 = vi2.C;
                if (i2 == 0) {
                }
                return vs7;
            case 4:
                ((Boolean) obj2).getClass();
                pk pkVar = new pk((eg6) ((mm7) obj5).d.getValue());
                ay6 ay6 = (ay6) obj4;
                for (pk pkVar2 : dt0.b1(ay6.y)) {
                    if (!sg3.e(pkVar2, pkVar)) {
                        ay6.remove(pkVar2);
                    }
                }
                gp4 gp4 = (gp4) obj3;
                long[] jArr = gp4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj8 = gp4.b[i9];
                                    float f = gp4.c[i9];
                                    if (!sg3.e((pk) obj8, pkVar)) {
                                        gp4.e(i9);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                return vs7;
            default:
                Object V = ie1.V((e81) obj5, obj2, obj4, (k05) obj3, f612);
                if (V == p81) {
                    return V;
                }
                return vs7;
        }
    }

    public /* synthetic */ qc(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }
}
