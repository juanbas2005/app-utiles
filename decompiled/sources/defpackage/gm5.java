package defpackage;

import io.github.jan.supabase.exceptions.RestException;
import io.github.jan.supabase.postgrest.PostgrestErrorResponse;
import java.io.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;

/* renamed from: gm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gm5 implements qe4 {
    public final j77 b;
    public final bm5 c;
    public final t77 d;
    public final aw e;

    public gm5(j77 j77, bm5 bm5) {
        j77.getClass();
        bm5.getClass();
        this.b = j77;
        this.c = bm5;
        t75.j(j77, "Supabase-PostgREST", (ub4) null, (vr2) null);
        this.d = ((m77) j77).b;
        this.e = sg3.g(j77, this, (ay5) null, 8000, 6).e(new h43(29, this));
    }

    public final Object d() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Serializable e(yl1 yl1, f61 f61) {
        fm5 fm5;
        int i;
        j77 j77;
        String str;
        PostgrestErrorResponse postgrestErrorResponse;
        if (f61 instanceof fm5) {
            fm5 = (fm5) f61;
            int i2 = fm5.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm5.D = i2 - Integer.MIN_VALUE;
                Object obj = fm5.B;
                i = fm5.D;
                Object obj2 = null;
                if (i != 0) {
                    o85.q(obj);
                    fm5.z = yl1;
                    j77 = this.b;
                    fm5.A = j77;
                    fm5.D = 1;
                    obj = h49.q(yl1, mo0.a, fm5);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    j77 = fm5.A;
                    yl1 = fm5.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) obj;
                km3 km3 = l18.a;
                km3.getClass();
                obj2 = km3.b(PostgrestErrorResponse.Companion.serializer(), str);
                postgrestErrorResponse = (PostgrestErrorResponse) obj2;
                if (postgrestErrorResponse == null) {
                    postgrestErrorResponse = new PostgrestErrorResponse("Unknown error", (String) null, (JsonElement) null, (String) null, 14, (hl1) null);
                }
                String message = postgrestErrorResponse.getMessage();
                String hint = postgrestErrorResponse.getHint();
                JsonElement details = postgrestErrorResponse.getDetails();
                String code = postgrestErrorResponse.getCode();
                message.getClass();
                yl1.getClass();
                StringBuilder o = f21.o("\n    Code: ", code, "\n    Hint: ", hint, "\n    Details: ");
                o.append(details);
                o.append(10);
                return new RestException(message, e57.f0(o.toString()), yl1);
            }
        }
        fm5 = new fm5(this, f61);
        Object obj3 = fm5.B;
        i = fm5.D;
        Object obj22 = null;
        if (i != 0) {
        }
        str = (String) obj3;
        try {
            km3 km32 = l18.a;
            km32.getClass();
            obj22 = km32.b(PostgrestErrorResponse.Companion.serializer(), str);
        } catch (SerializationException e2) {
            cf4 cf4 = ((m77) j77).f;
            ms3 ms3 = (ms3) cf4.z;
            String str2 = (String) cf4.y;
            ub4 ub4 = ub4.x;
            if (ms3.a(ub4)) {
                ms3.b(ub4, str2, e2, "Could not decode " + d57.i1(200, str) + " as " + b26.a.b(PostgrestErrorResponse.class).A() + '.');
            }
        }
        postgrestErrorResponse = (PostgrestErrorResponse) obj22;
        if (postgrestErrorResponse == null) {
        }
        String message2 = postgrestErrorResponse.getMessage();
        String hint2 = postgrestErrorResponse.getHint();
        JsonElement details2 = postgrestErrorResponse.getDetails();
        String code2 = postgrestErrorResponse.getCode();
        message2.getClass();
        yl1.getClass();
        StringBuilder o2 = f21.o("\n    Code: ", code2, "\n    Hint: ", hint2, "\n    Details: ");
        o2.append(details2);
        o2.append(10);
        return new RestException(message2, e57.f0(o2.toString()), yl1);
    }

    public final String f() {
        return "rest";
    }

    public final j77 h() {
        return this.b;
    }
}
