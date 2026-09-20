package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: ir8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ir8 {
    public static final ir8 f = new ir8((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public ir8(Boolean bool, int i, Boolean bool2, String str) {
        c39 c39;
        EnumMap enumMap = new EnumMap(f39.class);
        this.e = enumMap;
        if (bool == null) {
            c39 = c39.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            c39 = c39.GRANTED;
        } else {
            c39 = c39.DENIED;
        }
        enumMap.put(f39.AD_USER_DATA, c39);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static ir8 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(f39.class);
        f39[] f39Arr = d39.DMA.w;
        int length = f39Arr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put(f39Arr[i2], h39.e(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new ir8(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static ir8 c(int i, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new ir8((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(f39.class);
        for (f39 f39 : d39.DMA.w) {
            enumMap.put(f39, h39.d(bundle.getString(f39.w)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new ir8(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public final c39 a() {
        c39 c39 = (c39) this.e.get(f39.AD_USER_DATA);
        if (c39 == null) {
            return c39.UNINITIALIZED;
        }
        return c39;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (f39 f39 : d39.DMA.w) {
            sb.append(":");
            sb.append(h39.h((c39) this.e.get(f39)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ir8)) {
            return false;
        }
        ir8 ir8 = (ir8) obj;
        if (!this.b.equalsIgnoreCase(ir8.b) || !Objects.equals(this.c, ir8.c)) {
            return false;
        }
        return Objects.equals(this.d, ir8.d);
    }

    public final int hashCode() {
        int i;
        int i2;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (true != bool.booleanValue()) {
            i = 13;
        } else {
            i = 7;
        }
        String str = this.d;
        if (str == null) {
            i2 = 17;
        } else {
            i2 = str.hashCode();
        }
        return (i2 * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h39.a(this.a));
        for (f39 f39 : d39.DMA.w) {
            sb.append(",");
            sb.append(f39.w);
            sb.append("=");
            c39 c39 = (c39) this.e.get(f39);
            if (c39 == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = c39.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public ir8(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(f39.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
