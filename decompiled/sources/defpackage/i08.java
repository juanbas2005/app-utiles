package defpackage;

import java.time.ZoneOffset;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/* renamed from: i08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class i08 implements TemporalQuery {
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return ZoneOffset.from(temporalAccessor);
    }
}
