.class public final synthetic Lnf1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lnf1;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final b()Ljava/lang/Object;
    .locals 10

    .line 1
    iget p0, p0, Lnf1;->w:I

    .line 2
    .line 3
    const-class v0, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    .line 4
    .line 5
    const-class v1, Lkotlinx/datetime/DateTimeUnit$DayBased;

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    sget-object v5, Lvs7;->a:Lvs7;

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    packed-switch p0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance p0, Ld45;

    .line 20
    .line 21
    new-instance v0, Lc45;

    .line 22
    .line 23
    invoke-direct {v0}, Lc45;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Ld45;-><init>(Lc45;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    new-instance p0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    new-instance p0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    new-instance p0, Liz0;

    .line 49
    .line 50
    invoke-direct {p0}, Liz0;-><init>()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "CompositionLocal LocalHostDefaultProvider not present"

    .line 57
    .line 58
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :pswitch_5
    sget-object p0, Lt13;->a:Ljava/util/List;

    .line 63
    .line 64
    return-object v5

    .line 65
    :pswitch_6
    const-string p0, ""

    .line 66
    .line 67
    invoke-static {p0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_7
    invoke-static {}, Lcu/lestebang/utiletecsa/feature/home/navigation/HomeNavGraph;->a()Lzr3;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_8
    invoke-static {}, Lcu/lestebang/utiletecsa/feature/home/navigation/Home;->a()Lzr3;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_9
    new-instance p0, Lxw2;

    .line 83
    .line 84
    invoke-direct {p0, v3, v4, v2}, Lxw2;-><init>(JI)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_a
    invoke-static {}, Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;->a()Lzr3;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_b
    invoke-static {}, Lio/github/jan/supabase/storage/vectors/data/GetVectorOptions;->a()Lzr3;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_c
    invoke-static {}, Lio/ktor/util/date/GMTDate;->a()Lzr3;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_d
    invoke-static {}, Lio/ktor/util/date/GMTDate;->b()Lzr3;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_e
    :try_start_0
    sget-object p0, Lir2;->x:[Ljava/lang/String;

    .line 109
    .line 110
    sget-object p0, Lir2;->z:Lnz3;

    .line 111
    .line 112
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Ljava/lang/reflect/Method;

    .line 117
    .line 118
    if-eqz p0, :cond_0

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-eqz p0, :cond_0

    .line 125
    .line 126
    const-string v0, "beginTransaction"

    .line 127
    .line 128
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 129
    .line 130
    const-class v2, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 131
    .line 132
    const-class v3, Landroid/os/CancellationSignal;

    .line 133
    .line 134
    filled-new-array {v1, v2, v1, v3}, [Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    :catchall_0
    :cond_0
    return-object v7

    .line 143
    :pswitch_f
    :try_start_1
    const-class p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 144
    .line 145
    const-string v0, "getThreadSession"

    .line 146
    .line 147
    invoke-virtual {p0, v0, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    .line 153
    .line 154
    move-object v7, p0

    .line 155
    :catchall_1
    return-object v7

    .line 156
    :pswitch_10
    invoke-static {}, Lcu/lestebang/utiletecsa/feature/forum/navigation/Forum;->a()Lzr3;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    return-object p0

    .line 161
    :pswitch_11
    sget-object p0, Lxk4;->a:Lz97;

    .line 162
    .line 163
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Ljava/util/List;

    .line 168
    .line 169
    invoke-static {p0}, Ldt0;->o0(Ljava/lang/Iterable;)Lts;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    new-instance v0, Lf81;

    .line 174
    .line 175
    const/16 v1, 0x1c

    .line 176
    .line 177
    invoke-direct {v0, v1}, Lf81;-><init>(I)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lwl7;

    .line 181
    .line 182
    invoke-direct {v1, p0, v0}, Lwl7;-><init>(Lal6;Lvr2;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, Ltc2;->b(Lal6;)Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_12
    invoke-static {}, Lrg3;->k()Lfm0;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    sget-object v0, Lxk4;->a:Lz97;

    .line 195
    .line 196
    invoke-virtual {v0}, Lz97;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Ljava/util/List;

    .line 201
    .line 202
    invoke-static {v0}, Ldt0;->o0(Ljava/lang/Iterable;)Lts;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0}, Ltc2;->b(Lal6;)Ljava/util/LinkedHashMap;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {p0, v0}, Lfm0;->putAll(Ljava/util/Map;)V

    .line 211
    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_13
    sget p0, Lmy1;->a:F

    .line 215
    .line 216
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_14
    sget p0, Lmy1;->a:F

    .line 220
    .line 221
    return-object v5

    .line 222
    :pswitch_15
    const-string p0, "io.ktor.client.plugins.SaveBody"

    .line 223
    .line 224
    invoke-static {p0}, Lfc4;->b(Ljava/lang/String;)Lcc4;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_16
    invoke-static {}, Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;->a()Lzr3;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :pswitch_17
    new-array p0, v8, [Lll6;

    .line 235
    .line 236
    const-string v1, "kotlinx.datetime.DayBased"

    .line 237
    .line 238
    invoke-static {v1}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-nez v0, :cond_1

    .line 243
    .line 244
    new-instance v5, Lnq0;

    .line 245
    .line 246
    invoke-direct {v5, v1}, Lnq0;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lue3;->a:Lue3;

    .line 250
    .line 251
    sget-object v0, Lue3;->b:Lpo5;

    .line 252
    .line 253
    const-string v2, "days"

    .line 254
    .line 255
    invoke-virtual {v5, v2, v0, v8}, Lnq0;->a(Ljava/lang/String;Lll6;Z)V

    .line 256
    .line 257
    .line 258
    new-instance v0, Lnl6;

    .line 259
    .line 260
    sget-object v2, Ln57;->l:Ln57;

    .line 261
    .line 262
    iget-object v3, v5, Lnq0;->c:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    invoke-static {p0}, Lqs;->p1([Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-direct/range {v0 .. v5}, Lnl6;-><init>(Ljava/lang/String;Ln85;ILjava/util/List;Lnq0;)V

    .line 273
    .line 274
    .line 275
    move-object v7, v0

    .line 276
    goto :goto_0

    .line 277
    :cond_1
    const-string p0, "Blank serial names are prohibited"

    .line 278
    .line 279
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :goto_0
    return-object v7

    .line 283
    :pswitch_18
    new-instance p0, Lci6;

    .line 284
    .line 285
    sget-object v2, Lb26;->a:Lc26;

    .line 286
    .line 287
    const-class v3, Lkotlinx/datetime/DateTimeUnit;

    .line 288
    .line 289
    invoke-virtual {v2, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-virtual {v2, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-virtual {v2, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const-class v4, Lkotlinx/datetime/DateTimeUnit$TimeBased;

    .line 302
    .line 303
    invoke-virtual {v2, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const/4 v4, 0x3

    .line 308
    new-array v5, v4, [Lgq3;

    .line 309
    .line 310
    aput-object v1, v5, v8

    .line 311
    .line 312
    aput-object v0, v5, v9

    .line 313
    .line 314
    aput-object v2, v5, v6

    .line 315
    .line 316
    new-array v0, v4, [Lzr3;

    .line 317
    .line 318
    sget-object v1, Lgj1;->a:Lgj1;

    .line 319
    .line 320
    aput-object v1, v0, v8

    .line 321
    .line 322
    sget-object v1, Lbm4;->a:Lbm4;

    .line 323
    .line 324
    aput-object v1, v0, v9

    .line 325
    .line 326
    sget-object v1, Ldi7;->a:Ldi7;

    .line 327
    .line 328
    aput-object v1, v0, v6

    .line 329
    .line 330
    const-string v1, "kotlinx.datetime.DateTimeUnit"

    .line 331
    .line 332
    invoke-direct {p0, v1, v3, v5, v0}, Lci6;-><init>(Ljava/lang/String;Lgq3;[Lgq3;[Lzr3;)V

    .line 333
    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_19
    sget-object p0, Lgi1;->a:Lpa5;

    .line 337
    .line 338
    const/4 p0, 0x0

    .line 339
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    return-object p0

    .line 344
    :pswitch_1a
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-static {p0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    return-object p0

    .line 351
    :pswitch_1b
    new-instance p0, Lhf7;

    .line 352
    .line 353
    invoke-direct {p0, v2, v3, v4, v7}, Lhf7;-><init>(IJLjava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-static {p0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    return-object p0

    .line 361
    :pswitch_1c
    new-instance p0, Lci6;

    .line 362
    .line 363
    sget-object v2, Lb26;->a:Lc26;

    .line 364
    .line 365
    const-class v3, Lkotlinx/datetime/DateTimeUnit$DateBased;

    .line 366
    .line 367
    invoke-virtual {v2, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-virtual {v2, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v2, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    new-array v2, v6, [Lgq3;

    .line 380
    .line 381
    aput-object v1, v2, v8

    .line 382
    .line 383
    aput-object v0, v2, v9

    .line 384
    .line 385
    new-array v0, v6, [Lzr3;

    .line 386
    .line 387
    sget-object v1, Lgj1;->a:Lgj1;

    .line 388
    .line 389
    aput-object v1, v0, v8

    .line 390
    .line 391
    sget-object v1, Lbm4;->a:Lbm4;

    .line 392
    .line 393
    aput-object v1, v0, v9

    .line 394
    .line 395
    const-string v1, "kotlinx.datetime.DateTimeUnit.DateBased"

    .line 396
    .line 397
    invoke-direct {p0, v1, v3, v2, v0}, Lci6;-><init>(Ljava/lang/String;Lgq3;[Lgq3;[Lzr3;)V

    .line 398
    .line 399
    .line 400
    return-object p0

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
