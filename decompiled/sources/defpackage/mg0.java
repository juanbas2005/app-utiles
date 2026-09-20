package defpackage;

import java.util.ArrayList;

/* renamed from: mg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mg0 extends xs0 {
    public mg0(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int i0(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r2 = I().intValue();
     */
    public final String j0() {
        int i0;
        if (v()) {
            return null;
        }
        char charAt = ((String) this.d).charAt(this.b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int intValue = I().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = I().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = I().intValue();
                    } else {
                        int i02 = i0(intValue);
                        if (i02 != -1) {
                            for (int i = 1; i <= 5 && (i0 = i0(intValue)) != -1; i++) {
                                i02 = (i02 * 16) + i0;
                            }
                            sb.append((char) i02);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = I().intValue();
        }
        return sb.toString();
    }

    public final String k0() {
        int i;
        String str = (String) this.d;
        boolean v = v();
        int i2 = this.b;
        if (!v) {
            int charAt = str.charAt(i2);
            if (charAt == 45) {
                charAt = g();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int g = g();
                while (true) {
                    if ((g < 65 || g > 90) && ((g < 97 || g > 122) && !((g >= 48 && g <= 57) || g == 45 || g == 95))) {
                        break;
                    }
                    g = g();
                }
                i = this.b;
            }
            this.b = i2;
            i2 = i;
        }
        int i3 = this.b;
        if (i2 == i3) {
            return null;
        }
        String substring = str.substring(i3, i2);
        this.b = i2;
        return substring;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: dv5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: dv5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: dv5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: dv5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v49, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v53, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: yg0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: yg0} */
    /* JADX WARNING: type inference failed for: r10v31, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.lang.Object, sg0] */
    /* JADX WARNING: type inference failed for: r10v39 */
    /* JADX WARNING: type inference failed for: r10v44, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v51 */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:250)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        r12 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019c, code lost:
        if (s('(') != false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
        U();
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a3, code lost:
        r13 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a7, code lost:
        if (r13 != null) goto L_0x01ac;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a9, code lost:
        r0.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ac, code lost:
        if (r10 != null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ae, code lost:
        r10 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b3, code lost:
        r10.add(r13);
        U();
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bd, code lost:
        if (T() != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c3, code lost:
        if (s(')') == false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c6, code lost:
        r0.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c8, code lost:
        r10 = new defpackage.tg0(r7);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01d5, code lost:
        if (v() == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d7, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d9, code lost:
        r12 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01df, code lost:
        if (s('(') != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01e2, code lost:
        U();
        r10 = l0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e9, code lost:
        if (r10 != null) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01eb, code lost:
        r0.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01f2, code lost:
        if (s(')') != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f4, code lost:
        r0.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f7, code lost:
        r12 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ff, code lost:
        if (r12.hasNext() == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0201, code lost:
        r13 = ((defpackage.xg0) r12.next()).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0209, code lost:
        if (r13 != null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020c, code lost:
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0214, code lost:
        if (r13.hasNext() == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0216, code lost:
        r15 = ((defpackage.yg0) r13.next()).d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x021e, code lost:
        if (r15 != null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0221, code lost:
        r15 = r15.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0229, code lost:
        if (r15.hasNext() == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0235, code lost:
        if ((((defpackage.og0) r15.next()) instanceof defpackage.sg0) == false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023c, code lost:
        if (r10 == 0) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x023e, code lost:
        r7 = new java.lang.Object();
        r7.a = r10;
        r8 = r10.iterator();
        r10 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x024f, code lost:
        if (r8.hasNext() == false) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0251, code lost:
        r12 = ((defpackage.xg0) r8.next()).b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0259, code lost:
        if (r12 <= r10) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x025b, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x025d, code lost:
        r4.b = r10;
        r15 = r3;
        r24 = r4;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0263, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x026f, code lost:
        throw new java.lang.Exception("Invalid or missing parameter section for pseudo class: ".concat(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0270, code lost:
        r10 = new defpackage.qg0(r9);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0278, code lost:
        r15 = r3;
        r24 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x027c, code lost:
        r10 = new defpackage.ug0(r11.b, r3);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0287, code lost:
        r10 = new defpackage.ug0(r2, r9);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0290, code lost:
        r17 = new defpackage.pg0(0, 1, false, true, r11.b);
        r4.a();
        r15 = r3;
        r24 = r4;
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02aa, code lost:
        r18 = new defpackage.pg0(0, 1, true, true, r11.b);
        r4.a();
        r15 = r3;
        r24 = r4;
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02c4, code lost:
        r19 = new defpackage.pg0(0, 1, false, false, (java.lang.String) null);
        r4.a();
        r15 = r3;
        r24 = r4;
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02dc, code lost:
        r20 = new defpackage.pg0(0, 1, true, false, (java.lang.String) null);
        r4.a();
        r15 = r3;
        r24 = r4;
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f7, code lost:
        if (r12 == defpackage.rg0.w) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fb, code lost:
        if (r12 != defpackage.rg0.x) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02fe, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0301, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0305, code lost:
        if (r12 == defpackage.rg0.x) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0309, code lost:
        if (r12 != defpackage.rg0.y) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x030c, code lost:
        r21 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x030f, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0311, code lost:
        r8 = r0.c;
        r12 = (java.lang.String) r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x031b, code lost:
        if (v() == false) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x031d, code lost:
        r8 = r2;
        r24 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0322, code lost:
        r13 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0328, code lost:
        if (s('(') != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x032b, code lost:
        U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0334, code lost:
        if (t("odd") == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0336, code lost:
        r8 = new defpackage.dv5(2, r3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x033c, code lost:
        r24 = r4;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0347, code lost:
        if (t("even") == false) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0349, code lost:
        r8 = new defpackage.dv5(2, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0357, code lost:
        if (s('+') == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x035e, code lost:
        if (s('-') == false) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0360, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0362, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0363, code lost:
        r9 = defpackage.ud3.a(r0.b, r8, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0369, code lost:
        if (r9 == null) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x036b, code lost:
        r0.b = r9.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0375, code lost:
        if (s('n') != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x037d, code lost:
        if (s('N') == false) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0380, code lost:
        r24 = r4;
        r4 = r9;
        r2 = r10;
        r9 = null;
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0389, code lost:
        if (r9 == null) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x038b, code lost:
        r24 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x038e, code lost:
        r24 = r4;
        r9 = new defpackage.ud3(1, r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0399, code lost:
        U();
        r4 = s('+');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03a2, code lost:
        if (r4 != false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03a4, code lost:
        r4 = s('-');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03a8, code lost:
        if (r4 == false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03aa, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ac, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ad, code lost:
        if (r4 == false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03af, code lost:
        U();
        r4 = defpackage.ud3.a(r0.b, r8, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03b8, code lost:
        if (r4 == null) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03ba, code lost:
        r0.b = r4.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03bf, code lost:
        r0.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03c1, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03c3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03c6, code lost:
        if (r9 != null) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03c8, code lost:
        r12 = r4;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03cb, code lost:
        r12 = r4;
        r10 = r10 * ((int) r9.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03d0, code lost:
        if (r12 != null) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03d2, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03d5, code lost:
        r2 = r2 * ((int) r12.x);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03da, code lost:
        r8 = new defpackage.dv5(r10, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03dd, code lost:
        U();
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03e6, code lost:
        if (s(')') == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03e9, code lost:
        r0.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03ec, code lost:
        if (r8 == null) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03ee, code lost:
        r17 = new defpackage.pg0(r8.b, r8.c, r20, r21, r11.b);
        r24.a();
        r10 = r17;
        r2 = 2;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0410, code lost:
        throw new java.lang.Exception("Invalid or missing parameter section for pseudo class: ".concat(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0411, code lost:
        r24 = r4;
        r15 = true;
        r10 = new defpackage.qg0(1);
        r24.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x041e, code lost:
        r15 = r3;
        r24 = r4;
        r2 = 2;
        r10 = new defpackage.qg0(2);
        r24.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x042c, code lost:
        if (r11.d != null) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x042e, code lost:
        r11.d = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0435, code lost:
        r11.d.add(r10);
        r8 = r2;
        r3 = r15;
        r4 = r24;
        r2 = null;
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x044b, code lost:
        throw new java.lang.Exception("Invalid pseudo class");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x006e, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x006e, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x006e, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x023c, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x023c, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (s('#') == false) goto L_0x00c5;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r11 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        r11 = new defpackage.yg0(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        r12 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r12 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        r11.a(r8, "id", r12);
        r4.b += 1000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        throw new java.lang.Exception("Invalid \"#id\" simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        if (s('[') == false) goto L_0x0145;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        if (r11 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        r11 = new defpackage.yg0(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        U();
        r12 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dd, code lost:
        if (r12 == null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
        U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (s('=') == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
        if (t("~=") == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
        r14 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fc, code lost:
        if (t("|=") == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fe, code lost:
        r14 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0100, code lost:
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        if (r14 == 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0103, code lost:
        U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010a, code lost:
        if (v() == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010c, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r15 = L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0112, code lost:
        if (r15 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r15 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0119, code lost:
        if (r15 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011b, code lost:
        U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0124, code lost:
        throw new java.lang.Exception("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0125, code lost:
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012c, code lost:
        if (s(']') == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        if (r14 != 0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0130, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0131, code lost:
        r11.a(r14, r12, r15);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013e, code lost:
        throw new java.lang.Exception("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0144, code lost:
        throw new java.lang.Exception("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014b, code lost:
        if (s(':') == false) goto L_0x044c;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014d, code lost:
        if (r11 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014f, code lost:
        r11 = new defpackage.yg0(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0155, code lost:
        r7 = k0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        if (r7 == null) goto L_0x0444;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015b, code lost:
        r12 = (defpackage.rg0) defpackage.rg0.A.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0163, code lost:
        if (r12 == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0166, code lost:
        r12 = defpackage.rg0.z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0172, code lost:
        switch(r12.ordinal()) {
            case b85.b :int: goto L_0x041e;
            case 1: goto L_0x0411;
            case 2: goto L_0x02f5;
            case 3: goto L_0x02f5;
            case 4: goto L_0x02f5;
            case 5: goto L_0x02f5;
            case 6: goto L_0x02dc;
            case 7: goto L_0x02c4;
            case 8: goto L_0x02aa;
            case 9: goto L_0x0290;
            case 10: goto L_0x0287;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER :int: goto L_0x027c;
            case 12: goto L_0x0270;
            case ry4.PERF_SESSIONS_FIELD_NUMBER :int: goto L_0x01d1;
            case 14: goto L_0x018f;
            case h75.g :int: goto L_0x0181;
            case 16: goto L_0x0181;
            case 17: goto L_0x0181;
            case 18: goto L_0x0181;
            case 19: goto L_0x0181;
            case 20: goto L_0x0181;
            case 21: goto L_0x0181;
            case 22: goto L_0x0181;
            case 23: goto L_0x0181;
            default: goto L_0x0175;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0180, code lost:
        throw new java.lang.Exception("Unsupported pseudo class: ".concat(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0181, code lost:
        r10 = new defpackage.tg0(r7);
        r4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0189, code lost:
        r15 = r3;
        r24 = r4;
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0193, code lost:
        if (v() == false) goto L_0x0196;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0476 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    public final java.util.ArrayList l0() {
        /*
            r26 = this;
            r0 = r26
            boolean r1 = r0.v()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 1
            r1.<init>(r3)
            xg0 r4 = new xg0
            r4.<init>()
        L_0x0015:
            boolean r5 = r0.v()
            if (r5 != 0) goto L_0x047a
            boolean r5 = r0.v()
            if (r5 == 0) goto L_0x0023
            goto L_0x047a
        L_0x0023:
            int r5 = r0.b
            java.util.ArrayList r6 = r4.a
            r8 = 2
            r9 = 0
            r10 = 43
            if (r6 == 0) goto L_0x004c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0034
            goto L_0x004c
        L_0x0034:
            r6 = 62
            boolean r6 = r0.s(r6)
            if (r6 == 0) goto L_0x0041
            r0.U()
            r6 = r8
            goto L_0x004d
        L_0x0041:
            boolean r6 = r0.s(r10)
            if (r6 == 0) goto L_0x004c
            r0.U()
            r6 = 3
            goto L_0x004d
        L_0x004c:
            r6 = r9
        L_0x004d:
            r11 = 42
            boolean r11 = r0.s(r11)
            if (r11 == 0) goto L_0x005b
            yg0 r11 = new yg0
            r11.<init>(r6, r2)
            goto L_0x006e
        L_0x005b:
            java.lang.String r11 = r0.k0()
            if (r11 == 0) goto L_0x006d
            yg0 r12 = new yg0
            r12.<init>(r6, r11)
            int r11 = r4.b
            int r11 = r11 + r3
            r4.b = r11
            r11 = r12
            goto L_0x006e
        L_0x006d:
            r11 = r2
        L_0x006e:
            boolean r12 = r0.v()
            if (r12 != 0) goto L_0x044c
            r12 = 46
            boolean r12 = r0.s(r12)
            if (r12 == 0) goto L_0x009a
            if (r11 != 0) goto L_0x0083
            yg0 r11 = new yg0
            r11.<init>(r6, r2)
        L_0x0083:
            java.lang.String r12 = r0.k0()
            if (r12 == 0) goto L_0x0092
            java.lang.String r13 = "class"
            r11.a(r8, r13, r12)
            r4.a()
            goto L_0x006e
        L_0x0092:
            kg0 r0 = new kg0
            java.lang.String r1 = "Invalid \".class\" simpleSelectors"
            r0.<init>(r1)
            throw r0
        L_0x009a:
            r12 = 35
            boolean r12 = r0.s(r12)
            if (r12 == 0) goto L_0x00c5
            if (r11 != 0) goto L_0x00a9
            yg0 r11 = new yg0
            r11.<init>(r6, r2)
        L_0x00a9:
            java.lang.String r12 = r0.k0()
            if (r12 == 0) goto L_0x00bd
            java.lang.String r13 = "id"
            r11.a(r8, r13, r12)
            int r12 = r4.b
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r12 + r13
            r4.b = r12
            goto L_0x006e
        L_0x00bd:
            kg0 r0 = new kg0
            java.lang.String r1 = "Invalid \"#id\" simpleSelectors"
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            r12 = 91
            boolean r12 = r0.s(r12)
            if (r12 == 0) goto L_0x0145
            if (r11 != 0) goto L_0x00d4
            yg0 r11 = new yg0
            r11.<init>(r6, r2)
        L_0x00d4:
            r0.U()
            java.lang.String r12 = r0.k0()
            java.lang.String r13 = "Invalid attribute simpleSelectors"
            if (r12 == 0) goto L_0x013f
            r0.U()
            r14 = 61
            boolean r14 = r0.s(r14)
            if (r14 == 0) goto L_0x00ec
            r14 = r8
            goto L_0x0101
        L_0x00ec:
            java.lang.String r14 = "~="
            boolean r14 = r0.t(r14)
            if (r14 == 0) goto L_0x00f6
            r14 = 3
            goto L_0x0101
        L_0x00f6:
            java.lang.String r14 = "|="
            boolean r14 = r0.t(r14)
            if (r14 == 0) goto L_0x0100
            r14 = 4
            goto L_0x0101
        L_0x0100:
            r14 = r9
        L_0x0101:
            if (r14 == 0) goto L_0x0125
            r0.U()
            boolean r15 = r0.v()
            if (r15 == 0) goto L_0x010e
            r15 = r2
            goto L_0x0119
        L_0x010e:
            java.lang.String r15 = r0.L()
            if (r15 == 0) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            java.lang.String r15 = r0.k0()
        L_0x0119:
            if (r15 == 0) goto L_0x011f
            r0.U()
            goto L_0x0126
        L_0x011f:
            kg0 r0 = new kg0
            r0.<init>(r13)
            throw r0
        L_0x0125:
            r15 = r2
        L_0x0126:
            r7 = 93
            boolean r7 = r0.s(r7)
            if (r7 == 0) goto L_0x0139
            if (r14 != 0) goto L_0x0131
            r14 = r3
        L_0x0131:
            r11.a(r14, r12, r15)
            r4.a()
            goto L_0x006e
        L_0x0139:
            kg0 r0 = new kg0
            r0.<init>(r13)
            throw r0
        L_0x013f:
            kg0 r0 = new kg0
            r0.<init>(r13)
            throw r0
        L_0x0145:
            r7 = 58
            boolean r7 = r0.s(r7)
            if (r7 == 0) goto L_0x044c
            if (r11 != 0) goto L_0x0155
            yg0 r7 = new yg0
            r7.<init>(r6, r2)
            r11 = r7
        L_0x0155:
            java.lang.String r7 = r0.k0()
            if (r7 == 0) goto L_0x0444
            java.util.HashMap r12 = defpackage.rg0.A
            java.lang.Object r12 = r12.get(r7)
            rg0 r12 = (defpackage.rg0) r12
            if (r12 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            rg0 r12 = defpackage.rg0.z
        L_0x0168:
            int r13 = r12.ordinal()
            java.lang.String r14 = "Invalid or missing parameter section for pseudo class: "
            r15 = 41
            r10 = 40
            switch(r13) {
                case 0: goto L_0x041e;
                case 1: goto L_0x0411;
                case 2: goto L_0x02f5;
                case 3: goto L_0x02f5;
                case 4: goto L_0x02f5;
                case 5: goto L_0x02f5;
                case 6: goto L_0x02dc;
                case 7: goto L_0x02c4;
                case 8: goto L_0x02aa;
                case 9: goto L_0x0290;
                case 10: goto L_0x0287;
                case 11: goto L_0x027c;
                case 12: goto L_0x0270;
                case 13: goto L_0x01d1;
                case 14: goto L_0x018f;
                case 15: goto L_0x0181;
                case 16: goto L_0x0181;
                case 17: goto L_0x0181;
                case 18: goto L_0x0181;
                case 19: goto L_0x0181;
                case 20: goto L_0x0181;
                case 21: goto L_0x0181;
                case 22: goto L_0x0181;
                case 23: goto L_0x0181;
                default: goto L_0x0175;
            }
        L_0x0175:
            kg0 r0 = new kg0
            java.lang.String r1 = "Unsupported pseudo class: "
            java.lang.String r1 = r1.concat(r7)
            r0.<init>(r1)
            throw r0
        L_0x0181:
            tg0 r10 = new tg0
            r10.<init>(r7)
            r4.a()
        L_0x0189:
            r15 = r3
            r24 = r4
            r2 = r8
            goto L_0x042a
        L_0x018f:
            boolean r12 = r0.v()
            if (r12 == 0) goto L_0x0196
            goto L_0x01c8
        L_0x0196:
            int r12 = r0.b
            boolean r10 = r0.s(r10)
            if (r10 != 0) goto L_0x019f
            goto L_0x01c8
        L_0x019f:
            r0.U()
            r10 = r2
        L_0x01a3:
            java.lang.String r13 = r0.k0()
            if (r13 != 0) goto L_0x01ac
            r0.b = r12
            goto L_0x01c8
        L_0x01ac:
            if (r10 != 0) goto L_0x01b3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x01b3:
            r10.add(r13)
            r0.U()
            boolean r13 = r0.T()
            if (r13 != 0) goto L_0x01a3
            boolean r10 = r0.s(r15)
            if (r10 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            r0.b = r12
        L_0x01c8:
            tg0 r10 = new tg0
            r10.<init>(r7)
            r4.a()
            goto L_0x0189
        L_0x01d1:
            boolean r12 = r0.v()
            if (r12 == 0) goto L_0x01d9
        L_0x01d7:
            r10 = r2
            goto L_0x023c
        L_0x01d9:
            int r12 = r0.b
            boolean r10 = r0.s(r10)
            if (r10 != 0) goto L_0x01e2
            goto L_0x01d7
        L_0x01e2:
            r0.U()
            java.util.ArrayList r10 = r0.l0()
            if (r10 != 0) goto L_0x01ee
            r0.b = r12
            goto L_0x01d7
        L_0x01ee:
            boolean r13 = r0.s(r15)
            if (r13 != 0) goto L_0x01f7
            r0.b = r12
            goto L_0x01d7
        L_0x01f7:
            java.util.Iterator r12 = r10.iterator()
        L_0x01fb:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x023c
            java.lang.Object r13 = r12.next()
            xg0 r13 = (defpackage.xg0) r13
            java.util.ArrayList r13 = r13.a
            if (r13 != 0) goto L_0x020c
            goto L_0x023c
        L_0x020c:
            java.util.Iterator r13 = r13.iterator()
        L_0x0210:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x023a
            java.lang.Object r15 = r13.next()
            yg0 r15 = (defpackage.yg0) r15
            java.util.ArrayList r15 = r15.d
            if (r15 != 0) goto L_0x0221
            goto L_0x023a
        L_0x0221:
            java.util.Iterator r15 = r15.iterator()
        L_0x0225:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0210
            java.lang.Object r16 = r15.next()
            r8 = r16
            og0 r8 = (defpackage.og0) r8
            boolean r8 = r8 instanceof defpackage.sg0
            if (r8 == 0) goto L_0x0238
            goto L_0x01d7
        L_0x0238:
            r8 = 2
            goto L_0x0225
        L_0x023a:
            r8 = 2
            goto L_0x01fb
        L_0x023c:
            if (r10 == 0) goto L_0x0266
            sg0 r7 = new sg0
            r7.<init>()
            r7.a = r10
            java.util.Iterator r8 = r10.iterator()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x024b:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x025d
            java.lang.Object r12 = r8.next()
            xg0 r12 = (defpackage.xg0) r12
            int r12 = r12.b
            if (r12 <= r10) goto L_0x024b
            r10 = r12
            goto L_0x024b
        L_0x025d:
            r4.b = r10
            r15 = r3
            r24 = r4
            r10 = r7
        L_0x0263:
            r2 = 2
            goto L_0x042a
        L_0x0266:
            kg0 r0 = new kg0
            java.lang.String r1 = r14.concat(r7)
            r0.<init>(r1)
            throw r0
        L_0x0270:
            qg0 r10 = new qg0
            r10.<init>(r9)
            r4.a()
        L_0x0278:
            r15 = r3
            r24 = r4
            goto L_0x0263
        L_0x027c:
            ug0 r10 = new ug0
            java.lang.String r7 = r11.b
            r10.<init>(r7, r3)
            r4.a()
            goto L_0x0278
        L_0x0287:
            ug0 r10 = new ug0
            r10.<init>(r2, r9)
            r4.a()
            goto L_0x0278
        L_0x0290:
            pg0 r17 = new pg0
            r21 = 1
            java.lang.String r7 = r11.b
            r18 = 0
            r19 = 1
            r20 = 0
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22)
            r4.a()
            r15 = r3
            r24 = r4
            r10 = r17
            goto L_0x0263
        L_0x02aa:
            pg0 r18 = new pg0
            r22 = 1
            java.lang.String r7 = r11.b
            r19 = 0
            r20 = 1
            r21 = 1
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            r4.a()
            r15 = r3
            r24 = r4
            r10 = r18
            goto L_0x0263
        L_0x02c4:
            pg0 r19 = new pg0
            r23 = 0
            r24 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r19.<init>(r20, r21, r22, r23, r24)
            r4.a()
            r15 = r3
            r24 = r4
            r10 = r19
            goto L_0x0263
        L_0x02dc:
            pg0 r20 = new pg0
            r24 = 0
            r25 = 0
            r21 = 0
            r22 = 1
            r23 = 1
            r20.<init>(r21, r22, r23, r24, r25)
            r4.a()
            r15 = r3
            r24 = r4
            r10 = r20
            goto L_0x0263
        L_0x02f5:
            rg0 r8 = defpackage.rg0.w
            if (r12 == r8) goto L_0x0301
            rg0 r8 = defpackage.rg0.x
            if (r12 != r8) goto L_0x02fe
            goto L_0x0301
        L_0x02fe:
            r20 = r9
            goto L_0x0303
        L_0x0301:
            r20 = r3
        L_0x0303:
            rg0 r8 = defpackage.rg0.x
            if (r12 == r8) goto L_0x030f
            rg0 r8 = defpackage.rg0.y
            if (r12 != r8) goto L_0x030c
            goto L_0x030f
        L_0x030c:
            r21 = r9
            goto L_0x0311
        L_0x030f:
            r21 = r3
        L_0x0311:
            int r8 = r0.c
            java.lang.Object r12 = r0.d
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r0.v()
            if (r13 == 0) goto L_0x0322
        L_0x031d:
            r8 = r2
            r24 = r4
            goto L_0x03ec
        L_0x0322:
            int r13 = r0.b
            boolean r10 = r0.s(r10)
            if (r10 != 0) goto L_0x032b
            goto L_0x031d
        L_0x032b:
            r0.U()
            java.lang.String r10 = "odd"
            boolean r10 = r0.t(r10)
            if (r10 == 0) goto L_0x0340
            dv5 r8 = new dv5
            r10 = 2
            r8.<init>(r10, r3, r3)
        L_0x033c:
            r24 = r4
            goto L_0x03dd
        L_0x0340:
            r10 = 2
            java.lang.String r2 = "even"
            boolean r2 = r0.t(r2)
            if (r2 == 0) goto L_0x034f
            dv5 r8 = new dv5
            r8.<init>(r10, r9, r3)
            goto L_0x033c
        L_0x034f:
            r2 = 43
            boolean r10 = r0.s(r2)
            r2 = 45
            if (r10 == 0) goto L_0x035a
            goto L_0x0362
        L_0x035a:
            boolean r10 = r0.s(r2)
            if (r10 == 0) goto L_0x0362
            r10 = -1
            goto L_0x0363
        L_0x0362:
            r10 = r3
        L_0x0363:
            int r9 = r0.b
            ud3 r9 = defpackage.ud3.a(r9, r8, r12)
            if (r9 == 0) goto L_0x036f
            int r15 = r9.w
            r0.b = r15
        L_0x036f:
            r15 = 110(0x6e, float:1.54E-43)
            boolean r15 = r0.s(r15)
            if (r15 != 0) goto L_0x0389
            r15 = 78
            boolean r15 = r0.s(r15)
            if (r15 == 0) goto L_0x0380
            goto L_0x0389
        L_0x0380:
            r24 = r4
            r4 = r9
            r2 = r10
            r9 = 0
            r10 = r3
            r3 = 43
            goto L_0x03c4
        L_0x0389:
            if (r9 == 0) goto L_0x038e
            r24 = r4
            goto L_0x0399
        L_0x038e:
            ud3 r9 = new ud3
            r24 = r4
            r3 = 1
            int r15 = r0.b
            r9.<init>(r3, r15)
        L_0x0399:
            r0.U()
            r3 = 43
            boolean r4 = r0.s(r3)
            if (r4 != 0) goto L_0x03ac
            boolean r4 = r0.s(r2)
            if (r4 == 0) goto L_0x03ac
            r2 = -1
            goto L_0x03ad
        L_0x03ac:
            r2 = 1
        L_0x03ad:
            if (r4 == 0) goto L_0x03c3
            r0.U()
            int r4 = r0.b
            ud3 r4 = defpackage.ud3.a(r4, r8, r12)
            if (r4 == 0) goto L_0x03bf
            int r8 = r4.w
            r0.b = r8
            goto L_0x03c4
        L_0x03bf:
            r0.b = r13
        L_0x03c1:
            r8 = 0
            goto L_0x03ec
        L_0x03c3:
            r4 = 0
        L_0x03c4:
            dv5 r8 = new dv5
            if (r9 != 0) goto L_0x03cb
            r12 = r4
            r10 = 0
            goto L_0x03d0
        L_0x03cb:
            r12 = r4
            long r3 = r9.x
            int r3 = (int) r3
            int r10 = r10 * r3
        L_0x03d0:
            if (r12 != 0) goto L_0x03d5
            r2 = 0
        L_0x03d3:
            r15 = 1
            goto L_0x03da
        L_0x03d5:
            long r3 = r12.x
            int r3 = (int) r3
            int r2 = r2 * r3
            goto L_0x03d3
        L_0x03da:
            r8.<init>(r10, r2, r15)
        L_0x03dd:
            r0.U()
            r2 = 41
            boolean r2 = r0.s(r2)
            if (r2 == 0) goto L_0x03e9
            goto L_0x03ec
        L_0x03e9:
            r0.b = r13
            goto L_0x03c1
        L_0x03ec:
            if (r8 == 0) goto L_0x0407
            pg0 r17 = new pg0
            int r2 = r8.b
            int r3 = r8.c
            java.lang.String r4 = r11.b
            r18 = r2
            r19 = r3
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r24.a()
            r10 = r17
            r2 = 2
            r15 = 1
            goto L_0x042a
        L_0x0407:
            kg0 r0 = new kg0
            java.lang.String r1 = r14.concat(r7)
            r0.<init>(r1)
            throw r0
        L_0x0411:
            r24 = r4
            qg0 r10 = new qg0
            r15 = 1
            r10.<init>(r15)
            r24.a()
            goto L_0x0263
        L_0x041e:
            r15 = r3
            r24 = r4
            qg0 r10 = new qg0
            r2 = 2
            r10.<init>(r2)
            r24.a()
        L_0x042a:
            java.util.ArrayList r3 = r11.d
            if (r3 != 0) goto L_0x0435
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11.d = r3
        L_0x0435:
            java.util.ArrayList r3 = r11.d
            r3.add(r10)
            r8 = r2
            r3 = r15
            r4 = r24
            r2 = 0
            r9 = 0
            r10 = 43
            goto L_0x006e
        L_0x0444:
            kg0 r0 = new kg0
            java.lang.String r1 = "Invalid pseudo class"
            r0.<init>(r1)
            throw r0
        L_0x044c:
            r15 = r3
            r24 = r4
            if (r11 == 0) goto L_0x0476
            r4 = r24
            java.util.ArrayList r2 = r4.a
            if (r2 != 0) goto L_0x045e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.a = r2
        L_0x045e:
            java.util.ArrayList r2 = r4.a
            r2.add(r11)
            boolean r2 = r0.T()
            if (r2 != 0) goto L_0x046d
        L_0x0469:
            r3 = r15
            r2 = 0
            goto L_0x0015
        L_0x046d:
            r1.add(r4)
            xg0 r4 = new xg0
            r4.<init>()
            goto L_0x0469
        L_0x0476:
            r4 = r24
            r0.b = r5
        L_0x047a:
            java.util.ArrayList r0 = r4.a
            if (r0 == 0) goto L_0x0488
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0485
            goto L_0x0488
        L_0x0485:
            r1.add(r4)
        L_0x0488:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg0.l0():java.util.ArrayList");
    }
}
