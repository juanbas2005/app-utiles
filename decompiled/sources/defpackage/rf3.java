package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: rf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rf3 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        if (length >= 0) {
            int i = (0 - 0) + length;
            if (i < 0) {
                throw new IOException("Failed to parse the message.");
            } else if (i > Integer.MAX_VALUE) {
                try {
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        } else {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
