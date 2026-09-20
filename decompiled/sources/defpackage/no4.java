package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: no4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class no4 {
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public final int b = 16;
    public final int c = 16;
    public long d = 0;
    public long e = 0;
    public int f = 0;

    public final void a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long rotateLeft = (Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L) ^ this.d;
        this.d = rotateLeft;
        long rotateLeft2 = Long.rotateLeft(rotateLeft, 27);
        long j3 = this.e;
        this.d = ((rotateLeft2 + j3) * 5) + 1390208809;
        long rotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * -8663945395140668459L) ^ j3;
        this.e = rotateLeft3;
        this.e = ((Long.rotateLeft(rotateLeft3, 31) + this.d) * 5) + 944331445;
        this.f += 16;
    }

    public final no4 c(byte[] bArr) {
        ByteBuffer order = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int remaining = order.remaining();
        ByteBuffer byteBuffer = this.a;
        if (remaining <= byteBuffer.remaining()) {
            byteBuffer.put(order);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int position = this.b - byteBuffer.position();
        for (int i = 0; i < position; i++) {
            byteBuffer.put(order.get());
        }
        a();
        while (order.remaining() >= this.c) {
            b(order);
        }
        byteBuffer.put(order);
        return this;
    }
}
