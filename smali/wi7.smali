.class public final synthetic Lwi7;
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
    iput p1, p0, Lwi7;->w:I

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

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Lwi7;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lwi7;->w:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lsf8;->a()Ljava/time/format/DateTimeFormatter;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance p0, Lqf8;

    .line 16
    .line 17
    new-instance v0, Lns8;

    .line 18
    .line 19
    invoke-direct {v0, v2}, Lns8;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0}, Lqf8;-><init>(Lns8;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lti1;->f(Lti1;)V

    .line 26
    .line 27
    .line 28
    const/16 v0, 0x2d

    .line 29
    .line 30
    invoke-static {p0, v0}, Lar7;->l(Lui1;C)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lti1;->h(Lti1;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lni1;

    .line 37
    .line 38
    invoke-interface {p0}, Le1;->build()Llh0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0, v3}, Lni1;-><init>(Llh0;I)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`"

    .line 49
    .line 50
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_2
    new-instance p0, Lkw5;

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lkw5;-><init>(I)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    :try_start_0
    const-class p0, Lz98;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    new-instance v1, Lie6;

    .line 69
    .line 70
    new-instance v2, Lns8;

    .line 71
    .line 72
    invoke-direct {v2, p0}, Lns8;-><init>(Ljava/lang/ClassLoader;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v1, p0, v2}, Lie6;-><init>(Ljava/lang/ClassLoader;Lns8;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v1, v0

    .line 80
    :goto_0
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {v1}, Lie6;->a()Landroidx/window/extensions/layout/WindowLayoutComponent;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    new-instance v2, Lns8;

    .line 89
    .line 90
    invoke-direct {v2, p0}, Lns8;-><init>(Ljava/lang/ClassLoader;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lma2;->a()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    const/16 v4, 0x9

    .line 98
    .line 99
    if-lt p0, v4, :cond_1

    .line 100
    .line 101
    new-instance p0, Lja2;

    .line 102
    .line 103
    invoke-direct {p0, v1, v2}, Lha2;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;Lns8;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    move-object v0, p0

    .line 107
    goto :goto_2

    .line 108
    :cond_1
    const/4 v4, 0x6

    .line 109
    if-lt p0, v4, :cond_2

    .line 110
    .line 111
    new-instance p0, Lia2;

    .line 112
    .line 113
    invoke-direct {p0, v1, v2}, Lha2;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;Lns8;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    const/4 v4, 0x2

    .line 118
    if-lt p0, v4, :cond_3

    .line 119
    .line 120
    new-instance p0, Lha2;

    .line 121
    .line 122
    invoke-direct {p0, v1, v2}, Lha2;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;Lns8;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    if-ne p0, v3, :cond_4

    .line 127
    .line 128
    new-instance p0, Lga2;

    .line 129
    .line 130
    invoke-direct {p0, v1, v2}, Lga2;-><init>(Landroidx/window/extensions/layout/WindowLayoutComponent;Lns8;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    new-instance p0, Lea2;

    .line 135
    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catchall_0
    :cond_5
    :goto_2
    return-object v0

    .line 141
    :pswitch_4
    new-instance p0, Lc45;

    .line 142
    .line 143
    invoke-direct {p0}, Lc45;-><init>()V

    .line 144
    .line 145
    .line 146
    const-wide/16 v0, 0x14

    .line 147
    .line 148
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 149
    .line 150
    invoke-virtual {p0, v0, v1, v2}, Lc45;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 151
    .line 152
    .line 153
    const-wide/16 v0, 0x1e

    .line 154
    .line 155
    invoke-static {v0, v1, v2}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    iput v0, p0, Lc45;->y:I

    .line 160
    .line 161
    new-instance v0, Ld45;

    .line 162
    .line 163
    invoke-direct {v0, p0}, Ld45;-><init>(Lc45;)V

    .line 164
    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_5
    invoke-static {}, Lcu/lestebang/utiletecsa/feature/home/navigation/Vpn;->a()Lzr3;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :pswitch_6
    invoke-static {}, Lio/github/jan/supabase/storage/vectors/index/VectorIndex;->a()Lzr3;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_7
    invoke-static {}, Lio/github/jan/supabase/storage/vectors/index/VectorIndex;->b()Lzr3;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :pswitch_8
    invoke-static {}, Lh08;->g()Ljava/time/format/DateTimeFormatterBuilder;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, Lpc7;->t(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Lh08;->p(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {p0}, Lh08;->f(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatter;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_9
    invoke-static {}, Lh08;->g()Ljava/time/format/DateTimeFormatterBuilder;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, Lpc7;->t(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p0}, Lh08;->n(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, Lh08;->f(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatter;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_a
    invoke-static {}, Lh08;->g()Ljava/time/format/DateTimeFormatterBuilder;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {p0}, Lpc7;->t(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-static {p0}, Lh08;->h(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatterBuilder;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {p0}, Lh08;->f(Ljava/time/format/DateTimeFormatterBuilder;)Ljava/time/format/DateTimeFormatter;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    return-object p0

    .line 233
    :pswitch_b
    new-instance p0, Ld08;

    .line 234
    .line 235
    new-instance v0, Lns8;

    .line 236
    .line 237
    invoke-direct {v0, v2}, Lns8;-><init>(I)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p0, v0}, Ld08;-><init>(Lns8;)V

    .line 241
    .line 242
    .line 243
    invoke-static {p0}, Lsi1;->m(Lsi1;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p0}, Lsi1;->l(Lsi1;)V

    .line 247
    .line 248
    .line 249
    new-instance v0, Le08;

    .line 250
    .line 251
    invoke-interface {p0}, Le1;->build()Llh0;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-direct {v0, p0}, Le08;-><init>(Llh0;)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_c
    new-instance p0, Ld08;

    .line 260
    .line 261
    new-instance v0, Lns8;

    .line 262
    .line 263
    invoke-direct {v0, v2}, Lns8;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-direct {p0, v0}, Ld08;-><init>(Lns8;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, Lf08;

    .line 270
    .line 271
    invoke-direct {v0, v1}, Lf08;-><init>(I)V

    .line 272
    .line 273
    .line 274
    new-array v2, v3, [Lvr2;

    .line 275
    .line 276
    aput-object v0, v2, v1

    .line 277
    .line 278
    new-instance v0, Lf08;

    .line 279
    .line 280
    invoke-direct {v0, v3}, Lf08;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-static {p0, v2, v0}, Lar7;->h(Lui1;[Lvr2;Lvr2;)V

    .line 284
    .line 285
    .line 286
    new-instance v0, Le08;

    .line 287
    .line 288
    invoke-interface {p0}, Le1;->build()Llh0;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-direct {v0, p0}, Le08;-><init>(Llh0;)V

    .line 293
    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_d
    new-instance p0, Ld08;

    .line 297
    .line 298
    new-instance v0, Lns8;

    .line 299
    .line 300
    invoke-direct {v0, v2}, Lns8;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-direct {p0, v0}, Ld08;-><init>(Lns8;)V

    .line 304
    .line 305
    .line 306
    new-instance v0, Lha7;

    .line 307
    .line 308
    const/16 v2, 0x1c

    .line 309
    .line 310
    invoke-direct {v0, v2}, Lha7;-><init>(I)V

    .line 311
    .line 312
    .line 313
    new-array v2, v3, [Lvr2;

    .line 314
    .line 315
    aput-object v0, v2, v1

    .line 316
    .line 317
    new-instance v0, Lha7;

    .line 318
    .line 319
    const/16 v1, 0x1d

    .line 320
    .line 321
    invoke-direct {v0, v1}, Lha7;-><init>(I)V

    .line 322
    .line 323
    .line 324
    invoke-static {p0, v2, v0}, Lar7;->h(Lui1;[Lvr2;Lvr2;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, Le08;

    .line 328
    .line 329
    invoke-interface {p0}, Le1;->build()Llh0;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-direct {v0, p0}, Le08;-><init>(Llh0;)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_e
    invoke-static {}, Lio/github/jan/supabase/auth/user/UserInfo;->a()Lzr3;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :pswitch_f
    invoke-static {}, Lio/github/jan/supabase/auth/user/UserInfo;->b()Lzr3;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    return-object p0

    .line 347
    :pswitch_10
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->c()Lzr3;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :pswitch_11
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->e()Lzr3;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    return-object p0

    .line 357
    :pswitch_12
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->f()Lzr3;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    return-object p0

    .line 362
    :pswitch_13
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->d()Lzr3;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    return-object p0

    .line 367
    :pswitch_14
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->a()Lzr3;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    return-object p0

    .line 372
    :pswitch_15
    invoke-static {}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->b()Lzr3;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :pswitch_16
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;->a()Lzr3;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    return-object p0

    .line 382
    :pswitch_17
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;->c()Lzr3;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    return-object p0

    .line 387
    :pswitch_18
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;->d()Lzr3;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    return-object p0

    .line 392
    :pswitch_19
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;->b()Lzr3;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    return-object p0

    .line 397
    :pswitch_1a
    new-instance p0, Lbr7;

    .line 398
    .line 399
    invoke-direct {p0}, Lbr7;-><init>()V

    .line 400
    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_1b
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 404
    .line 405
    return-object p0

    .line 406
    :pswitch_1c
    new-instance p0, Lzi7;

    .line 407
    .line 408
    invoke-direct {p0, v0}, Lzi7;-><init>(Ljt0;)V

    .line 409
    .line 410
    .line 411
    return-object p0

    .line 412
    nop

    .line 413
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
