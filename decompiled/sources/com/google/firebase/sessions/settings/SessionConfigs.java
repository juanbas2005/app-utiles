package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u0000 62\u00020\u0001:\u000278B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00069"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getSessionsEnabled", "Ljava/lang/Double;", "getSessionSamplingRate", "Ljava/lang/Integer;", "getSessionTimeoutSeconds", "getCacheDurationSeconds", "Ljava/lang/Long;", "getCacheUpdatedTimeSeconds", "Companion", "im6", "jm6", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SessionConfigs {
    public static final jm6 Companion = new Object();
    private final Integer cacheDurationSeconds;
    private final Long cacheUpdatedTimeSeconds;
    private final Double sessionSamplingRate;
    private final Integer sessionTimeoutSeconds;
    private final Boolean sessionsEnabled;

    public /* synthetic */ SessionConfigs(int i, Boolean bool, Double d, Integer num, Integer num2, Long l, rl6 rl6) {
        if (31 == (i & 31)) {
            this.sessionsEnabled = bool;
            this.sessionSamplingRate = d;
            this.sessionTimeoutSeconds = num;
            this.cacheDurationSeconds = num2;
            this.cacheUpdatedTimeSeconds = l;
            return;
        }
        wn6.x(i, 31, im6.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionConfigs.sessionsEnabled;
        }
        if ((i & 2) != 0) {
            d = sessionConfigs.sessionSamplingRate;
        }
        if ((i & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        if ((i & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        if ((i & 16) != 0) {
            l = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        Integer num3 = num2;
        Long l2 = l;
        return sessionConfigs.copy(bool, d, num, num3, l2);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs sessionConfigs, hy0 hy0, ll6 ll6) {
        hy0.A(ll6, 0, ja0.a, sessionConfigs.sessionsEnabled);
        hy0.A(ll6, 1, ix1.a, sessionConfigs.sessionSamplingRate);
        ue3 ue3 = ue3.a;
        hy0.A(ll6, 2, ue3, sessionConfigs.sessionTimeoutSeconds);
        hy0.A(ll6, 3, ue3, sessionConfigs.cacheDurationSeconds);
        hy0.A(ll6, 4, tc4.a, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public final Boolean component1() {
        return this.sessionsEnabled;
    }

    public final Double component2() {
        return this.sessionSamplingRate;
    }

    public final Integer component3() {
        return this.sessionTimeoutSeconds;
    }

    public final Integer component4() {
        return this.cacheDurationSeconds;
    }

    public final Long component5() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final SessionConfigs copy(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        return new SessionConfigs(bool, d, num, num2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        if (sg3.e(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && sg3.e(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && sg3.e(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && sg3.e(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && sg3.e(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds)) {
            return true;
        }
        return false;
    }

    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Boolean bool = this.sessionsEnabled;
        int i5 = 0;
        if (bool == null) {
            i = 0;
        } else {
            i = bool.hashCode();
        }
        int i6 = i * 31;
        Double d = this.sessionSamplingRate;
        if (d == null) {
            i2 = 0;
        } else {
            i2 = d.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        Integer num = this.sessionTimeoutSeconds;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        Integer num2 = this.cacheDurationSeconds;
        if (num2 == null) {
            i4 = 0;
        } else {
            i4 = num2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        Long l = this.cacheUpdatedTimeSeconds;
        if (l != null) {
            i5 = l.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l;
    }
}
