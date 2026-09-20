package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class InvalidProtocolBufferException extends IOException {
    public boolean w;

    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException, java.io.IOException] */
    public static InvalidWireTypeException b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.InvalidProtocolBufferException, java.io.IOException] */
    public static InvalidProtocolBufferException e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
