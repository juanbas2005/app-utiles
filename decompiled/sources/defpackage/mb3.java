package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: mb3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mb3 implements oy6 {
    public final zw5 w;
    public final Inflater x;
    public int y;
    public boolean z;

    public mb3(zw5 zw5, Inflater inflater) {
        this.w = zw5;
        this.x = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0081 A[SYNTHETIC] */
    public final long Y(long j, sc0 sc0) {
        zw5 zw5;
        long j2;
        sc0.getClass();
        do {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                h.j(f21.f(j, "byteCount < 0: "));
                return 0;
            } else if (!this.z) {
                zw5 = this.w;
                Inflater inflater = this.x;
                if (i != 0) {
                    try {
                        qi6 V = sc0.V(1);
                        int min = (int) Math.min(j, (long) (8192 - V.c));
                        if (inflater.needsInput()) {
                            if (!zw5.x()) {
                                qi6 qi6 = zw5.x.w;
                                qi6.getClass();
                                int i2 = qi6.c;
                                int i3 = qi6.b;
                                int i4 = i2 - i3;
                                this.y = i4;
                                inflater.setInput(qi6.a, i3, i4);
                            }
                        }
                        int inflate = inflater.inflate(V.a, V.c, min);
                        int i5 = this.y;
                        if (i5 != 0) {
                            int remaining = i5 - inflater.getRemaining();
                            this.y -= remaining;
                            zw5.skip((long) remaining);
                        }
                        if (inflate > 0) {
                            V.c += inflate;
                            j2 = (long) inflate;
                            sc0.x += j2;
                            if (j2 <= 0) {
                                return j2;
                            }
                            if (inflater.finished() || inflater.needsDictionary()) {
                                return -1;
                            }
                        } else if (V.b == V.c) {
                            sc0.w = V.a();
                            ti6.a(V);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                j2 = 0;
                if (j2 <= 0) {
                }
            } else {
                h.s("closed");
                return 0;
            }
        } while (!zw5.x());
        throw new EOFException("source exhausted prematurely");
    }

    public final void close() {
        if (!this.z) {
            this.x.end();
            this.z = true;
            this.w.close();
        }
    }

    public final ri7 g() {
        return this.w.w.g();
    }
}
