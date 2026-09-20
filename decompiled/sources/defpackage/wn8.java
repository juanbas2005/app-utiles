package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wn8 implements bq8 {
    public final Double w;

    public wn8(Double d) {
        if (d == null) {
            this.w = Double.valueOf(Double.NaN);
        } else {
            this.w = d;
        }
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wn8)) {
            return false;
        }
        return this.w.equals(((wn8) obj).w);
    }

    public final Boolean f() {
        Double d = this.w;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String g() {
        BigDecimal bigDecimal;
        int scale;
        Double d = this.w;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(d.doubleValue())) {
            BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
            if (valueOf.signum() == 0) {
                bigDecimal = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                bigDecimal = valueOf.stripTrailingZeros();
            }
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (bigDecimal.scale() > 0) {
                scale = bigDecimal.precision();
            } else {
                scale = bigDecimal.scale();
            }
            decimalFormat.setMinimumFractionDigits(scale - 1);
            String format = decimalFormat.format(bigDecimal);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return bigDecimal.toPlainString();
        } else if (d.doubleValue() > 0.0d) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new mq8(g());
        }
        String g = g();
        throw new IllegalArgumentException(g + "." + str + " is not a function.");
    }

    public final Double p() {
        return this.w;
    }

    public final String toString() {
        return g();
    }

    public final bq8 v() {
        return new wn8(this.w);
    }
}
