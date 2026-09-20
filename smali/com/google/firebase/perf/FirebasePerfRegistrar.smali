.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static synthetic a(Lkd6;)Lif2;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(Ltv0;)Lif2;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static synthetic b(Lav5;Lkd6;)Lef2;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(Lav5;Ltv0;)Lef2;

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

.method private static lambda$getComponents$0(Lav5;Ltv0;)Lef2;
    .locals 14

    .line 1
    new-instance v0, Lef2;

    .line 2
    .line 3
    const-class v1, Loe2;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Loe2;

    .line 10
    .line 11
    const-class v2, Lo10;

    .line 12
    .line 13
    invoke-interface {p1, v2}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Lnu5;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lo10;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Loe2;->a()V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, Loe2;->a:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {}, Lb01;->e()Lb01;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v3, Lb01;->d:Lrg;

    .line 45
    .line 46
    invoke-static {p1}, Ljb5;->u(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iput-boolean v4, v3, Lrg;->b:Z

    .line 51
    .line 52
    iget-object v1, v1, Lb01;->c:Lzt1;

    .line 53
    .line 54
    invoke-virtual {v1, p1}, Lzt1;->c(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lwq;->a()Lwq;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    monitor-enter v1

    .line 62
    :try_start_0
    iget-boolean v3, v1, Lwq;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    monitor-exit v1

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    instance-of v5, v3, Landroid/app/Application;

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    check-cast v3, Landroid/app/Application;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 80
    .line 81
    .line 82
    iput-boolean v4, v1, Lwq;->L:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move-object p0, v0

    .line 87
    goto/16 :goto_c

    .line 88
    .line 89
    :cond_1
    :goto_0
    monitor-exit v1

    .line 90
    :goto_1
    new-instance v3, Ljf2;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v5, v1, Lwq;->C:Ljava/util/HashSet;

    .line 96
    .line 97
    monitor-enter v5

    .line 98
    :try_start_2
    iget-object v1, v1, Lwq;->C:Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_2
    sget-object v1, Lhn7;->O:Lhn7;

    .line 114
    .line 115
    new-instance v2, Lg22;

    .line 116
    .line 117
    const/16 v3, 0x17

    .line 118
    .line 119
    invoke-direct {v2, v3}, Lg22;-><init>(I)V

    .line 120
    .line 121
    .line 122
    sget-object v3, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 123
    .line 124
    if-nez v3, :cond_4

    .line 125
    .line 126
    const-class v3, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 127
    .line 128
    monitor-enter v3

    .line 129
    :try_start_3
    sget-object v5, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 130
    .line 131
    if-nez v5, :cond_3

    .line 132
    .line 133
    new-instance v5, Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 134
    .line 135
    invoke-static {}, Lb01;->e()Lb01;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 140
    .line 141
    sget-wide v8, Lcom/google/firebase/perf/metrics/AppStartTrace;->T:J

    .line 142
    .line 143
    const-wide/16 v10, 0xa

    .line 144
    .line 145
    add-long/2addr v10, v8

    .line 146
    sget-object v12, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 147
    .line 148
    new-instance v13, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 149
    .line 150
    invoke-direct {v13}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 151
    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x1

    .line 155
    invoke-direct/range {v7 .. v13}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 156
    .line 157
    .line 158
    invoke-direct {v5, v1, v2, v6, v7}, Lcom/google/firebase/perf/metrics/AppStartTrace;-><init>(Lhn7;Lg22;Lb01;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 159
    .line 160
    .line 161
    sput-object v5, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catchall_1
    move-exception v0

    .line 165
    move-object p0, v0

    .line 166
    goto :goto_3

    .line 167
    :cond_3
    :goto_2
    monitor-exit v3

    .line 168
    goto :goto_4

    .line 169
    :goto_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 170
    throw p0

    .line 171
    :cond_4
    :goto_4
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->V:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 172
    .line 173
    :goto_5
    monitor-enter v1

    .line 174
    :try_start_4
    iget-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 175
    .line 176
    if-eqz v2, :cond_5

    .line 177
    .line 178
    monitor-exit v1

    .line 179
    goto :goto_9

    .line 180
    :cond_5
    :try_start_5
    sget-object v2, Lgp5;->E:Lgp5;

    .line 181
    .line 182
    iget-object v2, v2, Lgp5;->B:Lw54;

    .line 183
    .line 184
    invoke-virtual {v2, v1}, Lw54;->x0(Ls54;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    instance-of v2, p1, Landroid/app/Application;

    .line 192
    .line 193
    if-eqz v2, :cond_8

    .line 194
    .line 195
    move-object v2, p1

    .line 196
    check-cast v2, Landroid/app/Application;

    .line 197
    .line 198
    invoke-virtual {v2, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 199
    .line 200
    .line 201
    iget-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->R:Z

    .line 202
    .line 203
    if-nez v2, :cond_7

    .line 204
    .line 205
    move-object v2, p1

    .line 206
    check-cast v2, Landroid/app/Application;

    .line 207
    .line 208
    invoke-static {v2}, Lcom/google/firebase/perf/metrics/AppStartTrace;->d(Landroid/app/Application;)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_6

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_6
    const/4 v2, 0x0

    .line 216
    goto :goto_7

    .line 217
    :cond_7
    :goto_6
    move v2, v4

    .line 218
    :goto_7
    iput-boolean v2, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->R:Z

    .line 219
    .line 220
    iput-boolean v4, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    .line 221
    .line 222
    check-cast p1, Landroid/app/Application;

    .line 223
    .line 224
    iput-object p1, v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Landroid/app/Application;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :catchall_2
    move-exception v0

    .line 228
    move-object p0, v0

    .line 229
    goto :goto_a

    .line 230
    :cond_8
    :goto_8
    monitor-exit v1

    .line 231
    :goto_9
    new-instance p1, Lge;

    .line 232
    .line 233
    invoke-direct {p1, v4, v1}, Lge;-><init>(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 237
    .line 238
    .line 239
    goto :goto_b

    .line 240
    :goto_a
    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 241
    throw p0

    .line 242
    :cond_9
    :goto_b
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p0}, Lcom/google/firebase/perf/session/SessionManager;->initializeGaugeCollection()V

    .line 247
    .line 248
    .line 249
    return-object v0

    .line 250
    :catchall_3
    move-exception v0

    .line 251
    move-object p0, v0

    .line 252
    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 253
    throw p0

    .line 254
    :goto_c
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 255
    throw p0
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
.end method

.method private static providesFirebasePerformance(Ltv0;)Lif2;
    .locals 10

    .line 1
    const-class v0, Lef2;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lam6;

    .line 7
    .line 8
    const-class v0, Loe2;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v2, v0

    .line 15
    check-cast v2, Loe2;

    .line 16
    .line 17
    const-class v0, Lwe2;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, Lwe2;

    .line 25
    .line 26
    const-class v0, Lb46;

    .line 27
    .line 28
    invoke-interface {p0, v0}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-class v0, Lcn7;

    .line 33
    .line 34
    invoke-interface {p0, v0}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/16 v6, 0xd

    .line 39
    .line 40
    invoke-direct/range {v1 .. v6}, Lam6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lkf2;

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-direct {v3, v1, p0}, Lkf2;-><init>(Lam6;I)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Lkf2;

    .line 50
    .line 51
    const/4 p0, 0x2

    .line 52
    invoke-direct {v4, v1, p0}, Lkf2;-><init>(Lam6;I)V

    .line 53
    .line 54
    .line 55
    new-instance v5, Lkf2;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-direct {v5, v1, v0}, Lkf2;-><init>(Lam6;I)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Lkf2;

    .line 62
    .line 63
    const/4 v2, 0x3

    .line 64
    invoke-direct {v6, v1, v2}, Lkf2;-><init>(Lam6;I)V

    .line 65
    .line 66
    .line 67
    new-instance v7, Lqd1;

    .line 68
    .line 69
    invoke-direct {v7, v1, p0}, Lqd1;-><init>(Lam6;I)V

    .line 70
    .line 71
    .line 72
    new-instance v8, Lqd1;

    .line 73
    .line 74
    invoke-direct {v8, v1, v0}, Lqd1;-><init>(Lam6;I)V

    .line 75
    .line 76
    .line 77
    new-instance v9, Lqd1;

    .line 78
    .line 79
    invoke-direct {v9, v1, v2}, Lqd1;-><init>(Lam6;I)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Llf2;

    .line 83
    .line 84
    invoke-direct/range {v2 .. v9}, Llf2;-><init>(Lkf2;Lkf2;Lkf2;Lkf2;Lqd1;Lqd1;Lqd1;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Lcx1;->a(Llu5;)Llu5;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, Lcx1;

    .line 92
    .line 93
    invoke-virtual {p0}, Lcx1;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lif2;

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
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Lav5;

    .line 2
    .line 3
    const-class v0, Ljs7;

    .line 4
    .line 5
    const-class v1, Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-direct {p0, v0, v1}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    const-class v0, Lif2;

    .line 11
    .line 12
    invoke-static {v0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "fire-perf"

    .line 17
    .line 18
    iput-object v1, v0, Lfv0;->a:Ljava/lang/String;

    .line 19
    .line 20
    const-class v2, Loe2;

    .line 21
    .line 22
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v3}, Lfv0;->a(Lzp1;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lzp1;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    const-class v5, Lb46;

    .line 33
    .line 34
    invoke-direct {v3, v4, v4, v5}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Lfv0;->a(Lzp1;)V

    .line 38
    .line 39
    .line 40
    const-class v3, Lwe2;

    .line 41
    .line 42
    invoke-static {v3}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v0, v3}, Lfv0;->a(Lzp1;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lzp1;

    .line 50
    .line 51
    const-class v5, Lcn7;

    .line 52
    .line 53
    invoke-direct {v3, v4, v4, v5}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3}, Lfv0;->a(Lzp1;)V

    .line 57
    .line 58
    .line 59
    const-class v3, Lef2;

    .line 60
    .line 61
    invoke-static {v3}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v0, v5}, Lfv0;->a(Lzp1;)V

    .line 66
    .line 67
    .line 68
    new-instance v5, Lta1;

    .line 69
    .line 70
    const/16 v6, 0x1c

    .line 71
    .line 72
    invoke-direct {v5, v6}, Lta1;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object v5, v0, Lfv0;->g:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {v0}, Lfv0;->b()Lgv0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v3}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v5, "fire-perf-early"

    .line 86
    .line 87
    iput-object v5, v3, Lfv0;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v3, v2}, Lfv0;->a(Lzp1;)V

    .line 94
    .line 95
    .line 96
    const-class v2, Lo10;

    .line 97
    .line 98
    invoke-static {v2}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v3, v2}, Lfv0;->a(Lzp1;)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Lzp1;

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-direct {v2, p0, v4, v5}, Lzp1;-><init>(Lav5;II)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v2}, Lfv0;->a(Lzp1;)V

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x2

    .line 115
    invoke-virtual {v3, v2}, Lfv0;->c(I)V

    .line 116
    .line 117
    .line 118
    new-instance v4, Lul1;

    .line 119
    .line 120
    invoke-direct {v4, p0, v2}, Lul1;-><init>(Lav5;I)V

    .line 121
    .line 122
    .line 123
    iput-object v4, v3, Lfv0;->g:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v3}, Lfv0;->b()Lgv0;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string v2, "22.0.5"

    .line 130
    .line 131
    invoke-static {v1, v2}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    filled-new-array {v0, p0, v1}, [Lgv0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0
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
