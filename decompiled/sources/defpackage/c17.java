package defpackage;

import cu.lestebang.utiletecsa.data.repository.spots.SpotVoteDto;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: c17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c17 extends a97 implements gs2 {
    public d17 A;
    public hm5 B;
    public String C;
    public boolean D;
    public int E;
    public final /* synthetic */ d17 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c17(d17 d17, String str, boolean z, f61 f61) {
        super(2, f61);
        this.F = d17;
        this.G = str;
        this.H = z;
    }

    public final Object H(Object obj, Object obj2) {
        return ((c17) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new c17(this.F, this.G, this.H, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0110, code lost:
        if (r14.a(r0, r5, r2, r13) == r4) goto L_0x0112;
     */
    public final Object s(Object obj) {
        Object obj2;
        d17 d17;
        hm5 hm5;
        String str;
        boolean z;
        String str2;
        int i = this.E;
        int i2 = 1;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            d17 = this.F;
            str = this.G;
            z = this.H;
            hm5 = f55.i(d17.a, "connection_spot_votes");
            this.A = d17;
            this.B = hm5;
            this.C = str;
            this.D = z;
            this.E = 1;
            obj = d17.a(d17, this);
            if (obj == p81) {
                return p81;
            }
        } else if (i == 1) {
            z = this.D;
            str = this.C;
            hm5 = this.B;
            d17 = this.A;
            o85.q(obj);
        } else if (i == 2) {
            c17 c17 = (c17) this.C;
            SpotVoteDto spotVoteDto = (SpotVoteDto) this.B;
            f61 f61 = (f61) this.A;
            try {
                o85.q(obj);
                obj2 = vs7.a;
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
        String str3 = (String) obj;
        if (!z) {
            i2 = -1;
        }
        UserInfo j = rg3.t(d17.a).j();
        if (j != null) {
            str2 = j.getId();
        } else {
            str2 = null;
        }
        List D2 = sg3.D(new SpotVoteDto(str, str3, i2, str2));
        gm5 gm5 = hm5.a;
        t77 t77 = gm5.d;
        ol3 ol3 = pl3.d;
        gs3 gs3 = gs3.c;
        String t = ((f96) t77).t(b26.c(List.class, x91.C(b26.b(SpotVoteDto.class))), D2);
        ol3.getClass();
        JsonArray<JsonElement> d = em3.d((JsonElement) ol3.b(JsonElement.Companion.serializer(), t));
        yc3 yc3 = new yc3(hm5.c, gm5.c.v);
        yc3.e(i53.c);
        yc3.e = d;
        ArrayList arrayList = new ArrayList();
        for (JsonElement e3 : d) {
            it0.h0(arrayList, em3.e(e3).keySet());
        }
        List b1 = dt0.b1(dt0.f1(arrayList));
        if (!b1.isEmpty()) {
            yc3.f.put("columns", sg3.D(dt0.E0(b1, ",", (String) null, (String) null, (vr2) null, 62)));
        }
        h66 h66 = h66.a;
        String str4 = hm5.b;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = 2;
    }
}
