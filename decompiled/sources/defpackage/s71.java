package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.providers.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: s71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s71 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s71(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ((s71) o((f61) obj2, (o81) obj)).s(vs7);
                return vs7;
            default:
                return ((s71) o((f61) obj2, (String) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i) {
            case b85.b:
                s71 s71 = new s71((uk5) obj4, (wd7) obj3, (ze7) obj2, f61, 0);
                s71.B = obj;
                return s71;
            default:
                s71 s712 = new s71((j77) obj4, (b) obj3, (jz0) obj2, f61, 1);
                s712.B = obj;
                return s712;
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        String str = null;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                o81 o81 = (o81) this.B;
                uk5 uk5 = (uk5) obj4;
                r71 r71 = new r71(uk5, (wd7) obj3, (f61) null, 0);
                r81 r81 = r81.z;
                ar7.H(o81, (e81) null, r81, r71, 1);
                ar7.H(o81, (e81) null, r81, new n0(uk5, (ze7) obj2, (f61) null, 24), 1);
                return vs7.a;
            default:
                String str2 = (String) this.B;
                o85.q(obj);
                b bVar = (b) obj3;
                jz0 jz0 = (jz0) obj2;
                a aVar = (a) rg3.t((j77) obj4);
                bVar.getClass();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                arrayList.addAll((ArrayList) jz0.x);
                linkedHashMap.putAll((LinkedHashMap) jz0.y);
                String q = aVar.q();
                if (q != null) {
                    linkedHashMap.put("code_challenge", q);
                    linkedHashMap.put("code_challenge_method", "s256");
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder("authorize?provider=");
                sb2.append(bVar.getName());
                sb2.append("&redirect_to=");
                if (str2 != null) {
                    str = ss0.e(str2, false);
                }
                sb2.append(str);
                sb.append(sb2.toString());
                if (!arrayList.isEmpty()) {
                    sb.append("&scopes=".concat(dt0.E0(arrayList, "+", (String) null, (String) null, (vr2) null, 62)));
                }
                if (!linkedHashMap.isEmpty()) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        sb.append("&" + ((String) entry.getKey()) + '=' + ss0.e((String) entry.getValue(), false));
                    }
                }
                return aVar.a(sb.toString());
        }
    }
}
