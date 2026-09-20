.class public abstract Lm14;
.super Lki4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic m:[Lyr3;


# instance fields
.field public final b:Lam6;

.field public final c:Lm14;

.field public final d:Ldb4;

.field public final e:Lib4;

.field public final f:Lfb4;

.field public final g:Lm70;

.field public final h:Lfb4;

.field public final i:Lib4;

.field public final j:Lib4;

.field public final k:Lib4;

.field public final l:Lfb4;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lgr5;

    .line 2
    .line 3
    const-class v1, Lm14;

    .line 4
    .line 5
    const-string v2, "functionNamesLazy"

    .line 6
    .line 7
    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lgr5;

    .line 14
    .line 15
    const-string v3, "propertyNamesLazy"

    .line 16
    .line 17
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lgr5;

    .line 23
    .line 24
    const-string v5, "classNamesLazy"

    .line 25
    .line 26
    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, Lgr5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [Lyr3;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, Lm14;->m:[Lyr3;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public constructor <init>(Lam6;La14;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm14;->b:Lam6;

    .line 8
    .line 9
    iput-object p2, p0, Lm14;->c:Lm14;

    .line 10
    .line 11
    iget-object p1, p1, Lam6;->x:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lpj3;

    .line 14
    .line 15
    iget-object p1, p1, Lpj3;->a:Lkb4;

    .line 16
    .line 17
    new-instance p2, Lj14;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p2, p0, v0}, Lj14;-><init>(Lm14;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v1, Ldb4;

    .line 27
    .line 28
    invoke-direct {v1, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lm14;->d:Ldb4;

    .line 32
    .line 33
    new-instance p2, Lj14;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {p2, p0, v1}, Lj14;-><init>(Lm14;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v2, Lib4;

    .line 43
    .line 44
    invoke-direct {v2, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lm14;->e:Lib4;

    .line 48
    .line 49
    new-instance p2, Lk14;

    .line 50
    .line 51
    invoke-direct {p2, p0, v0}, Lk14;-><init>(Lm14;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lkb4;->b(Lvr2;)Lfb4;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iput-object p2, p0, Lm14;->f:Lfb4;

    .line 59
    .line 60
    new-instance p2, Lk14;

    .line 61
    .line 62
    invoke-direct {p2, p0, v1}, Lk14;-><init>(Lm14;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p2}, Lkb4;->c(Lvr2;)Lm70;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p0, Lm14;->g:Lm70;

    .line 70
    .line 71
    new-instance p2, Lk14;

    .line 72
    .line 73
    const/4 v0, 0x2

    .line 74
    invoke-direct {p2, p0, v0}, Lk14;-><init>(Lm14;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lkb4;->b(Lvr2;)Lfb4;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iput-object p2, p0, Lm14;->h:Lfb4;

    .line 82
    .line 83
    new-instance p2, Lj14;

    .line 84
    .line 85
    invoke-direct {p2, p0, v0}, Lj14;-><init>(Lm14;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v0, Lib4;

    .line 92
    .line 93
    invoke-direct {v0, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, Lm14;->i:Lib4;

    .line 97
    .line 98
    new-instance p2, Lj14;

    .line 99
    .line 100
    const/4 v0, 0x3

    .line 101
    invoke-direct {p2, p0, v0}, Lj14;-><init>(Lm14;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v1, Lib4;

    .line 108
    .line 109
    invoke-direct {v1, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 110
    .line 111
    .line 112
    iput-object v1, p0, Lm14;->j:Lib4;

    .line 113
    .line 114
    new-instance p2, Lj14;

    .line 115
    .line 116
    const/4 v1, 0x4

    .line 117
    invoke-direct {p2, p0, v1}, Lj14;-><init>(Lm14;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v1, Lib4;

    .line 124
    .line 125
    invoke-direct {v1, p1, p2}, Lhb4;-><init>(Lkb4;Lsr2;)V

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, Lm14;->k:Lib4;

    .line 129
    .line 130
    new-instance p2, Lk14;

    .line 131
    .line 132
    invoke-direct {p2, p0, v0}, Lk14;-><init>(Lm14;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lkb4;->b(Lvr2;)Lfb4;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iput-object p1, p0, Lm14;->l:Lfb4;

    .line 140
    .line 141
    return-void
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public static l(Lh16;Lam6;)Lvw3;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lh16;->b()Ljava/lang/reflect/Member;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x6

    .line 23
    sget-object v3, Lfq7;->x:Lfq7;

    .line 24
    .line 25
    invoke-static {v3, v0, v1, v2}, Lsg3;->b0(Lfq7;ZLq14;I)Lwj3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object p1, p1, Lam6;->A:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lwr0;

    .line 32
    .line 33
    invoke-virtual {p0}, Lh16;->f()Ll16;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0, v0}, Lwr0;->h0(Ll16;Lwj3;)Lvw3;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static u(Lam6;Lzs2;Ljava/util/List;)Lv70;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lam6;->A:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lwr0;

    .line 6
    .line 7
    iget-object v2, v0, Lam6;->x:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lpj3;

    .line 10
    .line 11
    iget-object v3, v2, Lpj3;->o:Lsl4;

    .line 12
    .line 13
    invoke-static/range {p2 .. p2}, Ldt0;->h1(Ljava/lang/Iterable;)Lss;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    new-instance v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v6, 0xa

    .line 20
    .line 21
    invoke-static {v4, v6}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lss;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v6, 0x0

    .line 33
    move v7, v6

    .line 34
    :goto_0
    move-object v8, v4

    .line 35
    check-cast v8, Lf02;

    .line 36
    .line 37
    iget-object v9, v8, Lf02;->x:Ljava/util/Iterator;

    .line 38
    .line 39
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-eqz v9, :cond_7

    .line 44
    .line 45
    invoke-virtual {v8}, Lf02;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    check-cast v8, Lka3;

    .line 50
    .line 51
    iget v12, v8, Lka3;->a:I

    .line 52
    .line 53
    iget-object v8, v8, Lka3;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Ln16;

    .line 56
    .line 57
    invoke-static {v0, v8}, Lh03;->s(Lam6;Lci3;)Lu04;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    sget-object v9, Lfq7;->x:Lfq7;

    .line 62
    .line 63
    const/4 v10, 0x7

    .line 64
    const/4 v11, 0x0

    .line 65
    invoke-static {v9, v6, v11, v10}, Lsg3;->b0(Lfq7;ZLq14;I)Lwj3;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    iget-boolean v10, v8, Ln16;->d:Z

    .line 70
    .line 71
    iget-object v14, v8, Ln16;->a:Ll16;

    .line 72
    .line 73
    const/4 v15, 0x1

    .line 74
    if-eqz v10, :cond_2

    .line 75
    .line 76
    instance-of v10, v14, Lr06;

    .line 77
    .line 78
    if-eqz v10, :cond_0

    .line 79
    .line 80
    check-cast v14, Lr06;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    move-object v14, v11

    .line 84
    :goto_1
    if-eqz v14, :cond_1

    .line 85
    .line 86
    invoke-virtual {v1, v14, v9, v15}, Lwr0;->g0(Lr06;Lwj3;Z)Ldu7;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-interface {v3}, Lsl4;->g()Lfv3;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-virtual {v10, v9}, Lfv3;->f(Lvw3;)Lvw3;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    new-instance v14, Lyb5;

    .line 99
    .line 100
    invoke-direct {v14, v9, v10}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_1
    const-string v0, "Vararg parameter should be an array: "

    .line 105
    .line 106
    invoke-static {v0, v8}, Lrf2;->z(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v11

    .line 110
    :cond_2
    invoke-virtual {v1, v14, v9}, Lwr0;->h0(Ll16;Lwj3;)Lvw3;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    new-instance v14, Lyb5;

    .line 115
    .line 116
    invoke-direct {v14, v9, v11}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :goto_2
    iget-object v9, v14, Lyb5;->w:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v9, Lvw3;

    .line 122
    .line 123
    iget-object v10, v14, Lyb5;->x:Ljava/lang/Object;

    .line 124
    .line 125
    move-object/from16 v19, v10

    .line 126
    .line 127
    check-cast v19, Lvw3;

    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Lwj1;->getName()Luq4;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-virtual {v10}, Luq4;->b()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    const-string v14, "equals"

    .line 138
    .line 139
    invoke-static {v10, v14}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_3

    .line 144
    .line 145
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-ne v10, v15, :cond_3

    .line 150
    .line 151
    invoke-interface {v3}, Lsl4;->g()Lfv3;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    invoke-virtual {v10}, Lfv3;->p()Lfu6;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    invoke-virtual {v10, v9}, Lvw3;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_3

    .line 164
    .line 165
    const-string v10, "other"

    .line 166
    .line 167
    invoke-static {v10}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    :goto_3
    move-object v15, v9

    .line 172
    move-object v14, v10

    .line 173
    goto :goto_4

    .line 174
    :cond_3
    iget-object v10, v8, Ln16;->c:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v10, :cond_4

    .line 177
    .line 178
    invoke-static {v10}, Luq4;->d(Ljava/lang/String;)Luq4;

    .line 179
    .line 180
    .line 181
    move-result-object v11

    .line 182
    :cond_4
    if-nez v11, :cond_5

    .line 183
    .line 184
    move v7, v15

    .line 185
    :cond_5
    if-nez v11, :cond_6

    .line 186
    .line 187
    new-instance v10, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    const-string v11, "p"

    .line 190
    .line 191
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    invoke-static {v10}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    goto :goto_3

    .line 206
    :cond_6
    move-object v15, v9

    .line 207
    move-object v14, v11

    .line 208
    :goto_4
    new-instance v9, Lh28;

    .line 209
    .line 210
    iget-object v10, v2, Lpj3;->j:Ltd0;

    .line 211
    .line 212
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-static {v8}, Ltd0;->F(Loi3;)Lsa6;

    .line 216
    .line 217
    .line 218
    move-result-object v20

    .line 219
    const/4 v11, 0x0

    .line 220
    const/16 v16, 0x0

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    const/16 v18, 0x0

    .line 225
    .line 226
    move-object/from16 v10, p1

    .line 227
    .line 228
    invoke-direct/range {v9 .. v20}, Lh28;-><init>(Lpi0;Lh28;ILrm;Luq4;Lvw3;ZZZLvw3;Lsy6;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_7
    invoke-static {v5}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    new-instance v1, Lv70;

    .line 241
    .line 242
    const/4 v2, 0x4

    .line 243
    invoke-direct {v1, v2, v0, v7}, Lv70;-><init>(ILjava/lang/Object;Z)V

    .line 244
    .line 245
    .line 246
    return-object v1
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method


# virtual methods
.method public a(Lis1;Lvr2;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lm14;->d:Ldb4;

    .line 5
    .line 6
    invoke-virtual {p0}, Lib4;->b()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/util/Collection;

    .line 11
    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public b(Luq4;Loz4;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lm14;->c()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p0, La42;->w:La42;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, Lm14;->h:Lfb4;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lfb4;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/Collection;

    .line 27
    .line 28
    return-object p0
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final c()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lm14;->m:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lm14;->i:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lm14;->m:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lm14;->k:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f(Luq4;Loz4;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm14;->g()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    sget-object p0, La42;->w:La42;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    iget-object p0, p0, Lm14;->l:Lfb4;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lfb4;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/util/Collection;

    .line 24
    .line 25
    return-object p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final g()Ljava/util/Set;
    .locals 2

    .line 1
    sget-object v0, Lm14;->m:[Lyr3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lm14;->j:Lib4;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lp25;->q(Lt05;Lyr3;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Set;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract h(Lis1;Lvr2;)Ljava/util/Set;
.end method

.method public abstract i(Lis1;Ljo3;)Ljava/util/Set;
.end method

.method public j(Luq4;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public abstract k()Lck1;
.end method

.method public abstract m(Ljava/util/LinkedHashSet;Luq4;)V
.end method

.method public abstract n(Luq4;Ljava/util/ArrayList;)V
.end method

.method public abstract o(Lis1;)Ljava/util/Set;
.end method

.method public abstract p()Lqz3;
.end method

.method public abstract q()Lvj1;
.end method

.method public r(Llj3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public abstract s(Lh16;Ljava/util/ArrayList;Lvw3;Ljava/util/List;)Ll14;
.end method

.method public final t(Lh16;)Llj3;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lm14;->b:Lam6;

    .line 9
    .line 10
    invoke-static {v2, v1}, Lh03;->s(Lam6;Lci3;)Lu04;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v0}, Lm14;->q()Lvj1;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v1}, Lg16;->c()Luq4;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    iget-object v6, v2, Lam6;->x:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v6, Lpj3;

    .line 25
    .line 26
    iget-object v6, v6, Lpj3;->j:Ltd0;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ltd0;->F(Loi3;)Lsa6;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, v0, Lm14;->e:Lib4;

    .line 36
    .line 37
    invoke-virtual {v7}, Lib4;->b()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Lck1;

    .line 42
    .line 43
    invoke-virtual {v1}, Lg16;->c()Luq4;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-interface {v7, v8}, Lck1;->b(Luq4;)Lk16;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    const/4 v8, 0x0

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Lh16;->g()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v7, v8

    .line 69
    :goto_0
    invoke-static {v4, v3, v5, v6, v7}, Llj3;->u1(Lvj1;Lu04;Luq4;Lsa6;Z)Llj3;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v3, v2, Lam6;->z:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Lnz3;

    .line 79
    .line 80
    iget-object v4, v2, Lam6;->x:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Lpj3;

    .line 83
    .line 84
    new-instance v5, Lr14;

    .line 85
    .line 86
    invoke-direct {v5, v2, v9, v1, v8}, Lr14;-><init>(Lam6;Lxj1;Lyj3;I)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Lam6;

    .line 90
    .line 91
    invoke-direct {v2, v4, v5, v3}, Lam6;-><init>(Lpj3;Lup7;Lnz3;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lh16;->getTypeParameters()Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v4, Ljava/util/ArrayList;

    .line 99
    .line 100
    const/16 v5, 0xa

    .line 101
    .line 102
    invoke-static {v3, v5}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_1

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Lm16;

    .line 124
    .line 125
    iget-object v6, v2, Lam6;->y:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v6, Lup7;

    .line 128
    .line 129
    invoke-interface {v6, v5}, Lup7;->d(Lm16;)Lqp7;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {v1}, Lh16;->g()Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {v2, v9, v3}, Lm14;->u(Lam6;Lzs2;Ljava/util/List;)Lv70;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-static {v1, v2}, Lm14;->l(Lh16;Lam6;)Lvw3;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    iget-object v6, v3, Lv70;->y:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v6, Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v4, v5, v6}, Lm14;->s(Lh16;Ljava/util/ArrayList;Lvw3;Ljava/util/List;)Ll14;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    iget-object v5, v4, Ll14;->d:Ljava/util/List;

    .line 161
    .line 162
    invoke-virtual {v0}, Lm14;->p()Lqz3;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    iget-object v13, v4, Ll14;->c:Ljava/util/ArrayList;

    .line 167
    .line 168
    iget-object v14, v4, Ll14;->b:Ljava/util/List;

    .line 169
    .line 170
    iget-object v15, v4, Ll14;->a:Lvw3;

    .line 171
    .line 172
    invoke-virtual {v1}, Lh16;->b()Ljava/lang/reflect/Member;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Ljava/lang/reflect/Method;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-virtual {v1}, Lh16;->b()Ljava/lang/reflect/Member;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Ljava/lang/reflect/Method;

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    sget-object v6, Lfl4;->w:Lhr2;

    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    if-eqz v0, :cond_2

    .line 206
    .line 207
    sget-object v0, Lfl4;->A:Lfl4;

    .line 208
    .line 209
    :goto_2
    move-object/from16 v16, v0

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_2
    if-nez v4, :cond_3

    .line 213
    .line 214
    sget-object v0, Lfl4;->z:Lfl4;

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_3
    sget-object v0, Lfl4;->x:Lfl4;

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :goto_3
    invoke-virtual {v1}, Lg16;->e()Lh8;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, Li35;->q(Lh8;)Lus1;

    .line 225
    .line 226
    .line 227
    move-result-object v17

    .line 228
    sget-object v18, Lb42;->w:Lb42;

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    sget-object v12, La42;->w:La42;

    .line 232
    .line 233
    invoke-virtual/range {v9 .. v18}, Llj3;->t1(Lqz3;Lqz3;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lvw3;Lfl4;Lus1;Ljava/util/Map;)Lau6;

    .line 234
    .line 235
    .line 236
    iget-object v0, v1, Lh16;->a:Ljava/lang/reflect/Method;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isNative(I)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    iput-boolean v0, v9, Lzs2;->K:Z

    .line 247
    .line 248
    iget-boolean v0, v3, Lv70;->x:Z

    .line 249
    .line 250
    invoke-virtual {v9, v8, v0}, Llj3;->v1(ZZ)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_4

    .line 258
    .line 259
    return-object v9

    .line 260
    :cond_4
    iget-object v0, v2, Lam6;->x:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Lpj3;

    .line 263
    .line 264
    iget-object v0, v0, Lpj3;->e:Lpe2;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    const-string v0, "Should not be called"

    .line 270
    .line 271
    invoke-static {v0}, Lkj6;->n(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    return-object v0
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy scope for "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lm14;->q()Lvj1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
    .line 20
    .line 21
.end method
