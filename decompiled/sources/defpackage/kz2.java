package defpackage;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: kz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kz2 {
    public static final in5 b = new in5("fire-global");
    public static final in5 c = new in5("fire-count");
    public static final in5 d = new in5("last-used-date");
    public final ji3 a;

    public kz2(Context context, String str) {
        this.a = new ji3(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant l = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime m = l.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return m.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static in5 c(pp4 pp4, String str) {
        for (Map.Entry entry : pp4.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String equals : (Set) entry.getValue()) {
                    if (str.equals(equals)) {
                        String str2 = ((in5) entry.getKey()).a;
                        str2.getClass();
                        return new in5(str2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void d(pp4 pp4, String str) {
        in5 c2 = c(pp4, str);
        if (c2 != null) {
            HashSet hashSet = new HashSet((Collection) ie1.K(pp4, c2, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                pp4.b();
                pp4.a.remove(c2);
                return;
            }
            pp4.d(c2, hashSet);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.util.ArrayList a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = b(r1)     // Catch:{ all -> 0x0069 }
            ji3 r2 = r6.a     // Catch:{ all -> 0x0069 }
            r2.getClass()     // Catch:{ all -> 0x0069 }
            ot r3 = new ot     // Catch:{ all -> 0x0069 }
            r4 = 10
            r5 = 0
            r3.<init>(r2, r5, r4)     // Catch:{ all -> 0x0069 }
            x32 r2 = defpackage.x32.w     // Catch:{ all -> 0x0069 }
            java.lang.Object r2 = defpackage.ar7.U(r2, r3)     // Catch:{ all -> 0x0069 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0069 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0069 }
        L_0x002b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0069 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0069 }
            boolean r4 = r4 instanceof java.util.Set     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x002b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0069 }
            java.lang.Object r5 = r3.getValue()     // Catch:{ all -> 0x0069 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x0069 }
            r4.<init>(r5)     // Catch:{ all -> 0x0069 }
            r4.remove(r1)     // Catch:{ all -> 0x0069 }
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r5 != 0) goto L_0x002b
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x0069 }
            in5 r3 = (defpackage.in5) r3     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0069 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0069 }
            r5.<init>(r4)     // Catch:{ all -> 0x0069 }
            u00 r4 = new u00     // Catch:{ all -> 0x0069 }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0069 }
            r0.add(r4)     // Catch:{ all -> 0x0069 }
            goto L_0x002b
        L_0x0069:
            r0 = move-exception
            goto L_0x0081
        L_0x006b:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0069 }
            monitor-enter(r6)     // Catch:{ all -> 0x0069 }
            ji3 r3 = r6.a     // Catch:{ all -> 0x007e }
            hf r4 = new hf     // Catch:{ all -> 0x007e }
            r5 = 3
            r4.<init>(r1, r5)     // Catch:{ all -> 0x007e }
            r3.a(r4)     // Catch:{ all -> 0x007e }
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            monitor-exit(r6)
            return r0
        L_0x007e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0081:
            monitor-exit(r6)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz2.a():java.util.ArrayList");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized boolean e(in5 in5, long j) {
        try {
            ji3 ji3 = this.a;
            ji3.getClass();
            in5.getClass();
            ju1 ju1 = new ju1(ji3, in5, (f61) null, 15);
            x32 x32 = x32.w;
            if (b(((Long) ar7.U(x32, ju1)).longValue()).equals(b(j))) {
                return false;
            }
            ji3 ji32 = this.a;
            Long valueOf = Long.valueOf(j);
            ji32.getClass();
            pp4 pp4 = (pp4) ar7.U(x32, new ii3((Object) ji32, (Object) in5, (Object) valueOf, (f61) null, 0));
            return true;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
