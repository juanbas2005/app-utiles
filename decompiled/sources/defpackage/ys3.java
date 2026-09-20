package defpackage;

/* renamed from: ys3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ys3 {
    public final gy6 a;
    public zs3 b;
    public ik2 c;

    public ys3(gy6 gy6) {
        this.a = gy6;
    }

    public final zs3 a() {
        zs3 zs3 = this.b;
        if (zs3 != null) {
            return zs3;
        }
        sg3.a0("keyboardActions");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    public final boolean b(int i) {
        vr2 vr2;
        gy6 gy6;
        if (i == 7) {
            a();
        } else if (i == 2) {
            a();
        } else if (i == 6) {
            a();
        } else if (i == 5) {
            a();
        } else if (i == 3) {
            a();
        } else if (i == 4) {
            vr2 = a().a;
            if (vr2 == null) {
                vr2.y(this);
                return true;
            } else if (i == 6) {
                ik2 ik2 = this.c;
                if (ik2 != null) {
                    ((lk2) ik2).h(1, true);
                    return true;
                }
                sg3.a0("focusManager");
                throw null;
            } else if (i == 5) {
                ik2 ik22 = this.c;
                if (ik22 != null) {
                    ((lk2) ik22).h(2, true);
                    return true;
                }
                sg3.a0("focusManager");
                throw null;
            } else if (i != 7 || (gy6 = this.a) == null) {
                return false;
            } else {
                ((ip1) gy6).a();
                return true;
            }
        } else if (!(i == 1 || i == 0)) {
            h.s("invalid ImeAction");
            return false;
        }
        vr2 = null;
        if (vr2 == null) {
        }
    }
}
