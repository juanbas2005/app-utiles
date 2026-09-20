package defpackage;

import android.app.Application;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;
import cu.lestebang.utiletecsa.feature.settings.service.SpeedOverlayService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: i95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i95 {
    public static final /* synthetic */ int a = 0;
    public static String b;
    public static int c;
    public static Boolean d;
    public static final /* synthetic */ int e = 0;
    public static x83 f;

    public static final String A(py6 py6) {
        py6.getClass();
        py6.j(Long.MAX_VALUE);
        return k(py6.c(), py6.c().y);
    }

    public static final Collection B(Collection collection, vr2 vr2) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = wv6.y;
        wv6 f2 = ub5.f();
        while (!linkedList.isEmpty()) {
            Object w0 = dt0.w0(linkedList);
            int i2 = wv6.y;
            wv6 f3 = ub5.f();
            ArrayList g = h95.g(w0, linkedList, vr2, new b0(27, f3));
            if (g.size() != 1 || !f3.isEmpty()) {
                Object s = h95.s(g, vr2);
                pi0 pi0 = (pi0) vr2.y(s);
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (!h95.k(pi0, (pi0) vr2.y(next))) {
                        f3.add(next);
                    }
                }
                if (!f3.isEmpty()) {
                    f2.addAll(f3);
                }
                f2.add(s);
            } else {
                Object P0 = dt0.P0(g);
                P0.getClass();
                f2.add(P0);
            }
        }
        return f2;
    }

    public static final zr3 C(z53 z53, as3 as3) {
        z53.getClass();
        as3.getClass();
        zr3 k = w95.k(z53, as3, true);
        if (k != null) {
            return k;
        }
        uq3.L(uq3.E(as3));
        throw null;
    }

    public static final zr3 D(gq3 gq3) {
        gq3.getClass();
        zr3 F = F(gq3);
        if (F != null) {
            return F;
        }
        uq3.L(gq3);
        throw null;
    }

    public static final zr3 E(z53 z53, as3 as3) {
        z53.getClass();
        as3.getClass();
        return w95.k(z53, as3, false);
    }

    public static final zr3 F(gq3 gq3) {
        gq3.getClass();
        zr3 h = ya5.h(gq3, new zr3[0]);
        if (h == null) {
            return (zr3) so5.a.get(gq3);
        }
        return h;
    }

    public static final ArrayList G(z53 z53, List list, boolean z) {
        z53.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(et0.e0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C(z53, (as3) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zr3 E = E(z53, (as3) it2.next());
            if (E == null) {
                return null;
            }
            arrayList2.add(E);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        defpackage.ed1.i(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        defpackage.ed1.i(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        throw r1;
     */
    public static final byte[] H(Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i31 i31 = (i31) it.next();
            objectOutputStream.writeUTF(i31.a.toString());
            objectOutputStream.writeBoolean(i31.b);
        }
        objectOutputStream.close();
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final int I(kd8 kd8) {
        kd8.getClass();
        int ordinal = kd8.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        h.c();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        defpackage.ed1.i(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        throw r1;
     */
    public static final ny4 J(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new ny4((NetworkRequest) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        try {
            int readInt = objectInputStream.readInt();
            int[] iArr = new int[readInt];
            for (int i = 0; i < readInt; i++) {
                iArr[i] = objectInputStream.readInt();
            }
            int readInt2 = objectInputStream.readInt();
            int[] iArr2 = new int[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                iArr2[i2] = objectInputStream.readInt();
            }
            ny4 v = pv8.v(iArr2, iArr);
            objectInputStream.close();
            byteArrayInputStream.close();
            return v;
        } catch (Throwable th) {
            ed1.i(objectInputStream, th);
            throw th;
        }
    }

    public static final void K(gl glVar, il ilVar) {
        ilVar.x.setValue(glVar.e.getValue());
        ol olVar = ilVar.y;
        ol olVar2 = glVar.f;
        int b2 = olVar.b();
        for (int i = 0; i < b2; i++) {
            olVar.e(i, olVar2.a(i));
        }
        ilVar.A = glVar.h;
        ilVar.z = glVar.g;
        ilVar.B = ((Boolean) glVar.i.getValue()).booleanValue();
    }

    public static int L(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            zb3.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = lg7.c;
        return j;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    public static final java.lang.Object b(defpackage.g97 r6, defpackage.q50 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.u76
            if (r0 == 0) goto L_0x0013
            r0 = r7
            u76 r0 = (defpackage.u76) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            u76 r0 = new u76
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 != r2) goto L_0x0027
            g97 r6 = r0.z
            defpackage.o85.q(r7)
            goto L_0x0040
        L_0x0027:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r6)
            r6 = 0
            return r6
        L_0x002e:
            defpackage.o85.q(r7)
        L_0x0031:
            r0.z = r6
            r0.B = r2
            lk5 r7 = defpackage.lk5.x
            java.lang.Object r7 = r6.c(r7, r0)
            p81 r1 = defpackage.p81.w
            if (r7 != r1) goto L_0x0040
            return r1
        L_0x0040:
            kk5 r7 = (defpackage.kk5) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L_0x0031
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L_0x0050:
            if (r4 >= r1) goto L_0x0062
            java.lang.Object r5 = r7.get(r4)
            qk5 r5 = (defpackage.qk5) r5
            boolean r5 = defpackage.ub5.a(r5)
            if (r5 != 0) goto L_0x005f
            goto L_0x0031
        L_0x005f:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x0062:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i95.b(g97, q50):java.lang.Object");
    }

    public static final Object c(float f2, float f3, float f4, hl hlVar, gs2 gs2, a97 a97) {
        lo7 lo7 = we.v;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        vr2 vr2 = lo7.a;
        ol olVar = (ol) vr2.y(f7);
        if (olVar == null) {
            olVar = ((ol) vr2.y(f5)).c();
        }
        ol olVar2 = olVar;
        Object d2 = d(new il(lo7, f5, olVar2, 56), new ub7(hlVar, lo7, f5, f6, olVar2), Long.MIN_VALUE, new lo6(3, gs2), a97);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (d2 != p81) {
            d2 = vs7;
        }
        if (d2 == p81) {
            return d2;
        }
        return vs7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: v87} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: h61} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: v87} */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, h06] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        if (r1 == r14) goto L_0x0184;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0120 A[Catch:{ CancellationException -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    public static final Object d(il ilVar, zk zkVar, long j, vr2 vr2, h61 h61) {
        v87 v87;
        int i;
        il ilVar2;
        h06 h06;
        gl glVar;
        h06 h062;
        vr2 vr22;
        Object obj;
        vr2 vr23;
        h06 h063;
        zk zkVar2;
        il ilVar3;
        pa0 pa0;
        Object obj2;
        h06 h064;
        il ilVar4;
        il ilVar5;
        Object obj3;
        zk zkVar3 = zkVar;
        h61 h612 = h61;
        me6 me6 = me6.D;
        if (h612 instanceof v87) {
            v87 v872 = (v87) h612;
            int i2 = v872.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v872.E = i2 - Integer.MIN_VALUE;
                v87 = v872;
                v87 v873 = v87;
                e81 e81 = v873.x;
                Object obj4 = v873.D;
                i = v873.E;
                Object obj5 = p81.w;
                if (i == 0) {
                    if (i == 1) {
                        h06 = v873.C;
                        vr22 = v873.B;
                        zkVar3 = v873.A;
                        ilVar2 = v873.z;
                    } else if (i == 2) {
                        h06 = v873.C;
                        vr22 = v873.B;
                        zkVar3 = v873.A;
                        ilVar2 = v873.z;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        o85.q(obj4);
                    } catch (CancellationException e2) {
                        e = e2;
                    }
                } else {
                    o85.q(obj4);
                    Object f2 = zkVar3.f(0);
                    ol d2 = zkVar3.d(0);
                    ? obj6 = new Object();
                    if (j == Long.MIN_VALUE) {
                        try {
                            e81.getClass();
                            ilVar5 = ilVar;
                            try {
                                t87 t87 = new t87(obj6, f2, zkVar3, d2, ilVar5, p(e81), vr2);
                                h064 = obj6;
                                try {
                                    v873.z = ilVar5;
                                    v873.A = zkVar3;
                                    vr2 vr24 = vr2;
                                    v873.B = vr24;
                                    v873.C = h064;
                                    v873.E = 1;
                                    if (!zkVar3.a()) {
                                        obj3 = pd8.s(v873.r()).a(new vz1(6, t87), v873);
                                    } else if (v873.r().a0(me6) == null) {
                                        obj3 = pd8.s(v873.r()).a(t87, v873);
                                    } else {
                                        throw new ClassCastException();
                                    }
                                    if (obj3 != obj5) {
                                        ilVar2 = ilVar5;
                                        vr22 = vr24;
                                        h06 = h064;
                                    }
                                    return obj5;
                                } catch (CancellationException e3) {
                                    e = e3;
                                    ilVar4 = ilVar5;
                                    h06 = h064;
                                    glVar = (gl) h06.w;
                                    if (glVar != null) {
                                    }
                                    gl glVar2 = (gl) h06.w;
                                    ilVar2.B = false;
                                    throw e;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                h064 = obj6;
                                ilVar4 = ilVar5;
                                h06 = h064;
                                glVar = (gl) h06.w;
                                if (glVar != null) {
                                }
                                gl glVar22 = (gl) h06.w;
                                ilVar2.B = false;
                                throw e;
                            }
                        } catch (CancellationException e5) {
                            e = e5;
                            ilVar5 = ilVar;
                            h064 = obj6;
                            ilVar4 = ilVar5;
                            h06 = h064;
                            glVar = (gl) h06.w;
                            if (glVar != null) {
                                glVar.i.setValue(Boolean.FALSE);
                            }
                            gl glVar222 = (gl) h06.w;
                            if (glVar222 != null && glVar222.g == ilVar2.z) {
                                ilVar2.B = false;
                            }
                            throw e;
                        }
                    } else {
                        il ilVar6 = ilVar;
                        vr2 vr25 = vr2;
                        h064 = obj6;
                        try {
                            gl glVar3 = new gl(f2, zkVar3.c(), d2, j, zkVar3.g(), j, new u87(0, ilVar6));
                            e81.getClass();
                            zk zkVar4 = zkVar3;
                            float p = p(e81);
                            gl glVar4 = glVar3;
                            m(glVar4, j, p, zkVar4, ilVar6, vr25);
                            h064.w = glVar4;
                            ilVar2 = ilVar;
                            zkVar3 = zkVar;
                            vr22 = vr2;
                            h062 = h064;
                            obj = h062.w;
                            obj.getClass();
                            if (((Boolean) ((gl) obj).i.getValue()).booleanValue()) {
                                try {
                                    e81 e812 = v873.x;
                                    e812.getClass();
                                    pa0 = new pa0(h063, p(e812), zkVar2, ilVar3, vr23);
                                    pa0 pa02 = pa0;
                                    h06 = h063;
                                    zkVar3 = zkVar2;
                                    ilVar2 = ilVar3;
                                    vr22 = vr23;
                                    v873.z = ilVar2;
                                    v873.A = zkVar3;
                                    v873.B = vr22;
                                    v873.C = h06;
                                    v873.E = 2;
                                    if (!zkVar3.a()) {
                                        obj2 = pd8.s(v873.r()).a(new vz1(6, pa02), v873);
                                    } else {
                                        if (v873.r().a0(me6) == null) {
                                            obj2 = pd8.s(v873.r()).a(pa02, v873);
                                        }
                                        throw new ClassCastException();
                                    }
                                } catch (CancellationException e6) {
                                    e = e6;
                                    h06 = h063;
                                    ilVar2 = ilVar3;
                                    glVar = (gl) h06.w;
                                    if (glVar != null) {
                                    }
                                    gl glVar2222 = (gl) h06.w;
                                    ilVar2.B = false;
                                    throw e;
                                }
                                vr23 = vr22;
                                h063 = h062;
                                zkVar2 = zkVar3;
                                ilVar3 = ilVar2;
                            }
                            return vs7.a;
                        } catch (CancellationException e7) {
                            e = e7;
                            ilVar4 = ilVar;
                            h06 = h064;
                            glVar = (gl) h06.w;
                            if (glVar != null) {
                            }
                            gl glVar22222 = (gl) h06.w;
                            ilVar2.B = false;
                            throw e;
                        }
                    }
                }
                h062 = h06;
                obj = h062.w;
                obj.getClass();
                if (((Boolean) ((gl) obj).i.getValue()).booleanValue()) {
                }
                return vs7.a;
            }
        }
        v87 = new h61(h612);
        v87 v8732 = v87;
        e81 e813 = v8732.x;
        Object obj42 = v8732.D;
        i = v8732.E;
        Object obj52 = p81.w;
        if (i == 0) {
        }
        h062 = h06;
        try {
            obj = h062.w;
            obj.getClass();
            if (((Boolean) ((gl) obj).i.getValue()).booleanValue()) {
            }
            return vs7.a;
        } catch (CancellationException e8) {
            e = e8;
            h06 = h062;
            glVar = (gl) h06.w;
            if (glVar != null) {
            }
            gl glVar222222 = (gl) h06.w;
            ilVar2.B = false;
            throw e;
        }
    }

    public static /* synthetic */ Object e(float f2, float f3, hl hlVar, gs2 gs2, a97 a97, int i) {
        if ((i & 8) != 0) {
            hlVar = kl8.M(0.0f, 0.0f, (Object) null, 7);
        }
        return c(f2, f3, 0.0f, hlVar, gs2, a97);
    }

    public static final Object f(il ilVar, tj1 tj1, boolean z, vr2 vr2, h61 h61) {
        long j;
        sj1 sj1 = new sj1(tj1, ilVar.w, ilVar.x.getValue(), ilVar.y);
        if (z) {
            j = ilVar.z;
        } else {
            j = Long.MIN_VALUE;
        }
        Object d2 = d(ilVar, sj1, j, vr2, h61);
        if (d2 == p81.w) {
            return d2;
        }
        return vs7.a;
    }

    public static final Object g(il ilVar, Float f2, hl hlVar, boolean z, vr2 vr2, h61 h61) {
        long j;
        hl hlVar2 = hlVar;
        ub7 ub7 = new ub7(hlVar2, ilVar.w, ilVar.x.getValue(), f2, ilVar.y);
        if (z) {
            j = ilVar.z;
        } else {
            j = Long.MIN_VALUE;
        }
        Object d2 = d(ilVar, ub7, j, vr2, h61);
        if (d2 == p81.w) {
            return d2;
        }
        return vs7.a;
    }

    public static /* synthetic */ Object h(il ilVar, Float f2, x17 x17, boolean z, vr2 vr2, h61 h61, int i) {
        if ((i & 2) != 0) {
            x17 = kl8.M(0.0f, 0.0f, (Object) null, 7);
        }
        x17 x172 = x17;
        if ((i & 8) != 0) {
            vr2 = new nf6(28);
        }
        return g(ilVar, f2, x172, z, vr2, h61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        defpackage.ed1.i(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        throw r3;
     */
    public static final LinkedHashSet i(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            int readInt = objectInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                parse.getClass();
                linkedHashSet.add(new i31(readBoolean, parse));
            }
            objectInputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        byteArrayInputStream.close();
        return linkedHashSet;
        try {
        } catch (Throwable th) {
            ed1.i(byteArrayInputStream, r7);
            throw th;
        }
    }

    public static final long j(long j, int i) {
        int i2;
        int i3 = lg7.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return a(i2, i);
    }

    public static final String k(tc0 tc0, long j) {
        if (j == 0) {
            return "";
        }
        pi6 pi6 = tc0.w;
        if (pi6 == null) {
            h.s("Unreacheable");
            return null;
        } else if (((long) pi6.a()) >= j) {
            byte[] bArr = pi6.a;
            int i = pi6.b;
            String e2 = wn6.e(bArr, i, Math.min(pi6.c, ((int) j) + i));
            tc0.skip(j);
            return e2;
        } else {
            byte[] i2 = i75.i(tc0, (int) j);
            return wn6.e(i2, 0, i2.length);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ji4} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static ji4 l(String str, Collection collection) {
        ji4 ji4;
        collection.getClass();
        Iterable<vw3> iterable = collection;
        ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
        for (vw3 R : iterable) {
            arrayList.add(R.R());
        }
        vv6 y = jb5.y(arrayList);
        int i = y.w;
        if (i == 0) {
            ji4 = ii4.b;
        } else if (i != 1) {
            ji4 = new vm0(str, (ji4[]) y.toArray(new ji4[0]));
        } else {
            ji4 = y.get(0);
        }
        if (y.w <= 1) {
            return ji4;
        }
        return new y34(ji4);
    }

    public static final void m(gl glVar, long j, float f2, zk zkVar, il ilVar, vr2 vr2) {
        long j2;
        if (f2 == 0.0f) {
            j2 = zkVar.b();
        } else {
            j2 = (long) (((float) (j - glVar.c)) / f2);
        }
        glVar.g = j;
        glVar.e.setValue(zkVar.f(j2));
        glVar.f = zkVar.d(j2);
        if (zkVar.e(j2)) {
            glVar.h = glVar.g;
            glVar.i.setValue(Boolean.FALSE);
        }
        K(glVar, ilVar);
        vr2.y(glVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        defpackage.ed1.i(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00be, code lost:
        throw r0;
     */
    public static final byte[] n(ny4 ny4) {
        int[] iArr;
        int[] iArr2;
        ny4.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) ny4.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        if (i >= 31) {
            try {
                iArr = networkRequest.getTransportTypes();
                iArr.getClass();
            } catch (Throwable th) {
                ed1.i(objectOutputStream, th);
                throw th;
            }
        } else {
            int[] iArr3 = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 10; i2++) {
                int i3 = iArr3[i2];
                if (networkRequest.hasTransport(i3)) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            iArr = dt0.a1(arrayList);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            iArr2 = networkRequest.getCapabilities();
            iArr2.getClass();
        } else {
            int[] iArr4 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < 30; i4++) {
                int i5 = iArr4[i4];
                if (networkRequest.hasCapability(i5)) {
                    arrayList2.add(Integer.valueOf(i5));
                }
            }
            iArr2 = dt0.a1(arrayList2);
        }
        objectOutputStream.writeInt(iArr.length);
        for (int writeInt : iArr) {
            objectOutputStream.writeInt(writeInt);
        }
        objectOutputStream.writeInt(iArr2.length);
        for (int writeInt2 : iArr2) {
            objectOutputStream.writeInt(writeInt2);
        }
        objectOutputStream.close();
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final t54 o(View view) {
        t54 t54;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof t54) {
                t54 = (t54) tag;
            } else {
                t54 = null;
            }
            if (t54 != null) {
                return t54;
            }
            ViewParent k = z85.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final float p(e81 e81) {
        float f2;
        lm4 lm4 = (lm4) e81.a0(xb4.U);
        if (lm4 != null) {
            f2 = lm4.M();
        } else {
            f2 = 1.0f;
        }
        if (f2 >= 0.0f) {
            return f2;
        }
        xm5.b("negative scale factor");
        return f2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r2 != null) goto L_0x005b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[SYNTHETIC, Splitter:B:28:0x006b] */
    public static String q() {
        BufferedReader bufferedReader;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (b == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                b = Application.getProcessName();
            } else {
                int i = c;
                if (i == 0) {
                    i = Process.myPid();
                    c = i;
                }
                ? r3 = 0;
                if (i > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                        sb.append("/proc/");
                        sb.append(i);
                        sb.append("/cmdline");
                        String sb2 = sb.toString();
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        try {
                            String readLine = bufferedReader.readLine();
                            z65.k(readLine);
                            r3 = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            r3 = bufferedReader;
                            if (r3 != 0) {
                            }
                            throw th;
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        r3 = r3;
                    } catch (IOException unused4) {
                        r3 = r3;
                    }
                }
                b = r3;
            }
        }
        return b;
    }

    public static final x83 r() {
        x83 x83 = f;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.SignalCellularAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 e2 = pb4.e(18.5f, 4.0f);
        e2.e(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        e2.n(13.0f);
        e2.e(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        e2.l(-1.5f, -0.67f, -1.5f, -1.5f);
        e2.n(-13.0f);
        e2.e(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        e2.c();
        e2.j(6.5f, 14.0f);
        e2.e(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        e2.n(3.0f);
        e2.e(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        e2.k(5.0f, 19.33f, 5.0f, 18.5f);
        e2.n(-3.0f);
        e2.e(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        e2.c();
        e2.j(12.5f, 9.0f);
        e2.e(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        e2.n(8.0f);
        e2.e(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        e2.l(-1.5f, -0.67f, -1.5f, -1.5f);
        e2.n(-8.0f);
        e2.e(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        e2.c();
        w83.a(w83, e2.a, ky6, 14336);
        x83 b2 = w83.b();
        f = b2;
        return b2;
    }

    public static final d40 s(int i) {
        if (i == 0) {
            return d40.w;
        }
        if (i == 1) {
            return d40.x;
        }
        h.q(pb4.i(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final yy4 t(int i) {
        if (i == 0) {
            return yy4.w;
        }
        if (i == 1) {
            return yy4.x;
        }
        if (i == 2) {
            return yy4.y;
        }
        if (i == 3) {
            return yy4.z;
        }
        if (i == 4) {
            return yy4.A;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return yy4.B;
        }
        h.q(pb4.i(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final g85 u(int i) {
        if (i == 0) {
            return g85.w;
        }
        if (i == 1) {
            return g85.x;
        }
        h.q(pb4.i(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final kd8 v(int i) {
        if (i == 0) {
            return kd8.w;
        }
        if (i == 1) {
            return kd8.x;
        }
        if (i == 2) {
            return kd8.y;
        }
        if (i == 3) {
            return kd8.z;
        }
        if (i == 4) {
            return kd8.A;
        }
        if (i == 5) {
            return kd8.B;
        }
        h.q(pb4.i(i, "Could not convert ", " to State"));
        return null;
    }

    public static d37 w() {
        return SpeedOverlayService.K;
    }

    public static final void x(String str) {
        str.getClass();
        throw new IllegalArgumentException(f21.h("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final int y(yy4 yy4) {
        yy4.getClass();
        int ordinal = yy4.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && yy4 == yy4.B) {
                            return 5;
                        }
                        rf2.q(yy4, " to int", "Could not convert ");
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0193 A[RETURN] */
    public static final zr3 z(gq3 gq3, ArrayList arrayList, sr2 sr2) {
        zr3 zr3;
        zr3 j06;
        gq3.getClass();
        c26 c26 = b26.a;
        if (!gq3.equals(c26.b(Collection.class))) {
            Class<List> cls = List.class;
            if (!gq3.equals(c26.b(cls)) && !gq3.equals(c26.b(cls)) && !gq3.equals(c26.b(ArrayList.class))) {
                if (gq3.equals(c26.b(HashSet.class))) {
                    zr3 = new cs((zr3) arrayList.get(0), 1);
                } else {
                    Class<Set> cls2 = Set.class;
                    if (gq3.equals(c26.b(cls2)) || gq3.equals(c26.b(cls2)) || gq3.equals(c26.b(LinkedHashSet.class))) {
                        zr3 = new cs((zr3) arrayList.get(0), 2);
                    } else if (gq3.equals(c26.b(HashMap.class))) {
                        zr3 = new ty2((zr3) arrayList.get(0), (zr3) arrayList.get(1), 0);
                    } else {
                        Class<Map> cls3 = Map.class;
                        if (gq3.equals(c26.b(cls3)) || gq3.equals(c26.b(cls3)) || gq3.equals(c26.b(LinkedHashMap.class))) {
                            zr3 = new ty2((zr3) arrayList.get(0), (zr3) arrayList.get(1), 1);
                        } else {
                            if (gq3.equals(c26.b(Map.Entry.class))) {
                                zr3 zr32 = (zr3) arrayList.get(0);
                                zr3 zr33 = (zr3) arrayList.get(1);
                                zr32.getClass();
                                zr33.getClass();
                                j06 = new hf4(zr32, zr33, 0);
                            } else if (gq3.equals(c26.b(yb5.class))) {
                                zr3 zr34 = (zr3) arrayList.get(0);
                                zr3 zr35 = (zr3) arrayList.get(1);
                                zr34.getClass();
                                zr35.getClass();
                                j06 = new hf4(zr34, zr35, 1);
                            } else if (gq3.equals(c26.b(eo7.class))) {
                                zr3 zr36 = (zr3) arrayList.get(0);
                                zr3 zr37 = (zr3) arrayList.get(1);
                                zr3 zr38 = (zr3) arrayList.get(2);
                                zr36.getClass();
                                zr37.getClass();
                                zr38.getClass();
                                zr3 = new e61(zr36, zr37, zr38);
                            } else if (kl8.u(gq3).isArray()) {
                                Object b2 = sr2.b();
                                b2.getClass();
                                zr3 zr39 = (zr3) arrayList.get(0);
                                zr39.getClass();
                                j06 = new j06((gq3) b2, zr39);
                            } else {
                                zr3 = null;
                            }
                            zr3 = j06;
                        }
                    }
                }
                if (zr3 == null) {
                    return zr3;
                }
                zr3[] zr3Arr = (zr3[]) arrayList.toArray(new zr3[0]);
                return ya5.h(gq3, (zr3[]) Arrays.copyOf(zr3Arr, zr3Arr.length));
            }
        }
        zr3 = new cs((zr3) arrayList.get(0), 0);
        if (zr3 == null) {
        }
    }
}
