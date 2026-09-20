package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: m03  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m03 extends a97 implements gs2 {
    public n03 A;
    public Iterator B;
    public int C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ n03 H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m03(n03 n03, f61 f61) {
        super(2, f61);
        this.H = n03;
    }

    public final Object H(Object obj, Object obj2) {
        return ((m03) o((f61) obj2, (fi2) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        m03 m03 = new m03(this.H, f61);
        m03.G = obj;
        return m03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r2 == r9) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
        if (r2 == r9) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef  */
    public final Object s(Object obj) {
        n03 n03;
        Iterator it;
        int i;
        int i2;
        int i3;
        u97 u97;
        int i4;
        int i5;
        Iterator it2;
        boolean hasNext;
        Object obj2;
        Object obj3;
        fi2 fi2 = (fi2) this.G;
        int i6 = this.F;
        n03 n032 = this.H;
        p81 p81 = p81.w;
        if (i6 == 0) {
            o85.q(obj);
            dv7 dv7 = n032.b;
            this.G = fi2;
            this.F = 1;
            dy7 dy7 = (dy7) dv7;
            obj3 = ar7.e0(dy7.b, new gv7(dy7, (f61) null, 2), this);
        } else if (i6 == 1) {
            o85.q(obj);
            obj3 = obj;
        } else if (i6 == 2) {
            o85.q(obj);
            obj2 = obj;
            List list = (List) obj2;
            i5 = list.size();
            i4 = 0;
            yh7.a.getClass();
            hr2.m(new Object[0]);
            it2 = list.iterator();
            hasNext = it2.hasNext();
            Object obj4 = vs7.a;
            if (hasNext) {
            }
            return obj4;
        } else if (i6 == 3) {
            i3 = this.E;
            i2 = this.D;
            i = this.C;
            it = this.B;
            n03 = this.A;
            o85.q(obj);
            u97 = new u97(i, i3 + 1);
            this.G = fi2;
            this.A = n03;
            this.B = it;
            this.C = i;
            this.D = i2;
            this.E = i3;
            this.F = 4;
            if (fi2.k(u97, this) != p81) {
            }
            return p81;
        } else if (i6 == 4) {
            int i7 = this.D;
            i5 = this.C;
            Iterator it3 = this.B;
            n03 n033 = this.A;
            o85.q(obj);
            i4 = i7;
            it2 = it3;
            n032 = n033;
            hasNext = it2.hasNext();
            Object obj42 = vs7.a;
            if (hasNext) {
                Object next = it2.next();
                int i8 = i4 + 1;
                if (i4 >= 0) {
                    p94 p94 = n032.a;
                    String str = ((al3) next).a;
                    this.G = fi2;
                    this.A = n032;
                    this.B = it2;
                    this.C = i5;
                    this.D = i8;
                    this.E = i4;
                    this.F = 3;
                    Object e0 = ar7.e0(p94.b, new o94(p94, str, System.currentTimeMillis(), (f61) null), this);
                    if (e0 == p81) {
                        obj42 = e0;
                    }
                    if (obj42 != p81) {
                        it = it2;
                        i3 = i4;
                        n03 = n032;
                        i = i5;
                        i2 = i8;
                        u97 = new u97(i, i3 + 1);
                        this.G = fi2;
                        this.A = n03;
                        this.B = it;
                        this.C = i;
                        this.D = i2;
                        this.E = i3;
                        this.F = 4;
                        if (fi2.k(u97, this) != p81) {
                            n03 n034 = n03;
                            i4 = i2;
                            i5 = i;
                            n032 = n034;
                            it2 = it;
                            hasNext = it2.hasNext();
                            Object obj422 = vs7.a;
                            if (hasNext) {
                                return obj422;
                            }
                        }
                    }
                    return p81;
                }
                sg3.Z();
                throw null;
            }
            return obj422;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p94 p942 = n032.a;
        this.G = fi2;
        this.F = 2;
        obj2 = ar7.e0(p942.b, new ju1(p942, (String) obj3, (f61) null, 19), this);
    }
}
