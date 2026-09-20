package kotlinx.datetime;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00068FX\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\bR\u001a\u0010(\u001a\u00020\u00138FX\u0004¢\u0006\f\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u001b¨\u0006+"}, d2 = {"Lkotlinx/datetime/Instant;", "", "Ljava/time/Instant;", "value", "<init>", "(Ljava/time/Instant;)V", "", "toEpochMilliseconds", "()J", "Lu02;", "duration", "plus-LRDsOJo", "(J)Lkotlinx/datetime/Instant;", "plus", "minus-LRDsOJo", "minus", "other", "minus-5sfh64U", "(Lkotlinx/datetime/Instant;)J", "", "compareTo", "(Lkotlinx/datetime/Instant;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/Instant;", "getValue$kotlinx_datetime", "()Ljava/time/Instant;", "getEpochSeconds", "getEpochSeconds$annotations", "()V", "epochSeconds", "getNanosecondsOfSecond", "getNanosecondsOfSecond$annotations", "nanosecondsOfSecond", "Companion", "pd3", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = xd3.class)
@fq1
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Instant implements Comparable<Instant> {
    public static final pd3 Companion = new Object();
    /* access modifiers changed from: private */
    public static final Instant DISTANT_FUTURE;
    /* access modifiers changed from: private */
    public static final Instant DISTANT_PAST;
    /* access modifiers changed from: private */
    public static final Instant MAX;
    /* access modifiers changed from: private */
    public static final Instant MIN;
    private final java.time.Instant value;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, pd3] */
    static {
        java.time.Instant u = java.time.Instant.ofEpochSecond(-3217862419201L, 999999999);
        u.getClass();
        DISTANT_PAST = new Instant(u);
        java.time.Instant A = java.time.Instant.ofEpochSecond(3093527980800L, 0);
        A.getClass();
        DISTANT_FUTURE = new Instant(A);
        java.time.Instant C = java.time.Instant.MIN;
        C.getClass();
        MIN = new Instant(C);
        java.time.Instant D = java.time.Instant.MAX;
        D.getClass();
        MAX = new Instant(D);
    }

    public Instant(java.time.Instant instant) {
        instant.getClass();
        this.value = instant;
    }

    @fq1
    public int compareTo(Instant instant) {
        instant.getClass();
        return this.value.compareTo(instant.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant) || !sg3.e(this.value, ((Instant) obj).value)) {
            return false;
        }
        return true;
    }

    public final long getEpochSeconds() {
        return this.value.getEpochSecond();
    }

    public final int getNanosecondsOfSecond() {
        return this.value.getNano();
    }

    public final java.time.Instant getValue$kotlinx_datetime() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @fq1
    /* renamed from: minus-5sfh64U  reason: not valid java name */
    public final long m54minus5sfh64U(Instant instant) {
        instant.getClass();
        xb4 xb4 = u02.x;
        return u02.h(gl0.f0(this.value.getEpochSecond() - instant.value.getEpochSecond(), y02.SECONDS), gl0.e0(this.value.getNano() - instant.value.getNano(), y02.NANOSECONDS));
    }

    @fq1
    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public final Instant m55minusLRDsOJo(long j) {
        return m56plusLRDsOJo(u02.l(j));
    }

    @fq1
    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public final Instant m56plusLRDsOJo(long j) {
        xb4 xb4 = u02.x;
        try {
            java.time.Instant l = this.value.plusSeconds(u02.j(j, y02.SECONDS)).plusNanos((long) u02.f(j));
            l.getClass();
            return new Instant(l);
        } catch (Exception e) {
            if (!(e instanceof ArithmeticException) && !fb3.p(e)) {
                throw e;
            } else if (j > 0) {
                return MAX;
            } else {
                return MIN;
            }
        }
    }

    @fq1
    public final long toEpochMilliseconds() {
        try {
            return this.value.toEpochMilli();
        } catch (ArithmeticException unused) {
            java.time.Instant instant = this.value;
            java.time.Instant unused2 = java.time.Instant.EPOCH;
            if (instant.isAfter(java.time.Instant.EPOCH)) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
    }

    @fq1
    public String toString() {
        String g = this.value.toString();
        g.getClass();
        return g;
    }

    @fq1
    public static /* synthetic */ void getEpochSeconds$annotations() {
    }

    @fq1
    public static /* synthetic */ void getNanosecondsOfSecond$annotations() {
    }
}
