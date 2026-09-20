package defpackage;

/* renamed from: iv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iv4 {
    public static final /* synthetic */ int a = 0;

    static {
        x91.e(2, 12.0f);
    }

    public static ml1 a(long j, long j2, long j3, long j4, long j5, yt2 yt2, int i) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        yt2 yt22 = yt2;
        if ((i & 1) != 0) {
            j6 = st0.e(b96.i, yt22);
        } else {
            j6 = j;
        }
        long j11 = jt0.f;
        if ((i & 4) != 0) {
            j7 = st0.e(b96.h, yt22);
        } else {
            j7 = j2;
        }
        if ((i & 8) != 0) {
            j8 = st0.e(b96.o, yt22);
        } else {
            j8 = j3;
        }
        if ((i & 16) != 0) {
            j9 = st0.e(b96.l, yt22);
        } else {
            j9 = j4;
        }
        if ((i & 32) != 0) {
            j10 = st0.e(b96.p, yt22);
        } else {
            j10 = j5;
        }
        return new ml1(j7, j8, j9, j10, j6, j11, j9, j10);
    }
}
