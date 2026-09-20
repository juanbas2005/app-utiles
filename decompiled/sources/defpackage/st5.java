package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: st5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class st5 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public final Object d;

    public st5(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = ((UUID) this.b).toString();
        uuid.getClass();
        this.c = new be8(uuid, (kd8) null, cls.getName(), (String) null, (ce1) null, (ce1) null, 0, 0, 0, (j31) null, 0, (d40) null, 0, 0, 0, 0, false, (g85) null, 0, 0, 0, 0, (String) null, (Boolean) null, 33554426);
        LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(1));
        qs.k1(new String[]{cls.getName()}, linkedHashSet);
        this.d = linkedHashSet;
    }

    public xd8 a() {
        boolean z;
        String str;
        xd8 b2 = b();
        j31 j31 = ((be8) this.c).j;
        if (!j31.i.isEmpty() || j31.e || j31.c || j31.d) {
            z = true;
        } else {
            z = false;
        }
        be8 be8 = (be8) this.c;
        if (be8.q) {
            if (z) {
                h.q("Expedited jobs only support network and storage constraints");
                return null;
            } else if (be8.g > 0) {
                h.q("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str2 = be8.x;
        if (str2 == null) {
            List W0 = d57.W0(be8.c, new String[]{"."}, 6);
            if (W0.size() == 1) {
                str = (String) W0.get(0);
            } else {
                str = (String) dt0.G0(W0);
            }
            if (str.length() > 127) {
                str = d57.i1(127, str);
            }
            be8.x = str;
        } else if (str2.length() > 127) {
            ((be8) this.c).x = d57.i1(127, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        be8 be82 = (be8) this.c;
        be82.getClass();
        String str3 = be82.c;
        kd8 kd8 = be82.b;
        String str4 = be82.d;
        ce1 ce1 = new ce1(be82.e);
        ce1 ce12 = new ce1(be82.f);
        long j = be82.g;
        long j2 = be82.h;
        long j3 = be82.i;
        xd8 xd8 = b2;
        j31 j312 = new j31(be82.j);
        int i = be82.k;
        j31 j313 = j312;
        d40 d40 = be82.l;
        int i2 = i;
        long j4 = be82.m;
        long j5 = be82.n;
        long j6 = be82.o;
        long j7 = be82.p;
        d40 d402 = d40;
        boolean z2 = be82.q;
        g85 g85 = be82.r;
        int i3 = be82.s;
        long j8 = j7;
        String str5 = uuid;
        d40 d403 = d402;
        this.c = new be8(str5, kd8, str3, str4, ce1, ce12, j, j2, j3, j313, i2, d403, j4, j5, j6, j8, z2, g85, i3, be82.u, be82.v, be82.w, be82.x, be82.y, 524288);
        return xd8;
    }

    public abstract xd8 b();

    public abstract up2 c();

    public String toString() {
        switch (this.a) {
            case b85.b:
                return getClass().getSimpleName() + ": " + c();
            default:
                return super.toString();
        }
    }

    public st5(vq4 vq4, wv1 wv1, sy6 sy6) {
        this.b = vq4;
        this.c = wv1;
        this.d = sy6;
    }
}
