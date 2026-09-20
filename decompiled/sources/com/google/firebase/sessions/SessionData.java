package com.google.firebase.sessions;

import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 02\u00020\u0001:\u000212B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/google/firebase/sessions/SessionData;", "", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lcom/google/firebase/sessions/Time;", "backgroundTime", "", "", "Lcom/google/firebase/sessions/ProcessData;", "processDataMap", "<init>", "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionData;Lhy0;Lll6;)V", "write$Self", "component1", "()Lcom/google/firebase/sessions/SessionDetails;", "component2", "()Lcom/google/firebase/sessions/Time;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/google/firebase/sessions/SessionDetails;Lcom/google/firebase/sessions/Time;Ljava/util/Map;)Lcom/google/firebase/sessions/SessionData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/firebase/sessions/SessionDetails;", "getSessionDetails", "Lcom/google/firebase/sessions/Time;", "getBackgroundTime", "Ljava/util/Map;", "getProcessDataMap", "Companion", "lm6", "mm6", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SessionData {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {null, null, rg3.y(i44.w, new pp5(15))};
    public static final mm6 Companion = new Object();
    private final Time backgroundTime;
    private final Map<String, ProcessData> processDataMap;
    private final SessionDetails sessionDetails;

    public /* synthetic */ SessionData(int i, SessionDetails sessionDetails2, Time time, Map map, rl6 rl6) {
        if (1 == (i & 1)) {
            this.sessionDetails = sessionDetails2;
            if ((i & 2) == 0) {
                this.backgroundTime = null;
            } else {
                this.backgroundTime = time;
            }
            if ((i & 4) == 0) {
                this.processDataMap = null;
            } else {
                this.processDataMap = map;
            }
        } else {
            wn6.x(i, 1, lm6.a.getDescriptor());
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new ty2((zr3) t47.a, (zr3) ap5.a, 1);
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, SessionDetails sessionDetails2, Time time, Map<String, ProcessData> map, int i, Object obj) {
        if ((i & 1) != 0) {
            sessionDetails2 = sessionData.sessionDetails;
        }
        if ((i & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.copy(sessionDetails2, time, map);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionData sessionData, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        hy0.o(ll6, 0, pm6.a, sessionData.sessionDetails);
        if (hy0.f(ll6) || sessionData.backgroundTime != null) {
            hy0.A(ll6, 1, zh7.a, sessionData.backgroundTime);
        }
        if (hy0.f(ll6) || sessionData.processDataMap != null) {
            hy0.A(ll6, 2, (zr3) nz3Arr[2].getValue(), sessionData.processDataMap);
        }
    }

    public final SessionDetails component1() {
        return this.sessionDetails;
    }

    public final Time component2() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> component3() {
        return this.processDataMap;
    }

    public final SessionData copy(SessionDetails sessionDetails2, Time time, Map<String, ProcessData> map) {
        sessionDetails2.getClass();
        return new SessionData(sessionDetails2, time, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        if (sg3.e(this.sessionDetails, sessionData.sessionDetails) && sg3.e(this.backgroundTime, sessionData.backgroundTime) && sg3.e(this.processDataMap, sessionData.processDataMap)) {
            return true;
        }
        return false;
    }

    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> getProcessDataMap() {
        return this.processDataMap;
    }

    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int i;
        int hashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int i2 = 0;
        if (time == null) {
            i = 0;
        } else {
            i = time.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        Map<String, ProcessData> map = this.processDataMap;
        if (map != null) {
            i2 = map.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + ')';
    }

    public SessionData(SessionDetails sessionDetails2, Time time, Map<String, ProcessData> map) {
        sessionDetails2.getClass();
        this.sessionDetails = sessionDetails2;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionData(SessionDetails sessionDetails2, Time time, Map map, int i, hl1 hl1) {
        this(sessionDetails2, (i & 2) != 0 ? null : time, (i & 4) != 0 ? null : map);
    }
}
