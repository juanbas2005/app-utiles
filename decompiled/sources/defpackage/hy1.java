package defpackage;

import java.util.List;

/* renamed from: hy1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hy1 extends l66 implements gs2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ d06 C;
    public final /* synthetic */ h06 D;
    public final /* synthetic */ h06 E;
    public kk5 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hy1(d06 d06, h06 h06, h06 h062, f61 f61) {
        super(2, f61);
        this.C = d06;
        this.D = h06;
        this.E = h062;
    }

    public final Object H(Object obj, Object obj2) {
        return ((hy1) o((f61) obj2, (g97) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        hy1 hy1 = new hy1(this.C, this.D, this.E, f61);
        hy1.B = obj;
        return hy1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        if (r8 == r6) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ce A[EDGE_INSN: B:68:0x00ce->B:40:0x00ce ?: BREAK  , SYNTHETIC] */
    public final Object s(Object obj) {
        g97 g97;
        kk5 kk5;
        Object obj2;
        int i;
        int i2;
        int size;
        int i3;
        boolean g;
        g97 g972;
        Object obj3;
        Object obj4;
        Object obj5;
        int i4 = this.A;
        kk5 kk52 = null;
        int i5 = 2;
        int i6 = 1;
        p81 p81 = p81.w;
        if (i4 == 0) {
            o85.q(obj);
            g972 = (g97) this.B;
            i2 = 0;
        } else if (i4 == 1) {
            i2 = this.z;
            g972 = (g97) this.B;
            o85.q(obj);
            obj5 = obj;
            kk5 kk53 = (kk5) obj5;
            List list = kk53.a;
            int size2 = list.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    i2 = i6;
                    break;
                }
                if (!ub5.d((qk5) list.get(i7))) {
                    break;
                }
                i7++;
            }
            List list2 = kk53.a;
            int size3 = list2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                qk5 qk5 = (qk5) list2.get(i8);
                if (qk5.c() || ub5.n(qk5, g972.B.T, g972.d())) {
                    i2 = 1;
                } else {
                    i8++;
                }
                break;
            }
            i2 = 1;
            if (kk53.c == i5) {
                i = 1;
                this.C.w = true;
                i2 = 1;
            } else {
                i = 1;
            }
            this.B = g972;
            this.y = kk53;
            this.z = i2;
            this.A = i5;
            obj2 = g972.c(lk5.y, this);
            if (obj2 != p81) {
                kk5 kk54 = kk53;
                g97 = g972;
                kk5 = kk54;
                List list3 = ((kk5) obj2).a;
                size = list3.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                    }
                    i3++;
                }
                h06 h06 = this.D;
                g = my1.g(kk5, ((qk5) h06.w).a);
                List list4 = kk5.a;
                h06 h062 = this.E;
                if (!g) {
                }
                g972 = g97;
                kk52 = null;
                i5 = 2;
                i6 = 1;
            }
            return p81;
        } else if (i4 == 2) {
            i2 = this.z;
            kk5 = this.y;
            g97 = (g97) this.B;
            o85.q(obj);
            i = 1;
            obj2 = obj;
            List list32 = ((kk5) obj2).a;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((qk5) list32.get(i3)).c()) {
                    i2 = i;
                    break;
                }
                i3++;
            }
            h06 h063 = this.D;
            g = my1.g(kk5, ((qk5) h063.w).a);
            List list42 = kk5.a;
            h06 h0622 = this.E;
            if (!g) {
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj4 = kk52;
                        break;
                    }
                    obj4 = list42.get(i9);
                    if (((qk5) obj4).d) {
                        break;
                    }
                    i9++;
                }
                qk5 qk52 = (qk5) obj4;
                if (qk52 != null) {
                    h063.w = qk52;
                    h0622.w = qk52;
                }
                i2 = i;
                i6 = i2;
                g972 = g97;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list42.get(i10);
                    if (a35.i(((qk5) obj3).a, ((qk5) h063.w).a)) {
                        break;
                    }
                    i10++;
                }
                h0622.w = obj3;
            }
            g972 = g97;
            kk52 = null;
            i5 = 2;
            i6 = 1;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (i2 == 0) {
            this.B = g972;
            this.y = kk52;
            this.z = i2;
            this.A = i6;
            obj5 = g972.c(lk5.x, this);
        }
        return vs7.a;
    }
}
