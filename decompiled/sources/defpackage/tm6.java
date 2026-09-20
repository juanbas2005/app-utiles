package defpackage;

import android.util.Log;
import com.google.firebase.sessions.SessionDetails;
import java.util.Map;

/* renamed from: tm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tm6 extends a97 implements gs2 {
    public nd3 A;
    public vm6 B;
    public sm6 C;
    public oe2 D;
    public SessionDetails E;
    public rn6 F;
    public int G;
    public final /* synthetic */ vm6 H;
    public final /* synthetic */ SessionDetails I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm6(vm6 vm6, SessionDetails sessionDetails, f61 f61) {
        super(2, f61);
        this.H = vm6;
        this.I = sessionDetails;
    }

    public final Object H(Object obj, Object obj2) {
        return ((tm6) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new tm6(this.H, this.I, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r1 == r6) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r1 == r6) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    public final Object s(Object obj) {
        rn6 rn6;
        sm6 sm6;
        oe2 oe2;
        SessionDetails sessionDetails;
        nd3 nd3;
        Object obj2;
        h91 h91;
        String str;
        je1 je1;
        h91 h912;
        Object obj3;
        Object obj4;
        int i = this.G;
        vm6 vm6 = this.H;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            this.G = 1;
            obj4 = vm6.a(vm6, this);
        } else if (i == 1) {
            o85.q(obj);
            obj4 = obj;
        } else if (i == 2) {
            o85.q(obj);
            obj3 = obj;
            nd3 = (nd3) obj3;
            sm6 = sm6.a;
            oe2 = vm6.a;
            rn6 = vm6.c;
            zf2 zf2 = zf2.a;
            this.A = nd3;
            this.B = vm6;
            this.C = sm6;
            this.D = oe2;
            SessionDetails sessionDetails2 = this.I;
            this.E = sessionDetails2;
            this.F = rn6;
            this.G = 3;
            obj2 = zf2.b(this);
            if (obj2 != p81) {
                sessionDetails = sessionDetails2;
                Map map = (Map) obj2;
                String str2 = nd3.a;
                String str3 = nd3.b;
                sm6.getClass();
                oe2.getClass();
                sessionDetails.getClass();
                rn6.getClass();
                map.getClass();
                str3.getClass();
                String sessionId = sessionDetails.getSessionId();
                String firstSessionId = sessionDetails.getFirstSessionId();
                int sessionIndex = sessionDetails.getSessionIndex();
                long sessionStartTimestampUs = sessionDetails.getSessionStartTimestampUs();
                h91 = (h91) map.get(nn6.x);
                je1 je12 = je1.z;
                je1 je13 = je1.y;
                je1 je14 = je1.x;
                if (h91 != null) {
                }
                h912 = (h91) map.get(nn6.w);
                if (h912 != null) {
                }
                rm6 rm6 = new rm6(new ym6(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs, new ke1(je1, je12, rn6.a()), str2, str), sm6.a(oe2));
                int i2 = vm6.g;
                vm6.getClass();
                vm6.d.a(rm6);
                Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                return vs7.a;
            }
            return p81;
        } else if (i == 3) {
            rn6 rn62 = this.F;
            sessionDetails = this.E;
            oe2 = this.D;
            sm6 = this.C;
            vm6 = this.B;
            nd3 nd32 = this.A;
            o85.q(obj);
            rn6 = rn62;
            nd3 = nd32;
            obj2 = obj;
            Map map2 = (Map) obj2;
            String str22 = nd3.a;
            String str32 = nd3.b;
            sm6.getClass();
            oe2.getClass();
            sessionDetails.getClass();
            rn6.getClass();
            map2.getClass();
            str32.getClass();
            String sessionId2 = sessionDetails.getSessionId();
            String firstSessionId2 = sessionDetails.getFirstSessionId();
            int sessionIndex2 = sessionDetails.getSessionIndex();
            long sessionStartTimestampUs2 = sessionDetails.getSessionStartTimestampUs();
            h91 = (h91) map2.get(nn6.x);
            je1 je122 = je1.z;
            je1 je132 = je1.y;
            je1 je142 = je1.x;
            if (h91 != null) {
                str = str32;
                je1 = je142;
            } else if (h91.a.a()) {
                str = str32;
                je1 = je132;
            } else {
                str = str32;
                je1 = je122;
            }
            h912 = (h91) map2.get(nn6.w);
            if (h912 != null) {
                je122 = je142;
            } else if (h912.a.a()) {
                je122 = je132;
            }
            rm6 rm62 = new rm6(new ym6(sessionId2, firstSessionId2, sessionIndex2, sessionStartTimestampUs2, new ke1(je1, je122, rn6.a()), str22, str), sm6.a(oe2));
            int i22 = vm6.g;
            vm6.getClass();
            try {
                vm6.d.a(rm62);
                Log.d("FirebaseSessions", "Successfully logged Session Start event.");
            } catch (RuntimeException e) {
                Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
            }
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (((Boolean) obj4).booleanValue()) {
            we2 we2 = vm6.b;
            this.G = 2;
            obj3 = nd3.c.g(we2, this);
        }
        return vs7.a;
    }
}
