package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumCommentVoteDto;
import cu.lestebang.utiletecsa.data.repository.forum.ForumPostVoteDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: jo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jo2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ lo2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ String E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo2(lo2 lo2, int i, String str, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.C = lo2;
        this.D = i;
        this.E = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((jo2) o(f61, o81)).s(vs7);
            default:
                return ((jo2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new jo2(this.C, this.D, this.E, f612, 0);
            default:
                return new jo2(this.C, this.D, this.E, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = this.A;
        Object obj6 = vs7.a;
        Class<List> cls = List.class;
        xd2 xd2 = xd2.EQ;
        String str = this.E;
        int i2 = this.D;
        lo2 lo2 = this.C;
        p81 p81 = p81.w;
        String str2 = null;
        switch (i) {
            case b85.b:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    j77 j77 = lo2.a;
                    UserInfo j = rg3.t(j77).j();
                    if (j != null) {
                        str2 = j.getId();
                    }
                    String str3 = str2;
                    if (str3 == null) {
                        throw new IllegalStateException("Debes iniciar sesión para votar.");
                    } else if (i2 == 0) {
                        hm5 i4 = f55.i(j77, "forum_comment_votes");
                        gm5 gm5 = i4.a;
                        String str4 = i4.c;
                        ku4 ku4 = gm5.c.v;
                        mp1 mp1 = new mp1(str4, ku4, 0);
                        mp1.e(i53.f);
                        zc9 zc9 = new zc9(ku4, mp1.f, 4);
                        str.getClass();
                        zc9.a("comment_id", xd2, str);
                        zc9.a("user_id", xd2, str3);
                        h66 h66 = h66.a;
                        String str5 = i4.b;
                        this.B = 1;
                        obj3 = h66.a(gm5, str5, mp1, this);
                        if (obj3 == p81) {
                            return p81;
                        }
                    } else {
                        hm5 i5 = f55.i(j77, "forum_comment_votes");
                        gm5 gm52 = i5.a;
                        List D2 = sg3.D(new ForumCommentVoteDto(str, str3, z65.p(i2, -1, 1)));
                        t77 t77 = gm52.d;
                        ol3 ol3 = pl3.d;
                        gs3 gs3 = gs3.c;
                        String t = ((f96) t77).t(b26.c(cls, x91.C(b26.b(ForumCommentVoteDto.class))), D2);
                        ol3.getClass();
                        JsonArray<JsonElement> d = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
                        yc3 yc3 = new yc3(i5.c, gm52.c.v);
                        yc3.e(i53.c);
                        yc3.e = d;
                        ArrayList arrayList = new ArrayList();
                        for (JsonElement e : d) {
                            it0.h0(arrayList, em3.e(e).keySet());
                        }
                        List b1 = dt0.b1(dt0.f1(arrayList));
                        if (!b1.isEmpty()) {
                            yc3.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
                        }
                        h66 h662 = h66.a;
                        String str6 = i5.b;
                        this.B = 2;
                        obj2 = h662.a(gm52, str6, yc3, this);
                        if (obj2 == p81) {
                            return p81;
                        }
                        jm5 jm5 = (jm5) obj2;
                        return new o66(obj6);
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else if (i3 == 2) {
                    try {
                        o85.q(obj);
                        obj2 = obj;
                        jm5 jm52 = (jm5) obj2;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        obj6 = new m66(e3);
                    }
                    return new o66(obj6);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm53 = (jm5) obj3;
                return new o66(obj6);
            default:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    j77 j772 = lo2.a;
                    UserInfo j2 = rg3.t(j772).j();
                    if (j2 != null) {
                        str2 = j2.getId();
                    }
                    String str7 = str2;
                    if (str7 == null) {
                        throw new IllegalStateException("Debes iniciar sesión para votar.");
                    } else if (i2 == 0) {
                        hm5 i7 = f55.i(j772, "forum_post_votes");
                        gm5 gm53 = i7.a;
                        String str8 = i7.c;
                        ku4 ku42 = gm53.c.v;
                        mp1 mp12 = new mp1(str8, ku42, 0);
                        mp12.e(i53.f);
                        zc9 zc92 = new zc9(ku42, mp12.f, 4);
                        str.getClass();
                        zc92.a("post_id", xd2, str);
                        zc92.a("user_id", xd2, str7);
                        h66 h663 = h66.a;
                        String str9 = i7.b;
                        this.B = 1;
                        obj5 = h663.a(gm53, str9, mp12, this);
                        if (obj5 == p81) {
                            return p81;
                        }
                    } else {
                        hm5 i8 = f55.i(j772, "forum_post_votes");
                        gm5 gm54 = i8.a;
                        List D3 = sg3.D(new ForumPostVoteDto(str, str7, z65.p(i2, -1, 1)));
                        t77 t772 = gm54.d;
                        ol3 ol32 = pl3.d;
                        gs3 gs32 = gs3.c;
                        String t2 = ((f96) t772).t(b26.c(cls, x91.C(b26.b(ForumPostVoteDto.class))), D3);
                        ol32.getClass();
                        JsonArray<JsonElement> d2 = em3.d((JsonElement) ol32.b(JsonElement.Companion.serializer(), t2));
                        yc3 yc32 = new yc3(i8.c, gm54.c.v);
                        yc32.e(i53.c);
                        yc32.e = d2;
                        ArrayList arrayList2 = new ArrayList();
                        for (JsonElement e4 : d2) {
                            it0.h0(arrayList2, em3.e(e4).keySet());
                        }
                        List b12 = dt0.b1(dt0.f1(arrayList2));
                        if (!b12.isEmpty()) {
                            yc32.f.put("columns", sg3.D(dt0.E0(b12, ",", (String) null, (String) null, (vr2) null, 62)));
                        }
                        h66 h664 = h66.a;
                        String str10 = i8.b;
                        this.B = 2;
                        obj4 = h664.a(gm54, str10, yc32, this);
                        if (obj4 == p81) {
                            return p81;
                        }
                        jm5 jm54 = (jm5) obj4;
                        return new o66(obj6);
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    obj5 = obj;
                } else if (i6 == 2) {
                    try {
                        o85.q(obj);
                        obj4 = obj;
                        jm5 jm542 = (jm5) obj4;
                    } catch (CancellationException e5) {
                        throw e5;
                    } catch (Exception e6) {
                        obj6 = new m66(e6);
                    }
                    return new o66(obj6);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm55 = (jm5) obj5;
                return new o66(obj6);
        }
    }
}
