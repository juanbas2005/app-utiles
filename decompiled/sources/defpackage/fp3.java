package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: fp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp3 {
    public final /* synthetic */ int a;

    static {
        y92 y92 = y92.b;
    }

    public /* synthetic */ fp3(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
     */
    public final k2 a(ByteArrayInputStream byteArrayInputStream, y92 y92) {
        k2 k2Var;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                k2Var = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        if (i >= 32) {
                            break;
                        }
                        int read2 = byteArrayInputStream.read();
                        if (read2 != -1) {
                            read |= (read2 & 127) << i;
                            if ((read2 & 128) == 0) {
                                break;
                            }
                            i += 7;
                        } else {
                            throw InvalidProtocolBufferException.b();
                        }
                    }
                }
                ts0 ts0 = new ts0(new j2(byteArrayInputStream, read));
                k2Var = (k2) b(ts0, y92);
                try {
                    ts0.a(0);
                } catch (InvalidProtocolBufferException e) {
                    e.w = k2Var;
                    throw e;
                }
            }
            if (k2Var == null || k2Var.a()) {
                return k2Var;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.w = k2Var;
            throw invalidProtocolBufferException;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    public final Object b(ts0 ts0, y92 y92) {
        switch (this.a) {
            case b85.b:
                return new hp3(ts0);
            case 1:
                return new ip3(ts0);
            case 2:
                return new kp3(ts0, y92);
            case 3:
                return new pp3(ts0, y92);
            case 4:
                return new op3(ts0);
            case 5:
                return new qr5(ts0, y92);
            case 6:
                return new or5(ts0, y92);
            case 7:
                return new nr5(ts0, y92);
            case 8:
                return new tr5(ts0, y92);
            case 9:
                return new ur5(ts0);
            case 10:
                return new wr5(ts0, y92);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new yr5(ts0, y92);
            case 12:
                return new cs5(ts0, y92);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new es5(ts0, y92);
            case 14:
                return new hs5(ts0, y92);
            case h75.g /*15*/:
                return new js5(ts0, y92);
            case 16:
                return new ns5(ts0, y92);
            case 17:
                return new os5(ts0, y92);
            case 18:
                return new qs5(ts0, y92);
            case 19:
                return new us5(ts0, y92);
            case 20:
                return new ts5(ts0);
            case 21:
                return new ws5(ts0);
            case 22:
                return new bt5(ts0, y92);
            case 23:
                return new zs5(ts0, y92);
            case 24:
                return new dt5(ts0, y92);
            case 25:
                return new gt5(ts0, y92);
            case 26:
                return new ht5(ts0, y92);
            case 27:
                return new jt5(ts0, y92);
            case 28:
                return new nt5(ts0);
            default:
                return new ot5(ts0, y92);
        }
    }
}
