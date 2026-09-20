package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* renamed from: bu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bu8 extends cs8 implements cu8 {
    /* JADX WARNING: type inference failed for: r1v1, types: [cu8, gg8] */
    public static cu8 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof cu8) {
            return (cu8) queryLocalInterface;
        }
        return new gg8(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 3);
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v11, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v15, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v19, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v23, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v27, types: [hv8] */
    /* JADX WARNING: type inference failed for: r6v31, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v35, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v39, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v43, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v47, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v51, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v55, types: [tu8] */
    /* JADX WARNING: type inference failed for: r6v59, types: [tu8] */
    /* JADX WARNING: type inference failed for: r6v63, types: [tu8] */
    /* JADX WARNING: type inference failed for: r6v67, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v71, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v75, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v79, types: [ju8] */
    /* JADX WARNING: type inference failed for: r6v83, types: [pu8] */
    /* JADX WARNING: type inference failed for: r6v88 */
    /* JADX WARNING: type inference failed for: r6v89 */
    /* JADX WARNING: type inference failed for: r6v90 */
    /* JADX WARNING: type inference failed for: r6v91 */
    /* JADX WARNING: type inference failed for: r6v92 */
    /* JADX WARNING: type inference failed for: r6v93 */
    /* JADX WARNING: type inference failed for: r6v94 */
    /* JADX WARNING: type inference failed for: r6v95 */
    /* JADX WARNING: type inference failed for: r6v96 */
    /* JADX WARNING: type inference failed for: r6v97 */
    /* JADX WARNING: type inference failed for: r6v98 */
    /* JADX WARNING: type inference failed for: r6v99 */
    /* JADX WARNING: type inference failed for: r6v100 */
    /* JADX WARNING: type inference failed for: r6v101 */
    /* JADX WARNING: type inference failed for: r6v102 */
    /* JADX WARNING: type inference failed for: r6v103 */
    /* JADX WARNING: type inference failed for: r6v104 */
    /* JADX WARNING: type inference failed for: r6v105 */
    /* JADX WARNING: type inference failed for: r6v106 */
    /* JADX WARNING: type inference failed for: r6v107 */
    /* JADX WARNING: type inference failed for: r6v108 */
    /* JADX WARNING: type inference failed for: r6v109 */
    /* JADX WARNING: type inference failed for: r6v110 */
    /* JADX WARNING: type inference failed for: r6v111 */
    /* JADX WARNING: type inference failed for: r6v112 */
    /* JADX WARNING: type inference failed for: r6v113 */
    /* JADX WARNING: type inference failed for: r6v114 */
    /* JADX WARNING: type inference failed for: r6v115 */
    /* JADX WARNING: type inference failed for: r6v116 */
    /* JADX WARNING: type inference failed for: r6v117 */
    /* JADX WARNING: type inference failed for: r6v118 */
    /* JADX WARNING: type inference failed for: r6v119 */
    /* JADX WARNING: type inference failed for: r6v120 */
    /* JADX WARNING: type inference failed for: r6v121 */
    /* JADX WARNING: type inference failed for: r6v122 */
    /* JADX WARNING: type inference failed for: r6v123 */
    /* JADX WARNING: type inference failed for: r6v124 */
    /* JADX WARNING: type inference failed for: r6v125 */
    /* JADX WARNING: type inference failed for: r6v126 */
    /* JADX WARNING: type inference failed for: r6v127 */
    /* JADX WARNING: type inference failed for: r6v128 */
    /* JADX WARNING: type inference failed for: r6v129 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        ? r6 = 0;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                ds8.d(parcel);
                initialize(z25.L(parcel.readStrongBinder()), (iv8) ds8.a(parcel, iv8.CREATOR), readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long readLong2 = parcel.readLong();
                ds8.d(parcel);
                logEvent(readString, readString2, bundle, z, z2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof ju8) {
                        r6 = (ju8) queryLocalInterface;
                    } else {
                        r6 = new fu8(readStrongBinder);
                    }
                }
                ju8 ju8 = r6;
                long readLong3 = parcel.readLong();
                ds8.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, ju8, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                y73 L = z25.L(parcel.readStrongBinder());
                ClassLoader classLoader = ds8.a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long readLong4 = parcel.readLong();
                ds8.d(parcel);
                setUserProperty(readString5, readString6, L, z3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = ds8.a;
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface2;
                    } else {
                        r6 = new fu8(readStrongBinder2);
                    }
                }
                ds8.d(parcel);
                getUserProperties(readString7, readString8, z4, r6);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface3;
                    } else {
                        r6 = new fu8(readStrongBinder3);
                    }
                }
                ds8.d(parcel);
                getMaxUserProperties(readString9, r6);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                ds8.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                ds8.d(parcel);
                setConditionalUserProperty((Bundle) ds8.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                ds8.d(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) ds8.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface4;
                    } else {
                        r6 = new fu8(readStrongBinder4);
                    }
                }
                ds8.d(parcel);
                getConditionalUserProperties(readString11, readString12, r6);
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                ClassLoader classLoader3 = ds8.a;
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                long readLong7 = parcel.readLong();
                ds8.d(parcel);
                setMeasurementEnabled(z5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                ds8.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                long readLong9 = parcel.readLong();
                ds8.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                ds8.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case h75.g /*15*/:
                y73 L2 = z25.L(parcel.readStrongBinder());
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                long readLong11 = parcel.readLong();
                ds8.d(parcel);
                setCurrentScreen(L2, readString13, readString14, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface5;
                    } else {
                        r6 = new fu8(readStrongBinder5);
                    }
                }
                ds8.d(parcel);
                getCurrentScreenName(r6);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface6;
                    } else {
                        r6 = new fu8(readStrongBinder6);
                    }
                }
                ds8.d(parcel);
                getCurrentScreenClass(r6);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof hv8) {
                        r6 = (hv8) queryLocalInterface7;
                    } else {
                        r6 = new gg8(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 3);
                    }
                }
                ds8.d(parcel);
                setInstanceIdProvider(r6);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface8;
                    } else {
                        r6 = new fu8(readStrongBinder8);
                    }
                }
                ds8.d(parcel);
                getCachedAppInstanceId(r6);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface9;
                    } else {
                        r6 = new fu8(readStrongBinder9);
                    }
                }
                ds8.d(parcel);
                getAppInstanceId(r6);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface10;
                    } else {
                        r6 = new fu8(readStrongBinder10);
                    }
                }
                ds8.d(parcel);
                getGmpAppId(r6);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface11;
                    } else {
                        r6 = new fu8(readStrongBinder11);
                    }
                }
                ds8.d(parcel);
                generateEventId(r6);
                break;
            case 23:
                String readString15 = parcel.readString();
                long readLong12 = parcel.readLong();
                ds8.d(parcel);
                beginAdUnitExposure(readString15, readLong12);
                break;
            case 24:
                String readString16 = parcel.readString();
                long readLong13 = parcel.readLong();
                ds8.d(parcel);
                endAdUnitExposure(readString16, readLong13);
                break;
            case 25:
                y73 L3 = z25.L(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                ds8.d(parcel);
                onActivityStarted(L3, readLong14);
                break;
            case 26:
                y73 L4 = z25.L(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                ds8.d(parcel);
                onActivityStopped(L4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                ds8.d(parcel);
                onActivityCreated(z25.L(parcel.readStrongBinder()), (Bundle) ds8.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                y73 L5 = z25.L(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                ds8.d(parcel);
                onActivityDestroyed(L5, readLong17);
                break;
            case 29:
                y73 L6 = z25.L(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                ds8.d(parcel);
                onActivityPaused(L6, readLong18);
                break;
            case 30:
                y73 L7 = z25.L(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                ds8.d(parcel);
                onActivityResumed(L7, readLong19);
                break;
            case 31:
                y73 L8 = z25.L(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface12;
                    } else {
                        r6 = new fu8(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                ds8.d(parcel);
                onActivitySaveInstanceState(L8, r6, readLong20);
                break;
            case 32:
                Bundle bundle3 = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface13;
                    } else {
                        r6 = new fu8(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                ds8.d(parcel);
                performAction(bundle3, r6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString17 = parcel.readString();
                y73 L9 = z25.L(parcel.readStrongBinder());
                y73 L10 = z25.L(parcel.readStrongBinder());
                y73 L11 = z25.L(parcel.readStrongBinder());
                ds8.d(parcel);
                logHealthData(readInt, readString17, L9, L10, L11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof tu8) {
                        r6 = (tu8) queryLocalInterface14;
                    } else {
                        r6 = new ru8(readStrongBinder14);
                    }
                }
                ds8.d(parcel);
                setEventInterceptor(r6);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof tu8) {
                        r6 = (tu8) queryLocalInterface15;
                    } else {
                        r6 = new ru8(readStrongBinder15);
                    }
                }
                ds8.d(parcel);
                registerOnMeasurementEventListener(r6);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof tu8) {
                        r6 = (tu8) queryLocalInterface16;
                    } else {
                        r6 = new ru8(readStrongBinder16);
                    }
                }
                ds8.d(parcel);
                unregisterOnMeasurementEventListener(r6);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(ds8.a);
                ds8.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface17;
                    } else {
                        r6 = new fu8(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                ds8.d(parcel);
                getTestFlag(r6, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = ds8.a;
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                ds8.d(parcel);
                setDataCollectionEnabled(z6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface18;
                    } else {
                        r6 = new fu8(readStrongBinder18);
                    }
                }
                ds8.d(parcel);
                isDataCollectionEnabled(r6);
                break;
            case 42:
                ds8.d(parcel);
                setDefaultEventParameters((Bundle) ds8.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                ds8.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                ds8.d(parcel);
                setConsent((Bundle) ds8.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                ds8.d(parcel);
                setConsentThirdParty((Bundle) ds8.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface19;
                    } else {
                        r6 = new fu8(readStrongBinder19);
                    }
                }
                ds8.d(parcel);
                getSessionId(r6);
                break;
            case h75.h /*48*/:
                ds8.d(parcel);
                setSgtmDebugInfo((Intent) ds8.a(parcel, Intent.CREATOR));
                break;
            case 50:
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                long readLong25 = parcel.readLong();
                ds8.d(parcel);
                setCurrentScreenByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readString18, readString19, readLong25);
                break;
            case 51:
                long readLong26 = parcel.readLong();
                ds8.d(parcel);
                onActivityStartedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readLong26);
                break;
            case 52:
                long readLong27 = parcel.readLong();
                ds8.d(parcel);
                onActivityStoppedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readLong27);
                break;
            case 53:
                long readLong28 = parcel.readLong();
                ds8.d(parcel);
                onActivityCreatedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), (Bundle) ds8.a(parcel, Bundle.CREATOR), readLong28);
                break;
            case 54:
                long readLong29 = parcel.readLong();
                ds8.d(parcel);
                onActivityDestroyedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readLong29);
                break;
            case 55:
                long readLong30 = parcel.readLong();
                ds8.d(parcel);
                onActivityPausedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readLong30);
                break;
            case 56:
                long readLong31 = parcel.readLong();
                ds8.d(parcel);
                onActivityResumedByScionActivityInfo((jv8) ds8.a(parcel, jv8.CREATOR), readLong31);
                break;
            case 57:
                jv8 jv8 = (jv8) ds8.a(parcel, jv8.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface20 instanceof ju8) {
                        r6 = (ju8) queryLocalInterface20;
                    } else {
                        r6 = new fu8(readStrongBinder20);
                    }
                }
                long readLong32 = parcel.readLong();
                ds8.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(jv8, r6, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (queryLocalInterface21 instanceof pu8) {
                        r6 = (pu8) queryLocalInterface21;
                    } else {
                        r6 = new gg8(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 3);
                    }
                }
                ds8.d(parcel);
                retrieveAndUploadBatches(r6);
                break;
            case 59:
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                Bundle bundle4 = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z7 = false;
                    z9 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                ds8.d(parcel);
                logEventWithElapsedTime(readString20, readString21, bundle4, z9, z8, readLong33, readLong34);
                break;
            case 60:
                y73 L12 = z25.L(parcel.readStrongBinder());
                iv8 iv8 = (iv8) ds8.a(parcel, iv8.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                ds8.d(parcel);
                initializeWithElapsedTime(L12, iv8, readLong35, readLong36);
                break;
            case 61:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                ds8.d(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
