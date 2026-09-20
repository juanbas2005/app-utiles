package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: ai  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ai extends ll4 implements ry0, gz1, by3 {
    public final ef3 K;
    public final boolean L;
    public final float M;
    public final ns8 N;
    public final jp1 O;
    public float P;
    public long Q = 0;
    public boolean R;
    public final lp4 S = new lp4();
    public final uj T = ed1.a(0.0f);
    public final ArrayList U = new ArrayList();
    public df3 V;
    public final uj W = ed1.a(0.0f);
    public final ed5 X = u55.p(Boolean.FALSE);
    public tz2 Y;
    public z76 Z;
    public a86 a0;

    public ai(ef3 ef3, boolean z, float f, ns8 ns8, jp1 jp1) {
        this.K = ef3;
        this.L = z;
        this.M = f;
        this.N = ns8;
        this.O = jp1;
    }

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        ar7.H(J0(), (e81) null, (r81) null, new k05((Object) this, (f61) null, 11), 3);
    }

    public final void O0() {
        z76 z76 = this.Z;
        if (z76 != null) {
            this.a0 = null;
            rc9.e0(this);
            r52 r52 = z76.z;
            a86 a86 = (a86) r52.a.get(this);
            if (a86 != null) {
                a86.c();
                LinkedHashMap linkedHashMap = r52.a;
                a86 a862 = (a86) linkedHashMap.get(this);
                if (a862 != null) {
                    ai aiVar = (ai) r52.b.remove(a862);
                }
                linkedHashMap.remove(this);
                z76.y.add(a86);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: a86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: a86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: a86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: a86} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: a86} */
    /* JADX WARNING: type inference failed for: r3v12, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void V0(go5 go5) {
        a86 a86;
        float f;
        Object obj;
        a86 a862;
        if (go5 instanceof eo5) {
            eo5 eo5 = (eo5) go5;
            long j = this.Q;
            float f2 = this.P;
            z76 z76 = this.Z;
            if (z76 == null) {
                View view = (View) h49.w(this, ye.f);
                while (!(view instanceof ViewGroup)) {
                    ? parent = view.getParent();
                    if (parent instanceof View) {
                        view = parent;
                    } else {
                        ku4.w(view, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        z76 z762 = new z76(viewGroup.getContext());
                        viewGroup.addView(z762);
                        z76 = z762;
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof z76) {
                        z76 = (z76) childAt;
                        break;
                    }
                    i++;
                }
                this.Z = z76;
            }
            ArrayList arrayList = z76.x;
            r52 r52 = z76.z;
            LinkedHashMap linkedHashMap = r52.a;
            LinkedHashMap linkedHashMap2 = r52.a;
            LinkedHashMap linkedHashMap3 = r52.b;
            a86 a863 = (a86) linkedHashMap.get(this);
            if (a863 == null) {
                ArrayList arrayList2 = z76.y;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList2.remove(0);
                }
                a863 = (a86) obj;
                if (a863 == null) {
                    if (z76.A > sg3.x(arrayList)) {
                        View view2 = new View(z76.getContext());
                        z76.addView(view2);
                        arrayList.add(view2);
                        a862 = view2;
                    } else {
                        a86 a864 = arrayList.get(z76.A);
                        ai aiVar = (ai) linkedHashMap3.get(a864);
                        a862 = a864;
                        if (aiVar != null) {
                            aiVar.a0 = null;
                            rc9.e0(aiVar);
                            a86 a865 = (a86) linkedHashMap2.get(aiVar);
                            if (a865 != null) {
                                ai aiVar2 = (ai) linkedHashMap3.remove(a865);
                            }
                            linkedHashMap2.remove(aiVar);
                            a864.c();
                            a862 = a864;
                        }
                    }
                    int i2 = z76.A;
                    if (i2 < z76.w - 1) {
                        z76.A = i2 + 1;
                        a863 = a862;
                    } else {
                        z76.A = 0;
                        a863 = a862;
                    }
                }
                linkedHashMap2.put(this, a863);
                linkedHashMap3.put(a863, this);
            }
            if (((n86) this.O.b()).a instanceof m86) {
                f = 0.1f;
            } else {
                f = 0.0f;
            }
            a86 a866 = a863;
            a866.b(eo5, this.L, j, dh4.C(f2), this.N.c(), f, new zh(0, (Object) this));
            this.a0 = a866;
            rc9.e0(this);
        } else if (go5 instanceof fo5) {
            a86 a867 = this.a0;
            if (a867 != null) {
                a867.d();
            }
        } else if ((go5 instanceof do5) && (a86 = this.a0) != null) {
            a86.d();
        }
    }

    public final void a(long j) {
        float f;
        this.R = true;
        tp1 tp1 = rc9.O0(this).T;
        this.Q = pv8.O(j);
        float f2 = this.M;
        if (Float.isNaN(f2)) {
            long j2 = this.Q;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            f = l35.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32)) / 2.0f;
            if (this.L) {
                f += tp1.e0(10.0f);
            }
        } else {
            f = tp1.e0(f2);
        }
        this.P = f;
        lp4 lp4 = this.S;
        Object[] objArr = lp4.a;
        int i = lp4.b;
        for (int i2 = 0; i2 < i; i2++) {
            V0((go5) objArr[i2]);
        }
        lp4.d();
    }

    public final void p0(wy3 wy3) {
        long j;
        float f;
        wy3.a();
        wy3 wy32 = wy3;
        tk0 tk0 = wy32.w;
        qk0 D = tk0.x.D();
        a86 a86 = this.a0;
        if (a86 != null) {
            if (((n86) this.O.b()).a instanceof m86) {
                f = 0.1f;
            } else {
                f = 0.0f;
            }
            a86.e(this.Q, dh4.C(this.P), this.N.c(), f);
            a86.draw(pd.a(D));
        }
        float floatValue = ((Number) this.T.d()).floatValue();
        if (floatValue > 0.0f) {
            long b = jt0.b(floatValue, this.N.c());
            if (this.L) {
                float intBitsToFloat = Float.intBitsToFloat((int) (tk0.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (tk0.e() & 4294967295L));
                wr0 wr0 = tk0.x;
                long L2 = wr0.L();
                wr0.D().h();
                try {
                    ((ji8) wr0.x).p(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                    j = L2;
                    try {
                        hz1.k0(wy32, b, this.P, 0, (iz1) null, 124);
                        b81.u(wr0, j);
                    } catch (Throwable th) {
                        th = th;
                        b81.u(wr0, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = L2;
                    b81.u(wr0, j);
                    throw th;
                }
            } else {
                hz1.k0(wy3, b, this.P, 0, (iz1) null, 124);
            }
        }
        if (((Number) this.W.d()).floatValue() > 0.0f) {
            tz2 tz2 = this.Y;
            if (tz2 == null) {
                tz2 = new tz2(8);
            }
            this.Y = tz2;
            this.O.b();
        }
    }
}
