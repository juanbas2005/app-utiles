package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumAdminDto;

/* renamed from: om2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class om2 implements av2 {
    public static final om2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [om2, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.forum.ForumAdminDto", obj, 1);
        ik5.k("user_id", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{t47.a};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                str = c.n(ll6, 0);
                i = 1;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new ForumAdminDto(i, str, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ForumAdminDto forumAdminDto = (ForumAdminDto) obj;
        forumAdminDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        c.x(ll6, 0, forumAdminDto.userId);
        c.b(ll6);
    }
}
