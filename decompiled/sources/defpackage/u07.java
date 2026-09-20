package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import cu.lestebang.utiletecsa.data.repository.spots.SpotInsertDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: u07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u07 extends a97 implements gs2 {
    public Object A;
    public d17 B;
    public String C;
    public hm5 D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public Double K;
    public Double L;
    public long M;
    public int N;
    public final /* synthetic */ dz4 O;
    public final /* synthetic */ d17 P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u07(dz4 dz4, d17 d17, f61 f61) {
        super(2, f61);
        this.O = dz4;
        this.P = d17;
    }

    public final Object H(Object obj, Object obj2) {
        return ((u07) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new u07(this.O, this.P, f61);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101 A[Catch:{ CancellationException -> 0x02fa, Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126 A[Catch:{ CancellationException -> 0x02fa, Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02c3 A[Catch:{ CancellationException -> 0x02fa, Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[Catch:{ CancellationException -> 0x02fa, Exception -> 0x02ed }, RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        Object obj2;
        d17 d17;
        p81 p81;
        long j;
        dz4 dz4;
        dv7 dv7;
        String obj3;
        Object obj4;
        dz4 dz42;
        long j2;
        long spotsLastPublishMillis;
        String name;
        String name2;
        String i1;
        String str;
        String str2;
        String str3;
        Object a;
        String str4;
        String str5;
        Double d;
        Double d2;
        hm5 hm5;
        p81 p812;
        int i = this.N;
        p81 p813 = p81.w;
        if (i == 0) {
            o85.q(obj);
            dz4 dz43 = this.O;
            d17 d172 = this.P;
            if (d57.I0(dz43.a)) {
                throw new IllegalStateException("El apodo no puede estar vacío");
            } else if (!d57.I0(dz43.d)) {
                long currentTimeMillis = System.currentTimeMillis();
                di2 d3 = ((dy7) d172.b).d();
                this.A = dz43;
                this.B = d172;
                this.M = currentTimeMillis;
                this.N = 1;
                obj4 = gr8.H(d3, this);
                if (obj4 != p813) {
                    dz4 dz44 = dz43;
                    d17 = d172;
                    j2 = currentTimeMillis;
                    dz42 = dz44;
                    spotsLastPublishMillis = j2 - ((UserDataPreferences) obj4).getSpotsLastPublishMillis();
                    if (0 > spotsLastPublishMillis || spotsLastPublishMillis >= 3600000) {
                    }
                }
                return p813;
            } else {
                throw new IllegalStateException("La dirección no puede estar vacía");
            }
        } else if (i == 1) {
            j2 = this.M;
            d17 d173 = this.B;
            dz4 dz45 = (dz4) this.A;
            o85.q(obj);
            dz4 dz46 = dz45;
            d17 = d173;
            dz42 = dz46;
            obj4 = obj;
            spotsLastPublishMillis = j2 - ((UserDataPreferences) obj4).getSpotsLastPublishMillis();
            if (0 > spotsLastPublishMillis || spotsLastPublishMillis >= 3600000) {
                hm5 i2 = f55.i(d17.a, "connection_spots");
                String i12 = d57.i1(40, d57.k1(dz42.a).toString());
                name = dz42.b.name();
                name2 = dz42.c.name();
                i1 = d57.i1(200, d57.k1(dz42.d).toString());
                String obj5 = d57.k1(dz42.e).toString();
                if (obj5.length() == 0) {
                    str = null;
                } else {
                    str = obj5;
                }
                String obj6 = d57.k1(dz42.f).toString();
                if (obj6.length() == 0) {
                    str2 = null;
                } else {
                    str2 = obj6;
                }
                Double d4 = dz42.g;
                Double d5 = dz42.h;
                UserInfo j3 = rg3.t(d17.a).j();
                if (j3 != null) {
                    str3 = j3.getId();
                } else {
                    str3 = null;
                }
                this.A = dz42;
                this.B = d17;
                this.C = i12;
                this.D = i2;
                this.E = i1;
                this.F = name2;
                this.G = name;
                this.H = str;
                this.I = str2;
                this.J = str3;
                this.K = d5;
                this.L = d4;
                this.M = spotsLastPublishMillis;
                hm5 hm52 = i2;
                this.N = 2;
                a = d17.a(d17, this);
                if (a == p813) {
                    return p813;
                }
                str4 = str3;
                str5 = i12;
                d = d4;
                d2 = d5;
                dz4 = dz42;
                hm5 = hm52;
            } else {
                long j4 = 1;
                long j5 = ((3600000 - spotsLastPublishMillis) / 60000) + 1;
                if (j5 >= 1) {
                    j4 = j5;
                }
                throw new IllegalStateException("Solo puedes publicar un punto por hora. Inténtalo de nuevo en " + j4 + " min.");
            }
        } else if (i == 2) {
            long j6 = this.M;
            Double d6 = this.L;
            Double d7 = this.K;
            String str6 = this.J;
            str2 = this.I;
            str = this.H;
            name = this.G;
            name2 = this.F;
            i1 = this.E;
            hm5 hm53 = this.D;
            String str7 = this.C;
            d17 = this.B;
            dz4 dz47 = (dz4) this.A;
            o85.q(obj);
            str5 = str7;
            d = d6;
            d2 = d7;
            dz4 = dz47;
            str4 = str6;
            hm5 = hm53;
            spotsLastPublishMillis = j6;
            a = obj;
        } else if (i == 3) {
            j = this.M;
            yc3 yc3 = (yc3) this.J;
            JsonArray jsonArray = (JsonArray) this.I;
            hm5 hm54 = (hm5) this.H;
            List list = (List) this.G;
            hm5 hm55 = (hm5) this.F;
            u07 u07 = (u07) this.E;
            SpotInsertDto spotInsertDto = (SpotInsertDto) this.D;
            hm5 hm56 = (hm5) this.C;
            d17 = this.B;
            dz4 = (dz4) this.A;
            o85.q(obj);
            p81 = p813;
            dv7 = d17.b;
            obj3 = d57.k1(dz4.a).toString();
            this.A = d17;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.M = j;
            this.N = 4;
            if (((dy7) dv7).J(obj3, this) == p81) {
                return p81;
            }
            dv7 dv72 = d17.b;
            long currentTimeMillis2 = System.currentTimeMillis();
            this.A = null;
            this.B = null;
            this.M = j;
            this.N = 5;
            obj2 = ((dy7) dv72).I(currentTimeMillis2, this);
            if (obj2 == p81) {
            }
            return new o66(obj2);
        } else if (i == 4) {
            j = this.M;
            f61 f61 = (f61) this.B;
            d17 d174 = (d17) this.A;
            o85.q(obj);
            d17 = d174;
            p81 = p813;
            dv7 dv722 = d17.b;
            long currentTimeMillis22 = System.currentTimeMillis();
            this.A = null;
            this.B = null;
            this.M = j;
            this.N = 5;
            obj2 = ((dy7) dv722).I(currentTimeMillis22, this);
            if (obj2 == p81) {
                return p81;
            }
            return new o66(obj2);
        } else if (i == 5) {
            f61 f612 = (f61) this.A;
            try {
                o85.q(obj);
                obj2 = obj;
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
        List D2 = sg3.D(new SpotInsertDto(str5, name, name2, i1, str, str2, d, d2, str4, (String) a));
        gm5 gm5 = hm5.a;
        t77 t77 = gm5.d;
        ol3 ol3 = pl3.d;
        gs3 gs3 = gs3.c;
        String t = ((f96) t77).t(b26.c(List.class, x91.C(b26.b(SpotInsertDto.class))), D2);
        ol3.getClass();
        JsonArray<JsonElement> d8 = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
        yc3 yc32 = new yc3(hm5.c, gm5.c.v);
        yc32.e = d8;
        ArrayList arrayList = new ArrayList();
        for (JsonElement e3 : d8) {
            it0.h0(arrayList, em3.e(e3).keySet());
        }
        List b1 = dt0.b1(dt0.f1(arrayList));
        if (!b1.isEmpty()) {
            p812 = p813;
            yc32.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
        } else {
            p812 = p813;
        }
        h66 h66 = h66.a;
        String str8 = hm5.b;
        this.A = dz4;
        this.B = d17;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = spotsLastPublishMillis;
        this.N = 3;
        Object a2 = h66.a(gm5, str8, yc32, this);
        p81 = p812;
        if (a2 == p81) {
            return p81;
        }
        j = spotsLastPublishMillis;
        dv7 = d17.b;
        obj3 = d57.k1(dz4.a).toString();
        this.A = d17;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.M = j;
        this.N = 4;
        if (((dy7) dv7).J(obj3, this) == p81) {
        }
        dv7 dv7222 = d17.b;
        long currentTimeMillis222 = System.currentTimeMillis();
        this.A = null;
        this.B = null;
        this.M = j;
        this.N = 5;
        obj2 = ((dy7) dv7222).I(currentTimeMillis222, this);
        if (obj2 == p81) {
        }
        return new o66(obj2);
    }
}
