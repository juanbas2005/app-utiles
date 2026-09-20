.class public final Lre8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lbe8;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lqd8;

.field public final e:Lf01;

.field public final f:Lz53;

.field public final g:Llp5;

.field public final h:Landroidx/work/impl/WorkDatabase;

.field public final i:Lfe8;

.field public final j:Lcq1;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/lang/String;

.field public final m:Lfl3;


# direct methods
.method public constructor <init>(Lmd2;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lmd2;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lbe8;

    .line 7
    .line 8
    iput-object v0, p0, Lre8;->a:Lbe8;

    .line 9
    .line 10
    iget-object v1, p1, Lmd2;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/Context;

    .line 13
    .line 14
    iput-object v1, p0, Lre8;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, v0, Lbe8;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lre8;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, Lmd2;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lqd8;

    .line 23
    .line 24
    iput-object v1, p0, Lre8;->d:Lqd8;

    .line 25
    .line 26
    iget-object v1, p1, Lmd2;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lf01;

    .line 29
    .line 30
    iput-object v1, p0, Lre8;->e:Lf01;

    .line 31
    .line 32
    iget-object v1, v1, Lf01;->d:Lz53;

    .line 33
    .line 34
    iput-object v1, p0, Lre8;->f:Lz53;

    .line 35
    .line 36
    iget-object v1, p1, Lmd2;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Llp5;

    .line 39
    .line 40
    iput-object v1, p0, Lre8;->g:Llp5;

    .line 41
    .line 42
    iget-object v1, p1, Lmd2;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 45
    .line 46
    iput-object v1, p0, Lre8;->h:Landroidx/work/impl/WorkDatabase;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p0, Lre8;->i:Lfe8;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->r()Lcq1;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lre8;->j:Lcq1;

    .line 59
    .line 60
    iget-object p1, p1, Lmd2;->g:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    check-cast v1, Ljava/util/ArrayList;

    .line 64
    .line 65
    iput-object v1, p0, Lre8;->k:Ljava/util/ArrayList;

    .line 66
    .line 67
    const-string p1, "Work [ id="

    .line 68
    .line 69
    const-string v2, ", tags={ "

    .line 70
    .line 71
    invoke-static {p1, v0, v2}, Lb81;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/4 v5, 0x0

    .line 76
    const/16 v6, 0x3e

    .line 77
    .line 78
    const-string v2, ","

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v6}, Ldt0;->E0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr2;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, " } ]"

    .line 87
    .line 88
    invoke-static {p1, v0, v1}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lre8;->l:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {}, Lr16;->l()Lfl3;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lre8;->m:Lfl3;

    .line 99
    .line 100
    return-void
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public static final a(Lre8;Lh61;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v6, v1, Lre8;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, v1, Lre8;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v7, v1, Lre8;->d:Lqd8;

    .line 10
    .line 11
    iget-object v8, v1, Lre8;->h:Landroidx/work/impl/WorkDatabase;

    .line 12
    .line 13
    iget-object v3, v1, Lre8;->e:Lf01;

    .line 14
    .line 15
    iget-object v4, v3, Lf01;->m:Ltd0;

    .line 16
    .line 17
    iget-object v5, v1, Lre8;->a:Lbe8;

    .line 18
    .line 19
    instance-of v9, v0, Lqe8;

    .line 20
    .line 21
    if-eqz v9, :cond_0

    .line 22
    .line 23
    move-object v9, v0

    .line 24
    check-cast v9, Lqe8;

    .line 25
    .line 26
    iget v10, v9, Lqe8;->B:I

    .line 27
    .line 28
    const/high16 v11, -0x80000000

    .line 29
    .line 30
    and-int v12, v10, v11

    .line 31
    .line 32
    if-eqz v12, :cond_0

    .line 33
    .line 34
    sub-int/2addr v10, v11

    .line 35
    iput v10, v9, Lqe8;->B:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v9, Lqe8;

    .line 39
    .line 40
    invoke-direct {v9, v1, v0}, Lqe8;-><init>(Lre8;Lh61;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, v9, Lqe8;->z:Ljava/lang/Object;

    .line 44
    .line 45
    iget v10, v9, Lqe8;->B:I

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    if-eqz v10, :cond_2

    .line 49
    .line 50
    if-ne v10, v11, :cond_1

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    move-object/from16 v19, v6

    .line 56
    .line 57
    goto/16 :goto_b

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object/from16 v19, v6

    .line 61
    .line 62
    goto/16 :goto_c

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object v4, v6

    .line 66
    goto/16 :goto_d

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_2
    invoke-static {v0}, Lo85;->q(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v10, v3, Lf01;->e:Ltd0;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lf55;->p()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    iget-object v12, v5, Lbe8;->x:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v13, v5, Lbe8;->c:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v14, v5, Lbe8;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    if-eqz v12, :cond_5

    .line 96
    .line 97
    invoke-virtual {v5}, Lbe8;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 102
    .line 103
    const/16 v15, 0x1d

    .line 104
    .line 105
    if-lt v11, v15, :cond_3

    .line 106
    .line 107
    invoke-static {v12}, Lf55;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-static {v0, v11}, Ltk7;->a(ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_3
    invoke-static {v12}, Lf55;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    const-string v15, "asyncTraceBegin"

    .line 120
    .line 121
    :try_start_1
    sget-object v16, Lf55;->f:Ljava/lang/reflect/Method;

    .line 122
    .line 123
    if-nez v16, :cond_4

    .line 124
    .line 125
    move/from16 v16, v0

    .line 126
    .line 127
    const-class v0, Landroid/os/Trace;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 128
    .line 129
    move/from16 v17, v4

    .line 130
    .line 131
    :try_start_2
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 132
    .line 133
    move-object/from16 v18, v12

    .line 134
    .line 135
    :try_start_3
    const-class v12, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 136
    .line 137
    move-object/from16 v19, v6

    .line 138
    .line 139
    :try_start_4
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 140
    .line 141
    filled-new-array {v4, v12, v6}, [Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v0, v15, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sput-object v0, Lf55;->f:Ljava/lang/reflect/Method;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catch_1
    move-exception v0

    .line 153
    goto :goto_3

    .line 154
    :catch_2
    move-exception v0

    .line 155
    move-object/from16 v19, v6

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catch_3
    move-exception v0

    .line 159
    :goto_1
    move-object/from16 v19, v6

    .line 160
    .line 161
    move-object/from16 v18, v12

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :catch_4
    move-exception v0

    .line 165
    move/from16 v17, v4

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    move/from16 v16, v0

    .line 169
    .line 170
    move/from16 v17, v4

    .line 171
    .line 172
    move-object/from16 v19, v6

    .line 173
    .line 174
    move-object/from16 v18, v12

    .line 175
    .line 176
    :goto_2
    sget-object v0, Lf55;->f:Ljava/lang/reflect/Method;

    .line 177
    .line 178
    sget-wide v20, Lf55;->d:J

    .line 179
    .line 180
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    filled-new-array {v4, v11, v6}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const/4 v6, 0x0

    .line 193
    invoke-virtual {v0, v6, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :goto_3
    invoke-static {v15, v0}, Lf55;->o(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_5
    :goto_4
    move/from16 v17, v4

    .line 202
    .line 203
    move-object/from16 v19, v6

    .line 204
    .line 205
    move-object/from16 v18, v12

    .line 206
    .line 207
    :goto_5
    new-instance v0, Lke8;

    .line 208
    .line 209
    const/4 v4, 0x0

    .line 210
    invoke-direct {v0, v1, v4}, Lke8;-><init>(Lre8;I)V

    .line 211
    .line 212
    .line 213
    new-instance v6, Lhx4;

    .line 214
    .line 215
    const/16 v11, 0xc

    .line 216
    .line 217
    invoke-direct {v6, v11, v0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v6}, La96;->o(Lsr2;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Ljava/lang/Boolean;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_6

    .line 231
    .line 232
    new-instance v0, Lne8;

    .line 233
    .line 234
    invoke-direct {v0}, Lne8;-><init>()V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_e

    .line 238
    .line 239
    :cond_6
    invoke-virtual {v5}, Lbe8;->c()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_7

    .line 244
    .line 245
    iget-object v0, v5, Lbe8;->e:Lce1;

    .line 246
    .line 247
    goto/16 :goto_9

    .line 248
    .line 249
    :cond_7
    iget-object v0, v3, Lf01;->f:Lxb4;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    sget-object v0, Lpc3;->a:Ljava/lang/String;

    .line 258
    .line 259
    :try_start_5
    invoke-static {v14}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 263
    const/4 v6, 0x0

    .line 264
    :try_start_6
    invoke-virtual {v0, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    check-cast v0, Landroidx/work/OverwritingInputMerger;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 276
    .line 277
    move-object v6, v0

    .line 278
    goto :goto_7

    .line 279
    :catch_5
    move-exception v0

    .line 280
    goto :goto_6

    .line 281
    :catch_6
    move-exception v0

    .line 282
    const/4 v6, 0x0

    .line 283
    :goto_6
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    sget-object v15, Lpc3;->a:Ljava/lang/String;

    .line 288
    .line 289
    const-string v6, "Trouble instantiating "

    .line 290
    .line 291
    invoke-virtual {v6, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-virtual {v12, v15, v6, v0}, Lbc4;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    const/4 v6, 0x0

    .line 299
    :goto_7
    if-nez v6, :cond_8

    .line 300
    .line 301
    sget-object v0, Lse8;->a:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    const-string v2, "Could not create Input Merger "

    .line 308
    .line 309
    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v1, v0, v2}, Lbc4;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    new-instance v0, Lle8;

    .line 317
    .line 318
    invoke-direct {v0}, Lle8;-><init>()V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_e

    .line 322
    .line 323
    :cond_8
    iget-object v0, v5, Lbe8;->e:Lce1;

    .line 324
    .line 325
    invoke-static {v0}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    iget-object v6, v1, Lre8;->i:Lfe8;

    .line 330
    .line 331
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object v6, v6, Lfe8;->a:La96;

    .line 338
    .line 339
    new-instance v12, Lsd8;

    .line 340
    .line 341
    const/16 v14, 0x8

    .line 342
    .line 343
    invoke-direct {v12, v2, v14}, Lsd8;-><init>(Ljava/lang/String;I)V

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x1

    .line 347
    invoke-static {v6, v14, v4, v12}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    check-cast v6, Ljava/util/List;

    .line 352
    .line 353
    invoke-static {v0, v6}, Ldt0;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v6, Lbe1;

    .line 358
    .line 359
    invoke-direct {v6, v4}, Lbe1;-><init>(I)V

    .line 360
    .line 361
    .line 362
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 363
    .line 364
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v12

    .line 375
    if-eqz v12, :cond_9

    .line 376
    .line 377
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    check-cast v12, Lce1;

    .line 382
    .line 383
    iget-object v12, v12, Lce1;->a:Ljava/util/HashMap;

    .line 384
    .line 385
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-interface {v4, v12}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 393
    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_9
    invoke-virtual {v6, v4}, Lbe1;->a(Ljava/util/HashMap;)V

    .line 397
    .line 398
    .line 399
    new-instance v0, Lce1;

    .line 400
    .line 401
    iget-object v4, v6, Lbe1;->a:Ljava/util/LinkedHashMap;

    .line 402
    .line 403
    invoke-direct {v0, v4}, Lce1;-><init>(Ljava/util/LinkedHashMap;)V

    .line 404
    .line 405
    .line 406
    invoke-static {v0}, Lr16;->g0(Lce1;)[B

    .line 407
    .line 408
    .line 409
    :goto_9
    new-instance v4, Landroidx/work/WorkerParameters;

    .line 410
    .line 411
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    iget-object v6, v1, Lre8;->k:Ljava/util/ArrayList;

    .line 416
    .line 417
    iget v5, v5, Lbe8;->k:I

    .line 418
    .line 419
    iget-object v12, v3, Lf01;->a:Ljava/util/concurrent/ExecutorService;

    .line 420
    .line 421
    iget-object v3, v3, Lf01;->b:Ldn1;

    .line 422
    .line 423
    new-instance v14, Lvd8;

    .line 424
    .line 425
    new-instance v14, Lhd8;

    .line 426
    .line 427
    iget-object v15, v1, Lre8;->g:Llp5;

    .line 428
    .line 429
    invoke-direct {v14, v8, v15, v7}, Lhd8;-><init>(Landroidx/work/impl/WorkDatabase;Llp5;Lqd8;)V

    .line 430
    .line 431
    .line 432
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 433
    .line 434
    .line 435
    iput-object v2, v4, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 436
    .line 437
    iput-object v0, v4, Landroidx/work/WorkerParameters;->b:Lce1;

    .line 438
    .line 439
    new-instance v0, Ljava/util/HashSet;

    .line 440
    .line 441
    invoke-direct {v0, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 442
    .line 443
    .line 444
    iput v5, v4, Landroidx/work/WorkerParameters;->c:I

    .line 445
    .line 446
    iput-object v12, v4, Landroidx/work/WorkerParameters;->d:Ljava/util/concurrent/ExecutorService;

    .line 447
    .line 448
    iput-object v3, v4, Landroidx/work/WorkerParameters;->e:Le81;

    .line 449
    .line 450
    iput-object v7, v4, Landroidx/work/WorkerParameters;->f:Lqd8;

    .line 451
    .line 452
    iput-object v10, v4, Landroidx/work/WorkerParameters;->g:Ltd0;

    .line 453
    .line 454
    iput-object v14, v4, Landroidx/work/WorkerParameters;->h:Lhd8;

    .line 455
    .line 456
    :try_start_7
    iget-object v0, v1, Lre8;->b:Landroid/content/Context;

    .line 457
    .line 458
    invoke-virtual {v10, v0, v13, v4}, Ltd0;->s(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lt84;

    .line 459
    .line 460
    .line 461
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 462
    const/4 v3, 0x1

    .line 463
    iput-boolean v3, v2, Lt84;->d:Z

    .line 464
    .line 465
    iget-object v0, v9, Lh61;->x:Le81;

    .line 466
    .line 467
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    sget-object v3, Lme6;->E:Lme6;

    .line 471
    .line 472
    invoke-interface {v0, v3}, Le81;->a0(Ld81;)Lc81;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    move-object v6, v0

    .line 480
    check-cast v6, Lel3;

    .line 481
    .line 482
    new-instance v0, Lci;

    .line 483
    .line 484
    const/4 v5, 0x1

    .line 485
    move-object v4, v1

    .line 486
    move-object v1, v2

    .line 487
    move/from16 v2, v17

    .line 488
    .line 489
    move-object/from16 v3, v18

    .line 490
    .line 491
    invoke-direct/range {v0 .. v5}, Lci;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 492
    .line 493
    .line 494
    move-object v2, v1

    .line 495
    move-object v1, v4

    .line 496
    invoke-interface {v6, v0}, Lel3;->v(Lvr2;)Lmw1;

    .line 497
    .line 498
    .line 499
    new-instance v0, Lke8;

    .line 500
    .line 501
    const/4 v3, 0x1

    .line 502
    invoke-direct {v0, v1, v3}, Lke8;-><init>(Lre8;I)V

    .line 503
    .line 504
    .line 505
    new-instance v3, Lhx4;

    .line 506
    .line 507
    invoke-direct {v3, v11, v0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v8, v3}, La96;->o(Lsr2;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    check-cast v0, Ljava/lang/Boolean;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 520
    .line 521
    .line 522
    move-result v0

    .line 523
    if-nez v0, :cond_a

    .line 524
    .line 525
    new-instance v0, Lne8;

    .line 526
    .line 527
    invoke-direct {v0}, Lne8;-><init>()V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_e

    .line 531
    .line 532
    :cond_a
    invoke-interface {v6}, Lel3;->isCancelled()Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-eqz v0, :cond_b

    .line 537
    .line 538
    new-instance v0, Lne8;

    .line 539
    .line 540
    invoke-direct {v0}, Lne8;-><init>()V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_e

    .line 544
    .line 545
    :cond_b
    iget-object v0, v7, Lqd8;->d:Liy2;

    .line 546
    .line 547
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-static {v0}, Lwe;->l(Ljava/util/concurrent/Executor;)Lh81;

    .line 551
    .line 552
    .line 553
    move-result-object v6

    .line 554
    :try_start_8
    new-instance v0, Lpd7;

    .line 555
    .line 556
    const/16 v5, 0xa

    .line 557
    .line 558
    move-object v3, v14

    .line 559
    const/4 v4, 0x0

    .line 560
    invoke-direct/range {v0 .. v5}, Lpd7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 561
    .line 562
    .line 563
    const/4 v3, 0x1

    .line 564
    iput v3, v9, Lqe8;->B:I

    .line 565
    .line 566
    invoke-static {v6, v0, v9}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 570
    sget-object v1, Lp81;->w:Lp81;

    .line 571
    .line 572
    if-ne v0, v1, :cond_c

    .line 573
    .line 574
    :goto_a
    move-object v0, v1

    .line 575
    goto :goto_e

    .line 576
    :cond_c
    :goto_b
    :try_start_9
    check-cast v0, Ls84;

    .line 577
    .line 578
    new-instance v1, Lme8;

    .line 579
    .line 580
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-direct {v1, v0}, Lme8;-><init>(Ls84;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 584
    .line 585
    .line 586
    goto :goto_a

    .line 587
    :catchall_1
    move-exception v0

    .line 588
    goto :goto_c

    .line 589
    :catch_7
    move-exception v0

    .line 590
    move-object/from16 v4, v19

    .line 591
    .line 592
    goto :goto_d

    .line 593
    :goto_c
    sget-object v1, Lse8;->a:Ljava/lang/String;

    .line 594
    .line 595
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    new-instance v3, Ljava/lang/StringBuilder;

    .line 600
    .line 601
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 602
    .line 603
    .line 604
    move-object/from16 v4, v19

    .line 605
    .line 606
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    const-string v4, " failed because it threw an exception/error"

    .line 610
    .line 611
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    invoke-virtual {v2, v1, v3, v0}, Lbc4;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 619
    .line 620
    .line 621
    new-instance v0, Lle8;

    .line 622
    .line 623
    invoke-direct {v0}, Lle8;-><init>()V

    .line 624
    .line 625
    .line 626
    goto :goto_e

    .line 627
    :goto_d
    sget-object v1, Lse8;->a:Ljava/lang/String;

    .line 628
    .line 629
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    const-string v3, " was cancelled"

    .line 634
    .line 635
    invoke-static {v4, v3}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    iget v2, v2, Lbc4;->x:I

    .line 640
    .line 641
    const/4 v4, 0x4

    .line 642
    if-gt v2, v4, :cond_d

    .line 643
    .line 644
    invoke-static {v1, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 645
    .line 646
    .line 647
    :cond_d
    throw v0

    .line 648
    :catchall_2
    sget-object v0, Lse8;->a:Ljava/lang/String;

    .line 649
    .line 650
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    new-instance v2, Ljava/lang/StringBuilder;

    .line 655
    .line 656
    const-string v3, "Could not create Worker "

    .line 657
    .line 658
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-virtual {v1, v0, v2}, Lbc4;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    new-instance v0, Lle8;

    .line 672
    .line 673
    invoke-direct {v0}, Lle8;-><init>()V

    .line 674
    .line 675
    .line 676
    :goto_e
    return-object v0
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method


# virtual methods
.method public final b(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lre8;->i:Lfe8;

    .line 2
    .line 3
    sget-object v1, Lkd8;->w:Lkd8;

    .line 4
    .line 5
    iget-object v2, p0, Lre8;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lfe8;->j(Lkd8;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lre8;->f:Lz53;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {v0, v3, v4, v2}, Lfe8;->i(JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lre8;->a:Lbe8;

    .line 23
    .line 24
    iget p0, p0, Lbe8;->v:I

    .line 25
    .line 26
    invoke-virtual {v0, p0, v2}, Lfe8;->h(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v3, -0x1

    .line 30
    .line 31
    invoke-virtual {v0, v3, v4, v2}, Lfe8;->g(JLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1, v2}, Lfe8;->k(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Lre8;->f:Lz53;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Lre8;->i:Lfe8;

    .line 11
    .line 12
    iget-object v3, p0, Lre8;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v0, v1, v3}, Lfe8;->i(JLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lkd8;->w:Lkd8;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v3}, Lfe8;->j(Lkd8;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v2, Lfe8;->a:La96;

    .line 23
    .line 24
    new-instance v1, Lsd8;

    .line 25
    .line 26
    const/4 v4, 0x6

    .line 27
    invoke-direct {v1, v3, v4}, Lsd8;-><init>(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    invoke-static {v0, v4, v5, v1}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lre8;->a:Lbe8;

    .line 42
    .line 43
    iget p0, p0, Lbe8;->v:I

    .line 44
    .line 45
    invoke-virtual {v2, p0, v3}, Lfe8;->h(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Lsd8;

    .line 49
    .line 50
    const/4 v1, 0x7

    .line 51
    invoke-direct {p0, v3, v1}, Lsd8;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v4, v5, p0}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-wide/16 v0, -0x1

    .line 58
    .line 59
    invoke-virtual {v2, v0, v1, v3}, Lfe8;->g(JLjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
.end method

.method public final d(Ls84;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lre8;->c:Ljava/lang/String;

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lsg3;->I([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Lre8;->i:Lfe8;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lit0;->k0(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Lfe8;->d(Ljava/lang/String;)Lkd8;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, Lkd8;->B:Lkd8;

    .line 33
    .line 34
    if-eq v4, v5, :cond_0

    .line 35
    .line 36
    sget-object v4, Lkd8;->z:Lkd8;

    .line 37
    .line 38
    invoke-virtual {v3, v4, v2}, Lfe8;->j(Lkd8;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v3, p0, Lre8;->j:Lcq1;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, Lcq1;->a(Ljava/lang/String;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    check-cast p1, Lp84;

    .line 52
    .line 53
    iget-object p1, p1, Lp84;->a:Lce1;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lre8;->a:Lbe8;

    .line 59
    .line 60
    iget p0, p0, Lbe8;->v:I

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, Lfe8;->h(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v3, Lfe8;->a:La96;

    .line 66
    .line 67
    new-instance v1, Lk77;

    .line 68
    .line 69
    const/16 v2, 0x17

    .line 70
    .line 71
    invoke-direct {v1, v2, p1, v0}, Lk77;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-static {p0, p1, v0, v1}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
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
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
