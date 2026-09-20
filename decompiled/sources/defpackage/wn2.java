package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumPostImageDto;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: wn2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wn2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ lo2 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn2(lo2 lo2, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = lo2;
        this.D = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((wn2) o(f61, o81)).s(vs7);
            default:
                return ((wn2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        String str = this.D;
        lo2 lo2 = this.C;
        switch (i) {
            case b85.b:
                return new wn2(lo2, str, f61, 0);
            default:
                return new wn2(lo2, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        xd2 xd2 = xd2.EQ;
        String str = this.D;
        lo2 lo2 = this.C;
        p81 p81 = p81.w;
        Object obj4 = null;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    hm5 i3 = f55.i(lo2.a, "forum_comments");
                    gm5 gm5 = i3.a;
                    String str2 = i3.c;
                    ku4 ku4 = gm5.c.v;
                    mp1 mp1 = new mp1(str2, ku4, 0);
                    mp1.e(i53.f);
                    zc9 zc9 = new zc9(ku4, mp1.f, 4);
                    str.getClass();
                    zc9.a("id", xd2, str);
                    h66 h66 = h66.a;
                    String str3 = i3.b;
                    this.B = 1;
                    if (h66.a(gm5, str3, mp1, this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        obj2 = new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = vs7.a;
                return new o66(obj2);
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    hm5 i5 = f55.i(lo2.a, "forum_posts");
                    gm5 gm52 = i5.a;
                    String f1 = qs.f1(new String[]{"image"}, ",", (String) null, (String) null, (vr2) null, 62);
                    String str4 = i5.c;
                    ku4 ku42 = gm52.c.v;
                    im5 im5 = new im5(str4, ku42);
                    LinkedHashMap linkedHashMap = im5.f;
                    zc9 zc92 = new zc9(ku42, linkedHashMap, 4);
                    str.getClass();
                    zc92.a("id", xd2, str);
                    linkedHashMap.put("limit", sg3.D(String.valueOf(1)));
                    im5.d(f1);
                    h66 h662 = h66.a;
                    String str5 = i5.b;
                    this.B = 1;
                    obj3 = h662.a(gm52, str5, im5, this);
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    try {
                        o85.q(obj);
                        obj3 = obj;
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        obj4 = new m66(e4);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jm5 jm5 = (jm5) obj3;
                t77 t77 = jm5.b.d;
                String str6 = jm5.a;
                gs3 gs3 = gs3.c;
                ForumPostImageDto forumPostImageDto = (ForumPostImageDto) dt0.y0((List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(ForumPostImageDto.class))), str6));
                if (forumPostImageDto != null) {
                    obj4 = forumPostImageDto.getImage();
                }
                return new o66(obj4);
        }
    }
}
