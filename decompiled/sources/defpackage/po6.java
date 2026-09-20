package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;

/* renamed from: po6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class po6 {
    public static final /* synthetic */ int[] a;

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|26) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003b */
    static {
        int[] iArr = new int[DarkThemeConfigPreferences.values().length];
        try {
            iArr[DarkThemeConfigPreferences.FOLLOW_SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DarkThemeConfigPreferences.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DarkThemeConfigPreferences.DARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DarkThemeConfigPreferences.AMOLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ae1.values().length];
        iArr2[0] = 1;
        iArr2[1] = 2;
        iArr2[2] = 3;
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
