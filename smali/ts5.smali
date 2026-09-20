.class public final Lts5;
.super Lzu2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final D:Lts5;

.field public static final E:Lfp3;


# instance fields
.field public A:Lss5;

.field public B:B

.field public C:I

.field public final w:Lbg0;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfp3;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfp3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lts5;->E:Lfp3;

    .line 9
    .line 10
    new-instance v0, Lts5;

    .line 11
    .line 12
    invoke-direct {v0}, Lts5;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lts5;->D:Lts5;

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput v1, v0, Lts5;->y:I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput v1, v0, Lts5;->z:I

    .line 22
    .line 23
    sget-object v1, Lss5;->y:Lss5;

    .line 24
    .line 25
    iput-object v1, v0, Lts5;->A:Lss5;

    .line 26
    .line 27
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 177
    iput-byte v0, p0, Lts5;->B:B

    .line 178
    iput v0, p0, Lts5;->C:I

    .line 179
    sget-object v0, Lbg0;->w:Lb94;

    iput-object v0, p0, Lts5;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Lrs5;)V
    .locals 1

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 181
    iput-byte v0, p0, Lts5;->B:B

    .line 182
    iput v0, p0, Lts5;->C:I

    .line 183
    iget-object p1, p1, Lru2;->w:Lbg0;

    .line 184
    iput-object p1, p0, Lts5;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Lts0;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput-byte v0, p0, Lts5;->B:B

    .line 6
    .line 7
    iput v0, p0, Lts5;->C:I

    .line 8
    .line 9
    iput v0, p0, Lts5;->y:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lts5;->z:I

    .line 13
    .line 14
    sget-object v1, Lss5;->y:Lss5;

    .line 15
    .line 16
    iput-object v1, p0, Lts5;->A:Lss5;

    .line 17
    .line 18
    new-instance v2, Lag0;

    .line 19
    .line 20
    invoke-direct {v2}, Lag0;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-static {v2, v3}, Lxs0;->G(Ljava/io/OutputStream;I)Lxs0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 29
    .line 30
    :try_start_0
    invoke-virtual {p1}, Lts0;->o()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    const/16 v6, 0x8

    .line 37
    .line 38
    if-eq v5, v6, :cond_8

    .line 39
    .line 40
    const/16 v6, 0x10

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    if-eq v5, v6, :cond_7

    .line 44
    .line 45
    const/16 v6, 0x18

    .line 46
    .line 47
    if-eq v5, v6, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, v5, v4}, Lts0;->r(ILxs0;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    :cond_1
    move v0, v3

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_4

    .line 59
    :catch_0
    move-exception p1

    .line 60
    goto :goto_2

    .line 61
    :catch_1
    move-exception p1

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-virtual {p1}, Lts0;->l()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_5

    .line 68
    .line 69
    if-eq v6, v3, :cond_4

    .line 70
    .line 71
    if-eq v6, v7, :cond_3

    .line 72
    .line 73
    const/4 v7, 0x0

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    sget-object v7, Lss5;->z:Lss5;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move-object v7, v1

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    sget-object v7, Lss5;->x:Lss5;

    .line 81
    .line 82
    :goto_1
    if-nez v7, :cond_6

    .line 83
    .line 84
    invoke-virtual {v4, v5}, Lxs0;->f0(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v6}, Lxs0;->f0(I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    iget v5, p0, Lts5;->x:I

    .line 92
    .line 93
    or-int/lit8 v5, v5, 0x4

    .line 94
    .line 95
    iput v5, p0, Lts5;->x:I

    .line 96
    .line 97
    iput-object v7, p0, Lts5;->A:Lss5;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    iget v5, p0, Lts5;->x:I

    .line 101
    .line 102
    or-int/2addr v5, v7

    .line 103
    iput v5, p0, Lts5;->x:I

    .line 104
    .line 105
    invoke-virtual {p1}, Lts0;->l()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    iput v5, p0, Lts5;->z:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    iget v5, p0, Lts5;->x:I

    .line 113
    .line 114
    or-int/2addr v5, v3

    .line 115
    iput v5, p0, Lts5;->x:I

    .line 116
    .line 117
    invoke-virtual {p1}, Lts0;->l()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    iput v5, p0, Lts5;->y:I
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :goto_2
    :try_start_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iput-object p0, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 134
    .line 135
    throw v0

    .line 136
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 137
    .line 138
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :goto_4
    :try_start_2
    invoke-virtual {v4}, Lxs0;->R()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    .line 142
    :catch_2
    invoke-virtual {v2}, Lag0;->l()Lbg0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, Lts5;->w:Lbg0;

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :catchall_1
    move-exception p1

    .line 150
    invoke-virtual {v2}, Lag0;->l()Lbg0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iput-object v0, p0, Lts5;->w:Lbg0;

    .line 155
    .line 156
    throw p1

    .line 157
    :goto_5
    throw p1

    .line 158
    :cond_9
    :try_start_3
    invoke-virtual {v4}, Lxs0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 159
    .line 160
    .line 161
    :catch_3
    invoke-virtual {v2}, Lag0;->l()Lbg0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iput-object p1, p0, Lts5;->w:Lbg0;

    .line 166
    .line 167
    return-void

    .line 168
    :catchall_2
    move-exception p1

    .line 169
    invoke-virtual {v2}, Lag0;->l()Lbg0;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iput-object v0, p0, Lts5;->w:Lbg0;

    .line 174
    .line 175
    throw p1
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
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


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-byte v0, p0, Lts5;->B:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Lts5;->x:I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    and-int/2addr v0, v3

    .line 15
    if-ne v0, v3, :cond_2

    .line 16
    .line 17
    iput-byte v1, p0, Lts5;->B:B

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iput-byte v2, p0, Lts5;->B:B

    .line 21
    .line 22
    return v2
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

.method public final c()I
    .locals 3

    .line 1
    iget v0, p0, Lts5;->C:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lts5;->x:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lts5;->y:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lxs0;->l(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lts5;->x:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lts5;->z:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lxs0;->l(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lts5;->x:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Lts5;->A:Lss5;

    .line 41
    .line 42
    iget v1, v1, Lss5;->w:I

    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-static {v2, v1}, Lxs0;->k(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    add-int/2addr v0, v1

    .line 50
    :cond_3
    iget-object v1, p0, Lts5;->w:Lbg0;

    .line 51
    .line 52
    invoke-virtual {v1}, Lbg0;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    iput v1, p0, Lts5;->C:I

    .line 58
    .line 59
    return v1
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final d()Lru2;
    .locals 0

    .line 1
    invoke-static {}, Lrs5;->g()Lrs5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public final e()Lru2;
    .locals 1

    .line 1
    invoke-static {}, Lrs5;->g()Lrs5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lrs5;->h(Lts5;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final f(Lxs0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lts5;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lts5;->x:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lts5;->y:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lxs0;->W(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lts5;->x:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lts5;->z:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lxs0;->W(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lts5;->x:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lts5;->A:Lss5;

    .line 33
    .line 34
    iget v0, v0, Lss5;->w:I

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    invoke-virtual {p1, v1, v0}, Lxs0;->V(II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p0, p0, Lts5;->w:Lbg0;

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Lxs0;->b0(Lbg0;)V

    .line 43
    .line 44
    .line 45
    return-void
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
