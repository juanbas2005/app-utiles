package defpackage;

import android.content.Context;

/* renamed from: gc2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gc2 {
    public final j77 a;
    public final dv7 b;
    public final Context c;
    public final h81 d;

    public gc2(j77 j77, dv7 dv7, Context context, h81 h81) {
        j77.getClass();
        dv7.getClass();
        this.a = j77;
        this.b = dv7;
        this.c = context;
        this.d = h81;
    }

    public static final String a(gc2 gc2) {
        Object obj;
        Context context = gc2.c;
        try {
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (obj instanceof m66) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(b56 b56, String str, Throwable th, h61 h61) {
        ec2 ec2;
        int i;
        if (h61 instanceof ec2) {
            ec2 = (ec2) h61;
            int i2 = ec2.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ec2.B = i2 - Integer.MIN_VALUE;
                Object obj = ec2.z;
                i = ec2.B;
                if (i != 0) {
                    o85.q(obj);
                    fc2 fc2 = new fc2(this, b56, str, th, (f61) null);
                    ec2.B = 1;
                    obj = ar7.e0(this.d, fc2, ec2);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((o66) obj).w;
            }
        }
        ec2 = new ec2(this, h61);
        Object obj2 = ec2.z;
        i = ec2.B;
        if (i != 0) {
        }
        return ((o66) obj2).w;
    }
}
