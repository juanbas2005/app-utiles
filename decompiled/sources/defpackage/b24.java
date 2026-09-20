package defpackage;

/* renamed from: b24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b24 extends ll4 implements my3 {
    public static final z14 N = new Object();
    public c24 K;
    public ji8 L;
    public z75 M;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4.M == defpackage.z75.w) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r4.M == defpackage.z75.x) goto L_0x003b;
     */
    public final boolean V0(x14 x14, int i) {
        if (i != 5 && i != 6) {
            if (i != 3 && i != 4) {
                if (!(i == 1 || i == 2)) {
                    h.s("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
            }
        }
        if (!W0(i) ? x14.a <= 0 : x14.b >= this.K.a() - 1) {
            return false;
        }
        return true;
    }

    public final boolean W0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int ordinal = rc9.O0(this).U.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 1) {
                return true;
            }
            h.c();
            return false;
        } else if (i == 4) {
            int ordinal2 = rc9.O0(this).U.ordinal();
            if (ordinal2 == 0) {
                return true;
            }
            if (ordinal2 == 1) {
                return false;
            }
            h.c();
            return false;
        } else {
            h.s("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(j);
        return oh4.d0(y.w, y.x, b42.w, new ws(y, 9));
    }
}
