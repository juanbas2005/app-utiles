package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumPostContentDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumPostImageUpdateDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonElement;

/* renamed from: go2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class go2 extends a97 implements gs2 {
    public lo2 A;
    public Object B;
    public String C;
    public String D;
    public String E;
    public Serializable F;
    public Object G;
    public String H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ lo2 K;
    public final /* synthetic */ ez4 L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go2(lo2 lo2, ez4 ez4, String str, String str2, f61 f61) {
        super(2, f61);
        this.K = lo2;
        this.L = ez4;
        this.M = str;
        this.N = str2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((go2) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        go2 go2 = new go2(this.K, this.L, this.M, this.N, f61);
        go2.J = obj;
        return go2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.String} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x028f, code lost:
        if (defpackage.lo2.b(r3, r9, r1) == r13) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02bb, code lost:
        if (defpackage.lo2.b(r3, r2, r1) == r13) goto L_0x02bd;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x02be */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x026f A[SYNTHETIC, Splitter:B:66:0x026f] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a1  */
    public final Object s(Object obj) {
        Object obj2;
        lo2 lo2;
        String str;
        String str2;
        String str3;
        Object obj3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ez4 ez4;
        lo2 lo22;
        UserInfo userInfo;
        String str10;
        String str11;
        UserInfo userInfo2;
        String str12;
        Object obj4;
        o81 o81 = (o81) this.J;
        int i = this.I;
        xd2 xd2 = xd2.EQ;
        Object obj5 = p81.w;
        if (i == 0) {
            o85.q(obj);
            lo22 = this.K;
            j77 j77 = lo22.a;
            ez4 = this.L;
            userInfo = rg3.t(j77).j();
            if (userInfo != null) {
                String str13 = ez4.a;
                String str14 = ez4.b;
                if (d57.I0(str13)) {
                    throw new IllegalStateException("El título no puede estar vacío");
                } else if (!d57.I0(str14)) {
                    String c = lo2.c(lo22, userInfo);
                    String i1 = d57.i1(50, d57.k1(ez4.a).toString());
                    String i12 = d57.i1(200, d57.k1(str14).toString());
                    boolean z = ez4.e;
                    str9 = this.N;
                    if (!z) {
                        hm5 i2 = f55.i(j77, "forum_posts");
                        gm5 gm5 = i2.a;
                        t77 t77 = gm5.d;
                        ol3 ol3 = pl3.d;
                        f96 f96 = (f96) t77;
                        String t = f96.t(b26.b(ForumPostContentDto.class), new ForumPostContentDto(userInfo.getId(), c, ez4.c, i1, i12));
                        ol3.getClass();
                        String str15 = i2.c;
                        ku4 ku4 = gm5.c.v;
                        mp1 mp1 = new mp1(str15, ku4, 2);
                        mp1.e(i53.e);
                        mp1.e = (JsonElement) ol3.b(JsonElement.Companion.serializer(), t);
                        zc9 zc9 = new zc9(ku4, mp1.f, 4);
                        str9.getClass();
                        zc9.a("id", xd2, str9);
                        String id = userInfo.getId();
                        id.getClass();
                        zc9.a("user_id", xd2, id);
                        h66 h66 = h66.a;
                        String str16 = i2.b;
                        this.J = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = null;
                        this.G = null;
                        this.H = null;
                        this.I = 1;
                        if (h66.a(gm5, str16, mp1, this) == obj5) {
                            return obj5;
                        }
                    } else {
                        str8 = c;
                        String str17 = i1;
                        String str18 = i12;
                        byte[] bArr = ez4.d;
                        String str19 = this.M;
                        if (bArr != null) {
                            str7 = "user_id";
                            String id2 = userInfo.getId();
                            this.J = o81;
                            this.A = lo22;
                            this.B = ez4;
                            this.C = str19;
                            this.D = str9;
                            this.E = str8;
                            this.F = str17;
                            this.G = userInfo;
                            this.H = str18;
                            str6 = str18;
                            this.I = 2;
                            obj4 = lo2.h(lo22, id2, bArr, this);
                            if (obj4 == obj5) {
                                return obj5;
                            }
                            userInfo2 = userInfo;
                            str12 = str9;
                            str11 = str17;
                            str3 = str19;
                            str4 = (String) obj4;
                            str5 = str11;
                            str9 = str12;
                            userInfo = userInfo2;
                            String str20 = str8;
                            String str21 = str6;
                            hm5 i3 = f55.i(lo22.a, "forum_posts");
                            gm5 gm52 = i3.a;
                            ForumPostImageUpdateDto forumPostImageUpdateDto = new ForumPostImageUpdateDto(userInfo.getId(), str20, ez4.c, str5, str21, (String) null, str4);
                            str10 = str4;
                            t77 t772 = gm52.d;
                            ol3 ol32 = pl3.d;
                            String t2 = ((f96) t772).t(b26.b(ForumPostImageUpdateDto.class), forumPostImageUpdateDto);
                            ol32.getClass();
                            String str22 = i3.c;
                            ku4 ku42 = gm52.c.v;
                            UserInfo userInfo3 = userInfo;
                            mp1 mp12 = new mp1(str22, ku42, 2);
                            mp12.e(i53.e);
                            mp12.e = (JsonElement) ol32.b(JsonElement.Companion.serializer(), t2);
                            zc9 zc92 = new zc9(ku42, mp12.f, 4);
                            str9.getClass();
                            zc92.a("id", xd2, str9);
                            String id3 = userInfo3.getId();
                            id3.getClass();
                            zc92.a(str7, xd2, id3);
                            h66 h662 = h66.a;
                            String str23 = i3.b;
                            this.J = o81;
                            this.A = lo22;
                            this.B = str3;
                            this.C = null;
                            this.D = null;
                            this.E = null;
                            this.F = null;
                            this.G = str10;
                            this.H = null;
                            this.I = 3;
                            obj3 = h662.a(gm52, str23, mp12, this);
                            if (obj3 != obj5) {
                            }
                            return obj5;
                        }
                        str6 = str18;
                        str7 = "user_id";
                        str5 = str17;
                        str3 = str19;
                        str4 = null;
                        String str202 = str8;
                        String str212 = str6;
                        hm5 i32 = f55.i(lo22.a, "forum_posts");
                        gm5 gm522 = i32.a;
                        ForumPostImageUpdateDto forumPostImageUpdateDto2 = new ForumPostImageUpdateDto(userInfo.getId(), str202, ez4.c, str5, str212, (String) null, str4);
                        str10 = str4;
                        t77 t7722 = gm522.d;
                        ol3 ol322 = pl3.d;
                        String t22 = ((f96) t7722).t(b26.b(ForumPostImageUpdateDto.class), forumPostImageUpdateDto2);
                        ol322.getClass();
                        String str222 = i32.c;
                        ku4 ku422 = gm522.c.v;
                        UserInfo userInfo32 = userInfo;
                        mp1 mp122 = new mp1(str222, ku422, 2);
                        mp122.e(i53.e);
                        mp122.e = (JsonElement) ol322.b(JsonElement.Companion.serializer(), t22);
                        zc9 zc922 = new zc9(ku422, mp122.f, 4);
                        str9.getClass();
                        zc922.a("id", xd2, str9);
                        String id32 = userInfo32.getId();
                        id32.getClass();
                        zc922.a(str7, xd2, id32);
                        h66 h6622 = h66.a;
                        String str232 = i32.b;
                        this.J = o81;
                        this.A = lo22;
                        this.B = str3;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = null;
                        this.G = str10;
                        this.H = null;
                        this.I = 3;
                        obj3 = h6622.a(gm522, str232, mp122, this);
                        if (obj3 != obj5) {
                        }
                        return obj5;
                    }
                } else {
                    throw new IllegalStateException("El cuerpo no puede estar vacío");
                }
            } else {
                throw new IllegalStateException("Debes iniciar sesión para editar en el foro.");
            }
        } else if (i == 1) {
            hm5 hm5 = (hm5) this.H;
            go2 go2 = (go2) this.G;
            ForumPostContentDto forumPostContentDto = (ForumPostContentDto) this.F;
            hm5 hm52 = (hm5) this.E;
            UserInfo userInfo4 = (UserInfo) this.D;
            String str24 = (String) this.B;
            f61 f61 = (f61) this.A;
            o85.q(obj);
        } else if (i == 2) {
            String str25 = this.H;
            userInfo2 = (UserInfo) this.G;
            str11 = (String) this.F;
            str8 = this.E;
            str12 = this.D;
            str3 = this.C;
            ez4 = (ez4) this.B;
            lo22 = this.A;
            try {
                o85.q(obj);
                str6 = str25;
                str7 = "user_id";
                obj4 = obj;
                str4 = (String) obj4;
                str5 = str11;
                str9 = str12;
                userInfo = userInfo2;
                String str2022 = str8;
                String str2122 = str6;
                try {
                    hm5 i322 = f55.i(lo22.a, "forum_posts");
                    gm5 gm5222 = i322.a;
                    ForumPostImageUpdateDto forumPostImageUpdateDto22 = new ForumPostImageUpdateDto(userInfo.getId(), str2022, ez4.c, str5, str2122, (String) null, str4);
                    str10 = str4;
                } catch (Throwable th) {
                    th = th;
                    str10 = str4;
                    str = str10;
                    lo2 = lo22;
                    if (str != null) {
                    }
                    throw th;
                }
                try {
                    t77 t77222 = gm5222.d;
                    ol3 ol3222 = pl3.d;
                    String t222 = ((f96) t77222).t(b26.b(ForumPostImageUpdateDto.class), forumPostImageUpdateDto22);
                    ol3222.getClass();
                    String str2222 = i322.c;
                    ku4 ku4222 = gm5222.c.v;
                    UserInfo userInfo322 = userInfo;
                    mp1 mp1222 = new mp1(str2222, ku4222, 2);
                    mp1222.e(i53.e);
                    mp1222.e = (JsonElement) ol3222.b(JsonElement.Companion.serializer(), t222);
                    zc9 zc9222 = new zc9(ku4222, mp1222.f, 4);
                    str9.getClass();
                    zc9222.a("id", xd2, str9);
                    String id322 = userInfo322.getId();
                    id322.getClass();
                    zc9222.a(str7, xd2, id322);
                    h66 h66222 = h66.a;
                    String str2322 = i322.b;
                    this.J = o81;
                    this.A = lo22;
                    this.B = str3;
                    this.C = null;
                    this.D = null;
                    this.E = null;
                    this.F = null;
                    this.G = str10;
                    this.H = null;
                    this.I = 3;
                    obj3 = h66222.a(gm5222, str2322, mp1222, this);
                    if (obj3 != obj5) {
                        str = str10;
                        lo2 = lo22;
                        jm5 jm5 = (jm5) obj3;
                        if (str3 != null) {
                        }
                        obj2 = str;
                        return new o66(obj2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = str10;
                    lo2 = lo22;
                    if (str != null) {
                        this.J = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = th;
                        this.G = null;
                        this.H = null;
                        this.I = 4;
                    }
                    throw th;
                }
                return obj5;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
        } else if (i == 3) {
            hm5 hm53 = (hm5) this.H;
            str = this.G;
            String str26 = (String) this.F;
            UserInfo userInfo5 = (UserInfo) this.E;
            f61 f612 = (f61) this.C;
            String str27 = (String) this.B;
            lo2 = this.A;
            try {
                o85.q(obj);
                str3 = str27;
                obj3 = obj;
                jm5 jm52 = (jm5) obj3;
                if (str3 != null) {
                    if (!str3.equals(str)) {
                        try {
                            this.J = null;
                            this.A = null;
                            this.B = null;
                            this.C = null;
                            this.D = null;
                            this.E = str;
                            this.F = null;
                            this.G = null;
                            this.H = null;
                            this.I = 5;
                        } catch (Throwable unused) {
                        }
                    }
                }
                obj2 = str;
                return new o66(obj2);
            } catch (Throwable th3) {
                th = th3;
                if (str != null) {
                }
                throw th;
            }
        } else if (i == 4) {
            o81 o812 = (o81) this.G;
            th = (Throwable) this.F;
            UserInfo userInfo6 = (UserInfo) this.D;
            String str28 = (String) this.B;
            f61 f613 = (f61) this.A;
            o85.q(obj);
            throw th;
        } else if (i == 5) {
            o81 o813 = (o81) this.F;
            str2 = this.E;
            UserInfo userInfo7 = (UserInfo) this.D;
            String str29 = (String) this.B;
            f61 f614 = (f61) this.A;
            try {
                o85.q(obj);
            } catch (Throwable unused2) {
            }
            obj2 = str2;
            return new o66(obj2);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj2 = null;
        return new o66(obj2);
        str2 = str;
        obj2 = str2;
        return new o66(obj2);
    }
}
