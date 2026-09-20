package cu.lestebang.utiletecsa.core.preferences.model;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"cu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences.$serializer", "Lav2;", "Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "<init>", "()V", "Lj42;", "encoder", "value", "Lvs7;", "serialize", "(Lj42;Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;)V", "Lok1;", "decoder", "deserialize", "(Lok1;)Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;", "", "Lzr3;", "childSerializers", "()[Lzr3;", "Lll6;", "descriptor", "Lll6;", "getDescriptor", "()Lll6;", "preferences"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fq1
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class UserDataPreferences$$serializer implements av2 {
    public static final UserDataPreferences$$serializer INSTANCE;
    private static final ll6 descriptor;

    static {
        UserDataPreferences$$serializer userDataPreferences$$serializer = new UserDataPreferences$$serializer();
        INSTANCE = userDataPreferences$$serializer;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences", userDataPreferences$$serializer, 64);
        ik5.k("id", true);
        ik5.k("userName", true);
        ik5.k("profilePictureUriString", true);
        ik5.k("darkThemeConfigPreferences", true);
        ik5.k("useDynamicColor", true);
        ik5.k("ussdRefreshModeEnabled", true);
        ik5.k("defaultSimSlot", true);
        ik5.k("showEtecsaBanner", true);
        ik5.k("homeCollapsedSections", true);
        ik5.k("balanceSecondaryInfo", true);
        ik5.k("planExpiryNotifyEnabled", true);
        ik5.k("appLockEnabled", true);
        ik5.k("termsAccepted", true);
        ik5.k("forumTermsAccepted", true);
        ik5.k("permissionsRequestedOnce", true);
        ik5.k("blockAnonymousCalls", true);
        ik5.k("blockRevertidaCalls", true);
        ik5.k("blockFijoCalls", true);
        ik5.k("blockUnknownCalls", true);
        ik5.k("blockAllCalls", true);
        ik5.k("callAlertAllCalls", true);
        ik5.k("callAlertRevertidaCalls", true);
        ik5.k("planExpiryNotified", true);
        ik5.k("appUpdateNotifiedVersion", true);
        ik5.k("saldoUssdSim1", true);
        ik5.k("saldoUssdSim2", true);
        ik5.k("asterisco99History", true);
        ik5.k("transferPin", true);
        ik5.k("planesSinConfirmacion", true);
        ik5.k("nautaLogoutUrl", true);
        ik5.k("nautaCookies", true);
        ik5.k("nautaSessionUser", true);
        ik5.k("nautaSessionAvailableTime", true);
        ik5.k("nautaSavedAccounts", true);
        ik5.k("accountId", true);
        ik5.k("accountName", true);
        ik5.k("accountEmail", true);
        ik5.k("accountAvatarUrl", true);
        ik5.k("spotsNick", true);
        ik5.k("spotsDeviceId", true);
        ik5.k("spotsLastPublishMillis", true);
        ik5.k("licenseStatus", true);
        ik5.k("licenseTransferId", true);
        ik5.k("licenseActivatedAt", true);
        ik5.k("licenseLastCheckMillis", true);
        ik5.k("licensePriceTransferCup", true);
        ik5.k("licensePriceSaldoCup", true);
        ik5.k("licenseDiscountPercent", true);
        ik5.k("licenseDiscountSource", true);
        ik5.k("licenseCouponCode", true);
        ik5.k("voiceNotificationsUssdEnabled", true);
        ik5.k("voiceNotificationsIncomingEnabled", true);
        ik5.k("speedOverlayAutoEnabled", true);
        ik5.k("ussdAutoEnabled", true);
        ik5.k("ussdAutoAfterCallEnabled", true);
        ik5.k("ussdAutoAfterSmsEnabled", true);
        ik5.k("ussdAutoAfterDataOffEnabled", true);
        ik5.k("ussdAutoPeriodicEnabled", true);
        ik5.k("ussdAutoIntervalMinutes", true);
        ik5.k("ussdAutoVoiceCode", true);
        ik5.k("ussdAutoSmsCode", true);
        ik5.k("ussdAutoDataCode", true);
        ik5.k("ussdAutoPeriodicQuery", true);
        ik5.k("invitationCode", true);
        descriptor = ik5;
    }

    private UserDataPreferences$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: zr3[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final zr3[] childSerializers() {
        nz3[] access$get$childSerializers$cp = UserDataPreferences.$childSerializers;
        t47 t47 = t47.a;
        ja0 ja0 = ja0.a;
        ue3 ue3 = ue3.a;
        tc4 tc4 = tc4.a;
        return new zr3[]{t47, hj8.x(t47), hj8.x(t47), access$get$childSerializers$cp[3].getValue(), ja0, ja0, ue3, ja0, access$get$childSerializers$cp[8].getValue(), t47, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, access$get$childSerializers$cp[22].getValue(), t47, t47, t47, access$get$childSerializers$cp[26].getValue(), t47, ja0, t47, access$get$childSerializers$cp[30].getValue(), t47, t47, access$get$childSerializers$cp[33].getValue(), t47, t47, t47, t47, t47, t47, tc4, t47, t47, tc4, tc4, ue3, ue3, ue3, t47, t47, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ja0, ue3, t47, t47, t47, t47, t47};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final UserDataPreferences deserialize(ok1 ok1) {
        nz3[] nz3Arr;
        ok1.getClass();
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        nz3[] access$get$childSerializers$cp = UserDataPreferences.$childSerializers;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        List list = null;
        List list2 = null;
        boolean z = true;
        List list3 = null;
        List list4 = null;
        int i = 0;
        int i2 = 0;
        List list5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        DarkThemeConfigPreferences darkThemeConfigPreferences = null;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        String str4 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z17 = false;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str20 = null;
        String str21 = null;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        int i7 = 0;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        while (z) {
            int h = c.h(ll6);
            switch (h) {
                case -1:
                    nz3Arr = access$get$childSerializers$cp;
                    z = false;
                    continue;
                case b85.b:
                    nz3Arr = access$get$childSerializers$cp;
                    str = c.n(ll6, 0);
                    i |= 1;
                    continue;
                case 1:
                    nz3Arr = access$get$childSerializers$cp;
                    str2 = c.x(ll6, 1, t47.a, str2);
                    i |= 2;
                    continue;
                case 2:
                    nz3Arr = access$get$childSerializers$cp;
                    str3 = c.x(ll6, 2, t47.a, str3);
                    i |= 4;
                    break;
                case 3:
                    nz3Arr = access$get$childSerializers$cp;
                    darkThemeConfigPreferences = c.r(ll6, 3, (zr3) nz3Arr[3].getValue(), darkThemeConfigPreferences);
                    i |= 8;
                    break;
                case 4:
                    nz3Arr = access$get$childSerializers$cp;
                    z2 = c.z(ll6, 4);
                    i |= 16;
                    break;
                case 5:
                    nz3Arr = access$get$childSerializers$cp;
                    z3 = c.z(ll6, 5);
                    i |= 32;
                    break;
                case 6:
                    nz3Arr = access$get$childSerializers$cp;
                    i3 = c.s(ll6, 6);
                    i |= 64;
                    break;
                case 7:
                    nz3Arr = access$get$childSerializers$cp;
                    z4 = c.z(ll6, 7);
                    i |= 128;
                    break;
                case 8:
                    nz3Arr = access$get$childSerializers$cp;
                    list3 = (List) c.r(ll6, 8, (zr3) nz3Arr[8].getValue(), list3);
                    i |= 256;
                    break;
                case 9:
                    nz3Arr = access$get$childSerializers$cp;
                    str4 = c.n(ll6, 9);
                    i |= 512;
                    break;
                case 10:
                    nz3Arr = access$get$childSerializers$cp;
                    z5 = c.z(ll6, 10);
                    i |= 1024;
                    break;
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    nz3Arr = access$get$childSerializers$cp;
                    z6 = c.z(ll6, 11);
                    i |= 2048;
                    break;
                case 12:
                    nz3Arr = access$get$childSerializers$cp;
                    z7 = c.z(ll6, 12);
                    i |= 4096;
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    nz3Arr = access$get$childSerializers$cp;
                    z8 = c.z(ll6, 13);
                    i |= 8192;
                    break;
                case 14:
                    nz3Arr = access$get$childSerializers$cp;
                    z9 = c.z(ll6, 14);
                    i |= 16384;
                    break;
                case h75.g /*15*/:
                    nz3Arr = access$get$childSerializers$cp;
                    z10 = c.z(ll6, 15);
                    i |= 32768;
                    break;
                case 16:
                    nz3Arr = access$get$childSerializers$cp;
                    z11 = c.z(ll6, 16);
                    i |= 65536;
                    break;
                case 17:
                    nz3Arr = access$get$childSerializers$cp;
                    z12 = c.z(ll6, 17);
                    i |= 131072;
                    break;
                case 18:
                    nz3Arr = access$get$childSerializers$cp;
                    z13 = c.z(ll6, 18);
                    i |= 262144;
                    break;
                case 19:
                    nz3Arr = access$get$childSerializers$cp;
                    z14 = c.z(ll6, 19);
                    i |= 524288;
                    break;
                case 20:
                    nz3Arr = access$get$childSerializers$cp;
                    z15 = c.z(ll6, 20);
                    i |= 1048576;
                    break;
                case 21:
                    nz3Arr = access$get$childSerializers$cp;
                    z16 = c.z(ll6, 21);
                    i |= 2097152;
                    break;
                case 22:
                    nz3Arr = access$get$childSerializers$cp;
                    list4 = (List) c.r(ll6, 22, (zr3) nz3Arr[22].getValue(), list4);
                    i |= 4194304;
                    break;
                case 23:
                    nz3Arr = access$get$childSerializers$cp;
                    str5 = c.n(ll6, 23);
                    i |= 8388608;
                    break;
                case 24:
                    nz3Arr = access$get$childSerializers$cp;
                    str6 = c.n(ll6, 24);
                    i |= 16777216;
                    break;
                case 25:
                    nz3Arr = access$get$childSerializers$cp;
                    str7 = c.n(ll6, 25);
                    i |= 33554432;
                    break;
                case 26:
                    nz3Arr = access$get$childSerializers$cp;
                    list5 = (List) c.r(ll6, 26, (zr3) nz3Arr[26].getValue(), list5);
                    i |= 67108864;
                    break;
                case 27:
                    nz3Arr = access$get$childSerializers$cp;
                    str8 = c.n(ll6, 27);
                    i |= 134217728;
                    break;
                case 28:
                    nz3Arr = access$get$childSerializers$cp;
                    z17 = c.z(ll6, 28);
                    i |= 268435456;
                    break;
                case 29:
                    nz3Arr = access$get$childSerializers$cp;
                    str9 = c.n(ll6, 29);
                    i |= 536870912;
                    break;
                case 30:
                    nz3Arr = access$get$childSerializers$cp;
                    list2 = (List) c.r(ll6, 30, (zr3) nz3Arr[30].getValue(), list2);
                    i |= 1073741824;
                    break;
                case 31:
                    nz3Arr = access$get$childSerializers$cp;
                    str10 = c.n(ll6, 31);
                    i |= Integer.MIN_VALUE;
                    break;
                case 32:
                    nz3Arr = access$get$childSerializers$cp;
                    str11 = c.n(ll6, 32);
                    i2 |= 1;
                    break;
                case 33:
                    nz3Arr = access$get$childSerializers$cp;
                    list = (List) c.r(ll6, 33, (zr3) access$get$childSerializers$cp[33].getValue(), list);
                    i2 |= 2;
                    break;
                case 34:
                    str12 = c.n(ll6, 34);
                    i2 |= 4;
                    break;
                case 35:
                    str13 = c.n(ll6, 35);
                    i2 |= 8;
                    break;
                case 36:
                    str14 = c.n(ll6, 36);
                    i2 |= 16;
                    break;
                case 37:
                    str15 = c.n(ll6, 37);
                    i2 |= 32;
                    break;
                case 38:
                    str16 = c.n(ll6, 38);
                    i2 |= 64;
                    break;
                case 39:
                    str17 = c.n(ll6, 39);
                    i2 |= 128;
                    break;
                case 40:
                    j = c.D(ll6, 40);
                    i2 |= 256;
                    break;
                case 41:
                    str18 = c.n(ll6, 41);
                    i2 |= 512;
                    break;
                case 42:
                    str19 = c.n(ll6, 42);
                    i2 |= 1024;
                    break;
                case 43:
                    j2 = c.D(ll6, 43);
                    i2 |= 2048;
                    break;
                case 44:
                    j3 = c.D(ll6, 44);
                    i2 |= 4096;
                    break;
                case 45:
                    i4 = c.s(ll6, 45);
                    i2 |= 8192;
                    break;
                case 46:
                    i5 = c.s(ll6, 46);
                    i2 |= 16384;
                    break;
                case 47:
                    i6 = c.s(ll6, 47);
                    i2 |= 32768;
                    break;
                case h75.h /*48*/:
                    str20 = c.n(ll6, 48);
                    i2 |= 65536;
                    break;
                case 49:
                    str21 = c.n(ll6, 49);
                    i2 |= 131072;
                    break;
                case 50:
                    z18 = c.z(ll6, 50);
                    i2 |= 262144;
                    break;
                case 51:
                    z19 = c.z(ll6, 51);
                    i2 |= 524288;
                    break;
                case 52:
                    z20 = c.z(ll6, 52);
                    i2 |= 1048576;
                    break;
                case 53:
                    z21 = c.z(ll6, 53);
                    i2 |= 2097152;
                    break;
                case 54:
                    z22 = c.z(ll6, 54);
                    i2 |= 4194304;
                    break;
                case 55:
                    z23 = c.z(ll6, 55);
                    i2 |= 8388608;
                    break;
                case 56:
                    z24 = c.z(ll6, 56);
                    i2 |= 16777216;
                    break;
                case 57:
                    z25 = c.z(ll6, 57);
                    i2 |= 33554432;
                    break;
                case 58:
                    i7 = c.s(ll6, 58);
                    i2 |= 67108864;
                    break;
                case 59:
                    str22 = c.n(ll6, 59);
                    i2 |= 134217728;
                    break;
                case 60:
                    str23 = c.n(ll6, 60);
                    i2 |= 268435456;
                    break;
                case 61:
                    str24 = c.n(ll6, 61);
                    i2 |= 536870912;
                    break;
                case 62:
                    str25 = c.n(ll6, 62);
                    i2 |= 1073741824;
                    break;
                case 63:
                    str26 = c.n(ll6, 63);
                    i2 |= Integer.MIN_VALUE;
                    break;
                default:
                    h.e(h);
                    return null;
            }
            nz3Arr = access$get$childSerializers$cp;
            access$get$childSerializers$cp = nz3Arr;
        }
        c.b(ll6);
        return new UserDataPreferences(i, i2, 0, str, str2, str3, darkThemeConfigPreferences, z2, z3, i3, z4, list3, str4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, list4, str5, str6, str7, list5, str8, z17, str9, list2, str10, str11, list, str12, str13, str14, str15, str16, str17, j, str18, str19, j2, j3, i4, i5, i6, str20, str21, z18, z19, z20, z21, z22, z23, z24, z25, i7, str22, str23, str24, str25, str26, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, UserDataPreferences userDataPreferences) {
        j42.getClass();
        userDataPreferences.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        UserDataPreferences.write$Self$preferences(userDataPreferences, c, ll6);
        c.b(ll6);
    }

    public /* bridge */ zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
