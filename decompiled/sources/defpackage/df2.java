package defpackage;

/* renamed from: df2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class df2 extends pf5 {
    public static final rg c = rg.d();
    public final ir b;

    public df2(ir irVar) {
        this.b = irVar;
    }

    public final boolean a() {
        rg rgVar = c;
        ir irVar = this.b;
        if (irVar == null) {
            rgVar.f("ApplicationInfo is null");
        } else if (!irVar.C()) {
            rgVar.f("GoogleAppId is null");
        } else if (!irVar.A()) {
            rgVar.f("AppInstanceId is null");
        } else if (!irVar.B()) {
            rgVar.f("ApplicationProcessState is null");
        } else if (!irVar.z()) {
            return true;
        } else {
            if (!irVar.x().w()) {
                rgVar.f("AndroidAppInfo.packageName is null");
            } else if (irVar.x().x()) {
                return true;
            } else {
                rgVar.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        rgVar.f("ApplicationInfo is invalid");
        return false;
    }
}
