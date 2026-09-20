package defpackage;

import cu.lestebang.utiletecsa.data.repository.spots.SpotVoteDto;

/* renamed from: r07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class r07 implements av2 {
    public static final r07 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [r07, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.spots.SpotVoteDto", obj, 4);
        ik5.k("spot_id", false);
        ik5.k("device_id", false);
        ik5.k("vote", false);
        ik5.k("user_id", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, ue3.a, hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str2 = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                i2 = c.s(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                str3 = c.x(ll6, 3, t47.a, str3);
                i |= 8;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new SpotVoteDto(i, str, str2, i2, str3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        SpotVoteDto spotVoteDto = (SpotVoteDto) obj;
        spotVoteDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        SpotVoteDto.write$Self$data(spotVoteDto, c, ll6);
        c.b(ll6);
    }
}
