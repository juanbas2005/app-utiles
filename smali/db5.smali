.class public final Ldb5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmh4;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lz75;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lph4;

.field public final j:Lph4;

.field public final k:F

.field public final l:I

.field public final m:Z

.field public final n:Lgx6;

.field public final o:Lmh4;

.field public final p:Z

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Lo81;

.field public final t:Ltp1;

.field public final u:J


# direct methods
.method public synthetic constructor <init>(IIIIIILgx6;Lmh4;Lo81;Ltp1;J)V
    .locals 23

    const/4 v13, 0x0

    const/16 v16, 0x0

    .line 59
    sget-object v1, La42;->w:La42;

    sget-object v5, Lz75;->x:Lz75;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v17, v1

    move-object/from16 v18, v1

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v14, p7

    move-object/from16 v15, p8

    move-object/from16 v19, p9

    move-object/from16 v20, p10

    move-wide/from16 v21, p11

    invoke-direct/range {v0 .. v22}, Ldb5;-><init>(Ljava/util/List;IIILz75;IIILph4;Lph4;FIZLgx6;Lmh4;ZLjava/util/List;Ljava/util/List;Lo81;Ltp1;J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IIILz75;IIILph4;Lph4;FIZLgx6;Lmh4;ZLjava/util/List;Ljava/util/List;Lo81;Ltp1;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldb5;->a:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Ldb5;->b:I

    .line 7
    .line 8
    iput p3, p0, Ldb5;->c:I

    .line 9
    .line 10
    iput p4, p0, Ldb5;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Ldb5;->e:Lz75;

    .line 13
    .line 14
    iput p6, p0, Ldb5;->f:I

    .line 15
    .line 16
    iput p7, p0, Ldb5;->g:I

    .line 17
    .line 18
    iput p8, p0, Ldb5;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Ldb5;->i:Lph4;

    .line 21
    .line 22
    iput-object p10, p0, Ldb5;->j:Lph4;

    .line 23
    .line 24
    iput p11, p0, Ldb5;->k:F

    .line 25
    .line 26
    iput p12, p0, Ldb5;->l:I

    .line 27
    .line 28
    iput-boolean p13, p0, Ldb5;->m:Z

    .line 29
    .line 30
    iput-object p14, p0, Ldb5;->n:Lgx6;

    .line 31
    .line 32
    iput-object p15, p0, Ldb5;->o:Lmh4;

    .line 33
    .line 34
    move/from16 p1, p16

    .line 35
    .line 36
    iput-boolean p1, p0, Ldb5;->p:Z

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Ldb5;->q:Ljava/util/List;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Ldb5;->r:Ljava/util/List;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Ldb5;->s:Lo81;

    .line 49
    .line 50
    move-object/from16 p1, p20

    .line 51
    .line 52
    iput-object p1, p0, Ldb5;->t:Ltp1;

    .line 53
    .line 54
    move-wide/from16 p1, p21

    .line 55
    .line 56
    iput-wide p1, p0, Ldb5;->u:J

    .line 57
    .line 58
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->a()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public final b()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->b()V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->c()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public final d()Lvr2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->d()Lvr2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public final e()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->e()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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
.end method

.method public final f()Lgs2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->f()Lgs2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public final g()Lvr2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->g()Lvr2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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
.end method

.method public final h(I)Ldb5;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ldb5;->b:I

    .line 6
    .line 7
    iget v3, v0, Ldb5;->c:I

    .line 8
    .line 9
    add-int/2addr v2, v3

    .line 10
    iget-boolean v3, v0, Ldb5;->p:Z

    .line 11
    .line 12
    if-nez v3, :cond_8

    .line 13
    .line 14
    iget-object v3, v0, Ldb5;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-nez v4, :cond_8

    .line 21
    .line 22
    iget-object v4, v0, Ldb5;->i:Lph4;

    .line 23
    .line 24
    if-eqz v4, :cond_8

    .line 25
    .line 26
    iget v4, v0, Ldb5;->l:I

    .line 27
    .line 28
    sub-int/2addr v4, v1

    .line 29
    if-ltz v4, :cond_8

    .line 30
    .line 31
    if-ge v4, v2, :cond_8

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    int-to-float v5, v1

    .line 36
    int-to-float v6, v2

    .line 37
    div-float/2addr v5, v6

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v5, 0x0

    .line 40
    :goto_0
    iget v6, v0, Ldb5;->k:F

    .line 41
    .line 42
    sub-float v16, v6, v5

    .line 43
    .line 44
    iget-object v5, v0, Ldb5;->j:Lph4;

    .line 45
    .line 46
    if-eqz v5, :cond_8

    .line 47
    .line 48
    const/high16 v5, 0x3f000000    # 0.5f

    .line 49
    .line 50
    cmpl-float v5, v16, v5

    .line 51
    .line 52
    if-gez v5, :cond_8

    .line 53
    .line 54
    const/high16 v5, -0x41000000    # -0.5f

    .line 55
    .line 56
    cmpg-float v5, v16, v5

    .line 57
    .line 58
    if-gtz v5, :cond_1

    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_1
    invoke-static {v3}, Ldt0;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lph4;

    .line 67
    .line 68
    invoke-static {v3}, Ldt0;->G0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Lph4;

    .line 73
    .line 74
    iget v7, v0, Ldb5;->g:I

    .line 75
    .line 76
    iget v8, v0, Ldb5;->f:I

    .line 77
    .line 78
    if-gez v1, :cond_2

    .line 79
    .line 80
    iget v5, v5, Lph4;->j:I

    .line 81
    .line 82
    add-int/2addr v5, v2

    .line 83
    sub-int/2addr v5, v8

    .line 84
    iget v6, v6, Lph4;->j:I

    .line 85
    .line 86
    add-int/2addr v6, v2

    .line 87
    sub-int/2addr v6, v7

    .line 88
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    neg-int v5, v1

    .line 93
    if-le v2, v5, :cond_8

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget v2, v5, Lph4;->j:I

    .line 97
    .line 98
    sub-int/2addr v8, v2

    .line 99
    iget v2, v6, Lph4;->j:I

    .line 100
    .line 101
    sub-int/2addr v7, v2

    .line 102
    invoke-static {v8, v7}, Ljava/lang/Math;->min(II)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-le v2, v1, :cond_8

    .line 107
    .line 108
    :goto_1
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const/4 v5, 0x0

    .line 113
    move v6, v5

    .line 114
    :goto_2
    if-ge v6, v2, :cond_3

    .line 115
    .line 116
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lph4;

    .line 121
    .line 122
    invoke-virtual {v7, v1}, Lph4;->a(I)V

    .line 123
    .line 124
    .line 125
    add-int/lit8 v6, v6, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    iget-object v2, v0, Ldb5;->q:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    move v6, v5

    .line 135
    :goto_3
    if-ge v6, v3, :cond_4

    .line 136
    .line 137
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, Lph4;

    .line 142
    .line 143
    invoke-virtual {v7, v1}, Lph4;->a(I)V

    .line 144
    .line 145
    .line 146
    add-int/lit8 v6, v6, 0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    iget-object v2, v0, Ldb5;->r:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    move v6, v5

    .line 156
    :goto_4
    if-ge v6, v3, :cond_5

    .line 157
    .line 158
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Lph4;

    .line 163
    .line 164
    invoke-virtual {v7, v1}, Lph4;->a(I)V

    .line 165
    .line 166
    .line 167
    add-int/lit8 v6, v6, 0x1

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    new-instance v2, Ldb5;

    .line 171
    .line 172
    iget-boolean v3, v0, Ldb5;->m:Z

    .line 173
    .line 174
    if-nez v3, :cond_7

    .line 175
    .line 176
    if-lez v1, :cond_6

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_6
    :goto_5
    move/from16 v18, v5

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_7
    :goto_6
    const/4 v5, 0x1

    .line 183
    goto :goto_5

    .line 184
    :goto_7
    iget-object v1, v0, Ldb5;->t:Ltp1;

    .line 185
    .line 186
    iget-wide v5, v0, Ldb5;->u:J

    .line 187
    .line 188
    move-wide/from16 v26, v5

    .line 189
    .line 190
    iget-object v6, v0, Ldb5;->a:Ljava/util/List;

    .line 191
    .line 192
    iget v7, v0, Ldb5;->b:I

    .line 193
    .line 194
    iget v8, v0, Ldb5;->c:I

    .line 195
    .line 196
    iget v9, v0, Ldb5;->d:I

    .line 197
    .line 198
    iget-object v10, v0, Ldb5;->e:Lz75;

    .line 199
    .line 200
    iget v11, v0, Ldb5;->f:I

    .line 201
    .line 202
    iget v12, v0, Ldb5;->g:I

    .line 203
    .line 204
    iget v13, v0, Ldb5;->h:I

    .line 205
    .line 206
    iget-object v14, v0, Ldb5;->i:Lph4;

    .line 207
    .line 208
    iget-object v15, v0, Ldb5;->j:Lph4;

    .line 209
    .line 210
    iget-object v3, v0, Ldb5;->n:Lgx6;

    .line 211
    .line 212
    iget-object v5, v0, Ldb5;->o:Lmh4;

    .line 213
    .line 214
    move-object/from16 v25, v1

    .line 215
    .line 216
    iget-boolean v1, v0, Ldb5;->p:Z

    .line 217
    .line 218
    move/from16 v21, v1

    .line 219
    .line 220
    iget-object v1, v0, Ldb5;->q:Ljava/util/List;

    .line 221
    .line 222
    move-object/from16 v22, v1

    .line 223
    .line 224
    iget-object v1, v0, Ldb5;->r:Ljava/util/List;

    .line 225
    .line 226
    iget-object v0, v0, Ldb5;->s:Lo81;

    .line 227
    .line 228
    move-object/from16 v24, v0

    .line 229
    .line 230
    move-object/from16 v23, v1

    .line 231
    .line 232
    move-object/from16 v19, v3

    .line 233
    .line 234
    move/from16 v17, v4

    .line 235
    .line 236
    move-object/from16 v20, v5

    .line 237
    .line 238
    move-object v5, v2

    .line 239
    invoke-direct/range {v5 .. v27}, Ldb5;-><init>(Ljava/util/List;IIILz75;IIILph4;Lph4;FIZLgx6;Lmh4;ZLjava/util/List;Ljava/util/List;Lo81;Ltp1;J)V

    .line 240
    .line 241
    .line 242
    return-object v5

    .line 243
    :cond_8
    :goto_8
    const/4 v0, 0x0

    .line 244
    return-object v0
    .line 245
    .line 246
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final i()J
    .locals 6

    .line 1
    iget-object p0, p0, Ldb5;->o:Lmh4;

    .line 2
    .line 3
    invoke-interface {p0}, Lmh4;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Lmh4;->c()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-long v0, v0

    .line 12
    const/16 v2, 0x20

    .line 13
    .line 14
    shl-long/2addr v0, v2

    .line 15
    int-to-long v2, p0

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v2, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    return-wide v0
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
