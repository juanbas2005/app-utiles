package io.github.jan.supabase.auth.jwt;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 02\u00020\u0001:\u000212B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u0012\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8FX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lio/github/jan/supabase/auth/jwt/AMREntry;", "", "Lio/github/jan/supabase/auth/jwt/AMRMethod;", "method", "", "timestampInt", "<init>", "(Lio/github/jan/supabase/auth/jwt/AMRMethod;J)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILio/github/jan/supabase/auth/jwt/AMRMethod;JLrl6;)V", "component2", "()J", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/jwt/AMREntry;Lhy0;Lll6;)V", "write$Self", "component1", "()Lio/github/jan/supabase/auth/jwt/AMRMethod;", "copy", "(Lio/github/jan/supabase/auth/jwt/AMRMethod;J)Lio/github/jan/supabase/auth/jwt/AMREntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/github/jan/supabase/auth/jwt/AMRMethod;", "getMethod", "J", "getTimestampInt$annotations", "()V", "Lqd3;", "timestamp$delegate", "Lnz3;", "getTimestamp", "()Lqd3;", "timestamp", "Companion", "q", "r", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AMREntry {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new o(0)), null};
    public static final r Companion = new Object();
    private final AMRMethod method;
    private final nz3 timestamp$delegate;
    private final long timestampInt;

    public AMREntry(int i, AMRMethod aMRMethod, long j, rl6 rl6) {
        if (3 == (i & 3)) {
            this.method = aMRMethod;
            this.timestampInt = j;
            this.timestamp$delegate = new z97(new p(this, 0));
            return;
        }
        wn6.x(i, 3, q.a.getDescriptor());
        throw null;
    }

    /* access modifiers changed from: private */
    public static final qd3 _init_$lambda$0(AMREntry aMREntry) {
        qd3 qd3 = qd3.y;
        return tz2.i(aMREntry.timestampInt, 0);
    }

    private final long component2() {
        return this.timestampInt;
    }

    public static /* synthetic */ AMREntry copy$default(AMREntry aMREntry, AMRMethod aMRMethod, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            aMRMethod = aMREntry.method;
        }
        if ((i & 2) != 0) {
            j = aMREntry.timestampInt;
        }
        return aMREntry.copy(aMRMethod, j);
    }

    /* access modifiers changed from: private */
    public static final qd3 timestamp_delegate$lambda$0(AMREntry aMREntry) {
        qd3 qd3 = qd3.y;
        return tz2.i(aMREntry.timestampInt, 0);
    }

    public static final /* synthetic */ void write$Self$auth_kt(AMREntry aMREntry, hy0 hy0, ll6 ll6) {
        hy0.o(ll6, 0, (zr3) $childSerializers[0].getValue(), aMREntry.method);
        hy0.j(ll6, 1, aMREntry.timestampInt);
    }

    public final AMRMethod component1() {
        return this.method;
    }

    public final AMREntry copy(AMRMethod aMRMethod, long j) {
        aMRMethod.getClass();
        return new AMREntry(aMRMethod, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AMREntry)) {
            return false;
        }
        AMREntry aMREntry = (AMREntry) obj;
        if (this.method == aMREntry.method && this.timestampInt == aMREntry.timestampInt) {
            return true;
        }
        return false;
    }

    public final AMRMethod getMethod() {
        return this.method;
    }

    public final qd3 getTimestamp() {
        return (qd3) this.timestamp$delegate.getValue();
    }

    public int hashCode() {
        return Long.hashCode(this.timestampInt) + (this.method.hashCode() * 31);
    }

    public String toString() {
        return "AMREntry(method=" + this.method + ", timestampInt=" + this.timestampInt + ')';
    }

    private static /* synthetic */ void getTimestampInt$annotations() {
    }

    public AMREntry(AMRMethod aMRMethod, long j) {
        aMRMethod.getClass();
        this.method = aMRMethod;
        this.timestampInt = j;
        this.timestamp$delegate = new z97(new p(this, 1));
    }
}
