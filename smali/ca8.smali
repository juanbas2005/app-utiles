.class public final Lca8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final a:Lus0;

.field public b:Ldb8;


# direct methods
.method public constructor <init>(Landroid/view/View;Lus0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lca8;->a:Lus0;

    .line 5
    .line 6
    sget-object p2, Le58;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-static {p1}, Lx48;->a(Landroid/view/View;)Ldb8;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_6

    .line 13
    .line 14
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v0, 0x24

    .line 17
    .line 18
    if-lt p2, v0, :cond_0

    .line 19
    .line 20
    new-instance p2, Lpa8;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Lpa8;-><init>(Ldb8;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v0, 0x23

    .line 27
    .line 28
    if-lt p2, v0, :cond_1

    .line 29
    .line 30
    new-instance p2, Loa8;

    .line 31
    .line 32
    invoke-direct {p2, p1}, Loa8;-><init>(Ldb8;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v0, 0x22

    .line 37
    .line 38
    if-lt p2, v0, :cond_2

    .line 39
    .line 40
    new-instance p2, Lna8;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Lna8;-><init>(Ldb8;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/16 v0, 0x1f

    .line 47
    .line 48
    if-lt p2, v0, :cond_3

    .line 49
    .line 50
    new-instance p2, Lma8;

    .line 51
    .line 52
    invoke-direct {p2, p1}, Lma8;-><init>(Ldb8;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/16 v0, 0x1e

    .line 57
    .line 58
    if-lt p2, v0, :cond_4

    .line 59
    .line 60
    new-instance p2, Lla8;

    .line 61
    .line 62
    invoke-direct {p2, p1}, Lla8;-><init>(Ldb8;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    const/16 v0, 0x1d

    .line 67
    .line 68
    if-lt p2, v0, :cond_5

    .line 69
    .line 70
    new-instance p2, Lka8;

    .line 71
    .line 72
    invoke-direct {p2, p1}, Lka8;-><init>(Ldb8;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    new-instance p2, Lia8;

    .line 77
    .line 78
    invoke-direct {p2, p1}, Lia8;-><init>(Ldb8;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {p2}, Lqa8;->b()Ldb8;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_1

    .line 86
    :cond_6
    const/4 p1, 0x0

    .line 87
    :goto_1
    iput-object p1, p0, Lca8;->b:Ldb8;

    .line 88
    .line 89
    return-void
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
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static/range {p1 .. p2}, Ldb8;->g(Landroid/view/View;Landroid/view/WindowInsets;)Ldb8;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, Lca8;->b:Ldb8;

    .line 16
    .line 17
    invoke-static/range {p1 .. p2}, Lda8;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static/range {p1 .. p2}, Ldb8;->g(Landroid/view/View;Landroid/view/WindowInsets;)Ldb8;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v1, v3, Ldb8;->a:Lza8;

    .line 27
    .line 28
    iget-object v4, v0, Lca8;->b:Ldb8;

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    sget-object v4, Le58;->a:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-static {v2}, Lx48;->a(Landroid/view/View;)Ldb8;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iput-object v4, v0, Lca8;->b:Ldb8;

    .line 39
    .line 40
    :cond_1
    iget-object v4, v0, Lca8;->b:Ldb8;

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    iput-object v3, v0, Lca8;->b:Ldb8;

    .line 45
    .line 46
    invoke-static/range {p1 .. p2}, Lda8;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {v2}, Lda8;->j(Landroid/view/View;)Lus0;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    iget-object v4, v4, Lus0;->x:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ldb8;

    .line 60
    .line 61
    invoke-static {v4, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    invoke-static/range {p1 .. p2}, Lda8;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_3
    const/4 v4, 0x1

    .line 73
    new-array v5, v4, [I

    .line 74
    .line 75
    new-array v6, v4, [I

    .line 76
    .line 77
    iget-object v7, v0, Lca8;->b:Ldb8;

    .line 78
    .line 79
    move v8, v4

    .line 80
    :goto_0
    const/16 v9, 0x200

    .line 81
    .line 82
    if-gt v8, v9, :cond_a

    .line 83
    .line 84
    invoke-virtual {v1, v8}, Lza8;->h(I)Lad3;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    iget-object v11, v7, Ldb8;->a:Lza8;

    .line 89
    .line 90
    invoke-virtual {v11, v8}, Lza8;->h(I)Lad3;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    iget v12, v9, Lad3;->a:I

    .line 95
    .line 96
    iget v13, v9, Lad3;->d:I

    .line 97
    .line 98
    iget v14, v9, Lad3;->c:I

    .line 99
    .line 100
    iget v9, v9, Lad3;->b:I

    .line 101
    .line 102
    iget v15, v11, Lad3;->a:I

    .line 103
    .line 104
    iget v4, v11, Lad3;->d:I

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    iget v10, v11, Lad3;->c:I

    .line 109
    .line 110
    iget v11, v11, Lad3;->b:I

    .line 111
    .line 112
    if-gt v12, v15, :cond_5

    .line 113
    .line 114
    if-gt v9, v11, :cond_5

    .line 115
    .line 116
    if-gt v14, v10, :cond_5

    .line 117
    .line 118
    if-le v13, v4, :cond_4

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    move-object/from16 v17, v5

    .line 122
    .line 123
    move/from16 v5, v16

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    :goto_1
    move-object/from16 v17, v5

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    :goto_2
    if-lt v12, v15, :cond_7

    .line 130
    .line 131
    if-lt v9, v11, :cond_7

    .line 132
    .line 133
    if-lt v14, v10, :cond_7

    .line 134
    .line 135
    if-ge v13, v4, :cond_6

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    move/from16 v4, v16

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_7
    :goto_3
    const/4 v4, 0x1

    .line 142
    :goto_4
    if-eq v5, v4, :cond_9

    .line 143
    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    aget v4, v17, v16

    .line 147
    .line 148
    or-int/2addr v4, v8

    .line 149
    aput v4, v17, v16

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_8
    aget v4, v6, v16

    .line 153
    .line 154
    or-int/2addr v4, v8

    .line 155
    aput v4, v6, v16

    .line 156
    .line 157
    :cond_9
    :goto_5
    shl-int/lit8 v8, v8, 0x1

    .line 158
    .line 159
    move-object/from16 v5, v17

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    goto :goto_0

    .line 163
    :cond_a
    move-object/from16 v17, v5

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    aget v4, v17, v16

    .line 168
    .line 169
    aget v5, v6, v16

    .line 170
    .line 171
    or-int v6, v4, v5

    .line 172
    .line 173
    if-nez v6, :cond_b

    .line 174
    .line 175
    iput-object v3, v0, Lca8;->b:Ldb8;

    .line 176
    .line 177
    invoke-static/range {p1 .. p2}, Lda8;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    return-object v0

    .line 182
    :cond_b
    iget-object v7, v0, Lca8;->b:Ldb8;

    .line 183
    .line 184
    and-int/lit8 v8, v4, 0x8

    .line 185
    .line 186
    if-eqz v8, :cond_c

    .line 187
    .line 188
    sget-object v4, Lda8;->e:Landroid/view/animation/PathInterpolator;

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_c
    and-int/lit8 v8, v5, 0x8

    .line 192
    .line 193
    if-eqz v8, :cond_d

    .line 194
    .line 195
    sget-object v4, Lda8;->f:Lsb2;

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_d
    and-int/lit16 v4, v4, 0x207

    .line 199
    .line 200
    if-eqz v4, :cond_e

    .line 201
    .line 202
    sget-object v4, Lda8;->g:Landroid/view/animation/DecelerateInterpolator;

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_e
    and-int/lit16 v4, v5, 0x207

    .line 206
    .line 207
    if-eqz v4, :cond_f

    .line 208
    .line 209
    sget-object v4, Lda8;->h:Landroid/view/animation/AccelerateInterpolator;

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_f
    const/4 v4, 0x0

    .line 213
    :goto_6
    new-instance v5, Lha8;

    .line 214
    .line 215
    and-int/lit8 v8, v6, 0x8

    .line 216
    .line 217
    if-eqz v8, :cond_10

    .line 218
    .line 219
    const-wide/16 v8, 0xa0

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_10
    const-wide/16 v8, 0xfa

    .line 223
    .line 224
    :goto_7
    invoke-direct {v5, v6, v4, v8, v9}, Lha8;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 225
    .line 226
    .line 227
    iget-object v4, v5, Lha8;->a:Lga8;

    .line 228
    .line 229
    const/4 v8, 0x0

    .line 230
    invoke-virtual {v4, v8}, Lga8;->d(F)V

    .line 231
    .line 232
    .line 233
    const/4 v4, 0x2

    .line 234
    new-array v8, v4, [F

    .line 235
    .line 236
    fill-array-data v8, :array_0

    .line 237
    .line 238
    .line 239
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    iget-object v9, v5, Lha8;->a:Lga8;

    .line 244
    .line 245
    invoke-virtual {v9}, Lga8;->a()J

    .line 246
    .line 247
    .line 248
    move-result-wide v9

    .line 249
    invoke-virtual {v8, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-virtual {v1, v6}, Lza8;->h(I)Lad3;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-object v9, v7, Ldb8;->a:Lza8;

    .line 258
    .line 259
    invoke-virtual {v9, v6}, Lza8;->h(I)Lad3;

    .line 260
    .line 261
    .line 262
    move-result-object v9

    .line 263
    iget v10, v1, Lad3;->a:I

    .line 264
    .line 265
    iget v11, v9, Lad3;->a:I

    .line 266
    .line 267
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    iget v11, v1, Lad3;->b:I

    .line 272
    .line 273
    iget v12, v9, Lad3;->b:I

    .line 274
    .line 275
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    iget v14, v1, Lad3;->c:I

    .line 280
    .line 281
    iget v15, v9, Lad3;->c:I

    .line 282
    .line 283
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    move/from16 v17, v6

    .line 288
    .line 289
    iget v6, v1, Lad3;->d:I

    .line 290
    .line 291
    move-object/from16 v18, v7

    .line 292
    .line 293
    iget v7, v9, Lad3;->d:I

    .line 294
    .line 295
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-static {v10, v13, v4, v0}, Lad3;->b(IIII)Lad3;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget v1, v1, Lad3;->a:I

    .line 304
    .line 305
    iget v4, v9, Lad3;->a:I

    .line 306
    .line 307
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 316
    .line 317
    .line 318
    move-result v9

    .line 319
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    invoke-static {v1, v4, v9, v6}, Lad3;->b(IIII)Lad3;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    new-instance v7, Lk68;

    .line 328
    .line 329
    const/4 v4, 0x2

    .line 330
    invoke-direct {v7, v4, v0, v1}, Lk68;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    move/from16 v0, v16

    .line 334
    .line 335
    invoke-static {v2, v5, v3, v0}, Lda8;->f(Landroid/view/View;Lha8;Ldb8;Z)V

    .line 336
    .line 337
    .line 338
    new-instance v1, Lba8;

    .line 339
    .line 340
    move-object v6, v2

    .line 341
    move-object v2, v5

    .line 342
    move/from16 v5, v17

    .line 343
    .line 344
    move-object/from16 v4, v18

    .line 345
    .line 346
    invoke-direct/range {v1 .. v6}, Lba8;-><init>(Lha8;Ldb8;Ldb8;ILandroid/view/View;)V

    .line 347
    .line 348
    .line 349
    move-object v0, v3

    .line 350
    move-object v3, v2

    .line 351
    move-object v2, v6

    .line 352
    invoke-virtual {v8, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 353
    .line 354
    .line 355
    new-instance v1, Lyl7;

    .line 356
    .line 357
    invoke-direct {v1, v3, v2}, Lyl7;-><init>(Lha8;Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 361
    .line 362
    .line 363
    new-instance v1, Lyl0;

    .line 364
    .line 365
    const/4 v6, 0x1

    .line 366
    move-object v4, v7

    .line 367
    const/4 v7, 0x0

    .line 368
    move-object v5, v8

    .line 369
    invoke-direct/range {v1 .. v7}, Lyl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 370
    .line 371
    .line 372
    invoke-static {v2, v1}, Lq55;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v1, p0

    .line 376
    .line 377
    iput-object v0, v1, Lca8;->b:Ldb8;

    .line 378
    .line 379
    invoke-static/range {p1 .. p2}, Lda8;->i(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    return-object v0

    .line 384
    nop

    .line 385
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method
