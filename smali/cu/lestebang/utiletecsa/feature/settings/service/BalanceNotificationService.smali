.class public final Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;
.super Landroid/app/Service;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "gr8",
        "settings"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final E:Ld37;


# instance fields
.field public A:Lnz7;

.field public B:Lvp6;

.field public C:Lrg5;

.field public final D:Lig0;

.field public volatile w:Lyl6;

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Lk40;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {v0}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->E:Ld37;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->y:Z

    .line 13
    .line 14
    invoke-static {}, Lb85;->d()Lw77;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Law1;->a:Ldn1;

    .line 19
    .line 20
    sget-object v1, Lpe4;->a:Lgy2;

    .line 21
    .line 22
    iget-object v1, v1, Lgy2;->B:Lgy2;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->D:Lig0;

    .line 33
    .line 34
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

.method public static final b(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Laz7;ILh61;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lh40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lh40;

    .line 7
    .line 8
    iget v1, v0, Lh40;->H:I

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
    iput v1, v0, Lh40;->H:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lh40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lh40;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lh40;->F:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lh40;->H:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    iget p1, v0, Lh40;->E:I

    .line 36
    .line 37
    iget p2, v0, Lh40;->D:I

    .line 38
    .line 39
    iget v1, v0, Lh40;->C:I

    .line 40
    .line 41
    iget v4, v0, Lh40;->B:I

    .line 42
    .line 43
    iget-object v5, v0, Lh40;->A:Ljava/util/Iterator;

    .line 44
    .line 45
    iget-object v6, v0, Lh40;->z:Ljava/util/Collection;

    .line 46
    .line 47
    check-cast v6, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p3, Ljava/lang/Integer;

    .line 64
    .line 65
    const v1, 0x7f090177

    .line 66
    .line 67
    .line 68
    invoke-direct {p3, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lyb5;

    .line 72
    .line 73
    invoke-direct {v1, p3, p1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Ljava/lang/Integer;

    .line 77
    .line 78
    const p3, 0x7f090173

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p3}, Ljava/lang/Integer;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance p3, Lyb5;

    .line 85
    .line 86
    sget-object v4, Laz7;->D:Laz7;

    .line 87
    .line 88
    invoke-direct {p3, p1, v4}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ljava/lang/Integer;

    .line 92
    .line 93
    const v4, 0x7f090179

    .line 94
    .line 95
    .line 96
    invoke-direct {p1, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 97
    .line 98
    .line 99
    new-instance v4, Lyb5;

    .line 100
    .line 101
    sget-object v5, Laz7;->E:Laz7;

    .line 102
    .line 103
    invoke-direct {v4, p1, v5}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Ljava/lang/Integer;

    .line 107
    .line 108
    const v5, 0x7f09017b

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 112
    .line 113
    .line 114
    new-instance v5, Lyb5;

    .line 115
    .line 116
    sget-object v6, Laz7;->F:Laz7;

    .line 117
    .line 118
    invoke-direct {v5, p1, v6}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    filled-new-array {v1, p3, v4, v5}, [Lyb5;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/lang/Iterable;

    .line 134
    .line 135
    new-instance p3, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/4 v1, 0x0

    .line 145
    move-object v5, p1

    .line 146
    move p1, p2

    .line 147
    move-object v6, p3

    .line 148
    :goto_1
    move p2, v1

    .line 149
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-eqz p3, :cond_c

    .line 154
    .line 155
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    add-int/lit8 v1, p2, 0x1

    .line 160
    .line 161
    if-ltz p2, :cond_b

    .line 162
    .line 163
    check-cast p3, Ljava/util/Map$Entry;

    .line 164
    .line 165
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    check-cast v4, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    check-cast p3, Laz7;

    .line 180
    .line 181
    iget-object v7, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->A:Lnz7;

    .line 182
    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    invoke-virtual {v7, p3}, Lnz7;->b(Laz7;)Lc6;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    move-object v7, v6

    .line 190
    check-cast v7, Ljava/util/Collection;

    .line 191
    .line 192
    iput-object v7, v0, Lh40;->z:Ljava/util/Collection;

    .line 193
    .line 194
    iput-object v5, v0, Lh40;->A:Ljava/util/Iterator;

    .line 195
    .line 196
    iput p1, v0, Lh40;->B:I

    .line 197
    .line 198
    iput v1, v0, Lh40;->C:I

    .line 199
    .line 200
    iput p2, v0, Lh40;->D:I

    .line 201
    .line 202
    iput v4, v0, Lh40;->E:I

    .line 203
    .line 204
    iput v2, v0, Lh40;->H:I

    .line 205
    .line 206
    invoke-static {p3, v0}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p3

    .line 210
    sget-object v7, Lp81;->w:Lp81;

    .line 211
    .line 212
    if-ne p3, v7, :cond_3

    .line 213
    .line 214
    return-object v7

    .line 215
    :cond_3
    move v10, v4

    .line 216
    move v4, p1

    .line 217
    move p1, v10

    .line 218
    :goto_2
    check-cast p3, Lvy7;

    .line 219
    .line 220
    if-eqz p3, :cond_8

    .line 221
    .line 222
    iget-object p3, p3, Lvy7;->c:Ljava/lang/String;

    .line 223
    .line 224
    if-nez p3, :cond_4

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_4
    new-instance v7, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-direct {v7, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 230
    .line 231
    .line 232
    add-int/2addr p2, v2

    .line 233
    iget-object p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->C:Lrg5;

    .line 234
    .line 235
    if-eqz p1, :cond_7

    .line 236
    .line 237
    const-string p1, "#"

    .line 238
    .line 239
    const-string v8, "%23"

    .line 240
    .line 241
    invoke-static {p3, p1, v8}, Lk57;->s0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    const-string p3, "tel:"

    .line 246
    .line 247
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    const-string p3, "android.permission.CALL_PHONE"

    .line 256
    .line 257
    invoke-static {p0, p3}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result p3

    .line 261
    const/high16 v8, 0x10000000

    .line 262
    .line 263
    if-nez p3, :cond_5

    .line 264
    .line 265
    new-instance p3, Landroid/content/Intent;

    .line 266
    .line 267
    const-string v9, "android.intent.action.DIAL"

    .line 268
    .line 269
    invoke-direct {p3, v9, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p3, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_5
    new-instance p3, Landroid/content/Intent;

    .line 281
    .line 282
    const-string v9, "android.intent.action.CALL"

    .line 283
    .line 284
    invoke-direct {p3, v9, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p3, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static {p0, v4}, Lrg5;->f(Landroid/content/Context;I)Landroid/telecom/PhoneAccountHandle;

    .line 295
    .line 296
    .line 297
    move-result-object p3

    .line 298
    if-eqz p3, :cond_6

    .line 299
    .line 300
    const-string v8, "android.telecom.extra.PHONE_ACCOUNT_HANDLE"

    .line 301
    .line 302
    invoke-virtual {p1, v8, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 303
    .line 304
    .line 305
    :cond_6
    :goto_3
    const/high16 p3, 0xc000000

    .line 306
    .line 307
    invoke-static {p0, p2, p1, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    new-instance p2, Lyb5;

    .line 312
    .line 313
    invoke-direct {p2, v7, p1}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_7
    const-string p0, "phoneActionManager"

    .line 318
    .line 319
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v3

    .line 323
    :cond_8
    :goto_4
    move-object p2, v3

    .line 324
    :goto_5
    if-eqz p2, :cond_9

    .line 325
    .line 326
    invoke-interface {v6, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    :cond_9
    move p1, v4

    .line 330
    goto/16 :goto_1

    .line 331
    .line 332
    :cond_a
    const-string p0, "ussdRepository"

    .line 333
    .line 334
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v3

    .line 338
    :cond_b
    invoke-static {}, Lsg3;->Z()V

    .line 339
    .line 340
    .line 341
    throw v3

    .line 342
    :cond_c
    check-cast v6, Ljava/util/List;

    .line 343
    .line 344
    invoke-static {v6}, Lsf4;->a0(Ljava/util/List;)Ljava/util/Map;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    return-object p0
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

.method public static final d(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Landroid/widget/RemoteViews;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/RemoteViews;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p6}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const-string p6, "--"

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    move-object p1, p6

    .line 19
    :cond_0
    const p0, 0x7f090178

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    move-object p2, p6

    .line 32
    :cond_1
    const p0, 0x7f090174

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p0, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p3}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    move-object p3, p6

    .line 45
    :cond_2
    const p0, 0x7f09017a

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p4}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    move-object p4, p6

    .line 58
    :cond_3
    const p0, 0x7f09017c

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0, p4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/util/Map$Entry;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Landroid/app/PendingIntent;

    .line 99
    .line 100
    invoke-virtual {v0, p2, p1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    return-object v0
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
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->w:Lyl6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->w:Lyl6;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyl6;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lyl6;-><init>(Landroid/app/Service;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->w:Lyl6;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->w:Lyl6;

    .line 27
    .line 28
    invoke-virtual {p0}, Lyl6;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/app/Notification;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/high16 v2, 0xc000000

    .line 17
    .line 18
    invoke-static {p0, v7, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    move-object v8, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    new-instance v9, Ld15;

    .line 27
    .line 28
    const-string v1, "BalanceNotificationChannel"

    .line 29
    .line 30
    invoke-direct {v9, p0, v1}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 38
    .line 39
    iget-object v2, v9, Ld15;->y:Landroid/app/Notification;

    .line 40
    .line 41
    iput v1, v2, Landroid/app/Notification;->icon:I

    .line 42
    .line 43
    new-instance v1, Lf15;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v9, v1}, Ld15;->e(Lin8;)V

    .line 49
    .line 50
    .line 51
    const v6, 0x7f0c0070

    .line 52
    .line 53
    .line 54
    move-object v0, p0

    .line 55
    move-object v1, p1

    .line 56
    move-object v2, p2

    .line 57
    move-object v3, p3

    .line 58
    move-object v4, p4

    .line 59
    move-object v5, p5

    .line 60
    invoke-static/range {v0 .. v6}, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->d(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Landroid/widget/RemoteViews;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    iput-object v6, v9, Ld15;->u:Landroid/widget/RemoteViews;

    .line 65
    .line 66
    const v6, 0x7f0c006f

    .line 67
    .line 68
    .line 69
    invoke-static/range {v0 .. v6}, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->d(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Landroid/widget/RemoteViews;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, v9, Ld15;->v:Landroid/widget/RemoteViews;

    .line 74
    .line 75
    iput-object v8, v9, Ld15;->g:Landroid/app/PendingIntent;

    .line 76
    .line 77
    const/4 v0, -0x1

    .line 78
    iput v0, v9, Ld15;->k:I

    .line 79
    .line 80
    const/4 v0, 0x2

    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-virtual {v9, v0, v1}, Ld15;->c(IZ)V

    .line 83
    .line 84
    .line 85
    const/16 v0, 0x8

    .line 86
    .line 87
    invoke-virtual {v9, v0, v1}, Ld15;->c(IZ)V

    .line 88
    .line 89
    .line 90
    iput-boolean v7, v9, Ld15;->l:Z

    .line 91
    .line 92
    invoke-virtual {v9}, Ld15;->a()Landroid/app/Notification;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    return-object v0
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
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->y:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lj40;

    .line 13
    .line 14
    check-cast v0, Lsd1;

    .line 15
    .line 16
    iget-object v0, v0, Lsd1;->a:Lvd1;

    .line 17
    .line 18
    iget-object v1, v0, Lvd1;->s:Llu5;

    .line 19
    .line 20
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk40;

    .line 25
    .line 26
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->z:Lk40;

    .line 27
    .line 28
    iget-object v1, v0, Lvd1;->m:Llu5;

    .line 29
    .line 30
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lnz7;

    .line 35
    .line 36
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->A:Lnz7;

    .line 37
    .line 38
    iget-object v1, v0, Lvd1;->x:Llu5;

    .line 39
    .line 40
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lvp6;

    .line 45
    .line 46
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->B:Lvp6;

    .line 47
    .line 48
    iget-object v0, v0, Lvd1;->P:Llu5;

    .line 49
    .line 50
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lrg5;

    .line 55
    .line 56
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->C:Lrg5;

    .line 57
    .line 58
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 59
    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final onCreate()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->e()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f110047

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const-string v2, "BalanceNotificationChannel"

    .line 9
    .line 10
    const v3, 0x7f110048

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v2, v3, v0, v1}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 14
    .line 15
    .line 16
    const-string v8, "--"

    .line 17
    .line 18
    sget-object v9, Lb42;->w:Lb42;

    .line 19
    .line 20
    const-string v5, "--"

    .line 21
    .line 22
    const-string v6, "--"

    .line 23
    .line 24
    const-string v7, "--"

    .line 25
    .line 26
    move-object v4, p0

    .line 27
    invoke-virtual/range {v4 .. v9}, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/app/Notification;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v1, 0x22

    .line 34
    .line 35
    if-lt v0, v1, :cond_0

    .line 36
    .line 37
    invoke-static {v4, p0}, Lnd;->t(Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;Landroid/app/Notification;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const v0, 0x31771

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v0, p0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance p0, Lot;

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {p0, v4, v1, v0}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    iget-object v2, v4, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->D:Lig0;

    .line 56
    .line 57
    invoke-static {v2, v1, v1, p0, v0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 58
    .line 59
    .line 60
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    sget-object v0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->E:Ld37;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1, p0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    return-void
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

.method public final onDestroy()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->E:Ld37;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/BalanceNotificationService;->D:Lig0;

    .line 13
    .line 14
    invoke-static {v0, v2}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    const/4 p0, 0x1

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
.end method
