.class public final Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;
.super Landroidx/work/CoroutineWorker;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "sync"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Landroidx/work/CoroutineWorker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p2, Landroidx/work/WorkerParameters;->b:Lce1;

    .line 11
    .line 12
    const-string v1, "JetpackWorkerClassName"

    .line 13
    .line 14
    iget-object v0, v0, Lce1;->a:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Ljava/lang/String;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v2

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lb96;->v(Landroid/content/Context;)Landroid/app/Application;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v3, Lyz2;

    .line 42
    .line 43
    invoke-static {v1, v3}, Lag8;->q(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lyz2;

    .line 48
    .line 49
    check-cast v1, Lvd1;

    .line 50
    .line 51
    iget-object v4, v1, Lvd1;->z:Llu5;

    .line 52
    .line 53
    iget-object v6, v1, Lvd1;->D:Llu5;

    .line 54
    .line 55
    iget-object v8, v1, Lvd1;->E:Llu5;

    .line 56
    .line 57
    iget-object v10, v1, Lvd1;->J:Llu5;

    .line 58
    .line 59
    iget-object v12, v1, Lvd1;->K:Llu5;

    .line 60
    .line 61
    const-string v3, "cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker"

    .line 62
    .line 63
    invoke-static {v3, v4}, Lie1;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string v5, "cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker"

    .line 67
    .line 68
    invoke-static {v5, v6}, Lie1;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const-string v7, "cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker"

    .line 72
    .line 73
    invoke-static {v7, v8}, Lie1;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const-string v9, "cu.lestebang.utiletecsa.sync.worker.SyncWorker"

    .line 77
    .line 78
    invoke-static {v9, v10}, Lie1;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v11, "cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker"

    .line 82
    .line 83
    invoke-static {v11, v12}, Lie1;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v1, 0x5

    .line 87
    filled-new-array/range {v3 .. v12}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v1, v3, v2}, Ln36;->a(I[Ljava/lang/Object;Lig;)Ln36;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v0}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lmu5;

    .line 100
    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    move-object v1, v2

    .line 104
    goto/16 :goto_1

    .line 105
    .line 106
    :cond_2
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ltd1;

    .line 111
    .line 112
    iget v1, v0, Ltd1;->a:I

    .line 113
    .line 114
    packed-switch v1, :pswitch_data_0

    .line 115
    .line 116
    .line 117
    new-instance v1, Lcu/lestebang/utiletecsa/sync/worker/UssdRefreshWorker;

    .line 118
    .line 119
    invoke-static {}, Lzv1;->a()Lh81;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    iget-object v0, v0, Ltd1;->b:Lud1;

    .line 124
    .line 125
    iget-object v0, v0, Lud1;->a:Lvd1;

    .line 126
    .line 127
    iget-object v0, v0, Lvd1;->s:Llu5;

    .line 128
    .line 129
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lk40;

    .line 134
    .line 135
    invoke-direct {v1, p1, p2, v3, v0}, Lcu/lestebang/utiletecsa/sync/worker/UssdRefreshWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_0
    new-instance v1, Lcu/lestebang/utiletecsa/sync/worker/SyncWorker;

    .line 140
    .line 141
    invoke-static {}, Lzv1;->a()Lh81;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    iget-object v0, v0, Ltd1;->b:Lud1;

    .line 146
    .line 147
    iget-object v0, v0, Lud1;->a:Lvd1;

    .line 148
    .line 149
    iget-object v0, v0, Lvd1;->I:Llu5;

    .line 150
    .line 151
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Li03;

    .line 156
    .line 157
    invoke-direct {v1, p1, p2, v3, v0}, Lcu/lestebang/utiletecsa/sync/worker/SyncWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Li03;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :pswitch_1
    new-instance v4, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 162
    .line 163
    invoke-static {}, Lzv1;->a()Lh81;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    iget-object v0, v0, Ltd1;->b:Lud1;

    .line 168
    .line 169
    iget-object v0, v0, Lud1;->a:Lvd1;

    .line 170
    .line 171
    iget-object v1, v0, Lvd1;->s:Llu5;

    .line 172
    .line 173
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object v8, v1

    .line 178
    check-cast v8, Lk40;

    .line 179
    .line 180
    iget-object v0, v0, Lvd1;->l:Llu5;

    .line 181
    .line 182
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    move-object v9, v0

    .line 187
    check-cast v9, Ldv7;

    .line 188
    .line 189
    move-object v5, p1

    .line 190
    move-object v6, p2

    .line 191
    invoke-direct/range {v4 .. v9}, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;Ldv7;)V

    .line 192
    .line 193
    .line 194
    move-object v1, v4

    .line 195
    goto :goto_1

    .line 196
    :pswitch_2
    move-object v5, p1

    .line 197
    move-object v6, p2

    .line 198
    new-instance v1, Lcu/lestebang/utiletecsa/sync/worker/NautaLogoutWorker;

    .line 199
    .line 200
    invoke-static {}, Lzv1;->a()Lh81;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-object p2, v0, Ltd1;->b:Lud1;

    .line 205
    .line 206
    iget-object p2, p2, Lud1;->a:Lvd1;

    .line 207
    .line 208
    iget-object p2, p2, Lvd1;->C:Llu5;

    .line 209
    .line 210
    invoke-interface {p2}, Lmu5;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p2, Lur4;

    .line 215
    .line 216
    invoke-direct {v1, v5, v6, p1, p2}, Lcu/lestebang/utiletecsa/sync/worker/NautaLogoutWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lur4;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :pswitch_3
    move-object v5, p1

    .line 221
    move-object v6, p2

    .line 222
    new-instance v1, Lcu/lestebang/utiletecsa/sync/worker/AppUpdateWorker;

    .line 223
    .line 224
    invoke-static {}, Lzv1;->a()Lh81;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p2, v0, Ltd1;->b:Lud1;

    .line 229
    .line 230
    iget-object p2, p2, Lud1;->a:Lvd1;

    .line 231
    .line 232
    iget-object p2, p2, Lvd1;->l:Llu5;

    .line 233
    .line 234
    invoke-interface {p2}, Lmu5;->get()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    check-cast p2, Ldv7;

    .line 239
    .line 240
    invoke-direct {v1, v5, v6, p1, p2}, Lcu/lestebang/utiletecsa/sync/worker/AppUpdateWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Ldv7;)V

    .line 241
    .line 242
    .line 243
    :goto_1
    instance-of p1, v1, Landroidx/work/CoroutineWorker;

    .line 244
    .line 245
    if-eqz p1, :cond_3

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_3
    move-object v1, v2

    .line 249
    :goto_2
    if-eqz v1, :cond_4

    .line 250
    .line 251
    iput-object v1, p0, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;->g:Landroidx/work/CoroutineWorker;

    .line 252
    .line 253
    return-void

    .line 254
    :cond_4
    const-string p0, "Unable to find appropriate worker"

    .line 255
    .line 256
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v2

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final c(Lf61;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;->g:Landroidx/work/CoroutineWorker;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/work/CoroutineWorker;->c(Lf61;)Ljava/lang/Object;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(Lf61;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;->g:Landroidx/work/CoroutineWorker;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/work/CoroutineWorker;->d(Lf61;)Ljava/lang/Object;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
