.class public final Lrq2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Llq2;

.field public final B:Lme6;

.field public C:La9;

.field public D:La9;

.field public E:La9;

.field public F:Ljava/util/ArrayDeque;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Ljava/util/ArrayList;

.field public M:Ljava/util/ArrayList;

.field public N:Ljava/util/ArrayList;

.field public O:Ltq2;

.field public final P:Lge;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lam6;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lhq2;

.field public g:Lv45;

.field public h:Lq30;

.field public i:Z

.field public final j:Lg30;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Ljava/util/Map;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljz0;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final q:Ljq2;

.field public final r:Ljq2;

.field public final s:Ljq2;

.field public final t:Ljq2;

.field public final u:Lkq2;

.field public v:I

.field public w:Ldq2;

.field public x:Lmp7;

.field public y:Lbq2;

.field public z:Lbq2;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lam6;

    .line 12
    .line 13
    const/16 v1, 0xe

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lam6;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lrq2;->c:Lam6;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Lhq2;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lhq2;-><init>(Lrq2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lrq2;->f:Lhq2;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lrq2;->h:Lq30;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lrq2;->i:Z

    .line 39
    .line 40
    new-instance v0, Lg30;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, v1, p0}, Lg30;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lrq2;->j:Lg30;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lrq2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lrq2;->l:Ljava/util/Map;

    .line 65
    .line 66
    new-instance v0, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lrq2;->m:Ljava/util/Map;

    .line 76
    .line 77
    new-instance v0, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lrq2;->n:Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance v0, Ljz0;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Ljz0;-><init>(Lrq2;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lrq2;->o:Ljz0;

    .line 98
    .line 99
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lrq2;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 105
    .line 106
    new-instance v0, Ljq2;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-direct {v0, p0, v1}, Ljq2;-><init>(Lrq2;I)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lrq2;->q:Ljq2;

    .line 113
    .line 114
    new-instance v0, Ljq2;

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    invoke-direct {v0, p0, v1}, Ljq2;-><init>(Lrq2;I)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, Lrq2;->r:Ljq2;

    .line 121
    .line 122
    new-instance v0, Ljq2;

    .line 123
    .line 124
    const/4 v1, 0x2

    .line 125
    invoke-direct {v0, p0, v1}, Ljq2;-><init>(Lrq2;I)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Lrq2;->s:Ljq2;

    .line 129
    .line 130
    new-instance v0, Ljq2;

    .line 131
    .line 132
    const/4 v1, 0x3

    .line 133
    invoke-direct {v0, p0, v1}, Ljq2;-><init>(Lrq2;I)V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, Lrq2;->t:Ljq2;

    .line 137
    .line 138
    new-instance v0, Lkq2;

    .line 139
    .line 140
    invoke-direct {v0, p0}, Lkq2;-><init>(Lrq2;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Lrq2;->u:Lkq2;

    .line 144
    .line 145
    const/4 v0, -0x1

    .line 146
    iput v0, p0, Lrq2;->v:I

    .line 147
    .line 148
    new-instance v0, Llq2;

    .line 149
    .line 150
    invoke-direct {v0, p0}, Llq2;-><init>(Lrq2;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, Lrq2;->A:Llq2;

    .line 154
    .line 155
    new-instance v0, Lme6;

    .line 156
    .line 157
    const/16 v1, 0x1d

    .line 158
    .line 159
    invoke-direct {v0, v1}, Lme6;-><init>(I)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p0, Lrq2;->B:Lme6;

    .line 163
    .line 164
    new-instance v0, Ljava/util/ArrayDeque;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v0, p0, Lrq2;->F:Ljava/util/ArrayDeque;

    .line 170
    .line 171
    new-instance v0, Lge;

    .line 172
    .line 173
    const/16 v1, 0x9

    .line 174
    .line 175
    invoke-direct {v0, v1, p0}, Lge;-><init>(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p0, Lrq2;->P:Lge;

    .line 179
    .line 180
    return-void
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
.end method

.method public static G(Lq30;)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lq30;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lq30;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lar2;

    .line 22
    .line 23
    iget-object v2, v2, Lar2;->b:Lbq2;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-boolean v3, p0, Lq30;->g:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
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

.method public static L(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
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

.method public static M(Lbq2;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbq2;->R:Lrq2;

    .line 5
    .line 6
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 7
    .line 8
    invoke-virtual {p0}, Lam6;->D()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    move v1, v0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lbq2;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-static {v2}, Lrq2;->M(Lbq2;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_1
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    return v0
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

.method public static O(Lbq2;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lbq2;->Z:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lbq2;->P:Lrq2;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lbq2;->S:Lbq2;

    .line 13
    .line 14
    invoke-static {p0}, Lrq2;->O(Lbq2;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static P(Lbq2;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lbq2;->P:Lrq2;

    .line 5
    .line 6
    iget-object v1, v0, Lrq2;->z:Lbq2;

    .line 7
    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_1
    iget-object p0, v0, Lrq2;->y:Lbq2;

    .line 12
    .line 13
    invoke-static {p0}, Lrq2;->P(Lbq2;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static f0(Lbq2;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Lbq2;->W:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lbq2;->W:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Lbq2;->g0:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Lbq2;->g0:Z

    .line 39
    .line 40
    :cond_1
    return-void
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


# virtual methods
.method public final A(Z)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Lrq2;->z(Z)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lrq2;->i:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Lrq2;->h:Lq30;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iput-boolean v1, p1, Lq30;->r:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Lq30;->d()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-static {p1}, Lrq2;->L(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const-string p1, "FragmentManager"

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Reversing mTransitioningOp "

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lrq2;->h:Lq30;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, " as part of execPendingActions for actions "

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object p1, p0, Lrq2;->h:Lq30;

    .line 58
    .line 59
    invoke-virtual {p1, v1, v1}, Lq30;->e(ZZ)I

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    iget-object v2, p0, Lrq2;->h:Lq30;

    .line 65
    .line 66
    invoke-virtual {p1, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lrq2;->h:Lq30;

    .line 70
    .line 71
    iget-object p1, p1, Lq30;->a:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lar2;

    .line 88
    .line 89
    iget-object v2, v2, Lar2;->b:Lbq2;

    .line 90
    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    iput-boolean v1, v2, Lbq2;->I:Z

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iput-object v0, p0, Lrq2;->h:Lq30;

    .line 97
    .line 98
    :cond_3
    move p1, v1

    .line 99
    :goto_1
    iget-object v2, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 100
    .line 101
    iget-object v3, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object v4, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 104
    .line 105
    monitor-enter v4

    .line 106
    :try_start_0
    iget-object v5, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    move v7, v1

    .line 116
    goto :goto_3

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    goto :goto_5

    .line 119
    :cond_4
    :try_start_1
    iget-object v5, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 122
    .line 123
    .line 124
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    move v6, v1

    .line 126
    move v7, v6

    .line 127
    :goto_2
    iget-object v8, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 128
    .line 129
    if-ge v6, v5, :cond_5

    .line 130
    .line 131
    :try_start_2
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    check-cast v8, Loq2;

    .line 136
    .line 137
    invoke-interface {v8, v2, v3}, Loq2;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 138
    .line 139
    .line 140
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 141
    or-int/2addr v7, v8

    .line 142
    add-int/lit8 v6, v6, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catchall_1
    move-exception p1

    .line 146
    goto :goto_4

    .line 147
    :cond_5
    :try_start_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 148
    .line 149
    .line 150
    iget-object v2, p0, Lrq2;->w:Ldq2;

    .line 151
    .line 152
    iget-object v2, v2, Ldq2;->N:Landroid/os/Handler;

    .line 153
    .line 154
    iget-object v3, p0, Lrq2;->P:Lge;

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 160
    :goto_3
    if-eqz v7, :cond_6

    .line 161
    .line 162
    const/4 p1, 0x1

    .line 163
    iput-boolean p1, p0, Lrq2;->b:Z

    .line 164
    .line 165
    :try_start_4
    iget-object v2, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 166
    .line 167
    iget-object v3, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {p0, v2, v3}, Lrq2;->X(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lrq2;->d()V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :catchall_2
    move-exception p1

    .line 177
    invoke-virtual {p0}, Lrq2;->d()V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :cond_6
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lrq2;->v()V

    .line 185
    .line 186
    .line 187
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 188
    .line 189
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, Ljava/util/HashMap;

    .line 192
    .line 193
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-interface {p0, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 202
    .line 203
    .line 204
    return p1

    .line 205
    :goto_4
    :try_start_5
    iget-object v0, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 211
    .line 212
    iget-object v0, v0, Ldq2;->N:Landroid/os/Handler;

    .line 213
    .line 214
    iget-object p0, p0, Lrq2;->P:Lge;

    .line 215
    .line 216
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 217
    .line 218
    .line 219
    throw p1

    .line 220
    :goto_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 221
    throw p0
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

.method public final B(Lq30;Z)V
    .locals 4

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lrq2;->J:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Lrq2;->z(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lrq2;->h:Lq30;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p2, :cond_5

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p2, Lq30;->r:Z

    .line 22
    .line 23
    invoke-virtual {p2}, Lq30;->d()V

    .line 24
    .line 25
    .line 26
    const/4 p2, 0x3

    .line 27
    invoke-static {p2}, Lrq2;->L(I)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    new-instance p2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Reversing mTransitioningOp "

    .line 36
    .line 37
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lrq2;->h:Lq30;

    .line 41
    .line 42
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, " as part of execSingleAction for action "

    .line 46
    .line 47
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v2, "FragmentManager"

    .line 58
    .line 59
    invoke-static {v2, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object p2, p0, Lrq2;->h:Lq30;

    .line 63
    .line 64
    invoke-virtual {p2, v1, v1}, Lq30;->e(ZZ)I

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Lrq2;->h:Lq30;

    .line 68
    .line 69
    iget-object v2, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 70
    .line 71
    iget-object v3, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p2, v2, v3}, Lq30;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, Lrq2;->h:Lq30;

    .line 77
    .line 78
    iget-object p2, p2, Lq30;->a:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lar2;

    .line 95
    .line 96
    iget-object v2, v2, Lar2;->b:Lbq2;

    .line 97
    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    iput-boolean v1, v2, Lbq2;->I:Z

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    iput-object v0, p0, Lrq2;->h:Lq30;

    .line 104
    .line 105
    :cond_5
    iget-object p2, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 106
    .line 107
    iget-object v1, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p1, p2, v1}, Lq30;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 110
    .line 111
    .line 112
    const/4 p1, 0x1

    .line 113
    iput-boolean p1, p0, Lrq2;->b:Z

    .line 114
    .line 115
    :try_start_0
    iget-object p1, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 116
    .line 117
    iget-object p2, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {p0, p1, p2}, Lrq2;->X(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lrq2;->d()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lrq2;->v()V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 132
    .line 133
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :catchall_0
    move-exception p1

    .line 150
    invoke-virtual {p0}, Lrq2;->d()V

    .line 151
    .line 152
    .line 153
    throw p1
.end method

.method public final C(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v0, Lrq2;->c:Lam6;

    .line 12
    .line 13
    iget-object v6, v0, Lrq2;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    check-cast v7, Lq30;

    .line 20
    .line 21
    iget-boolean v7, v7, Lq30;->o:Z

    .line 22
    .line 23
    iget-object v8, v0, Lrq2;->N:Ljava/util/ArrayList;

    .line 24
    .line 25
    if-nez v8, :cond_0

    .line 26
    .line 27
    new-instance v8, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v8, v0, Lrq2;->N:Ljava/util/ArrayList;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v8, v0, Lrq2;->N:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5}, Lam6;->G()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object v8, v0, Lrq2;->z:Lbq2;

    .line 48
    .line 49
    move v10, v3

    .line 50
    const/4 v11, 0x0

    .line 51
    :goto_1
    if-ge v10, v4, :cond_13

    .line 52
    .line 53
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v17

    .line 57
    move-object/from16 v9, v17

    .line 58
    .line 59
    check-cast v9, Lq30;

    .line 60
    .line 61
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v17

    .line 65
    check-cast v17, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v17

    .line 71
    iget-object v12, v0, Lrq2;->N:Ljava/util/ArrayList;

    .line 72
    .line 73
    if-nez v17, :cond_d

    .line 74
    .line 75
    iget-object v14, v9, Lq30;->a:Ljava/util/ArrayList;

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    :goto_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    if-ge v13, v15, :cond_c

    .line 83
    .line 84
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v15

    .line 88
    check-cast v15, Lar2;

    .line 89
    .line 90
    move/from16 v19, v7

    .line 91
    .line 92
    iget v7, v15, Lar2;->a:I

    .line 93
    .line 94
    move/from16 v20, v10

    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    if-eq v7, v10, :cond_b

    .line 98
    .line 99
    const/4 v10, 0x2

    .line 100
    if-eq v7, v10, :cond_5

    .line 101
    .line 102
    const/4 v10, 0x3

    .line 103
    if-eq v7, v10, :cond_3

    .line 104
    .line 105
    const/4 v10, 0x6

    .line 106
    if-eq v7, v10, :cond_3

    .line 107
    .line 108
    const/4 v10, 0x7

    .line 109
    if-eq v7, v10, :cond_2

    .line 110
    .line 111
    const/16 v10, 0x8

    .line 112
    .line 113
    if-eq v7, v10, :cond_1

    .line 114
    .line 115
    move-object/from16 v24, v6

    .line 116
    .line 117
    move/from16 v22, v11

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_1
    new-instance v7, Lar2;

    .line 121
    .line 122
    move/from16 v22, v11

    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    const/16 v11, 0x9

    .line 126
    .line 127
    invoke-direct {v7, v11, v8, v10}, Lar2;-><init>(ILbq2;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v14, v13, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v10, 0x1

    .line 134
    iput-boolean v10, v15, Lar2;->c:Z

    .line 135
    .line 136
    add-int/lit8 v13, v13, 0x1

    .line 137
    .line 138
    iget-object v7, v15, Lar2;->b:Lbq2;

    .line 139
    .line 140
    move-object/from16 v24, v6

    .line 141
    .line 142
    move-object v8, v7

    .line 143
    :goto_3
    const/4 v10, 0x1

    .line 144
    goto/16 :goto_8

    .line 145
    .line 146
    :cond_2
    const/4 v10, 0x1

    .line 147
    move/from16 v22, v11

    .line 148
    .line 149
    move-object/from16 v24, v6

    .line 150
    .line 151
    goto/16 :goto_7

    .line 152
    .line 153
    :cond_3
    move/from16 v22, v11

    .line 154
    .line 155
    iget-object v7, v15, Lar2;->b:Lbq2;

    .line 156
    .line 157
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    iget-object v7, v15, Lar2;->b:Lbq2;

    .line 161
    .line 162
    if-ne v7, v8, :cond_4

    .line 163
    .line 164
    new-instance v8, Lar2;

    .line 165
    .line 166
    const/16 v11, 0x9

    .line 167
    .line 168
    invoke-direct {v8, v11, v7}, Lar2;-><init>(ILbq2;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v14, v13, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    add-int/lit8 v13, v13, 0x1

    .line 175
    .line 176
    move-object/from16 v24, v6

    .line 177
    .line 178
    const/4 v8, 0x0

    .line 179
    goto :goto_3

    .line 180
    :cond_4
    move-object/from16 v24, v6

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_5
    move/from16 v22, v11

    .line 184
    .line 185
    iget-object v7, v15, Lar2;->b:Lbq2;

    .line 186
    .line 187
    iget v10, v7, Lbq2;->U:I

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    const/16 v18, 0x1

    .line 194
    .line 195
    add-int/lit8 v11, v11, -0x1

    .line 196
    .line 197
    const/16 v23, 0x0

    .line 198
    .line 199
    :goto_4
    if-ltz v11, :cond_9

    .line 200
    .line 201
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v24

    .line 205
    move/from16 v25, v11

    .line 206
    .line 207
    move-object/from16 v11, v24

    .line 208
    .line 209
    check-cast v11, Lbq2;

    .line 210
    .line 211
    move-object/from16 v24, v6

    .line 212
    .line 213
    iget v6, v11, Lbq2;->U:I

    .line 214
    .line 215
    if-ne v6, v10, :cond_8

    .line 216
    .line 217
    if-ne v11, v7, :cond_6

    .line 218
    .line 219
    move/from16 v21, v10

    .line 220
    .line 221
    const/4 v10, 0x1

    .line 222
    const/16 v23, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_6
    if-ne v11, v8, :cond_7

    .line 226
    .line 227
    new-instance v6, Lar2;

    .line 228
    .line 229
    move/from16 v21, v10

    .line 230
    .line 231
    const/4 v8, 0x0

    .line 232
    const/16 v10, 0x9

    .line 233
    .line 234
    invoke-direct {v6, v10, v11, v8}, Lar2;-><init>(ILbq2;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v14, v13, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    add-int/lit8 v13, v13, 0x1

    .line 241
    .line 242
    move v6, v8

    .line 243
    const/4 v8, 0x0

    .line 244
    goto :goto_5

    .line 245
    :cond_7
    move/from16 v21, v10

    .line 246
    .line 247
    const/4 v6, 0x0

    .line 248
    const/16 v10, 0x9

    .line 249
    .line 250
    :goto_5
    new-instance v10, Lar2;

    .line 251
    .line 252
    move-object/from16 v26, v8

    .line 253
    .line 254
    const/4 v8, 0x3

    .line 255
    invoke-direct {v10, v8, v11, v6}, Lar2;-><init>(ILbq2;I)V

    .line 256
    .line 257
    .line 258
    iget v6, v15, Lar2;->d:I

    .line 259
    .line 260
    iput v6, v10, Lar2;->d:I

    .line 261
    .line 262
    iget v6, v15, Lar2;->f:I

    .line 263
    .line 264
    iput v6, v10, Lar2;->f:I

    .line 265
    .line 266
    iget v6, v15, Lar2;->e:I

    .line 267
    .line 268
    iput v6, v10, Lar2;->e:I

    .line 269
    .line 270
    iget v6, v15, Lar2;->g:I

    .line 271
    .line 272
    iput v6, v10, Lar2;->g:I

    .line 273
    .line 274
    invoke-virtual {v14, v13, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    const/4 v10, 0x1

    .line 281
    add-int/2addr v13, v10

    .line 282
    move-object/from16 v8, v26

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :cond_8
    move/from16 v21, v10

    .line 286
    .line 287
    const/4 v10, 0x1

    .line 288
    :goto_6
    add-int/lit8 v11, v25, -0x1

    .line 289
    .line 290
    move/from16 v10, v21

    .line 291
    .line 292
    move-object/from16 v6, v24

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_9
    move-object/from16 v24, v6

    .line 296
    .line 297
    const/4 v10, 0x1

    .line 298
    if-eqz v23, :cond_a

    .line 299
    .line 300
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    add-int/lit8 v13, v13, -0x1

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_a
    iput v10, v15, Lar2;->a:I

    .line 307
    .line 308
    iput-boolean v10, v15, Lar2;->c:Z

    .line 309
    .line 310
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_b
    move-object/from16 v24, v6

    .line 315
    .line 316
    move/from16 v22, v11

    .line 317
    .line 318
    :goto_7
    iget-object v6, v15, Lar2;->b:Lbq2;

    .line 319
    .line 320
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    :goto_8
    add-int/2addr v13, v10

    .line 324
    move/from16 v7, v19

    .line 325
    .line 326
    move/from16 v10, v20

    .line 327
    .line 328
    move/from16 v11, v22

    .line 329
    .line 330
    move-object/from16 v6, v24

    .line 331
    .line 332
    goto/16 :goto_2

    .line 333
    .line 334
    :cond_c
    move-object/from16 v24, v6

    .line 335
    .line 336
    move/from16 v19, v7

    .line 337
    .line 338
    move/from16 v20, v10

    .line 339
    .line 340
    move/from16 v22, v11

    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_d
    move-object/from16 v24, v6

    .line 344
    .line 345
    move/from16 v19, v7

    .line 346
    .line 347
    move/from16 v20, v10

    .line 348
    .line 349
    move/from16 v22, v11

    .line 350
    .line 351
    const/4 v10, 0x1

    .line 352
    iget-object v6, v9, Lq30;->a:Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    sub-int/2addr v7, v10

    .line 359
    :goto_9
    if-ltz v7, :cond_10

    .line 360
    .line 361
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    check-cast v11, Lar2;

    .line 366
    .line 367
    iget v13, v11, Lar2;->a:I

    .line 368
    .line 369
    if-eq v13, v10, :cond_f

    .line 370
    .line 371
    const/4 v10, 0x3

    .line 372
    if-eq v13, v10, :cond_e

    .line 373
    .line 374
    packed-switch v13, :pswitch_data_0

    .line 375
    .line 376
    .line 377
    goto :goto_a

    .line 378
    :pswitch_0
    iget-object v13, v11, Lar2;->h:Lk54;

    .line 379
    .line 380
    iput-object v13, v11, Lar2;->i:Lk54;

    .line 381
    .line 382
    goto :goto_a

    .line 383
    :pswitch_1
    iget-object v8, v11, Lar2;->b:Lbq2;

    .line 384
    .line 385
    goto :goto_a

    .line 386
    :pswitch_2
    const/4 v8, 0x0

    .line 387
    goto :goto_a

    .line 388
    :cond_e
    :pswitch_3
    iget-object v11, v11, Lar2;->b:Lbq2;

    .line 389
    .line 390
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_f
    const/4 v10, 0x3

    .line 395
    :pswitch_4
    iget-object v11, v11, Lar2;->b:Lbq2;

    .line 396
    .line 397
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    :goto_a
    add-int/lit8 v7, v7, -0x1

    .line 401
    .line 402
    const/4 v10, 0x1

    .line 403
    goto :goto_9

    .line 404
    :cond_10
    :goto_b
    if-nez v22, :cond_12

    .line 405
    .line 406
    iget-boolean v6, v9, Lq30;->g:Z

    .line 407
    .line 408
    if-eqz v6, :cond_11

    .line 409
    .line 410
    goto :goto_c

    .line 411
    :cond_11
    const/4 v11, 0x0

    .line 412
    goto :goto_d

    .line 413
    :cond_12
    :goto_c
    const/4 v11, 0x1

    .line 414
    :goto_d
    add-int/lit8 v10, v20, 0x1

    .line 415
    .line 416
    move/from16 v7, v19

    .line 417
    .line 418
    move-object/from16 v6, v24

    .line 419
    .line 420
    goto/16 :goto_1

    .line 421
    .line 422
    :cond_13
    move-object/from16 v24, v6

    .line 423
    .line 424
    move/from16 v19, v7

    .line 425
    .line 426
    move/from16 v22, v11

    .line 427
    .line 428
    const/4 v10, 0x3

    .line 429
    iget-object v6, v0, Lrq2;->N:Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 432
    .line 433
    .line 434
    if-nez v19, :cond_16

    .line 435
    .line 436
    iget v6, v0, Lrq2;->v:I

    .line 437
    .line 438
    const/4 v7, 0x1

    .line 439
    if-lt v6, v7, :cond_16

    .line 440
    .line 441
    move v6, v3

    .line 442
    :goto_e
    if-ge v6, v4, :cond_16

    .line 443
    .line 444
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    check-cast v7, Lq30;

    .line 449
    .line 450
    iget-object v7, v7, Lq30;->a:Ljava/util/ArrayList;

    .line 451
    .line 452
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    :cond_14
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v8

    .line 460
    if-eqz v8, :cond_15

    .line 461
    .line 462
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    check-cast v8, Lar2;

    .line 467
    .line 468
    iget-object v8, v8, Lar2;->b:Lbq2;

    .line 469
    .line 470
    if-eqz v8, :cond_14

    .line 471
    .line 472
    iget-object v9, v8, Lbq2;->P:Lrq2;

    .line 473
    .line 474
    if-eqz v9, :cond_14

    .line 475
    .line 476
    invoke-virtual {v0, v8}, Lrq2;->g(Lbq2;)Lwq2;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    invoke-virtual {v5, v8}, Lam6;->L(Lwq2;)V

    .line 481
    .line 482
    .line 483
    goto :goto_f

    .line 484
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 485
    .line 486
    goto :goto_e

    .line 487
    :cond_16
    const-string v5, "Unknown cmd: "

    .line 488
    .line 489
    move v6, v3

    .line 490
    :goto_10
    const/4 v7, -0x1

    .line 491
    if-ge v6, v4, :cond_22

    .line 492
    .line 493
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    check-cast v8, Lq30;

    .line 498
    .line 499
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    check-cast v9, Ljava/lang/Boolean;

    .line 504
    .line 505
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    if-eqz v9, :cond_1e

    .line 510
    .line 511
    invoke-virtual {v8, v7}, Lq30;->c(I)V

    .line 512
    .line 513
    .line 514
    iget-object v7, v8, Lq30;->q:Lrq2;

    .line 515
    .line 516
    iget-object v9, v8, Lq30;->a:Ljava/util/ArrayList;

    .line 517
    .line 518
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    const/4 v12, 0x1

    .line 523
    sub-int/2addr v11, v12

    .line 524
    :goto_11
    if-ltz v11, :cond_1d

    .line 525
    .line 526
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v13

    .line 530
    check-cast v13, Lar2;

    .line 531
    .line 532
    iget-object v14, v13, Lar2;->b:Lbq2;

    .line 533
    .line 534
    if-eqz v14, :cond_1c

    .line 535
    .line 536
    iget-object v15, v14, Lbq2;->f0:Laq2;

    .line 537
    .line 538
    if-nez v15, :cond_17

    .line 539
    .line 540
    goto :goto_12

    .line 541
    :cond_17
    invoke-virtual {v14}, Lbq2;->j()Laq2;

    .line 542
    .line 543
    .line 544
    move-result-object v15

    .line 545
    iput-boolean v12, v15, Laq2;->a:Z

    .line 546
    .line 547
    :goto_12
    iget v12, v8, Lq30;->f:I

    .line 548
    .line 549
    const/16 v15, 0x2002

    .line 550
    .line 551
    const/16 v10, 0x1001

    .line 552
    .line 553
    if-eq v12, v10, :cond_1a

    .line 554
    .line 555
    if-eq v12, v15, :cond_19

    .line 556
    .line 557
    const/16 v10, 0x1004

    .line 558
    .line 559
    const/16 v15, 0x2005

    .line 560
    .line 561
    if-eq v12, v15, :cond_19

    .line 562
    .line 563
    const/16 v15, 0x1003

    .line 564
    .line 565
    if-eq v12, v15, :cond_1a

    .line 566
    .line 567
    if-eq v12, v10, :cond_18

    .line 568
    .line 569
    const/4 v15, 0x0

    .line 570
    goto :goto_13

    .line 571
    :cond_18
    const/16 v15, 0x2005

    .line 572
    .line 573
    goto :goto_13

    .line 574
    :cond_19
    move v15, v10

    .line 575
    :cond_1a
    :goto_13
    iget-object v10, v14, Lbq2;->f0:Laq2;

    .line 576
    .line 577
    if-nez v10, :cond_1b

    .line 578
    .line 579
    if-nez v15, :cond_1b

    .line 580
    .line 581
    goto :goto_14

    .line 582
    :cond_1b
    invoke-virtual {v14}, Lbq2;->j()Laq2;

    .line 583
    .line 584
    .line 585
    iget-object v10, v14, Lbq2;->f0:Laq2;

    .line 586
    .line 587
    iput v15, v10, Laq2;->f:I

    .line 588
    .line 589
    :goto_14
    invoke-virtual {v14}, Lbq2;->j()Laq2;

    .line 590
    .line 591
    .line 592
    iget-object v10, v14, Lbq2;->f0:Laq2;

    .line 593
    .line 594
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    :cond_1c
    iget v10, v13, Lar2;->a:I

    .line 598
    .line 599
    packed-switch v10, :pswitch_data_1

    .line 600
    .line 601
    .line 602
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 603
    .line 604
    iget v1, v13, Lar2;->a:I

    .line 605
    .line 606
    new-instance v2, Ljava/lang/StringBuilder;

    .line 607
    .line 608
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v0

    .line 622
    :pswitch_6
    iget-object v10, v14, Lbq2;->k0:Lk54;

    .line 623
    .line 624
    iput-object v10, v13, Lar2;->i:Lk54;

    .line 625
    .line 626
    iget-object v10, v13, Lar2;->h:Lk54;

    .line 627
    .line 628
    invoke-virtual {v7, v14, v10}, Lrq2;->c0(Lbq2;Lk54;)V

    .line 629
    .line 630
    .line 631
    :goto_15
    const/4 v10, 0x1

    .line 632
    goto/16 :goto_16

    .line 633
    .line 634
    :pswitch_7
    invoke-virtual {v7, v14}, Lrq2;->d0(Lbq2;)V

    .line 635
    .line 636
    .line 637
    goto :goto_15

    .line 638
    :pswitch_8
    const/4 v10, 0x0

    .line 639
    invoke-virtual {v7, v10}, Lrq2;->d0(Lbq2;)V

    .line 640
    .line 641
    .line 642
    goto :goto_15

    .line 643
    :pswitch_9
    iget v10, v13, Lar2;->d:I

    .line 644
    .line 645
    iget v12, v13, Lar2;->e:I

    .line 646
    .line 647
    iget v15, v13, Lar2;->f:I

    .line 648
    .line 649
    iget v13, v13, Lar2;->g:I

    .line 650
    .line 651
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 652
    .line 653
    .line 654
    const/4 v10, 0x1

    .line 655
    invoke-virtual {v7, v14, v10}, Lrq2;->b0(Lbq2;Z)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v7, v14}, Lrq2;->h(Lbq2;)V

    .line 659
    .line 660
    .line 661
    goto :goto_15

    .line 662
    :pswitch_a
    iget v10, v13, Lar2;->d:I

    .line 663
    .line 664
    iget v12, v13, Lar2;->e:I

    .line 665
    .line 666
    iget v15, v13, Lar2;->f:I

    .line 667
    .line 668
    iget v13, v13, Lar2;->g:I

    .line 669
    .line 670
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v7, v14}, Lrq2;->c(Lbq2;)V

    .line 674
    .line 675
    .line 676
    goto :goto_15

    .line 677
    :pswitch_b
    iget v10, v13, Lar2;->d:I

    .line 678
    .line 679
    iget v12, v13, Lar2;->e:I

    .line 680
    .line 681
    iget v15, v13, Lar2;->f:I

    .line 682
    .line 683
    iget v13, v13, Lar2;->g:I

    .line 684
    .line 685
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 686
    .line 687
    .line 688
    const/4 v10, 0x1

    .line 689
    invoke-virtual {v7, v14, v10}, Lrq2;->b0(Lbq2;Z)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v7, v14}, Lrq2;->K(Lbq2;)V

    .line 693
    .line 694
    .line 695
    goto :goto_15

    .line 696
    :pswitch_c
    iget v10, v13, Lar2;->d:I

    .line 697
    .line 698
    iget v12, v13, Lar2;->e:I

    .line 699
    .line 700
    iget v15, v13, Lar2;->f:I

    .line 701
    .line 702
    iget v13, v13, Lar2;->g:I

    .line 703
    .line 704
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    invoke-static {v14}, Lrq2;->f0(Lbq2;)V

    .line 711
    .line 712
    .line 713
    goto :goto_15

    .line 714
    :pswitch_d
    iget v10, v13, Lar2;->d:I

    .line 715
    .line 716
    iget v12, v13, Lar2;->e:I

    .line 717
    .line 718
    iget v15, v13, Lar2;->f:I

    .line 719
    .line 720
    iget v13, v13, Lar2;->g:I

    .line 721
    .line 722
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v7, v14}, Lrq2;->a(Lbq2;)Lwq2;

    .line 726
    .line 727
    .line 728
    goto :goto_15

    .line 729
    :pswitch_e
    iget v10, v13, Lar2;->d:I

    .line 730
    .line 731
    iget v12, v13, Lar2;->e:I

    .line 732
    .line 733
    iget v15, v13, Lar2;->f:I

    .line 734
    .line 735
    iget v13, v13, Lar2;->g:I

    .line 736
    .line 737
    invoke-virtual {v14, v10, v12, v15, v13}, Lbq2;->N(IIII)V

    .line 738
    .line 739
    .line 740
    const/4 v10, 0x1

    .line 741
    invoke-virtual {v7, v14, v10}, Lrq2;->b0(Lbq2;Z)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v7, v14}, Lrq2;->W(Lbq2;)V

    .line 745
    .line 746
    .line 747
    :goto_16
    add-int/lit8 v11, v11, -0x1

    .line 748
    .line 749
    move v12, v10

    .line 750
    const/4 v10, 0x3

    .line 751
    goto/16 :goto_11

    .line 752
    .line 753
    :cond_1d
    move-object/from16 v19, v5

    .line 754
    .line 755
    goto/16 :goto_1c

    .line 756
    .line 757
    :cond_1e
    const/4 v10, 0x1

    .line 758
    invoke-virtual {v8, v10}, Lq30;->c(I)V

    .line 759
    .line 760
    .line 761
    iget-object v7, v8, Lq30;->q:Lrq2;

    .line 762
    .line 763
    iget-object v9, v8, Lq30;->a:Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 766
    .line 767
    .line 768
    move-result v10

    .line 769
    const/4 v11, 0x0

    .line 770
    :goto_17
    if-ge v11, v10, :cond_1d

    .line 771
    .line 772
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v12

    .line 776
    check-cast v12, Lar2;

    .line 777
    .line 778
    iget-object v13, v12, Lar2;->b:Lbq2;

    .line 779
    .line 780
    if-eqz v13, :cond_21

    .line 781
    .line 782
    iget-object v14, v13, Lbq2;->f0:Laq2;

    .line 783
    .line 784
    if-nez v14, :cond_1f

    .line 785
    .line 786
    goto :goto_18

    .line 787
    :cond_1f
    invoke-virtual {v13}, Lbq2;->j()Laq2;

    .line 788
    .line 789
    .line 790
    move-result-object v14

    .line 791
    const/4 v15, 0x0

    .line 792
    iput-boolean v15, v14, Laq2;->a:Z

    .line 793
    .line 794
    :goto_18
    iget v14, v8, Lq30;->f:I

    .line 795
    .line 796
    iget-object v15, v13, Lbq2;->f0:Laq2;

    .line 797
    .line 798
    if-nez v15, :cond_20

    .line 799
    .line 800
    if-nez v14, :cond_20

    .line 801
    .line 802
    goto :goto_19

    .line 803
    :cond_20
    invoke-virtual {v13}, Lbq2;->j()Laq2;

    .line 804
    .line 805
    .line 806
    iget-object v15, v13, Lbq2;->f0:Laq2;

    .line 807
    .line 808
    iput v14, v15, Laq2;->f:I

    .line 809
    .line 810
    :goto_19
    invoke-virtual {v13}, Lbq2;->j()Laq2;

    .line 811
    .line 812
    .line 813
    iget-object v14, v13, Lbq2;->f0:Laq2;

    .line 814
    .line 815
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    :cond_21
    iget v14, v12, Lar2;->a:I

    .line 819
    .line 820
    packed-switch v14, :pswitch_data_2

    .line 821
    .line 822
    .line 823
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 824
    .line 825
    iget v1, v12, Lar2;->a:I

    .line 826
    .line 827
    new-instance v2, Ljava/lang/StringBuilder;

    .line 828
    .line 829
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    throw v0

    .line 843
    :pswitch_10
    iget-object v14, v13, Lbq2;->k0:Lk54;

    .line 844
    .line 845
    iput-object v14, v12, Lar2;->h:Lk54;

    .line 846
    .line 847
    iget-object v12, v12, Lar2;->i:Lk54;

    .line 848
    .line 849
    invoke-virtual {v7, v13, v12}, Lrq2;->c0(Lbq2;Lk54;)V

    .line 850
    .line 851
    .line 852
    :goto_1a
    move-object/from16 v19, v5

    .line 853
    .line 854
    goto/16 :goto_1b

    .line 855
    .line 856
    :pswitch_11
    const/4 v12, 0x0

    .line 857
    invoke-virtual {v7, v12}, Lrq2;->d0(Lbq2;)V

    .line 858
    .line 859
    .line 860
    goto :goto_1a

    .line 861
    :pswitch_12
    invoke-virtual {v7, v13}, Lrq2;->d0(Lbq2;)V

    .line 862
    .line 863
    .line 864
    goto :goto_1a

    .line 865
    :pswitch_13
    iget v14, v12, Lar2;->d:I

    .line 866
    .line 867
    iget v15, v12, Lar2;->e:I

    .line 868
    .line 869
    move-object/from16 v19, v5

    .line 870
    .line 871
    iget v5, v12, Lar2;->f:I

    .line 872
    .line 873
    iget v12, v12, Lar2;->g:I

    .line 874
    .line 875
    invoke-virtual {v13, v14, v15, v5, v12}, Lbq2;->N(IIII)V

    .line 876
    .line 877
    .line 878
    const/4 v15, 0x0

    .line 879
    invoke-virtual {v7, v13, v15}, Lrq2;->b0(Lbq2;Z)V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v7, v13}, Lrq2;->c(Lbq2;)V

    .line 883
    .line 884
    .line 885
    goto :goto_1b

    .line 886
    :pswitch_14
    move-object/from16 v19, v5

    .line 887
    .line 888
    iget v5, v12, Lar2;->d:I

    .line 889
    .line 890
    iget v14, v12, Lar2;->e:I

    .line 891
    .line 892
    iget v15, v12, Lar2;->f:I

    .line 893
    .line 894
    iget v12, v12, Lar2;->g:I

    .line 895
    .line 896
    invoke-virtual {v13, v5, v14, v15, v12}, Lbq2;->N(IIII)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v7, v13}, Lrq2;->h(Lbq2;)V

    .line 900
    .line 901
    .line 902
    goto :goto_1b

    .line 903
    :pswitch_15
    move-object/from16 v19, v5

    .line 904
    .line 905
    iget v5, v12, Lar2;->d:I

    .line 906
    .line 907
    iget v14, v12, Lar2;->e:I

    .line 908
    .line 909
    iget v15, v12, Lar2;->f:I

    .line 910
    .line 911
    iget v12, v12, Lar2;->g:I

    .line 912
    .line 913
    invoke-virtual {v13, v5, v14, v15, v12}, Lbq2;->N(IIII)V

    .line 914
    .line 915
    .line 916
    const/4 v15, 0x0

    .line 917
    invoke-virtual {v7, v13, v15}, Lrq2;->b0(Lbq2;Z)V

    .line 918
    .line 919
    .line 920
    invoke-static {v13}, Lrq2;->f0(Lbq2;)V

    .line 921
    .line 922
    .line 923
    goto :goto_1b

    .line 924
    :pswitch_16
    move-object/from16 v19, v5

    .line 925
    .line 926
    iget v5, v12, Lar2;->d:I

    .line 927
    .line 928
    iget v14, v12, Lar2;->e:I

    .line 929
    .line 930
    iget v15, v12, Lar2;->f:I

    .line 931
    .line 932
    iget v12, v12, Lar2;->g:I

    .line 933
    .line 934
    invoke-virtual {v13, v5, v14, v15, v12}, Lbq2;->N(IIII)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v7, v13}, Lrq2;->K(Lbq2;)V

    .line 938
    .line 939
    .line 940
    goto :goto_1b

    .line 941
    :pswitch_17
    move-object/from16 v19, v5

    .line 942
    .line 943
    iget v5, v12, Lar2;->d:I

    .line 944
    .line 945
    iget v14, v12, Lar2;->e:I

    .line 946
    .line 947
    iget v15, v12, Lar2;->f:I

    .line 948
    .line 949
    iget v12, v12, Lar2;->g:I

    .line 950
    .line 951
    invoke-virtual {v13, v5, v14, v15, v12}, Lbq2;->N(IIII)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v7, v13}, Lrq2;->W(Lbq2;)V

    .line 955
    .line 956
    .line 957
    goto :goto_1b

    .line 958
    :pswitch_18
    move-object/from16 v19, v5

    .line 959
    .line 960
    iget v5, v12, Lar2;->d:I

    .line 961
    .line 962
    iget v14, v12, Lar2;->e:I

    .line 963
    .line 964
    iget v15, v12, Lar2;->f:I

    .line 965
    .line 966
    iget v12, v12, Lar2;->g:I

    .line 967
    .line 968
    invoke-virtual {v13, v5, v14, v15, v12}, Lbq2;->N(IIII)V

    .line 969
    .line 970
    .line 971
    const/4 v15, 0x0

    .line 972
    invoke-virtual {v7, v13, v15}, Lrq2;->b0(Lbq2;Z)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v7, v13}, Lrq2;->a(Lbq2;)Lwq2;

    .line 976
    .line 977
    .line 978
    :goto_1b
    add-int/lit8 v11, v11, 0x1

    .line 979
    .line 980
    move-object/from16 v5, v19

    .line 981
    .line 982
    goto/16 :goto_17

    .line 983
    .line 984
    :goto_1c
    add-int/lit8 v6, v6, 0x1

    .line 985
    .line 986
    move-object/from16 v5, v19

    .line 987
    .line 988
    const/4 v10, 0x3

    .line 989
    goto/16 :goto_10

    .line 990
    .line 991
    :cond_22
    add-int/lit8 v5, v4, -0x1

    .line 992
    .line 993
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v5

    .line 997
    check-cast v5, Ljava/lang/Boolean;

    .line 998
    .line 999
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v5

    .line 1003
    if-eqz v22, :cond_29

    .line 1004
    .line 1005
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1006
    .line 1007
    .line 1008
    move-result v6

    .line 1009
    if-nez v6, :cond_29

    .line 1010
    .line 1011
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 1012
    .line 1013
    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v8

    .line 1020
    :goto_1d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v9

    .line 1024
    if-eqz v9, :cond_23

    .line 1025
    .line 1026
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v9

    .line 1030
    check-cast v9, Lq30;

    .line 1031
    .line 1032
    invoke-static {v9}, Lrq2;->G(Lq30;)Ljava/util/HashSet;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v9

    .line 1036
    invoke-interface {v6, v9}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1037
    .line 1038
    .line 1039
    goto :goto_1d

    .line 1040
    :cond_23
    iget-object v8, v0, Lrq2;->h:Lq30;

    .line 1041
    .line 1042
    if-nez v8, :cond_29

    .line 1043
    .line 1044
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v8

    .line 1048
    :goto_1e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v9

    .line 1052
    if-eqz v9, :cond_26

    .line 1053
    .line 1054
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v9

    .line 1058
    if-nez v9, :cond_25

    .line 1059
    .line 1060
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v9

    .line 1064
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1065
    .line 1066
    .line 1067
    move-result v10

    .line 1068
    if-nez v10, :cond_24

    .line 1069
    .line 1070
    goto :goto_1e

    .line 1071
    :cond_24
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    check-cast v0, Lbq2;

    .line 1076
    .line 1077
    const/16 v16, 0x0

    .line 1078
    .line 1079
    throw v16

    .line 1080
    :cond_25
    invoke-static {}, Lku4;->a()V

    .line 1081
    .line 1082
    .line 1083
    return-void

    .line 1084
    :cond_26
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v8

    .line 1088
    :goto_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1089
    .line 1090
    .line 1091
    move-result v9

    .line 1092
    if-eqz v9, :cond_29

    .line 1093
    .line 1094
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v9

    .line 1098
    if-nez v9, :cond_28

    .line 1099
    .line 1100
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v9

    .line 1104
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v10

    .line 1108
    if-nez v10, :cond_27

    .line 1109
    .line 1110
    goto :goto_1f

    .line 1111
    :cond_27
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    check-cast v0, Lbq2;

    .line 1116
    .line 1117
    const/16 v16, 0x0

    .line 1118
    .line 1119
    throw v16

    .line 1120
    :cond_28
    invoke-static {}, Lku4;->a()V

    .line 1121
    .line 1122
    .line 1123
    return-void

    .line 1124
    :cond_29
    move v6, v3

    .line 1125
    :goto_20
    if-ge v6, v4, :cond_2e

    .line 1126
    .line 1127
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v8

    .line 1131
    check-cast v8, Lq30;

    .line 1132
    .line 1133
    if-eqz v5, :cond_2b

    .line 1134
    .line 1135
    iget-object v9, v8, Lq30;->a:Ljava/util/ArrayList;

    .line 1136
    .line 1137
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1138
    .line 1139
    .line 1140
    move-result v9

    .line 1141
    const/16 v18, 0x1

    .line 1142
    .line 1143
    add-int/lit8 v9, v9, -0x1

    .line 1144
    .line 1145
    :goto_21
    if-ltz v9, :cond_2d

    .line 1146
    .line 1147
    iget-object v10, v8, Lq30;->a:Ljava/util/ArrayList;

    .line 1148
    .line 1149
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v10

    .line 1153
    check-cast v10, Lar2;

    .line 1154
    .line 1155
    iget-object v10, v10, Lar2;->b:Lbq2;

    .line 1156
    .line 1157
    if-eqz v10, :cond_2a

    .line 1158
    .line 1159
    invoke-virtual {v0, v10}, Lrq2;->g(Lbq2;)Lwq2;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v10

    .line 1163
    invoke-virtual {v10}, Lwq2;->k()V

    .line 1164
    .line 1165
    .line 1166
    :cond_2a
    add-int/lit8 v9, v9, -0x1

    .line 1167
    .line 1168
    goto :goto_21

    .line 1169
    :cond_2b
    iget-object v8, v8, Lq30;->a:Ljava/util/ArrayList;

    .line 1170
    .line 1171
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v8

    .line 1175
    :cond_2c
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v9

    .line 1179
    if-eqz v9, :cond_2d

    .line 1180
    .line 1181
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v9

    .line 1185
    check-cast v9, Lar2;

    .line 1186
    .line 1187
    iget-object v9, v9, Lar2;->b:Lbq2;

    .line 1188
    .line 1189
    if-eqz v9, :cond_2c

    .line 1190
    .line 1191
    invoke-virtual {v0, v9}, Lrq2;->g(Lbq2;)Lwq2;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v9

    .line 1195
    invoke-virtual {v9}, Lwq2;->k()V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_22

    .line 1199
    :cond_2d
    add-int/lit8 v6, v6, 0x1

    .line 1200
    .line 1201
    goto :goto_20

    .line 1202
    :cond_2e
    iget v6, v0, Lrq2;->v:I

    .line 1203
    .line 1204
    const/4 v10, 0x1

    .line 1205
    invoke-virtual {v0, v6, v10}, Lrq2;->R(IZ)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v1, v3, v4}, Lrq2;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    if-eqz v6, :cond_35

    .line 1221
    .line 1222
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v6

    .line 1226
    check-cast v6, Lun1;

    .line 1227
    .line 1228
    iput-boolean v5, v6, Lun1;->e:Z

    .line 1229
    .line 1230
    iget-object v8, v6, Lun1;->b:Ljava/util/ArrayList;

    .line 1231
    .line 1232
    monitor-enter v8

    .line 1233
    :try_start_0
    invoke-virtual {v6}, Lun1;->l()V

    .line 1234
    .line 1235
    .line 1236
    iget-object v9, v6, Lun1;->b:Ljava/util/ArrayList;

    .line 1237
    .line 1238
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1239
    .line 1240
    .line 1241
    move-result v10

    .line 1242
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v9

    .line 1246
    :cond_2f
    invoke-interface {v9}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1247
    .line 1248
    .line 1249
    move-result v10

    .line 1250
    if-eqz v10, :cond_34

    .line 1251
    .line 1252
    invoke-interface {v9}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v10

    .line 1256
    move-object v11, v10

    .line 1257
    check-cast v11, Lgz6;

    .line 1258
    .line 1259
    iget-object v12, v11, Lgz6;->c:Lbq2;

    .line 1260
    .line 1261
    iget-object v12, v12, Lbq2;->c0:Landroid/view/View;

    .line 1262
    .line 1263
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v12}, Landroid/view/View;->getAlpha()F

    .line 1267
    .line 1268
    .line 1269
    move-result v13

    .line 1270
    const/4 v14, 0x0

    .line 1271
    cmpg-float v13, v13, v14

    .line 1272
    .line 1273
    const/4 v14, 0x4

    .line 1274
    if-nez v13, :cond_31

    .line 1275
    .line 1276
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 1277
    .line 1278
    .line 1279
    move-result v13

    .line 1280
    if-nez v13, :cond_31

    .line 1281
    .line 1282
    :cond_30
    const/16 v13, 0x8

    .line 1283
    .line 1284
    goto :goto_24

    .line 1285
    :cond_31
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 1286
    .line 1287
    .line 1288
    move-result v12

    .line 1289
    if-eqz v12, :cond_33

    .line 1290
    .line 1291
    if-eq v12, v14, :cond_30

    .line 1292
    .line 1293
    const/16 v13, 0x8

    .line 1294
    .line 1295
    if-ne v12, v13, :cond_32

    .line 1296
    .line 1297
    const/4 v14, 0x3

    .line 1298
    goto :goto_24

    .line 1299
    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1300
    .line 1301
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    const-string v2, "Unknown visibility "

    .line 1304
    .line 1305
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v1

    .line 1315
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    throw v0

    .line 1319
    :cond_33
    const/16 v13, 0x8

    .line 1320
    .line 1321
    const/4 v14, 0x2

    .line 1322
    :goto_24
    iget v11, v11, Lgz6;->a:I

    .line 1323
    .line 1324
    const/4 v12, 0x2

    .line 1325
    if-ne v11, v12, :cond_2f

    .line 1326
    .line 1327
    if-eq v14, v12, :cond_2f

    .line 1328
    .line 1329
    goto :goto_25

    .line 1330
    :catchall_0
    move-exception v0

    .line 1331
    goto :goto_26

    .line 1332
    :cond_34
    const/4 v12, 0x2

    .line 1333
    const/16 v13, 0x8

    .line 1334
    .line 1335
    const/4 v10, 0x0

    .line 1336
    :goto_25
    check-cast v10, Lgz6;

    .line 1337
    .line 1338
    const/4 v15, 0x0

    .line 1339
    iput-boolean v15, v6, Lun1;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1340
    .line 1341
    monitor-exit v8

    .line 1342
    invoke-virtual {v6}, Lun1;->e()V

    .line 1343
    .line 1344
    .line 1345
    goto/16 :goto_23

    .line 1346
    .line 1347
    :goto_26
    monitor-exit v8

    .line 1348
    throw v0

    .line 1349
    :cond_35
    :goto_27
    if-ge v3, v4, :cond_39

    .line 1350
    .line 1351
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    check-cast v0, Lq30;

    .line 1356
    .line 1357
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v5

    .line 1361
    check-cast v5, Ljava/lang/Boolean;

    .line 1362
    .line 1363
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v5

    .line 1367
    if-eqz v5, :cond_36

    .line 1368
    .line 1369
    iget v5, v0, Lq30;->s:I

    .line 1370
    .line 1371
    if-ltz v5, :cond_36

    .line 1372
    .line 1373
    iput v7, v0, Lq30;->s:I

    .line 1374
    .line 1375
    :cond_36
    iget-object v5, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 1376
    .line 1377
    if-eqz v5, :cond_38

    .line 1378
    .line 1379
    const/4 v10, 0x0

    .line 1380
    :goto_28
    iget-object v5, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 1381
    .line 1382
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1383
    .line 1384
    .line 1385
    move-result v5

    .line 1386
    if-ge v10, v5, :cond_37

    .line 1387
    .line 1388
    iget-object v5, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 1389
    .line 1390
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v5

    .line 1394
    check-cast v5, Ljava/lang/Runnable;

    .line 1395
    .line 1396
    invoke-interface {v5}, Ljava/lang/Runnable;->run()V

    .line 1397
    .line 1398
    .line 1399
    add-int/lit8 v10, v10, 0x1

    .line 1400
    .line 1401
    goto :goto_28

    .line 1402
    :cond_37
    const/4 v12, 0x0

    .line 1403
    iput-object v12, v0, Lq30;->p:Ljava/util/ArrayList;

    .line 1404
    .line 1405
    goto :goto_29

    .line 1406
    :cond_38
    const/4 v12, 0x0

    .line 1407
    :goto_29
    add-int/lit8 v3, v3, 0x1

    .line 1408
    .line 1409
    goto :goto_27

    .line 1410
    :cond_39
    if-eqz v22, :cond_3b

    .line 1411
    .line 1412
    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->size()I

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-gtz v0, :cond_3a

    .line 1417
    .line 1418
    goto :goto_2a

    .line 1419
    :cond_3a
    move-object/from16 v0, v24

    .line 1420
    .line 1421
    const/4 v15, 0x0

    .line 1422
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    invoke-static {}, Lku4;->a()V

    .line 1430
    .line 1431
    .line 1432
    :cond_3b
    :goto_2a
    return-void

    .line 1433
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
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
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
.end method

.method public final D(I)Lbq2;
    .locals 4

    .line 1
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 2
    .line 3
    iget-object v0, p0, Lam6;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lbq2;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v3, v2, Lbq2;->T:I

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lwq2;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Lwq2;->c:Lbq2;

    .line 58
    .line 59
    iget v1, v0, Lbq2;->T:I

    .line 60
    .line 61
    if-ne v1, p1, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
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

.method public final E(Ljava/lang/String;)Lbq2;
    .locals 4

    .line 1
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 2
    .line 3
    iget-object v0, p0, Lam6;->x:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lbq2;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v3, v2, Lbq2;->V:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lwq2;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, v0, Lwq2;->c:Lbq2;

    .line 62
    .line 63
    iget-object v1, v0, Lbq2;->V:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    const/4 p0, 0x0

    .line 73
    return-object p0
    .line 74
    .line 75
    .line 76
.end method

.method public final F()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lrq2;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lun1;

    .line 20
    .line 21
    iget-boolean v1, v0, Lun1;->f:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string v1, "FragmentManager"

    .line 33
    .line 34
    const-string v2, "SpecialEffectsController: Forcing postponed operations"

    .line 35
    .line 36
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    iput-boolean v1, v0, Lun1;->f:Z

    .line 41
    .line 42
    invoke-virtual {v0}, Lun1;->e()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
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

.method public final H(Lbq2;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Lbq2;->U:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lrq2;->x:Lmp7;

    .line 12
    .line 13
    invoke-virtual {v0}, Lmp7;->h0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lrq2;->x:Lmp7;

    .line 20
    .line 21
    iget p1, p1, Lbq2;->U:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lmp7;->g0(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
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

.method public final I()Llq2;
    .locals 1

    .line 1
    iget-object v0, p0, Lrq2;->y:Lbq2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lbq2;->P:Lrq2;

    .line 6
    .line 7
    invoke-virtual {p0}, Lrq2;->I()Llq2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lrq2;->A:Llq2;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final J()Lme6;
    .locals 1

    .line 1
    iget-object v0, p0, Lrq2;->y:Lbq2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lbq2;->P:Lrq2;

    .line 6
    .line 7
    invoke-virtual {p0}, Lrq2;->J()Lme6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lrq2;->B:Lme6;

    .line 13
    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final K(Lbq2;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Lbq2;->W:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Lbq2;->W:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lbq2;->g0:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Lbq2;->g0:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lrq2;->e0(Lbq2;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
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

.method public final N()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lrq2;->y:Lbq2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lbq2;->t()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lrq2;->y:Lbq2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lbq2;->p()Lrq2;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lrq2;->N()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    return v1

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
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

.method public final Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrq2;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean p0, p0, Lrq2;->I:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final R(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p0, "No activity"

    .line 10
    .line 11
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Lrq2;->v:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_2
    iput p1, p0, Lrq2;->v:I

    .line 23
    .line 24
    iget-object p1, p0, Lrq2;->c:Lam6;

    .line 25
    .line 26
    iget-object p2, p1, Lam6;->y:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Ljava/util/HashMap;

    .line 29
    .line 30
    iget-object v0, p1, Lam6;->x:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lbq2;

    .line 49
    .line 50
    iget-object v1, v1, Lbq2;->A:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lwq2;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Lwq2;->k()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lwq2;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {v0}, Lwq2;->k()V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Lwq2;->c:Lbq2;

    .line 90
    .line 91
    iget-boolean v2, v1, Lbq2;->H:Z

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v1}, Lbq2;->v()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lam6;->M(Lwq2;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    invoke-virtual {p0}, Lrq2;->g0()V

    .line 106
    .line 107
    .line 108
    iget-boolean p1, p0, Lrq2;->G:Z

    .line 109
    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    iget p2, p0, Lrq2;->v:I

    .line 117
    .line 118
    const/4 v0, 0x7

    .line 119
    if-ne p2, v0, :cond_7

    .line 120
    .line 121
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    iput-boolean p1, p0, Lrq2;->G:Z

    .line 128
    .line 129
    :cond_7
    :goto_3
    return-void
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

.method public final S()V
    .locals 2

    .line 1
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lrq2;->H:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lrq2;->I:Z

    .line 10
    .line 11
    iget-object v1, p0, Lrq2;->O:Ltq2;

    .line 12
    .line 13
    iput-boolean v0, v1, Ltq2;->g:Z

    .line 14
    .line 15
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 16
    .line 17
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lbq2;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 40
    .line 41
    invoke-virtual {v0}, Lrq2;->S()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
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
.end method

.method public final T()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lrq2;->U(II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
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

.method public final U(II)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lrq2;->A(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lrq2;->z(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lrq2;->z:Lbq2;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lbq2;->m()Lrq2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lrq2;->T()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    iget-object v1, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2, p1, p2}, Lrq2;->V(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v0, p0, Lrq2;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v0, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v0}, Lrq2;->X(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lrq2;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Lrq2;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lrq2;->v()V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 61
    .line 62
    iget-object p0, p0, Lam6;->y:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-interface {p0, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    return p1
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
.end method

.method public final V(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_1
    if-gez p3, :cond_3

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_4

    .line 25
    :cond_2
    iget-object p3, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    add-int/lit8 v3, p3, -0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_3
    iget-object v2, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int/2addr v2, v0

    .line 41
    :goto_1
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v4, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Lq30;

    .line 50
    .line 51
    if-ltz p3, :cond_4

    .line 52
    .line 53
    iget v4, v4, Lq30;->s:I

    .line 54
    .line 55
    if-ne p3, v4, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    if-eqz p4, :cond_7

    .line 66
    .line 67
    move v3, v2

    .line 68
    :goto_3
    if-lez v3, :cond_9

    .line 69
    .line 70
    iget-object p4, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v2, v3, -0x1

    .line 73
    .line 74
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Lq30;

    .line 79
    .line 80
    if-ltz p3, :cond_9

    .line 81
    .line 82
    iget p4, p4, Lq30;->s:I

    .line 83
    .line 84
    if-ne p3, p4, :cond_9

    .line 85
    .line 86
    add-int/lit8 v3, v3, -0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    iget-object p3, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    sub-int/2addr p3, v0

    .line 96
    if-ne v2, p3, :cond_8

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 100
    .line 101
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 102
    .line 103
    return v1

    .line 104
    :cond_a
    iget-object p3, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p3, v0

    .line 111
    :goto_5
    if-lt p3, v3, :cond_b

    .line 112
    .line 113
    iget-object p4, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    check-cast p4, Lq30;

    .line 120
    .line 121
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p3, p3, -0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_b
    return v0
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

.method public final W(Lbq2;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Lbq2;->O:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lbq2;->v()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, Lbq2;->X:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lrq2;->c:Lam6;

    .line 50
    .line 51
    iget-object v1, v0, Lam6;->x:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, Lam6;->x:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Lbq2;->G:Z

    .line 66
    .line 67
    invoke-static {p1}, Lrq2;->M(Lbq2;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, Lrq2;->G:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, Lbq2;->H:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lrq2;->e0(Lbq2;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p0
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
.end method

.method public final X(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lq30;

    .line 31
    .line 32
    iget-boolean v3, v3, Lq30;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Lrq2;->C(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lq30;

    .line 74
    .line 75
    iget-boolean v3, v3, Lq30;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lrq2;->C(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Lrq2;->C(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p0, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
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

.method public final Y(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Lrq2;->w:Ldq2;

    .line 40
    .line 41
    iget-object v5, v5, Ldq2;->M:Leq2;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Lrq2;->m:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Lrq2;->w:Ldq2;

    .line 101
    .line 102
    iget-object v6, v6, Ldq2;->M:Leq2;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Lrq2;->c:Lam6;

    .line 122
    .line 123
    iget-object v4, v3, Lam6;->z:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v5, v3, Lam6;->y:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lsq2;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v1, Lsq2;->w:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    iget-object v7, v0, Lrq2;->o:Ljz0;

    .line 162
    .line 163
    const-string v8, "): "

    .line 164
    .line 165
    const/4 v9, 0x2

    .line 166
    const-string v10, "FragmentManager"

    .line 167
    .line 168
    if-eqz v6, :cond_9

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, Ljava/lang/String;

    .line 175
    .line 176
    const/4 v11, 0x0

    .line 177
    invoke-virtual {v3, v6, v11}, Lam6;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    if-eqz v6, :cond_5

    .line 182
    .line 183
    invoke-virtual {v6, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    check-cast v11, Lvq2;

    .line 188
    .line 189
    iget-object v12, v0, Lrq2;->O:Ltq2;

    .line 190
    .line 191
    iget-object v11, v11, Lvq2;->x:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v12, v12, Ltq2;->b:Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    check-cast v11, Lbq2;

    .line 200
    .line 201
    if-eqz v11, :cond_7

    .line 202
    .line 203
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_6

    .line 208
    .line 209
    new-instance v12, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v13, "restoreSaveState: re-attaching retained "

    .line 212
    .line 213
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    invoke-static {v10, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    :cond_6
    new-instance v12, Lwq2;

    .line 227
    .line 228
    invoke-direct {v12, v7, v3, v11, v6}, Lwq2;-><init>(Ljz0;Lam6;Lbq2;Landroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    new-instance v12, Lwq2;

    .line 233
    .line 234
    iget-object v7, v0, Lrq2;->w:Ldq2;

    .line 235
    .line 236
    iget-object v7, v7, Ldq2;->M:Leq2;

    .line 237
    .line 238
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    invoke-virtual {v0}, Lrq2;->I()Llq2;

    .line 243
    .line 244
    .line 245
    move-result-object v16

    .line 246
    iget-object v13, v0, Lrq2;->o:Ljz0;

    .line 247
    .line 248
    iget-object v14, v0, Lrq2;->c:Lam6;

    .line 249
    .line 250
    move-object/from16 v17, v6

    .line 251
    .line 252
    invoke-direct/range {v12 .. v17}, Lwq2;-><init>(Ljz0;Lam6;Ljava/lang/ClassLoader;Llq2;Landroid/os/Bundle;)V

    .line 253
    .line 254
    .line 255
    :goto_3
    iget-object v7, v12, Lwq2;->c:Lbq2;

    .line 256
    .line 257
    iput-object v6, v7, Lbq2;->x:Landroid/os/Bundle;

    .line 258
    .line 259
    iput-object v0, v7, Lbq2;->P:Lrq2;

    .line 260
    .line 261
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_8

    .line 266
    .line 267
    new-instance v6, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v9, "restoreSaveState: active ("

    .line 270
    .line 271
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget-object v9, v7, Lbq2;->A:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-static {v10, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    :cond_8
    iget-object v6, v0, Lrq2;->w:Ldq2;

    .line 293
    .line 294
    iget-object v6, v6, Ldq2;->M:Leq2;

    .line 295
    .line 296
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v12, v6}, Lwq2;->m(Ljava/lang/ClassLoader;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v12}, Lam6;->L(Lwq2;)V

    .line 304
    .line 305
    .line 306
    iget v6, v0, Lrq2;->v:I

    .line 307
    .line 308
    iput v6, v12, Lwq2;->e:I

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_9
    iget-object v2, v0, Lrq2;->O:Ltq2;

    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    iget-object v2, v2, Ltq2;->b:Ljava/util/HashMap;

    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    const/4 v6, 0x1

    .line 337
    if-eqz v4, :cond_c

    .line 338
    .line 339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    check-cast v4, Lbq2;

    .line 344
    .line 345
    iget-object v11, v4, Lbq2;->A:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v5, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    if-eqz v11, :cond_a

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_a
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_b

    .line 359
    .line 360
    new-instance v11, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v12, "Discarding retained Fragment "

    .line 363
    .line 364
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v12, " that was not found in the set of active Fragments "

    .line 371
    .line 372
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget-object v12, v1, Lsq2;->w:Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v11

    .line 384
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    .line 386
    .line 387
    :cond_b
    iget-object v11, v0, Lrq2;->O:Ltq2;

    .line 388
    .line 389
    invoke-virtual {v11, v4}, Ltq2;->h(Lbq2;)V

    .line 390
    .line 391
    .line 392
    iput-object v0, v4, Lbq2;->P:Lrq2;

    .line 393
    .line 394
    new-instance v11, Lwq2;

    .line 395
    .line 396
    invoke-direct {v11, v7, v3, v4}, Lwq2;-><init>(Ljz0;Lam6;Lbq2;)V

    .line 397
    .line 398
    .line 399
    iput v6, v11, Lwq2;->e:I

    .line 400
    .line 401
    invoke-virtual {v11}, Lwq2;->k()V

    .line 402
    .line 403
    .line 404
    iput-boolean v6, v4, Lbq2;->H:Z

    .line 405
    .line 406
    invoke-virtual {v11}, Lwq2;->k()V

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_c
    iget-object v2, v1, Lsq2;->x:Ljava/util/ArrayList;

    .line 411
    .line 412
    iget-object v4, v3, Lam6;->x:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v4, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 417
    .line 418
    .line 419
    if-eqz v2, :cond_f

    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eqz v4, :cond_f

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    check-cast v4, Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v3, v4}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    if-eqz v5, :cond_e

    .line 442
    .line 443
    invoke-static {v9}, Lrq2;->L(I)Z

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    if-eqz v7, :cond_d

    .line 448
    .line 449
    new-instance v7, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v11, "restoreSaveState: added ("

    .line 452
    .line 453
    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    .line 471
    .line 472
    :cond_d
    invoke-virtual {v3, v5}, Lam6;->j(Lbq2;)V

    .line 473
    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_e
    const-string v0, "No instantiated fragment for ("

    .line 477
    .line 478
    const-string v1, ")"

    .line 479
    .line 480
    invoke-static {v0, v4, v1}, Lf21;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_f
    iget-object v2, v1, Lsq2;->y:[Lr30;

    .line 489
    .line 490
    if-eqz v2, :cond_17

    .line 491
    .line 492
    new-instance v2, Ljava/util/ArrayList;

    .line 493
    .line 494
    iget-object v5, v1, Lsq2;->y:[Lr30;

    .line 495
    .line 496
    array-length v5, v5

    .line 497
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 498
    .line 499
    .line 500
    iput-object v2, v0, Lrq2;->d:Ljava/util/ArrayList;

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    :goto_6
    iget-object v5, v1, Lsq2;->y:[Lr30;

    .line 504
    .line 505
    array-length v7, v5

    .line 506
    if-ge v2, v7, :cond_16

    .line 507
    .line 508
    aget-object v5, v5, v2

    .line 509
    .line 510
    iget-object v7, v5, Lr30;->x:Ljava/util/ArrayList;

    .line 511
    .line 512
    new-instance v11, Lq30;

    .line 513
    .line 514
    invoke-direct {v11, v0}, Lq30;-><init>(Lrq2;)V

    .line 515
    .line 516
    .line 517
    iget-object v12, v5, Lr30;->w:[I

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v14, 0x0

    .line 521
    :goto_7
    array-length v15, v12

    .line 522
    if-ge v13, v15, :cond_12

    .line 523
    .line 524
    new-instance v15, Lar2;

    .line 525
    .line 526
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 527
    .line 528
    .line 529
    add-int/lit8 v16, v13, 0x1

    .line 530
    .line 531
    move/from16 p1, v9

    .line 532
    .line 533
    aget v9, v12, v13

    .line 534
    .line 535
    iput v9, v15, Lar2;->a:I

    .line 536
    .line 537
    invoke-static/range {p1 .. p1}, Lrq2;->L(I)Z

    .line 538
    .line 539
    .line 540
    move-result v9

    .line 541
    if-eqz v9, :cond_10

    .line 542
    .line 543
    new-instance v9, Ljava/lang/StringBuilder;

    .line 544
    .line 545
    const-string v4, "Instantiate "

    .line 546
    .line 547
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    const-string v4, " op #"

    .line 554
    .line 555
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v4, " base fragment #"

    .line 562
    .line 563
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    aget v4, v12, v16

    .line 567
    .line 568
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-static {v10, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 576
    .line 577
    .line 578
    :cond_10
    invoke-static {}, Lk54;->values()[Lk54;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iget-object v9, v5, Lr30;->y:[I

    .line 583
    .line 584
    aget v9, v9, v14

    .line 585
    .line 586
    aget-object v4, v4, v9

    .line 587
    .line 588
    iput-object v4, v15, Lar2;->h:Lk54;

    .line 589
    .line 590
    invoke-static {}, Lk54;->values()[Lk54;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    iget-object v9, v5, Lr30;->z:[I

    .line 595
    .line 596
    aget v9, v9, v14

    .line 597
    .line 598
    aget-object v4, v4, v9

    .line 599
    .line 600
    iput-object v4, v15, Lar2;->i:Lk54;

    .line 601
    .line 602
    add-int/lit8 v4, v13, 0x2

    .line 603
    .line 604
    aget v9, v12, v16

    .line 605
    .line 606
    if-eqz v9, :cond_11

    .line 607
    .line 608
    move v9, v6

    .line 609
    goto :goto_8

    .line 610
    :cond_11
    const/4 v9, 0x0

    .line 611
    :goto_8
    iput-boolean v9, v15, Lar2;->c:Z

    .line 612
    .line 613
    add-int/lit8 v9, v13, 0x3

    .line 614
    .line 615
    aget v4, v12, v4

    .line 616
    .line 617
    iput v4, v15, Lar2;->d:I

    .line 618
    .line 619
    add-int/lit8 v16, v13, 0x4

    .line 620
    .line 621
    aget v9, v12, v9

    .line 622
    .line 623
    iput v9, v15, Lar2;->e:I

    .line 624
    .line 625
    add-int/lit8 v18, v13, 0x5

    .line 626
    .line 627
    aget v6, v12, v16

    .line 628
    .line 629
    iput v6, v15, Lar2;->f:I

    .line 630
    .line 631
    add-int/lit8 v13, v13, 0x6

    .line 632
    .line 633
    move-object/from16 v16, v12

    .line 634
    .line 635
    aget v12, v16, v18

    .line 636
    .line 637
    iput v12, v15, Lar2;->g:I

    .line 638
    .line 639
    iput v4, v11, Lq30;->b:I

    .line 640
    .line 641
    iput v9, v11, Lq30;->c:I

    .line 642
    .line 643
    iput v6, v11, Lq30;->d:I

    .line 644
    .line 645
    iput v12, v11, Lq30;->e:I

    .line 646
    .line 647
    invoke-virtual {v11, v15}, Lq30;->b(Lar2;)V

    .line 648
    .line 649
    .line 650
    add-int/lit8 v14, v14, 0x1

    .line 651
    .line 652
    move/from16 v9, p1

    .line 653
    .line 654
    move-object/from16 v12, v16

    .line 655
    .line 656
    const/4 v6, 0x1

    .line 657
    goto/16 :goto_7

    .line 658
    .line 659
    :cond_12
    move/from16 p1, v9

    .line 660
    .line 661
    iget v4, v5, Lr30;->A:I

    .line 662
    .line 663
    iput v4, v11, Lq30;->f:I

    .line 664
    .line 665
    iget-object v4, v5, Lr30;->B:Ljava/lang/String;

    .line 666
    .line 667
    iput-object v4, v11, Lq30;->h:Ljava/lang/String;

    .line 668
    .line 669
    const/4 v4, 0x1

    .line 670
    iput-boolean v4, v11, Lq30;->g:Z

    .line 671
    .line 672
    iget v4, v5, Lr30;->D:I

    .line 673
    .line 674
    iput v4, v11, Lq30;->i:I

    .line 675
    .line 676
    iget-object v4, v5, Lr30;->E:Ljava/lang/CharSequence;

    .line 677
    .line 678
    iput-object v4, v11, Lq30;->j:Ljava/lang/CharSequence;

    .line 679
    .line 680
    iget v4, v5, Lr30;->F:I

    .line 681
    .line 682
    iput v4, v11, Lq30;->k:I

    .line 683
    .line 684
    iget-object v4, v5, Lr30;->G:Ljava/lang/CharSequence;

    .line 685
    .line 686
    iput-object v4, v11, Lq30;->l:Ljava/lang/CharSequence;

    .line 687
    .line 688
    iget-object v4, v5, Lr30;->H:Ljava/util/ArrayList;

    .line 689
    .line 690
    iput-object v4, v11, Lq30;->m:Ljava/util/ArrayList;

    .line 691
    .line 692
    iget-object v4, v5, Lr30;->I:Ljava/util/ArrayList;

    .line 693
    .line 694
    iput-object v4, v11, Lq30;->n:Ljava/util/ArrayList;

    .line 695
    .line 696
    iget-boolean v4, v5, Lr30;->J:Z

    .line 697
    .line 698
    iput-boolean v4, v11, Lq30;->o:Z

    .line 699
    .line 700
    iget v4, v5, Lr30;->C:I

    .line 701
    .line 702
    iput v4, v11, Lq30;->s:I

    .line 703
    .line 704
    const/4 v4, 0x0

    .line 705
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-ge v4, v5, :cond_14

    .line 710
    .line 711
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    check-cast v5, Ljava/lang/String;

    .line 716
    .line 717
    if-eqz v5, :cond_13

    .line 718
    .line 719
    iget-object v6, v11, Lq30;->a:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    check-cast v6, Lar2;

    .line 726
    .line 727
    invoke-virtual {v3, v5}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    iput-object v5, v6, Lar2;->b:Lbq2;

    .line 732
    .line 733
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 734
    .line 735
    goto :goto_9

    .line 736
    :cond_14
    const/4 v4, 0x1

    .line 737
    invoke-virtual {v11, v4}, Lq30;->c(I)V

    .line 738
    .line 739
    .line 740
    invoke-static/range {p1 .. p1}, Lrq2;->L(I)Z

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    if-eqz v5, :cond_15

    .line 745
    .line 746
    const-string v5, "restoreAllState: back stack #"

    .line 747
    .line 748
    const-string v6, " (index "

    .line 749
    .line 750
    invoke-static {v2, v5, v6}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    iget v6, v11, Lq30;->s:I

    .line 755
    .line 756
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 770
    .line 771
    .line 772
    new-instance v5, Lzb4;

    .line 773
    .line 774
    invoke-direct {v5}, Lzb4;-><init>()V

    .line 775
    .line 776
    .line 777
    new-instance v6, Ljava/io/PrintWriter;

    .line 778
    .line 779
    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 780
    .line 781
    .line 782
    const-string v5, "  "

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    invoke-virtual {v11, v5, v6, v7}, Lq30;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    .line 789
    .line 790
    .line 791
    goto :goto_a

    .line 792
    :cond_15
    const/4 v7, 0x0

    .line 793
    :goto_a
    iget-object v5, v0, Lrq2;->d:Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    add-int/lit8 v2, v2, 0x1

    .line 799
    .line 800
    move/from16 v9, p1

    .line 801
    .line 802
    move v6, v4

    .line 803
    goto/16 :goto_6

    .line 804
    .line 805
    :cond_16
    const/4 v7, 0x0

    .line 806
    goto :goto_b

    .line 807
    :cond_17
    const/4 v7, 0x0

    .line 808
    new-instance v2, Ljava/util/ArrayList;

    .line 809
    .line 810
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 811
    .line 812
    .line 813
    iput-object v2, v0, Lrq2;->d:Ljava/util/ArrayList;

    .line 814
    .line 815
    :goto_b
    iget-object v2, v0, Lrq2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 816
    .line 817
    iget v4, v1, Lsq2;->z:I

    .line 818
    .line 819
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 820
    .line 821
    .line 822
    iget-object v2, v1, Lsq2;->A:Ljava/lang/String;

    .line 823
    .line 824
    if-eqz v2, :cond_18

    .line 825
    .line 826
    invoke-virtual {v3, v2}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    iput-object v2, v0, Lrq2;->z:Lbq2;

    .line 831
    .line 832
    invoke-virtual {v0, v2}, Lrq2;->r(Lbq2;)V

    .line 833
    .line 834
    .line 835
    :cond_18
    iget-object v2, v1, Lsq2;->B:Ljava/util/ArrayList;

    .line 836
    .line 837
    if-eqz v2, :cond_19

    .line 838
    .line 839
    move v4, v7

    .line 840
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    if-ge v4, v3, :cond_19

    .line 845
    .line 846
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    check-cast v3, Ljava/lang/String;

    .line 851
    .line 852
    iget-object v5, v1, Lsq2;->C:Ljava/util/ArrayList;

    .line 853
    .line 854
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v5

    .line 858
    check-cast v5, Ls30;

    .line 859
    .line 860
    iget-object v6, v0, Lrq2;->l:Ljava/util/Map;

    .line 861
    .line 862
    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    add-int/lit8 v4, v4, 0x1

    .line 866
    .line 867
    goto :goto_c

    .line 868
    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 869
    .line 870
    iget-object v1, v1, Lsq2;->D:Ljava/util/ArrayList;

    .line 871
    .line 872
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 873
    .line 874
    .line 875
    iput-object v2, v0, Lrq2;->F:Ljava/util/ArrayDeque;

    .line 876
    .line 877
    return-void
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

.method public final Z()Landroid/os/Bundle;
    .locals 13

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lrq2;->F()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lrq2;->x()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Lrq2;->A(Z)Z

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Lrq2;->H:Z

    .line 17
    .line 18
    iget-object v2, p0, Lrq2;->O:Ltq2;

    .line 19
    .line 20
    iput-boolean v1, v2, Ltq2;->g:Z

    .line 21
    .line 22
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, v1, Lam6;->y:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x2

    .line 54
    if-eqz v4, :cond_9

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Lwq2;

    .line 61
    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    iget-object v7, v4, Lwq2;->c:Lbq2;

    .line 65
    .line 66
    iget-object v8, v7, Lbq2;->A:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v9, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v10, v4, Lwq2;->c:Lbq2;

    .line 74
    .line 75
    iget v11, v10, Lbq2;->w:I

    .line 76
    .line 77
    const/4 v12, -0x1

    .line 78
    if-ne v11, v12, :cond_1

    .line 79
    .line 80
    iget-object v11, v10, Lbq2;->x:Landroid/os/Bundle;

    .line 81
    .line 82
    if-eqz v11, :cond_1

    .line 83
    .line 84
    invoke-virtual {v9, v11}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    new-instance v11, Lvq2;

    .line 88
    .line 89
    invoke-direct {v11, v10}, Lvq2;-><init>(Lbq2;)V

    .line 90
    .line 91
    .line 92
    const-string v12, "state"

    .line 93
    .line 94
    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 95
    .line 96
    .line 97
    iget v11, v10, Lbq2;->w:I

    .line 98
    .line 99
    if-lez v11, :cond_7

    .line 100
    .line 101
    new-instance v11, Landroid/os/Bundle;

    .line 102
    .line 103
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v11}, Lbq2;->F(Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    if-nez v12, :cond_2

    .line 114
    .line 115
    const-string v12, "savedInstanceState"

    .line 116
    .line 117
    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    iget-object v12, v4, Lwq2;->a:Ljz0;

    .line 121
    .line 122
    invoke-virtual {v12, v10, v11, v5}, Ljz0;->z(Lbq2;Landroid/os/Bundle;Z)V

    .line 123
    .line 124
    .line 125
    new-instance v5, Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-object v11, v10, Lbq2;->p0:Lkg5;

    .line 131
    .line 132
    invoke-virtual {v11, v5}, Lkg5;->H(Landroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-nez v11, :cond_3

    .line 140
    .line 141
    const-string v11, "registryState"

    .line 142
    .line 143
    invoke-virtual {v9, v11, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    iget-object v5, v10, Lbq2;->R:Lrq2;

    .line 147
    .line 148
    invoke-virtual {v5}, Lrq2;->Z()Landroid/os/Bundle;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    if-nez v11, :cond_4

    .line 157
    .line 158
    const-string v11, "childFragmentManager"

    .line 159
    .line 160
    invoke-virtual {v9, v11, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget-object v5, v10, Lbq2;->c0:Landroid/view/View;

    .line 164
    .line 165
    if-eqz v5, :cond_5

    .line 166
    .line 167
    invoke-virtual {v4}, Lwq2;->o()V

    .line 168
    .line 169
    .line 170
    :cond_5
    iget-object v4, v10, Lbq2;->y:Landroid/util/SparseArray;

    .line 171
    .line 172
    if-eqz v4, :cond_6

    .line 173
    .line 174
    const-string v5, "viewState"

    .line 175
    .line 176
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 177
    .line 178
    .line 179
    :cond_6
    iget-object v4, v10, Lbq2;->z:Landroid/os/Bundle;

    .line 180
    .line 181
    if-eqz v4, :cond_7

    .line 182
    .line 183
    const-string v5, "viewRegistryState"

    .line 184
    .line 185
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 186
    .line 187
    .line 188
    :cond_7
    iget-object v4, v10, Lbq2;->B:Landroid/os/Bundle;

    .line 189
    .line 190
    if-eqz v4, :cond_8

    .line 191
    .line 192
    const-string v5, "arguments"

    .line 193
    .line 194
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    :cond_8
    invoke-virtual {v1, v8, v9}, Lam6;->R(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 198
    .line 199
    .line 200
    iget-object v4, v7, Lbq2;->A:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    invoke-static {v6}, Lrq2;->L(I)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_0

    .line 210
    .line 211
    const-string v4, "FragmentManager"

    .line 212
    .line 213
    new-instance v5, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v6, "Saved state of "

    .line 216
    .line 217
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v6, ": "

    .line 224
    .line 225
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    iget-object v6, v7, Lbq2;->x:Landroid/os/Bundle;

    .line 229
    .line 230
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_9
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 243
    .line 244
    iget-object v1, v1, Lam6;->z:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Ljava/util/HashMap;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_a

    .line 253
    .line 254
    invoke-static {v6}, Lrq2;->L(I)Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_13

    .line 259
    .line 260
    const-string p0, "FragmentManager"

    .line 261
    .line 262
    const-string v1, "saveAllState: no fragments!"

    .line 263
    .line 264
    invoke-static {p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :cond_a
    iget-object v3, p0, Lrq2;->c:Lam6;

    .line 269
    .line 270
    iget-object v4, v3, Lam6;->x:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v4, Ljava/util/ArrayList;

    .line 273
    .line 274
    monitor-enter v4

    .line 275
    :try_start_0
    iget-object v7, v3, Lam6;->x:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v7, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    const/4 v8, 0x0

    .line 284
    if-eqz v7, :cond_b

    .line 285
    .line 286
    monitor-exit v4

    .line 287
    move-object v7, v8

    .line 288
    goto :goto_2

    .line 289
    :catchall_0
    move-exception p0

    .line 290
    goto/16 :goto_6

    .line 291
    .line 292
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 293
    .line 294
    iget-object v9, v3, Lam6;->x:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v9, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 303
    .line 304
    .line 305
    iget-object v3, v3, Lam6;->x:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v3, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    :cond_c
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_d

    .line 318
    .line 319
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    check-cast v9, Lbq2;

    .line 324
    .line 325
    iget-object v10, v9, Lbq2;->A:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    invoke-static {v6}, Lrq2;->L(I)Z

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    if-eqz v10, :cond_c

    .line 335
    .line 336
    const-string v10, "FragmentManager"

    .line 337
    .line 338
    new-instance v11, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 341
    .line 342
    .line 343
    const-string v12, "saveAllState: adding fragment ("

    .line 344
    .line 345
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    iget-object v12, v9, Lbq2;->A:Ljava/lang/String;

    .line 349
    .line 350
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    const-string v12, "): "

    .line 354
    .line 355
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 366
    .line 367
    .line 368
    goto :goto_1

    .line 369
    :cond_d
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    :goto_2
    iget-object v3, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    if-lez v3, :cond_f

    .line 377
    .line 378
    new-array v4, v3, [Lr30;

    .line 379
    .line 380
    :goto_3
    if-ge v5, v3, :cond_10

    .line 381
    .line 382
    new-instance v9, Lr30;

    .line 383
    .line 384
    iget-object v10, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    check-cast v10, Lq30;

    .line 391
    .line 392
    invoke-direct {v9, v10}, Lr30;-><init>(Lq30;)V

    .line 393
    .line 394
    .line 395
    aput-object v9, v4, v5

    .line 396
    .line 397
    invoke-static {v6}, Lrq2;->L(I)Z

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    if-eqz v9, :cond_e

    .line 402
    .line 403
    const-string v9, "FragmentManager"

    .line 404
    .line 405
    const-string v10, "saveAllState: adding back stack #"

    .line 406
    .line 407
    const-string v11, ": "

    .line 408
    .line 409
    invoke-static {v5, v10, v11}, Lpb4;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    move-result-object v10

    .line 413
    iget-object v11, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 427
    .line 428
    .line 429
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 430
    .line 431
    goto :goto_3

    .line 432
    :cond_f
    move-object v4, v8

    .line 433
    :cond_10
    new-instance v3, Lsq2;

    .line 434
    .line 435
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 436
    .line 437
    .line 438
    iput-object v8, v3, Lsq2;->A:Ljava/lang/String;

    .line 439
    .line 440
    new-instance v5, Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 443
    .line 444
    .line 445
    iput-object v5, v3, Lsq2;->B:Ljava/util/ArrayList;

    .line 446
    .line 447
    new-instance v6, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    iput-object v6, v3, Lsq2;->C:Ljava/util/ArrayList;

    .line 453
    .line 454
    iput-object v2, v3, Lsq2;->w:Ljava/util/ArrayList;

    .line 455
    .line 456
    iput-object v7, v3, Lsq2;->x:Ljava/util/ArrayList;

    .line 457
    .line 458
    iput-object v4, v3, Lsq2;->y:[Lr30;

    .line 459
    .line 460
    iget-object v2, p0, Lrq2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 461
    .line 462
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    iput v2, v3, Lsq2;->z:I

    .line 467
    .line 468
    iget-object v2, p0, Lrq2;->z:Lbq2;

    .line 469
    .line 470
    if-eqz v2, :cond_11

    .line 471
    .line 472
    iget-object v2, v2, Lbq2;->A:Ljava/lang/String;

    .line 473
    .line 474
    iput-object v2, v3, Lsq2;->A:Ljava/lang/String;

    .line 475
    .line 476
    :cond_11
    iget-object v2, p0, Lrq2;->l:Ljava/util/Map;

    .line 477
    .line 478
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 483
    .line 484
    .line 485
    iget-object v2, p0, Lrq2;->l:Ljava/util/Map;

    .line 486
    .line 487
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 492
    .line 493
    .line 494
    new-instance v2, Ljava/util/ArrayList;

    .line 495
    .line 496
    iget-object v4, p0, Lrq2;->F:Ljava/util/ArrayDeque;

    .line 497
    .line 498
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 499
    .line 500
    .line 501
    iput-object v2, v3, Lsq2;->D:Ljava/util/ArrayList;

    .line 502
    .line 503
    const-string v2, "state"

    .line 504
    .line 505
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 506
    .line 507
    .line 508
    iget-object v2, p0, Lrq2;->m:Ljava/util/Map;

    .line 509
    .line 510
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    if-eqz v3, :cond_12

    .line 523
    .line 524
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    check-cast v3, Ljava/lang/String;

    .line 529
    .line 530
    const-string v4, "result_"

    .line 531
    .line 532
    invoke-static {v4, v3}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    iget-object v5, p0, Lrq2;->m:Ljava/util/Map;

    .line 537
    .line 538
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    check-cast v3, Landroid/os/Bundle;

    .line 543
    .line 544
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 545
    .line 546
    .line 547
    goto :goto_4

    .line 548
    :cond_12
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    if-eqz v2, :cond_13

    .line 561
    .line 562
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    check-cast v2, Ljava/lang/String;

    .line 567
    .line 568
    const-string v3, "fragment_"

    .line 569
    .line 570
    invoke-static {v3, v2}, Lb81;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    check-cast v2, Landroid/os/Bundle;

    .line 579
    .line 580
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 581
    .line 582
    .line 583
    goto :goto_5

    .line 584
    :cond_13
    return-object v0

    .line 585
    :goto_6
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 586
    throw p0
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
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method

.method public final a(Lbq2;)Lwq2;
    .locals 3

    .line 1
    iget-object v0, p1, Lbq2;->j0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lzq2;->c(Lbq2;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lrq2;->g(Lbq2;)Lwq2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Lbq2;->P:Lrq2;

    .line 39
    .line 40
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lam6;->L(Lwq2;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Lbq2;->X:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Lam6;->j(Lbq2;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Lbq2;->H:Z

    .line 54
    .line 55
    iget-object v2, p1, Lbq2;->c0:Landroid/view/View;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iput-boolean v1, p1, Lbq2;->g0:Z

    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, Lrq2;->M(Lbq2;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, Lrq2;->G:Z

    .line 69
    .line 70
    :cond_3
    return-object v0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final a0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 14
    .line 15
    iget-object v1, v1, Ldq2;->N:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lrq2;->P:Lge;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 23
    .line 24
    iget-object v1, v1, Ldq2;->N:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lrq2;->P:Lge;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
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

.method public final b(Ldq2;Lmp7;Lbq2;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 2
    .line 3
    if-nez v0, :cond_11

    .line 4
    .line 5
    iput-object p1, p0, Lrq2;->w:Ldq2;

    .line 6
    .line 7
    iput-object p2, p0, Lrq2;->x:Lmp7;

    .line 8
    .line 9
    iput-object p3, p0, Lrq2;->y:Lbq2;

    .line 10
    .line 11
    iget-object p2, p0, Lrq2;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lmq2;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lmq2;-><init>(Lbq2;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Lrq2;->y:Lbq2;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Ldq2;->P:Leq2;

    .line 39
    .line 40
    invoke-virtual {p2}, Lrv0;->b()Lv45;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lrq2;->g:Lv45;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Lrq2;->j:Lg30;

    .line 52
    .line 53
    invoke-virtual {p2, v1, v0}, Lv45;->a(Lg30;Lt54;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Lbq2;->P:Lrq2;

    .line 60
    .line 61
    iget-object p1, p1, Lrq2;->O:Ltq2;

    .line 62
    .line 63
    iget-object v0, p1, Ltq2;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, Lbq2;->A:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ltq2;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, Ltq2;

    .line 76
    .line 77
    iget-boolean p1, p1, Ltq2;->e:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, Ltq2;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Lbq2;->A:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, Lrq2;->O:Ltq2;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 93
    .line 94
    invoke-virtual {p1}, Lrv0;->g()Lz58;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v0, Lgb1;->b:Lgb1;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v1, Lno7;

    .line 104
    .line 105
    sget-object v2, Ltq2;->h:Ljo1;

    .line 106
    .line 107
    invoke-direct {v1, p1, v2, v0}, Lno7;-><init>(Lz58;Lw58;Lib1;)V

    .line 108
    .line 109
    .line 110
    const-class p1, Ltq2;

    .line 111
    .line 112
    sget-object v0, Lb26;->a:Lc26;

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p1}, Lgq3;->l()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v1, p1, v0}, Lno7;->b(Lgq3;Ljava/lang/String;)Lr58;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Ltq2;

    .line 135
    .line 136
    iput-object p1, p0, Lrq2;->O:Ltq2;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 140
    .line 141
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_8
    new-instance p1, Ltq2;

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ltq2;-><init>(Z)V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Lrq2;->O:Ltq2;

    .line 151
    .line 152
    :goto_2
    iget-object p1, p0, Lrq2;->O:Ltq2;

    .line 153
    .line 154
    invoke-virtual {p0}, Lrq2;->Q()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput-boolean v0, p1, Ltq2;->g:Z

    .line 159
    .line 160
    iget-object p1, p0, Lrq2;->c:Lam6;

    .line 161
    .line 162
    iget-object v0, p0, Lrq2;->O:Ltq2;

    .line 163
    .line 164
    iput-object v0, p1, Lam6;->A:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 167
    .line 168
    if-eqz p1, :cond_9

    .line 169
    .line 170
    if-nez p3, :cond_9

    .line 171
    .line 172
    invoke-virtual {p1}, Ldq2;->h()Lkg5;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v0, Llv0;

    .line 177
    .line 178
    const/4 v1, 0x3

    .line 179
    invoke-direct {v0, v1, p0}, Llv0;-><init>(ILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    const-string v1, "android:support:fragments"

    .line 183
    .line 184
    invoke-virtual {p1, v1, v0}, Lkg5;->K(Ljava/lang/String;Lgf6;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v1}, Lkg5;->i(Ljava/lang/String;)Landroid/os/Bundle;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    if-eqz p1, :cond_9

    .line 192
    .line 193
    invoke-virtual {p0, p1}, Lrq2;->Y(Landroid/os/Bundle;)V

    .line 194
    .line 195
    .line 196
    :cond_9
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 197
    .line 198
    if-eqz p1, :cond_b

    .line 199
    .line 200
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 201
    .line 202
    iget-object p1, p1, Lrv0;->E:Lpv0;

    .line 203
    .line 204
    if-eqz p3, :cond_a

    .line 205
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    iget-object v1, p3, Lbq2;->A:Ljava/lang/String;

    .line 212
    .line 213
    const-string v2, ":"

    .line 214
    .line 215
    invoke-static {v0, v1, v2}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto :goto_3

    .line 220
    :cond_a
    const-string v0, ""

    .line 221
    .line 222
    :goto_3
    const-string v1, "FragmentManager:"

    .line 223
    .line 224
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const-string v1, "StartActivityForResult"

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    new-instance v2, Ls8;

    .line 235
    .line 236
    const/4 v3, 0x4

    .line 237
    invoke-direct {v2, p2, v3}, Ls8;-><init>(ZI)V

    .line 238
    .line 239
    .line 240
    new-instance v3, Lns8;

    .line 241
    .line 242
    const/16 v4, 0x17

    .line 243
    .line 244
    invoke-direct {v3, v4, p0}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v1, v2, v3}, Lpv0;->c(Ljava/lang/String;Lhj8;Lr8;)La9;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    iput-object v1, p0, Lrq2;->C:La9;

    .line 252
    .line 253
    const-string v1, "StartIntentSenderForResult"

    .line 254
    .line 255
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    new-instance v2, Ls8;

    .line 260
    .line 261
    const/4 v3, 0x5

    .line 262
    invoke-direct {v2, v3}, Ls8;-><init>(I)V

    .line 263
    .line 264
    .line 265
    new-instance v3, Lf96;

    .line 266
    .line 267
    const/16 v5, 0x16

    .line 268
    .line 269
    invoke-direct {v3, v5, p0}, Lf96;-><init>(ILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v1, v2, v3}, Lpv0;->c(Ljava/lang/String;Lhj8;Lr8;)La9;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iput-object v1, p0, Lrq2;->D:La9;

    .line 277
    .line 278
    const-string v1, "RequestPermissions"

    .line 279
    .line 280
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    new-instance v1, Ls8;

    .line 285
    .line 286
    const/4 v2, 0x2

    .line 287
    invoke-direct {v1, p2, v2}, Ls8;-><init>(ZI)V

    .line 288
    .line 289
    .line 290
    new-instance p2, Lji8;

    .line 291
    .line 292
    invoke-direct {p2, v4, p0}, Lji8;-><init>(ILjava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v0, v1, p2}, Lpv0;->c(Ljava/lang/String;Lhj8;Lr8;)La9;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iput-object p1, p0, Lrq2;->E:La9;

    .line 300
    .line 301
    :cond_b
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 302
    .line 303
    if-eqz p1, :cond_c

    .line 304
    .line 305
    iget-object p2, p0, Lrq2;->q:Ljq2;

    .line 306
    .line 307
    invoke-virtual {p1, p2}, Ldq2;->i(Lv31;)V

    .line 308
    .line 309
    .line 310
    :cond_c
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 311
    .line 312
    if-eqz p1, :cond_d

    .line 313
    .line 314
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 315
    .line 316
    iget-object p2, p0, Lrq2;->r:Ljq2;

    .line 317
    .line 318
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    iget-object p1, p1, Lrv0;->G:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 322
    .line 323
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    :cond_d
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 327
    .line 328
    if-eqz p1, :cond_e

    .line 329
    .line 330
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 331
    .line 332
    iget-object p2, p0, Lrq2;->s:Ljq2;

    .line 333
    .line 334
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object p1, p1, Lrv0;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 338
    .line 339
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_e
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 343
    .line 344
    if-eqz p1, :cond_f

    .line 345
    .line 346
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 347
    .line 348
    iget-object p2, p0, Lrq2;->t:Ljq2;

    .line 349
    .line 350
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    iget-object p1, p1, Lrv0;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 354
    .line 355
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    :cond_f
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 359
    .line 360
    if-eqz p1, :cond_10

    .line 361
    .line 362
    if-nez p3, :cond_10

    .line 363
    .line 364
    iget-object p1, p1, Ldq2;->P:Leq2;

    .line 365
    .line 366
    iget-object p0, p0, Lrq2;->u:Lkq2;

    .line 367
    .line 368
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object p1, p1, Lrv0;->y:Lcf4;

    .line 372
    .line 373
    iget-object p2, p1, Lcf4;->y:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 376
    .line 377
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    iget-object p0, p1, Lcf4;->x:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast p0, Ljava/lang/Runnable;

    .line 383
    .line 384
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 385
    .line 386
    .line 387
    :cond_10
    return-void

    .line 388
    :cond_11
    const-string p0, "Already attached"

    .line 389
    .line 390
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-void
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
.end method

.method public final b0(Lbq2;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lrq2;->H(Lbq2;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p1, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final c(Lbq2;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Lbq2;->X:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Lbq2;->X:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lbq2;->G:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lam6;->j(Lbq2;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lrq2;->L(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lrq2;->M(Lbq2;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Lrq2;->G:Z

    .line 74
    .line 75
    :cond_2
    return-void
    .line 76
.end method

.method public final c0(Lbq2;Lk54;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lbq2;->A:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p1, Lbq2;->Q:Ldq2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p1, Lbq2;->P:Lrq2;

    .line 16
    .line 17
    if-ne v0, p0, :cond_1

    .line 18
    .line 19
    :cond_0
    iput-object p2, p1, Lbq2;->k0:Lk54;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const-string p2, "Fragment "

    .line 23
    .line 24
    const-string v0, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {p2, p1, v0, p0}, Lta1;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
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

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lrq2;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d0(Lbq2;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lbq2;->A:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p1, Lbq2;->Q:Ldq2;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Lbq2;->P:Lrq2;

    .line 18
    .line 19
    if-ne v0, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "Fragment "

    .line 23
    .line 24
    const-string v1, " is not an active fragment of FragmentManager "

    .line 25
    .line 26
    invoke-static {v0, p1, v1, p0}, Lta1;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lrq2;->z:Lbq2;

    .line 31
    .line 32
    iput-object p1, p0, Lrq2;->z:Lbq2;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lrq2;->r(Lbq2;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lrq2;->z:Lbq2;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lrq2;->r(Lbq2;)V

    .line 40
    .line 41
    .line 42
    return-void
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

.method public final e()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 7
    .line 8
    invoke-virtual {v1}, Lam6;->C()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lwq2;

    .line 27
    .line 28
    iget-object v2, v2, Lwq2;->c:Lbq2;

    .line 29
    .line 30
    iget-object v2, v2, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lrq2;->J()Lme6;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x7f0901de

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    instance-of v5, v4, Lun1;

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    check-cast v4, Lun1;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v4, Lun1;

    .line 56
    .line 57
    invoke-direct {v4, v2}, Lun1;-><init>(Landroid/view/ViewGroup;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-object v0
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
.end method

.method public final e0(Lbq2;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lrq2;->H(Lbq2;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_7

    .line 6
    .line 7
    iget-object v0, p1, Lbq2;->f0:Laq2;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v2, v0, Laq2;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    move v3, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v3, v0, Laq2;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v3, v2

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move v2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v2, v0, Laq2;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v2, v3

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v0, v0, Laq2;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v0, v2

    .line 37
    if-lez v0, :cond_7

    .line 38
    .line 39
    const v0, 0x7f09023b

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lbq2;

    .line 56
    .line 57
    iget-object p1, p1, Lbq2;->f0:Laq2;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v1, p1, Laq2;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, p0, Lbq2;->f0:Laq2;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {p0}, Lbq2;->j()Laq2;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iput-boolean v1, p0, Laq2;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
    .line 76
.end method

.method public final f(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p2, p3, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lq30;

    .line 13
    .line 14
    iget-object v1, v1, Lq30;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lar2;

    .line 31
    .line 32
    iget-object v2, v2, Lar2;->b:Lbq2;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v2, v2, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-static {v2, p0}, Lun1;->i(Landroid/view/ViewGroup;Lrq2;)Lun1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
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
.end method

.method public final g(Lbq2;)Lwq2;
    .locals 3

    .line 1
    iget-object v0, p1, Lbq2;->A:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 4
    .line 5
    iget-object v2, v1, Lam6;->y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lwq2;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Lwq2;

    .line 19
    .line 20
    iget-object v2, p0, Lrq2;->o:Ljz0;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Lwq2;-><init>(Ljz0;Lam6;Lbq2;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lrq2;->w:Ldq2;

    .line 26
    .line 27
    iget-object p1, p1, Ldq2;->M:Leq2;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Lwq2;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lrq2;->v:I

    .line 37
    .line 38
    iput p0, v0, Lwq2;->e:I

    .line 39
    .line 40
    return-object v0
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

.method public final g0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrq2;->c:Lam6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lam6;->C()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lwq2;

    .line 22
    .line 23
    iget-object v2, v1, Lwq2;->c:Lbq2;

    .line 24
    .line 25
    iget-boolean v3, v2, Lbq2;->d0:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Lrq2;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lrq2;->K:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Lbq2;->d0:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Lwq2;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
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

.method public final h(Lbq2;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Lbq2;->X:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Lbq2;->X:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Lbq2;->G:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Lrq2;->L(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lrq2;->c:Lam6;

    .line 62
    .line 63
    iget-object v1, v0, Lam6;->x:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Lam6;->x:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Lbq2;->G:Z

    .line 78
    .line 79
    invoke-static {p1}, Lrq2;->M(Lbq2;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Lrq2;->G:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lrq2;->e0(Lbq2;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p0

    .line 94
    :cond_3
    return-void
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
.end method

.method public final h0(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Lzb4;

    .line 16
    .line 17
    invoke-direct {v0}, Lzb4;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array p0, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Ldq2;->P:Leq2;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, p0}, Leq2;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, Lrq2;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception p0

    .line 55
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
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

.method public final i(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lrq2;->h0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 21
    .line 22
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lbq2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lbq2;->a0:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lrq2;->i(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
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

.method public final i0()V
    .locals 5

    .line 1
    const-string v0, "FragmentManager "

    .line 2
    .line 3
    iget-object v1, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x1

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Lrq2;->j:Lg30;

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Lg30;->e(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Lrq2;->L(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const-string v2, "FragmentManager"

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, " enabling OnBackPressedCallback, caused by non-empty pending actions"

    .line 38
    .line 39
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :goto_0
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object v0, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Lrq2;->h:Lq30;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v1, v2

    .line 69
    :goto_1
    add-int/2addr v0, v1

    .line 70
    if-lez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Lrq2;->y:Lbq2;

    .line 73
    .line 74
    invoke-static {v0}, Lrq2;->P(Lbq2;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move v4, v2

    .line 82
    :goto_2
    invoke-static {v3}, Lrq2;->L(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    const-string v0, "FragmentManager"

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "OnBackPressedCallback for FragmentManager "

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, " enabled state is "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_4
    iget-object p0, p0, Lrq2;->j:Lg30;

    .line 116
    .line 117
    invoke-virtual {p0, v4}, Lg30;->e(Z)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    throw p0
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

.method public final j()Z
    .locals 4

    .line 1
    iget v0, p0, Lrq2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 9
    .line 10
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lbq2;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lbq2;->W:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lrq2;->j()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
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

.method public final k()Z
    .locals 7

    .line 1
    iget v0, p0, Lrq2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lrq2;->c:Lam6;

    .line 9
    .line 10
    invoke-virtual {v0}, Lam6;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lbq2;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lrq2;->O(Lbq2;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Lbq2;->W:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Lbq2;->R:Lrq2;

    .line 45
    .line 46
    invoke-virtual {v6}, Lrq2;->k()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lbq2;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
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
.end method

.method public final l()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lrq2;->J:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lrq2;->A(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lrq2;->x()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 11
    .line 12
    iget-object v2, p0, Lrq2;->c:Lam6;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v2, Lam6;->A:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ltq2;

    .line 19
    .line 20
    iget-boolean v0, v0, Ltq2;->f:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v1, Ldq2;->M:Leq2;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    xor-int/2addr v0, v1

    .line 32
    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lrq2;->l:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ls30;

    .line 55
    .line 56
    iget-object v1, v1, Ls30;->w:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v4, v2, Lam6;->A:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ltq2;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual {v4, v3, v5}, Ltq2;->f(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 v0, -0x1

    .line 84
    invoke-virtual {p0, v0}, Lrq2;->u(I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    iget-object v0, v0, Ldq2;->P:Leq2;

    .line 92
    .line 93
    iget-object v1, p0, Lrq2;->r:Ljq2;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lrv0;->G:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    iget-object v1, p0, Lrq2;->q:Ljq2;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ldq2;->j(Lv31;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    iget-object v0, v0, Ldq2;->P:Leq2;

    .line 117
    .line 118
    iget-object v1, p0, Lrq2;->s:Ljq2;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Lrv0;->I:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :cond_6
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 129
    .line 130
    if-eqz v0, :cond_7

    .line 131
    .line 132
    iget-object v0, v0, Ldq2;->P:Leq2;

    .line 133
    .line 134
    iget-object v1, p0, Lrq2;->t:Ljq2;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v0, v0, Lrv0;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_7
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    iget-object v1, p0, Lrq2;->y:Lbq2;

    .line 149
    .line 150
    if-nez v1, :cond_9

    .line 151
    .line 152
    iget-object v0, v0, Ldq2;->P:Leq2;

    .line 153
    .line 154
    iget-object v1, p0, Lrq2;->u:Lkq2;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v0, v0, Lrv0;->y:Lcf4;

    .line 160
    .line 161
    iget-object v2, v0, Lcf4;->y:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 164
    .line 165
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, Lcf4;->z:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Ljava/util/HashMap;

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-nez v1, :cond_8

    .line 177
    .line 178
    iget-object v0, v0, Lcf4;->x:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Ljava/lang/Runnable;

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    invoke-static {}, Lku4;->a()V

    .line 187
    .line 188
    .line 189
    :cond_9
    :goto_2
    const/4 v0, 0x0

    .line 190
    iput-object v0, p0, Lrq2;->w:Ldq2;

    .line 191
    .line 192
    iput-object v0, p0, Lrq2;->x:Lmp7;

    .line 193
    .line 194
    iput-object v0, p0, Lrq2;->y:Lbq2;

    .line 195
    .line 196
    iget-object v1, p0, Lrq2;->g:Lv45;

    .line 197
    .line 198
    if-eqz v1, :cond_a

    .line 199
    .line 200
    iget-object v1, p0, Lrq2;->j:Lg30;

    .line 201
    .line 202
    invoke-virtual {v1}, Lg30;->d()V

    .line 203
    .line 204
    .line 205
    iput-object v0, p0, Lrq2;->g:Lv45;

    .line 206
    .line 207
    :cond_a
    iget-object v0, p0, Lrq2;->C:La9;

    .line 208
    .line 209
    if-eqz v0, :cond_b

    .line 210
    .line 211
    invoke-virtual {v0}, La9;->e0()V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lrq2;->D:La9;

    .line 215
    .line 216
    invoke-virtual {v0}, La9;->e0()V

    .line 217
    .line 218
    .line 219
    iget-object p0, p0, Lrq2;->E:La9;

    .line 220
    .line 221
    invoke-virtual {p0}, La9;->e0()V

    .line 222
    .line 223
    .line 224
    :cond_b
    return-void
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
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lrq2;->h0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 21
    .line 22
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lbq2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Lbq2;->a0:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lrq2;->m(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
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

.method public final n(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lrq2;->h0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 21
    .line 22
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lbq2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lrq2;->n(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
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

.method public final o()V
    .locals 1

    .line 1
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lam6;->D()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lbq2;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lbq2;->u()Z

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 29
    .line 30
    invoke-virtual {v0}, Lrq2;->o()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
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

.method public final p()Z
    .locals 4

    .line 1
    iget v0, p0, Lrq2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 9
    .line 10
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lbq2;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Lbq2;->W:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lrq2;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
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

.method public final q()V
    .locals 2

    .line 1
    iget v0, p0, Lrq2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 8
    .line 9
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lbq2;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v0, Lbq2;->W:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 36
    .line 37
    invoke-virtual {v0}, Lrq2;->q()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
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

.method public final r(Lbq2;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p1, Lbq2;->A:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eq p1, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p1, Lbq2;->P:Lrq2;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lrq2;->P(Lbq2;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    iget-object v0, p1, Lbq2;->F:Ljava/lang/Boolean;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eq v0, p0, :cond_2

    .line 32
    .line 33
    :cond_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iput-object p0, p1, Lbq2;->F:Ljava/lang/Boolean;

    .line 38
    .line 39
    iget-object p0, p1, Lbq2;->R:Lrq2;

    .line 40
    .line 41
    invoke-virtual {p0}, Lrq2;->i0()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lrq2;->z:Lbq2;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lrq2;->r(Lbq2;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    return-void
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

.method public final s(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lrq2;->h0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 21
    .line 22
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lbq2;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Lbq2;->R:Lrq2;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lrq2;->s(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
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

.method public final t()Z
    .locals 5

    .line 1
    iget v0, p0, Lrq2;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Lrq2;->c:Lam6;

    .line 9
    .line 10
    invoke-virtual {p0}, Lam6;->G()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move v0, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lbq2;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Lrq2;->O(Lbq2;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget-boolean v4, v3, Lbq2;->W:Z

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v3, v3, Lbq2;->R:Lrq2;

    .line 44
    .line 45
    invoke-virtual {v3}, Lrq2;->t()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v3, v1

    .line 51
    :goto_1
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lrq2;->y:Lbq2;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lrq2;->y:Lbq2;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lrq2;->w:Ldq2;

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string p0, "null"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string p0, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
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

.method public final u(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lrq2;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lrq2;->c:Lam6;

    .line 6
    .line 7
    iget-object v2, v2, Lam6;->y:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lwq2;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Lwq2;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lrq2;->R(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lrq2;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lun1;

    .line 58
    .line 59
    invoke-virtual {v2}, Lun1;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Lrq2;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lrq2;->A(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lrq2;->b:Z

    .line 72
    .line 73
    throw p1
    .line 74
    .line 75
    .line 76
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrq2;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lrq2;->K:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lrq2;->g0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public final w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lrq2;->c:Lam6;

    .line 8
    .line 9
    iget-object v2, v1, Lam6;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, Lam6;->y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v4, :cond_1b

    .line 29
    .line 30
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "Active Fragments:"

    .line 34
    .line 35
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1b

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lwq2;

    .line 57
    .line 58
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    if-eqz v4, :cond_1a

    .line 62
    .line 63
    iget-object v4, v4, Lwq2;->c:Lbq2;

    .line 64
    .line 65
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v6, "mFragmentId=#"

    .line 75
    .line 76
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget v6, v4, Lbq2;->T:I

    .line 80
    .line 81
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v6, " mContainerId=#"

    .line 89
    .line 90
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget v6, v4, Lbq2;->U:I

    .line 94
    .line 95
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v6, " mTag="

    .line 103
    .line 104
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v6, v4, Lbq2;->V:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v6, "mState="

    .line 116
    .line 117
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget v6, v4, Lbq2;->w:I

    .line 121
    .line 122
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 123
    .line 124
    .line 125
    const-string v6, " mWho="

    .line 126
    .line 127
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v6, v4, Lbq2;->A:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v6, " mBackStackNesting="

    .line 136
    .line 137
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget v6, v4, Lbq2;->O:I

    .line 141
    .line 142
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v6, "mAdded="

    .line 149
    .line 150
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v6, v4, Lbq2;->G:Z

    .line 154
    .line 155
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v6, " mRemoving="

    .line 159
    .line 160
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v6, v4, Lbq2;->H:Z

    .line 164
    .line 165
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    const-string v6, " mFromLayout="

    .line 169
    .line 170
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-boolean v6, v4, Lbq2;->J:Z

    .line 174
    .line 175
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 176
    .line 177
    .line 178
    const-string v6, " mInLayout="

    .line 179
    .line 180
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-boolean v6, v4, Lbq2;->K:Z

    .line 184
    .line 185
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v6, "mHidden="

    .line 192
    .line 193
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-boolean v6, v4, Lbq2;->W:Z

    .line 197
    .line 198
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 199
    .line 200
    .line 201
    const-string v6, " mDetached="

    .line 202
    .line 203
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-boolean v6, v4, Lbq2;->X:Z

    .line 207
    .line 208
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 209
    .line 210
    .line 211
    const-string v6, " mMenuVisible="

    .line 212
    .line 213
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-boolean v6, v4, Lbq2;->Z:Z

    .line 217
    .line 218
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 219
    .line 220
    .line 221
    const-string v6, " mHasMenu="

    .line 222
    .line 223
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "mRetainInstance="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Lbq2;->Y:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mUserVisibleHint="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v6, v4, Lbq2;->e0:Z

    .line 248
    .line 249
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v4, Lbq2;->P:Lrq2;

    .line 253
    .line 254
    if-eqz v6, :cond_0

    .line 255
    .line 256
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v6, "mFragmentManager="

    .line 260
    .line 261
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v6, v4, Lbq2;->P:Lrq2;

    .line 265
    .line 266
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    iget-object v6, v4, Lbq2;->Q:Ldq2;

    .line 270
    .line 271
    if-eqz v6, :cond_1

    .line 272
    .line 273
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v6, "mHost="

    .line 277
    .line 278
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, Lbq2;->Q:Ldq2;

    .line 282
    .line 283
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1
    iget-object v6, v4, Lbq2;->S:Lbq2;

    .line 287
    .line 288
    if-eqz v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v6, "mParentFragment="

    .line 294
    .line 295
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v6, v4, Lbq2;->S:Lbq2;

    .line 299
    .line 300
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v6, v4, Lbq2;->B:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_3

    .line 306
    .line 307
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v6, "mArguments="

    .line 311
    .line 312
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v6, v4, Lbq2;->B:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_3
    iget-object v6, v4, Lbq2;->x:Landroid/os/Bundle;

    .line 321
    .line 322
    if-eqz v6, :cond_4

    .line 323
    .line 324
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "mSavedFragmentState="

    .line 328
    .line 329
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v6, v4, Lbq2;->x:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_4
    iget-object v6, v4, Lbq2;->y:Landroid/util/SparseArray;

    .line 338
    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v6, "mSavedViewState="

    .line 345
    .line 346
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v4, Lbq2;->y:Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_5
    iget-object v6, v4, Lbq2;->z:Landroid/os/Bundle;

    .line 355
    .line 356
    if-eqz v6, :cond_6

    .line 357
    .line 358
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "mSavedViewRegistryState="

    .line 362
    .line 363
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, v4, Lbq2;->z:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_6
    iget-object v6, v4, Lbq2;->C:Lbq2;

    .line 372
    .line 373
    if-eqz v6, :cond_7

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :cond_7
    iget-object v6, v4, Lbq2;->P:Lrq2;

    .line 377
    .line 378
    if-eqz v6, :cond_8

    .line 379
    .line 380
    iget-object v7, v4, Lbq2;->D:Ljava/lang/String;

    .line 381
    .line 382
    if-eqz v7, :cond_8

    .line 383
    .line 384
    iget-object v6, v6, Lrq2;->c:Lam6;

    .line 385
    .line 386
    invoke-virtual {v6, v7}, Lam6;->y(Ljava/lang/String;)Lbq2;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    goto :goto_1

    .line 391
    :cond_8
    const/4 v6, 0x0

    .line 392
    :goto_1
    if-eqz v6, :cond_9

    .line 393
    .line 394
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-string v7, "mTarget="

    .line 398
    .line 399
    invoke-virtual {p3, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    const-string v6, " mTargetRequestCode="

    .line 406
    .line 407
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    iget v6, v4, Lbq2;->E:I

    .line 411
    .line 412
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 413
    .line 414
    .line 415
    :cond_9
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const-string v6, "mPopDirection="

    .line 419
    .line 420
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 424
    .line 425
    if-nez v6, :cond_a

    .line 426
    .line 427
    move v6, v5

    .line 428
    goto :goto_2

    .line 429
    :cond_a
    iget-boolean v6, v6, Laq2;->a:Z

    .line 430
    .line 431
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 432
    .line 433
    .line 434
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 435
    .line 436
    if-nez v6, :cond_b

    .line 437
    .line 438
    move v6, v5

    .line 439
    goto :goto_3

    .line 440
    :cond_b
    iget v6, v6, Laq2;->b:I

    .line 441
    .line 442
    :goto_3
    if-eqz v6, :cond_d

    .line 443
    .line 444
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    const-string v6, "getEnterAnim="

    .line 448
    .line 449
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 453
    .line 454
    if-nez v6, :cond_c

    .line 455
    .line 456
    move v6, v5

    .line 457
    goto :goto_4

    .line 458
    :cond_c
    iget v6, v6, Laq2;->b:I

    .line 459
    .line 460
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 461
    .line 462
    .line 463
    :cond_d
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 464
    .line 465
    if-nez v6, :cond_e

    .line 466
    .line 467
    move v6, v5

    .line 468
    goto :goto_5

    .line 469
    :cond_e
    iget v6, v6, Laq2;->c:I

    .line 470
    .line 471
    :goto_5
    if-eqz v6, :cond_10

    .line 472
    .line 473
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    const-string v6, "getExitAnim="

    .line 477
    .line 478
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 482
    .line 483
    if-nez v6, :cond_f

    .line 484
    .line 485
    move v6, v5

    .line 486
    goto :goto_6

    .line 487
    :cond_f
    iget v6, v6, Laq2;->c:I

    .line 488
    .line 489
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 490
    .line 491
    .line 492
    :cond_10
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 493
    .line 494
    if-nez v6, :cond_11

    .line 495
    .line 496
    move v6, v5

    .line 497
    goto :goto_7

    .line 498
    :cond_11
    iget v6, v6, Laq2;->d:I

    .line 499
    .line 500
    :goto_7
    if-eqz v6, :cond_13

    .line 501
    .line 502
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    const-string v6, "getPopEnterAnim="

    .line 506
    .line 507
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 511
    .line 512
    if-nez v6, :cond_12

    .line 513
    .line 514
    move v6, v5

    .line 515
    goto :goto_8

    .line 516
    :cond_12
    iget v6, v6, Laq2;->d:I

    .line 517
    .line 518
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 519
    .line 520
    .line 521
    :cond_13
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 522
    .line 523
    if-nez v6, :cond_14

    .line 524
    .line 525
    move v6, v5

    .line 526
    goto :goto_9

    .line 527
    :cond_14
    iget v6, v6, Laq2;->e:I

    .line 528
    .line 529
    :goto_9
    if-eqz v6, :cond_16

    .line 530
    .line 531
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    const-string v6, "getPopExitAnim="

    .line 535
    .line 536
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iget-object v6, v4, Lbq2;->f0:Laq2;

    .line 540
    .line 541
    if-nez v6, :cond_15

    .line 542
    .line 543
    move v6, v5

    .line 544
    goto :goto_a

    .line 545
    :cond_15
    iget v6, v6, Laq2;->e:I

    .line 546
    .line 547
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 548
    .line 549
    .line 550
    :cond_16
    iget-object v6, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 551
    .line 552
    if-eqz v6, :cond_17

    .line 553
    .line 554
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    const-string v6, "mContainer="

    .line 558
    .line 559
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    iget-object v6, v4, Lbq2;->b0:Landroid/view/ViewGroup;

    .line 563
    .line 564
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_17
    iget-object v6, v4, Lbq2;->c0:Landroid/view/View;

    .line 568
    .line 569
    if-eqz v6, :cond_18

    .line 570
    .line 571
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    const-string v6, "mView="

    .line 575
    .line 576
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    iget-object v6, v4, Lbq2;->c0:Landroid/view/View;

    .line 580
    .line 581
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_18
    invoke-virtual {v4}, Lbq2;->n()Landroid/content/Context;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    if-eqz v6, :cond_19

    .line 589
    .line 590
    invoke-static {v4}, Lhv2;->N0(Lt54;)Lhv2;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-virtual {v6, v3, p3}, Lhv2;->F0(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 595
    .line 596
    .line 597
    :cond_19
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    new-instance v6, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    const-string v7, "Child "

    .line 603
    .line 604
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    iget-object v7, v4, Lbq2;->R:Lrq2;

    .line 608
    .line 609
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    const-string v7, ":"

    .line 613
    .line 614
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    iget-object v4, v4, Lbq2;->R:Lrq2;

    .line 625
    .line 626
    const-string v6, "  "

    .line 627
    .line 628
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v6

    .line 632
    invoke-virtual {v4, v6, p2, p3, p4}, Lrq2;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :cond_1a
    const-string v4, "null"

    .line 638
    .line 639
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    goto/16 :goto_0

    .line 643
    .line 644
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 645
    .line 646
    .line 647
    move-result p2

    .line 648
    if-lez p2, :cond_1c

    .line 649
    .line 650
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    const-string p4, "Added Fragments:"

    .line 654
    .line 655
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    move p4, v5

    .line 659
    :goto_b
    if-ge p4, p2, :cond_1c

    .line 660
    .line 661
    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    check-cast v1, Lbq2;

    .line 666
    .line 667
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    const-string v3, "  #"

    .line 671
    .line 672
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 676
    .line 677
    .line 678
    const-string v3, ": "

    .line 679
    .line 680
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1}, Lbq2;->toString()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    add-int/lit8 p4, p4, 0x1

    .line 691
    .line 692
    goto :goto_b

    .line 693
    :cond_1c
    iget-object p2, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 694
    .line 695
    if-eqz p2, :cond_1d

    .line 696
    .line 697
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 698
    .line 699
    .line 700
    move-result p2

    .line 701
    if-lez p2, :cond_1d

    .line 702
    .line 703
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    const-string p4, "Fragments Created Menus:"

    .line 707
    .line 708
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    move p4, v5

    .line 712
    :goto_c
    if-ge p4, p2, :cond_1d

    .line 713
    .line 714
    iget-object v1, p0, Lrq2;->e:Ljava/util/ArrayList;

    .line 715
    .line 716
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    check-cast v1, Lbq2;

    .line 721
    .line 722
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    const-string v2, "  #"

    .line 726
    .line 727
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 731
    .line 732
    .line 733
    const-string v2, ": "

    .line 734
    .line 735
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, Lbq2;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    add-int/lit8 p4, p4, 0x1

    .line 746
    .line 747
    goto :goto_c

    .line 748
    :cond_1d
    iget-object p2, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 749
    .line 750
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 751
    .line 752
    .line 753
    move-result p2

    .line 754
    if-lez p2, :cond_1e

    .line 755
    .line 756
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    const-string p4, "Back Stack:"

    .line 760
    .line 761
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    move p4, v5

    .line 765
    :goto_d
    if-ge p4, p2, :cond_1e

    .line 766
    .line 767
    iget-object v1, p0, Lrq2;->d:Ljava/util/ArrayList;

    .line 768
    .line 769
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    check-cast v1, Lq30;

    .line 774
    .line 775
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    const-string v2, "  #"

    .line 779
    .line 780
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 784
    .line 785
    .line 786
    const-string v2, ": "

    .line 787
    .line 788
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1}, Lq30;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    const/4 v2, 0x1

    .line 799
    invoke-virtual {v1, v0, p3, v2}, Lq30;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 800
    .line 801
    .line 802
    add-int/lit8 p4, p4, 0x1

    .line 803
    .line 804
    goto :goto_d

    .line 805
    :cond_1e
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    new-instance p2, Ljava/lang/StringBuilder;

    .line 809
    .line 810
    const-string p4, "Back Stack Index: "

    .line 811
    .line 812
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    iget-object p4, p0, Lrq2;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 816
    .line 817
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 818
    .line 819
    .line 820
    move-result p4

    .line 821
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object p2

    .line 828
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    iget-object p2, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 832
    .line 833
    monitor-enter p2

    .line 834
    :try_start_0
    iget-object p4, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 835
    .line 836
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 837
    .line 838
    .line 839
    move-result p4

    .line 840
    if-lez p4, :cond_1f

    .line 841
    .line 842
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    const-string v0, "Pending Actions:"

    .line 846
    .line 847
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    :goto_e
    if-ge v5, p4, :cond_1f

    .line 851
    .line 852
    iget-object v0, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 853
    .line 854
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    check-cast v0, Loq2;

    .line 859
    .line 860
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    const-string v1, "  #"

    .line 864
    .line 865
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 869
    .line 870
    .line 871
    const-string v1, ": "

    .line 872
    .line 873
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    add-int/lit8 v5, v5, 0x1

    .line 880
    .line 881
    goto :goto_e

    .line 882
    :catchall_0
    move-exception p0

    .line 883
    goto :goto_f

    .line 884
    :cond_1f
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 885
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    const-string p2, "FragmentManager misc state:"

    .line 889
    .line 890
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    const-string p2, "  mHost="

    .line 897
    .line 898
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    iget-object p2, p0, Lrq2;->w:Ldq2;

    .line 902
    .line 903
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    const-string p2, "  mContainer="

    .line 910
    .line 911
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    iget-object p2, p0, Lrq2;->x:Lmp7;

    .line 915
    .line 916
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    iget-object p2, p0, Lrq2;->y:Lbq2;

    .line 920
    .line 921
    if-eqz p2, :cond_20

    .line 922
    .line 923
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    const-string p2, "  mParent="

    .line 927
    .line 928
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    iget-object p2, p0, Lrq2;->y:Lbq2;

    .line 932
    .line 933
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    :cond_20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    const-string p2, "  mCurState="

    .line 940
    .line 941
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    iget p2, p0, Lrq2;->v:I

    .line 945
    .line 946
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 947
    .line 948
    .line 949
    const-string p2, " mStateSaved="

    .line 950
    .line 951
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    iget-boolean p2, p0, Lrq2;->H:Z

    .line 955
    .line 956
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 957
    .line 958
    .line 959
    const-string p2, " mStopped="

    .line 960
    .line 961
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    iget-boolean p2, p0, Lrq2;->I:Z

    .line 965
    .line 966
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 967
    .line 968
    .line 969
    const-string p2, " mDestroyed="

    .line 970
    .line 971
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    iget-boolean p2, p0, Lrq2;->J:Z

    .line 975
    .line 976
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 977
    .line 978
    .line 979
    iget-boolean p2, p0, Lrq2;->G:Z

    .line 980
    .line 981
    if-eqz p2, :cond_21

    .line 982
    .line 983
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    const-string p1, "  mNeedMenuInvalidate="

    .line 987
    .line 988
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    iget-boolean p0, p0, Lrq2;->G:Z

    .line 992
    .line 993
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    .line 994
    .line 995
    .line 996
    :cond_21
    return-void

    .line 997
    :goto_f
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 998
    throw p0
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

.method public final x()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrq2;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lun1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lun1;->h()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
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

.method public final y(Loq2;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Lrq2;->J:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-virtual {p0}, Lrq2;->Q()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 31
    .line 32
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    :goto_0
    iget-object v0, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    if-eqz p2, :cond_4

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "Activity has been destroyed"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_5
    iget-object p2, p0, Lrq2;->a:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lrq2;->a0()V

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
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
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lrq2;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lrq2;->w:Ldq2;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Lrq2;->J:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lrq2;->w:Ldq2;

    .line 30
    .line 31
    iget-object v1, v1, Ldq2;->N:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Lrq2;->Q()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    :goto_0
    iget-object p1, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lrq2;->L:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance p1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lrq2;->M:Ljava/util/ArrayList;

    .line 71
    .line 72
    :cond_4
    return-void

    .line 73
    :cond_5
    const-string p0, "Must be called from main thread of fragment host"

    .line 74
    .line 75
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_6
    const-string p0, "FragmentManager is already executing transactions"

    .line 80
    .line 81
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
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
.end method
