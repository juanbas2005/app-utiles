package defpackage;

import kotlinx.datetime.DateTimePeriod;

/* renamed from: wi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wi1 extends DateTimePeriod {
    public final long a;
    public final int b;
    public final long c;

    public wi1(int i, long j, long j2) {
        super((hl1) null);
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    public final int getDays() {
        return this.b;
    }

    public final long getTotalMonths$kotlinx_datetime() {
        return this.a;
    }

    public final long getTotalNanoseconds$kotlinx_datetime() {
        return this.c;
    }
}
