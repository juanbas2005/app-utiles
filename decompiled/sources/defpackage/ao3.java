package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: ao3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ao3 {
    public static final LinkedHashSet a = wn6.p(g22.s("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c = g22.s("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
    public static final LinkedHashSet d = wn6.o(wn6.o(wn6.o(wn6.o(wn6.o(wn6.o(g22.r("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), g22.s("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), g22.r("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), g22.r("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), g22.s("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), g22.s("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), g22.s("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
    public static final LinkedHashSet e = wn6.o(wn6.o(g22.s("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), g22.s("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), g22.s("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<zo3> E = sg3.E(zo3.BOOLEAN, zo3.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zo3 zo3 : E) {
            up2 up2 = zo3.z;
            if (up2 != null) {
                String b2 = up2.a.g().b();
                b2.getClass();
                String concat = "java/lang/".concat(b2);
                String[] strArr = (String[]) Arrays.copyOf(new String[]{zo3.x + "Value()" + zo3.y}, 1);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (String str : strArr) {
                    linkedHashSet2.add(concat + '.' + str);
                }
                it0.h0(linkedHashSet, linkedHashSet2);
            } else {
                zo3.a(15);
                throw null;
            }
        }
        b = wn6.o(wn6.o(wn6.o(wn6.o(wn6.o(wn6.o(linkedHashSet, g22.s("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), g22.r("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), g22.r("Double", "isInfinite()Z", "isNaN()Z")), g22.r("Float", "isInfinite()Z", "isNaN()Z")), g22.r("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), g22.r("CharSequence", "isEmpty()Z"));
        zo3 zo32 = zo3.BOOLEAN;
        zo3 zo33 = zo3.BYTE;
        List<zo3> E2 = sg3.E(zo32, zo33, zo3.DOUBLE, zo3.FLOAT, zo33, zo3.INT, zo3.LONG, zo3.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (zo3 zo34 : E2) {
            up2 up22 = zo34.z;
            if (up22 != null) {
                String b3 = up22.a.g().b();
                b3.getClass();
                String[] j = g22.j("Ljava/lang/String;");
                it0.h0(linkedHashSet3, g22.r(b3, (String[]) Arrays.copyOf(j, j.length)));
            } else {
                zo3.a(15);
                throw null;
            }
        }
        String[] j2 = g22.j("D");
        LinkedHashSet o = wn6.o(linkedHashSet3, g22.r("Float", (String[]) Arrays.copyOf(j2, j2.length)));
        String[] j3 = g22.j("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = wn6.o(o, g22.r("String", (String[]) Arrays.copyOf(j3, j3.length)));
        String[] j4 = g22.j("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = g22.r("Throwable", (String[]) Arrays.copyOf(j4, j4.length));
    }
}
