.class public final Lxt1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final g:[I


# instance fields
.field public final a:Lk90;

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x83b

    .line 2
    .line 3
    const/16 v1, 0x707

    .line 4
    .line 5
    const/16 v2, 0xee0

    .line 6
    .line 7
    const/16 v3, 0x1dc

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lxt1;->g:[I

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Lk90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxt1;->a:Lk90;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static b([Lr66;II)[Lr66;
    .locals 7

    .line 1
    int-to-float p2, p2

    .line 2
    int-to-float p1, p1

    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    mul-float/2addr p1, v0

    .line 6
    div-float/2addr p2, p1

    .line 7
    const/4 p1, 0x0

    .line 8
    aget-object p1, p0, p1

    .line 9
    .line 10
    iget v1, p1, Lr66;->a:F

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    aget-object v2, p0, v2

    .line 14
    .line 15
    iget v3, v2, Lr66;->a:F

    .line 16
    .line 17
    sub-float v4, v1, v3

    .line 18
    .line 19
    iget p1, p1, Lr66;->b:F

    .line 20
    .line 21
    iget v2, v2, Lr66;->b:F

    .line 22
    .line 23
    sub-float v5, p1, v2

    .line 24
    .line 25
    add-float/2addr v1, v3

    .line 26
    div-float/2addr v1, v0

    .line 27
    add-float/2addr p1, v2

    .line 28
    div-float/2addr p1, v0

    .line 29
    new-instance v2, Lr66;

    .line 30
    .line 31
    mul-float/2addr v4, p2

    .line 32
    add-float v3, v1, v4

    .line 33
    .line 34
    mul-float/2addr v5, p2

    .line 35
    add-float v6, p1, v5

    .line 36
    .line 37
    invoke-direct {v2, v3, v6}, Lr66;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lr66;

    .line 41
    .line 42
    sub-float/2addr v1, v4

    .line 43
    sub-float/2addr p1, v5

    .line 44
    invoke-direct {v3, v1, p1}, Lr66;-><init>(FF)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    aget-object p1, p0, p1

    .line 49
    .line 50
    iget v1, p1, Lr66;->a:F

    .line 51
    .line 52
    const/4 v4, 0x3

    .line 53
    aget-object p0, p0, v4

    .line 54
    .line 55
    iget v4, p0, Lr66;->a:F

    .line 56
    .line 57
    sub-float v5, v1, v4

    .line 58
    .line 59
    iget p1, p1, Lr66;->b:F

    .line 60
    .line 61
    iget p0, p0, Lr66;->b:F

    .line 62
    .line 63
    sub-float v6, p1, p0

    .line 64
    .line 65
    add-float/2addr v1, v4

    .line 66
    div-float/2addr v1, v0

    .line 67
    add-float/2addr p1, p0

    .line 68
    div-float/2addr p1, v0

    .line 69
    new-instance p0, Lr66;

    .line 70
    .line 71
    mul-float/2addr v5, p2

    .line 72
    add-float v0, v1, v5

    .line 73
    .line 74
    mul-float/2addr p2, v6

    .line 75
    add-float v4, p1, p2

    .line 76
    .line 77
    invoke-direct {p0, v0, v4}, Lr66;-><init>(FF)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lr66;

    .line 81
    .line 82
    sub-float/2addr v1, v5

    .line 83
    sub-float/2addr p1, p2

    .line 84
    invoke-direct {v0, v1, p1}, Lr66;-><init>(FF)V

    .line 85
    .line 86
    .line 87
    filled-new-array {v2, p0, v3, v0}, [Lr66;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final a(Z)Ld30;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lxt1;->a:Lk90;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x7

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    :try_start_0
    new-instance v8, Lu88;

    .line 12
    .line 13
    invoke-direct {v8, v1}, Lu88;-><init>(Lk90;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v8}, Lu88;->b()[Lr66;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    aget-object v9, v8, v7

    .line 21
    .line 22
    aget-object v10, v8, v6

    .line 23
    .line 24
    aget-object v11, v8, v3

    .line 25
    .line 26
    aget-object v8, v8, v2
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    iget v8, v1, Lk90;->w:I

    .line 30
    .line 31
    div-int/2addr v8, v3

    .line 32
    iget v9, v1, Lk90;->x:I

    .line 33
    .line 34
    div-int/2addr v9, v3

    .line 35
    new-instance v10, Ldv5;

    .line 36
    .line 37
    add-int/lit8 v11, v8, 0x7

    .line 38
    .line 39
    add-int/lit8 v12, v9, -0x7

    .line 40
    .line 41
    invoke-direct {v10, v11, v12, v2}, Ldv5;-><init>(III)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v10, v7, v6, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v10}, Ldv5;->b()Lr66;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    new-instance v13, Ldv5;

    .line 53
    .line 54
    add-int/2addr v9, v5

    .line 55
    invoke-direct {v13, v11, v9, v2}, Ldv5;-><init>(III)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v13, v7, v6, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    invoke-virtual {v11}, Ldv5;->b()Lr66;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    new-instance v13, Ldv5;

    .line 67
    .line 68
    sub-int/2addr v8, v5

    .line 69
    invoke-direct {v13, v8, v9, v2}, Ldv5;-><init>(III)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v13, v7, v4, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, Ldv5;->b()Lr66;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    new-instance v13, Ldv5;

    .line 81
    .line 82
    invoke-direct {v13, v8, v12, v2}, Ldv5;-><init>(III)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v13, v7, v4, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, Ldv5;->b()Lr66;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    move-object/from16 v37, v11

    .line 94
    .line 95
    move-object v11, v9

    .line 96
    move-object v9, v10

    .line 97
    move-object/from16 v10, v37

    .line 98
    .line 99
    :goto_0
    iget v12, v9, Lr66;->a:F

    .line 100
    .line 101
    iget v13, v8, Lr66;->a:F

    .line 102
    .line 103
    add-float/2addr v12, v13

    .line 104
    iget v13, v10, Lr66;->a:F

    .line 105
    .line 106
    add-float/2addr v12, v13

    .line 107
    iget v13, v11, Lr66;->a:F

    .line 108
    .line 109
    add-float/2addr v12, v13

    .line 110
    const/high16 v13, 0x40800000    # 4.0f

    .line 111
    .line 112
    div-float/2addr v12, v13

    .line 113
    invoke-static {v12}, Lbb0;->w0(F)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iget v9, v9, Lr66;->b:F

    .line 118
    .line 119
    iget v8, v8, Lr66;->b:F

    .line 120
    .line 121
    add-float/2addr v9, v8

    .line 122
    iget v8, v10, Lr66;->b:F

    .line 123
    .line 124
    add-float/2addr v9, v8

    .line 125
    iget v8, v11, Lr66;->b:F

    .line 126
    .line 127
    add-float/2addr v9, v8

    .line 128
    div-float/2addr v9, v13

    .line 129
    invoke-static {v9}, Lbb0;->w0(F)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    const/16 v9, 0xf

    .line 134
    .line 135
    :try_start_1
    new-instance v10, Lu88;

    .line 136
    .line 137
    invoke-direct {v10, v1, v9, v12, v8}, Lu88;-><init>(Lk90;III)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v10}, Lu88;->b()[Lr66;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    aget-object v11, v10, v7

    .line 145
    .line 146
    aget-object v14, v10, v6

    .line 147
    .line 148
    aget-object v15, v10, v3

    .line 149
    .line 150
    aget-object v8, v10, v2
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :catch_1
    new-instance v10, Ldv5;

    .line 154
    .line 155
    add-int/lit8 v11, v12, 0x7

    .line 156
    .line 157
    add-int/lit8 v14, v8, -0x7

    .line 158
    .line 159
    invoke-direct {v10, v11, v14, v2}, Ldv5;-><init>(III)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v10, v7, v6, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v10}, Ldv5;->b()Lr66;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    new-instance v15, Ldv5;

    .line 171
    .line 172
    add-int/2addr v8, v5

    .line 173
    invoke-direct {v15, v11, v8, v2}, Ldv5;-><init>(III)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v15, v7, v6, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-virtual {v11}, Ldv5;->b()Lr66;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    new-instance v15, Ldv5;

    .line 185
    .line 186
    sub-int/2addr v12, v5

    .line 187
    invoke-direct {v15, v12, v8, v2}, Ldv5;-><init>(III)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v15, v7, v4, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {v8}, Ldv5;->b()Lr66;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    new-instance v8, Ldv5;

    .line 199
    .line 200
    invoke-direct {v8, v12, v14, v2}, Ldv5;-><init>(III)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v8, v7, v4, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {v8}, Ldv5;->b()Lr66;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    move-object v14, v11

    .line 212
    move-object v11, v10

    .line 213
    :goto_1
    iget v10, v11, Lr66;->a:F

    .line 214
    .line 215
    iget v12, v8, Lr66;->a:F

    .line 216
    .line 217
    add-float/2addr v10, v12

    .line 218
    iget v12, v14, Lr66;->a:F

    .line 219
    .line 220
    add-float/2addr v10, v12

    .line 221
    iget v12, v15, Lr66;->a:F

    .line 222
    .line 223
    add-float/2addr v10, v12

    .line 224
    div-float/2addr v10, v13

    .line 225
    invoke-static {v10}, Lbb0;->w0(F)I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    iget v11, v11, Lr66;->b:F

    .line 230
    .line 231
    iget v8, v8, Lr66;->b:F

    .line 232
    .line 233
    add-float/2addr v11, v8

    .line 234
    iget v8, v14, Lr66;->b:F

    .line 235
    .line 236
    add-float/2addr v11, v8

    .line 237
    iget v8, v15, Lr66;->b:F

    .line 238
    .line 239
    add-float/2addr v11, v8

    .line 240
    div-float/2addr v11, v13

    .line 241
    invoke-static {v11}, Lbb0;->w0(F)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    new-instance v11, Ldv5;

    .line 246
    .line 247
    invoke-direct {v11, v10, v8, v2}, Ldv5;-><init>(III)V

    .line 248
    .line 249
    .line 250
    iput v6, v0, Lxt1;->e:I

    .line 251
    .line 252
    move v13, v6

    .line 253
    move-object v8, v11

    .line 254
    move-object v10, v8

    .line 255
    move-object v12, v10

    .line 256
    :goto_2
    iget v14, v12, Ldv5;->c:I

    .line 257
    .line 258
    iget v15, v12, Ldv5;->b:I

    .line 259
    .line 260
    move/from16 v16, v7

    .line 261
    .line 262
    iget v7, v11, Ldv5;->c:I

    .line 263
    .line 264
    move/from16 v17, v9

    .line 265
    .line 266
    iget v9, v11, Ldv5;->b:I

    .line 267
    .line 268
    iget v5, v0, Lxt1;->e:I

    .line 269
    .line 270
    const/16 v2, 0x9

    .line 271
    .line 272
    if-ge v5, v2, :cond_4

    .line 273
    .line 274
    invoke-virtual {v0, v11, v13, v6, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    iget v2, v11, Ldv5;->c:I

    .line 279
    .line 280
    iget v5, v11, Ldv5;->b:I

    .line 281
    .line 282
    invoke-virtual {v0, v8, v13, v6, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    move-object/from16 v21, v11

    .line 287
    .line 288
    invoke-virtual {v0, v10, v13, v4, v6}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 289
    .line 290
    .line 291
    move-result-object v11

    .line 292
    invoke-virtual {v0, v12, v13, v4, v4}, Lxt1;->e(Ldv5;ZII)Ldv5;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    iget v4, v12, Ldv5;->c:I

    .line 297
    .line 298
    move/from16 v23, v6

    .line 299
    .line 300
    iget v6, v12, Ldv5;->b:I

    .line 301
    .line 302
    move-object/from16 v24, v12

    .line 303
    .line 304
    iget v12, v0, Lxt1;->e:I

    .line 305
    .line 306
    move/from16 v25, v13

    .line 307
    .line 308
    const/4 v13, 0x2

    .line 309
    if-le v12, v13, :cond_3

    .line 310
    .line 311
    invoke-static {v6, v4, v5, v2}, Lbb0;->g0(IIII)F

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    move/from16 v20, v13

    .line 316
    .line 317
    iget v13, v0, Lxt1;->e:I

    .line 318
    .line 319
    int-to-float v13, v13

    .line 320
    mul-float/2addr v12, v13

    .line 321
    invoke-static {v15, v14, v9, v7}, Lbb0;->g0(IIII)F

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    move/from16 v26, v2

    .line 326
    .line 327
    iget v2, v0, Lxt1;->e:I

    .line 328
    .line 329
    add-int/lit8 v2, v2, 0x2

    .line 330
    .line 331
    int-to-float v2, v2

    .line 332
    mul-float/2addr v13, v2

    .line 333
    div-float/2addr v12, v13

    .line 334
    float-to-double v12, v12

    .line 335
    const-wide/high16 v27, 0x3fe8000000000000L    # 0.75

    .line 336
    .line 337
    cmpg-double v2, v12, v27

    .line 338
    .line 339
    if-ltz v2, :cond_5

    .line 340
    .line 341
    const-wide/high16 v27, 0x3ff4000000000000L    # 1.25

    .line 342
    .line 343
    cmpl-double v2, v12, v27

    .line 344
    .line 345
    if-gtz v2, :cond_5

    .line 346
    .line 347
    new-instance v2, Ldv5;

    .line 348
    .line 349
    add-int/lit8 v5, v5, -0x3

    .line 350
    .line 351
    add-int/lit8 v12, v26, 0x3

    .line 352
    .line 353
    const/4 v13, 0x3

    .line 354
    invoke-direct {v2, v5, v12, v13}, Ldv5;-><init>(III)V

    .line 355
    .line 356
    .line 357
    new-instance v5, Ldv5;

    .line 358
    .line 359
    iget v12, v3, Ldv5;->b:I

    .line 360
    .line 361
    sub-int/2addr v12, v13

    .line 362
    move/from16 v19, v4

    .line 363
    .line 364
    iget v4, v3, Ldv5;->c:I

    .line 365
    .line 366
    sub-int/2addr v4, v13

    .line 367
    invoke-direct {v5, v12, v4, v13}, Ldv5;-><init>(III)V

    .line 368
    .line 369
    .line 370
    new-instance v4, Ldv5;

    .line 371
    .line 372
    iget v12, v11, Ldv5;->b:I

    .line 373
    .line 374
    add-int/2addr v12, v13

    .line 375
    move-object/from16 v26, v3

    .line 376
    .line 377
    iget v3, v11, Ldv5;->c:I

    .line 378
    .line 379
    sub-int/2addr v3, v13

    .line 380
    invoke-direct {v4, v12, v3, v13}, Ldv5;-><init>(III)V

    .line 381
    .line 382
    .line 383
    new-instance v3, Ldv5;

    .line 384
    .line 385
    add-int/lit8 v6, v6, 0x3

    .line 386
    .line 387
    add-int/lit8 v12, v19, 0x3

    .line 388
    .line 389
    invoke-direct {v3, v6, v12, v13}, Ldv5;-><init>(III)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v3, v2}, Lxt1;->c(Ldv5;Ldv5;)I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-nez v6, :cond_0

    .line 397
    .line 398
    goto :goto_4

    .line 399
    :cond_0
    invoke-virtual {v0, v2, v5}, Lxt1;->c(Ldv5;Ldv5;)I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-eq v2, v6, :cond_1

    .line 404
    .line 405
    goto :goto_4

    .line 406
    :cond_1
    invoke-virtual {v0, v5, v4}, Lxt1;->c(Ldv5;Ldv5;)I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-eq v2, v6, :cond_2

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_2
    invoke-virtual {v0, v4, v3}, Lxt1;->c(Ldv5;Ldv5;)I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    if-ne v2, v6, :cond_5

    .line 418
    .line 419
    goto :goto_3

    .line 420
    :cond_3
    move-object/from16 v26, v3

    .line 421
    .line 422
    :goto_3
    xor-int/lit8 v13, v25, 0x1

    .line 423
    .line 424
    iget v2, v0, Lxt1;->e:I

    .line 425
    .line 426
    add-int/lit8 v2, v2, 0x1

    .line 427
    .line 428
    iput v2, v0, Lxt1;->e:I

    .line 429
    .line 430
    move-object v10, v11

    .line 431
    move/from16 v7, v16

    .line 432
    .line 433
    move/from16 v9, v17

    .line 434
    .line 435
    move-object/from16 v11, v21

    .line 436
    .line 437
    move/from16 v6, v23

    .line 438
    .line 439
    move-object/from16 v12, v24

    .line 440
    .line 441
    move-object/from16 v8, v26

    .line 442
    .line 443
    const/4 v2, 0x3

    .line 444
    const/4 v3, 0x2

    .line 445
    const/4 v4, -0x1

    .line 446
    const/4 v5, 0x7

    .line 447
    goto/16 :goto_2

    .line 448
    .line 449
    :cond_4
    move/from16 v23, v6

    .line 450
    .line 451
    :cond_5
    :goto_4
    iget v2, v0, Lxt1;->e:I

    .line 452
    .line 453
    const/4 v3, 0x5

    .line 454
    if-eq v2, v3, :cond_7

    .line 455
    .line 456
    const/4 v4, 0x7

    .line 457
    if-ne v2, v4, :cond_6

    .line 458
    .line 459
    goto :goto_5

    .line 460
    :cond_6
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 461
    .line 462
    throw v0

    .line 463
    :cond_7
    :goto_5
    if-ne v2, v3, :cond_8

    .line 464
    .line 465
    move/from16 v3, v23

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_8
    move/from16 v3, v16

    .line 469
    .line 470
    :goto_6
    iput-boolean v3, v0, Lxt1;->b:Z

    .line 471
    .line 472
    new-instance v3, Lr66;

    .line 473
    .line 474
    int-to-float v4, v9

    .line 475
    const/high16 v5, 0x3f000000    # 0.5f

    .line 476
    .line 477
    add-float/2addr v4, v5

    .line 478
    int-to-float v6, v7

    .line 479
    sub-float/2addr v6, v5

    .line 480
    invoke-direct {v3, v4, v6}, Lr66;-><init>(FF)V

    .line 481
    .line 482
    .line 483
    new-instance v4, Lr66;

    .line 484
    .line 485
    iget v6, v8, Ldv5;->b:I

    .line 486
    .line 487
    int-to-float v6, v6

    .line 488
    add-float/2addr v6, v5

    .line 489
    iget v7, v8, Ldv5;->c:I

    .line 490
    .line 491
    int-to-float v7, v7

    .line 492
    add-float/2addr v7, v5

    .line 493
    invoke-direct {v4, v6, v7}, Lr66;-><init>(FF)V

    .line 494
    .line 495
    .line 496
    new-instance v6, Lr66;

    .line 497
    .line 498
    iget v7, v10, Ldv5;->b:I

    .line 499
    .line 500
    int-to-float v7, v7

    .line 501
    sub-float/2addr v7, v5

    .line 502
    iget v8, v10, Ldv5;->c:I

    .line 503
    .line 504
    int-to-float v8, v8

    .line 505
    add-float/2addr v8, v5

    .line 506
    invoke-direct {v6, v7, v8}, Lr66;-><init>(FF)V

    .line 507
    .line 508
    .line 509
    new-instance v7, Lr66;

    .line 510
    .line 511
    int-to-float v8, v15

    .line 512
    sub-float/2addr v8, v5

    .line 513
    int-to-float v9, v14

    .line 514
    sub-float/2addr v9, v5

    .line 515
    invoke-direct {v7, v8, v9}, Lr66;-><init>(FF)V

    .line 516
    .line 517
    .line 518
    filled-new-array {v3, v4, v6, v7}, [Lr66;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    const/16 v20, 0x2

    .line 523
    .line 524
    mul-int/lit8 v2, v2, 0x2

    .line 525
    .line 526
    add-int/lit8 v4, v2, -0x3

    .line 527
    .line 528
    invoke-static {v3, v4, v2}, Lxt1;->b([Lr66;II)[Lr66;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    if-eqz p1, :cond_9

    .line 533
    .line 534
    aget-object v3, v2, v16

    .line 535
    .line 536
    aget-object v4, v2, v20

    .line 537
    .line 538
    aput-object v4, v2, v16

    .line 539
    .line 540
    aput-object v3, v2, v20

    .line 541
    .line 542
    :cond_9
    aget-object v3, v2, v16

    .line 543
    .line 544
    invoke-virtual {v0, v3}, Lxt1;->g(Lr66;)Z

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-eqz v3, :cond_13

    .line 549
    .line 550
    aget-object v3, v2, v23

    .line 551
    .line 552
    invoke-virtual {v0, v3}, Lxt1;->g(Lr66;)Z

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    if-eqz v3, :cond_13

    .line 557
    .line 558
    aget-object v3, v2, v20

    .line 559
    .line 560
    invoke-virtual {v0, v3}, Lxt1;->g(Lr66;)Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-eqz v3, :cond_13

    .line 565
    .line 566
    const/16 v19, 0x3

    .line 567
    .line 568
    aget-object v3, v2, v19

    .line 569
    .line 570
    invoke-virtual {v0, v3}, Lxt1;->g(Lr66;)Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-eqz v3, :cond_13

    .line 575
    .line 576
    iget v3, v0, Lxt1;->e:I

    .line 577
    .line 578
    mul-int/lit8 v3, v3, 0x2

    .line 579
    .line 580
    aget-object v4, v2, v16

    .line 581
    .line 582
    aget-object v5, v2, v23

    .line 583
    .line 584
    invoke-virtual {v0, v4, v5, v3}, Lxt1;->h(Lr66;Lr66;I)I

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    aget-object v5, v2, v23

    .line 589
    .line 590
    aget-object v6, v2, v20

    .line 591
    .line 592
    invoke-virtual {v0, v5, v6, v3}, Lxt1;->h(Lr66;Lr66;I)I

    .line 593
    .line 594
    .line 595
    move-result v5

    .line 596
    aget-object v6, v2, v20

    .line 597
    .line 598
    const/16 v19, 0x3

    .line 599
    .line 600
    aget-object v7, v2, v19

    .line 601
    .line 602
    invoke-virtual {v0, v6, v7, v3}, Lxt1;->h(Lr66;Lr66;I)I

    .line 603
    .line 604
    .line 605
    move-result v6

    .line 606
    aget-object v7, v2, v19

    .line 607
    .line 608
    aget-object v8, v2, v16

    .line 609
    .line 610
    invoke-virtual {v0, v7, v8, v3}, Lxt1;->h(Lr66;Lr66;I)I

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    filled-new-array {v4, v5, v6, v7}, [I

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    move/from16 v5, v16

    .line 619
    .line 620
    move v6, v5

    .line 621
    :goto_7
    const/4 v13, 0x4

    .line 622
    if-ge v5, v13, :cond_a

    .line 623
    .line 624
    aget v7, v4, v5

    .line 625
    .line 626
    add-int/lit8 v8, v3, -0x2

    .line 627
    .line 628
    shr-int v8, v7, v8

    .line 629
    .line 630
    shl-int/lit8 v8, v8, 0x1

    .line 631
    .line 632
    and-int/lit8 v7, v7, 0x1

    .line 633
    .line 634
    add-int/2addr v8, v7

    .line 635
    shl-int/lit8 v6, v6, 0x3

    .line 636
    .line 637
    add-int/2addr v6, v8

    .line 638
    add-int/lit8 v5, v5, 0x1

    .line 639
    .line 640
    const/16 v20, 0x2

    .line 641
    .line 642
    goto :goto_7

    .line 643
    :cond_a
    and-int/lit8 v3, v6, 0x1

    .line 644
    .line 645
    shl-int/lit8 v3, v3, 0xb

    .line 646
    .line 647
    shr-int/lit8 v5, v6, 0x1

    .line 648
    .line 649
    add-int/2addr v3, v5

    .line 650
    move/from16 v5, v16

    .line 651
    .line 652
    :goto_8
    if-ge v5, v13, :cond_12

    .line 653
    .line 654
    sget-object v6, Lxt1;->g:[I

    .line 655
    .line 656
    aget v6, v6, v5

    .line 657
    .line 658
    xor-int/2addr v6, v3

    .line 659
    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    const/4 v7, 0x2

    .line 664
    if-gt v6, v7, :cond_11

    .line 665
    .line 666
    iput v5, v0, Lxt1;->f:I

    .line 667
    .line 668
    const-wide/16 v5, 0x0

    .line 669
    .line 670
    move/from16 v3, v16

    .line 671
    .line 672
    :goto_9
    const/16 v7, 0xa

    .line 673
    .line 674
    if-ge v3, v13, :cond_c

    .line 675
    .line 676
    iget v8, v0, Lxt1;->f:I

    .line 677
    .line 678
    add-int/2addr v8, v3

    .line 679
    rem-int/2addr v8, v13

    .line 680
    aget v8, v4, v8

    .line 681
    .line 682
    iget-boolean v9, v0, Lxt1;->b:Z

    .line 683
    .line 684
    if-eqz v9, :cond_b

    .line 685
    .line 686
    const/16 v18, 0x7

    .line 687
    .line 688
    shl-long v5, v5, v18

    .line 689
    .line 690
    shr-int/lit8 v7, v8, 0x1

    .line 691
    .line 692
    and-int/lit8 v7, v7, 0x7f

    .line 693
    .line 694
    :goto_a
    int-to-long v7, v7

    .line 695
    add-long/2addr v5, v7

    .line 696
    goto :goto_b

    .line 697
    :cond_b
    const/16 v18, 0x7

    .line 698
    .line 699
    shl-long/2addr v5, v7

    .line 700
    shr-int/lit8 v7, v8, 0x2

    .line 701
    .line 702
    and-int/lit16 v7, v7, 0x3e0

    .line 703
    .line 704
    shr-int/lit8 v8, v8, 0x1

    .line 705
    .line 706
    and-int/lit8 v8, v8, 0x1f

    .line 707
    .line 708
    add-int/2addr v7, v8

    .line 709
    goto :goto_a

    .line 710
    :goto_b
    add-int/lit8 v3, v3, 0x1

    .line 711
    .line 712
    goto :goto_9

    .line 713
    :cond_c
    const/16 v18, 0x7

    .line 714
    .line 715
    iget-boolean v3, v0, Lxt1;->b:Z

    .line 716
    .line 717
    if-eqz v3, :cond_d

    .line 718
    .line 719
    move/from16 v7, v18

    .line 720
    .line 721
    const/4 v3, 0x2

    .line 722
    goto :goto_c

    .line 723
    :cond_d
    move v3, v13

    .line 724
    :goto_c
    sub-int v4, v7, v3

    .line 725
    .line 726
    new-array v8, v7, [I

    .line 727
    .line 728
    add-int/lit8 v7, v7, -0x1

    .line 729
    .line 730
    :goto_d
    if-ltz v7, :cond_e

    .line 731
    .line 732
    long-to-int v9, v5

    .line 733
    and-int/lit8 v9, v9, 0xf

    .line 734
    .line 735
    aput v9, v8, v7

    .line 736
    .line 737
    shr-long/2addr v5, v13

    .line 738
    add-int/lit8 v7, v7, -0x1

    .line 739
    .line 740
    goto :goto_d

    .line 741
    :cond_e
    :try_start_2
    new-instance v5, Lbr4;

    .line 742
    .line 743
    sget-object v6, Lgv2;->k:Lgv2;

    .line 744
    .line 745
    const/16 v7, 0x8

    .line 746
    .line 747
    invoke-direct {v5, v7, v6}, Lbr4;-><init>(ILjava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v5, v8, v4}, Lbr4;->x([II)V
    :try_end_2
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_2 .. :try_end_2} :catch_2

    .line 751
    .line 752
    .line 753
    move/from16 v4, v16

    .line 754
    .line 755
    move v7, v4

    .line 756
    :goto_e
    if-ge v7, v3, :cond_f

    .line 757
    .line 758
    shl-int/lit8 v4, v4, 0x4

    .line 759
    .line 760
    aget v5, v8, v7

    .line 761
    .line 762
    add-int/2addr v4, v5

    .line 763
    add-int/lit8 v7, v7, 0x1

    .line 764
    .line 765
    goto :goto_e

    .line 766
    :cond_f
    iget-boolean v3, v0, Lxt1;->b:Z

    .line 767
    .line 768
    if-eqz v3, :cond_10

    .line 769
    .line 770
    shr-int/lit8 v3, v4, 0x6

    .line 771
    .line 772
    add-int/lit8 v3, v3, 0x1

    .line 773
    .line 774
    iput v3, v0, Lxt1;->c:I

    .line 775
    .line 776
    and-int/lit8 v3, v4, 0x3f

    .line 777
    .line 778
    add-int/lit8 v3, v3, 0x1

    .line 779
    .line 780
    iput v3, v0, Lxt1;->d:I

    .line 781
    .line 782
    goto :goto_f

    .line 783
    :cond_10
    shr-int/lit8 v3, v4, 0xb

    .line 784
    .line 785
    add-int/lit8 v3, v3, 0x1

    .line 786
    .line 787
    iput v3, v0, Lxt1;->c:I

    .line 788
    .line 789
    and-int/lit16 v3, v4, 0x7ff

    .line 790
    .line 791
    add-int/lit8 v3, v3, 0x1

    .line 792
    .line 793
    iput v3, v0, Lxt1;->d:I

    .line 794
    .line 795
    :goto_f
    iget v3, v0, Lxt1;->f:I

    .line 796
    .line 797
    rem-int/lit8 v4, v3, 0x4

    .line 798
    .line 799
    aget-object v4, v2, v4

    .line 800
    .line 801
    add-int/lit8 v5, v3, 0x1

    .line 802
    .line 803
    rem-int/2addr v5, v13

    .line 804
    aget-object v5, v2, v5

    .line 805
    .line 806
    add-int/lit8 v6, v3, 0x2

    .line 807
    .line 808
    rem-int/2addr v6, v13

    .line 809
    aget-object v6, v2, v6

    .line 810
    .line 811
    const/16 v19, 0x3

    .line 812
    .line 813
    add-int/lit8 v3, v3, 0x3

    .line 814
    .line 815
    rem-int/2addr v3, v13

    .line 816
    aget-object v3, v2, v3

    .line 817
    .line 818
    invoke-virtual {v0}, Lxt1;->d()I

    .line 819
    .line 820
    .line 821
    move-result v7

    .line 822
    int-to-float v8, v7

    .line 823
    const/high16 v9, 0x40000000    # 2.0f

    .line 824
    .line 825
    div-float/2addr v8, v9

    .line 826
    iget v9, v0, Lxt1;->e:I

    .line 827
    .line 828
    int-to-float v9, v9

    .line 829
    sub-float v21, v8, v9

    .line 830
    .line 831
    add-float v23, v8, v9

    .line 832
    .line 833
    iget v8, v4, Lr66;->a:F

    .line 834
    .line 835
    iget v4, v4, Lr66;->b:F

    .line 836
    .line 837
    iget v9, v5, Lr66;->a:F

    .line 838
    .line 839
    iget v5, v5, Lr66;->b:F

    .line 840
    .line 841
    iget v10, v6, Lr66;->a:F

    .line 842
    .line 843
    iget v6, v6, Lr66;->b:F

    .line 844
    .line 845
    iget v11, v3, Lr66;->a:F

    .line 846
    .line 847
    iget v3, v3, Lr66;->b:F

    .line 848
    .line 849
    move/from16 v22, v21

    .line 850
    .line 851
    move/from16 v24, v21

    .line 852
    .line 853
    move/from16 v25, v23

    .line 854
    .line 855
    move/from16 v26, v23

    .line 856
    .line 857
    move/from16 v27, v21

    .line 858
    .line 859
    move/from16 v28, v23

    .line 860
    .line 861
    move/from16 v36, v3

    .line 862
    .line 863
    move/from16 v30, v4

    .line 864
    .line 865
    move/from16 v32, v5

    .line 866
    .line 867
    move/from16 v34, v6

    .line 868
    .line 869
    move/from16 v29, v8

    .line 870
    .line 871
    move/from16 v31, v9

    .line 872
    .line 873
    move/from16 v33, v10

    .line 874
    .line 875
    move/from16 v35, v11

    .line 876
    .line 877
    invoke-static/range {v21 .. v36}, Llg5;->a(FFFFFFFFFFFFFFFF)Llg5;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-static {v1, v7, v7, v3}, Lgw8;->L(Lk90;IILlg5;)Lk90;

    .line 882
    .line 883
    .line 884
    move-result-object v9

    .line 885
    iget v1, v0, Lxt1;->e:I

    .line 886
    .line 887
    const/16 v20, 0x2

    .line 888
    .line 889
    mul-int/lit8 v1, v1, 0x2

    .line 890
    .line 891
    invoke-virtual {v0}, Lxt1;->d()I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    invoke-static {v2, v1, v3}, Lxt1;->b([Lr66;II)[Lr66;

    .line 896
    .line 897
    .line 898
    move-result-object v10

    .line 899
    new-instance v8, Ld30;

    .line 900
    .line 901
    iget-boolean v11, v0, Lxt1;->b:Z

    .line 902
    .line 903
    iget v12, v0, Lxt1;->d:I

    .line 904
    .line 905
    iget v13, v0, Lxt1;->c:I

    .line 906
    .line 907
    invoke-direct/range {v8 .. v13}, Ld30;-><init>(Lk90;[Lr66;ZII)V

    .line 908
    .line 909
    .line 910
    return-object v8

    .line 911
    :catch_2
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 912
    .line 913
    throw v0

    .line 914
    :cond_11
    move/from16 v20, v7

    .line 915
    .line 916
    const/16 v18, 0x7

    .line 917
    .line 918
    const/16 v19, 0x3

    .line 919
    .line 920
    add-int/lit8 v5, v5, 0x1

    .line 921
    .line 922
    goto/16 :goto_8

    .line 923
    .line 924
    :cond_12
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 925
    .line 926
    throw v0

    .line 927
    :cond_13
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 928
    .line 929
    throw v0
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
.end method

.method public final c(Ldv5;Ldv5;)I
    .locals 10

    .line 1
    iget v0, p1, Ldv5;->b:I

    .line 2
    .line 3
    iget p1, p1, Ldv5;->c:I

    .line 4
    .line 5
    iget v1, p2, Ldv5;->b:I

    .line 6
    .line 7
    iget p2, p2, Ldv5;->c:I

    .line 8
    .line 9
    invoke-static {v0, p1, v1, p2}, Lbb0;->g0(IIII)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v0

    .line 14
    int-to-float v1, v1

    .line 15
    div-float/2addr v1, v2

    .line 16
    sub-int/2addr p2, p1

    .line 17
    int-to-float p2, p2

    .line 18
    div-float/2addr p2, v2

    .line 19
    int-to-float v3, v0

    .line 20
    int-to-float v4, p1

    .line 21
    iget-object p0, p0, Lxt1;->a:Lk90;

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lk90;->b(II)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    float-to-double v5, v2

    .line 28
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    double-to-int v0, v5

    .line 33
    const/4 v5, 0x0

    .line 34
    move v6, v5

    .line 35
    move v7, v6

    .line 36
    :goto_0
    if-ge v6, v0, :cond_1

    .line 37
    .line 38
    add-float/2addr v3, v1

    .line 39
    add-float/2addr v4, p2

    .line 40
    invoke-static {v3}, Lbb0;->w0(F)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-static {v4}, Lbb0;->w0(F)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {p0, v8, v9}, Lk90;->b(II)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eq v8, p1, :cond_0

    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    int-to-float p0, v7

    .line 60
    div-float/2addr p0, v2

    .line 61
    const p2, 0x3dcccccd    # 0.1f

    .line 62
    .line 63
    .line 64
    cmpl-float v0, p0, p2

    .line 65
    .line 66
    if-lez v0, :cond_2

    .line 67
    .line 68
    const v0, 0x3f666666    # 0.9f

    .line 69
    .line 70
    .line 71
    cmpg-float v0, p0, v0

    .line 72
    .line 73
    if-gez v0, :cond_2

    .line 74
    .line 75
    return v5

    .line 76
    :cond_2
    cmpg-float p0, p0, p2

    .line 77
    .line 78
    const/4 p2, 0x1

    .line 79
    if-gtz p0, :cond_3

    .line 80
    .line 81
    move v5, p2

    .line 82
    :cond_3
    if-ne v5, p1, :cond_4

    .line 83
    .line 84
    return p2

    .line 85
    :cond_4
    const/4 p0, -0x1

    .line 86
    return p0
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
.end method

.method public final d()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxt1;->b:Z

    .line 2
    .line 3
    iget p0, p0, Lxt1;->c:I

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    mul-int/2addr p0, v1

    .line 9
    add-int/lit8 p0, p0, 0xb

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    if-gt p0, v1, :cond_1

    .line 13
    .line 14
    mul-int/2addr p0, v1

    .line 15
    add-int/lit8 p0, p0, 0xf

    .line 16
    .line 17
    return p0

    .line 18
    :cond_1
    mul-int/lit8 v0, p0, 0x4

    .line 19
    .line 20
    sub-int/2addr p0, v1

    .line 21
    div-int/lit8 p0, p0, 0x8

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x1

    .line 24
    .line 25
    mul-int/lit8 p0, p0, 0x2

    .line 26
    .line 27
    add-int/2addr p0, v0

    .line 28
    add-int/lit8 p0, p0, 0xf

    .line 29
    .line 30
    return p0
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

.method public final e(Ldv5;ZII)Ldv5;
    .locals 3

    .line 1
    iget v0, p1, Ldv5;->b:I

    .line 2
    .line 3
    add-int/2addr v0, p3

    .line 4
    iget p1, p1, Ldv5;->c:I

    .line 5
    .line 6
    :goto_0
    add-int/2addr p1, p4

    .line 7
    invoke-virtual {p0, v0, p1}, Lxt1;->f(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lxt1;->a:Lk90;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v0, p1}, Lk90;->b(II)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-ne v1, p2, :cond_0

    .line 20
    .line 21
    add-int/2addr v0, p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sub-int/2addr v0, p3

    .line 24
    sub-int/2addr p1, p4

    .line 25
    :goto_1
    invoke-virtual {p0, v0, p1}, Lxt1;->f(II)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, v0, p1}, Lk90;->b(II)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, p2, :cond_1

    .line 36
    .line 37
    add-int/2addr v0, p3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sub-int/2addr v0, p3

    .line 40
    :goto_2
    invoke-virtual {p0, v0, p1}, Lxt1;->f(II)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v0, p1}, Lk90;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-ne p3, p2, :cond_2

    .line 51
    .line 52
    add-int/2addr p1, p4

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    sub-int/2addr p1, p4

    .line 55
    new-instance p0, Ldv5;

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    invoke-direct {p0, v0, p1, p2}, Ldv5;-><init>(III)V

    .line 59
    .line 60
    .line 61
    return-object p0
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final f(II)Z
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lxt1;->a:Lk90;

    .line 4
    .line 5
    iget v0, p0, Lk90;->w:I

    .line 6
    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    if-lez p2, :cond_0

    .line 10
    .line 11
    iget p0, p0, Lk90;->x:I

    .line 12
    .line 13
    if-ge p2, p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
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

.method public final g(Lr66;)Z
    .locals 1

    .line 1
    iget v0, p1, Lr66;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Lbb0;->w0(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p1, p1, Lr66;->b:F

    .line 8
    .line 9
    invoke-static {p1}, Lbb0;->w0(F)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, v0, p1}, Lxt1;->f(II)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
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

.method public final h(Lr66;Lr66;I)I
    .locals 7

    .line 1
    iget v0, p1, Lr66;->a:F

    .line 2
    .line 3
    iget v1, p1, Lr66;->b:F

    .line 4
    .line 5
    iget v2, p2, Lr66;->a:F

    .line 6
    .line 7
    iget v3, p2, Lr66;->b:F

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lbb0;->f0(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v2, p3

    .line 14
    div-float v2, v0, v2

    .line 15
    .line 16
    iget p1, p1, Lr66;->a:F

    .line 17
    .line 18
    iget p2, p2, Lr66;->a:F

    .line 19
    .line 20
    sub-float/2addr p2, p1

    .line 21
    mul-float/2addr p2, v2

    .line 22
    div-float/2addr p2, v0

    .line 23
    sub-float/2addr v3, v1

    .line 24
    mul-float/2addr v3, v2

    .line 25
    div-float/2addr v3, v0

    .line 26
    const/4 v0, 0x0

    .line 27
    move v2, v0

    .line 28
    :goto_0
    if-ge v0, p3, :cond_1

    .line 29
    .line 30
    int-to-float v4, v0

    .line 31
    mul-float v5, v4, p2

    .line 32
    .line 33
    add-float/2addr v5, p1

    .line 34
    invoke-static {v5}, Lbb0;->w0(F)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    mul-float/2addr v4, v3

    .line 39
    add-float/2addr v4, v1

    .line 40
    invoke-static {v4}, Lbb0;->w0(F)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object v6, p0, Lxt1;->a:Lk90;

    .line 45
    .line 46
    invoke-virtual {v6, v5, v4}, Lk90;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    sub-int v4, p3, v0

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    sub-int/2addr v4, v5

    .line 56
    shl-int v4, v5, v4

    .line 57
    .line 58
    or-int/2addr v2, v4

    .line 59
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return v2
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
