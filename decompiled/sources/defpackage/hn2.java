package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumPostFeedDto;

/* renamed from: hn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hn2 implements av2 {
    public static final hn2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, av2, hn2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.forum.ForumPostFeedDto", obj, 12);
        ik5.k("id", false);
        ik5.k("user_id", true);
        ik5.k("author_name", true);
        ik5.k("category", false);
        ik5.k("title", false);
        ik5.k("body", false);
        ik5.k("has_image", true);
        ik5.k("image_path", true);
        ik5.k("created_at", false);
        ik5.k("likes", true);
        ik5.k("dislikes", true);
        ik5.k("comment_count", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        zr3 x = hj8.x(t47);
        zr3 x2 = hj8.x(t47);
        tc4 tc4 = tc4.a;
        return new zr3[]{t47, x, t47, t47, t47, t47, ja0.a, x2, t47, tc4, tc4, tc4};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        Object obj = null;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z2 = true;
        String str8 = null;
        while (z2) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z2 = false;
                    continue;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.x(ll6, 1, t47.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = c.n(ll6, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = c.n(ll6, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = c.n(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = c.n(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    z = c.z(ll6, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) c.x(ll6, 7, t47.a, str8);
                    i |= 128;
                    break;
                case 8:
                    str7 = c.n(ll6, 8);
                    i |= 256;
                    continue;
                case 9:
                    j = c.D(ll6, 9);
                    i |= 512;
                    continue;
                case 10:
                    j2 = c.D(ll6, 10);
                    i |= 1024;
                    continue;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    j3 = c.D(ll6, 11);
                    i |= 2048;
                    continue;
                default:
                    h.e(h);
                    return obj;
            }
            obj = null;
        }
        c.b(ll6);
        return new ForumPostFeedDto(i, str, str2, str3, str4, str5, str6, z, str8, str7, j, j2, j3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ForumPostFeedDto forumPostFeedDto = (ForumPostFeedDto) obj;
        forumPostFeedDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ForumPostFeedDto.write$Self$data(forumPostFeedDto, c, ll6);
        c.b(ll6);
    }
}
