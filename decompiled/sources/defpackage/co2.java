package defpackage;

import cu.lestebang.utiletecsa.data.repository.forum.ForumPostFeedDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: co2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class co2 extends a97 implements gs2 {
    public lo2 A;
    public String B;
    public Object C;
    public String D;
    public String E;
    public List F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ lo2 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ String M;
    public final /* synthetic */ String N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co2(lo2 lo2, int i, int i2, String str, String str2, f61 f61) {
        super(2, f61);
        this.J = lo2;
        this.K = i;
        this.L = i2;
        this.M = str;
        this.N = str2;
    }

    public final Object H(Object obj, Object obj2) {
        return ((co2) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new co2(this.J, this.K, this.L, this.M, this.N, f61);
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [im5, bj6] */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0246 A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0248 A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x024b A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0264 A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }, LOOP:1: B:69:0x025e->B:71:0x0264, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028b A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02a4 A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02c8 A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02ca A[Catch:{ CancellationException -> 0x02dc, Exception -> 0x02cf }] */
    public final Object s(Object obj) {
        Object obj2;
        lo2 lo2;
        Map map;
        String str;
        List<ForumPostFeedDto> list;
        int i;
        Object obj3;
        boolean z;
        int i2;
        int i3;
        Object obj4;
        Object obj5;
        List<ForumPostFeedDto> list2;
        int i4;
        Object obj6;
        String str2;
        String str3;
        String str4;
        int i5;
        int i6;
        String str5;
        int i7;
        String str6;
        gm5 gm5;
        int i8 = this.I;
        Object obj7 = p81.w;
        if (i8 == 0) {
            o85.q(obj);
            lo2 = this.J;
            i6 = this.K;
            i5 = this.L;
            str2 = this.M;
            str3 = this.N;
            UserInfo j = rg3.t(lo2.a).j();
            if (j != null) {
                str4 = j.getId();
            } else {
                str4 = null;
            }
            this.A = lo2;
            this.B = str2;
            this.C = str3;
            this.D = null;
            this.E = str4;
            this.G = i6;
            this.H = i5;
            this.I = 1;
            obj6 = lo2.m(this);
            if (obj6 == obj7) {
                return obj7;
            }
        } else if (i8 == 1) {
            int i9 = this.H;
            int i10 = this.G;
            str4 = this.E;
            f61 f61 = (f61) this.D;
            str3 = (String) this.C;
            str2 = this.B;
            lo2 = this.A;
            o85.q(obj);
            obj6 = ((o66) obj).w;
            int i11 = i10;
            i5 = i9;
            i6 = i11;
        } else if (i8 == 2) {
            int i12 = this.G;
            String str7 = (String) this.F;
            hm5 hm5 = (hm5) this.E;
            String str8 = this.D;
            map = (Map) this.C;
            f61 f612 = (f61) this.B;
            lo2 lo22 = this.A;
            o85.q(obj);
            str = str8;
            obj4 = obj7;
            lo2 = lo22;
            i3 = i12;
            obj5 = obj;
            jm5 jm5 = (jm5) obj5;
            t77 t77 = jm5.b.d;
            String str9 = jm5.a;
            gs3 gs3 = gs3.c;
            list2 = (List) ((f96) t77).s(b26.c(List.class, x91.C(b26.b(ForumPostFeedDto.class))), str9);
            if (list2.size() <= i3) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                list2 = dt0.V0(i3, list2);
            }
            ArrayList arrayList = new ArrayList(et0.e0(list2, 10));
            for (ForumPostFeedDto id : list2) {
                arrayList.add(id.getId());
            }
            this.A = lo2;
            this.B = null;
            this.C = map;
            this.D = str;
            this.E = null;
            this.F = list2;
            this.G = i4;
            this.I = 3;
            obj3 = lo2.e(lo2, str, arrayList, this);
            if (obj3 != obj4) {
                return obj4;
            }
            list = list2;
            i = i4;
            Map map2 = (Map) obj3;
            ArrayList arrayList2 = new ArrayList(et0.e0(list, 10));
            while (r2.hasNext()) {
            }
            if (i == 0) {
            }
            obj2 = new pn2(arrayList2, z);
            return new o66(obj2);
        } else if (i8 == 3) {
            i = this.G;
            list = this.F;
            List list3 = (List) this.E;
            str = this.D;
            map = (Map) this.C;
            f61 f613 = (f61) this.B;
            lo2 lo23 = this.A;
            try {
                o85.q(obj);
                lo2 = lo23;
                obj3 = obj;
                Map map22 = (Map) obj3;
                ArrayList arrayList22 = new ArrayList(et0.e0(list, 10));
                for (ForumPostFeedDto forumPostFeedDto : list) {
                    Integer num = (Integer) map22.get(forumPostFeedDto.getId());
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    arrayList22.add(lo2.g(lo2, forumPostFeedDto, str, i2, map));
                }
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                obj2 = new pn2(arrayList22, z);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
            return new o66(obj2);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o85.q(obj6);
        Iterable<qm2> iterable = (Iterable) obj6;
        int F2 = tf4.F(et0.e0(iterable, 10));
        if (F2 < 16) {
            F2 = 16;
        }
        Map linkedHashMap = new LinkedHashMap(F2);
        for (qm2 qm2 : iterable) {
            linkedHashMap.put(qm2.a, qm2.b);
        }
        hm5 i13 = f55.i(lo2.a, "forum_posts_feed");
        gm5 gm52 = i13.a;
        List list4 = lo2.d;
        list4.getClass();
        String E0 = dt0.E0(list4, ",", (String) null, (String) null, (vr2) null, 62);
        String str10 = i13.c;
        ku4 ku4 = gm52.c.v;
        ? im5 = new im5(str10, ku4);
        String str11 = str3;
        Object obj8 = obj7;
        zc9 zc9 = new zc9(ku4, im5.f, 4);
        Map map3 = (Map) zc9.z;
        if (str2 != null) {
            zc9.a("category", xd2.EQ, str2);
        }
        String obj9 = d57.k1(str11).toString();
        if (obj9.length() <= 0) {
            obj9 = null;
        }
        if (obj9 != null) {
            str5 = f21.h("*", obj9, "*");
        } else {
            str5 = null;
        }
        if (str5 != null) {
            String sb = new StringBuilder().toString();
            gm5 = gm52;
            i7 = i6;
            str6 = str4;
            zc9 zc92 = new zc9((ku4) zc9.y, (Map) null, 2);
            xd2 xd2 = xd2.ILIKE;
            zc92.a("title", xd2, str5);
            zc92.a("body", xd2, str5);
            zc92.a("author_name", xd2, str5);
            String str12 = '(' + dt0.E0(sf4.Z(sf4.b0((Map) zc92.z)), ",", (String) null, (String) null, v61.U, 30) + ')';
            if (!str12.equals("()")) {
                String str13 = sb + "or";
                List D2 = sg3.D(str12);
                boolean z2 = zc9.x;
                List list5 = a42.w;
                if (z2) {
                    List list6 = (List) map3.get(sb + "or");
                    if (list6 != null) {
                        list5 = list6;
                    }
                }
                map3.put(str13, dt0.M0(D2, list5));
            }
        } else {
            i7 = i6;
            gm5 = gm52;
            str6 = str4;
        }
        w75 w75 = w75.DESCENDING;
        im5.b(im5, "created_at", w75);
        im5.b(im5, "id", w75);
        im5.c(im5, (long) i5, (long) (i5 + i7));
        im5.d(E0);
        h66 h66 = h66.a;
        String str14 = i13.b;
        this.A = lo2;
        this.B = null;
        this.C = linkedHashMap;
        str = str6;
        this.D = str;
        this.E = null;
        this.F = null;
        i3 = i7;
        this.G = i3;
        this.I = 2;
        obj5 = h66.a(gm5, str14, im5, this);
        obj4 = obj8;
        if (obj5 == obj4) {
            return obj4;
        }
        map = linkedHashMap;
        jm5 jm52 = (jm5) obj5;
        t77 t772 = jm52.b.d;
        String str92 = jm52.a;
        gs3 gs32 = gs3.c;
        list2 = (List) ((f96) t772).s(b26.c(List.class, x91.C(b26.b(ForumPostFeedDto.class))), str92);
        if (list2.size() <= i3) {
        }
        if (i4 != 0) {
        }
        ArrayList arrayList3 = new ArrayList(et0.e0(list2, 10));
        while (r7.hasNext()) {
        }
        this.A = lo2;
        this.B = null;
        this.C = map;
        this.D = str;
        this.E = null;
        this.F = list2;
        this.G = i4;
        this.I = 3;
        obj3 = lo2.e(lo2, str, arrayList3, this);
        if (obj3 != obj4) {
        }
    }
}
