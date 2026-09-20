.class public final Ly19;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements La39;


# static fields
.field public static volatile b0:Ly19;


# instance fields
.field public final A:Lq09;

.field public final B:Lpz8;

.field public final C:Lr19;

.field public final D:Lo79;

.field public final E:Ld99;

.field public final F:Lfz8;

.field public final G:Lxb4;

.field public final H:Ll59;

.field public final I:Lv49;

.field public final J:Lev8;

.field public final K:Lb59;

.field public final L:Ljava/lang/String;

.field public M:Lcz8;

.field public N:Lr69;

.field public O:Lkr8;

.field public P:Lvy8;

.field public Q:Lc59;

.field public R:Z

.field public S:Ljava/lang/Boolean;

.field public T:J

.field public volatile U:Ljava/lang/Boolean;

.field public volatile V:Z

.field public W:I

.field public X:I

.field public final Y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final Z:J

.field public final a0:J

.field public final w:Landroid/content/Context;

.field public final x:Z

.field public final y:Lts2;

.field public final z:Ltp8;


# direct methods
.method public constructor <init>(Lm39;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ly19;->R:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Ly19;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, Lm39;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, Lts2;

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lts2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Ly19;->y:Lts2;

    .line 24
    .line 25
    sput-object v2, Lz85;->c:Lts2;

    .line 26
    .line 27
    iput-object v1, p0, Ly19;->w:Landroid/content/Context;

    .line 28
    .line 29
    iget-boolean v2, p1, Lm39;->e:Z

    .line 30
    .line 31
    iput-boolean v2, p0, Ly19;->x:Z

    .line 32
    .line 33
    iget-object v2, p1, Lm39;->b:Ljava/lang/Boolean;

    .line 34
    .line 35
    iput-object v2, p0, Ly19;->U:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v2, p1, Lm39;->h:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v2, p0, Ly19;->L:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    iput-boolean v2, p0, Ly19;->V:Z

    .line 43
    .line 44
    sget-object v3, Lh59;->b:Lp49;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-nez v3, :cond_8

    .line 48
    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    goto :goto_6

    .line 52
    :cond_0
    sget-object v3, Lh59;->a:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v3

    .line 55
    :try_start_0
    sget-object v5, Lh59;->b:Lp49;

    .line 56
    .line 57
    if-nez v5, :cond_7

    .line 58
    .line 59
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    :try_start_1
    sget-object v5, Lh59;->b:Lp49;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v6, v1

    .line 70
    :goto_0
    if-eqz v5, :cond_2

    .line 71
    .line 72
    iget-object v7, v5, Lp49;->a:Landroid/content/Context;

    .line 73
    .line 74
    if-eq v7, v6, :cond_6

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_1
    if-eqz v5, :cond_5

    .line 80
    .line 81
    sget-object v5, Lq49;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_3

    .line 96
    .line 97
    invoke-static {}, Lk59;->a()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-nez p0, :cond_4

    .line 106
    .line 107
    throw v4

    .line 108
    :cond_4
    new-instance p0, Ljava/lang/ClassCastException;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 111
    .line 112
    .line 113
    throw p0

    .line 114
    :cond_5
    :goto_2
    new-instance v5, Lz49;

    .line 115
    .line 116
    invoke-direct {v5, v6, v2, v0}, Lz49;-><init>(Landroid/content/Context;IZ)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5}, Ln85;->k(Lx77;)Lx77;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    new-instance v7, Lp49;

    .line 124
    .line 125
    invoke-direct {v7, v6, v5}, Lp49;-><init>(Landroid/content/Context;Lx77;)V

    .line 126
    .line 127
    .line 128
    sput-object v7, Lh59;->b:Lp49;

    .line 129
    .line 130
    sget-object v5, Lh59;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 133
    .line 134
    .line 135
    :cond_6
    monitor-exit v3

    .line 136
    goto :goto_4

    .line 137
    :goto_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :try_start_2
    throw p0

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    :goto_4
    monitor-exit v3

    .line 142
    goto :goto_6

    .line 143
    :goto_5
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    throw p0

    .line 145
    :cond_8
    :goto_6
    sget-object v3, Lxb4;->P:Lxb4;

    .line 146
    .line 147
    iput-object v3, p0, Ly19;->G:Lxb4;

    .line 148
    .line 149
    new-instance v3, Lb49;

    .line 150
    .line 151
    sget-object v5, Lr39;->a:Lqc3;

    .line 152
    .line 153
    sget-object v6, Lym;->a:Lxm;

    .line 154
    .line 155
    sget-object v7, Ljw2;->c:Ljw2;

    .line 156
    .line 157
    invoke-direct {v3, v1, v5, v6, v7}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    new-array v6, v0, [Ljava/lang/String;

    .line 169
    .line 170
    const-string v7, "com.google.android.gms.measurement#"

    .line 171
    .line 172
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-static {}, Li93;->b()Lza0;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    new-instance v8, Lk68;

    .line 181
    .line 182
    const/16 v9, 0x12

    .line 183
    .line 184
    invoke-direct {v8, v9, v5, v6}, Lk68;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iput-object v8, v7, Lza0;->d:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-virtual {v7}, Lza0;->a()Lxg8;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v3, v0, v5}, Lkw2;->b(ILi93;)Lyb9;

    .line 194
    .line 195
    .line 196
    sget-object v3, Lx49;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    if-eqz v5, :cond_9

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :cond_9
    :try_start_3
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0

    .line 209
    goto :goto_7

    .line 210
    :catch_0
    invoke-static {}, Lx49;->b()V

    .line 211
    .line 212
    .line 213
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 214
    .line 215
    sget-object v5, Lx49;->m:Lx77;

    .line 216
    .line 217
    invoke-interface {v5}, Lx77;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 222
    .line 223
    const-string v6, "context.getApplicationContext() yielded NullPointerException"

    .line 224
    .line 225
    new-array v7, v0, [Ljava/lang/Object;

    .line 226
    .line 227
    invoke-static {v1, v5, v4, v6, v7}, Lc35;->q(Ljava/util/logging/Level;Ljava/util/concurrent/Executor;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v4

    .line 231
    :goto_7
    if-eqz v1, :cond_c

    .line 232
    .line 233
    :cond_a
    invoke-virtual {v3, v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_b

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_b
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    if-eqz v5, :cond_a

    .line 245
    .line 246
    :cond_c
    :goto_8
    iget-object v1, p1, Lm39;->f:Ljava/lang/Long;

    .line 247
    .line 248
    if-eqz v1, :cond_d

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v3

    .line 254
    goto :goto_9

    .line 255
    :cond_d
    iget-object v1, p0, Ly19;->G:Lxb4;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    :goto_9
    iput-wide v3, p0, Ly19;->Z:J

    .line 265
    .line 266
    iget-object v1, p1, Lm39;->g:Ljava/lang/Long;

    .line 267
    .line 268
    if-eqz v1, :cond_e

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v3

    .line 274
    goto :goto_a

    .line 275
    :cond_e
    iget-object v1, p0, Ly19;->G:Lxb4;

    .line 276
    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 281
    .line 282
    .line 283
    move-result-wide v3

    .line 284
    :goto_a
    iput-wide v3, p0, Ly19;->a0:J

    .line 285
    .line 286
    new-instance v1, Ltp8;

    .line 287
    .line 288
    invoke-direct {v1, p0}, Lin8;-><init>(Ly19;)V

    .line 289
    .line 290
    .line 291
    sget-object v3, Lhr2;->z:Lhr2;

    .line 292
    .line 293
    iput-object v3, v1, Ltp8;->z:Lrp8;

    .line 294
    .line 295
    iput-object v1, p0, Ly19;->z:Ltp8;

    .line 296
    .line 297
    new-instance v1, Lq09;

    .line 298
    .line 299
    invoke-direct {v1, p0}, Lq09;-><init>(Ly19;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Ly29;->f1()V

    .line 303
    .line 304
    .line 305
    iput-object v1, p0, Ly19;->A:Lq09;

    .line 306
    .line 307
    new-instance v1, Lpz8;

    .line 308
    .line 309
    invoke-direct {v1, p0}, Lpz8;-><init>(Ly19;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Ly29;->f1()V

    .line 313
    .line 314
    .line 315
    iput-object v1, p0, Ly19;->B:Lpz8;

    .line 316
    .line 317
    new-instance v3, Ld99;

    .line 318
    .line 319
    invoke-direct {v3, p0}, Ld99;-><init>(Ly19;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Ly29;->f1()V

    .line 323
    .line 324
    .line 325
    iput-object v3, p0, Ly19;->E:Ld99;

    .line 326
    .line 327
    new-instance v3, Lbr4;

    .line 328
    .line 329
    const/16 v4, 0x1c

    .line 330
    .line 331
    invoke-direct {v3, v4, p1, p0}, Lbr4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    new-instance v4, Lfz8;

    .line 335
    .line 336
    invoke-direct {v4, v3}, Lfz8;-><init>(Lbr4;)V

    .line 337
    .line 338
    .line 339
    iput-object v4, p0, Ly19;->F:Lfz8;

    .line 340
    .line 341
    new-instance v3, Lev8;

    .line 342
    .line 343
    invoke-direct {v3, p0}, Lev8;-><init>(Ly19;)V

    .line 344
    .line 345
    .line 346
    iput-object v3, p0, Ly19;->J:Lev8;

    .line 347
    .line 348
    new-instance v3, Ll59;

    .line 349
    .line 350
    invoke-direct {v3, p0}, Ll59;-><init>(Ly19;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v3}, Lfy8;->e1()V

    .line 354
    .line 355
    .line 356
    iput-object v3, p0, Ly19;->H:Ll59;

    .line 357
    .line 358
    new-instance v3, Lv49;

    .line 359
    .line 360
    invoke-direct {v3, p0}, Lv49;-><init>(Ly19;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3}, Lfy8;->e1()V

    .line 364
    .line 365
    .line 366
    iput-object v3, p0, Ly19;->I:Lv49;

    .line 367
    .line 368
    new-instance v4, Lo79;

    .line 369
    .line 370
    invoke-direct {v4, p0}, Lo79;-><init>(Ly19;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4}, Lfy8;->e1()V

    .line 374
    .line 375
    .line 376
    iput-object v4, p0, Ly19;->D:Lo79;

    .line 377
    .line 378
    new-instance v4, Lb59;

    .line 379
    .line 380
    invoke-direct {v4, p0}, Ly29;-><init>(Ly19;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4}, Ly29;->f1()V

    .line 384
    .line 385
    .line 386
    iput-object v4, p0, Ly19;->K:Lb59;

    .line 387
    .line 388
    new-instance v4, Lr19;

    .line 389
    .line 390
    invoke-direct {v4, p0}, Lr19;-><init>(Ly19;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4}, Ly29;->f1()V

    .line 394
    .line 395
    .line 396
    iput-object v4, p0, Ly19;->C:Lr19;

    .line 397
    .line 398
    iget-object v5, p1, Lm39;->d:Liv8;

    .line 399
    .line 400
    if-eqz v5, :cond_f

    .line 401
    .line 402
    iget-wide v5, v5, Liv8;->x:J

    .line 403
    .line 404
    const-wide/16 v7, 0x0

    .line 405
    .line 406
    cmp-long v5, v5, v7

    .line 407
    .line 408
    if-eqz v5, :cond_f

    .line 409
    .line 410
    move v2, v0

    .line 411
    :cond_f
    iget-object v5, p0, Ly19;->w:Landroid/content/Context;

    .line 412
    .line 413
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    instance-of v5, v5, Landroid/app/Application;

    .line 418
    .line 419
    if-eqz v5, :cond_11

    .line 420
    .line 421
    invoke-static {v3}, Ly19;->f(Lfy8;)V

    .line 422
    .line 423
    .line 424
    iget-object v1, v3, Lin8;->w:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, Ly19;

    .line 427
    .line 428
    iget-object v1, v1, Ly19;->w:Landroid/content/Context;

    .line 429
    .line 430
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    instance-of v1, v1, Landroid/app/Application;

    .line 435
    .line 436
    if-eqz v1, :cond_12

    .line 437
    .line 438
    iget-object v1, v3, Lin8;->w:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Ly19;

    .line 441
    .line 442
    iget-object v1, v1, Ly19;->w:Landroid/content/Context;

    .line 443
    .line 444
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Landroid/app/Application;

    .line 449
    .line 450
    iget-object v5, v3, Lv49;->y:Lzb2;

    .line 451
    .line 452
    if-nez v5, :cond_10

    .line 453
    .line 454
    new-instance v5, Lzb2;

    .line 455
    .line 456
    const/4 v6, 0x2

    .line 457
    invoke-direct {v5, v6, v3}, Lzb2;-><init>(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    iput-object v5, v3, Lv49;->y:Lzb2;

    .line 461
    .line 462
    :cond_10
    if-eqz v2, :cond_12

    .line 463
    .line 464
    iget-object v2, v3, Lv49;->y:Lzb2;

    .line 465
    .line 466
    invoke-virtual {v1, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 467
    .line 468
    .line 469
    iget-object v2, v3, Lv49;->y:Lzb2;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 472
    .line 473
    .line 474
    iget-object v1, v3, Lin8;->w:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v1, Ly19;

    .line 477
    .line 478
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 479
    .line 480
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 481
    .line 482
    .line 483
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 484
    .line 485
    const-string v2, "Registered activity lifecycle callback"

    .line 486
    .line 487
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_11
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 492
    .line 493
    .line 494
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 495
    .line 496
    const-string v2, "Application context is not an Application"

    .line 497
    .line 498
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_12
    :goto_b
    new-instance v1, Lnt2;

    .line 502
    .line 503
    const/16 v2, 0x18

    .line 504
    .line 505
    invoke-direct {v1, p0, v0, p1, v2}, Lnt2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v4, v1}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 509
    .line 510
    .line 511
    return-void
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

.method public static final d(Lcx8;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 7
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

.method public static final e(Lin8;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 7
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

.method public static final f(Lfy8;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lfy8;->x:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method public static final g(Ly29;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Ly29;->x:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method

.method public static m(Landroid/content/Context;Liv8;Ljava/lang/Long;Ljava/lang/Long;)Ly19;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v6, p1, Liv8;->z:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-boolean v5, p1, Liv8;->y:Z

    .line 6
    .line 7
    iget-wide v3, p1, Liv8;->x:J

    .line 8
    .line 9
    iget-wide v1, p1, Liv8;->w:J

    .line 10
    .line 11
    new-instance v0, Liv8;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-direct/range {v0 .. v7}, Liv8;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-static {p0}, Lz65;->k(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Ly19;->b0:Ly19;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-class v1, Ly19;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, Ly19;->b0:Ly19;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lm39;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1, p2, p3}, Lm39;-><init>(Landroid/content/Context;Liv8;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Ly19;

    .line 45
    .line 46
    invoke-direct {p0, v0}, Ly19;-><init>(Lm39;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, Ly19;->b0:Ly19;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit v1

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p0, p1, Liv8;->z:Landroid/os/Bundle;

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    const-string p1, "dataCollectionDefaultEnabled"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    sget-object p1, Ly19;->b0:Ly19;

    .line 74
    .line 75
    invoke-static {p1}, Lz65;->k(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Ly19;->b0:Ly19;

    .line 79
    .line 80
    const-string p2, "dataCollectionDefaultEnabled"

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, p1, Ly19;->U:Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_3
    :goto_2
    sget-object p0, Ly19;->b0:Ly19;

    .line 93
    .line 94
    invoke-static {p0}, Lz65;->k(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Ly19;->b0:Ly19;

    .line 98
    .line 99
    return-object p0
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


# virtual methods
.method public final A()Lts2;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->y:Lts2;

    .line 2
    .line 3
    return-object p0
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

.method public final G()Lpz8;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 2
    .line 3
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final Q()Lxb4;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->G:Lxb4;

    .line 2
    .line 3
    return-object p0
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

.method public final a()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly19;->b()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public final b()I
    .locals 5

    .line 1
    iget-object v0, p0, Ly19;->C:Lr19;

    .line 2
    .line 3
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lr19;->b1()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ly19;->z:Ltp8;

    .line 10
    .line 11
    invoke-virtual {v1}, Ltp8;->q1()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v2, :cond_8

    .line 17
    .line 18
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lr19;->b1()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, Ly19;->V:Z

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, Ly19;->A:Lq09;

    .line 29
    .line 30
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lin8;->b1()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v4, "measurement_enabled"

    .line 41
    .line 42
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 p0, 0x3

    .line 72
    return p0

    .line 73
    :cond_2
    iget-object v0, v1, Lin8;->w:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ly19;

    .line 76
    .line 77
    iget-object v0, v0, Ly19;->y:Lts2;

    .line 78
    .line 79
    const-string v0, "firebase_analytics_collection_enabled"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ltp8;->p1(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 p0, 0x4

    .line 95
    return p0

    .line 96
    :cond_4
    iget-object v0, p0, Ly19;->U:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-object p0, p0, Ly19;->U:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/4 p0, 0x7

    .line 110
    return p0

    .line 111
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 112
    return p0

    .line 113
    :cond_7
    const/16 p0, 0x8

    .line 114
    .line 115
    return p0

    .line 116
    :cond_8
    return v3
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
.end method

.method public final c()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Ly19;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, Ly19;->C:Lr19;

    .line 7
    .line 8
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lr19;->b1()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ly19;->S:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v2, p0, Ly19;->G:Lxb4;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-wide v3, p0, Ly19;->T:J

    .line 21
    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-wide v5, p0, Ly19;->T:J

    .line 42
    .line 43
    sub-long/2addr v3, v5

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const-wide/16 v5, 0x3e8

    .line 49
    .line 50
    cmp-long v0, v3, v5

    .line 51
    .line 52
    if-lez v0, :cond_3

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    iput-wide v2, p0, Ly19;->T:J

    .line 62
    .line 63
    iget-object v0, p0, Ly19;->E:Ld99;

    .line 64
    .line 65
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.permission.INTERNET"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ld99;->F1(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ld99;->F1(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    iget-object v2, p0, Ly19;->w:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v2}, Lcf8;->a(Landroid/content/Context;)Ltb1;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ltb1;->d()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/4 v4, 0x1

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v3, p0, Ly19;->z:Ltp8;

    .line 98
    .line 99
    invoke-virtual {v3}, Ltp8;->f1()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    invoke-static {v2}, Ld99;->X1(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-static {v2}, Ld99;->x1(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    :cond_1
    move v1, v4

    .line 118
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v2, p0, Ly19;->S:Ljava/lang/Boolean;

    .line 123
    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, Ly19;->l()Lvy8;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, Lvy8;->j1()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Ld99;->i1(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, Ly19;->S:Ljava/lang/Boolean;

    .line 143
    .line 144
    :cond_3
    iget-object p0, p0, Ly19;->S:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    return p0

    .line 151
    :cond_4
    const-string p0, "AppMeasurement is not initialized"

    .line 152
    .line 153
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return v1
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
.end method

.method public final h()Lfz8;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->F:Lfz8;

    .line 2
    .line 3
    return-object p0
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

.method public final i()Lcz8;
    .locals 1

    .line 1
    iget-object v0, p0, Ly19;->M:Lcz8;

    .line 2
    .line 3
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly19;->M:Lcz8;

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

.method public final j()Lr69;
    .locals 1

    .line 1
    iget-object v0, p0, Ly19;->N:Lr69;

    .line 2
    .line 3
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly19;->N:Lr69;

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

.method public final k()Lkr8;
    .locals 1

    .line 1
    iget-object v0, p0, Ly19;->O:Lkr8;

    .line 2
    .line 3
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly19;->O:Lkr8;

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

.method public final l()Lvy8;
    .locals 1

    .line 1
    iget-object v0, p0, Ly19;->P:Lvy8;

    .line 2
    .line 3
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly19;->P:Lvy8;

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

.method public final n0()Lr19;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 2
    .line 3
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final o0()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Ly19;->w:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
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
