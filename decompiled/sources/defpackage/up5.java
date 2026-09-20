package defpackage;

import cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto;

/* renamed from: up5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class up5 implements av2 {
    public static final up5 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, up5, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.profile.ProfileRowDto", obj, 3);
        ik5.k("user_id", false);
        ik5.k("invitation_code", true);
        ik5.k("registered_with_code", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, hj8.x(t47), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
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
                str2 = c.x(ll6, 1, t47.a, str2);
                i |= 2;
            } else if (h == 2) {
                str3 = c.x(ll6, 2, t47.a, str3);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new ProfileRowDto(i, str, str2, str3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ProfileRowDto profileRowDto = (ProfileRowDto) obj;
        profileRowDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ProfileRowDto.write$Self$data(profileRowDto, c, ll6);
        c.b(ll6);
    }
}
