package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class InvalidProtocolBufferException extends IOException {
    public k2 w = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(wu2 wu2) {
        this.w = wu2;
    }
}
