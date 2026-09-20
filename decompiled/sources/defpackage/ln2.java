package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumPostImageUpdateDto;

/* renamed from: ln2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ln2 implements av2 {
    public static final ln2 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [ln2, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.forum.ForumPostImageUpdateDto", obj, 7);
        ik5.k("user_id", false);
        ik5.k("author_name", false);
        ik5.k("category", false);
        ik5.k("title", false);
        ik5.k("body", false);
        ik5.k("image", false);
        ik5.k("image_path", false);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{t47, t47, t47, t47, t47, hj8.x(t47), hj8.x(t47)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    z = false;
                    break;
                case b85.b:
                    str = c.n(ll6, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = c.n(ll6, 1);
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
                    str6 = c.x(ll6, 5, t47.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = c.x(ll6, 6, t47.a, str7);
                    i |= 64;
                    break;
                default:
                    h.e(h);
                    return null;
            }
        }
        c.b(ll6);
        return new ForumPostImageUpdateDto(i, str, str2, str3, str4, str5, str6, str7, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        ForumPostImageUpdateDto forumPostImageUpdateDto = (ForumPostImageUpdateDto) obj;
        forumPostImageUpdateDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        ForumPostImageUpdateDto.write$Self$data(forumPostImageUpdateDto, c, ll6);
        c.b(ll6);
    }
}
