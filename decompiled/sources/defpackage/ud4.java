package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;

/* renamed from: ud4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ud4 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ boolean B;
    public /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ud4(int i, f61 f61, int i2) {
        super(i, f61);
        this.A = i2;
    }

    public final Object s(Object obj) {
        DarkThemeConfigPreferences darkThemeConfigPreferences;
        boolean z;
        switch (this.A) {
            case b85.b:
                boolean z2 = this.B;
                o85.q(obj);
                int i = ee4.a;
                int i2 = de4.a[((UserDataPreferences) ((is7) this.C).a).getDarkThemeConfigPreferences().ordinal()];
                boolean z3 = true;
                if (i2 != 1) {
                    if (i2 == 2) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.LIGHT;
                    } else if (i2 == 3) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.DARK;
                    } else if (i2 == 4) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.AMOLED;
                    } else {
                        h.c();
                        return null;
                    }
                } else if (z2) {
                    darkThemeConfigPreferences = DarkThemeConfigPreferences.DARK;
                } else {
                    darkThemeConfigPreferences = DarkThemeConfigPreferences.LIGHT;
                }
                if (darkThemeConfigPreferences != DarkThemeConfigPreferences.LIGHT) {
                    z = true;
                } else {
                    z = false;
                }
                if (darkThemeConfigPreferences != DarkThemeConfigPreferences.AMOLED) {
                    z3 = false;
                }
                return new dh7(z, z3);
            default:
                boolean z4 = this.B;
                o85.q(obj);
                return new yb5(Boolean.valueOf(z4), (String) this.C);
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case b85.b:
                boolean booleanValue = bool.booleanValue();
                ud4 ud4 = new ud4(3, (f61) obj3, 0);
                ud4.B = booleanValue;
                ud4.C = (is7) obj2;
                return ud4.s(vs7);
            default:
                boolean booleanValue2 = bool.booleanValue();
                ud4 ud42 = new ud4(3, (f61) obj3, 1);
                ud42.B = booleanValue2;
                ud42.C = (String) obj2;
                return ud42.s(vs7);
        }
    }
}
