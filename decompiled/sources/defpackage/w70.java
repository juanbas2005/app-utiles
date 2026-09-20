package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: w70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w70 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public x70 a() {
        return new x70(this.a, (String) this.c, (String) this.d, this.b, (String) null, (ArrayList) null, false);
    }

    public n11 b() {
        return new n11(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void c(tp0... tp0Arr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(tp0Arr.length);
            for (tp0 tp0 : tp0Arr) {
                arrayList.add(tp0.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!this.a) {
                h.q("no cipher suites for cleartext connections");
            } else if (strArr2.length != 0) {
                this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                h.q("At least one cipher suite is required");
            }
        } else {
            h.q("no cipher suites for cleartext connections");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [java.lang.String[], java.io.Serializable] */
    public void d(bj7... bj7Arr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(bj7Arr.length);
            for (bj7 bj7 : bj7Arr) {
                arrayList.add(bj7.w);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (!this.a) {
                h.q("no TLS versions for cleartext connections");
            } else if (strArr2.length != 0) {
                this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                h.q("At least one TLS version is required");
            }
        } else {
            h.q("no TLS versions for cleartext connections");
        }
    }
}
