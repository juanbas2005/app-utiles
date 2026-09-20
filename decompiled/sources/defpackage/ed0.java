package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: ed0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface ed0 extends oy6, ReadableByteChannel {
    long C(byte b, long j, long j2);

    String H(long j);

    String Q(Charset charset);

    sc0 c();

    boolean c0(long j, dg0 dg0);

    long d0(yw5 yw5);

    boolean j(long j);

    InputStream l0();

    void p(long j);

    dg0 q(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    int z(u75 u75);
}
