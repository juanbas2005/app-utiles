package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wb9 {
    public static final wb9 c;
    public final UUID a;
    public final AtomicLong b;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            c = new wb9(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public wb9(UUID uuid, long j) {
        this.a = uuid;
        this.b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    public final UUID b() {
        UUID uuid = this.a;
        return new UUID((a() & -61441) ^ uuid.getMostSignificantBits(), (a() >>> 2) ^ uuid.getLeastSignificantBits());
    }
}
