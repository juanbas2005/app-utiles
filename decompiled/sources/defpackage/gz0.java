package defpackage;

/* renamed from: gz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gz0 {
    public static final py2 a = new py2("CLOSED", 4);

    public static final Object a(ri6 ri6, long j, gs2 gs2) {
        while (true) {
            if (ri6.e >= j && !ri6.f()) {
                return ri6;
            }
            Object d = ri6.d();
            py2 py2 = a;
            if (d == py2) {
                return py2;
            }
            ri6 ri62 = (ri6) ((hz0) d);
            if (ri62 == null) {
                ri62 = (ri6) gs2.H(Long.valueOf(ri6.e + 1), ri6);
                if (ri6.i(ri62)) {
                    if (ri6.f()) {
                        ri6.h();
                    }
                }
            }
            ri6 = ri62;
        }
    }
}
