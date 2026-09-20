package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: au8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au8 extends gg8 implements cu8 {
    public final void beginAdUnitExposure(String str, long j) {
        Parcel I = I();
        I.writeString(str);
        I.writeLong(j);
        J(I, 23);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ds8.b(I, bundle);
        J(I, 9);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel I = I();
        I.writeString(str);
        I.writeLong(j);
        J(I, 24);
    }

    public final void generateEventId(ju8 ju8) {
        Parcel I = I();
        ds8.c(I, ju8);
        J(I, 22);
    }

    public final void getCachedAppInstanceId(ju8 ju8) {
        Parcel I = I();
        ds8.c(I, ju8);
        J(I, 19);
    }

    public final void getConditionalUserProperties(String str, String str2, ju8 ju8) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ds8.c(I, ju8);
        J(I, 10);
    }

    public final void getCurrentScreenClass(ju8 ju8) {
        Parcel I = I();
        ds8.c(I, ju8);
        J(I, 17);
    }

    public final void getCurrentScreenName(ju8 ju8) {
        Parcel I = I();
        ds8.c(I, ju8);
        J(I, 16);
    }

    public final void getGmpAppId(ju8 ju8) {
        Parcel I = I();
        ds8.c(I, ju8);
        J(I, 21);
    }

    public final void getMaxUserProperties(String str, ju8 ju8) {
        Parcel I = I();
        I.writeString(str);
        ds8.c(I, ju8);
        J(I, 6);
    }

    public final void getUserProperties(String str, String str2, boolean z, ju8 ju8) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ClassLoader classLoader = ds8.a;
        I.writeInt(z ? 1 : 0);
        ds8.c(I, ju8);
        J(I, 5);
    }

    public final void initialize(y73 y73, iv8 iv8, long j) {
        Parcel I = I();
        ds8.c(I, y73);
        ds8.b(I, iv8);
        I.writeLong(j);
        J(I, 1);
    }

    public final void initializeWithElapsedTime(y73 y73, iv8 iv8, long j, long j2) {
        Parcel I = I();
        ds8.c(I, y73);
        ds8.b(I, iv8);
        I.writeLong(j);
        I.writeLong(j2);
        J(I, 60);
    }

    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ds8.b(I, bundle);
        I.writeInt(1);
        I.writeInt(1);
        I.writeLong(j);
        I.writeLong(j2);
        J(I, 59);
    }

    public final void logHealthData(int i, String str, y73 y73, y73 y732, y73 y733) {
        Parcel I = I();
        I.writeInt(5);
        I.writeString("Error with data collection. Data lost.");
        ds8.c(I, y73);
        ds8.c(I, y732);
        ds8.c(I, y733);
        J(I, 33);
    }

    public final void onActivityCreatedByScionActivityInfo(jv8 jv8, Bundle bundle, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        ds8.b(I, bundle);
        I.writeLong(j);
        J(I, 53);
    }

    public final void onActivityDestroyedByScionActivityInfo(jv8 jv8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeLong(j);
        J(I, 54);
    }

    public final void onActivityPausedByScionActivityInfo(jv8 jv8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeLong(j);
        J(I, 55);
    }

    public final void onActivityResumedByScionActivityInfo(jv8 jv8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeLong(j);
        J(I, 56);
    }

    public final void onActivitySaveInstanceStateByScionActivityInfo(jv8 jv8, ju8 ju8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        ds8.c(I, ju8);
        I.writeLong(j);
        J(I, 57);
    }

    public final void onActivityStartedByScionActivityInfo(jv8 jv8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeLong(j);
        J(I, 51);
    }

    public final void onActivityStoppedByScionActivityInfo(jv8 jv8, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeLong(j);
        J(I, 52);
    }

    public final void registerOnMeasurementEventListener(tu8 tu8) {
        Parcel I = I();
        ds8.c(I, tu8);
        J(I, 35);
    }

    public final void retrieveAndUploadBatches(pu8 pu8) {
        Parcel I = I();
        ds8.c(I, pu8);
        J(I, 58);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel I = I();
        ds8.b(I, bundle);
        I.writeLong(j);
        J(I, 8);
    }

    public final void setCurrentScreenByScionActivityInfo(jv8 jv8, String str, String str2, long j) {
        Parcel I = I();
        ds8.b(I, jv8);
        I.writeString(str);
        I.writeString(str2);
        I.writeLong(j);
        J(I, 50);
    }

    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    public final void setUserProperty(String str, String str2, y73 y73, boolean z, long j) {
        Parcel I = I();
        I.writeString("fcm");
        I.writeString("_ln");
        ds8.c(I, y73);
        I.writeInt(1);
        I.writeLong(j);
        J(I, 4);
    }
}
