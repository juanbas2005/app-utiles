.class public final Ld9;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljw1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld9;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ld9;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final b()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ld9;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, Ld9;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, Lin8;

    .line 14
    .line 15
    check-cast v0, Loi6;

    .line 16
    .line 17
    invoke-virtual {v0, v4}, Loi6;->o1(Lcy6;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast v0, Lo24;

    .line 22
    .line 23
    iput-boolean v2, v0, Lo24;->f:Z

    .line 24
    .line 25
    iput v3, v0, Lo24;->d:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lo24;->c()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    check-cast v0, Lt24;

    .line 32
    .line 33
    iget-object v1, v0, Lt24;->c:Ll90;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iput-boolean v3, v1, Ll90;->a:Z

    .line 38
    .line 39
    :cond_0
    iput-object v4, v0, Lt24;->c:Ll90;

    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    check-cast v0, Lf24;

    .line 43
    .line 44
    iput-object v4, v0, Lf24;->d:Lfw0;

    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    check-cast v0, Lr92;

    .line 48
    .line 49
    iget-object v1, v0, Lr92;->x:Landroid/view/View;

    .line 50
    .line 51
    iget-boolean v2, v0, Lr92;->w:Z

    .line 52
    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 61
    .line 62
    .line 63
    iput-boolean v3, v0, Lr92;->w:Z

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_4
    check-cast v0, Lze7;

    .line 70
    .line 71
    invoke-virtual {v0}, Lze7;->o()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_5
    check-cast v0, Lnw1;

    .line 76
    .line 77
    iget-object v0, v0, Lnw1;->x:Low1;

    .line 78
    .line 79
    invoke-virtual {v0}, Low1;->b()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_6
    check-cast v0, Lek7;

    .line 84
    .line 85
    iget-object v0, v0, Lek7;->c:Lkk0;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-virtual {v0, v4}, Lkk0;->a(Ljava/lang/Throwable;)Z

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void

    .line 93
    :pswitch_7
    check-cast v0, Lp60;

    .line 94
    .line 95
    iget-object v0, v0, Lp60;->c:Led5;

    .line 96
    .line 97
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lo60;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Lo60;->close()V

    .line 106
    .line 107
    .line 108
    :cond_3
    return-void

    .line 109
    :pswitch_8
    check-cast v0, Lui;

    .line 110
    .line 111
    iget-object v1, v0, Lui;->e:Lcy6;

    .line 112
    .line 113
    iget-object v2, v1, Lcy6;->i:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Lc9;

    .line 116
    .line 117
    if-eqz v2, :cond_4

    .line 118
    .line 119
    invoke-virtual {v2}, Lc9;->h()V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {v1}, Lcy6;->a()V

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, Lui;->h:Landroid/view/ActionMode;

    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-virtual {v1}, Landroid/view/ActionMode;->finish()V

    .line 130
    .line 131
    .line 132
    :cond_5
    iput-object v4, v0, Lui;->h:Landroid/view/ActionMode;

    .line 133
    .line 134
    return-void

    .line 135
    :pswitch_9
    check-cast v0, Lpl5;

    .line 136
    .line 137
    invoke-virtual {v0}, La1;->e()V

    .line 138
    .line 139
    .line 140
    const v1, 0x7f090235

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    const v1, 0x7f090236

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, Lpl5;->L:Landroid/view/WindowManager;

    .line 153
    .line 154
    invoke-interface {v1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lpl5;->getNavigationEventDispatcher()Lrv4;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lrv4;->d()V

    .line 162
    .line 163
    .line 164
    iput-boolean v2, v0, Lrv4;->b:Z

    .line 165
    .line 166
    new-instance v1, Las;

    .line 167
    .line 168
    invoke-direct {v1}, Las;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v0}, Las;->addLast(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :goto_1
    invoke-virtual {v1}, Las;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_9

    .line 179
    .line 180
    invoke-virtual {v1}, Las;->removeFirst()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    check-cast v3, Lrv4;

    .line 185
    .line 186
    iput-boolean v2, v3, Lrv4;->b:Z

    .line 187
    .line 188
    iget-object v5, v3, Lrv4;->f:Lmp4;

    .line 189
    .line 190
    iget-object v6, v3, Lrv4;->g:Lmp4;

    .line 191
    .line 192
    iget-object v3, v3, Lrv4;->e:Lmp4;

    .line 193
    .line 194
    iget-object v7, v3, Lmp4;->b:[Ljava/lang/Object;

    .line 195
    .line 196
    iget-object v8, v3, Lmp4;->c:[J

    .line 197
    .line 198
    iget v9, v3, Lmp4;->e:I

    .line 199
    .line 200
    :goto_2
    const-wide/32 v10, 0x7fffffff

    .line 201
    .line 202
    .line 203
    const/16 v12, 0x1f

    .line 204
    .line 205
    const v13, 0x7fffffff

    .line 206
    .line 207
    .line 208
    if-eq v9, v13, :cond_6

    .line 209
    .line 210
    aget-wide v13, v8, v9

    .line 211
    .line 212
    shr-long v12, v13, v12

    .line 213
    .line 214
    and-long/2addr v10, v12

    .line 215
    long-to-int v10, v10

    .line 216
    aget-object v9, v7, v9

    .line 217
    .line 218
    check-cast v9, Lrv4;

    .line 219
    .line 220
    invoke-virtual {v1, v9}, Las;->addLast(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    move v9, v10

    .line 224
    goto :goto_2

    .line 225
    :cond_6
    invoke-static {v6}, Lar7;->e(Lmp4;)Lmp4;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    iget-object v8, v7, Lmp4;->b:[Ljava/lang/Object;

    .line 230
    .line 231
    iget-object v9, v7, Lmp4;->c:[J

    .line 232
    .line 233
    iget v7, v7, Lmp4;->e:I

    .line 234
    .line 235
    :goto_3
    if-eq v7, v13, :cond_7

    .line 236
    .line 237
    aget-wide v14, v9, v7

    .line 238
    .line 239
    shr-long/2addr v14, v12

    .line 240
    and-long/2addr v14, v10

    .line 241
    long-to-int v14, v14

    .line 242
    aget-object v7, v8, v7

    .line 243
    .line 244
    check-cast v7, Lzv4;

    .line 245
    .line 246
    iget-object v15, v0, Lrv4;->d:Law4;

    .line 247
    .line 248
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object v2, v15, Law4;->k:Lmp4;

    .line 255
    .line 256
    invoke-virtual {v2, v7}, Lmp4;->h(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    iget-object v2, v15, Law4;->j:Lmp4;

    .line 260
    .line 261
    invoke-virtual {v2, v7}, Lmp4;->h(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    iget-object v2, v15, Law4;->i:Lmp4;

    .line 265
    .line 266
    invoke-virtual {v2, v7}, Lmp4;->h(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    iput-object v4, v7, Lzv4;->a:Lrv4;

    .line 270
    .line 271
    invoke-virtual {v7}, Lzv4;->c()V

    .line 272
    .line 273
    .line 274
    move v7, v14

    .line 275
    const/4 v2, 0x1

    .line 276
    goto :goto_3

    .line 277
    :cond_7
    invoke-virtual {v6}, Lmp4;->b()V

    .line 278
    .line 279
    .line 280
    invoke-static {v5}, Lar7;->e(Lmp4;)Lmp4;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    iget-object v6, v2, Lmp4;->b:[Ljava/lang/Object;

    .line 285
    .line 286
    iget-object v7, v2, Lmp4;->c:[J

    .line 287
    .line 288
    iget v2, v2, Lmp4;->e:I

    .line 289
    .line 290
    :goto_4
    if-eq v2, v13, :cond_8

    .line 291
    .line 292
    aget-wide v8, v7, v2

    .line 293
    .line 294
    shr-long/2addr v8, v12

    .line 295
    and-long/2addr v8, v10

    .line 296
    long-to-int v8, v8

    .line 297
    aget-object v2, v6, v2

    .line 298
    .line 299
    check-cast v2, Ltv4;

    .line 300
    .line 301
    invoke-virtual {v2}, Ltv4;->h()V

    .line 302
    .line 303
    .line 304
    move v2, v8

    .line 305
    goto :goto_4

    .line 306
    :cond_8
    invoke-virtual {v5}, Lmp4;->b()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3}, Lmp4;->b()V

    .line 310
    .line 311
    .line 312
    const/4 v2, 0x1

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_9
    return-void

    .line 316
    :pswitch_a
    check-cast v0, Lyu1;

    .line 317
    .line 318
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 319
    .line 320
    .line 321
    iget-object v0, v0, Lyu1;->D:Ltu1;

    .line 322
    .line 323
    invoke-virtual {v0}, La1;->e()V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_b
    check-cast v0, Lw8;

    .line 328
    .line 329
    iget-object v0, v0, Lw8;->a:La9;

    .line 330
    .line 331
    if-eqz v0, :cond_a

    .line 332
    .line 333
    invoke-virtual {v0}, La9;->e0()V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_a
    const-string v0, "Launcher has not been initialized"

    .line 338
    .line 339
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    :goto_5
    return-void

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
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
