package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cy8 extends gg8 implements iy8 {
    public cy8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 3);
    }

    public final void A(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 27);
    }

    public final void C(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 6);
    }

    public final void D(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 26);
    }

    public final void E(z99 z99, c89 c89, uy8 uy8) {
        Parcel I = I();
        ds8.b(I, z99);
        ds8.b(I, c89);
        ds8.c(I, uy8);
        J(I, 29);
    }

    public final List c(String str, String str2, String str3, boolean z) {
        Parcel I = I();
        I.writeString((String) null);
        I.writeString(str2);
        I.writeString(str3);
        ClassLoader classLoader = ds8.a;
        I.writeInt(z ? 1 : 0);
        Parcel H = H(I, 15);
        ArrayList<z89> createTypedArrayList = H.createTypedArrayList(z89.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void h(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 4);
    }

    public final List i(String str, String str2, boolean z, z99 z99) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ClassLoader classLoader = ds8.a;
        I.writeInt(z ? 1 : 0);
        ds8.b(I, z99);
        Parcel H = H(I, 14);
        ArrayList<z89> createTypedArrayList = H.createTypedArrayList(z89.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void j(Bundle bundle, z99 z99) {
        Parcel I = I();
        ds8.b(I, bundle);
        ds8.b(I, z99);
        J(I, 19);
    }

    public final void l(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 25);
    }

    public final void m(long j, String str, String str2, String str3) {
        Parcel I = I();
        I.writeLong(j);
        I.writeString(str);
        I.writeString(str2);
        I.writeString(str3);
        J(I, 10);
    }

    public final void n(z99 z99, Bundle bundle, oy8 oy8) {
        Parcel I = I();
        ds8.b(I, z99);
        ds8.b(I, bundle);
        ds8.c(I, oy8);
        J(I, 31);
    }

    public final void o(z89 z89, z99 z99) {
        Parcel I = I();
        ds8.b(I, z89);
        ds8.b(I, z99);
        J(I, 2);
    }

    public final List p(String str, String str2, String str3) {
        Parcel I = I();
        I.writeString((String) null);
        I.writeString(str2);
        I.writeString(str3);
        Parcel H = H(I, 17);
        ArrayList<xn8> createTypedArrayList = H.createTypedArrayList(xn8.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final void q(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 20);
    }

    public final void r(zr8 zr8, z99 z99) {
        Parcel I = I();
        ds8.b(I, zr8);
        ds8.b(I, z99);
        J(I, 1);
    }

    public final String s(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        Parcel H = H(I, 11);
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final List t(String str, String str2, z99 z99) {
        Parcel I = I();
        I.writeString(str);
        I.writeString(str2);
        ds8.b(I, z99);
        Parcel H = H(I, 16);
        ArrayList<xn8> createTypedArrayList = H.createTypedArrayList(xn8.CREATOR);
        H.recycle();
        return createTypedArrayList;
    }

    public final dq8 u(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        Parcel H = H(I, 21);
        dq8 dq8 = (dq8) ds8.a(H, dq8.CREATOR);
        H.recycle();
        return dq8;
    }

    public final byte[] v(String str, zr8 zr8) {
        Parcel I = I();
        ds8.b(I, zr8);
        I.writeString(str);
        Parcel H = H(I, 9);
        byte[] createByteArray = H.createByteArray();
        H.recycle();
        return createByteArray;
    }

    public final void w(z99 z99, lm8 lm8) {
        Parcel I = I();
        ds8.b(I, z99);
        ds8.b(I, lm8);
        J(I, 30);
    }

    public final void x(z99 z99) {
        Parcel I = I();
        ds8.b(I, z99);
        J(I, 18);
    }

    public final void y(xn8 xn8, z99 z99) {
        Parcel I = I();
        ds8.b(I, xn8);
        ds8.b(I, z99);
        J(I, 12);
    }
}
