.class public Lm50;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final f:Lk50;

.field public static final g:[B

.field public static final h:Lm50;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:Ll50;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lk50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    sget-object v3, Ll50;->w:Ll50;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2, v3}, Lm50;-><init>(ZZILl50;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lm50;->f:Lk50;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    new-array v0, v0, [B

    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    .line 18
    sput-object v0, Lm50;->g:[B

    .line 19
    .line 20
    new-instance v0, Lm50;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v0, v4, v1, v2, v3}, Lm50;-><init>(ZZILl50;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lm50;->h:Lm50;

    .line 27
    .line 28
    new-instance v0, Lm50;

    .line 29
    .line 30
    const/16 v2, 0x4c

    .line 31
    .line 32
    invoke-direct {v0, v1, v4, v2, v3}, Lm50;-><init>(ZZILl50;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lm50;

    .line 36
    .line 37
    const/16 v2, 0x40

    .line 38
    .line 39
    invoke-direct {v0, v1, v4, v2, v3}, Lm50;-><init>(ZZILl50;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data
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

.method public constructor <init>(ZZILl50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lm50;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lm50;->b:Z

    .line 7
    .line 8
    iput p3, p0, Lm50;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lm50;->d:Ll50;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "Failed requirement."

    .line 18
    .line 19
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    div-int/lit8 p3, p3, 0x4

    .line 25
    .line 26
    iput p3, p0, Lm50;->e:I

    .line 27
    .line 28
    return-void
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

.method public static a(Lm50;[B)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v3, v0, Lm50;->d:Ll50;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v4, v1

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static {v5, v2, v4}, Lie1;->x(III)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Lm50;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    new-array v6, v4, [B

    .line 24
    .line 25
    array-length v7, v1

    .line 26
    invoke-static {v5, v2, v7}, Lie1;->x(III)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lm50;->b(I)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    const/4 v8, 0x0

    .line 34
    if-ltz v4, :cond_d

    .line 35
    .line 36
    if-ltz v7, :cond_c

    .line 37
    .line 38
    if-gt v7, v4, :cond_c

    .line 39
    .line 40
    iget-boolean v4, v0, Lm50;->a:Z

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    sget-object v4, Ln50;->c:[B

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    sget-object v4, Ln50;->a:[B

    .line 48
    .line 49
    :goto_0
    iget-boolean v7, v0, Lm50;->b:Z

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    iget v0, v0, Lm50;->e:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const v0, 0x7fffffff

    .line 57
    .line 58
    .line 59
    :goto_1
    move v7, v5

    .line 60
    move v9, v7

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v10, v7, 0x2

    .line 62
    .line 63
    const/4 v11, 0x1

    .line 64
    if-ge v10, v2, :cond_4

    .line 65
    .line 66
    sub-int v10, v2, v7

    .line 67
    .line 68
    div-int/lit8 v10, v10, 0x3

    .line 69
    .line 70
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    move v12, v5

    .line 75
    :goto_3
    if-ge v12, v10, :cond_3

    .line 76
    .line 77
    add-int/lit8 v13, v7, 0x1

    .line 78
    .line 79
    aget-byte v14, v1, v7

    .line 80
    .line 81
    and-int/lit16 v14, v14, 0xff

    .line 82
    .line 83
    add-int/lit8 v15, v7, 0x2

    .line 84
    .line 85
    aget-byte v13, v1, v13

    .line 86
    .line 87
    and-int/lit16 v13, v13, 0xff

    .line 88
    .line 89
    add-int/lit8 v7, v7, 0x3

    .line 90
    .line 91
    aget-byte v15, v1, v15

    .line 92
    .line 93
    and-int/lit16 v15, v15, 0xff

    .line 94
    .line 95
    shl-int/lit8 v14, v14, 0x10

    .line 96
    .line 97
    shl-int/lit8 v13, v13, 0x8

    .line 98
    .line 99
    or-int/2addr v13, v14

    .line 100
    or-int/2addr v13, v15

    .line 101
    add-int/lit8 v14, v9, 0x1

    .line 102
    .line 103
    ushr-int/lit8 v15, v13, 0x12

    .line 104
    .line 105
    aget-byte v15, v4, v15

    .line 106
    .line 107
    aput-byte v15, v6, v9

    .line 108
    .line 109
    add-int/lit8 v15, v9, 0x2

    .line 110
    .line 111
    ushr-int/lit8 v16, v13, 0xc

    .line 112
    .line 113
    and-int/lit8 v16, v16, 0x3f

    .line 114
    .line 115
    aget-byte v16, v4, v16

    .line 116
    .line 117
    aput-byte v16, v6, v14

    .line 118
    .line 119
    add-int/lit8 v14, v9, 0x3

    .line 120
    .line 121
    ushr-int/lit8 v16, v13, 0x6

    .line 122
    .line 123
    and-int/lit8 v16, v16, 0x3f

    .line 124
    .line 125
    aget-byte v16, v4, v16

    .line 126
    .line 127
    aput-byte v16, v6, v15

    .line 128
    .line 129
    add-int/lit8 v9, v9, 0x4

    .line 130
    .line 131
    and-int/lit8 v13, v13, 0x3f

    .line 132
    .line 133
    aget-byte v13, v4, v13

    .line 134
    .line 135
    aput-byte v13, v6, v14

    .line 136
    .line 137
    add-int/lit8 v12, v12, 0x1

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    if-ne v10, v0, :cond_2

    .line 141
    .line 142
    if-eq v7, v2, :cond_2

    .line 143
    .line 144
    add-int/lit8 v10, v9, 0x1

    .line 145
    .line 146
    sget-object v12, Lm50;->g:[B

    .line 147
    .line 148
    aget-byte v13, v12, v5

    .line 149
    .line 150
    aput-byte v13, v6, v9

    .line 151
    .line 152
    add-int/lit8 v9, v9, 0x2

    .line 153
    .line 154
    aget-byte v11, v12, v11

    .line 155
    .line 156
    aput-byte v11, v6, v10

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    sub-int v0, v2, v7

    .line 160
    .line 161
    sget-object v5, Ll50;->y:Ll50;

    .line 162
    .line 163
    sget-object v12, Ll50;->w:Ll50;

    .line 164
    .line 165
    const/16 v13, 0x3d

    .line 166
    .line 167
    if-eq v0, v11, :cond_8

    .line 168
    .line 169
    const/4 v11, 0x2

    .line 170
    if-eq v0, v11, :cond_5

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_5
    add-int/lit8 v0, v7, 0x1

    .line 174
    .line 175
    aget-byte v7, v1, v7

    .line 176
    .line 177
    and-int/lit16 v7, v7, 0xff

    .line 178
    .line 179
    aget-byte v0, v1, v0

    .line 180
    .line 181
    and-int/lit16 v0, v0, 0xff

    .line 182
    .line 183
    shl-int/lit8 v1, v7, 0xa

    .line 184
    .line 185
    shl-int/2addr v0, v11

    .line 186
    or-int/2addr v0, v1

    .line 187
    add-int/lit8 v1, v9, 0x1

    .line 188
    .line 189
    ushr-int/lit8 v7, v0, 0xc

    .line 190
    .line 191
    aget-byte v7, v4, v7

    .line 192
    .line 193
    aput-byte v7, v6, v9

    .line 194
    .line 195
    add-int/lit8 v7, v9, 0x2

    .line 196
    .line 197
    ushr-int/lit8 v11, v0, 0x6

    .line 198
    .line 199
    and-int/lit8 v11, v11, 0x3f

    .line 200
    .line 201
    aget-byte v11, v4, v11

    .line 202
    .line 203
    aput-byte v11, v6, v1

    .line 204
    .line 205
    add-int/lit8 v9, v9, 0x3

    .line 206
    .line 207
    and-int/lit8 v0, v0, 0x3f

    .line 208
    .line 209
    aget-byte v0, v4, v0

    .line 210
    .line 211
    aput-byte v0, v6, v7

    .line 212
    .line 213
    if-eq v3, v12, :cond_7

    .line 214
    .line 215
    if-ne v3, v5, :cond_6

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_6
    :goto_4
    move v7, v10

    .line 219
    goto :goto_8

    .line 220
    :cond_7
    :goto_5
    aput-byte v13, v6, v9

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    add-int/lit8 v0, v7, 0x1

    .line 224
    .line 225
    aget-byte v1, v1, v7

    .line 226
    .line 227
    and-int/lit16 v1, v1, 0xff

    .line 228
    .line 229
    shl-int/lit8 v1, v1, 0x4

    .line 230
    .line 231
    add-int/lit8 v7, v9, 0x1

    .line 232
    .line 233
    ushr-int/lit8 v10, v1, 0x6

    .line 234
    .line 235
    aget-byte v10, v4, v10

    .line 236
    .line 237
    aput-byte v10, v6, v9

    .line 238
    .line 239
    add-int/lit8 v10, v9, 0x2

    .line 240
    .line 241
    and-int/lit8 v1, v1, 0x3f

    .line 242
    .line 243
    aget-byte v1, v4, v1

    .line 244
    .line 245
    aput-byte v1, v6, v7

    .line 246
    .line 247
    if-eq v3, v12, :cond_a

    .line 248
    .line 249
    if-ne v3, v5, :cond_9

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_9
    :goto_6
    move v7, v0

    .line 253
    goto :goto_8

    .line 254
    :cond_a
    :goto_7
    add-int/lit8 v9, v9, 0x3

    .line 255
    .line 256
    aput-byte v13, v6, v10

    .line 257
    .line 258
    aput-byte v13, v6, v9

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :goto_8
    if-ne v7, v2, :cond_b

    .line 262
    .line 263
    new-instance v0, Ljava/lang/String;

    .line 264
    .line 265
    sget-object v1, Lmo0;->e:Ljava/nio/charset/Charset;

    .line 266
    .line 267
    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :cond_b
    const-string v0, "Check failed."

    .line 272
    .line 273
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v8

    .line 277
    :cond_c
    const-string v0, "The destination array does not have enough capacity, destination offset: 0, destination size: "

    .line 278
    .line 279
    const-string v1, ", capacity needed: "

    .line 280
    .line 281
    invoke-static {v4, v7, v0, v1}, Lb81;->l(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {v0}, Lh;->l(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-object v8

    .line 289
    :cond_d
    const-string v0, "destination offset: 0, destination size: "

    .line 290
    .line 291
    invoke-static {v4, v0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Lh;->l(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v8
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


# virtual methods
.method public final b(I)I
    .locals 4

    .line 1
    div-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    rem-int/lit8 p1, p1, 0x3

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    mul-int/2addr v0, v1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    sget-object v2, Ll50;->w:Ll50;

    .line 10
    .line 11
    iget-object v3, p0, Lm50;->d:Ll50;

    .line 12
    .line 13
    if-eq v3, v2, :cond_1

    .line 14
    .line 15
    sget-object v2, Ll50;->y:Ll50;

    .line 16
    .line 17
    if-ne v3, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 21
    .line 22
    :cond_1
    :goto_0
    add-int/2addr v0, v1

    .line 23
    :cond_2
    const/4 p1, 0x0

    .line 24
    const-string v1, "Input is too big"

    .line 25
    .line 26
    if-ltz v0, :cond_5

    .line 27
    .line 28
    iget-boolean v2, p0, Lm50;->b:Z

    .line 29
    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    add-int/lit8 v2, v0, -0x1

    .line 33
    .line 34
    iget p0, p0, Lm50;->c:I

    .line 35
    .line 36
    div-int/2addr v2, p0

    .line 37
    mul-int/lit8 v2, v2, 0x2

    .line 38
    .line 39
    add-int/2addr v0, v2

    .line 40
    :cond_3
    if-ltz v0, :cond_4

    .line 41
    .line 42
    return v0

    .line 43
    :cond_4
    invoke-static {v1}, Lh;->q(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return p1

    .line 47
    :cond_5
    invoke-static {v1}, Lh;->q(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return p1
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
