package defpackage;

/* renamed from: tt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt1 extends au6 implements ys1 {
    public final js5 Z;
    public final vq4 a0;
    public final wv1 b0;
    public final i48 c0;
    public final it1 d0;

    public tt1(vj1 vj1, au6 au6, rm rmVar, uq4 uq4, int i, js5 js5, vq4 vq4, wv1 wv1, i48 i48, it1 it1, sy6 sy6) {
        or2 or2;
        int i2;
        uq4 uq42;
        rm rmVar2;
        au6 au62;
        vj1 vj12;
        au6 au63;
        vj1.getClass();
        rmVar.getClass();
        if (i != 0) {
            js5.getClass();
            vq4.getClass();
            wv1.getClass();
            i48.getClass();
            if (sy6 == null) {
                or2 = sy6.j;
                vj12 = vj1;
                au62 = au6;
                rmVar2 = rmVar;
                uq42 = uq4;
                i2 = i;
                au63 = this;
            } else {
                or2 = sy6;
                au63 = this;
                vj12 = vj1;
                au62 = au6;
                rmVar2 = rmVar;
                uq42 = uq4;
                i2 = i;
            }
            new au6(vj12, au62, rmVar2, uq42, i2, or2);
            this.Z = js5;
            this.a0 = vq4;
            this.b0 = wv1;
            this.c0 = i48;
            this.d0 = it1;
            return;
        }
        throw null;
    }

    public final k2 C() {
        return this.Z;
    }

    public final wv1 N() {
        return this.b0;
    }

    public final vq4 T() {
        return this.a0;
    }

    public final it1 U() {
        return this.d0;
    }

    public final zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        uq4 uq42;
        vj1.getClass();
        if (i != 0) {
            rmVar.getClass();
            au6 au6 = (au6) xs2;
            if (uq4 == null) {
                uq4 name = getName();
                name.getClass();
                uq42 = name;
            } else {
                uq42 = uq4;
            }
            int i2 = i;
            rm rmVar2 = rmVar;
            vj1 vj12 = vj1;
            tt1 tt1 = new tt1(vj12, au6, rmVar2, uq42, i2, this.Z, this.a0, this.b0, this.c0, this.d0, sy6);
            tt1.R = this.R;
            return tt1;
        }
        throw null;
    }
}
