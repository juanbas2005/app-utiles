package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: gv5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv5 implements Closeable {
    public static final Logger C = Logger.getLogger(gv5.class.getName());
    public dv5 A;
    public final byte[] B;
    public final RandomAccessFile w;
    public int x;
    public int y;
    public dv5 z;

    /* JADX INFO: finally extract failed */
    public gv5(File file) {
        byte[] bArr = new byte[16];
        this.B = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    M(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    rf2.i("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.w = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int v = v(0, bArr);
        this.x = v;
        if (((long) v) <= randomAccessFile2.length()) {
            this.y = v(4, bArr);
            int v2 = v(8, bArr);
            int v3 = v(12, bArr);
            this.z = u(v2);
            this.A = u(v3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.x + ", Actual length: " + randomAccessFile2.length());
    }

    public static void M(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int v(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void B() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.o()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0068
            int r0 = r7.y     // Catch:{ all -> 0x0066 }
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0034
            monitor-enter(r7)     // Catch:{ all -> 0x0066 }
            r0 = 4096(0x1000, float:5.74E-42)
            r7.L(r0, r1, r1, r1)     // Catch:{ all -> 0x0031 }
            r7.y = r1     // Catch:{ all -> 0x0031 }
            dv5 r1 = defpackage.dv5.d     // Catch:{ all -> 0x0031 }
            r7.z = r1     // Catch:{ all -> 0x0031 }
            r7.A = r1     // Catch:{ all -> 0x0031 }
            int r1 = r7.x     // Catch:{ all -> 0x0031 }
            if (r1 <= r0) goto L_0x002d
            java.io.RandomAccessFile r1 = r7.w     // Catch:{ all -> 0x0031 }
            r3 = 4096(0x1000, double:2.0237E-320)
            r1.setLength(r3)     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0031 }
            r1.force(r2)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            r7.x = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            goto L_0x0064
        L_0x0031:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0034:
            dv5 r0 = r7.z     // Catch:{ all -> 0x0066 }
            int r3 = r0.b     // Catch:{ all -> 0x0066 }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.c     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            int r0 = r7.I(r3)     // Catch:{ all -> 0x0066 }
            byte[] r3 = r7.B     // Catch:{ all -> 0x0066 }
            r7.D(r0, r1, r4, r3)     // Catch:{ all -> 0x0066 }
            byte[] r3 = r7.B     // Catch:{ all -> 0x0066 }
            int r3 = v(r1, r3)     // Catch:{ all -> 0x0066 }
            int r4 = r7.x     // Catch:{ all -> 0x0066 }
            int r5 = r7.y     // Catch:{ all -> 0x0066 }
            int r5 = r5 - r2
            dv5 r6 = r7.A     // Catch:{ all -> 0x0066 }
            int r6 = r6.b     // Catch:{ all -> 0x0066 }
            r7.L(r4, r5, r0, r6)     // Catch:{ all -> 0x0066 }
            int r4 = r7.y     // Catch:{ all -> 0x0066 }
            int r4 = r4 - r2
            r7.y = r4     // Catch:{ all -> 0x0066 }
            dv5 r2 = new dv5     // Catch:{ all -> 0x0066 }
            r2.<init>(r0, r3, r1)     // Catch:{ all -> 0x0066 }
            r7.z = r2     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r7)
            return
        L_0x0066:
            r0 = move-exception
            goto L_0x006e
        L_0x0068:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x006e:
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv5.B():void");
    }

    public final void D(int i, int i2, int i3, byte[] bArr) {
        int I = I(i);
        int i4 = I + i3;
        int i5 = this.x;
        RandomAccessFile randomAccessFile = this.w;
        if (i4 <= i5) {
            randomAccessFile.seek((long) I);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - I;
        randomAccessFile.seek((long) I);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void E(byte[] bArr, int i, int i2) {
        int I = I(i);
        int i3 = I + i2;
        int i4 = this.x;
        RandomAccessFile randomAccessFile = this.w;
        if (i3 <= i4) {
            randomAccessFile.seek((long) I);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - I;
        randomAccessFile.seek((long) I);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int G() {
        if (this.y == 0) {
            return 16;
        }
        dv5 dv5 = this.A;
        int i = dv5.b;
        int i2 = this.z.b;
        if (i >= i2) {
            return (i - i2) + 4 + dv5.c + 16;
        }
        return (((i + 4) + dv5.c) + this.x) - i2;
    }

    public final int I(int i) {
        int i2 = this.x;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    public final void L(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.B;
            if (i5 < 4) {
                M(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            } else {
                RandomAccessFile randomAccessFile = this.w;
                randomAccessFile.seek(0);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final void a(byte[] bArr) {
        int i;
        int i2;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    k(length);
                    boolean o = o();
                    if (o) {
                        i = 16;
                    } else {
                        dv5 dv5 = this.A;
                        i = I(dv5.b + 4 + dv5.c);
                    }
                    dv5 dv52 = new dv5(i, length, 0);
                    M(this.B, 0, length);
                    E(this.B, i, 4);
                    E(bArr, i + 4, length);
                    if (o) {
                        i2 = i;
                    } else {
                        i2 = this.z.b;
                    }
                    L(this.x, this.y + 1, i2, i);
                    this.A = dv52;
                    this.y++;
                    if (o) {
                        this.z = dv52;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void close() {
        this.w.close();
    }

    public final void k(int i) {
        int i2 = i + 4;
        int G = this.x - G();
        if (G < i2) {
            int i3 = this.x;
            do {
                G += i3;
                i3 <<= 1;
            } while (G < i2);
            RandomAccessFile randomAccessFile = this.w;
            randomAccessFile.setLength((long) i3);
            randomAccessFile.getChannel().force(true);
            dv5 dv5 = this.A;
            int I = I(dv5.b + 4 + dv5.c);
            if (I < this.z.b) {
                FileChannel channel = randomAccessFile.getChannel();
                channel.position((long) this.x);
                long j = (long) (I - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.A.b;
            int i5 = this.z.b;
            if (i4 < i5) {
                int i6 = (this.x + i4) - 16;
                L(i3, this.y, i5, i6);
                this.A = new dv5(i6, this.A.c, 0);
            } else {
                L(i3, this.y, i5, i4);
            }
            this.x = i3;
        }
    }

    public final synchronized void l(fv5 fv5) {
        int i = this.z.b;
        for (int i2 = 0; i2 < this.y; i2++) {
            dv5 u = u(i);
            fv5.a(new ev5(this, u), u.c);
            i = I(u.b + 4 + u.c);
        }
    }

    public final synchronized boolean o() {
        boolean z2;
        if (this.y == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(gv5.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.x);
        sb.append(", size=");
        sb.append(this.y);
        sb.append(", first=");
        sb.append(this.z);
        sb.append(", last=");
        sb.append(this.A);
        sb.append(", element lengths=[");
        try {
            l(new v70(7, (Object) sb));
        } catch (IOException e) {
            C.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final dv5 u(int i) {
        if (i == 0) {
            return dv5.d;
        }
        RandomAccessFile randomAccessFile = this.w;
        randomAccessFile.seek((long) i);
        return new dv5(i, randomAccessFile.readInt(), 0);
    }
}
