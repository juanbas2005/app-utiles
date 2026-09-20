package defpackage;

import java.nio.channels.WritableByteChannel;

/* renamed from: dd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public interface dd0 extends tu6, WritableByteChannel {
    dd0 N(String str);

    sc0 c();

    dd0 f0(dg0 dg0);

    void flush();

    long t(oy6 oy6);

    dd0 write(byte[] bArr);

    dd0 write(byte[] bArr, int i, int i2);

    dd0 writeByte(int i);

    dd0 writeInt(int i);

    dd0 writeShort(int i);
}
