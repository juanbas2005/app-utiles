.class public Ll43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lo81;


# static fields
.field public static final A:Lau;

.field public static final synthetic z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic received:I

.field public final w:Lj43;

.field public x:Lx53;

.field public y:Lyl1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lb26;->a:Lc26;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :try_start_0
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    new-instance v2, Lfp7;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lau;

    .line 21
    .line 22
    const-string v1, "CustomResponse"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ll43;->A:Lau;

    .line 28
    .line 29
    const-class v0, Ll43;

    .line 30
    .line 31
    const-string v1, "received"

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Ll43;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 38
    .line 39
    return-void
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

.method public constructor <init>(Lj43;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll43;->w:Lj43;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Ll43;->received:I

    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final a(Lfp7;Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lk43;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lk43;

    .line 7
    .line 8
    iget v1, v0, Lk43;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lk43;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk43;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lk43;-><init>(Ll43;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lk43;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lk43;->C:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    sget-object v5, Lp81;->w:Lp81;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v4, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, Lk43;->z:Lfp7;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_2
    iget-object p1, v0, Lk43;->z:Lfp7;

    .line 57
    .line 58
    :try_start_1
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :try_start_2
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-object v1, p1, Lfp7;->a:Lgq3;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_4
    invoke-virtual {p0}, Ll43;->b()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-nez p2, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    sget-object v1, Lhx1;->a:Lau;

    .line 100
    .line 101
    invoke-virtual {p2}, Lyl1;->V()Ll43;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Ll43;->getAttributes()Liz0;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    sget-object v1, Lhx1;->b:Lau;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Liz0;->c()Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-nez p2, :cond_6

    .line 126
    .line 127
    sget-object p2, Ll43;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 128
    .line 129
    const/4 v1, 0x0

    .line 130
    invoke-virtual {p2, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    new-instance p1, Lio/ktor/client/call/DoubleReceiveException;

    .line 138
    .line 139
    invoke-direct {p1, p0}, Lio/ktor/client/call/DoubleReceiveException;-><init>(Ll43;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_6
    :goto_1
    invoke-virtual {p0}, Ll43;->getAttributes()Liz0;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    sget-object v1, Ll43;->A:Lau;

    .line 148
    .line 149
    invoke-virtual {p2, v1}, Liz0;->d(Lau;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    if-nez p2, :cond_7

    .line 154
    .line 155
    iput-object p1, v0, Lk43;->z:Lfp7;

    .line 156
    .line 157
    iput v4, v0, Lk43;->C:I

    .line 158
    .line 159
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p2}, Lyl1;->b()Lhf0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-ne p2, v5, :cond_7

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    :goto_2
    new-instance v1, Lh63;

    .line 171
    .line 172
    invoke-direct {v1, p1, p2}, Lh63;-><init>(Lfp7;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object p2, p0, Ll43;->w:Lj43;

    .line 176
    .line 177
    iget-object p2, p2, Lj43;->A:Ls53;

    .line 178
    .line 179
    iput-object p1, v0, Lk43;->z:Lfp7;

    .line 180
    .line 181
    iput v2, v0, Lk43;->C:I

    .line 182
    .line 183
    invoke-virtual {p2, p0, v1, v0}, Lxg5;->a(Ljava/lang/Object;Ljava/lang/Object;Lh61;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    if-ne p2, v5, :cond_8

    .line 188
    .line 189
    :goto_3
    return-object v5

    .line 190
    :cond_8
    :goto_4
    check-cast p2, Lh63;

    .line 191
    .line 192
    iget-object p2, p2, Lh63;->b:Ljava/lang/Object;

    .line 193
    .line 194
    sget-object v0, Lm15;->a:Lm15;

    .line 195
    .line 196
    invoke-static {p2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_9

    .line 201
    .line 202
    move-object v3, p2

    .line 203
    :cond_9
    if-eqz v3, :cond_b

    .line 204
    .line 205
    iget-object p2, p1, Lfp7;->a:Lgq3;

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {p2}, Lkl8;->u(Lgq3;)Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-virtual {p2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_a

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    sget-object v0, Lb26;->a:Lc26;

    .line 226
    .line 227
    invoke-virtual {v0, p2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    iget-object p1, p1, Lfp7;->a:Lgq3;

    .line 232
    .line 233
    new-instance v0, Lio/ktor/client/call/NoTransformationFoundException;

    .line 234
    .line 235
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v0, v1, p2, p1}, Lio/ktor/client/call/NoTransformationFoundException;-><init>(Lyl1;Lgq3;Lgq3;)V

    .line 240
    .line 241
    .line 242
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    :cond_b
    :goto_5
    return-object v3

    .line 244
    :goto_6
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const-string p2, "Receive failed"

    .line 249
    .line 250
    invoke-static {p2, p1}, Lrc9;->b(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-static {p0, p2}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 255
    .line 256
    .line 257
    throw p1
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
.end method

.method public b()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

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
.end method

.method public final c()Lx53;
    .locals 0

    .line 1
    iget-object p0, p0, Ll43;->x:Lx53;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "request"

    .line 7
    .line 8
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
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

.method public final d()Lyl1;
    .locals 0

    .line 1
    iget-object p0, p0, Ll43;->y:Lyl1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "response"

    .line 7
    .line 8
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
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

.method public final getAttributes()Liz0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ll43;->c()Lx53;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lx53;->getAttributes()Liz0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public final k()Le81;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lo81;->k()Le81;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpClientCall["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ll43;->c()Lx53;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Lx53;->D()Lio/ktor/http/Url;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ll43;->d()Lyl1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lyl1;->e()Lw63;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 p0, 0x5d

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
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
