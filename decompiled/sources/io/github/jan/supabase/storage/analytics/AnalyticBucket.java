package io.github.jan.supabase.storage.analytics;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 32\u00020\u0001:\u000245B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001e¨\u00066"}, d2 = {"Lio/github/jan/supabase/storage/analytics/AnalyticBucket;", "", "", "name", "type", "format", "Lqd3;", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/analytics/AnalyticBucket;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lqd3;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqd3;Lqd3;)Lio/github/jan/supabase/storage/analytics/AnalyticBucket;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getType", "getFormat", "Lqd3;", "getCreatedAt", "getCreatedAt$annotations", "()V", "getUpdatedAt", "getUpdatedAt$annotations", "Companion", "xb", "yb", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class AnalyticBucket {
    public static final yb Companion = new Object();
    private final qd3 createdAt;
    private final String format;
    private final String name;
    private final String type;
    private final qd3 updatedAt;

    public /* synthetic */ AnalyticBucket(int i, String str, String str2, String str3, qd3 qd3, qd3 qd32, rl6 rl6) {
        if (31 == (i & 31)) {
            this.name = str;
            this.type = str2;
            this.format = str3;
            this.createdAt = qd3;
            this.updatedAt = qd32;
            return;
        }
        wn6.x(i, 31, xb.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ AnalyticBucket copy$default(AnalyticBucket analyticBucket, String str, String str2, String str3, qd3 qd3, qd3 qd32, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticBucket.name;
        }
        if ((i & 2) != 0) {
            str2 = analyticBucket.type;
        }
        if ((i & 4) != 0) {
            str3 = analyticBucket.format;
        }
        if ((i & 8) != 0) {
            qd3 = analyticBucket.createdAt;
        }
        if ((i & 16) != 0) {
            qd32 = analyticBucket.updatedAt;
        }
        qd3 qd33 = qd3;
        qd3 qd34 = qd32;
        return analyticBucket.copy(str, str2, str3, qd33, qd34);
    }

    public static final /* synthetic */ void write$Self$storage_kt(AnalyticBucket analyticBucket, hy0 hy0, ll6 ll6) {
        hy0.x(ll6, 0, analyticBucket.name);
        hy0.x(ll6, 1, analyticBucket.type);
        hy0.x(ll6, 2, analyticBucket.format);
        wd3 wd3 = wd3.a;
        hy0.o(ll6, 3, wd3, analyticBucket.createdAt);
        hy0.o(ll6, 4, wd3, analyticBucket.updatedAt);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.format;
    }

    public final qd3 component4() {
        return this.createdAt;
    }

    public final qd3 component5() {
        return this.updatedAt;
    }

    public final AnalyticBucket copy(String str, String str2, String str3, qd3 qd3, qd3 qd32) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd3.getClass();
        qd32.getClass();
        return new AnalyticBucket(str, str2, str3, qd3, qd32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticBucket)) {
            return false;
        }
        AnalyticBucket analyticBucket = (AnalyticBucket) obj;
        if (sg3.e(this.name, analyticBucket.name) && sg3.e(this.type, analyticBucket.type) && sg3.e(this.format, analyticBucket.format) && sg3.e(this.createdAt, analyticBucket.createdAt) && sg3.e(this.updatedAt, analyticBucket.updatedAt)) {
            return true;
        }
        return false;
    }

    public final qd3 getCreatedAt() {
        return this.createdAt;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final qd3 getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int h = hl6.h(hl6.h(this.name.hashCode() * 31, 31, this.type), 31, this.format);
        return this.updatedAt.hashCode() + ((this.createdAt.hashCode() + h) * 31);
    }

    public String toString() {
        return "AnalyticBucket(name=" + this.name + ", type=" + this.type + ", format=" + this.format + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ')';
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public AnalyticBucket(String str, String str2, String str3, qd3 qd3, qd3 qd32) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        qd3.getClass();
        qd32.getClass();
        this.name = str;
        this.type = str2;
        this.format = str3;
        this.createdAt = qd3;
        this.updatedAt = qd32;
    }
}
