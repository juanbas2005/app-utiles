package defpackage;

import android.util.Log;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDetails;
import java.util.Map;

/* renamed from: as6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class as6 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ es6 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as6(es6 es6, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = es6;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((as6) o(f61, o81)).s(vs7);
            default:
                return ((as6) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        es6 es6 = this.C;
        switch (i) {
            case b85.b /*0*/:
                return new as6(es6, f61, 0);
            default:
                return new as6(es6, f61, 1);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        es6 es6 = this.C;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    oi2 oi2 = new oi2(es6.e.b(), new ea((Object) es6, (f61) null, 5), 1);
                    lg lgVar = new lg(12, es6);
                    this.B = 1;
                    if (oi2.a(lgVar, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    qe1 qe1 = es6.e;
                    cs6 cs6 = new cs6(es6, (f61) null, 0);
                    this.B = 1;
                    if (qe1.a(cs6, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                        return vs7;
                    } catch (Exception e) {
                        Exception exc = e;
                        Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + exc.getMessage());
                        SessionData sessionData = es6.h;
                        if (sessionData != null) {
                            es6.d.getClass();
                            SessionData copy$default = SessionData.copy$default(sessionData, (SessionDetails) null, mi7.a(), (Map) null, 5, (Object) null);
                            copy$default.getClass();
                            es6.h = copy$default;
                            return vs7;
                        }
                        sg3.a0("localSessionData");
                        throw null;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
