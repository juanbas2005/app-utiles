package defpackage;

/* renamed from: y51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y51 {
    public final yx6 a = new yx6();

    public static void b(y51 y51, gs2 gs2, fw0 fw0, sr2 sr2, int i) {
        if ((i & 8) != 0) {
            fw0 = null;
        }
        y51.a.add(new fw0(-1789283891, new uo2(gs2, y51, (hs2) fw0, sr2), true));
    }

    public final void a(x51 x51, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(-798501095);
        if (yt2.g(x51)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.g(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            yx6 yx6 = this.a;
            int size = yx6.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((hs2) yx6.get(i6)).u(x51, yt2, Integer.valueOf(i5 & 14));
            }
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new p13(this, x51, i, 9);
        }
    }
}
