.class public final Ls33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final z:Ljava/util/logging/Logger;


# instance fields
.field public final w:Led0;

.field public final x:Lr33;

.field public final y:Ly23;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Li33;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sput-object v0, Ls33;->z:Ljava/util/logging/Logger;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Lzw5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls33;->w:Led0;

    .line 8
    .line 9
    new-instance v0, Lr33;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lr33;-><init>(Led0;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ls33;->x:Lr33;

    .line 15
    .line 16
    new-instance p1, Ly23;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ly23;-><init>(Lr33;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ls33;->y:Ly23;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a(ZLp3;)Z
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Ls33;->w:Led0;

    .line 3
    .line 4
    const-wide/16 v2, 0x9

    .line 5
    .line 6
    invoke-interface {v1, v2, v3}, Led0;->p(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ls33;->w:Led0;

    .line 10
    .line 11
    invoke-static {v1}, Ldg8;->m(Led0;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x4000

    .line 16
    .line 17
    if-gt v1, v2, :cond_2f

    .line 18
    .line 19
    iget-object v3, p0, Ls33;->w:Led0;

    .line 20
    .line 21
    invoke-interface {v3}, Led0;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    and-int/lit16 v3, v3, 0xff

    .line 26
    .line 27
    iget-object v4, p0, Ls33;->w:Led0;

    .line 28
    .line 29
    invoke-interface {v4}, Led0;->readByte()B

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    and-int/lit16 v5, v4, 0xff

    .line 34
    .line 35
    iget-object v6, p0, Ls33;->w:Led0;

    .line 36
    .line 37
    invoke-interface {v6}, Led0;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const v7, 0x7fffffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v7, v6

    .line 45
    const/16 v8, 0x8

    .line 46
    .line 47
    const/4 v9, 0x1

    .line 48
    if-eq v3, v8, :cond_0

    .line 49
    .line 50
    sget-object v10, Ls33;->z:Ljava/util/logging/Logger;

    .line 51
    .line 52
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 53
    .line 54
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_0

    .line 59
    .line 60
    invoke-static {v9, v7, v1, v3, v5}, Li33;->b(ZIIII)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    const/4 v10, 0x4

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    if-ne v3, v10, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const-string p0, "Expected a SETTINGS frame but was "

    .line 74
    .line 75
    invoke-static {v3}, Li33;->a(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p0, p1}, Lrf2;->s(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return v0

    .line 83
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 84
    const/4 v11, 0x5

    .line 85
    const/4 v12, 0x2

    .line 86
    packed-switch v3, :pswitch_data_0

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Ls33;->w:Led0;

    .line 90
    .line 91
    int-to-long p1, v1

    .line 92
    invoke-interface {p0, p1, p2}, Led0;->skip(J)V

    .line 93
    .line 94
    .line 95
    return v9

    .line 96
    :pswitch_0
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: "

    .line 97
    .line 98
    if-ne v1, v10, :cond_7

    .line 99
    .line 100
    :try_start_1
    iget-object p0, p0, Ls33;->w:Led0;

    .line 101
    .line 102
    invoke-interface {p0}, Led0;->readInt()I

    .line 103
    .line 104
    .line 105
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    const-wide/32 v2, 0x7fffffff

    .line 107
    .line 108
    .line 109
    int-to-long p0, p0

    .line 110
    and-long/2addr p0, v2

    .line 111
    const-wide/16 v2, 0x0

    .line 112
    .line 113
    cmp-long v0, p0, v2

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    sget-object v2, Ls33;->z:Ljava/util/logging/Logger;

    .line 118
    .line 119
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_3

    .line 126
    .line 127
    invoke-static {v9, v7, v1, p0, p1}, Li33;->c(ZIIJ)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_3
    iget-object p2, p2, Lp3;->y:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p2, Lp33;

    .line 137
    .line 138
    if-nez v7, :cond_4

    .line 139
    .line 140
    monitor-enter p2

    .line 141
    :try_start_2
    iget-wide v0, p2, Lp33;->Q:J

    .line 142
    .line 143
    add-long/2addr v0, p0

    .line 144
    iput-wide v0, p2, Lp33;->Q:J

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    .line 148
    .line 149
    monitor-exit p2

    .line 150
    return v9

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    move-object p0, v0

    .line 153
    monitor-exit p2

    .line 154
    throw p0

    .line 155
    :cond_4
    invoke-virtual {p2, v7}, Lp33;->k(I)Lw33;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-eqz p2, :cond_29

    .line 160
    .line 161
    monitor-enter p2

    .line 162
    :try_start_3
    iget-wide v1, p2, Lw33;->A:J

    .line 163
    .line 164
    add-long/2addr v1, p0

    .line 165
    iput-wide v1, p2, Lw33;->A:J

    .line 166
    .line 167
    if-lez v0, :cond_5

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 170
    .line 171
    .line 172
    :cond_5
    monitor-exit p2

    .line 173
    return v9

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    move-object p0, v0

    .line 176
    monitor-exit p2

    .line 177
    throw p0

    .line 178
    :cond_6
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    .line 179
    .line 180
    const-string p1, "windowSizeIncrement was 0"

    .line 181
    .line 182
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :catch_0
    move-exception v0

    .line 187
    move-object p0, v0

    .line 188
    goto :goto_1

    .line 189
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 190
    .line 191
    new-instance p2, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 207
    :goto_1
    sget-object p1, Ls33;->z:Ljava/util/logging/Logger;

    .line 208
    .line 209
    invoke-static {v9, v7, v1, v8, v5}, Li33;->b(ZIIII)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p0

    .line 217
    :pswitch_1
    if-lt v1, v8, :cond_f

    .line 218
    .line 219
    if-nez v7, :cond_e

    .line 220
    .line 221
    iget-object v2, p0, Ls33;->w:Led0;

    .line 222
    .line 223
    invoke-interface {v2}, Led0;->readInt()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    iget-object v3, p0, Ls33;->w:Led0;

    .line 228
    .line 229
    invoke-interface {v3}, Led0;->readInt()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    sub-int/2addr v1, v8

    .line 234
    sget-object v4, Lk62;->x:Lhz2;

    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lk62;->values()[Lk62;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    array-length v5, v4

    .line 244
    move v6, v0

    .line 245
    :goto_2
    if-ge v6, v5, :cond_9

    .line 246
    .line 247
    aget-object v7, v4, v6

    .line 248
    .line 249
    iget v8, v7, Lk62;->w:I

    .line 250
    .line 251
    if-ne v8, v3, :cond_8

    .line 252
    .line 253
    move-object p1, v7

    .line 254
    goto :goto_3

    .line 255
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_9
    :goto_3
    if-eqz p1, :cond_d

    .line 259
    .line 260
    sget-object p1, Ldg0;->z:Ldg0;

    .line 261
    .line 262
    if-lez v1, :cond_a

    .line 263
    .line 264
    iget-object p0, p0, Ls33;->w:Led0;

    .line 265
    .line 266
    int-to-long v3, v1

    .line 267
    invoke-interface {p0, v3, v4}, Led0;->q(J)Ldg0;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Ldg0;->d()I

    .line 275
    .line 276
    .line 277
    iget-object p0, p2, Lp3;->y:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p0, Lp33;

    .line 280
    .line 281
    monitor-enter p0

    .line 282
    :try_start_5
    iget-object p1, p0, Lp33;->x:Ljava/util/LinkedHashMap;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    new-array v1, v0, [Lw33;

    .line 289
    .line 290
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iput-boolean v9, p0, Lp33;->B:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 295
    .line 296
    monitor-exit p0

    .line 297
    check-cast p1, [Lw33;

    .line 298
    .line 299
    array-length p0, p1

    .line 300
    :goto_4
    if-ge v0, p0, :cond_29

    .line 301
    .line 302
    aget-object v1, p1, v0

    .line 303
    .line 304
    iget v3, v1, Lw33;->w:I

    .line 305
    .line 306
    if-le v3, v2, :cond_c

    .line 307
    .line 308
    invoke-virtual {v1}, Lw33;->i()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_c

    .line 313
    .line 314
    sget-object v3, Lk62;->C:Lk62;

    .line 315
    .line 316
    monitor-enter v1

    .line 317
    :try_start_6
    invoke-virtual {v1}, Lw33;->g()Lk62;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    if-nez v4, :cond_b

    .line 322
    .line 323
    iput-object v3, v1, Lw33;->H:Lk62;

    .line 324
    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 326
    .line 327
    .line 328
    goto :goto_5

    .line 329
    :catchall_2
    move-exception v0

    .line 330
    move-object p0, v0

    .line 331
    goto :goto_6

    .line 332
    :cond_b
    :goto_5
    monitor-exit v1

    .line 333
    iget-object v3, p2, Lp3;->y:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v3, Lp33;

    .line 336
    .line 337
    iget v1, v1, Lw33;->w:I

    .line 338
    .line 339
    invoke-virtual {v3, v1}, Lp33;->l(I)Lw33;

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :goto_6
    monitor-exit v1

    .line 344
    throw p0

    .line 345
    :cond_c
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :catchall_3
    move-exception v0

    .line 349
    move-object p1, v0

    .line 350
    monitor-exit p0

    .line 351
    throw p1

    .line 352
    :cond_d
    const-string p0, "TYPE_GOAWAY unexpected error code: "

    .line 353
    .line 354
    invoke-static {v3, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    return v0

    .line 362
    :cond_e
    const-string p0, "TYPE_GOAWAY streamId != 0"

    .line 363
    .line 364
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    return v0

    .line 368
    :cond_f
    const-string p0, "TYPE_GOAWAY length < 8: "

    .line 369
    .line 370
    invoke-static {v1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    return v0

    .line 378
    :pswitch_2
    if-ne v1, v8, :cond_16

    .line 379
    .line 380
    if-nez v7, :cond_15

    .line 381
    .line 382
    iget-object p1, p0, Ls33;->w:Led0;

    .line 383
    .line 384
    invoke-interface {p1}, Led0;->readInt()I

    .line 385
    .line 386
    .line 387
    move-result p1

    .line 388
    iget-object p0, p0, Ls33;->w:Led0;

    .line 389
    .line 390
    invoke-interface {p0}, Led0;->readInt()I

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    and-int/lit8 v1, v4, 0x1

    .line 395
    .line 396
    if-eqz v1, :cond_10

    .line 397
    .line 398
    move v0, v9

    .line 399
    :cond_10
    iget-object v1, p2, Lp3;->y:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v1, Lp33;

    .line 402
    .line 403
    if-eqz v0, :cond_14

    .line 404
    .line 405
    monitor-enter v1

    .line 406
    const-wide/16 v2, 0x1

    .line 407
    .line 408
    if-eq p1, v9, :cond_13

    .line 409
    .line 410
    if-eq p1, v12, :cond_12

    .line 411
    .line 412
    const/4 p0, 0x3

    .line 413
    if-eq p1, p0, :cond_11

    .line 414
    .line 415
    goto :goto_8

    .line 416
    :cond_11
    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :catchall_4
    move-exception v0

    .line 421
    move-object p0, v0

    .line 422
    goto :goto_9

    .line 423
    :cond_12
    iget-wide p0, v1, Lp33;->J:J

    .line 424
    .line 425
    add-long/2addr p0, v2

    .line 426
    iput-wide p0, v1, Lp33;->J:J

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_13
    iget-wide p0, v1, Lp33;->H:J

    .line 430
    .line 431
    add-long/2addr p0, v2

    .line 432
    iput-wide p0, v1, Lp33;->H:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 433
    .line 434
    :goto_8
    monitor-exit v1

    .line 435
    return v9

    .line 436
    :goto_9
    monitor-exit v1

    .line 437
    throw p0

    .line 438
    :cond_14
    iget-object v2, v1, Lp33;->D:Lac7;

    .line 439
    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    iget-object v1, p2, Lp3;->y:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v1, Lp33;

    .line 448
    .line 449
    iget-object v1, v1, Lp33;->y:Ljava/lang/String;

    .line 450
    .line 451
    const-string v3, " ping"

    .line 452
    .line 453
    invoke-static {v0, v1, v3}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    iget-object p2, p2, Lp3;->y:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p2, Lp33;

    .line 460
    .line 461
    new-instance v6, Lo33;

    .line 462
    .line 463
    invoke-direct {v6, p2, p1, p0}, Lo33;-><init>(Lp33;II)V

    .line 464
    .line 465
    .line 466
    const/4 v7, 0x6

    .line 467
    const-wide/16 v4, 0x0

    .line 468
    .line 469
    invoke-static/range {v2 .. v7}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 470
    .line 471
    .line 472
    return v9

    .line 473
    :cond_15
    const-string p0, "TYPE_PING streamId != 0"

    .line 474
    .line 475
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    return v0

    .line 479
    :cond_16
    const-string p0, "TYPE_PING length != 8: "

    .line 480
    .line 481
    invoke-static {v1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    return v0

    .line 489
    :pswitch_3
    invoke-virtual {p0, p2, v1, v5, v7}, Ls33;->u(Lp3;III)V

    .line 490
    .line 491
    .line 492
    return v9

    .line 493
    :pswitch_4
    iget-object p0, p0, Ls33;->w:Led0;

    .line 494
    .line 495
    if-nez v7, :cond_24

    .line 496
    .line 497
    and-int/lit8 p1, v4, 0x1

    .line 498
    .line 499
    if-eqz p1, :cond_18

    .line 500
    .line 501
    if-nez v1, :cond_17

    .line 502
    .line 503
    goto/16 :goto_10

    .line 504
    .line 505
    :cond_17
    const-string p0, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 506
    .line 507
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    return v0

    .line 511
    :cond_18
    rem-int/lit8 p1, v1, 0x6

    .line 512
    .line 513
    if-nez p1, :cond_23

    .line 514
    .line 515
    new-instance p1, Lao6;

    .line 516
    .line 517
    invoke-direct {p1}, Lao6;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-static {v0, v1}, Lz65;->V(II)Lre3;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    const/4 v3, 0x6

    .line 525
    invoke-static {v1, v3}, Lz65;->Q(Lre3;I)Lpe3;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget v3, v1, Lpe3;->w:I

    .line 530
    .line 531
    iget v4, v1, Lpe3;->x:I

    .line 532
    .line 533
    iget v1, v1, Lpe3;->y:I

    .line 534
    .line 535
    if-lez v1, :cond_19

    .line 536
    .line 537
    if-le v3, v4, :cond_1a

    .line 538
    .line 539
    :cond_19
    if-gez v1, :cond_22

    .line 540
    .line 541
    if-gt v4, v3, :cond_22

    .line 542
    .line 543
    :cond_1a
    :goto_a
    invoke-interface {p0}, Led0;->readShort()S

    .line 544
    .line 545
    .line 546
    move-result v5

    .line 547
    sget-object v6, Ldg8;->a:[B

    .line 548
    .line 549
    const v6, 0xffff

    .line 550
    .line 551
    .line 552
    and-int/2addr v5, v6

    .line 553
    invoke-interface {p0}, Led0;->readInt()I

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    if-eq v5, v12, :cond_1f

    .line 558
    .line 559
    if-eq v5, v10, :cond_1d

    .line 560
    .line 561
    if-eq v5, v11, :cond_1b

    .line 562
    .line 563
    goto :goto_b

    .line 564
    :cond_1b
    if-lt v6, v2, :cond_1c

    .line 565
    .line 566
    const v7, 0xffffff

    .line 567
    .line 568
    .line 569
    if-gt v6, v7, :cond_1c

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_1c
    const-string p0, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 573
    .line 574
    invoke-static {v6, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    return v0

    .line 582
    :cond_1d
    if-ltz v6, :cond_1e

    .line 583
    .line 584
    goto :goto_b

    .line 585
    :cond_1e
    const-string p0, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 586
    .line 587
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    return v0

    .line 591
    :cond_1f
    if-eqz v6, :cond_21

    .line 592
    .line 593
    if-ne v6, v9, :cond_20

    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_20
    const-string p0, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 597
    .line 598
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    return v0

    .line 602
    :cond_21
    :goto_b
    invoke-virtual {p1, v5, v6}, Lao6;->b(II)V

    .line 603
    .line 604
    .line 605
    if-eq v3, v4, :cond_22

    .line 606
    .line 607
    add-int/2addr v3, v1

    .line 608
    goto :goto_a

    .line 609
    :cond_22
    iget-object p0, p2, Lp3;->y:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast p0, Lp33;

    .line 612
    .line 613
    iget-object v0, p0, Lp33;->D:Lac7;

    .line 614
    .line 615
    new-instance v1, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 618
    .line 619
    .line 620
    iget-object p0, p0, Lp33;->y:Ljava/lang/String;

    .line 621
    .line 622
    const-string v2, " applyAndAckSettings"

    .line 623
    .line 624
    invoke-static {v1, p0, v2}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    new-instance v4, Lf5;

    .line 629
    .line 630
    const/16 p0, 0x1b

    .line 631
    .line 632
    invoke-direct {v4, p0, p2, p1}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    const/4 v5, 0x6

    .line 636
    const-wide/16 v2, 0x0

    .line 637
    .line 638
    invoke-static/range {v0 .. v5}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 639
    .line 640
    .line 641
    return v9

    .line 642
    :cond_23
    const-string p0, "TYPE_SETTINGS length % 6 != 0: "

    .line 643
    .line 644
    invoke-static {v1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    return v0

    .line 652
    :cond_24
    const-string p0, "TYPE_SETTINGS streamId != 0"

    .line 653
    .line 654
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return v0

    .line 658
    :pswitch_5
    if-ne v1, v10, :cond_2c

    .line 659
    .line 660
    if-eqz v7, :cond_2b

    .line 661
    .line 662
    iget-object p0, p0, Ls33;->w:Led0;

    .line 663
    .line 664
    invoke-interface {p0}, Led0;->readInt()I

    .line 665
    .line 666
    .line 667
    move-result p0

    .line 668
    sget-object v1, Lk62;->x:Lhz2;

    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    invoke-static {}, Lk62;->values()[Lk62;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    array-length v2, v1

    .line 678
    move v3, v0

    .line 679
    :goto_c
    if-ge v3, v2, :cond_26

    .line 680
    .line 681
    aget-object v4, v1, v3

    .line 682
    .line 683
    iget v5, v4, Lk62;->w:I

    .line 684
    .line 685
    if-ne v5, p0, :cond_25

    .line 686
    .line 687
    move-object p1, v4

    .line 688
    goto :goto_d

    .line 689
    :cond_25
    add-int/lit8 v3, v3, 0x1

    .line 690
    .line 691
    goto :goto_c

    .line 692
    :cond_26
    :goto_d
    if-eqz p1, :cond_2a

    .line 693
    .line 694
    iget-object p0, p2, Lp3;->y:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast p0, Lp33;

    .line 697
    .line 698
    if-eqz v7, :cond_27

    .line 699
    .line 700
    and-int/lit8 p2, v6, 0x1

    .line 701
    .line 702
    if-nez p2, :cond_27

    .line 703
    .line 704
    iget-object v0, p0, Lp33;->E:Lac7;

    .line 705
    .line 706
    new-instance p2, Ljava/lang/StringBuilder;

    .line 707
    .line 708
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 709
    .line 710
    .line 711
    iget-object v1, p0, Lp33;->y:Ljava/lang/String;

    .line 712
    .line 713
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 714
    .line 715
    .line 716
    const/16 v1, 0x5b

    .line 717
    .line 718
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    const-string v1, "] onReset"

    .line 725
    .line 726
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    new-instance v4, Ll33;

    .line 734
    .line 735
    invoke-direct {v4, p0, v7, p1, v9}, Ll33;-><init>(Lp33;ILjava/lang/Object;I)V

    .line 736
    .line 737
    .line 738
    const/4 v5, 0x6

    .line 739
    const-wide/16 v2, 0x0

    .line 740
    .line 741
    invoke-static/range {v0 .. v5}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 742
    .line 743
    .line 744
    return v9

    .line 745
    :cond_27
    invoke-virtual {p0, v7}, Lp33;->l(I)Lw33;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    if-eqz p0, :cond_29

    .line 750
    .line 751
    monitor-enter p0

    .line 752
    :try_start_8
    invoke-virtual {p0}, Lw33;->g()Lk62;

    .line 753
    .line 754
    .line 755
    move-result-object p2

    .line 756
    if-nez p2, :cond_28

    .line 757
    .line 758
    iput-object p1, p0, Lw33;->H:Lk62;

    .line 759
    .line 760
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 761
    .line 762
    .line 763
    goto :goto_e

    .line 764
    :catchall_5
    move-exception v0

    .line 765
    move-object p1, v0

    .line 766
    goto :goto_f

    .line 767
    :cond_28
    :goto_e
    monitor-exit p0

    .line 768
    return v9

    .line 769
    :goto_f
    monitor-exit p0

    .line 770
    throw p1

    .line 771
    :cond_29
    :goto_10
    return v9

    .line 772
    :cond_2a
    const-string p1, "TYPE_RST_STREAM unexpected error code: "

    .line 773
    .line 774
    invoke-static {p0, p1}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object p0

    .line 778
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    return v0

    .line 782
    :cond_2b
    const-string p0, "TYPE_RST_STREAM streamId == 0"

    .line 783
    .line 784
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    return v0

    .line 788
    :cond_2c
    const-string p0, "TYPE_RST_STREAM length: "

    .line 789
    .line 790
    const-string p1, " != 4"

    .line 791
    .line 792
    invoke-static {v1, p0, p1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    return v0

    .line 800
    :pswitch_6
    if-ne v1, v11, :cond_2e

    .line 801
    .line 802
    if-eqz v7, :cond_2d

    .line 803
    .line 804
    iget-object p0, p0, Ls33;->w:Led0;

    .line 805
    .line 806
    invoke-interface {p0}, Led0;->readInt()I

    .line 807
    .line 808
    .line 809
    invoke-interface {p0}, Led0;->readByte()B

    .line 810
    .line 811
    .line 812
    return v9

    .line 813
    :cond_2d
    const-string p0, "TYPE_PRIORITY streamId == 0"

    .line 814
    .line 815
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    return v0

    .line 819
    :cond_2e
    const-string p0, "TYPE_PRIORITY length: "

    .line 820
    .line 821
    const-string p1, " != 5"

    .line 822
    .line 823
    invoke-static {v1, p0, p1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object p0

    .line 827
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    return v0

    .line 831
    :pswitch_7
    invoke-virtual {p0, p2, v1, v5, v7}, Ls33;->o(Lp3;III)V

    .line 832
    .line 833
    .line 834
    return v9

    .line 835
    :pswitch_8
    invoke-virtual {p0, p2, v1, v5, v7}, Ls33;->k(Lp3;III)V

    .line 836
    .line 837
    .line 838
    return v9

    .line 839
    :cond_2f
    const-string p0, "FRAME_SIZE_ERROR: "

    .line 840
    .line 841
    invoke-static {v1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object p0

    .line 845
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    :catch_1
    return v0

    .line 849
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->w:Led0;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

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

.method public final k(Lp3;III)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    if-eqz v3, :cond_f

    .line 10
    .line 11
    and-int/lit8 v4, v2, 0x1

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move v4, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v6

    .line 19
    const/4 v6, 0x0

    .line 20
    :goto_0
    and-int/lit8 v7, v2, 0x20

    .line 21
    .line 22
    if-nez v7, :cond_e

    .line 23
    .line 24
    and-int/lit8 v7, v2, 0x8

    .line 25
    .line 26
    if-eqz v7, :cond_1

    .line 27
    .line 28
    iget-object v7, v0, Ls33;->w:Led0;

    .line 29
    .line 30
    invoke-interface {v7}, Led0;->readByte()B

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sget-object v8, Ldg8;->a:[B

    .line 35
    .line 36
    and-int/lit16 v7, v7, 0xff

    .line 37
    .line 38
    :goto_1
    move/from16 v8, p2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v7, 0x0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-static {v8, v2, v7}, Lgr8;->R(III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v8, v0, Ls33;->w:Led0;

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v9, v1, Lp3;->y:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, Lp33;

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    and-int/lit8 v10, v3, 0x1

    .line 59
    .line 60
    if-nez v10, :cond_2

    .line 61
    .line 62
    move v10, v4

    .line 63
    goto :goto_3

    .line 64
    :cond_2
    const/4 v10, 0x0

    .line 65
    :goto_3
    if-eqz v10, :cond_3

    .line 66
    .line 67
    new-instance v4, Lsc0;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    int-to-long v10, v2

    .line 73
    invoke-interface {v8, v10, v11}, Led0;->p(J)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v8, v10, v11, v4}, Loy6;->Y(JLsc0;)J

    .line 77
    .line 78
    .line 79
    iget-object v12, v9, Lp33;->E:Lac7;

    .line 80
    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v5, v9, Lp33;->y:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v5, 0x5b

    .line 92
    .line 93
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v5, "] onData"

    .line 100
    .line 101
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    new-instance v16, Lk33;

    .line 109
    .line 110
    move v5, v2

    .line 111
    move-object v2, v9

    .line 112
    move-object/from16 v1, v16

    .line 113
    .line 114
    invoke-direct/range {v1 .. v6}, Lk33;-><init>(Lp33;ILsc0;IZ)V

    .line 115
    .line 116
    .line 117
    const/16 v17, 0x6

    .line 118
    .line 119
    const-wide/16 v14, 0x0

    .line 120
    .line 121
    invoke-static/range {v12 .. v17}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_a

    .line 125
    .line 126
    :cond_3
    invoke-virtual {v9, v3}, Lp33;->k(I)Lw33;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    if-nez v9, :cond_4

    .line 131
    .line 132
    iget-object v4, v1, Lp3;->y:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lp33;

    .line 135
    .line 136
    sget-object v5, Lk62;->z:Lk62;

    .line 137
    .line 138
    invoke-virtual {v4, v3, v5}, Lp33;->B(ILk62;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, v1, Lp3;->y:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lp33;

    .line 144
    .line 145
    int-to-long v2, v2

    .line 146
    invoke-virtual {v1, v2, v3}, Lp33;->u(J)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v8, v2, v3}, Led0;->skip(J)V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_a

    .line 153
    .line 154
    :cond_4
    sget-object v1, Lfg8;->a:Ljava/util/TimeZone;

    .line 155
    .line 156
    iget-object v1, v9, Lw33;->D:Lu33;

    .line 157
    .line 158
    int-to-long v2, v2

    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-wide v10, v2

    .line 163
    :goto_4
    const-wide/16 v12, 0x0

    .line 164
    .line 165
    cmp-long v14, v10, v12

    .line 166
    .line 167
    iget-object v15, v1, Lu33;->B:Lw33;

    .line 168
    .line 169
    if-lez v14, :cond_c

    .line 170
    .line 171
    monitor-enter v15

    .line 172
    :try_start_0
    iget-boolean v14, v1, Lu33;->x:Z

    .line 173
    .line 174
    iget-object v5, v1, Lu33;->z:Lsc0;

    .line 175
    .line 176
    move-wide/from16 p1, v12

    .line 177
    .line 178
    iget-wide v12, v5, Lsc0;->x:J

    .line 179
    .line 180
    add-long/2addr v12, v10

    .line 181
    iget-wide v4, v1, Lu33;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 182
    .line 183
    cmp-long v4, v12, v4

    .line 184
    .line 185
    if-lez v4, :cond_5

    .line 186
    .line 187
    const/4 v4, 0x1

    .line 188
    goto :goto_5

    .line 189
    :cond_5
    const/4 v4, 0x0

    .line 190
    :goto_5
    monitor-exit v15

    .line 191
    if-eqz v4, :cond_6

    .line 192
    .line 193
    invoke-interface {v8, v10, v11}, Led0;->skip(J)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v1, Lu33;->B:Lw33;

    .line 197
    .line 198
    sget-object v2, Lk62;->B:Lk62;

    .line 199
    .line 200
    invoke-virtual {v1, v2}, Lw33;->f(Lk62;)V

    .line 201
    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_6
    if-eqz v14, :cond_7

    .line 205
    .line 206
    invoke-interface {v8, v10, v11}, Led0;->skip(J)V

    .line 207
    .line 208
    .line 209
    goto :goto_9

    .line 210
    :cond_7
    iget-object v4, v1, Lu33;->y:Lsc0;

    .line 211
    .line 212
    invoke-interface {v8, v10, v11, v4}, Loy6;->Y(JLsc0;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v4

    .line 216
    const-wide/16 v12, -0x1

    .line 217
    .line 218
    cmp-long v12, v4, v12

    .line 219
    .line 220
    if-eqz v12, :cond_b

    .line 221
    .line 222
    sub-long/2addr v10, v4

    .line 223
    iget-object v4, v1, Lu33;->B:Lw33;

    .line 224
    .line 225
    monitor-enter v4

    .line 226
    :try_start_1
    iget-boolean v5, v1, Lu33;->A:Z

    .line 227
    .line 228
    if-eqz v5, :cond_8

    .line 229
    .line 230
    iget-object v5, v1, Lu33;->y:Lsc0;

    .line 231
    .line 232
    invoke-virtual {v5}, Lsc0;->a()V

    .line 233
    .line 234
    .line 235
    goto :goto_7

    .line 236
    :catchall_0
    move-exception v0

    .line 237
    goto :goto_8

    .line 238
    :cond_8
    iget-object v5, v1, Lu33;->z:Lsc0;

    .line 239
    .line 240
    iget-wide v12, v5, Lsc0;->x:J

    .line 241
    .line 242
    cmp-long v12, v12, p1

    .line 243
    .line 244
    if-nez v12, :cond_9

    .line 245
    .line 246
    const/4 v12, 0x1

    .line 247
    goto :goto_6

    .line 248
    :cond_9
    const/4 v12, 0x0

    .line 249
    :goto_6
    iget-object v13, v1, Lu33;->y:Lsc0;

    .line 250
    .line 251
    invoke-virtual {v5, v13}, Lsc0;->t(Loy6;)J

    .line 252
    .line 253
    .line 254
    if-eqz v12, :cond_a

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    .line 258
    .line 259
    :cond_a
    :goto_7
    monitor-exit v4

    .line 260
    const/4 v4, 0x1

    .line 261
    goto :goto_4

    .line 262
    :goto_8
    monitor-exit v4

    .line 263
    throw v0

    .line 264
    :cond_b
    new-instance v0, Ljava/io/EOFException;

    .line 265
    .line 266
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :catchall_1
    move-exception v0

    .line 271
    monitor-exit v15

    .line 272
    throw v0

    .line 273
    :cond_c
    sget-object v4, Lfg8;->a:Ljava/util/TimeZone;

    .line 274
    .line 275
    iget-object v4, v15, Lw33;->x:Lp33;

    .line 276
    .line 277
    invoke-virtual {v4, v2, v3}, Lp33;->u(J)V

    .line 278
    .line 279
    .line 280
    iget-object v1, v1, Lu33;->B:Lw33;

    .line 281
    .line 282
    iget-object v1, v1, Lw33;->x:Lp33;

    .line 283
    .line 284
    iget-object v1, v1, Lp33;->L:Lgi2;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    :goto_9
    if-eqz v6, :cond_d

    .line 290
    .line 291
    sget-object v1, Lbz2;->x:Lbz2;

    .line 292
    .line 293
    const/4 v4, 0x1

    .line 294
    invoke-virtual {v9, v1, v4}, Lw33;->k(Lbz2;Z)V

    .line 295
    .line 296
    .line 297
    :cond_d
    :goto_a
    iget-object v0, v0, Ls33;->w:Led0;

    .line 298
    .line 299
    int-to-long v1, v7

    .line 300
    invoke-interface {v0, v1, v2}, Led0;->skip(J)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_e
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 305
    .line 306
    invoke-static {v0}, Lrf2;->i(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_f
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 311
    .line 312
    invoke-static {v0}, Lrf2;->i(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
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
.end method

.method public final l(IIII)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Ls33;->x:Lr33;

    .line 2
    .line 3
    iput p1, v0, Lr33;->z:I

    .line 4
    .line 5
    iput p2, v0, Lr33;->A:I

    .line 6
    .line 7
    iput p3, v0, Lr33;->x:I

    .line 8
    .line 9
    iput p4, v0, Lr33;->y:I

    .line 10
    .line 11
    iget-object p0, p0, Ls33;->y:Ly23;

    .line 12
    .line 13
    iget-object p1, p0, Ly23;->d:Lzw5;

    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lzw5;->x()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_c

    .line 20
    .line 21
    invoke-virtual {p1}, Lzw5;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sget-object p3, Ldg8;->a:[B

    .line 26
    .line 27
    and-int/lit16 p3, p2, 0xff

    .line 28
    .line 29
    const/4 p4, 0x0

    .line 30
    const/16 v0, 0x80

    .line 31
    .line 32
    if-eq p3, v0, :cond_b

    .line 33
    .line 34
    and-int/lit16 v1, p2, 0x80

    .line 35
    .line 36
    if-ne v1, v0, :cond_3

    .line 37
    .line 38
    const/16 p2, 0x7f

    .line 39
    .line 40
    invoke-virtual {p0, p3, p2}, Ly23;->f(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    add-int/lit8 p3, p2, -0x1

    .line 45
    .line 46
    if-ltz p3, :cond_1

    .line 47
    .line 48
    sget-object v0, La33;->a:[Lvy2;

    .line 49
    .line 50
    array-length v1, v0

    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gt p3, v1, :cond_1

    .line 54
    .line 55
    aget-object p2, v0, p3

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Ly23;->a(Lvy2;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget-object v0, La33;->a:[Lvy2;

    .line 62
    .line 63
    array-length v0, v0

    .line 64
    sub-int/2addr p3, v0

    .line 65
    iget v0, p0, Ly23;->f:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    add-int/2addr v0, p3

    .line 70
    if-ltz v0, :cond_2

    .line 71
    .line 72
    iget-object p3, p0, Ly23;->e:[Lvy2;

    .line 73
    .line 74
    array-length v1, p3

    .line 75
    if-ge v0, v1, :cond_2

    .line 76
    .line 77
    aget-object p2, p3, v0

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p2}, Ly23;->a(Lvy2;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const-string p0, "Header index too large "

    .line 87
    .line 88
    invoke-static {p2, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object p4

    .line 96
    :cond_3
    const/16 v0, 0x40

    .line 97
    .line 98
    if-ne p3, v0, :cond_4

    .line 99
    .line 100
    sget-object p2, La33;->a:[Lvy2;

    .line 101
    .line 102
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2}, La33;->a(Ldg0;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    new-instance p4, Lvy2;

    .line 114
    .line 115
    invoke-direct {p4, p2, p3}, Lvy2;-><init>(Ldg0;Ldg0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p4}, Ly23;->d(Lvy2;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    and-int/lit8 v1, p2, 0x40

    .line 123
    .line 124
    if-ne v1, v0, :cond_5

    .line 125
    .line 126
    const/16 p2, 0x3f

    .line 127
    .line 128
    invoke-virtual {p0, p3, p2}, Ly23;->f(II)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    add-int/lit8 p2, p2, -0x1

    .line 133
    .line 134
    invoke-virtual {p0, p2}, Ly23;->c(I)Ldg0;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    new-instance p4, Lvy2;

    .line 143
    .line 144
    invoke-direct {p4, p2, p3}, Lvy2;-><init>(Ldg0;Ldg0;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p4}, Ly23;->d(Lvy2;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_5
    and-int/lit8 p2, p2, 0x20

    .line 153
    .line 154
    const/16 v0, 0x20

    .line 155
    .line 156
    if-ne p2, v0, :cond_8

    .line 157
    .line 158
    const/16 p2, 0x1f

    .line 159
    .line 160
    invoke-virtual {p0, p3, p2}, Ly23;->f(II)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    iput p2, p0, Ly23;->a:I

    .line 165
    .line 166
    if-ltz p2, :cond_7

    .line 167
    .line 168
    const/16 p3, 0x1000

    .line 169
    .line 170
    if-gt p2, p3, :cond_7

    .line 171
    .line 172
    iget p3, p0, Ly23;->h:I

    .line 173
    .line 174
    if-ge p2, p3, :cond_0

    .line 175
    .line 176
    if-nez p2, :cond_6

    .line 177
    .line 178
    iget-object p2, p0, Ly23;->e:[Lvy2;

    .line 179
    .line 180
    invoke-static {p2, p4}, Lqs;->U0([Ljava/lang/Object;Lpy2;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p0, Ly23;->e:[Lvy2;

    .line 184
    .line 185
    array-length p2, p2

    .line 186
    add-int/lit8 p2, p2, -0x1

    .line 187
    .line 188
    iput p2, p0, Ly23;->f:I

    .line 189
    .line 190
    const/4 p2, 0x0

    .line 191
    iput p2, p0, Ly23;->g:I

    .line 192
    .line 193
    iput p2, p0, Ly23;->h:I

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_6
    sub-int/2addr p3, p2

    .line 198
    invoke-virtual {p0, p3}, Ly23;->b(I)I

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 204
    .line 205
    iget p0, p0, Ly23;->a:I

    .line 206
    .line 207
    new-instance p2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string p3, "Invalid dynamic table size update "

    .line 210
    .line 211
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1

    .line 225
    :cond_8
    const/16 p2, 0x10

    .line 226
    .line 227
    if-eq p3, p2, :cond_a

    .line 228
    .line 229
    if-nez p3, :cond_9

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_9
    const/16 p2, 0xf

    .line 233
    .line 234
    invoke-virtual {p0, p3, p2}, Ly23;->f(II)I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    add-int/lit8 p2, p2, -0x1

    .line 239
    .line 240
    invoke-virtual {p0, p2}, Ly23;->c(I)Ldg0;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 245
    .line 246
    .line 247
    move-result-object p3

    .line 248
    new-instance p4, Lvy2;

    .line 249
    .line 250
    invoke-direct {p4, p2, p3}, Lvy2;-><init>(Ldg0;Ldg0;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, p4}, Ly23;->a(Lvy2;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_a
    :goto_1
    sget-object p2, La33;->a:[Lvy2;

    .line 259
    .line 260
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-static {p2}, La33;->a(Ldg0;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, Ly23;->e()Ldg0;

    .line 268
    .line 269
    .line 270
    move-result-object p3

    .line 271
    new-instance p4, Lvy2;

    .line 272
    .line 273
    invoke-direct {p4, p2, p3}, Lvy2;-><init>(Ldg0;Ldg0;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p0, p4}, Ly23;->a(Lvy2;)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_0

    .line 280
    .line 281
    :cond_b
    const-string p0, "index == 0"

    .line 282
    .line 283
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    return-object p4

    .line 287
    :cond_c
    iget-object p1, p0, Ly23;->b:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-static {p1}, Ldt0;->b1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 294
    .line 295
    .line 296
    const-wide/16 p3, 0x0

    .line 297
    .line 298
    iput-wide p3, p0, Ly23;->c:J

    .line 299
    .line 300
    return-object p2
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
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
.end method

.method public final o(Lp3;III)V
    .locals 13

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    if-eqz v1, :cond_9

    .line 6
    .line 7
    and-int/lit8 v2, v0, 0x1

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move v2, v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v4

    .line 16
    move v4, v3

    .line 17
    :goto_0
    and-int/lit8 v5, v0, 0x8

    .line 18
    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    iget-object v5, p0, Ls33;->w:Led0;

    .line 22
    .line 23
    invoke-interface {v5}, Led0;->readByte()B

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    sget-object v6, Ldg8;->a:[B

    .line 28
    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v3

    .line 33
    :goto_1
    and-int/lit8 v6, v0, 0x20

    .line 34
    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    iget-object v6, p0, Ls33;->w:Led0;

    .line 38
    .line 39
    invoke-interface {v6}, Led0;->readInt()I

    .line 40
    .line 41
    .line 42
    invoke-interface {v6}, Led0;->readByte()B

    .line 43
    .line 44
    .line 45
    sget-object v6, Ldg8;->a:[B

    .line 46
    .line 47
    add-int/lit8 v6, p2, -0x5

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v6, p2

    .line 51
    :goto_2
    invoke-static {v6, v0, v5}, Lgr8;->R(III)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {p0, v6, v5, v0, v1}, Ls33;->l(IIII)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p1, p1, Lp3;->y:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lp33;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    and-int/lit8 v0, v1, 0x1

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    move v3, v2

    .line 70
    :cond_3
    const/16 v6, 0x5b

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    iget-object v7, p1, Lp33;->E:Lac7;

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v2, p1, Lp33;->y:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v2, "] onHeaders"

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    new-instance v11, Ll33;

    .line 102
    .line 103
    invoke-direct {v11, p1, v1, p0, v4}, Ll33;-><init>(Lp33;ILjava/util/List;Z)V

    .line 104
    .line 105
    .line 106
    const/4 v12, 0x6

    .line 107
    const-wide/16 v9, 0x0

    .line 108
    .line 109
    invoke-static/range {v7 .. v12}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    monitor-enter p1

    .line 114
    :try_start_0
    invoke-virtual {p1, v1}, Lp33;->k(I)Lw33;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    iget-boolean v0, p1, Lp33;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 121
    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    monitor-exit p1

    .line 125
    return-void

    .line 126
    :cond_5
    :try_start_1
    iget v0, p1, Lp33;->z:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    if-gt v1, v0, :cond_6

    .line 129
    .line 130
    monitor-exit p1

    .line 131
    return-void

    .line 132
    :cond_6
    :try_start_2
    rem-int/lit8 v0, v1, 0x2

    .line 133
    .line 134
    iget v2, p1, Lp33;->A:I

    .line 135
    .line 136
    rem-int/lit8 v2, v2, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 137
    .line 138
    if-ne v0, v2, :cond_7

    .line 139
    .line 140
    monitor-exit p1

    .line 141
    return-void

    .line 142
    :cond_7
    :try_start_3
    invoke-static {p0}, Lfg8;->h(Ljava/util/List;)Lbz2;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    new-instance v0, Lw33;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 147
    .line 148
    const/4 v3, 0x0

    .line 149
    move-object v2, p1

    .line 150
    :try_start_4
    invoke-direct/range {v0 .. v5}, Lw33;-><init>(ILp33;ZZLbz2;)V

    .line 151
    .line 152
    .line 153
    iput v1, v2, Lp33;->z:I

    .line 154
    .line 155
    iget-object p0, v2, Lp33;->x:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    iget-object p0, v2, Lp33;->C:Lbc7;

    .line 165
    .line 166
    invoke-virtual {p0}, Lbc7;->d()Lac7;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    new-instance p0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    iget-object p1, v2, Lp33;->y:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p1, "] onStream"

    .line 187
    .line 188
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    new-instance v11, Lf5;

    .line 196
    .line 197
    const/16 p0, 0x1a

    .line 198
    .line 199
    invoke-direct {v11, p0, v2, v0}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    const/4 v12, 0x6

    .line 203
    const-wide/16 v9, 0x0

    .line 204
    .line 205
    invoke-static/range {v7 .. v12}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 206
    .line 207
    .line 208
    monitor-exit v2

    .line 209
    return-void

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    :goto_3
    move-object p0, v0

    .line 212
    goto :goto_4

    .line 213
    :catchall_1
    move-exception v0

    .line 214
    move-object v2, p1

    .line 215
    goto :goto_3

    .line 216
    :cond_8
    move-object v2, p1

    .line 217
    monitor-exit v2

    .line 218
    invoke-static {p0}, Lfg8;->h(Ljava/util/List;)Lbz2;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {v0, p0, v4}, Lw33;->k(Lbz2;Z)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :goto_4
    monitor-exit v2

    .line 227
    throw p0

    .line 228
    :cond_9
    const-string p0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 229
    .line 230
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-void
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
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
.end method

.method public final u(Lp3;III)V
    .locals 9

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ls33;->w:Led0;

    .line 9
    .line 10
    invoke-interface {v0}, Led0;->readByte()B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sget-object v2, Ldg8;->a:[B

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0xff

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    iget-object v2, p0, Ls33;->w:Led0;

    .line 21
    .line 22
    invoke-interface {v2}, Led0;->readInt()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const v3, 0x7fffffff

    .line 27
    .line 28
    .line 29
    and-int/2addr v2, v3

    .line 30
    add-int/lit8 p2, p2, -0x4

    .line 31
    .line 32
    invoke-static {p2, p3, v0}, Lgr8;->R(III)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0, p2, v0, p3, p4}, Ls33;->l(IIII)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p1, p1, Lp3;->y:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lp33;

    .line 43
    .line 44
    monitor-enter p1

    .line 45
    :try_start_0
    iget-object p2, p1, Lp33;->U:Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_1

    .line 56
    .line 57
    sget-object p0, Lk62;->z:Lk62;

    .line 58
    .line 59
    invoke-virtual {p1, v2, p0}, Lp33;->B(ILk62;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    monitor-exit p1

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    :try_start_1
    iget-object p2, p1, Lp33;->U:Ljava/util/LinkedHashSet;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit p1

    .line 77
    iget-object v3, p1, Lp33;->E:Lac7;

    .line 78
    .line 79
    new-instance p2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object p3, p1, Lp33;->y:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 p3, 0x5b

    .line 90
    .line 91
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p3, "] onRequest"

    .line 98
    .line 99
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    new-instance v7, Ll33;

    .line 107
    .line 108
    invoke-direct {v7, p1, v2, p0, v1}, Ll33;-><init>(Lp33;ILjava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    const/4 v8, 0x6

    .line 112
    const-wide/16 v5, 0x0

    .line 113
    .line 114
    invoke-static/range {v3 .. v8}, Lac7;->c(Lac7;Ljava/lang/String;JLsr2;I)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_1
    monitor-exit p1

    .line 119
    throw p0

    .line 120
    :cond_2
    const-string p0, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 121
    .line 122
    invoke-static {p0}, Lrf2;->i(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-void
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
