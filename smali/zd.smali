.class public final Lzd;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Lje;


# direct methods
.method public synthetic constructor <init>(Lje;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzd;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Lzd;->y:Lje;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lzd;->x:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lzd;->y:Lje;

    .line 9
    .line 10
    iget-object v0, p0, Lje;->G0:Landroid/view/MotionEvent;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/16 v3, 0x9

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x7

    .line 21
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    filled-new-array {v3, v4, v5}, [Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-object v3, p0, Lje;->G0:Landroid/view/MotionEvent;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getButtonState()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    move v1, v2

    .line 62
    :cond_0
    if-eqz v0, :cond_1

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    iput-wide v0, p0, Lje;->H0:J

    .line 71
    .line 72
    iget-object v0, p0, Lje;->O0:Lge;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    :cond_1
    iget-object p0, p0, Lje;->U0:Lzd;

    .line 78
    .line 79
    invoke-virtual {p0}, Lzd;->b()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p0, Lvs7;->a:Lvs7;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_0
    sget-object v0, Lje;->b1:Ld63;

    .line 86
    .line 87
    iget-object p0, p0, Lzd;->y:Lje;

    .line 88
    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v3, 0x1c

    .line 92
    .line 93
    if-le v0, v3, :cond_8

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    sget-object v0, Lje;->g1:Lka;

    .line 103
    .line 104
    if-nez v0, :cond_7

    .line 105
    .line 106
    new-instance v0, Lka;

    .line 107
    .line 108
    invoke-direct {v0, v2}, Lka;-><init>(I)V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lje;->g1:Lka;

    .line 112
    .line 113
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :try_start_0
    sget-object v4, Lje;->c1:Ljava/lang/Class;

    .line 118
    .line 119
    if-nez v4, :cond_3

    .line 120
    .line 121
    const-string v4, "android.os.SystemProperties"

    .line 122
    .line 123
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    sput-object v4, Lje;->c1:Ljava/lang/Class;

    .line 128
    .line 129
    :cond_3
    sget-object v4, Lje;->e1:Ljava/lang/reflect/Method;

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    if-nez v4, :cond_5

    .line 133
    .line 134
    sget-object v4, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    .line 135
    .line 136
    invoke-static {v4}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 137
    .line 138
    .line 139
    sget-object v4, Lje;->c1:Ljava/lang/Class;

    .line 140
    .line 141
    if-eqz v4, :cond_4

    .line 142
    .line 143
    const-string v6, "addChangeCallback"

    .line 144
    .line 145
    new-array v7, v2, [Ljava/lang/Class;

    .line 146
    .line 147
    const-class v8, Ljava/lang/Runnable;

    .line 148
    .line 149
    aput-object v8, v7, v1

    .line 150
    .line 151
    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    goto :goto_0

    .line 156
    :cond_4
    move-object v4, v5

    .line 157
    :goto_0
    sput-object v4, Lje;->e1:Ljava/lang/reflect/Method;

    .line 158
    .line 159
    :cond_5
    sget-object v4, Lje;->e1:Ljava/lang/reflect/Method;

    .line 160
    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    new-array v2, v2, [Ljava/lang/Object;

    .line 164
    .line 165
    aput-object v0, v2, v1

    .line 166
    .line 167
    invoke-virtual {v4, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    .line 170
    :catchall_0
    :cond_6
    invoke-static {v3}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    sget-object v0, Lje;->f1:Llp4;

    .line 174
    .line 175
    monitor-enter v0

    .line 176
    :try_start_1
    invoke-virtual {v0, p0}, Llp4;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    .line 178
    .line 179
    monitor-exit v0

    .line 180
    goto :goto_1

    .line 181
    :catchall_1
    move-exception p0

    .line 182
    monitor-exit v0

    .line 183
    throw p0

    .line 184
    :cond_8
    :goto_1
    sget-object p0, Lvs7;->a:Lvs7;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_1
    iget-object p0, p0, Lzd;->y:Lje;

    .line 188
    .line 189
    invoke-virtual {p0}, Lje;->getConfiguration()Landroid/content/res/Configuration;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    new-instance v0, Lza4;

    .line 198
    .line 199
    new-instance v2, Lab4;

    .line 200
    .line 201
    invoke-direct {v2, p0}, Lab4;-><init>(Landroid/os/LocaleList;)V

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, v2}, Lza4;-><init>(Lab4;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lza4;->b()Z

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    if-eqz p0, :cond_9

    .line 212
    .line 213
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance v0, Lza4;

    .line 218
    .line 219
    new-instance v2, Lab4;

    .line 220
    .line 221
    invoke-direct {v2, p0}, Lab4;-><init>(Landroid/os/LocaleList;)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v0, v2}, Lza4;-><init>(Lab4;)V

    .line 225
    .line 226
    .line 227
    :cond_9
    iget-object p0, v0, Lza4;->a:Lab4;

    .line 228
    .line 229
    iget-object v0, p0, Lab4;->a:Landroid/os/LocaleList;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    new-instance v2, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    .line 239
    .line 240
    :goto_2
    if-ge v1, v0, :cond_a

    .line 241
    .line 242
    new-instance v3, Lxa4;

    .line 243
    .line 244
    iget-object v4, p0, Lab4;->a:Landroid/os/LocaleList;

    .line 245
    .line 246
    invoke-virtual {v4, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-direct {v3, v4}, Lxa4;-><init>(Ljava/util/Locale;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    add-int/lit8 v1, v1, 0x1

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_a
    new-instance p0, Lya4;

    .line 263
    .line 264
    invoke-direct {p0, v2}, Lya4;-><init>(Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    return-object p0

    .line 268
    :pswitch_2
    iget-object p0, p0, Lzd;->y:Lje;

    .line 269
    .line 270
    invoke-virtual {p0}, Lje;->getAndroidViewsHandler()Llj;

    .line 271
    .line 272
    .line 273
    sget-object p0, Lvs7;->a:Lvs7;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_3
    iget-object p0, p0, Lzd;->y:Lje;

    .line 277
    .line 278
    iget-object p0, p0, Lje;->K:Led5;

    .line 279
    .line 280
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    check-cast p0, Ljava/lang/Boolean;

    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    return-object p0

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
