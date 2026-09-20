package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Lcom/google/firebase/sessions/ProcessData;", "", "", "pid", "", "uuid", "<init>", "(ILjava/lang/String;)V", "seen0", "Lrl6;", "serializationConstructorMarker", "(IILjava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/ProcessData;Lhy0;Lll6;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/google/firebase/sessions/ProcessData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPid", "Ljava/lang/String;", "getUuid", "Companion", "ap5", "bp5", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ProcessData {
    public static final bp5 Companion = new Object();
    private final int pid;
    private final String uuid;

    public /* synthetic */ ProcessData(int i, int i2, String str, rl6 rl6) {
        if (3 == (i & 3)) {
            this.pid = i2;
            this.uuid = str;
            return;
        }
        wn6.x(i, 3, ap5.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ProcessData copy$default(ProcessData processData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = processData.pid;
        }
        if ((i2 & 2) != 0) {
            str = processData.uuid;
        }
        return processData.copy(i, str);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(ProcessData processData, hy0 hy0, ll6 ll6) {
        hy0.w(0, processData.pid, ll6);
        hy0.x(ll6, 1, processData.uuid);
    }

    public final int component1() {
        return this.pid;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ProcessData copy(int i, String str) {
        str.getClass();
        return new ProcessData(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) obj;
        if (this.pid == processData.pid && sg3.e(this.uuid, processData.uuid)) {
            return true;
        }
        return false;
    }

    public final int getPid() {
        return this.pid;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode() + (Integer.hashCode(this.pid) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.pid);
        sb.append(", uuid=");
        return hl6.o(sb, this.uuid, ')');
    }

    public ProcessData(int i, String str) {
        str.getClass();
        this.pid = i;
        this.uuid = str;
    }
}
