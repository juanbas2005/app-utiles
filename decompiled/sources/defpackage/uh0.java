package defpackage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: uh0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class uh0 {
    public static final WeakHashMap a = new WeakHashMap();

    public static String a(int i, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String languageTag = locale.toLanguageTag();
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(".");
        sb.append(40);
        sb.append(".");
        sb.append(false);
        String l = f21.l(sb, ".", languageTag);
        WeakHashMap weakHashMap = a;
        Object obj = weakHashMap.get(l);
        NumberFormat numberFormat = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(1);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(l, integerInstance);
            numberFormat = integerInstance;
        }
        return ((NumberFormat) numberFormat).format(Integer.valueOf(i));
    }
}
