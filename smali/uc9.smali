.class public final Luc9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltc9;
.implements Lhd9;


# static fields
.field public static final i:Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/logging/Level;

.field public final b:J

.field public c:Lyc9;

.field public d:Lfd9;

.field public e:Lmd9;

.field public f:Lgj8;

.field public g:[Ljava/lang/Object;

.field public final synthetic h:Lji8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Luc9;->i:Ljava/lang/String;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(Lji8;Ljava/util/logging/Level;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luc9;->h:Lji8;

    .line 5
    .line 6
    sget-object p1, Ldj8;->a:Lej8;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, Luc9;->c:Lyc9;

    .line 26
    .line 27
    iput-object p1, p0, Luc9;->d:Lfd9;

    .line 28
    .line 29
    iput-object p1, p0, Luc9;->e:Lmd9;

    .line 30
    .line 31
    iput-object p1, p0, Luc9;->f:Lgj8;

    .line 32
    .line 33
    iput-object p1, p0, Luc9;->g:[Ljava/lang/Object;

    .line 34
    .line 35
    const-string p1, "level"

    .line 36
    .line 37
    invoke-static {p1, p2}, Ljb5;->K(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Luc9;->a:Ljava/util/logging/Level;

    .line 41
    .line 42
    iput-wide v0, p0, Luc9;->b:J

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final a()Lhd9;
    .locals 2

    .line 1
    new-instance v0, Led9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, v0, Led9;->b:I

    .line 8
    .line 9
    iget-object v1, p0, Luc9;->d:Lfd9;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p0, Luc9;->d:Lfd9;

    .line 14
    .line 15
    :cond_0
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Luc9;->d:Lfd9;

    .line 8
    .line 9
    sget-object v4, Lfd9;->a:Ldd9;

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    sget-object v3, Ldj8;->a:Lej8;

    .line 14
    .line 15
    check-cast v3, Lij8;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v3, Lij8;->b:Ln63;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iput-object v4, v1, Luc9;->d:Lfd9;

    .line 26
    .line 27
    :cond_0
    iget-object v3, v1, Luc9;->d:Lfd9;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    if-eq v3, v4, :cond_2

    .line 32
    .line 33
    iget-object v4, v1, Luc9;->c:Lyc9;

    .line 34
    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    iget v7, v4, Lyc9;->e:I

    .line 38
    .line 39
    if-lez v7, :cond_3

    .line 40
    .line 41
    const-string v7, "logSiteKey"

    .line 42
    .line 43
    invoke-static {v7, v3}, Ljb5;->K(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget v7, v4, Lyc9;->e:I

    .line 47
    .line 48
    move v8, v6

    .line 49
    :goto_0
    if-ge v8, v7, :cond_3

    .line 50
    .line 51
    sget-object v9, Lxc9;->f:Lwc9;

    .line 52
    .line 53
    invoke-virtual {v4, v8}, Lyc9;->y(I)Lid9;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_1

    .line 62
    .line 63
    invoke-virtual {v4, v8}, Lyc9;->z(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    new-instance v10, Lod9;

    .line 68
    .line 69
    invoke-direct {v10, v3, v9}, Lod9;-><init>(Lgd9;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v3, v10

    .line 73
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move-object v3, v5

    .line 77
    :cond_3
    invoke-virtual {v1}, Luc9;->d()Lb85;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Lb85;->w()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    move v8, v6

    .line 86
    :goto_1
    if-ge v8, v7, :cond_5

    .line 87
    .line 88
    invoke-virtual {v4, v8}, Lb85;->y(I)Lid9;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    iget-object v9, v9, Lid9;->a:Ljava/lang/String;

    .line 93
    .line 94
    const-string v10, "eye3tag"

    .line 95
    .line 96
    if-ne v9, v10, :cond_4

    .line 97
    .line 98
    sget-object v7, Lxc9;->a:Lid9;

    .line 99
    .line 100
    invoke-virtual {v4, v7}, Lb85;->A(Lid9;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    if-nez v7, :cond_5

    .line 105
    .line 106
    sget-object v7, Lxc9;->i:Lid9;

    .line 107
    .line 108
    invoke-virtual {v4, v7}, Lb85;->A(Lid9;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    sget-object v4, Lpd9;->x:Lpd9;

    .line 115
    .line 116
    invoke-virtual {v1, v7, v4}, Luc9;->e(Lid9;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    :goto_2
    iget-object v4, v1, Luc9;->c:Lyc9;

    .line 124
    .line 125
    const/4 v7, -0x1

    .line 126
    sget-object v8, Lmd9;->a:Ljd9;

    .line 127
    .line 128
    const/4 v9, 0x1

    .line 129
    if-eqz v4, :cond_21

    .line 130
    .line 131
    if-eqz v3, :cond_13

    .line 132
    .line 133
    sget v10, Lsc9;->d:I

    .line 134
    .line 135
    sget-object v10, Lxc9;->d:Lid9;

    .line 136
    .line 137
    invoke-virtual {v4, v10}, Lyc9;->A(Lid9;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-nez v4, :cond_12

    .line 142
    .line 143
    iget-object v4, v1, Luc9;->c:Lyc9;

    .line 144
    .line 145
    sget-object v10, Lqc9;->d:Lpc9;

    .line 146
    .line 147
    sget-object v10, Lxc9;->b:Lid9;

    .line 148
    .line 149
    invoke-virtual {v4, v10}, Lyc9;->A(Lid9;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    check-cast v10, Ljava/lang/Integer;

    .line 154
    .line 155
    if-nez v10, :cond_6

    .line 156
    .line 157
    move-object v4, v5

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    sget-object v11, Lqc9;->d:Lpc9;

    .line 160
    .line 161
    invoke-virtual {v11, v3, v4}, Lin8;->V0(Lgd9;Lb85;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Lqc9;

    .line 166
    .line 167
    iget-object v11, v4, Lqc9;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    int-to-long v12, v10

    .line 174
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 175
    .line 176
    .line 177
    move-result-wide v10

    .line 178
    cmp-long v10, v10, v12

    .line 179
    .line 180
    if-ltz v10, :cond_7

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_7
    move-object v4, v8

    .line 184
    :goto_3
    iget-object v10, v1, Luc9;->c:Lyc9;

    .line 185
    .line 186
    sget-object v11, Lnd9;->d:Lpc9;

    .line 187
    .line 188
    sget-object v11, Lxc9;->c:Lid9;

    .line 189
    .line 190
    invoke-virtual {v10, v11}, Lyc9;->A(Lid9;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    check-cast v11, Ljava/lang/Integer;

    .line 195
    .line 196
    if-eqz v11, :cond_b

    .line 197
    .line 198
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    if-gtz v12, :cond_8

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    sget-object v12, Lnd9;->d:Lpc9;

    .line 206
    .line 207
    invoke-virtual {v12, v3, v10}, Lin8;->V0(Lgd9;Lb85;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    check-cast v10, Lnd9;

    .line 212
    .line 213
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    sget-object v12, Lnd9;->e:Lcj;

    .line 218
    .line 219
    invoke-virtual {v12}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    check-cast v12, Ljava/util/Random;

    .line 224
    .line 225
    invoke-virtual {v12, v11}, Ljava/util/Random;->nextInt(I)I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    iget-object v12, v10, Lnd9;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 230
    .line 231
    if-nez v11, :cond_9

    .line 232
    .line 233
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    goto :goto_4

    .line 238
    :cond_9
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    :goto_4
    if-lez v11, :cond_a

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_a
    move-object v10, v8

    .line 246
    goto :goto_6

    .line 247
    :cond_b
    :goto_5
    move-object v10, v5

    .line 248
    :goto_6
    if-nez v4, :cond_d

    .line 249
    .line 250
    :cond_c
    :goto_7
    move-object v4, v10

    .line 251
    goto :goto_8

    .line 252
    :cond_d
    if-nez v10, :cond_e

    .line 253
    .line 254
    goto :goto_8

    .line 255
    :cond_e
    if-eq v4, v8, :cond_11

    .line 256
    .line 257
    sget-object v11, Lmd9;->b:Ljd9;

    .line 258
    .line 259
    if-ne v10, v11, :cond_f

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_f
    if-eq v10, v8, :cond_c

    .line 263
    .line 264
    if-ne v4, v11, :cond_10

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_10
    new-instance v11, Lkd9;

    .line 268
    .line 269
    invoke-direct {v11, v4, v10}, Lkd9;-><init>(Lmd9;Lmd9;)V

    .line 270
    .line 271
    .line 272
    move-object v4, v11

    .line 273
    :cond_11
    :goto_8
    iput-object v4, v1, Luc9;->e:Lmd9;

    .line 274
    .line 275
    if-ne v4, v8, :cond_13

    .line 276
    .line 277
    move v4, v6

    .line 278
    goto/16 :goto_11

    .line 279
    .line 280
    :cond_12
    invoke-static {}, Lku4;->a()V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :cond_13
    iget-object v4, v1, Luc9;->c:Lyc9;

    .line 285
    .line 286
    sget-object v10, Lxc9;->i:Lid9;

    .line 287
    .line 288
    invoke-virtual {v4, v10}, Lyc9;->A(Lid9;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Lpd9;

    .line 293
    .line 294
    if-eqz v4, :cond_21

    .line 295
    .line 296
    iget-object v11, v1, Luc9;->c:Lyc9;

    .line 297
    .line 298
    if-eqz v11, :cond_16

    .line 299
    .line 300
    invoke-virtual {v11, v10}, Lyc9;->C(Lid9;)I

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-ltz v12, :cond_16

    .line 305
    .line 306
    add-int/2addr v12, v12

    .line 307
    add-int/lit8 v13, v12, 0x2

    .line 308
    .line 309
    :goto_9
    iget v14, v11, Lyc9;->e:I

    .line 310
    .line 311
    add-int v15, v14, v14

    .line 312
    .line 313
    if-ge v13, v15, :cond_15

    .line 314
    .line 315
    iget-object v14, v11, Lyc9;->d:[Ljava/lang/Object;

    .line 316
    .line 317
    aget-object v14, v14, v13

    .line 318
    .line 319
    invoke-virtual {v14, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v15

    .line 323
    if-nez v15, :cond_14

    .line 324
    .line 325
    iget-object v15, v11, Lyc9;->d:[Ljava/lang/Object;

    .line 326
    .line 327
    aput-object v14, v15, v12

    .line 328
    .line 329
    add-int/lit8 v14, v12, 0x1

    .line 330
    .line 331
    add-int/lit8 v16, v13, 0x1

    .line 332
    .line 333
    aget-object v16, v15, v16

    .line 334
    .line 335
    aput-object v16, v15, v14

    .line 336
    .line 337
    add-int/lit8 v12, v12, 0x2

    .line 338
    .line 339
    :cond_14
    add-int/lit8 v13, v13, 0x2

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :cond_15
    sub-int v10, v13, v12

    .line 343
    .line 344
    shr-int/2addr v10, v9

    .line 345
    sub-int/2addr v14, v10

    .line 346
    iput v14, v11, Lyc9;->e:I

    .line 347
    .line 348
    :goto_a
    if-ge v12, v13, :cond_16

    .line 349
    .line 350
    iget-object v10, v11, Lyc9;->d:[Ljava/lang/Object;

    .line 351
    .line 352
    add-int/lit8 v14, v12, 0x1

    .line 353
    .line 354
    aput-object v5, v10, v12

    .line 355
    .line 356
    move v12, v14

    .line 357
    goto :goto_a

    .line 358
    :cond_16
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzyg;

    .line 359
    .line 360
    invoke-virtual {v1}, Luc9;->d()Lb85;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    sget-object v11, Lxc9;->a:Lid9;

    .line 365
    .line 366
    invoke-virtual {v10, v11}, Lb85;->A(Lid9;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    check-cast v10, Ljava/lang/Throwable;

    .line 371
    .line 372
    iget v12, v4, Lpd9;->w:I

    .line 373
    .line 374
    sget-object v13, Lfk8;->a:[Ljava/lang/String;

    .line 375
    .line 376
    if-gtz v12, :cond_18

    .line 377
    .line 378
    if-ne v12, v7, :cond_17

    .line 379
    .line 380
    goto :goto_b

    .line 381
    :cond_17
    const-string v0, "invalid maximum depth: 0"

    .line 382
    .line 383
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :cond_18
    :goto_b
    sget-object v13, Lfk8;->b:Lhk8;

    .line 388
    .line 389
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    if-eq v12, v7, :cond_19

    .line 393
    .line 394
    if-lez v12, :cond_1a

    .line 395
    .line 396
    :cond_19
    move v13, v9

    .line 397
    goto :goto_c

    .line 398
    :cond_1a
    move v13, v6

    .line 399
    :goto_c
    if-eqz v13, :cond_22

    .line 400
    .line 401
    new-instance v13, Ljava/lang/Throwable;

    .line 402
    .line 403
    invoke-direct {v13}, Ljava/lang/Throwable;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v13}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 407
    .line 408
    .line 409
    move-result-object v13

    .line 410
    const-class v14, Luc9;

    .line 411
    .line 412
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v14

    .line 416
    const/4 v15, 0x3

    .line 417
    move/from16 v16, v6

    .line 418
    .line 419
    :goto_d
    array-length v9, v13

    .line 420
    if-ge v15, v9, :cond_1d

    .line 421
    .line 422
    aget-object v9, v13, v15

    .line 423
    .line 424
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-eqz v9, :cond_1b

    .line 433
    .line 434
    const/16 v16, 0x1

    .line 435
    .line 436
    goto :goto_e

    .line 437
    :cond_1b
    if-eqz v16, :cond_1c

    .line 438
    .line 439
    goto :goto_f

    .line 440
    :cond_1c
    :goto_e
    add-int/lit8 v15, v15, 0x1

    .line 441
    .line 442
    goto :goto_d

    .line 443
    :cond_1d
    move v15, v7

    .line 444
    :goto_f
    if-ne v15, v7, :cond_1e

    .line 445
    .line 446
    new-array v9, v6, [Ljava/lang/StackTraceElement;

    .line 447
    .line 448
    goto :goto_10

    .line 449
    :cond_1e
    array-length v9, v13

    .line 450
    sub-int/2addr v9, v15

    .line 451
    if-lez v12, :cond_1f

    .line 452
    .line 453
    if-lt v12, v9, :cond_20

    .line 454
    .line 455
    :cond_1f
    move v12, v9

    .line 456
    :cond_20
    new-array v9, v12, [Ljava/lang/StackTraceElement;

    .line 457
    .line 458
    invoke-static {v13, v15, v9, v6, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 459
    .line 460
    .line 461
    :goto_10
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-direct {v5, v4, v10}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5, v9}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v11, v5}, Luc9;->e(Lid9;Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_21
    const/4 v4, 0x1

    .line 475
    goto :goto_11

    .line 476
    :cond_22
    const-string v0, "maxDepth must be > 0 or -1"

    .line 477
    .line 478
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :goto_11
    iget-object v5, v1, Luc9;->e:Lmd9;

    .line 483
    .line 484
    if-eqz v5, :cond_27

    .line 485
    .line 486
    iget-object v9, v1, Luc9;->c:Lyc9;

    .line 487
    .line 488
    sget-object v10, Lld9;->c:Lpc9;

    .line 489
    .line 490
    invoke-virtual {v10, v3, v9}, Lin8;->V0(Lgd9;Lb85;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    check-cast v3, Lld9;

    .line 495
    .line 496
    iget-object v9, v3, Lld9;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 497
    .line 498
    iget-object v3, v3, Lld9;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 499
    .line 500
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 501
    .line 502
    .line 503
    move-result v10

    .line 504
    if-eq v5, v8, :cond_24

    .line 505
    .line 506
    const/4 v8, 0x1

    .line 507
    invoke-virtual {v3, v6, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    if-nez v11, :cond_23

    .line 512
    .line 513
    goto :goto_12

    .line 514
    :cond_23
    :try_start_0
    invoke-virtual {v5}, Lmd9;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 518
    .line 519
    .line 520
    neg-int v3, v10

    .line 521
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 522
    .line 523
    .line 524
    add-int/2addr v7, v10

    .line 525
    goto :goto_12

    .line 526
    :catchall_0
    move-exception v0

    .line 527
    invoke-virtual {v3, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 528
    .line 529
    .line 530
    throw v0

    .line 531
    :cond_24
    :goto_12
    if-eqz v4, :cond_25

    .line 532
    .line 533
    if-lez v7, :cond_25

    .line 534
    .line 535
    iget-object v3, v1, Luc9;->c:Lyc9;

    .line 536
    .line 537
    if-eqz v3, :cond_25

    .line 538
    .line 539
    sget-object v5, Lxc9;->e:Lid9;

    .line 540
    .line 541
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 542
    .line 543
    .line 544
    move-result-object v8

    .line 545
    invoke-virtual {v3, v5, v8}, Lyc9;->B(Lid9;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :cond_25
    if-ltz v7, :cond_26

    .line 549
    .line 550
    const/4 v8, 0x1

    .line 551
    goto :goto_13

    .line 552
    :cond_26
    move v8, v6

    .line 553
    :goto_13
    and-int/2addr v4, v8

    .line 554
    :cond_27
    if-eqz v4, :cond_2f

    .line 555
    .line 556
    array-length v3, v2

    .line 557
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    iput-object v2, v1, Luc9;->g:[Ljava/lang/Object;

    .line 562
    .line 563
    :goto_14
    array-length v3, v2

    .line 564
    if-ge v6, v3, :cond_28

    .line 565
    .line 566
    aget-object v3, v2, v6

    .line 567
    .line 568
    add-int/lit8 v6, v6, 0x1

    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_28
    sget-object v2, Luc9;->i:Ljava/lang/String;

    .line 572
    .line 573
    if-eq v0, v2, :cond_29

    .line 574
    .line 575
    new-instance v2, Lgj8;

    .line 576
    .line 577
    sget-object v3, Ldk8;->b:Ldk8;

    .line 578
    .line 579
    invoke-direct {v2, v0}, Lgj8;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    iput-object v2, v1, Luc9;->f:Lgj8;

    .line 583
    .line 584
    :cond_29
    sget-object v0, Ldj8;->a:Lej8;

    .line 585
    .line 586
    check-cast v0, Lij8;

    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    sget-object v0, Lnj8;->b:Lnj8;

    .line 592
    .line 593
    invoke-virtual {v0}, Lnj8;->b()Lyj8;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    iget-object v2, v0, Lyj8;->a:Lxj8;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    if-nez v2, :cond_2c

    .line 604
    .line 605
    invoke-virtual {v1}, Luc9;->d()Lb85;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    sget-object v3, Lxc9;->h:Lwc9;

    .line 610
    .line 611
    invoke-virtual {v2, v3}, Lb85;->A(Lid9;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    check-cast v2, Lyj8;

    .line 616
    .line 617
    if-eqz v2, :cond_2b

    .line 618
    .line 619
    iget-object v4, v2, Lyj8;->a:Lxj8;

    .line 620
    .line 621
    invoke-virtual {v4}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 622
    .line 623
    .line 624
    move-result v5

    .line 625
    if-nez v5, :cond_2b

    .line 626
    .line 627
    iget-object v0, v0, Lyj8;->a:Lxj8;

    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    if-eqz v5, :cond_2a

    .line 634
    .line 635
    :goto_15
    move-object v0, v2

    .line 636
    goto :goto_16

    .line 637
    :cond_2a
    new-instance v2, Lyj8;

    .line 638
    .line 639
    new-instance v5, Lxj8;

    .line 640
    .line 641
    invoke-direct {v5, v0, v4}, Lxj8;-><init>(Lxj8;Lxj8;)V

    .line 642
    .line 643
    .line 644
    invoke-direct {v2, v5}, Lyj8;-><init>(Lxj8;)V

    .line 645
    .line 646
    .line 647
    goto :goto_15

    .line 648
    :cond_2b
    :goto_16
    invoke-virtual {v1, v3, v0}, Luc9;->e(Lid9;Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    :cond_2c
    iget-object v0, v1, Luc9;->h:Lji8;

    .line 652
    .line 653
    iget-object v0, v0, Lji8;->x:Ljava/lang/Object;

    .line 654
    .line 655
    move-object v2, v0

    .line 656
    check-cast v2, Lf76;

    .line 657
    .line 658
    :try_start_1
    sget-object v0, Lgk8;->x:Lcj;

    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    move-object v3, v0

    .line 665
    check-cast v3, Lgk8;

    .line 666
    .line 667
    iget v0, v3, Lgk8;->w:I

    .line 668
    .line 669
    const/16 v17, 0x1

    .line 670
    .line 671
    add-int/lit8 v0, v0, 0x1

    .line 672
    .line 673
    iput v0, v3, Lgk8;->w:I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 674
    .line 675
    if-eqz v0, :cond_2e

    .line 676
    .line 677
    const/16 v4, 0x64

    .line 678
    .line 679
    if-gt v0, v4, :cond_2d

    .line 680
    .line 681
    :try_start_2
    invoke-virtual {v2, v1}, Lf76;->b(Luc9;)V

    .line 682
    .line 683
    .line 684
    goto :goto_17

    .line 685
    :catchall_1
    move-exception v0

    .line 686
    move-object v4, v0

    .line 687
    goto :goto_18

    .line 688
    :cond_2d
    const-string v0, "unbounded recursion in log statement"

    .line 689
    .line 690
    invoke-static {v0, v1}, Lji8;->K(Ljava/lang/String;Luc9;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 691
    .line 692
    .line 693
    :goto_17
    :try_start_3
    invoke-virtual {v3}, Lgk8;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 694
    .line 695
    .line 696
    return-void

    .line 697
    :catch_0
    move-exception v0

    .line 698
    goto :goto_1a

    .line 699
    :goto_18
    :try_start_4
    invoke-virtual {v3}, Lgk8;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 700
    .line 701
    .line 702
    goto :goto_19

    .line 703
    :catchall_2
    move-exception v0

    .line 704
    :try_start_5
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 705
    .line 706
    .line 707
    :goto_19
    throw v4

    .line 708
    :cond_2e
    new-instance v0, Ljava/lang/AssertionError;

    .line 709
    .line 710
    const-string v3, "Overflow of RecursionDepth (possible error in core library)"

    .line 711
    .line 712
    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    throw v0
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 716
    :goto_1a
    :try_start_6
    invoke-virtual {v2, v0, v1}, Lf76;->c(Ljava/lang/RuntimeException;Luc9;)V
    :try_end_6
    .catch Lcom/google/android/gms/internal/measurement/zzzg; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    .line 717
    .line 718
    .line 719
    goto :goto_1b

    .line 720
    :catch_1
    move-exception v0

    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 734
    .line 735
    .line 736
    move-result v4

    .line 737
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    add-int/lit8 v4, v4, 0x2

    .line 742
    .line 743
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 744
    .line 745
    .line 746
    move-result v5

    .line 747
    new-instance v6, Ljava/lang/StringBuilder;

    .line 748
    .line 749
    add-int/2addr v4, v5

    .line 750
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    const-string v2, ": "

    .line 757
    .line 758
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    invoke-static {v2, v1}, Lji8;->K(Ljava/lang/String;Luc9;)V

    .line 769
    .line 770
    .line 771
    :try_start_7
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 772
    .line 773
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_3

    .line 774
    .line 775
    .line 776
    goto :goto_1b

    .line 777
    :catch_2
    move-exception v0

    .line 778
    throw v0

    .line 779
    :catch_3
    :cond_2f
    :goto_1b
    return-void
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

.method public final c(Ljava/lang/Throwable;)Lhd9;
    .locals 2

    .line 1
    sget-object v0, Lxc9;->a:Lid9;

    .line 2
    .line 3
    const-string v1, "metadata key"

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljb5;->K(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Luc9;->e(Lid9;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object p0
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

.method public final d()Lb85;
    .locals 0

    .line 1
    iget-object p0, p0, Luc9;->c:Lyc9;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lwd9;->d:Lwd9;

    .line 7
    .line 8
    return-object p0
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

.method public final e(Lid9;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Luc9;->c:Lyc9;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyc9;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v1, v0, Lyc9;->d:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, Lyc9;->e:I

    .line 18
    .line 19
    iput-object v0, p0, Luc9;->c:Lyc9;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Luc9;->c:Lyc9;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lyc9;->B(Lid9;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
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
