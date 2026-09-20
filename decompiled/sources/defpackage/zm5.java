package defpackage;

import java.util.LinkedHashMap;

/* renamed from: zm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zm5 {
    public static final zj3 a = new zj3(s15.x, false);
    public static final zj3 b;
    public static final zj3 c;
    public static final LinkedHashMap d;

    static {
        s15 s15 = s15.y;
        b = new zj3(s15, false);
        c = new zj3(s15, true);
        String concat = "java/lang/".concat("Object");
        String concat2 = "java/util/function/".concat("Predicate");
        String concat3 = "java/util/function/".concat("Function");
        String concat4 = "java/util/function/".concat("Consumer");
        String concat5 = "java/util/function/".concat("BiFunction");
        String concat6 = "java/util/function/".concat("BiConsumer");
        String concat7 = "java/util/function/".concat("UnaryOperator");
        String concat8 = "java/util/".concat("stream/Stream");
        String concat9 = "java/util/".concat("Optional");
        be1 be1 = new be1(3);
        new kg5(be1, false, "java/util/".concat("Iterator"), 16).p("forEachRemaining", (String) null, new u6(concat4, 1));
        new kg5(be1, false, "java/lang/".concat("Iterable"), 16).p("spliterator", (String) null, new e18(9));
        kg5 kg5 = new kg5(be1, false, "java/util/".concat("Collection"), 16);
        kg5.p("removeIf", (String) null, new u6(concat2, 18));
        kg5.p("stream", (String) null, new u6(concat8, 27));
        kg5.p("parallelStream", (String) null, new ym5(concat8, 2));
        kg5 kg52 = new kg5(be1, false, "java/util/".concat("List"), 16);
        kg52.p("replaceAll", (String) null, new ym5(concat7, 3));
        kg52.p("addFirst", "2.1", new ym5(concat, 4));
        kg52.p("addLast", "2.1", new ym5(concat, 5));
        String str = concat2;
        kg52.p("removeFirst", "2.1", new ym5(concat, 6));
        kg52.p("removeLast", "2.1", new ym5(concat, 7));
        kg5 kg53 = new kg5(be1, false, "java/util/".concat("LinkedList"), 16);
        kg53.p("addFirst", "2.1", new u6(concat, 2));
        kg53.p("addLast", "2.1", new u6(concat, 3));
        kg53.p("removeFirst", "2.1", new u6(concat, 4));
        kg53.p("removeLast", "2.1", new u6(concat, 5));
        kg5 kg54 = new kg5(be1, false, "java/util/".concat("LinkedHashSet"), 16);
        kg54.p("addFirst", "2.2", new u6(concat, 6));
        kg54.p("addLast", "2.2", new u6(concat, 7));
        kg54.p("removeFirst", "2.2", new u6(concat, 8));
        kg54.p("removeLast", "2.2", new u6(concat, 9));
        kg54.p("getFirst", "2.2", new u6(concat, 10));
        kg54.p("getLast", "2.2", new u6(concat, 11));
        kg5 kg55 = new kg5(be1, false, "java/util/".concat("Map"), 16);
        kg55.p("forEach", (String) null, new u6(concat6, 12));
        kg55.p("putIfAbsent", (String) null, new u6(concat, 13));
        kg55.p("replace", (String) null, new u6(concat, 14));
        kg55.p("replace", (String) null, new u6(concat, 15));
        kg55.p("replaceAll", (String) null, new u6(concat5, 16));
        kg55.p("compute", (String) null, new a7(concat, concat5, 2));
        kg55.p("computeIfAbsent", (String) null, new a7(concat, concat3, 3));
        kg55.p("computeIfPresent", (String) null, new a7(concat, concat5, 4));
        kg55.p("merge", (String) null, new a7(concat, concat5, 5));
        kg5 kg56 = new kg5(be1, false, "java/util/".concat("LinkedHashMap"), 16);
        kg56.p("putFirst", "2.2", new u6(concat, 17));
        kg56.p("putLast", "2.2", new u6(concat, 19));
        String str2 = concat9;
        kg5 kg57 = new kg5(be1, false, str2, 16);
        kg57.p("empty", (String) null, new u6(str2, 20));
        kg57.p("of", (String) null, new a7(concat, str2, 6));
        kg57.p("ofNullable", (String) null, new a7(concat, str2, 7));
        kg57.p("get", (String) null, new u6(concat, 21));
        String str3 = concat4;
        kg57.p("ifPresent", (String) null, new u6(str3, 22));
        new kg5(be1, false, "java/lang/".concat("ref/Reference"), 16).p("get", (String) null, new u6(concat, 23));
        new kg5(be1, false, str, 16).p("test", (String) null, new u6(concat, 24));
        String str4 = "java/util/function/";
        new kg5(be1, false, str4.concat("BiPredicate"), 16).p("test", (String) null, new u6(concat, 25));
        new kg5(be1, false, str3, 16).p("accept", (String) null, new u6(concat, 26));
        new kg5(be1, false, concat6, 16).p("accept", (String) null, new u6(concat, 28));
        new kg5(be1, false, concat3, 16).p("apply", (String) null, new u6(concat, 29));
        new kg5(be1, false, concat5, 16).p("apply", (String) null, new ym5(concat, 0));
        new kg5(be1, false, str4.concat("Supplier"), 16).p("get", (String) null, new ym5(concat, 1));
        d = be1.a;
    }
}
