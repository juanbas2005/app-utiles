package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010\u001c¨\u0006/"}, d2 = {"Lcom/google/firebase/sessions/Time;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "Lrl6;", "serializationConstructorMarker", "(IJJJLrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/Time;Lhy0;Lll6;)V", "write$Self", "time", "Lu02;", "minus-5sfh64U", "(Lcom/google/firebase/sessions/Time;)J", "minus", "component1", "()J", "copy", "(J)Lcom/google/firebase/sessions/Time;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMs", "getUs", "getSeconds", "Companion", "zh7", "ai7", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Time {
    public static final ai7 Companion = new Object();
    private final long ms;
    private final long seconds;
    private final long us;

    public /* synthetic */ Time(int i, long j, long j2, long j3, rl6 rl6) {
        if (1 == (i & 1)) {
            this.ms = j;
            this.us = (i & 2) == 0 ? j * 1000 : j2;
            if ((i & 4) == 0) {
                this.seconds = j / 1000;
            } else {
                this.seconds = j3;
            }
        } else {
            wn6.x(i, 1, zh7.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = time.ms;
        }
        return time.copy(j);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time time, hy0 hy0, ll6 ll6) {
        hy0.j(ll6, 0, time.ms);
        if (hy0.f(ll6) || time.us != time.ms * 1000) {
            hy0.j(ll6, 1, time.us);
        }
        if (hy0.f(ll6) || time.seconds != time.ms / 1000) {
            hy0.j(ll6, 2, time.seconds);
        }
    }

    public final long component1() {
        return this.ms;
    }

    public final Time copy(long j) {
        return new Time(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Time) && this.ms == ((Time) obj).ms) {
            return true;
        }
        return false;
    }

    public final long getMs() {
        return this.ms;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final long getUs() {
        return this.us;
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    /* renamed from: minus-5sfh64U  reason: not valid java name */
    public final long m17minus5sfh64U(Time time) {
        time.getClass();
        xb4 xb4 = u02.x;
        return gl0.f0(this.ms - time.ms, y02.MILLISECONDS);
    }

    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j) {
        this.ms = j;
        this.us = j * 1000;
        this.seconds = j / 1000;
    }
}
