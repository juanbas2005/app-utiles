.class public final Lke;
.super Lf96;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic C:I

.field public final synthetic D:Lk4;


# direct methods
.method public synthetic constructor <init>(Lk4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lke;->C:I

    .line 2
    .line 3
    iput-object p1, p0, Lke;->D:Lk4;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lf96;-><init>(I)V

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
.method public final C(IILandroid/os/Bundle;)Z
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Lke;->C:I

    .line 10
    .line 11
    const v5, 0x8000

    .line 12
    .line 13
    .line 14
    const/16 v6, 0x10

    .line 15
    .line 16
    const/16 v7, 0x80

    .line 17
    .line 18
    const/16 v8, 0x40

    .line 19
    .line 20
    const/4 v9, -0x1

    .line 21
    iget-object v0, v0, Lke;->D:Lk4;

    .line 22
    .line 23
    const/high16 v10, -0x80000000

    .line 24
    .line 25
    const/high16 v11, 0x10000

    .line 26
    .line 27
    const/4 v12, 0x2

    .line 28
    const/4 v13, 0x1

    .line 29
    const/4 v14, 0x0

    .line 30
    packed-switch v4, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    check-cast v0, Ljp0;

    .line 34
    .line 35
    iget-object v4, v0, Ljp0;->E:Lcom/google/android/material/chip/Chip;

    .line 36
    .line 37
    if-eq v1, v9, :cond_9

    .line 38
    .line 39
    if-eq v2, v13, :cond_8

    .line 40
    .line 41
    if-eq v2, v12, :cond_7

    .line 42
    .line 43
    if-eq v2, v8, :cond_4

    .line 44
    .line 45
    if-eq v2, v7, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Ljp0;->J:Lcom/google/android/material/chip/Chip;

    .line 48
    .line 49
    if-ne v2, v6, :cond_2

    .line 50
    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    if-ne v1, v13, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0, v14}, Landroid/view/View;->playSoundEffect(I)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lcom/google/android/material/chip/Chip;->D:Landroid/view/View$OnClickListener;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {v1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    move v14, v13

    .line 71
    :cond_1
    iget-boolean v1, v0, Lcom/google/android/material/chip/Chip;->O:Z

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->N:Ljp0;

    .line 76
    .line 77
    invoke-virtual {v0, v13, v13}, Ljp0;->r(II)V

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_0
    move v13, v14

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget v2, v0, Ljp0;->G:I

    .line 83
    .line 84
    if-ne v2, v1, :cond_2

    .line 85
    .line 86
    iput v10, v0, Ljp0;->G:I

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v11}, Ljp0;->r(II)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v2, v0, Ljp0;->D:Landroid/view/accessibility/AccessibilityManager;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_2

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    iget v2, v0, Ljp0;->G:I

    .line 111
    .line 112
    if-eq v2, v1, :cond_2

    .line 113
    .line 114
    if-eq v2, v10, :cond_6

    .line 115
    .line 116
    iput v10, v0, Ljp0;->G:I

    .line 117
    .line 118
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v2, v11}, Ljp0;->r(II)V

    .line 122
    .line 123
    .line 124
    :cond_6
    iput v1, v0, Ljp0;->G:I

    .line 125
    .line 126
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1, v5}, Ljp0;->r(II)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_7
    invoke-virtual {v0, v1}, Ljp0;->j(I)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    goto :goto_1

    .line 138
    :cond_8
    invoke-virtual {v0, v1}, Ljp0;->q(I)Z

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    goto :goto_1

    .line 143
    :cond_9
    sget-object v0, Le58;->a:Ljava/util/WeakHashMap;

    .line 144
    .line 145
    invoke-virtual {v4, v2, v3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    :goto_1
    return v13

    .line 150
    :pswitch_0
    check-cast v0, Loe;

    .line 151
    .line 152
    iget-object v4, v0, Loe;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 153
    .line 154
    const/16 p0, 0x0

    .line 155
    .line 156
    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    iget-object v5, v0, Loe;->z:Lje;

    .line 161
    .line 162
    invoke-virtual {v0}, Loe;->r()Lme3;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    invoke-virtual {v11, v1}, Lme3;->b(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    check-cast v11, Lhk6;

    .line 171
    .line 172
    if-eqz v11, :cond_a

    .line 173
    .line 174
    iget-object v11, v11, Lhk6;->a:Lfk6;

    .line 175
    .line 176
    if-nez v11, :cond_b

    .line 177
    .line 178
    :cond_a
    move/from16 v21, v14

    .line 179
    .line 180
    goto/16 :goto_4b

    .line 181
    .line 182
    :cond_b
    iget-object v10, v11, Lfk6;->c:Luy3;

    .line 183
    .line 184
    iget v6, v11, Lfk6;->f:I

    .line 185
    .line 186
    iget-object v9, v11, Lfk6;->d:Lak6;

    .line 187
    .line 188
    iget-object v14, v9, Lak6;->w:Ltp4;

    .line 189
    .line 190
    sget-object v12, Ljk6;->o:Lnk6;

    .line 191
    .line 192
    invoke-virtual {v14, v12}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v12

    .line 196
    if-nez v12, :cond_c

    .line 197
    .line 198
    const/4 v12, 0x0

    .line 199
    :cond_c
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-static {v12, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-eqz v12, :cond_f

    .line 206
    .line 207
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    const/16 v7, 0x22

    .line 210
    .line 211
    if-lt v12, v7, :cond_d

    .line 212
    .line 213
    invoke-static {v4}, Ll4;->j(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    goto :goto_2

    .line 218
    :cond_d
    const/4 v7, 0x1

    .line 219
    :goto_2
    if-nez v7, :cond_f

    .line 220
    .line 221
    :cond_e
    :goto_3
    const/16 v21, 0x0

    .line 222
    .line 223
    goto/16 :goto_4b

    .line 224
    .line 225
    :cond_f
    const/16 v7, 0xc

    .line 226
    .line 227
    if-eq v2, v8, :cond_92

    .line 228
    .line 229
    const/16 v8, 0x80

    .line 230
    .line 231
    if-eq v2, v8, :cond_90

    .line 232
    .line 233
    const/16 v4, 0x8

    .line 234
    .line 235
    const/16 v8, 0x200

    .line 236
    .line 237
    const/16 v12, 0x100

    .line 238
    .line 239
    if-eq v2, v12, :cond_72

    .line 240
    .line 241
    if-eq v2, v8, :cond_72

    .line 242
    .line 243
    const/16 v8, 0x4000

    .line 244
    .line 245
    if-eq v2, v8, :cond_70

    .line 246
    .line 247
    const/high16 v8, 0x20000

    .line 248
    .line 249
    if-eq v2, v8, :cond_6d

    .line 250
    .line 251
    invoke-static {v11}, Lfd1;->o(Lfk6;)Z

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    if-nez v6, :cond_10

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_10
    const/4 v6, 0x1

    .line 259
    if-eq v2, v6, :cond_6a

    .line 260
    .line 261
    const/4 v6, 0x2

    .line 262
    if-eq v2, v6, :cond_68

    .line 263
    .line 264
    sget-object v4, Ley3;->x:Ley3;

    .line 265
    .line 266
    sparse-switch v2, :sswitch_data_0

    .line 267
    .line 268
    .line 269
    packed-switch v2, :pswitch_data_1

    .line 270
    .line 271
    .line 272
    packed-switch v2, :pswitch_data_2

    .line 273
    .line 274
    .line 275
    iget-object v0, v0, Loe;->N:Lcz6;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Lcz6;->c(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Lcz6;

    .line 282
    .line 283
    if-eqz v0, :cond_e

    .line 284
    .line 285
    invoke-virtual {v0, v2}, Lcz6;->c(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/CharSequence;

    .line 290
    .line 291
    if-nez v0, :cond_11

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_11
    sget-object v0, Lzj6;->x:Lnk6;

    .line 295
    .line 296
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-nez v0, :cond_12

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    goto :goto_4

    .line 304
    :cond_12
    move-object v13, v0

    .line 305
    :goto_4
    check-cast v13, Ljava/util/List;

    .line 306
    .line 307
    if-nez v13, :cond_13

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_13
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-gtz v0, :cond_14

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_14
    const/4 v0, 0x0

    .line 318
    invoke-interface {v13, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Lku4;->a()V

    .line 326
    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    goto/16 :goto_4c

    .line 330
    .line 331
    :pswitch_1
    sget-object v0, Lzj6;->B:Lnk6;

    .line 332
    .line 333
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-nez v0, :cond_15

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    goto :goto_5

    .line 341
    :cond_15
    move-object v13, v0

    .line 342
    :goto_5
    check-cast v13, Lh4;

    .line 343
    .line 344
    if-eqz v13, :cond_e

    .line 345
    .line 346
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 347
    .line 348
    check-cast v0, Lsr2;

    .line 349
    .line 350
    if-eqz v0, :cond_e

    .line 351
    .line 352
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    goto/16 :goto_4c

    .line 363
    .line 364
    :pswitch_2
    sget-object v0, Lzj6;->z:Lnk6;

    .line 365
    .line 366
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-nez v0, :cond_16

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    goto :goto_6

    .line 374
    :cond_16
    move-object v13, v0

    .line 375
    :goto_6
    check-cast v13, Lh4;

    .line 376
    .line 377
    if-eqz v13, :cond_e

    .line 378
    .line 379
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 380
    .line 381
    check-cast v0, Lsr2;

    .line 382
    .line 383
    if-eqz v0, :cond_e

    .line 384
    .line 385
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    goto/16 :goto_4c

    .line 396
    .line 397
    :pswitch_3
    sget-object v0, Lzj6;->A:Lnk6;

    .line 398
    .line 399
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    if-nez v0, :cond_17

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    goto :goto_7

    .line 407
    :cond_17
    move-object v13, v0

    .line 408
    :goto_7
    check-cast v13, Lh4;

    .line 409
    .line 410
    if-eqz v13, :cond_e

    .line 411
    .line 412
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 413
    .line 414
    check-cast v0, Lsr2;

    .line 415
    .line 416
    if-eqz v0, :cond_e

    .line 417
    .line 418
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    check-cast v0, Ljava/lang/Boolean;

    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 425
    .line 426
    .line 427
    move-result v13

    .line 428
    goto/16 :goto_4c

    .line 429
    .line 430
    :pswitch_4
    sget-object v0, Lzj6;->y:Lnk6;

    .line 431
    .line 432
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    if-nez v0, :cond_18

    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    goto :goto_8

    .line 440
    :cond_18
    move-object v13, v0

    .line 441
    :goto_8
    check-cast v13, Lh4;

    .line 442
    .line 443
    if-eqz v13, :cond_e

    .line 444
    .line 445
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 446
    .line 447
    check-cast v0, Lsr2;

    .line 448
    .line 449
    if-eqz v0, :cond_e

    .line 450
    .line 451
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    check-cast v0, Ljava/lang/Boolean;

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 458
    .line 459
    .line 460
    move-result v13

    .line 461
    goto/16 :goto_4c

    .line 462
    .line 463
    :pswitch_5
    :sswitch_0
    const-wide v16, 0xffffffffL

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    const/16 v18, 0x20

    .line 469
    .line 470
    goto/16 :goto_1f

    .line 471
    .line 472
    :sswitch_1
    sget-object v0, Lzj6;->p:Lnk6;

    .line 473
    .line 474
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-nez v0, :cond_19

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    goto :goto_9

    .line 482
    :cond_19
    move-object v13, v0

    .line 483
    :goto_9
    check-cast v13, Lh4;

    .line 484
    .line 485
    if-eqz v13, :cond_e

    .line 486
    .line 487
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 488
    .line 489
    check-cast v0, Lsr2;

    .line 490
    .line 491
    if-eqz v0, :cond_e

    .line 492
    .line 493
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, Ljava/lang/Boolean;

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 500
    .line 501
    .line 502
    move-result v13

    .line 503
    goto/16 :goto_4c

    .line 504
    .line 505
    :sswitch_2
    if-eqz v3, :cond_e

    .line 506
    .line 507
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 508
    .line 509
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    if-nez v1, :cond_1a

    .line 514
    .line 515
    goto/16 :goto_3

    .line 516
    .line 517
    :cond_1a
    sget-object v1, Lzj6;->i:Lnk6;

    .line 518
    .line 519
    invoke-virtual {v14, v1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-nez v1, :cond_1b

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    goto :goto_a

    .line 527
    :cond_1b
    move-object v13, v1

    .line 528
    :goto_a
    check-cast v13, Lh4;

    .line 529
    .line 530
    if-eqz v13, :cond_e

    .line 531
    .line 532
    iget-object v1, v13, Lh4;->b:Lds2;

    .line 533
    .line 534
    check-cast v1, Lvr2;

    .line 535
    .line 536
    if-eqz v1, :cond_e

    .line 537
    .line 538
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    check-cast v0, Ljava/lang/Boolean;

    .line 551
    .line 552
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 553
    .line 554
    .line 555
    move-result v13

    .line 556
    goto/16 :goto_4c

    .line 557
    .line 558
    :sswitch_3
    invoke-virtual {v11}, Lfk6;->l()Lfk6;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    if-eqz v0, :cond_1d

    .line 563
    .line 564
    iget-object v1, v0, Lfk6;->d:Lak6;

    .line 565
    .line 566
    sget-object v2, Lzj6;->d:Lnk6;

    .line 567
    .line 568
    iget-object v1, v1, Lak6;->w:Ltp4;

    .line 569
    .line 570
    invoke-virtual {v1, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    if-nez v1, :cond_1c

    .line 575
    .line 576
    const/4 v1, 0x0

    .line 577
    :cond_1c
    check-cast v1, Lh4;

    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_1d
    const/4 v1, 0x0

    .line 581
    :goto_b
    if-nez v1, :cond_1f

    .line 582
    .line 583
    if-eqz v0, :cond_1f

    .line 584
    .line 585
    invoke-virtual {v0}, Lfk6;->l()Lfk6;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    if-eqz v0, :cond_1d

    .line 590
    .line 591
    iget-object v1, v0, Lfk6;->d:Lak6;

    .line 592
    .line 593
    sget-object v2, Lzj6;->d:Lnk6;

    .line 594
    .line 595
    iget-object v1, v1, Lak6;->w:Ltp4;

    .line 596
    .line 597
    invoke-virtual {v1, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    if-nez v1, :cond_1e

    .line 602
    .line 603
    const/4 v1, 0x0

    .line 604
    :cond_1e
    check-cast v1, Lh4;

    .line 605
    .line 606
    goto :goto_b

    .line 607
    :cond_1f
    if-nez v0, :cond_20

    .line 608
    .line 609
    invoke-virtual {v11}, Lfk6;->g()Lly5;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    new-instance v1, Landroid/graphics/Rect;

    .line 614
    .line 615
    iget v2, v0, Lly5;->a:F

    .line 616
    .line 617
    float-to-double v2, v2

    .line 618
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 619
    .line 620
    .line 621
    move-result-wide v2

    .line 622
    double-to-float v2, v2

    .line 623
    float-to-int v2, v2

    .line 624
    iget v3, v0, Lly5;->b:F

    .line 625
    .line 626
    float-to-double v3, v3

    .line 627
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 628
    .line 629
    .line 630
    move-result-wide v3

    .line 631
    double-to-float v3, v3

    .line 632
    float-to-int v3, v3

    .line 633
    iget v4, v0, Lly5;->c:F

    .line 634
    .line 635
    float-to-double v6, v4

    .line 636
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 637
    .line 638
    .line 639
    move-result-wide v6

    .line 640
    double-to-float v4, v6

    .line 641
    invoke-static {v4}, Ldh4;->C(F)I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    iget v0, v0, Lly5;->d:F

    .line 646
    .line 647
    float-to-double v6, v0

    .line 648
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 649
    .line 650
    .line 651
    move-result-wide v6

    .line 652
    double-to-float v0, v6

    .line 653
    invoke-static {v0}, Ldh4;->C(F)I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v5, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 661
    .line 662
    .line 663
    move-result v13

    .line 664
    goto/16 :goto_4c

    .line 665
    .line 666
    :cond_20
    const-wide/16 v1, 0x0

    .line 667
    .line 668
    move-wide v12, v1

    .line 669
    const/4 v3, 0x0

    .line 670
    :goto_c
    if-eqz v0, :cond_31

    .line 671
    .line 672
    iget-object v5, v0, Lfk6;->c:Luy3;

    .line 673
    .line 674
    iget-object v7, v0, Lfk6;->d:Lak6;

    .line 675
    .line 676
    iget-object v7, v7, Lak6;->w:Ltp4;

    .line 677
    .line 678
    sget-object v14, Lzj6;->d:Lnk6;

    .line 679
    .line 680
    invoke-virtual {v7, v14}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v14

    .line 684
    if-nez v14, :cond_21

    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    :cond_21
    check-cast v14, Lh4;

    .line 688
    .line 689
    if-eqz v14, :cond_30

    .line 690
    .line 691
    iget-object v15, v5, Luy3;->a0:Lo00;

    .line 692
    .line 693
    iget-object v15, v15, Lo00;->d:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v15, Lhc3;

    .line 696
    .line 697
    invoke-static {v15}, Lt49;->u(Ldy3;)Lly5;

    .line 698
    .line 699
    .line 700
    move-result-object v15

    .line 701
    iget-object v5, v5, Luy3;->a0:Lo00;

    .line 702
    .line 703
    iget-object v5, v5, Lo00;->d:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v5, Lhc3;

    .line 706
    .line 707
    invoke-virtual {v5}, Lxz4;->D()Ldy3;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    if-eqz v5, :cond_22

    .line 712
    .line 713
    check-cast v5, Lxz4;

    .line 714
    .line 715
    invoke-virtual {v5, v1, v2}, Lxz4;->R(J)J

    .line 716
    .line 717
    .line 718
    move-result-wide v16

    .line 719
    move-wide/from16 v8, v16

    .line 720
    .line 721
    :goto_d
    const-wide v16, 0xffffffffL

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    goto :goto_e

    .line 727
    :cond_22
    move-wide v8, v1

    .line 728
    goto :goto_d

    .line 729
    :goto_e
    invoke-virtual {v15, v8, v9}, Lly5;->i(J)Lly5;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    invoke-virtual {v11}, Lfk6;->d()Lxz4;

    .line 734
    .line 735
    .line 736
    move-result-object v8

    .line 737
    if-eqz v8, :cond_24

    .line 738
    .line 739
    invoke-virtual {v8}, Lxz4;->c1()Lll4;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    iget-boolean v9, v9, Lll4;->J:Z

    .line 744
    .line 745
    if-eqz v9, :cond_23

    .line 746
    .line 747
    goto :goto_f

    .line 748
    :cond_23
    const/4 v8, 0x0

    .line 749
    :goto_f
    if-eqz v8, :cond_24

    .line 750
    .line 751
    invoke-virtual {v8, v1, v2}, Lxz4;->R(J)J

    .line 752
    .line 753
    .line 754
    move-result-wide v8

    .line 755
    goto :goto_10

    .line 756
    :cond_24
    move-wide v8, v1

    .line 757
    :goto_10
    invoke-static {v8, v9, v12, v13}, Ll35;->e(JJ)J

    .line 758
    .line 759
    .line 760
    move-result-wide v8

    .line 761
    invoke-virtual {v11}, Lfk6;->d()Lxz4;

    .line 762
    .line 763
    .line 764
    move-result-object v15

    .line 765
    move-object/from16 v19, v7

    .line 766
    .line 767
    const/16 v18, 0x20

    .line 768
    .line 769
    if-eqz v15, :cond_25

    .line 770
    .line 771
    iget-wide v6, v15, Leh5;->y:J

    .line 772
    .line 773
    goto :goto_11

    .line 774
    :cond_25
    move-wide v6, v1

    .line 775
    :goto_11
    invoke-static {v6, v7}, Lpv8;->O(J)J

    .line 776
    .line 777
    .line 778
    move-result-wide v6

    .line 779
    invoke-static {v8, v9, v6, v7}, Lz85;->c(JJ)Lly5;

    .line 780
    .line 781
    .line 782
    move-result-object v6

    .line 783
    iget v7, v6, Lly5;->a:F

    .line 784
    .line 785
    iget v8, v5, Lly5;->a:F

    .line 786
    .line 787
    sub-float/2addr v7, v8

    .line 788
    iget v8, v6, Lly5;->c:F

    .line 789
    .line 790
    iget v9, v5, Lly5;->c:F

    .line 791
    .line 792
    sub-float/2addr v8, v9

    .line 793
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 794
    .line 795
    .line 796
    move-result v9

    .line 797
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 798
    .line 799
    .line 800
    move-result v15

    .line 801
    cmpg-float v9, v9, v15

    .line 802
    .line 803
    if-nez v9, :cond_27

    .line 804
    .line 805
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 806
    .line 807
    .line 808
    move-result v9

    .line 809
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 810
    .line 811
    .line 812
    move-result v15

    .line 813
    cmpg-float v9, v9, v15

    .line 814
    .line 815
    if-gez v9, :cond_26

    .line 816
    .line 817
    goto :goto_12

    .line 818
    :cond_26
    move v7, v8

    .line 819
    goto :goto_12

    .line 820
    :cond_27
    move/from16 v7, p0

    .line 821
    .line 822
    :goto_12
    iget v8, v6, Lly5;->b:F

    .line 823
    .line 824
    iget v9, v5, Lly5;->b:F

    .line 825
    .line 826
    sub-float/2addr v8, v9

    .line 827
    iget v6, v6, Lly5;->d:F

    .line 828
    .line 829
    iget v5, v5, Lly5;->d:F

    .line 830
    .line 831
    sub-float/2addr v6, v5

    .line 832
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    .line 837
    .line 838
    .line 839
    move-result v9

    .line 840
    cmpg-float v5, v5, v9

    .line 841
    .line 842
    if-nez v5, :cond_29

    .line 843
    .line 844
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 849
    .line 850
    .line 851
    move-result v9

    .line 852
    cmpg-float v5, v5, v9

    .line 853
    .line 854
    if-gez v5, :cond_28

    .line 855
    .line 856
    goto :goto_13

    .line 857
    :cond_28
    move v8, v6

    .line 858
    goto :goto_13

    .line 859
    :cond_29
    move/from16 v8, p0

    .line 860
    .line 861
    :goto_13
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 862
    .line 863
    .line 864
    move-result v5

    .line 865
    int-to-long v5, v5

    .line 866
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 867
    .line 868
    .line 869
    move-result v7

    .line 870
    int-to-long v7, v7

    .line 871
    shl-long v5, v5, v18

    .line 872
    .line 873
    and-long v7, v7, v16

    .line 874
    .line 875
    or-long/2addr v5, v7

    .line 876
    invoke-static {v5, v6, v1, v2}, Ll35;->b(JJ)Z

    .line 877
    .line 878
    .line 879
    move-result v7

    .line 880
    if-eqz v7, :cond_2a

    .line 881
    .line 882
    move-wide v1, v5

    .line 883
    goto :goto_14

    .line 884
    :cond_2a
    shr-long v7, v5, v18

    .line 885
    .line 886
    long-to-int v7, v7

    .line 887
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 888
    .line 889
    .line 890
    move-result v7

    .line 891
    and-long v8, v5, v16

    .line 892
    .line 893
    long-to-int v8, v8

    .line 894
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 895
    .line 896
    .line 897
    move-result v8

    .line 898
    sget-object v9, Ljk6;->v:Lnk6;

    .line 899
    .line 900
    move-object/from16 v15, v19

    .line 901
    .line 902
    invoke-virtual {v15, v9}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v9

    .line 906
    if-nez v9, :cond_2b

    .line 907
    .line 908
    const/4 v9, 0x0

    .line 909
    :cond_2b
    check-cast v9, Lvg6;

    .line 910
    .line 911
    iget-object v9, v10, Luy3;->U:Ley3;

    .line 912
    .line 913
    if-ne v9, v4, :cond_2c

    .line 914
    .line 915
    neg-float v7, v7

    .line 916
    :cond_2c
    sget-object v9, Ljk6;->w:Lnk6;

    .line 917
    .line 918
    invoke-virtual {v15, v9}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    if-nez v9, :cond_2d

    .line 923
    .line 924
    const/4 v9, 0x0

    .line 925
    :cond_2d
    check-cast v9, Lvg6;

    .line 926
    .line 927
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 928
    .line 929
    .line 930
    move-result v7

    .line 931
    int-to-long v1, v7

    .line 932
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 933
    .line 934
    .line 935
    move-result v7

    .line 936
    int-to-long v7, v7

    .line 937
    shl-long v1, v1, v18

    .line 938
    .line 939
    and-long v7, v7, v16

    .line 940
    .line 941
    or-long/2addr v1, v7

    .line 942
    :goto_14
    iget-object v7, v14, Lh4;->b:Lds2;

    .line 943
    .line 944
    check-cast v7, Lgs2;

    .line 945
    .line 946
    if-eqz v7, :cond_2e

    .line 947
    .line 948
    shr-long v8, v1, v18

    .line 949
    .line 950
    long-to-int v8, v8

    .line 951
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 952
    .line 953
    .line 954
    move-result v8

    .line 955
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 956
    .line 957
    .line 958
    move-result-object v8

    .line 959
    and-long v1, v1, v16

    .line 960
    .line 961
    long-to-int v1, v1

    .line 962
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 963
    .line 964
    .line 965
    move-result v1

    .line 966
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-interface {v7, v8, v1}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    check-cast v1, Ljava/lang/Boolean;

    .line 975
    .line 976
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 977
    .line 978
    .line 979
    move-result v1

    .line 980
    const/4 v2, 0x1

    .line 981
    if-ne v1, v2, :cond_2e

    .line 982
    .line 983
    goto :goto_15

    .line 984
    :cond_2e
    if-eqz v3, :cond_2f

    .line 985
    .line 986
    :goto_15
    const/4 v1, 0x1

    .line 987
    goto :goto_16

    .line 988
    :cond_2f
    const/4 v1, 0x0

    .line 989
    :goto_16
    invoke-static {v12, v13, v5, v6}, Ll35;->d(JJ)J

    .line 990
    .line 991
    .line 992
    move-result-wide v12

    .line 993
    move v3, v1

    .line 994
    goto :goto_17

    .line 995
    :cond_30
    const-wide v16, 0xffffffffL

    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    const/16 v18, 0x20

    .line 1001
    .line 1002
    :goto_17
    invoke-virtual {v0}, Lfk6;->l()Lfk6;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    const-wide/16 v1, 0x0

    .line 1007
    .line 1008
    goto/16 :goto_c

    .line 1009
    .line 1010
    :cond_31
    move v13, v3

    .line 1011
    goto/16 :goto_4c

    .line 1012
    .line 1013
    :sswitch_4
    if-eqz v3, :cond_32

    .line 1014
    .line 1015
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 1016
    .line 1017
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    goto :goto_18

    .line 1022
    :cond_32
    const/4 v0, 0x0

    .line 1023
    :goto_18
    sget-object v1, Lzj6;->k:Lnk6;

    .line 1024
    .line 1025
    invoke-virtual {v14, v1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    if-nez v1, :cond_33

    .line 1030
    .line 1031
    const/4 v13, 0x0

    .line 1032
    goto :goto_19

    .line 1033
    :cond_33
    move-object v13, v1

    .line 1034
    :goto_19
    check-cast v13, Lh4;

    .line 1035
    .line 1036
    if-eqz v13, :cond_e

    .line 1037
    .line 1038
    iget-object v1, v13, Lh4;->b:Lds2;

    .line 1039
    .line 1040
    check-cast v1, Lvr2;

    .line 1041
    .line 1042
    if-eqz v1, :cond_e

    .line 1043
    .line 1044
    new-instance v2, Lvl;

    .line 1045
    .line 1046
    if-nez v0, :cond_34

    .line 1047
    .line 1048
    const-string v0, ""

    .line 1049
    .line 1050
    :cond_34
    invoke-direct {v2, v0}, Lvl;-><init>(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-interface {v1, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    check-cast v0, Ljava/lang/Boolean;

    .line 1058
    .line 1059
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1060
    .line 1061
    .line 1062
    move-result v13

    .line 1063
    goto/16 :goto_4c

    .line 1064
    .line 1065
    :sswitch_5
    sget-object v0, Lzj6;->v:Lnk6;

    .line 1066
    .line 1067
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    if-nez v0, :cond_35

    .line 1072
    .line 1073
    const/4 v13, 0x0

    .line 1074
    goto :goto_1a

    .line 1075
    :cond_35
    move-object v13, v0

    .line 1076
    :goto_1a
    check-cast v13, Lh4;

    .line 1077
    .line 1078
    if-eqz v13, :cond_e

    .line 1079
    .line 1080
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1081
    .line 1082
    check-cast v0, Lsr2;

    .line 1083
    .line 1084
    if-eqz v0, :cond_e

    .line 1085
    .line 1086
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    check-cast v0, Ljava/lang/Boolean;

    .line 1091
    .line 1092
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v13

    .line 1096
    goto/16 :goto_4c

    .line 1097
    .line 1098
    :sswitch_6
    sget-object v0, Lzj6;->u:Lnk6;

    .line 1099
    .line 1100
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    if-nez v0, :cond_36

    .line 1105
    .line 1106
    const/4 v13, 0x0

    .line 1107
    goto :goto_1b

    .line 1108
    :cond_36
    move-object v13, v0

    .line 1109
    :goto_1b
    check-cast v13, Lh4;

    .line 1110
    .line 1111
    if-eqz v13, :cond_e

    .line 1112
    .line 1113
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1114
    .line 1115
    check-cast v0, Lsr2;

    .line 1116
    .line 1117
    if-eqz v0, :cond_e

    .line 1118
    .line 1119
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    check-cast v0, Ljava/lang/Boolean;

    .line 1124
    .line 1125
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1126
    .line 1127
    .line 1128
    move-result v13

    .line 1129
    goto/16 :goto_4c

    .line 1130
    .line 1131
    :sswitch_7
    sget-object v0, Lzj6;->t:Lnk6;

    .line 1132
    .line 1133
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    if-nez v0, :cond_37

    .line 1138
    .line 1139
    const/4 v13, 0x0

    .line 1140
    goto :goto_1c

    .line 1141
    :cond_37
    move-object v13, v0

    .line 1142
    :goto_1c
    check-cast v13, Lh4;

    .line 1143
    .line 1144
    if-eqz v13, :cond_e

    .line 1145
    .line 1146
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1147
    .line 1148
    check-cast v0, Lsr2;

    .line 1149
    .line 1150
    if-eqz v0, :cond_e

    .line 1151
    .line 1152
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    check-cast v0, Ljava/lang/Boolean;

    .line 1157
    .line 1158
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1159
    .line 1160
    .line 1161
    move-result v13

    .line 1162
    goto/16 :goto_4c

    .line 1163
    .line 1164
    :sswitch_8
    sget-object v0, Lzj6;->r:Lnk6;

    .line 1165
    .line 1166
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0

    .line 1170
    if-nez v0, :cond_38

    .line 1171
    .line 1172
    const/4 v13, 0x0

    .line 1173
    goto :goto_1d

    .line 1174
    :cond_38
    move-object v13, v0

    .line 1175
    :goto_1d
    check-cast v13, Lh4;

    .line 1176
    .line 1177
    if-eqz v13, :cond_e

    .line 1178
    .line 1179
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1180
    .line 1181
    check-cast v0, Lsr2;

    .line 1182
    .line 1183
    if-eqz v0, :cond_e

    .line 1184
    .line 1185
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    check-cast v0, Ljava/lang/Boolean;

    .line 1190
    .line 1191
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1192
    .line 1193
    .line 1194
    move-result v13

    .line 1195
    goto/16 :goto_4c

    .line 1196
    .line 1197
    :sswitch_9
    sget-object v0, Lzj6;->s:Lnk6;

    .line 1198
    .line 1199
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    if-nez v0, :cond_39

    .line 1204
    .line 1205
    const/4 v13, 0x0

    .line 1206
    goto :goto_1e

    .line 1207
    :cond_39
    move-object v13, v0

    .line 1208
    :goto_1e
    check-cast v13, Lh4;

    .line 1209
    .line 1210
    if-eqz v13, :cond_e

    .line 1211
    .line 1212
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1213
    .line 1214
    check-cast v0, Lsr2;

    .line 1215
    .line 1216
    if-eqz v0, :cond_e

    .line 1217
    .line 1218
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    check-cast v0, Ljava/lang/Boolean;

    .line 1223
    .line 1224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1225
    .line 1226
    .line 1227
    move-result v13

    .line 1228
    goto/16 :goto_4c

    .line 1229
    .line 1230
    :goto_1f
    const/16 v0, 0x1000

    .line 1231
    .line 1232
    if-ne v2, v0, :cond_3a

    .line 1233
    .line 1234
    const/4 v0, 0x1

    .line 1235
    goto :goto_20

    .line 1236
    :cond_3a
    const/4 v0, 0x0

    .line 1237
    :goto_20
    const/16 v1, 0x2000

    .line 1238
    .line 1239
    if-ne v2, v1, :cond_3b

    .line 1240
    .line 1241
    const/4 v1, 0x1

    .line 1242
    goto :goto_21

    .line 1243
    :cond_3b
    const/4 v1, 0x0

    .line 1244
    :goto_21
    const v3, 0x1020039

    .line 1245
    .line 1246
    .line 1247
    if-ne v2, v3, :cond_3c

    .line 1248
    .line 1249
    const/4 v3, 0x1

    .line 1250
    goto :goto_22

    .line 1251
    :cond_3c
    const/4 v3, 0x0

    .line 1252
    :goto_22
    const v5, 0x102003b

    .line 1253
    .line 1254
    .line 1255
    if-ne v2, v5, :cond_3d

    .line 1256
    .line 1257
    const/4 v5, 0x1

    .line 1258
    goto :goto_23

    .line 1259
    :cond_3d
    const/4 v5, 0x0

    .line 1260
    :goto_23
    const v6, 0x1020038

    .line 1261
    .line 1262
    .line 1263
    if-ne v2, v6, :cond_3e

    .line 1264
    .line 1265
    const/4 v6, 0x1

    .line 1266
    goto :goto_24

    .line 1267
    :cond_3e
    const/4 v6, 0x0

    .line 1268
    :goto_24
    const v7, 0x102003a

    .line 1269
    .line 1270
    .line 1271
    if-ne v2, v7, :cond_3f

    .line 1272
    .line 1273
    const/4 v2, 0x1

    .line 1274
    goto :goto_25

    .line 1275
    :cond_3f
    const/4 v2, 0x0

    .line 1276
    :goto_25
    if-nez v3, :cond_41

    .line 1277
    .line 1278
    if-nez v5, :cond_41

    .line 1279
    .line 1280
    if-nez v0, :cond_41

    .line 1281
    .line 1282
    if-eqz v1, :cond_40

    .line 1283
    .line 1284
    goto :goto_26

    .line 1285
    :cond_40
    const/4 v7, 0x0

    .line 1286
    goto :goto_27

    .line 1287
    :cond_41
    :goto_26
    const/4 v7, 0x1

    .line 1288
    :goto_27
    if-nez v6, :cond_43

    .line 1289
    .line 1290
    if-nez v2, :cond_43

    .line 1291
    .line 1292
    if-nez v0, :cond_43

    .line 1293
    .line 1294
    if-eqz v1, :cond_42

    .line 1295
    .line 1296
    goto :goto_28

    .line 1297
    :cond_42
    const/4 v13, 0x0

    .line 1298
    goto :goto_29

    .line 1299
    :cond_43
    :goto_28
    const/4 v13, 0x1

    .line 1300
    :goto_29
    if-nez v0, :cond_44

    .line 1301
    .line 1302
    if-eqz v1, :cond_4a

    .line 1303
    .line 1304
    :cond_44
    sget-object v0, Ljk6;->c:Lnk6;

    .line 1305
    .line 1306
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    if-nez v0, :cond_45

    .line 1311
    .line 1312
    const/4 v0, 0x0

    .line 1313
    :cond_45
    check-cast v0, Lmq5;

    .line 1314
    .line 1315
    sget-object v2, Lzj6;->i:Lnk6;

    .line 1316
    .line 1317
    invoke-virtual {v14, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    if-nez v2, :cond_46

    .line 1322
    .line 1323
    const/4 v2, 0x0

    .line 1324
    :cond_46
    check-cast v2, Lh4;

    .line 1325
    .line 1326
    if-eqz v0, :cond_4a

    .line 1327
    .line 1328
    iget-object v8, v0, Lmq5;->b:Lms0;

    .line 1329
    .line 1330
    if-eqz v2, :cond_4a

    .line 1331
    .line 1332
    iget v3, v8, Lms0;->a:F

    .line 1333
    .line 1334
    cmpg-float v4, v3, p0

    .line 1335
    .line 1336
    if-gez v4, :cond_47

    .line 1337
    .line 1338
    move/from16 v4, p0

    .line 1339
    .line 1340
    goto :goto_2a

    .line 1341
    :cond_47
    move v4, v3

    .line 1342
    :goto_2a
    cmpl-float v5, p0, v3

    .line 1343
    .line 1344
    if-lez v5, :cond_48

    .line 1345
    .line 1346
    move v15, v3

    .line 1347
    goto :goto_2b

    .line 1348
    :cond_48
    move/from16 v15, p0

    .line 1349
    .line 1350
    :goto_2b
    sub-float/2addr v4, v15

    .line 1351
    const/high16 v3, 0x41a00000    # 20.0f

    .line 1352
    .line 1353
    div-float/2addr v4, v3

    .line 1354
    if-eqz v1, :cond_49

    .line 1355
    .line 1356
    neg-float v4, v4

    .line 1357
    :cond_49
    iget-object v1, v2, Lh4;->b:Lds2;

    .line 1358
    .line 1359
    check-cast v1, Lvr2;

    .line 1360
    .line 1361
    if-eqz v1, :cond_e

    .line 1362
    .line 1363
    iget v0, v0, Lmq5;->a:F

    .line 1364
    .line 1365
    add-float/2addr v0, v4

    .line 1366
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v0

    .line 1370
    invoke-interface {v1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    check-cast v0, Ljava/lang/Boolean;

    .line 1375
    .line 1376
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v13

    .line 1380
    goto/16 :goto_4c

    .line 1381
    .line 1382
    :cond_4a
    iget-object v0, v10, Luy3;->a0:Lo00;

    .line 1383
    .line 1384
    iget-object v0, v0, Lo00;->d:Ljava/lang/Object;

    .line 1385
    .line 1386
    check-cast v0, Lhc3;

    .line 1387
    .line 1388
    invoke-static {v0}, Lt49;->u(Ldy3;)Lly5;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v0

    .line 1392
    invoke-virtual {v0}, Lly5;->c()J

    .line 1393
    .line 1394
    .line 1395
    move-result-wide v8

    .line 1396
    new-instance v0, Ljava/util/ArrayList;

    .line 1397
    .line 1398
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1399
    .line 1400
    .line 1401
    sget-object v2, Lzj6;->C:Lnk6;

    .line 1402
    .line 1403
    invoke-virtual {v14, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v2

    .line 1407
    if-nez v2, :cond_4b

    .line 1408
    .line 1409
    const/4 v2, 0x0

    .line 1410
    :cond_4b
    check-cast v2, Lh4;

    .line 1411
    .line 1412
    if-eqz v2, :cond_4c

    .line 1413
    .line 1414
    iget-object v2, v2, Lh4;->b:Lds2;

    .line 1415
    .line 1416
    check-cast v2, Lvr2;

    .line 1417
    .line 1418
    if-eqz v2, :cond_4c

    .line 1419
    .line 1420
    invoke-interface {v2, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v2

    .line 1424
    check-cast v2, Ljava/lang/Boolean;

    .line 1425
    .line 1426
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1427
    .line 1428
    .line 1429
    move-result v2

    .line 1430
    if-eqz v2, :cond_4c

    .line 1431
    .line 1432
    const/4 v2, 0x0

    .line 1433
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    check-cast v0, Ljava/lang/Float;

    .line 1438
    .line 1439
    goto :goto_2c

    .line 1440
    :cond_4c
    const/4 v0, 0x0

    .line 1441
    :goto_2c
    sget-object v2, Lzj6;->d:Lnk6;

    .line 1442
    .line 1443
    invoke-virtual {v14, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v2

    .line 1447
    if-nez v2, :cond_4d

    .line 1448
    .line 1449
    const/4 v2, 0x0

    .line 1450
    :cond_4d
    check-cast v2, Lh4;

    .line 1451
    .line 1452
    if-nez v2, :cond_4e

    .line 1453
    .line 1454
    goto/16 :goto_3

    .line 1455
    .line 1456
    :cond_4e
    iget-object v2, v2, Lh4;->b:Lds2;

    .line 1457
    .line 1458
    sget-object v11, Ljk6;->v:Lnk6;

    .line 1459
    .line 1460
    invoke-virtual {v14, v11}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v11

    .line 1464
    if-nez v11, :cond_4f

    .line 1465
    .line 1466
    const/4 v11, 0x0

    .line 1467
    :cond_4f
    check-cast v11, Lvg6;

    .line 1468
    .line 1469
    if-eqz v11, :cond_5a

    .line 1470
    .line 1471
    if-eqz v7, :cond_5a

    .line 1472
    .line 1473
    if-eqz v0, :cond_50

    .line 1474
    .line 1475
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1476
    .line 1477
    .line 1478
    move-result v7

    .line 1479
    move-object/from16 p2, v0

    .line 1480
    .line 1481
    move/from16 p1, v1

    .line 1482
    .line 1483
    goto :goto_2d

    .line 1484
    :cond_50
    move-object/from16 p2, v0

    .line 1485
    .line 1486
    move/from16 p1, v1

    .line 1487
    .line 1488
    shr-long v0, v8, v18

    .line 1489
    .line 1490
    long-to-int v0, v0

    .line 1491
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1492
    .line 1493
    .line 1494
    move-result v7

    .line 1495
    :goto_2d
    if-nez v3, :cond_51

    .line 1496
    .line 1497
    if-eqz p1, :cond_52

    .line 1498
    .line 1499
    :cond_51
    neg-float v7, v7

    .line 1500
    :cond_52
    iget-object v0, v10, Luy3;->U:Ley3;

    .line 1501
    .line 1502
    if-ne v0, v4, :cond_54

    .line 1503
    .line 1504
    if-nez v3, :cond_53

    .line 1505
    .line 1506
    if-eqz v5, :cond_54

    .line 1507
    .line 1508
    :cond_53
    neg-float v7, v7

    .line 1509
    :cond_54
    invoke-static {v11, v7}, Loe;->w(Lvg6;F)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v0

    .line 1513
    if-eqz v0, :cond_5b

    .line 1514
    .line 1515
    sget-object v0, Lzj6;->z:Lnk6;

    .line 1516
    .line 1517
    invoke-virtual {v14, v0}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1518
    .line 1519
    .line 1520
    move-result v1

    .line 1521
    if-nez v1, :cond_56

    .line 1522
    .line 1523
    sget-object v1, Lzj6;->B:Lnk6;

    .line 1524
    .line 1525
    invoke-virtual {v14, v1}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    move-result v1

    .line 1529
    if-eqz v1, :cond_55

    .line 1530
    .line 1531
    goto :goto_2e

    .line 1532
    :cond_55
    check-cast v2, Lgs2;

    .line 1533
    .line 1534
    if-eqz v2, :cond_e

    .line 1535
    .line 1536
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    invoke-interface {v2, v0, v15}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    check-cast v0, Ljava/lang/Boolean;

    .line 1545
    .line 1546
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1547
    .line 1548
    .line 1549
    move-result v13

    .line 1550
    goto/16 :goto_4c

    .line 1551
    .line 1552
    :cond_56
    :goto_2e
    cmpl-float v1, v7, p0

    .line 1553
    .line 1554
    if-lez v1, :cond_58

    .line 1555
    .line 1556
    sget-object v0, Lzj6;->B:Lnk6;

    .line 1557
    .line 1558
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v0

    .line 1562
    if-nez v0, :cond_57

    .line 1563
    .line 1564
    const/4 v13, 0x0

    .line 1565
    goto :goto_2f

    .line 1566
    :cond_57
    move-object v13, v0

    .line 1567
    :goto_2f
    check-cast v13, Lh4;

    .line 1568
    .line 1569
    goto :goto_31

    .line 1570
    :cond_58
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v0

    .line 1574
    if-nez v0, :cond_59

    .line 1575
    .line 1576
    const/4 v13, 0x0

    .line 1577
    goto :goto_30

    .line 1578
    :cond_59
    move-object v13, v0

    .line 1579
    :goto_30
    check-cast v13, Lh4;

    .line 1580
    .line 1581
    :goto_31
    if-eqz v13, :cond_e

    .line 1582
    .line 1583
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1584
    .line 1585
    check-cast v0, Lsr2;

    .line 1586
    .line 1587
    if-eqz v0, :cond_e

    .line 1588
    .line 1589
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v0

    .line 1593
    check-cast v0, Ljava/lang/Boolean;

    .line 1594
    .line 1595
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1596
    .line 1597
    .line 1598
    move-result v13

    .line 1599
    goto/16 :goto_4c

    .line 1600
    .line 1601
    :cond_5a
    move-object/from16 p2, v0

    .line 1602
    .line 1603
    move/from16 p1, v1

    .line 1604
    .line 1605
    :cond_5b
    sget-object v0, Ljk6;->w:Lnk6;

    .line 1606
    .line 1607
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v0

    .line 1611
    if-nez v0, :cond_5c

    .line 1612
    .line 1613
    const/4 v0, 0x0

    .line 1614
    :cond_5c
    check-cast v0, Lvg6;

    .line 1615
    .line 1616
    if-eqz v0, :cond_e

    .line 1617
    .line 1618
    if-eqz v13, :cond_e

    .line 1619
    .line 1620
    if-eqz p2, :cond_5d

    .line 1621
    .line 1622
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    .line 1623
    .line 1624
    .line 1625
    move-result v1

    .line 1626
    goto :goto_32

    .line 1627
    :cond_5d
    and-long v3, v8, v16

    .line 1628
    .line 1629
    long-to-int v1, v3

    .line 1630
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1631
    .line 1632
    .line 1633
    move-result v1

    .line 1634
    :goto_32
    if-nez v6, :cond_5e

    .line 1635
    .line 1636
    if-eqz p1, :cond_5f

    .line 1637
    .line 1638
    :cond_5e
    neg-float v1, v1

    .line 1639
    :cond_5f
    invoke-static {v0, v1}, Loe;->w(Lvg6;F)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v0

    .line 1643
    if-eqz v0, :cond_e

    .line 1644
    .line 1645
    sget-object v0, Lzj6;->y:Lnk6;

    .line 1646
    .line 1647
    invoke-virtual {v14, v0}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v3

    .line 1651
    if-nez v3, :cond_61

    .line 1652
    .line 1653
    sget-object v3, Lzj6;->A:Lnk6;

    .line 1654
    .line 1655
    invoke-virtual {v14, v3}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1656
    .line 1657
    .line 1658
    move-result v3

    .line 1659
    if-eqz v3, :cond_60

    .line 1660
    .line 1661
    goto :goto_33

    .line 1662
    :cond_60
    check-cast v2, Lgs2;

    .line 1663
    .line 1664
    if-eqz v2, :cond_e

    .line 1665
    .line 1666
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v0

    .line 1670
    invoke-interface {v2, v15, v0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v0

    .line 1674
    check-cast v0, Ljava/lang/Boolean;

    .line 1675
    .line 1676
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1677
    .line 1678
    .line 1679
    move-result v13

    .line 1680
    goto/16 :goto_4c

    .line 1681
    .line 1682
    :cond_61
    :goto_33
    cmpl-float v1, v1, p0

    .line 1683
    .line 1684
    if-lez v1, :cond_63

    .line 1685
    .line 1686
    sget-object v0, Lzj6;->A:Lnk6;

    .line 1687
    .line 1688
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    if-nez v0, :cond_62

    .line 1693
    .line 1694
    const/4 v13, 0x0

    .line 1695
    goto :goto_34

    .line 1696
    :cond_62
    move-object v13, v0

    .line 1697
    :goto_34
    check-cast v13, Lh4;

    .line 1698
    .line 1699
    goto :goto_36

    .line 1700
    :cond_63
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    if-nez v0, :cond_64

    .line 1705
    .line 1706
    const/4 v13, 0x0

    .line 1707
    goto :goto_35

    .line 1708
    :cond_64
    move-object v13, v0

    .line 1709
    :goto_35
    check-cast v13, Lh4;

    .line 1710
    .line 1711
    :goto_36
    if-eqz v13, :cond_e

    .line 1712
    .line 1713
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1714
    .line 1715
    check-cast v0, Lsr2;

    .line 1716
    .line 1717
    if-eqz v0, :cond_e

    .line 1718
    .line 1719
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v0

    .line 1723
    check-cast v0, Ljava/lang/Boolean;

    .line 1724
    .line 1725
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1726
    .line 1727
    .line 1728
    move-result v13

    .line 1729
    goto/16 :goto_4c

    .line 1730
    .line 1731
    :sswitch_a
    sget-object v0, Lzj6;->c:Lnk6;

    .line 1732
    .line 1733
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    if-nez v0, :cond_65

    .line 1738
    .line 1739
    const/4 v13, 0x0

    .line 1740
    goto :goto_37

    .line 1741
    :cond_65
    move-object v13, v0

    .line 1742
    :goto_37
    check-cast v13, Lh4;

    .line 1743
    .line 1744
    if-eqz v13, :cond_e

    .line 1745
    .line 1746
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1747
    .line 1748
    check-cast v0, Lsr2;

    .line 1749
    .line 1750
    if-eqz v0, :cond_e

    .line 1751
    .line 1752
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0

    .line 1756
    check-cast v0, Ljava/lang/Boolean;

    .line 1757
    .line 1758
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1759
    .line 1760
    .line 1761
    move-result v13

    .line 1762
    goto/16 :goto_4c

    .line 1763
    .line 1764
    :sswitch_b
    sget-object v2, Lzj6;->b:Lnk6;

    .line 1765
    .line 1766
    invoke-virtual {v14, v2}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v2

    .line 1770
    if-nez v2, :cond_66

    .line 1771
    .line 1772
    const/4 v2, 0x0

    .line 1773
    :cond_66
    check-cast v2, Lh4;

    .line 1774
    .line 1775
    if-eqz v2, :cond_67

    .line 1776
    .line 1777
    iget-object v2, v2, Lh4;->b:Lds2;

    .line 1778
    .line 1779
    check-cast v2, Lsr2;

    .line 1780
    .line 1781
    if-eqz v2, :cond_67

    .line 1782
    .line 1783
    invoke-interface {v2}, Lsr2;->b()Ljava/lang/Object;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v2

    .line 1787
    check-cast v2, Ljava/lang/Boolean;

    .line 1788
    .line 1789
    move-object/from16 v23, v2

    .line 1790
    .line 1791
    :goto_38
    const/4 v2, 0x1

    .line 1792
    const/4 v3, 0x0

    .line 1793
    goto :goto_39

    .line 1794
    :cond_67
    const/16 v23, 0x0

    .line 1795
    .line 1796
    goto :goto_38

    .line 1797
    :goto_39
    invoke-static {v0, v1, v2, v3, v7}, Loe;->D(Loe;IILjava/lang/Integer;I)V

    .line 1798
    .line 1799
    .line 1800
    if-eqz v23, :cond_e

    .line 1801
    .line 1802
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1803
    .line 1804
    .line 1805
    move-result v13

    .line 1806
    goto/16 :goto_4c

    .line 1807
    .line 1808
    :cond_68
    sget-object v0, Ljk6;->l:Lnk6;

    .line 1809
    .line 1810
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v0

    .line 1814
    if-nez v0, :cond_69

    .line 1815
    .line 1816
    const/4 v0, 0x0

    .line 1817
    :cond_69
    invoke-static {v0, v13}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1818
    .line 1819
    .line 1820
    move-result v0

    .line 1821
    if-eqz v0, :cond_e

    .line 1822
    .line 1823
    invoke-virtual {v5}, Lje;->getFocusOwner()Lik2;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v0

    .line 1827
    check-cast v0, Llk2;

    .line 1828
    .line 1829
    const/4 v1, 0x0

    .line 1830
    const/4 v2, 0x1

    .line 1831
    invoke-virtual {v0, v4, v1, v2}, Llk2;->c(IZZ)Z

    .line 1832
    .line 1833
    .line 1834
    const/4 v13, 0x1

    .line 1835
    goto/16 :goto_4c

    .line 1836
    .line 1837
    :cond_6a
    invoke-virtual {v5}, Landroid/view/View;->isInTouchMode()Z

    .line 1838
    .line 1839
    .line 1840
    move-result v0

    .line 1841
    if-eqz v0, :cond_6b

    .line 1842
    .line 1843
    invoke-virtual {v5}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 1844
    .line 1845
    .line 1846
    :cond_6b
    sget-object v0, Lzj6;->w:Lnk6;

    .line 1847
    .line 1848
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    if-nez v0, :cond_6c

    .line 1853
    .line 1854
    const/4 v13, 0x0

    .line 1855
    goto :goto_3a

    .line 1856
    :cond_6c
    move-object v13, v0

    .line 1857
    :goto_3a
    check-cast v13, Lh4;

    .line 1858
    .line 1859
    if-eqz v13, :cond_e

    .line 1860
    .line 1861
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1862
    .line 1863
    check-cast v0, Lsr2;

    .line 1864
    .line 1865
    if-eqz v0, :cond_e

    .line 1866
    .line 1867
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v0

    .line 1871
    check-cast v0, Ljava/lang/Boolean;

    .line 1872
    .line 1873
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1874
    .line 1875
    .line 1876
    move-result v13

    .line 1877
    goto/16 :goto_4c

    .line 1878
    .line 1879
    :cond_6d
    if-eqz v3, :cond_6e

    .line 1880
    .line 1881
    const-string v1, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 1882
    .line 1883
    const/4 v2, -0x1

    .line 1884
    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1885
    .line 1886
    .line 1887
    move-result v20

    .line 1888
    move/from16 v1, v20

    .line 1889
    .line 1890
    goto :goto_3b

    .line 1891
    :cond_6e
    const/4 v2, -0x1

    .line 1892
    move v1, v2

    .line 1893
    :goto_3b
    if-eqz v3, :cond_6f

    .line 1894
    .line 1895
    const-string v4, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 1896
    .line 1897
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1898
    .line 1899
    .line 1900
    move-result v9

    .line 1901
    :goto_3c
    const/4 v2, 0x0

    .line 1902
    goto :goto_3d

    .line 1903
    :cond_6f
    const/4 v9, -0x1

    .line 1904
    goto :goto_3c

    .line 1905
    :goto_3d
    invoke-virtual {v0, v11, v1, v9, v2}, Loe;->J(Lfk6;IIZ)Z

    .line 1906
    .line 1907
    .line 1908
    move-result v13

    .line 1909
    if-eqz v13, :cond_95

    .line 1910
    .line 1911
    invoke-virtual {v0, v6}, Loe;->z(I)I

    .line 1912
    .line 1913
    .line 1914
    move-result v1

    .line 1915
    const/4 v3, 0x0

    .line 1916
    invoke-static {v0, v1, v2, v3, v7}, Loe;->D(Loe;IILjava/lang/Integer;I)V

    .line 1917
    .line 1918
    .line 1919
    goto/16 :goto_4c

    .line 1920
    .line 1921
    :cond_70
    sget-object v0, Lzj6;->q:Lnk6;

    .line 1922
    .line 1923
    invoke-virtual {v14, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v0

    .line 1927
    if-nez v0, :cond_71

    .line 1928
    .line 1929
    const/4 v13, 0x0

    .line 1930
    goto :goto_3e

    .line 1931
    :cond_71
    move-object v13, v0

    .line 1932
    :goto_3e
    check-cast v13, Lh4;

    .line 1933
    .line 1934
    if-eqz v13, :cond_e

    .line 1935
    .line 1936
    iget-object v0, v13, Lh4;->b:Lds2;

    .line 1937
    .line 1938
    check-cast v0, Lsr2;

    .line 1939
    .line 1940
    if-eqz v0, :cond_e

    .line 1941
    .line 1942
    invoke-interface {v0}, Lsr2;->b()Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v0

    .line 1946
    check-cast v0, Ljava/lang/Boolean;

    .line 1947
    .line 1948
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1949
    .line 1950
    .line 1951
    move-result v13

    .line 1952
    goto/16 :goto_4c

    .line 1953
    .line 1954
    :cond_72
    if-eqz v3, :cond_e

    .line 1955
    .line 1956
    const-string v1, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1957
    .line 1958
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1959
    .line 1960
    .line 1961
    move-result v1

    .line 1962
    const-string v7, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1963
    .line 1964
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1965
    .line 1966
    .line 1967
    move-result v3

    .line 1968
    if-ne v2, v12, :cond_73

    .line 1969
    .line 1970
    const/4 v2, 0x1

    .line 1971
    goto :goto_3f

    .line 1972
    :cond_73
    const/4 v2, 0x0

    .line 1973
    :goto_3f
    iget-object v7, v0, Loe;->Q:Ljava/lang/Integer;

    .line 1974
    .line 1975
    if-nez v7, :cond_74

    .line 1976
    .line 1977
    :goto_40
    const/4 v7, -0x1

    .line 1978
    goto :goto_41

    .line 1979
    :cond_74
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1980
    .line 1981
    .line 1982
    move-result v7

    .line 1983
    if-eq v6, v7, :cond_75

    .line 1984
    .line 1985
    goto :goto_40

    .line 1986
    :goto_41
    iput v7, v0, Loe;->P:I

    .line 1987
    .line 1988
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v6

    .line 1992
    iput-object v6, v0, Loe;->Q:Ljava/lang/Integer;

    .line 1993
    .line 1994
    :cond_75
    invoke-static {v11}, Loe;->s(Lfk6;)Ljava/lang/String;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v6

    .line 1998
    if-eqz v6, :cond_e

    .line 1999
    .line 2000
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2001
    .line 2002
    .line 2003
    move-result v7

    .line 2004
    if-nez v7, :cond_76

    .line 2005
    .line 2006
    goto/16 :goto_3

    .line 2007
    .line 2008
    :cond_76
    invoke-static {v11}, Loe;->s(Lfk6;)Ljava/lang/String;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v7

    .line 2012
    if-eqz v7, :cond_78

    .line 2013
    .line 2014
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2015
    .line 2016
    .line 2017
    move-result v10

    .line 2018
    if-nez v10, :cond_77

    .line 2019
    .line 2020
    goto :goto_42

    .line 2021
    :cond_77
    const/4 v10, 0x1

    .line 2022
    if-eq v1, v10, :cond_83

    .line 2023
    .line 2024
    const/4 v10, 0x2

    .line 2025
    if-eq v1, v10, :cond_81

    .line 2026
    .line 2027
    const/4 v5, 0x4

    .line 2028
    if-eq v1, v5, :cond_7b

    .line 2029
    .line 2030
    if-eq v1, v4, :cond_79

    .line 2031
    .line 2032
    const/16 v4, 0x10

    .line 2033
    .line 2034
    if-eq v1, v4, :cond_7b

    .line 2035
    .line 2036
    :cond_78
    :goto_42
    const/4 v13, 0x0

    .line 2037
    goto/16 :goto_43

    .line 2038
    .line 2039
    :cond_79
    sget-object v4, Lo4;->c:Lo4;

    .line 2040
    .line 2041
    if-nez v4, :cond_7a

    .line 2042
    .line 2043
    new-instance v4, Lo4;

    .line 2044
    .line 2045
    invoke-direct {v4}, Lf1;-><init>()V

    .line 2046
    .line 2047
    .line 2048
    sput-object v4, Lo4;->c:Lo4;

    .line 2049
    .line 2050
    :cond_7a
    sget-object v13, Lo4;->c:Lo4;

    .line 2051
    .line 2052
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2053
    .line 2054
    .line 2055
    iput-object v7, v13, Lf1;->a:Ljava/lang/Object;

    .line 2056
    .line 2057
    goto/16 :goto_43

    .line 2058
    .line 2059
    :cond_7b
    sget-object v4, Lzj6;->a:Lnk6;

    .line 2060
    .line 2061
    invoke-virtual {v14, v4}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2062
    .line 2063
    .line 2064
    move-result v4

    .line 2065
    if-nez v4, :cond_7c

    .line 2066
    .line 2067
    goto :goto_42

    .line 2068
    :cond_7c
    invoke-static {v9}, Li75;->f(Lak6;)Lbg7;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v4

    .line 2072
    if-nez v4, :cond_7d

    .line 2073
    .line 2074
    goto :goto_42

    .line 2075
    :cond_7d
    if-ne v1, v5, :cond_7f

    .line 2076
    .line 2077
    sget-object v5, Lm4;->g:Lm4;

    .line 2078
    .line 2079
    if-nez v5, :cond_7e

    .line 2080
    .line 2081
    new-instance v5, Lm4;

    .line 2082
    .line 2083
    const/4 v10, 0x2

    .line 2084
    invoke-direct {v5, v10}, Lm4;-><init>(I)V

    .line 2085
    .line 2086
    .line 2087
    sput-object v5, Lm4;->g:Lm4;

    .line 2088
    .line 2089
    :cond_7e
    sget-object v13, Lm4;->g:Lm4;

    .line 2090
    .line 2091
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2092
    .line 2093
    .line 2094
    iput-object v7, v13, Lf1;->a:Ljava/lang/Object;

    .line 2095
    .line 2096
    iput-object v4, v13, Lm4;->d:Ljava/lang/Object;

    .line 2097
    .line 2098
    goto :goto_43

    .line 2099
    :cond_7f
    sget-object v5, Ln4;->e:Ln4;

    .line 2100
    .line 2101
    if-nez v5, :cond_80

    .line 2102
    .line 2103
    new-instance v5, Ln4;

    .line 2104
    .line 2105
    invoke-direct {v5}, Lf1;-><init>()V

    .line 2106
    .line 2107
    .line 2108
    new-instance v9, Landroid/graphics/Rect;

    .line 2109
    .line 2110
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 2111
    .line 2112
    .line 2113
    sput-object v5, Ln4;->e:Ln4;

    .line 2114
    .line 2115
    :cond_80
    sget-object v13, Ln4;->e:Ln4;

    .line 2116
    .line 2117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2118
    .line 2119
    .line 2120
    iput-object v7, v13, Lf1;->a:Ljava/lang/Object;

    .line 2121
    .line 2122
    iput-object v4, v13, Ln4;->c:Lbg7;

    .line 2123
    .line 2124
    iput-object v11, v13, Ln4;->d:Lfk6;

    .line 2125
    .line 2126
    goto :goto_43

    .line 2127
    :cond_81
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v4

    .line 2131
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v4

    .line 2135
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v4

    .line 2139
    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2140
    .line 2141
    sget-object v5, Lm4;->f:Lm4;

    .line 2142
    .line 2143
    if-nez v5, :cond_82

    .line 2144
    .line 2145
    new-instance v5, Lm4;

    .line 2146
    .line 2147
    const/4 v10, 0x1

    .line 2148
    invoke-direct {v5, v10}, Lm4;-><init>(I)V

    .line 2149
    .line 2150
    .line 2151
    invoke-static {v4}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2152
    .line 2153
    .line 2154
    move-result-object v4

    .line 2155
    iput-object v4, v5, Lm4;->d:Ljava/lang/Object;

    .line 2156
    .line 2157
    sput-object v5, Lm4;->f:Lm4;

    .line 2158
    .line 2159
    :cond_82
    sget-object v13, Lm4;->f:Lm4;

    .line 2160
    .line 2161
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {v13, v7}, Lm4;->t(Ljava/lang/String;)V

    .line 2165
    .line 2166
    .line 2167
    goto :goto_43

    .line 2168
    :cond_83
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v4

    .line 2172
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v4

    .line 2176
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v4

    .line 2180
    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 2181
    .line 2182
    sget-object v5, Lm4;->e:Lm4;

    .line 2183
    .line 2184
    if-nez v5, :cond_84

    .line 2185
    .line 2186
    new-instance v5, Lm4;

    .line 2187
    .line 2188
    const/4 v9, 0x0

    .line 2189
    invoke-direct {v5, v9}, Lm4;-><init>(I)V

    .line 2190
    .line 2191
    .line 2192
    invoke-static {v4}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v4

    .line 2196
    iput-object v4, v5, Lm4;->d:Ljava/lang/Object;

    .line 2197
    .line 2198
    sput-object v5, Lm4;->e:Lm4;

    .line 2199
    .line 2200
    :cond_84
    sget-object v13, Lm4;->e:Lm4;

    .line 2201
    .line 2202
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2203
    .line 2204
    .line 2205
    invoke-virtual {v13, v7}, Lm4;->t(Ljava/lang/String;)V

    .line 2206
    .line 2207
    .line 2208
    :goto_43
    if-nez v13, :cond_85

    .line 2209
    .line 2210
    goto/16 :goto_3

    .line 2211
    .line 2212
    :cond_85
    invoke-virtual {v0, v11}, Loe;->p(Lfk6;)I

    .line 2213
    .line 2214
    .line 2215
    move-result v4

    .line 2216
    const/4 v7, -0x1

    .line 2217
    if-ne v4, v7, :cond_87

    .line 2218
    .line 2219
    if-eqz v2, :cond_86

    .line 2220
    .line 2221
    const/4 v4, 0x0

    .line 2222
    goto :goto_44

    .line 2223
    :cond_86
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2224
    .line 2225
    .line 2226
    move-result v4

    .line 2227
    :cond_87
    :goto_44
    if-eqz v2, :cond_88

    .line 2228
    .line 2229
    invoke-virtual {v13, v4}, Lf1;->e(I)[I

    .line 2230
    .line 2231
    .line 2232
    move-result-object v4

    .line 2233
    goto :goto_45

    .line 2234
    :cond_88
    invoke-virtual {v13, v4}, Lf1;->q(I)[I

    .line 2235
    .line 2236
    .line 2237
    move-result-object v4

    .line 2238
    :goto_45
    if-nez v4, :cond_89

    .line 2239
    .line 2240
    goto/16 :goto_3

    .line 2241
    .line 2242
    :cond_89
    const/16 v21, 0x0

    .line 2243
    .line 2244
    aget v22, v4, v21

    .line 2245
    .line 2246
    const/16 v26, 0x1

    .line 2247
    .line 2248
    aget v23, v4, v26

    .line 2249
    .line 2250
    if-eqz v3, :cond_8d

    .line 2251
    .line 2252
    sget-object v3, Ljk6;->a:Lnk6;

    .line 2253
    .line 2254
    invoke-virtual {v14, v3}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2255
    .line 2256
    .line 2257
    move-result v3

    .line 2258
    if-nez v3, :cond_8d

    .line 2259
    .line 2260
    sget-object v3, Ljk6;->G:Lnk6;

    .line 2261
    .line 2262
    invoke-virtual {v14, v3}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2263
    .line 2264
    .line 2265
    move-result v3

    .line 2266
    if-eqz v3, :cond_8d

    .line 2267
    .line 2268
    invoke-virtual {v0, v11}, Loe;->q(Lfk6;)I

    .line 2269
    .line 2270
    .line 2271
    move-result v3

    .line 2272
    const/4 v7, -0x1

    .line 2273
    if-ne v3, v7, :cond_8b

    .line 2274
    .line 2275
    if-eqz v2, :cond_8a

    .line 2276
    .line 2277
    move/from16 v3, v22

    .line 2278
    .line 2279
    goto :goto_46

    .line 2280
    :cond_8a
    move/from16 v3, v23

    .line 2281
    .line 2282
    :cond_8b
    :goto_46
    if-eqz v2, :cond_8c

    .line 2283
    .line 2284
    move/from16 v4, v23

    .line 2285
    .line 2286
    goto :goto_48

    .line 2287
    :cond_8c
    move/from16 v4, v22

    .line 2288
    .line 2289
    goto :goto_48

    .line 2290
    :cond_8d
    if-eqz v2, :cond_8e

    .line 2291
    .line 2292
    move/from16 v3, v23

    .line 2293
    .line 2294
    goto :goto_47

    .line 2295
    :cond_8e
    move/from16 v3, v22

    .line 2296
    .line 2297
    :goto_47
    move v4, v3

    .line 2298
    :goto_48
    if-eqz v2, :cond_8f

    .line 2299
    .line 2300
    move/from16 v20, v12

    .line 2301
    .line 2302
    goto :goto_49

    .line 2303
    :cond_8f
    move/from16 v20, v8

    .line 2304
    .line 2305
    :goto_49
    new-instance v18, Lle;

    .line 2306
    .line 2307
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2308
    .line 2309
    .line 2310
    move-result-wide v24

    .line 2311
    move/from16 v21, v1

    .line 2312
    .line 2313
    move-object/from16 v19, v11

    .line 2314
    .line 2315
    invoke-direct/range {v18 .. v25}, Lle;-><init>(Lfk6;IIIIJ)V

    .line 2316
    .line 2317
    .line 2318
    move-object/from16 v2, v18

    .line 2319
    .line 2320
    move-object/from16 v1, v19

    .line 2321
    .line 2322
    iput-object v2, v0, Loe;->V:Lle;

    .line 2323
    .line 2324
    const/4 v2, 0x1

    .line 2325
    invoke-virtual {v0, v1, v3, v4, v2}, Loe;->J(Lfk6;IIZ)Z

    .line 2326
    .line 2327
    .line 2328
    :goto_4a
    move v13, v2

    .line 2329
    goto :goto_4c

    .line 2330
    :cond_90
    const/4 v2, 0x1

    .line 2331
    const/16 v21, 0x0

    .line 2332
    .line 2333
    iget v3, v0, Loe;->G:I

    .line 2334
    .line 2335
    if-ne v3, v1, :cond_91

    .line 2336
    .line 2337
    const/high16 v3, -0x80000000

    .line 2338
    .line 2339
    iput v3, v0, Loe;->G:I

    .line 2340
    .line 2341
    const/4 v3, 0x0

    .line 2342
    iput-object v3, v0, Loe;->I:Lc5;

    .line 2343
    .line 2344
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 2345
    .line 2346
    .line 2347
    const/high16 v6, 0x10000

    .line 2348
    .line 2349
    invoke-static {v0, v1, v6, v3, v7}, Loe;->D(Loe;IILjava/lang/Integer;I)V

    .line 2350
    .line 2351
    .line 2352
    goto :goto_4a

    .line 2353
    :cond_91
    :goto_4b
    move/from16 v13, v21

    .line 2354
    .line 2355
    goto :goto_4c

    .line 2356
    :cond_92
    const/4 v2, 0x1

    .line 2357
    const/4 v3, 0x0

    .line 2358
    const/high16 v6, 0x10000

    .line 2359
    .line 2360
    const/16 v21, 0x0

    .line 2361
    .line 2362
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 2363
    .line 2364
    .line 2365
    move-result v8

    .line 2366
    if-eqz v8, :cond_91

    .line 2367
    .line 2368
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 2369
    .line 2370
    .line 2371
    move-result v4

    .line 2372
    if-eqz v4, :cond_91

    .line 2373
    .line 2374
    iget v4, v0, Loe;->G:I

    .line 2375
    .line 2376
    if-ne v4, v1, :cond_93

    .line 2377
    .line 2378
    goto :goto_4b

    .line 2379
    :cond_93
    const/high16 v8, -0x80000000

    .line 2380
    .line 2381
    if-eq v4, v8, :cond_94

    .line 2382
    .line 2383
    invoke-static {v0, v4, v6, v3, v7}, Loe;->D(Loe;IILjava/lang/Integer;I)V

    .line 2384
    .line 2385
    .line 2386
    :cond_94
    iput v1, v0, Loe;->G:I

    .line 2387
    .line 2388
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 2389
    .line 2390
    .line 2391
    const v4, 0x8000

    .line 2392
    .line 2393
    .line 2394
    invoke-static {v0, v1, v4, v3, v7}, Loe;->D(Loe;IILjava/lang/Integer;I)V

    .line 2395
    .line 2396
    .line 2397
    goto :goto_4a

    .line 2398
    :cond_95
    :goto_4c
    return v13

    .line 2399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_0
        0x8000 -> :sswitch_9
        0x10000 -> :sswitch_8
        0x40000 -> :sswitch_7
        0x80000 -> :sswitch_6
        0x100000 -> :sswitch_5
        0x200000 -> :sswitch_4
        0x1020036 -> :sswitch_3
        0x102003d -> :sswitch_2
        0x1020054 -> :sswitch_1
    .end sparse-switch

    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    :pswitch_data_1
    .packed-switch 0x1020038
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    :pswitch_data_2
    .packed-switch 0x1020046
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
.end method

.method public e(ILc5;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget v0, p0, Lke;->C:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Lke;->D:Lk4;

    .line 8
    .line 9
    check-cast p0, Loe;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Loe;->j(ILc5;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final n(I)Lc5;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lke;->C:I

    .line 6
    .line 7
    iget-object v0, v0, Lke;->D:Lk4;

    .line 8
    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljp0;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljp0;->n(I)Lc5;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lc5;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 19
    .line 20
    invoke-static {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lc5;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lc5;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    const/4 v2, 0x0

    .line 31
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v0, Loe;

    .line 36
    .line 37
    iget-object v4, v0, Loe;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 38
    .line 39
    iget-object v5, v0, Loe;->z:Lje;

    .line 40
    .line 41
    invoke-virtual {v5}, Lje;->getComposeViewContext()Lyx0;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Lyx0;->c()Lt54;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-interface {v6}, Lt54;->k()Lin8;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v6}, Lin8;->G0()Lk54;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Lk54;->w:Lk54;

    .line 58
    .line 59
    if-ne v6, v7, :cond_1

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v8, Lc5;

    .line 72
    .line 73
    invoke-direct {v8, v2}, Lc5;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const/4 v8, 0x0

    .line 78
    :goto_0
    move-object v11, v0

    .line 79
    move v6, v1

    .line 80
    goto/16 :goto_50

    .line 81
    .line 82
    :cond_1
    invoke-virtual {v0}, Loe;->r()Lme3;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6, v1}, Lme3;->b(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Lhk6;

    .line 91
    .line 92
    if-nez v6, :cond_2

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_0

    .line 99
    .line 100
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v8, Lc5;

    .line 105
    .line 106
    invoke-direct {v8, v2}, Lc5;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    iget-object v7, v6, Lhk6;->a:Lfk6;

    .line 111
    .line 112
    invoke-virtual {v7}, Lfk6;->k()Lak6;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    iget-object v10, v7, Lfk6;->c:Luy3;

    .line 117
    .line 118
    sget-object v11, Ljk6;->o:Lnk6;

    .line 119
    .line 120
    iget-object v9, v9, Lak6;->w:Ltp4;

    .line 121
    .line 122
    invoke-virtual {v9, v11}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    if-nez v9, :cond_3

    .line 127
    .line 128
    const/4 v9, 0x0

    .line 129
    :cond_3
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-static {v9, v11}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    const/16 v12, 0x22

    .line 136
    .line 137
    if-eqz v9, :cond_5

    .line 138
    .line 139
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    if-lt v13, v12, :cond_4

    .line 142
    .line 143
    invoke-static {v4}, Ll4;->j(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    goto :goto_1

    .line 148
    :cond_4
    const/4 v13, 0x1

    .line 149
    :goto_1
    if-nez v13, :cond_5

    .line 150
    .line 151
    move-object v11, v0

    .line 152
    move v6, v1

    .line 153
    const/4 v8, 0x0

    .line 154
    goto/16 :goto_50

    .line 155
    .line 156
    :cond_5
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    new-instance v14, Lc5;

    .line 161
    .line 162
    invoke-direct {v14, v13}, Lc5;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 163
    .line 164
    .line 165
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 166
    .line 167
    if-lt v15, v12, :cond_6

    .line 168
    .line 169
    invoke-static {v13, v9}, Ll4;->l(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 170
    .line 171
    .line 172
    move/from16 p0, v2

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    move/from16 p0, v2

    .line 176
    .line 177
    const/16 v2, 0x40

    .line 178
    .line 179
    invoke-virtual {v14, v2, v9}, Lc5;->h(IZ)V

    .line 180
    .line 181
    .line 182
    :goto_2
    const/4 v2, -0x1

    .line 183
    if-ne v1, v2, :cond_8

    .line 184
    .line 185
    invoke-virtual {v5}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    instance-of v8, v9, Landroid/view/View;

    .line 192
    .line 193
    if-eqz v8, :cond_7

    .line 194
    .line 195
    check-cast v9, Landroid/view/View;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    move-object/from16 v9, v16

    .line 199
    .line 200
    :goto_3
    iput v2, v14, Lc5;->b:I

    .line 201
    .line 202
    invoke-virtual {v13, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_8
    const/16 v16, 0x0

    .line 207
    .line 208
    invoke-virtual {v7}, Lfk6;->l()Lfk6;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    if-eqz v8, :cond_9

    .line 213
    .line 214
    iget v8, v8, Lfk6;->f:I

    .line 215
    .line 216
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    goto :goto_4

    .line 221
    :cond_9
    move-object/from16 v8, v16

    .line 222
    .line 223
    :goto_4
    if-eqz v8, :cond_b4

    .line 224
    .line 225
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    invoke-virtual {v5}, Lje;->getSemanticsOwner()Lik6;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    invoke-virtual {v9}, Lik6;->a()Lfk6;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    iget v9, v9, Lfk6;->f:I

    .line 238
    .line 239
    if-ne v8, v9, :cond_a

    .line 240
    .line 241
    move v8, v2

    .line 242
    :cond_a
    iput v8, v14, Lc5;->b:I

    .line 243
    .line 244
    invoke-virtual {v13, v5, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 245
    .line 246
    .line 247
    :goto_5
    iput v1, v14, Lc5;->c:I

    .line 248
    .line 249
    invoke-virtual {v13, v5, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v6}, Loe;->k(Lhk6;)Landroid/graphics/Rect;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-virtual {v13, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 257
    .line 258
    .line 259
    iget-object v6, v0, Loe;->g0:Lwo4;

    .line 260
    .line 261
    iget-object v8, v0, Loe;->O:Lcz6;

    .line 262
    .line 263
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    const-string v11, "android.view.View"

    .line 272
    .line 273
    invoke-virtual {v14, v11}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    iget-object v11, v7, Lfk6;->d:Lak6;

    .line 277
    .line 278
    iget-object v2, v11, Lak6;->w:Ltp4;

    .line 279
    .line 280
    sget-object v12, Ljk6;->G:Lnk6;

    .line 281
    .line 282
    invoke-virtual {v2, v12}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v12

    .line 286
    if-eqz v12, :cond_b

    .line 287
    .line 288
    const-string v12, "android.widget.EditText"

    .line 289
    .line 290
    invoke-virtual {v14, v12}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    :cond_b
    sget-object v12, Ljk6;->C:Lnk6;

    .line 294
    .line 295
    invoke-virtual {v2, v12}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    if-eqz v12, :cond_c

    .line 300
    .line 301
    const-string v12, "android.widget.TextView"

    .line 302
    .line 303
    invoke-virtual {v14, v12}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 304
    .line 305
    .line 306
    :cond_c
    sget-object v12, Ljk6;->z:Lnk6;

    .line 307
    .line 308
    invoke-virtual {v2, v12}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v12

    .line 312
    if-nez v12, :cond_d

    .line 313
    .line 314
    move-object/from16 v12, v16

    .line 315
    .line 316
    :cond_d
    check-cast v12, Ls86;

    .line 317
    .line 318
    move-object/from16 v17, v3

    .line 319
    .line 320
    if-eqz v12, :cond_12

    .line 321
    .line 322
    iget v3, v12, Ls86;->a:I

    .line 323
    .line 324
    invoke-virtual {v7}, Lfk6;->o()Z

    .line 325
    .line 326
    .line 327
    move-result v20

    .line 328
    if-nez v20, :cond_e

    .line 329
    .line 330
    move-object/from16 v20, v4

    .line 331
    .line 332
    const/4 v4, 0x4

    .line 333
    invoke-static {v4, v7}, Lfk6;->j(ILfk6;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v18

    .line 337
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v18

    .line 341
    move-object/from16 v21, v8

    .line 342
    .line 343
    if-eqz v18, :cond_13

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_e
    move-object/from16 v20, v4

    .line 347
    .line 348
    const/4 v4, 0x4

    .line 349
    move-object/from16 v21, v8

    .line 350
    .line 351
    :goto_6
    const-string v8, "AccessibilityNodeInfo.roleDescription"

    .line 352
    .line 353
    if-ne v3, v4, :cond_f

    .line 354
    .line 355
    const v3, 0x7f1103a3

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v4, v8, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 367
    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_f
    const/4 v4, 0x2

    .line 371
    if-ne v3, v4, :cond_10

    .line 372
    .line 373
    const v3, 0x7f11039f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v9, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-virtual {v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-virtual {v4, v8, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 385
    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_10
    invoke-static {v3}, Li75;->p(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    const/4 v8, 0x5

    .line 393
    if-ne v3, v8, :cond_11

    .line 394
    .line 395
    invoke-virtual {v7}, Lfk6;->q()Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-nez v3, :cond_11

    .line 400
    .line 401
    iget-boolean v3, v11, Lak6;->y:Z

    .line 402
    .line 403
    if-eqz v3, :cond_13

    .line 404
    .line 405
    :cond_11
    invoke-virtual {v14, v4}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 406
    .line 407
    .line 408
    goto :goto_7

    .line 409
    :cond_12
    move-object/from16 v20, v4

    .line 410
    .line 411
    move-object/from16 v21, v8

    .line 412
    .line 413
    :cond_13
    :goto_7
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    invoke-virtual {v13, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 422
    .line 423
    .line 424
    invoke-static {v7}, Lwe;->A(Lfk6;)Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    invoke-virtual {v13, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setImportantForAccessibility(Z)V

    .line 429
    .line 430
    .line 431
    const/16 v3, 0x22

    .line 432
    .line 433
    if-lt v15, v3, :cond_14

    .line 434
    .line 435
    invoke-static/range {v20 .. v20}, Ll4;->j(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    :goto_8
    const/4 v4, 0x4

    .line 440
    goto :goto_9

    .line 441
    :cond_14
    const/4 v3, 0x1

    .line 442
    goto :goto_8

    .line 443
    :goto_9
    invoke-static {v4, v7}, Lfk6;->j(ILfk6;)Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    move/from16 v20, v3

    .line 452
    .line 453
    move-object/from16 v22, v10

    .line 454
    .line 455
    const/4 v3, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    :goto_a
    iget-object v10, v14, Lc5;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 458
    .line 459
    if-ge v15, v4, :cond_1b

    .line 460
    .line 461
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v23

    .line 465
    move/from16 v24, v4

    .line 466
    .line 467
    move-object/from16 v4, v23

    .line 468
    .line 469
    check-cast v4, Lfk6;

    .line 470
    .line 471
    move-object/from16 v23, v8

    .line 472
    .line 473
    invoke-virtual {v0}, Loe;->r()Lme3;

    .line 474
    .line 475
    .line 476
    move-result-object v8

    .line 477
    iget v4, v4, Lfk6;->f:I

    .line 478
    .line 479
    invoke-virtual {v8, v4}, Lme3;->a(I)Z

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    if-eqz v8, :cond_15

    .line 484
    .line 485
    invoke-virtual {v5}, Lje;->getAndroidViewsHandler()Llj;

    .line 486
    .line 487
    .line 488
    const/4 v8, -0x1

    .line 489
    if-ne v4, v8, :cond_16

    .line 490
    .line 491
    :cond_15
    move/from16 v25, v15

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_16
    invoke-virtual {v0}, Loe;->r()Lme3;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    invoke-virtual {v8, v4}, Lme3;->b(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v8

    .line 502
    check-cast v8, Lhk6;

    .line 503
    .line 504
    if-eqz v8, :cond_18

    .line 505
    .line 506
    iget-object v8, v8, Lhk6;->a:Lfk6;

    .line 507
    .line 508
    if-eqz v8, :cond_18

    .line 509
    .line 510
    invoke-virtual {v8}, Lfk6;->k()Lak6;

    .line 511
    .line 512
    .line 513
    move-result-object v8

    .line 514
    move/from16 v25, v15

    .line 515
    .line 516
    sget-object v15, Ljk6;->o:Lnk6;

    .line 517
    .line 518
    iget-object v8, v8, Lak6;->w:Ltp4;

    .line 519
    .line 520
    invoke-virtual {v8, v15}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v8

    .line 524
    if-nez v8, :cond_17

    .line 525
    .line 526
    move-object/from16 v8, v16

    .line 527
    .line 528
    :cond_17
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-static {v8, v15}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v8

    .line 534
    goto :goto_b

    .line 535
    :cond_18
    move/from16 v25, v15

    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    :goto_b
    if-nez v20, :cond_19

    .line 539
    .line 540
    if-nez v8, :cond_1a

    .line 541
    .line 542
    :cond_19
    invoke-virtual {v10, v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 543
    .line 544
    .line 545
    :cond_1a
    invoke-virtual {v6, v4, v3}, Lwo4;->f(II)V

    .line 546
    .line 547
    .line 548
    add-int/lit8 v3, v3, 0x1

    .line 549
    .line 550
    :goto_c
    add-int/lit8 v15, v25, 0x1

    .line 551
    .line 552
    move-object/from16 v8, v23

    .line 553
    .line 554
    move/from16 v4, v24

    .line 555
    .line 556
    goto :goto_a

    .line 557
    :cond_1b
    iget v3, v0, Loe;->G:I

    .line 558
    .line 559
    if-ne v1, v3, :cond_1c

    .line 560
    .line 561
    const/4 v3, 0x1

    .line 562
    invoke-virtual {v10, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 563
    .line 564
    .line 565
    sget-object v3, Lw4;->g:Lw4;

    .line 566
    .line 567
    invoke-virtual {v14, v3}, Lc5;->b(Lw4;)V

    .line 568
    .line 569
    .line 570
    goto :goto_d

    .line 571
    :cond_1c
    const/4 v3, 0x0

    .line 572
    invoke-virtual {v10, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 573
    .line 574
    .line 575
    sget-object v3, Lw4;->f:Lw4;

    .line 576
    .line 577
    invoke-virtual {v14, v3}, Lc5;->b(Lw4;)V

    .line 578
    .line 579
    .line 580
    :goto_d
    invoke-static {v7}, Lfd1;->L(Lfk6;)Lvl;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    if-eqz v3, :cond_37

    .line 585
    .line 586
    invoke-virtual {v5}, Lje;->getFontFamilyResolver()Ldl2;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5}, Lje;->getDensity()Ltp1;

    .line 590
    .line 591
    .line 592
    move-result-object v26

    .line 593
    iget-object v4, v0, Loe;->c0:Lcf4;

    .line 594
    .line 595
    new-instance v8, Landroid/text/SpannableString;

    .line 596
    .line 597
    iget-object v15, v3, Lvl;->x:Ljava/lang/String;

    .line 598
    .line 599
    move-object/from16 v20, v5

    .line 600
    .line 601
    iget-object v5, v3, Lvl;->w:Ljava/util/List;

    .line 602
    .line 603
    invoke-direct {v8, v15}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 604
    .line 605
    .line 606
    move-object/from16 v29, v15

    .line 607
    .line 608
    iget-object v15, v3, Lvl;->y:Ljava/util/ArrayList;

    .line 609
    .line 610
    move-object/from16 v30, v0

    .line 611
    .line 612
    if-eqz v15, :cond_28

    .line 613
    .line 614
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    move-object/from16 v32, v6

    .line 619
    .line 620
    const/4 v6, 0x0

    .line 621
    :goto_e
    if-ge v6, v0, :cond_27

    .line 622
    .line 623
    invoke-interface {v15, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v23

    .line 627
    move/from16 v33, v0

    .line 628
    .line 629
    move-object/from16 v0, v23

    .line 630
    .line 631
    check-cast v0, Lul;

    .line 632
    .line 633
    move/from16 v34, v6

    .line 634
    .line 635
    iget-object v6, v0, Lul;->a:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v6, Lyy6;

    .line 638
    .line 639
    move-object/from16 v35, v15

    .line 640
    .line 641
    iget v15, v0, Lul;->b:I

    .line 642
    .line 643
    iget v0, v0, Lul;->c:I

    .line 644
    .line 645
    iget-object v1, v6, Lyy6;->a:Lkf7;

    .line 646
    .line 647
    move-object/from16 v36, v11

    .line 648
    .line 649
    move-object/from16 v37, v12

    .line 650
    .line 651
    invoke-interface {v1}, Lkf7;->b()J

    .line 652
    .line 653
    .line 654
    move-result-wide v11

    .line 655
    move-object v1, v9

    .line 656
    move-object/from16 v38, v10

    .line 657
    .line 658
    iget-wide v9, v6, Lyy6;->b:J

    .line 659
    .line 660
    move-object/from16 v39, v1

    .line 661
    .line 662
    iget-object v1, v6, Lyy6;->c:Lam2;

    .line 663
    .line 664
    move-object/from16 v40, v1

    .line 665
    .line 666
    iget-object v1, v6, Lyy6;->d:Lyl2;

    .line 667
    .line 668
    move-wide/from16 v24, v9

    .line 669
    .line 670
    iget-object v9, v6, Lyy6;->j:Llf7;

    .line 671
    .line 672
    iget-object v10, v6, Lyy6;->k:Lya4;

    .line 673
    .line 674
    move-object/from16 v41, v13

    .line 675
    .line 676
    move-object/from16 v42, v14

    .line 677
    .line 678
    iget-wide v13, v6, Lyy6;->l:J

    .line 679
    .line 680
    move-wide/from16 v43, v13

    .line 681
    .line 682
    iget-object v13, v6, Lyy6;->m:Lrd7;

    .line 683
    .line 684
    iget-object v6, v6, Lyy6;->a:Lkf7;

    .line 685
    .line 686
    move-object/from16 v23, v6

    .line 687
    .line 688
    move-object v14, v7

    .line 689
    invoke-interface/range {v23 .. v23}, Lkf7;->b()J

    .line 690
    .line 691
    .line 692
    move-result-wide v6

    .line 693
    invoke-static {v11, v12, v6, v7}, Ljt0;->c(JJ)Z

    .line 694
    .line 695
    .line 696
    move-result v6

    .line 697
    const-wide/16 v45, 0x10

    .line 698
    .line 699
    if-eqz v6, :cond_1d

    .line 700
    .line 701
    move-object/from16 v6, v23

    .line 702
    .line 703
    goto :goto_f

    .line 704
    :cond_1d
    cmp-long v6, v11, v45

    .line 705
    .line 706
    if-eqz v6, :cond_1e

    .line 707
    .line 708
    new-instance v6, Lxt0;

    .line 709
    .line 710
    invoke-direct {v6, v11, v12}, Lxt0;-><init>(J)V

    .line 711
    .line 712
    .line 713
    goto :goto_f

    .line 714
    :cond_1e
    sget-object v6, Ljf7;->a:Ljf7;

    .line 715
    .line 716
    :goto_f
    invoke-interface {v6}, Lkf7;->b()J

    .line 717
    .line 718
    .line 719
    move-result-wide v6

    .line 720
    invoke-static {v8, v6, v7, v15, v0}, Lt75;->G(Landroid/text/Spannable;JII)V

    .line 721
    .line 722
    .line 723
    move/from16 v28, v0

    .line 724
    .line 725
    move-object/from16 v23, v8

    .line 726
    .line 727
    move/from16 v27, v15

    .line 728
    .line 729
    invoke-static/range {v23 .. v28}, Lt75;->H(Landroid/text/Spannable;JLtp1;II)V

    .line 730
    .line 731
    .line 732
    move-object/from16 v0, v23

    .line 733
    .line 734
    move/from16 v6, v27

    .line 735
    .line 736
    move/from16 v7, v28

    .line 737
    .line 738
    if-nez v40, :cond_20

    .line 739
    .line 740
    if-eqz v1, :cond_1f

    .line 741
    .line 742
    goto :goto_10

    .line 743
    :cond_1f
    const/16 v1, 0x21

    .line 744
    .line 745
    goto :goto_13

    .line 746
    :cond_20
    :goto_10
    if-nez v40, :cond_21

    .line 747
    .line 748
    sget-object v8, Lam2;->y:Lam2;

    .line 749
    .line 750
    goto :goto_11

    .line 751
    :cond_21
    move-object/from16 v8, v40

    .line 752
    .line 753
    :goto_11
    if-eqz v1, :cond_22

    .line 754
    .line 755
    iget v1, v1, Lyl2;->a:I

    .line 756
    .line 757
    goto :goto_12

    .line 758
    :cond_22
    const/4 v1, 0x0

    .line 759
    :goto_12
    new-instance v11, Landroid/text/style/StyleSpan;

    .line 760
    .line 761
    invoke-static {v8, v1}, Lrd3;->s(Lam2;I)I

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    invoke-direct {v11, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 766
    .line 767
    .line 768
    const/16 v1, 0x21

    .line 769
    .line 770
    invoke-virtual {v0, v11, v6, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 771
    .line 772
    .line 773
    :goto_13
    if-eqz v13, :cond_24

    .line 774
    .line 775
    iget v8, v13, Lrd7;->a:I

    .line 776
    .line 777
    or-int/lit8 v11, v8, 0x1

    .line 778
    .line 779
    if-ne v11, v8, :cond_23

    .line 780
    .line 781
    new-instance v11, Landroid/text/style/UnderlineSpan;

    .line 782
    .line 783
    invoke-direct {v11}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0, v11, v6, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 787
    .line 788
    .line 789
    :cond_23
    or-int/lit8 v11, v8, 0x2

    .line 790
    .line 791
    if-ne v11, v8, :cond_24

    .line 792
    .line 793
    new-instance v8, Landroid/text/style/StrikethroughSpan;

    .line 794
    .line 795
    invoke-direct {v8}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v0, v8, v6, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 799
    .line 800
    .line 801
    :cond_24
    if-eqz v9, :cond_25

    .line 802
    .line 803
    new-instance v8, Landroid/text/style/ScaleXSpan;

    .line 804
    .line 805
    iget v9, v9, Llf7;->a:F

    .line 806
    .line 807
    invoke-direct {v8, v9}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v8, v6, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 811
    .line 812
    .line 813
    :cond_25
    invoke-static {v0, v10, v6, v7}, Lt75;->I(Landroid/text/Spannable;Lya4;II)V

    .line 814
    .line 815
    .line 816
    cmp-long v8, v43, v45

    .line 817
    .line 818
    if-eqz v8, :cond_26

    .line 819
    .line 820
    new-instance v8, Landroid/text/style/BackgroundColorSpan;

    .line 821
    .line 822
    invoke-static/range {v43 .. v44}, Luq3;->M(J)I

    .line 823
    .line 824
    .line 825
    move-result v9

    .line 826
    invoke-direct {v8, v9}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v8, v6, v7, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 830
    .line 831
    .line 832
    :cond_26
    add-int/lit8 v6, v34, 0x1

    .line 833
    .line 834
    move/from16 v1, p1

    .line 835
    .line 836
    move-object v8, v0

    .line 837
    move-object v7, v14

    .line 838
    move/from16 v0, v33

    .line 839
    .line 840
    move-object/from16 v15, v35

    .line 841
    .line 842
    move-object/from16 v11, v36

    .line 843
    .line 844
    move-object/from16 v12, v37

    .line 845
    .line 846
    move-object/from16 v10, v38

    .line 847
    .line 848
    move-object/from16 v9, v39

    .line 849
    .line 850
    move-object/from16 v13, v41

    .line 851
    .line 852
    move-object/from16 v14, v42

    .line 853
    .line 854
    goto/16 :goto_e

    .line 855
    .line 856
    :cond_27
    :goto_14
    move-object v0, v8

    .line 857
    move-object/from16 v39, v9

    .line 858
    .line 859
    move-object/from16 v38, v10

    .line 860
    .line 861
    move-object/from16 v36, v11

    .line 862
    .line 863
    move-object/from16 v37, v12

    .line 864
    .line 865
    move-object/from16 v41, v13

    .line 866
    .line 867
    move-object/from16 v42, v14

    .line 868
    .line 869
    move-object v14, v7

    .line 870
    goto :goto_15

    .line 871
    :cond_28
    move-object/from16 v32, v6

    .line 872
    .line 873
    goto :goto_14

    .line 874
    :goto_15
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    sget-object v6, La42;->w:La42;

    .line 879
    .line 880
    if-eqz v5, :cond_2a

    .line 881
    .line 882
    new-instance v7, Ljava/util/ArrayList;

    .line 883
    .line 884
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 885
    .line 886
    .line 887
    move-result v8

    .line 888
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 889
    .line 890
    .line 891
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 892
    .line 893
    .line 894
    move-result v8

    .line 895
    const/4 v9, 0x0

    .line 896
    :goto_16
    if-ge v9, v8, :cond_2b

    .line 897
    .line 898
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v10

    .line 902
    move-object v11, v10

    .line 903
    check-cast v11, Lul;

    .line 904
    .line 905
    iget-object v12, v11, Lul;->a:Ljava/lang/Object;

    .line 906
    .line 907
    instance-of v12, v12, Lc48;

    .line 908
    .line 909
    if-eqz v12, :cond_29

    .line 910
    .line 911
    iget v12, v11, Lul;->b:I

    .line 912
    .line 913
    iget v11, v11, Lul;->c:I

    .line 914
    .line 915
    const/4 v13, 0x0

    .line 916
    invoke-static {v13, v1, v12, v11}, Lwl;->b(IIII)Z

    .line 917
    .line 918
    .line 919
    move-result v11

    .line 920
    if-eqz v11, :cond_29

    .line 921
    .line 922
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    :cond_29
    add-int/lit8 v9, v9, 0x1

    .line 926
    .line 927
    goto :goto_16

    .line 928
    :cond_2a
    move-object v7, v6

    .line 929
    :cond_2b
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    const/4 v8, 0x0

    .line 934
    :goto_17
    if-ge v8, v1, :cond_2d

    .line 935
    .line 936
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v9

    .line 940
    check-cast v9, Lul;

    .line 941
    .line 942
    iget-object v10, v9, Lul;->a:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v10, Lc48;

    .line 945
    .line 946
    iget v11, v9, Lul;->b:I

    .line 947
    .line 948
    iget v9, v9, Lul;->c:I

    .line 949
    .line 950
    instance-of v12, v10, Lc48;

    .line 951
    .line 952
    if-eqz v12, :cond_2c

    .line 953
    .line 954
    new-instance v12, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 955
    .line 956
    iget-object v10, v10, Lc48;->a:Ljava/lang/String;

    .line 957
    .line 958
    invoke-direct {v12, v10}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v12}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 962
    .line 963
    .line 964
    move-result-object v10

    .line 965
    const/16 v12, 0x21

    .line 966
    .line 967
    invoke-virtual {v0, v10, v11, v9, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 968
    .line 969
    .line 970
    add-int/lit8 v8, v8, 0x1

    .line 971
    .line 972
    goto :goto_17

    .line 973
    :cond_2c
    invoke-static {}, Lh;->c()V

    .line 974
    .line 975
    .line 976
    :goto_18
    move-object/from16 v8, v16

    .line 977
    .line 978
    goto/16 :goto_51

    .line 979
    .line 980
    :cond_2d
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    if-eqz v5, :cond_2f

    .line 985
    .line 986
    new-instance v6, Ljava/util/ArrayList;

    .line 987
    .line 988
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 989
    .line 990
    .line 991
    move-result v7

    .line 992
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 996
    .line 997
    .line 998
    move-result v7

    .line 999
    const/4 v8, 0x0

    .line 1000
    :goto_19
    if-ge v8, v7, :cond_2f

    .line 1001
    .line 1002
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v9

    .line 1006
    move-object v10, v9

    .line 1007
    check-cast v10, Lul;

    .line 1008
    .line 1009
    iget-object v11, v10, Lul;->a:Ljava/lang/Object;

    .line 1010
    .line 1011
    instance-of v11, v11, Luu7;

    .line 1012
    .line 1013
    if-eqz v11, :cond_2e

    .line 1014
    .line 1015
    iget v11, v10, Lul;->b:I

    .line 1016
    .line 1017
    iget v10, v10, Lul;->c:I

    .line 1018
    .line 1019
    const/4 v13, 0x0

    .line 1020
    invoke-static {v13, v1, v11, v10}, Lwl;->b(IIII)Z

    .line 1021
    .line 1022
    .line 1023
    move-result v10

    .line 1024
    if-eqz v10, :cond_2e

    .line 1025
    .line 1026
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    :cond_2e
    add-int/lit8 v8, v8, 0x1

    .line 1030
    .line 1031
    goto :goto_19

    .line 1032
    :cond_2f
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 1033
    .line 1034
    .line 1035
    move-result v1

    .line 1036
    const/4 v5, 0x0

    .line 1037
    :goto_1a
    if-ge v5, v1, :cond_31

    .line 1038
    .line 1039
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    check-cast v7, Lul;

    .line 1044
    .line 1045
    iget-object v8, v7, Lul;->a:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v8, Luu7;

    .line 1048
    .line 1049
    iget v9, v7, Lul;->b:I

    .line 1050
    .line 1051
    iget v7, v7, Lul;->c:I

    .line 1052
    .line 1053
    iget-object v10, v4, Lcf4;->x:Ljava/lang/Object;

    .line 1054
    .line 1055
    check-cast v10, Ljava/util/WeakHashMap;

    .line 1056
    .line 1057
    invoke-virtual {v10, v8}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v11

    .line 1061
    if-nez v11, :cond_30

    .line 1062
    .line 1063
    new-instance v11, Landroid/text/style/URLSpan;

    .line 1064
    .line 1065
    iget-object v12, v8, Luu7;->a:Ljava/lang/String;

    .line 1066
    .line 1067
    invoke-direct {v11, v12}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v10, v8, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    :cond_30
    check-cast v11, Landroid/text/style/URLSpan;

    .line 1074
    .line 1075
    const/16 v12, 0x21

    .line 1076
    .line 1077
    invoke-virtual {v0, v11, v9, v7, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1078
    .line 1079
    .line 1080
    add-int/lit8 v5, v5, 0x1

    .line 1081
    .line 1082
    goto :goto_1a

    .line 1083
    :cond_31
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 1084
    .line 1085
    .line 1086
    move-result v1

    .line 1087
    invoke-virtual {v3, v1}, Lvl;->a(I)Ljava/util/List;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 1092
    .line 1093
    .line 1094
    move-result v3

    .line 1095
    const/4 v5, 0x0

    .line 1096
    :goto_1b
    if-ge v5, v3, :cond_36

    .line 1097
    .line 1098
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v6

    .line 1102
    check-cast v6, Lul;

    .line 1103
    .line 1104
    iget v7, v6, Lul;->b:I

    .line 1105
    .line 1106
    iget-object v8, v6, Lul;->a:Ljava/lang/Object;

    .line 1107
    .line 1108
    iget v9, v6, Lul;->c:I

    .line 1109
    .line 1110
    if-eq v7, v9, :cond_35

    .line 1111
    .line 1112
    move-object v10, v8

    .line 1113
    check-cast v10, Lb74;

    .line 1114
    .line 1115
    instance-of v11, v10, La74;

    .line 1116
    .line 1117
    if-eqz v11, :cond_33

    .line 1118
    .line 1119
    new-instance v6, Lul;

    .line 1120
    .line 1121
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    check-cast v8, La74;

    .line 1125
    .line 1126
    invoke-direct {v6, v7, v9, v8}, Lul;-><init>(IILjava/lang/Object;)V

    .line 1127
    .line 1128
    .line 1129
    iget-object v10, v4, Lcf4;->y:Ljava/lang/Object;

    .line 1130
    .line 1131
    check-cast v10, Ljava/util/WeakHashMap;

    .line 1132
    .line 1133
    invoke-virtual {v10, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v11

    .line 1137
    if-nez v11, :cond_32

    .line 1138
    .line 1139
    new-instance v11, Landroid/text/style/URLSpan;

    .line 1140
    .line 1141
    iget-object v8, v8, La74;->a:Ljava/lang/String;

    .line 1142
    .line 1143
    invoke-direct {v11, v8}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v10, v6, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    :cond_32
    check-cast v11, Landroid/text/style/URLSpan;

    .line 1150
    .line 1151
    const/16 v12, 0x21

    .line 1152
    .line 1153
    invoke-virtual {v0, v11, v7, v9, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_1c

    .line 1157
    :cond_33
    iget-object v8, v4, Lcf4;->z:Ljava/lang/Object;

    .line 1158
    .line 1159
    check-cast v8, Ljava/util/WeakHashMap;

    .line 1160
    .line 1161
    invoke-virtual {v8, v6}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v11

    .line 1165
    if-nez v11, :cond_34

    .line 1166
    .line 1167
    new-instance v11, Lbx0;

    .line 1168
    .line 1169
    invoke-direct {v11, v10}, Lbx0;-><init>(Lb74;)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v8, v6, v11}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    :cond_34
    check-cast v11, Landroid/text/style/ClickableSpan;

    .line 1176
    .line 1177
    const/16 v12, 0x21

    .line 1178
    .line 1179
    invoke-virtual {v0, v11, v7, v9, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_1c

    .line 1183
    :cond_35
    const/16 v12, 0x21

    .line 1184
    .line 1185
    :goto_1c
    add-int/lit8 v5, v5, 0x1

    .line 1186
    .line 1187
    goto :goto_1b

    .line 1188
    :cond_36
    invoke-static {v0}, Loe;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v0

    .line 1192
    check-cast v0, Landroid/text/SpannableString;

    .line 1193
    .line 1194
    :goto_1d
    move-object/from16 v1, v42

    .line 1195
    .line 1196
    goto :goto_1e

    .line 1197
    :cond_37
    move-object/from16 v30, v0

    .line 1198
    .line 1199
    move-object/from16 v20, v5

    .line 1200
    .line 1201
    move-object/from16 v32, v6

    .line 1202
    .line 1203
    move-object/from16 v39, v9

    .line 1204
    .line 1205
    move-object/from16 v38, v10

    .line 1206
    .line 1207
    move-object/from16 v36, v11

    .line 1208
    .line 1209
    move-object/from16 v37, v12

    .line 1210
    .line 1211
    move-object/from16 v41, v13

    .line 1212
    .line 1213
    move-object/from16 v42, v14

    .line 1214
    .line 1215
    move-object v14, v7

    .line 1216
    move-object/from16 v0, v16

    .line 1217
    .line 1218
    goto :goto_1d

    .line 1219
    :goto_1e
    invoke-virtual {v1, v0}, Lc5;->l(Ljava/lang/CharSequence;)V

    .line 1220
    .line 1221
    .line 1222
    sget-object v0, Ljk6;->M:Lnk6;

    .line 1223
    .line 1224
    invoke-virtual {v2, v0}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v3

    .line 1228
    if-eqz v3, :cond_39

    .line 1229
    .line 1230
    move-object/from16 v3, v41

    .line 1231
    .line 1232
    const/4 v4, 0x1

    .line 1233
    invoke-virtual {v3, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v2, v0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    if-nez v0, :cond_38

    .line 1241
    .line 1242
    move-object/from16 v0, v16

    .line 1243
    .line 1244
    :cond_38
    check-cast v0, Ljava/lang/CharSequence;

    .line 1245
    .line 1246
    move-object/from16 v4, v38

    .line 1247
    .line 1248
    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 1249
    .line 1250
    .line 1251
    :goto_1f
    move-object/from16 v0, v39

    .line 1252
    .line 1253
    goto :goto_20

    .line 1254
    :cond_39
    move-object/from16 v4, v38

    .line 1255
    .line 1256
    move-object/from16 v3, v41

    .line 1257
    .line 1258
    goto :goto_1f

    .line 1259
    :goto_20
    invoke-static {v14, v0}, Lfd1;->K(Lfk6;Landroid/content/res/Resources;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v5

    .line 1263
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1264
    .line 1265
    const/16 v7, 0x1e

    .line 1266
    .line 1267
    if-lt v6, v7, :cond_3a

    .line 1268
    .line 1269
    invoke-static {v4, v5}, Lx4;->j(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_21

    .line 1273
    :cond_3a
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v6

    .line 1277
    const-string v7, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 1278
    .line 1279
    invoke-virtual {v6, v7, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 1280
    .line 1281
    .line 1282
    :goto_21
    invoke-static {v14}, Lfd1;->J(Lfk6;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v5

    .line 1286
    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 1287
    .line 1288
    .line 1289
    sget-object v5, Ljk6;->K:Lnk6;

    .line 1290
    .line 1291
    invoke-virtual {v2, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v5

    .line 1295
    if-nez v5, :cond_3b

    .line 1296
    .line 1297
    move-object/from16 v5, v16

    .line 1298
    .line 1299
    :cond_3b
    check-cast v5, Lij7;

    .line 1300
    .line 1301
    if-eqz v5, :cond_3d

    .line 1302
    .line 1303
    sget-object v6, Lij7;->w:Lij7;

    .line 1304
    .line 1305
    if-ne v5, v6, :cond_3c

    .line 1306
    .line 1307
    const/4 v6, 0x1

    .line 1308
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_22

    .line 1312
    :cond_3c
    sget-object v6, Lij7;->x:Lij7;

    .line 1313
    .line 1314
    if-ne v5, v6, :cond_3d

    .line 1315
    .line 1316
    const/4 v13, 0x0

    .line 1317
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1318
    .line 1319
    .line 1320
    :cond_3d
    :goto_22
    sget-object v5, Ljk6;->J:Lnk6;

    .line 1321
    .line 1322
    invoke-virtual {v2, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v5

    .line 1326
    if-nez v5, :cond_3e

    .line 1327
    .line 1328
    move-object/from16 v5, v16

    .line 1329
    .line 1330
    :cond_3e
    check-cast v5, Ljava/lang/Boolean;

    .line 1331
    .line 1332
    if-eqz v5, :cond_41

    .line 1333
    .line 1334
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1335
    .line 1336
    .line 1337
    move-result v5

    .line 1338
    if-nez v37, :cond_3f

    .line 1339
    .line 1340
    move-object/from16 v12, v37

    .line 1341
    .line 1342
    const/4 v7, 0x4

    .line 1343
    goto :goto_23

    .line 1344
    :cond_3f
    move-object/from16 v12, v37

    .line 1345
    .line 1346
    iget v6, v12, Ls86;->a:I

    .line 1347
    .line 1348
    const/4 v7, 0x4

    .line 1349
    if-ne v6, v7, :cond_40

    .line 1350
    .line 1351
    invoke-virtual {v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 1352
    .line 1353
    .line 1354
    goto :goto_24

    .line 1355
    :cond_40
    :goto_23
    invoke-virtual {v4, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 1356
    .line 1357
    .line 1358
    :goto_24
    move-object/from16 v5, v36

    .line 1359
    .line 1360
    goto :goto_25

    .line 1361
    :cond_41
    move-object/from16 v12, v37

    .line 1362
    .line 1363
    const/4 v7, 0x4

    .line 1364
    goto :goto_24

    .line 1365
    :goto_25
    iget-boolean v6, v5, Lak6;->y:Z

    .line 1366
    .line 1367
    if-eqz v6, :cond_42

    .line 1368
    .line 1369
    invoke-static {v7, v14}, Lfk6;->j(ILfk6;)Ljava/util/List;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v6

    .line 1373
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 1374
    .line 1375
    .line 1376
    move-result v6

    .line 1377
    if-eqz v6, :cond_45

    .line 1378
    .line 1379
    :cond_42
    sget-object v6, Ljk6;->a:Lnk6;

    .line 1380
    .line 1381
    invoke-virtual {v2, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v6

    .line 1385
    if-nez v6, :cond_43

    .line 1386
    .line 1387
    move-object/from16 v6, v16

    .line 1388
    .line 1389
    :cond_43
    check-cast v6, Ljava/util/List;

    .line 1390
    .line 1391
    if-eqz v6, :cond_44

    .line 1392
    .line 1393
    invoke-static {v6}, Ldt0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v6

    .line 1397
    check-cast v6, Ljava/lang/String;

    .line 1398
    .line 1399
    goto :goto_26

    .line 1400
    :cond_44
    move-object/from16 v6, v16

    .line 1401
    .line 1402
    :goto_26
    invoke-virtual {v4, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1403
    .line 1404
    .line 1405
    :cond_45
    sget-object v6, Ljk6;->A:Lnk6;

    .line 1406
    .line 1407
    invoke-virtual {v2, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v6

    .line 1411
    if-nez v6, :cond_46

    .line 1412
    .line 1413
    move-object/from16 v6, v16

    .line 1414
    .line 1415
    :cond_46
    check-cast v6, Ljava/lang/String;

    .line 1416
    .line 1417
    if-eqz v6, :cond_49

    .line 1418
    .line 1419
    move-object v7, v14

    .line 1420
    :goto_27
    if-eqz v7, :cond_48

    .line 1421
    .line 1422
    iget-object v8, v7, Lfk6;->d:Lak6;

    .line 1423
    .line 1424
    sget-object v9, Lkk6;->a:Lnk6;

    .line 1425
    .line 1426
    iget-object v10, v8, Lak6;->w:Ltp4;

    .line 1427
    .line 1428
    invoke-virtual {v10, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1429
    .line 1430
    .line 1431
    move-result v10

    .line 1432
    if-eqz v10, :cond_47

    .line 1433
    .line 1434
    invoke-virtual {v8, v9}, Lak6;->k(Lnk6;)Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v7

    .line 1438
    check-cast v7, Ljava/lang/Boolean;

    .line 1439
    .line 1440
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1441
    .line 1442
    .line 1443
    move-result v7

    .line 1444
    goto :goto_28

    .line 1445
    :cond_47
    invoke-virtual {v7}, Lfk6;->l()Lfk6;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v7

    .line 1449
    goto :goto_27

    .line 1450
    :cond_48
    const/4 v7, 0x0

    .line 1451
    :goto_28
    if-eqz v7, :cond_49

    .line 1452
    .line 1453
    invoke-virtual {v3, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    :cond_49
    sget-object v6, Ljk6;->h:Lnk6;

    .line 1457
    .line 1458
    invoke-virtual {v2, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v6

    .line 1462
    if-nez v6, :cond_4a

    .line 1463
    .line 1464
    move-object/from16 v6, v16

    .line 1465
    .line 1466
    :cond_4a
    check-cast v6, Lvs7;

    .line 1467
    .line 1468
    const/16 v7, 0x1c

    .line 1469
    .line 1470
    if-eqz v6, :cond_4c

    .line 1471
    .line 1472
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1473
    .line 1474
    if-lt v6, v7, :cond_4b

    .line 1475
    .line 1476
    const/4 v6, 0x1

    .line 1477
    invoke-static {v4, v6}, Lq4;->z(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 1478
    .line 1479
    .line 1480
    goto :goto_29

    .line 1481
    :cond_4b
    const/4 v6, 0x1

    .line 1482
    const/4 v8, 0x2

    .line 1483
    invoke-virtual {v1, v8, v6}, Lc5;->h(IZ)V

    .line 1484
    .line 1485
    .line 1486
    :cond_4c
    :goto_29
    sget-object v6, Ljk6;->i:Lnk6;

    .line 1487
    .line 1488
    invoke-virtual {v2, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v6

    .line 1492
    if-nez v6, :cond_4d

    .line 1493
    .line 1494
    move-object/from16 v6, v16

    .line 1495
    .line 1496
    :cond_4d
    check-cast v6, Lvs7;

    .line 1497
    .line 1498
    const/16 v8, 0x1d

    .line 1499
    .line 1500
    if-eqz v6, :cond_4f

    .line 1501
    .line 1502
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1503
    .line 1504
    if-lt v6, v8, :cond_4e

    .line 1505
    .line 1506
    invoke-static {v3}, Ls4;->d(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 1507
    .line 1508
    .line 1509
    goto :goto_2a

    .line 1510
    :cond_4e
    const/16 v6, 0x8

    .line 1511
    .line 1512
    const/4 v9, 0x1

    .line 1513
    invoke-virtual {v1, v6, v9}, Lc5;->h(IZ)V

    .line 1514
    .line 1515
    .line 1516
    :cond_4f
    :goto_2a
    move/from16 v6, p1

    .line 1517
    .line 1518
    const/4 v9, -0x1

    .line 1519
    if-eq v6, v9, :cond_51

    .line 1520
    .line 1521
    iget v10, v14, Lfk6;->f:I

    .line 1522
    .line 1523
    move-object/from16 v11, v32

    .line 1524
    .line 1525
    invoke-virtual {v11, v10}, Lwo4;->d(I)I

    .line 1526
    .line 1527
    .line 1528
    move-result v10

    .line 1529
    if-eq v10, v9, :cond_50

    .line 1530
    .line 1531
    invoke-virtual {v3, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setDrawingOrder(I)V

    .line 1532
    .line 1533
    .line 1534
    goto :goto_2b

    .line 1535
    :cond_50
    const-string v9, "AccessibilityDelegate"

    .line 1536
    .line 1537
    const-string v10, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"

    .line 1538
    .line 1539
    invoke-static {v9, v10}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1540
    .line 1541
    .line 1542
    :cond_51
    :goto_2b
    sget-object v9, Ljk6;->L:Lnk6;

    .line 1543
    .line 1544
    invoke-virtual {v2, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1545
    .line 1546
    .line 1547
    move-result v9

    .line 1548
    invoke-virtual {v3, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 1549
    .line 1550
    .line 1551
    sget-object v9, Ljk6;->O:Lnk6;

    .line 1552
    .line 1553
    invoke-virtual {v2, v9}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v9

    .line 1557
    if-nez v9, :cond_52

    .line 1558
    .line 1559
    move-object/from16 v9, v16

    .line 1560
    .line 1561
    :cond_52
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1562
    .line 1563
    invoke-static {v9, v10}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v9

    .line 1567
    invoke-virtual {v3, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 1568
    .line 1569
    .line 1570
    sget-object v9, Ljk6;->P:Lnk6;

    .line 1571
    .line 1572
    invoke-virtual {v2, v9}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v9

    .line 1576
    if-nez v9, :cond_53

    .line 1577
    .line 1578
    move-object/from16 v9, v16

    .line 1579
    .line 1580
    :cond_53
    check-cast v9, Ljava/lang/Integer;

    .line 1581
    .line 1582
    if-eqz v9, :cond_54

    .line 1583
    .line 1584
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1585
    .line 1586
    .line 1587
    move-result v9

    .line 1588
    goto :goto_2c

    .line 1589
    :cond_54
    const/4 v9, -0x1

    .line 1590
    :goto_2c
    invoke-virtual {v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMaxTextLength(I)V

    .line 1591
    .line 1592
    .line 1593
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 1594
    .line 1595
    .line 1596
    move-result v9

    .line 1597
    invoke-virtual {v4, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 1598
    .line 1599
    .line 1600
    sget-object v9, Ljk6;->l:Lnk6;

    .line 1601
    .line 1602
    invoke-virtual {v2, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 1603
    .line 1604
    .line 1605
    move-result v11

    .line 1606
    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 1607
    .line 1608
    .line 1609
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 1610
    .line 1611
    .line 1612
    move-result v11

    .line 1613
    if-eqz v11, :cond_56

    .line 1614
    .line 1615
    invoke-virtual {v5, v9}, Lak6;->k(Lnk6;)Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v11

    .line 1619
    check-cast v11, Ljava/lang/Boolean;

    .line 1620
    .line 1621
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1622
    .line 1623
    .line 1624
    move-result v11

    .line 1625
    invoke-virtual {v4, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1629
    .line 1630
    .line 1631
    move-result v11

    .line 1632
    if-eqz v11, :cond_55

    .line 1633
    .line 1634
    const/4 v11, 0x2

    .line 1635
    invoke-virtual {v1, v11}, Lc5;->a(I)V

    .line 1636
    .line 1637
    .line 1638
    move-object/from16 v11, v30

    .line 1639
    .line 1640
    iput v6, v11, Loe;->H:I

    .line 1641
    .line 1642
    :goto_2d
    const/4 v13, 0x1

    .line 1643
    goto :goto_2e

    .line 1644
    :cond_55
    move-object/from16 v11, v30

    .line 1645
    .line 1646
    const/4 v13, 0x1

    .line 1647
    invoke-virtual {v1, v13}, Lc5;->a(I)V

    .line 1648
    .line 1649
    .line 1650
    goto :goto_2e

    .line 1651
    :cond_56
    move-object/from16 v11, v30

    .line 1652
    .line 1653
    goto :goto_2d

    .line 1654
    :goto_2e
    invoke-static {v14}, Lwe;->z(Lfk6;)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v15

    .line 1658
    xor-int/2addr v15, v13

    .line 1659
    invoke-virtual {v4, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v14}, Lfk6;->o()Z

    .line 1663
    .line 1664
    .line 1665
    move-result v13

    .line 1666
    if-eqz v13, :cond_57

    .line 1667
    .line 1668
    invoke-virtual {v14}, Lfk6;->l()Lfk6;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v13

    .line 1672
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1673
    .line 1674
    .line 1675
    goto :goto_2f

    .line 1676
    :cond_57
    move-object v13, v14

    .line 1677
    :goto_2f
    invoke-virtual {v13}, Lfk6;->m()Lly5;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v13

    .line 1681
    invoke-virtual {v13}, Lly5;->f()Z

    .line 1682
    .line 1683
    .line 1684
    move-result v13

    .line 1685
    if-eqz v13, :cond_58

    .line 1686
    .line 1687
    const/4 v13, 0x0

    .line 1688
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1689
    .line 1690
    .line 1691
    :cond_58
    sget-object v13, Ljk6;->k:Lnk6;

    .line 1692
    .line 1693
    invoke-virtual {v2, v13}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v13

    .line 1697
    if-nez v13, :cond_59

    .line 1698
    .line 1699
    move-object/from16 v13, v16

    .line 1700
    .line 1701
    :cond_59
    check-cast v13, Lf94;

    .line 1702
    .line 1703
    if-eqz v13, :cond_5c

    .line 1704
    .line 1705
    iget v13, v13, Lf94;->a:I

    .line 1706
    .line 1707
    if-nez v13, :cond_5b

    .line 1708
    .line 1709
    :cond_5a
    const/4 v13, 0x1

    .line 1710
    goto :goto_30

    .line 1711
    :cond_5b
    const/4 v15, 0x1

    .line 1712
    if-ne v13, v15, :cond_5a

    .line 1713
    .line 1714
    const/4 v13, 0x2

    .line 1715
    :goto_30
    invoke-virtual {v3, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V

    .line 1716
    .line 1717
    .line 1718
    :cond_5c
    const/4 v13, 0x0

    .line 1719
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1720
    .line 1721
    .line 1722
    sget-object v13, Lzj6;->b:Lnk6;

    .line 1723
    .line 1724
    invoke-virtual {v2, v13}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v13

    .line 1728
    if-nez v13, :cond_5d

    .line 1729
    .line 1730
    move-object/from16 v13, v16

    .line 1731
    .line 1732
    :cond_5d
    check-cast v13, Lh4;

    .line 1733
    .line 1734
    if-eqz v13, :cond_65

    .line 1735
    .line 1736
    sget-object v8, Ljk6;->J:Lnk6;

    .line 1737
    .line 1738
    invoke-virtual {v2, v8}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v8

    .line 1742
    if-nez v8, :cond_5e

    .line 1743
    .line 1744
    move-object/from16 v8, v16

    .line 1745
    .line 1746
    :cond_5e
    invoke-static {v8, v10}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v8

    .line 1750
    if-nez v12, :cond_5f

    .line 1751
    .line 1752
    goto :goto_31

    .line 1753
    :cond_5f
    iget v15, v12, Ls86;->a:I

    .line 1754
    .line 1755
    const/4 v7, 0x4

    .line 1756
    if-ne v15, v7, :cond_60

    .line 1757
    .line 1758
    goto :goto_32

    .line 1759
    :cond_60
    :goto_31
    if-nez v12, :cond_61

    .line 1760
    .line 1761
    goto :goto_33

    .line 1762
    :cond_61
    iget v7, v12, Ls86;->a:I

    .line 1763
    .line 1764
    const/4 v12, 0x3

    .line 1765
    if-ne v7, v12, :cond_62

    .line 1766
    .line 1767
    :goto_32
    const/4 v7, 0x1

    .line 1768
    goto :goto_34

    .line 1769
    :cond_62
    :goto_33
    const/4 v7, 0x0

    .line 1770
    :goto_34
    if-eqz v7, :cond_64

    .line 1771
    .line 1772
    if-eqz v7, :cond_63

    .line 1773
    .line 1774
    if-nez v8, :cond_63

    .line 1775
    .line 1776
    goto :goto_35

    .line 1777
    :cond_63
    const/4 v7, 0x0

    .line 1778
    goto :goto_36

    .line 1779
    :cond_64
    :goto_35
    const/4 v7, 0x1

    .line 1780
    :goto_36
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1781
    .line 1782
    .line 1783
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 1784
    .line 1785
    .line 1786
    move-result v7

    .line 1787
    if-eqz v7, :cond_65

    .line 1788
    .line 1789
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    .line 1790
    .line 1791
    .line 1792
    move-result v7

    .line 1793
    if-eqz v7, :cond_65

    .line 1794
    .line 1795
    new-instance v7, Lw4;

    .line 1796
    .line 1797
    iget-object v8, v13, Lh4;->a:Ljava/lang/String;

    .line 1798
    .line 1799
    const/16 v12, 0x10

    .line 1800
    .line 1801
    invoke-direct {v7, v12, v8}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1802
    .line 1803
    .line 1804
    invoke-virtual {v1, v7}, Lc5;->b(Lw4;)V

    .line 1805
    .line 1806
    .line 1807
    :cond_65
    const/4 v13, 0x0

    .line 1808
    invoke-virtual {v4, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1809
    .line 1810
    .line 1811
    sget-object v7, Lzj6;->c:Lnk6;

    .line 1812
    .line 1813
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v7

    .line 1817
    check-cast v7, Lh4;

    .line 1818
    .line 1819
    if-eqz v7, :cond_66

    .line 1820
    .line 1821
    const/4 v15, 0x1

    .line 1822
    invoke-virtual {v4, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1823
    .line 1824
    .line 1825
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 1826
    .line 1827
    .line 1828
    move-result v8

    .line 1829
    if-eqz v8, :cond_66

    .line 1830
    .line 1831
    new-instance v8, Lw4;

    .line 1832
    .line 1833
    const/16 v12, 0x20

    .line 1834
    .line 1835
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1836
    .line 1837
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1838
    .line 1839
    .line 1840
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1841
    .line 1842
    .line 1843
    :cond_66
    sget-object v7, Lzj6;->q:Lnk6;

    .line 1844
    .line 1845
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v7

    .line 1849
    check-cast v7, Lh4;

    .line 1850
    .line 1851
    if-eqz v7, :cond_67

    .line 1852
    .line 1853
    new-instance v8, Lw4;

    .line 1854
    .line 1855
    const/16 v12, 0x4000

    .line 1856
    .line 1857
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1858
    .line 1859
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1860
    .line 1861
    .line 1862
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1863
    .line 1864
    .line 1865
    :cond_67
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 1866
    .line 1867
    .line 1868
    move-result v7

    .line 1869
    if-eqz v7, :cond_6c

    .line 1870
    .line 1871
    sget-object v7, Lzj6;->k:Lnk6;

    .line 1872
    .line 1873
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v7

    .line 1877
    check-cast v7, Lh4;

    .line 1878
    .line 1879
    if-eqz v7, :cond_68

    .line 1880
    .line 1881
    new-instance v8, Lw4;

    .line 1882
    .line 1883
    const/high16 v12, 0x200000

    .line 1884
    .line 1885
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1886
    .line 1887
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1888
    .line 1889
    .line 1890
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1891
    .line 1892
    .line 1893
    :cond_68
    sget-object v7, Lzj6;->p:Lnk6;

    .line 1894
    .line 1895
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v7

    .line 1899
    check-cast v7, Lh4;

    .line 1900
    .line 1901
    if-eqz v7, :cond_69

    .line 1902
    .line 1903
    new-instance v8, Lw4;

    .line 1904
    .line 1905
    const v12, 0x1020054

    .line 1906
    .line 1907
    .line 1908
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1909
    .line 1910
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1911
    .line 1912
    .line 1913
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1914
    .line 1915
    .line 1916
    :cond_69
    sget-object v7, Lzj6;->r:Lnk6;

    .line 1917
    .line 1918
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v7

    .line 1922
    check-cast v7, Lh4;

    .line 1923
    .line 1924
    if-eqz v7, :cond_6a

    .line 1925
    .line 1926
    new-instance v8, Lw4;

    .line 1927
    .line 1928
    const/high16 v12, 0x10000

    .line 1929
    .line 1930
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1931
    .line 1932
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1936
    .line 1937
    .line 1938
    :cond_6a
    sget-object v7, Lzj6;->s:Lnk6;

    .line 1939
    .line 1940
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v7

    .line 1944
    check-cast v7, Lh4;

    .line 1945
    .line 1946
    if-eqz v7, :cond_6c

    .line 1947
    .line 1948
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1949
    .line 1950
    .line 1951
    move-result v8

    .line 1952
    if-eqz v8, :cond_6c

    .line 1953
    .line 1954
    invoke-virtual/range {v20 .. v20}, Lje;->getClipboardManager()Lcs0;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v8

    .line 1958
    check-cast v8, Ltd;

    .line 1959
    .line 1960
    invoke-virtual {v8}, Ltd;->a()Landroid/content/ClipboardManager;

    .line 1961
    .line 1962
    .line 1963
    move-result-object v8

    .line 1964
    invoke-virtual {v8}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v8

    .line 1968
    if-eqz v8, :cond_6b

    .line 1969
    .line 1970
    const-string v12, "text/*"

    .line 1971
    .line 1972
    invoke-virtual {v8, v12}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1973
    .line 1974
    .line 1975
    move-result v8

    .line 1976
    goto :goto_37

    .line 1977
    :cond_6b
    const/4 v8, 0x0

    .line 1978
    :goto_37
    if-eqz v8, :cond_6c

    .line 1979
    .line 1980
    new-instance v8, Lw4;

    .line 1981
    .line 1982
    const v12, 0x8000

    .line 1983
    .line 1984
    .line 1985
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 1986
    .line 1987
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 1988
    .line 1989
    .line 1990
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 1991
    .line 1992
    .line 1993
    :cond_6c
    invoke-static {v14}, Loe;->s(Lfk6;)Ljava/lang/String;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v7

    .line 1997
    if-eqz v7, :cond_76

    .line 1998
    .line 1999
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2000
    .line 2001
    .line 2002
    move-result v7

    .line 2003
    if-nez v7, :cond_6d

    .line 2004
    .line 2005
    goto/16 :goto_3c

    .line 2006
    .line 2007
    :cond_6d
    invoke-virtual {v11, v14}, Loe;->q(Lfk6;)I

    .line 2008
    .line 2009
    .line 2010
    move-result v7

    .line 2011
    invoke-virtual {v11, v14}, Loe;->p(Lfk6;)I

    .line 2012
    .line 2013
    .line 2014
    move-result v8

    .line 2015
    invoke-virtual {v3, v7, v8}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 2016
    .line 2017
    .line 2018
    sget-object v7, Lzj6;->j:Lnk6;

    .line 2019
    .line 2020
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v7

    .line 2024
    check-cast v7, Lh4;

    .line 2025
    .line 2026
    new-instance v8, Lw4;

    .line 2027
    .line 2028
    if-eqz v7, :cond_6e

    .line 2029
    .line 2030
    iget-object v7, v7, Lh4;->a:Ljava/lang/String;

    .line 2031
    .line 2032
    goto :goto_38

    .line 2033
    :cond_6e
    move-object/from16 v7, v16

    .line 2034
    .line 2035
    :goto_38
    const/high16 v12, 0x20000

    .line 2036
    .line 2037
    invoke-direct {v8, v12, v7}, Lw4;-><init>(ILjava/lang/String;)V

    .line 2038
    .line 2039
    .line 2040
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 2041
    .line 2042
    .line 2043
    const/16 v7, 0x100

    .line 2044
    .line 2045
    invoke-virtual {v1, v7}, Lc5;->a(I)V

    .line 2046
    .line 2047
    .line 2048
    const/16 v7, 0x200

    .line 2049
    .line 2050
    invoke-virtual {v1, v7}, Lc5;->a(I)V

    .line 2051
    .line 2052
    .line 2053
    const/16 v7, 0xb

    .line 2054
    .line 2055
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2056
    .line 2057
    .line 2058
    sget-object v7, Ljk6;->a:Lnk6;

    .line 2059
    .line 2060
    invoke-static {v5, v7}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v7

    .line 2064
    check-cast v7, Ljava/util/List;

    .line 2065
    .line 2066
    if-eqz v7, :cond_6f

    .line 2067
    .line 2068
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 2069
    .line 2070
    .line 2071
    move-result v7

    .line 2072
    if-eqz v7, :cond_76

    .line 2073
    .line 2074
    :cond_6f
    sget-object v7, Lzj6;->a:Lnk6;

    .line 2075
    .line 2076
    invoke-virtual {v2, v7}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v7

    .line 2080
    if-eqz v7, :cond_76

    .line 2081
    .line 2082
    sget-object v7, Ljk6;->G:Lnk6;

    .line 2083
    .line 2084
    invoke-virtual {v2, v7}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2085
    .line 2086
    .line 2087
    move-result v7

    .line 2088
    if-eqz v7, :cond_70

    .line 2089
    .line 2090
    invoke-static {v5, v9}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v7

    .line 2094
    invoke-static {v7, v10}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2095
    .line 2096
    .line 2097
    move-result v7

    .line 2098
    if-nez v7, :cond_70

    .line 2099
    .line 2100
    goto :goto_3c

    .line 2101
    :cond_70
    invoke-virtual/range {v22 .. v22}, Luy3;->v()Luy3;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v7

    .line 2105
    :goto_39
    if-eqz v7, :cond_72

    .line 2106
    .line 2107
    invoke-virtual {v7}, Luy3;->x()Lak6;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v8

    .line 2111
    if-eqz v8, :cond_71

    .line 2112
    .line 2113
    iget-boolean v9, v8, Lak6;->y:Z

    .line 2114
    .line 2115
    const/4 v15, 0x1

    .line 2116
    if-ne v9, v15, :cond_71

    .line 2117
    .line 2118
    sget-object v9, Ljk6;->G:Lnk6;

    .line 2119
    .line 2120
    iget-object v8, v8, Lak6;->w:Ltp4;

    .line 2121
    .line 2122
    invoke-virtual {v8, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2123
    .line 2124
    .line 2125
    move-result v8

    .line 2126
    if-eqz v8, :cond_71

    .line 2127
    .line 2128
    goto :goto_3a

    .line 2129
    :cond_71
    invoke-virtual {v7}, Luy3;->v()Luy3;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v7

    .line 2133
    goto :goto_39

    .line 2134
    :cond_72
    move-object/from16 v7, v16

    .line 2135
    .line 2136
    :goto_3a
    if-eqz v7, :cond_75

    .line 2137
    .line 2138
    invoke-virtual {v7}, Luy3;->x()Lak6;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v7

    .line 2142
    if-eqz v7, :cond_74

    .line 2143
    .line 2144
    sget-object v8, Ljk6;->l:Lnk6;

    .line 2145
    .line 2146
    iget-object v7, v7, Lak6;->w:Ltp4;

    .line 2147
    .line 2148
    invoke-virtual {v7, v8}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v7

    .line 2152
    if-nez v7, :cond_73

    .line 2153
    .line 2154
    move-object/from16 v7, v16

    .line 2155
    .line 2156
    :cond_73
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2157
    .line 2158
    invoke-static {v7, v8}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2159
    .line 2160
    .line 2161
    move-result v7

    .line 2162
    goto :goto_3b

    .line 2163
    :cond_74
    const/4 v7, 0x0

    .line 2164
    :goto_3b
    if-nez v7, :cond_75

    .line 2165
    .line 2166
    goto :goto_3c

    .line 2167
    :cond_75
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 2168
    .line 2169
    .line 2170
    move-result v7

    .line 2171
    or-int/lit8 v7, v7, 0x14

    .line 2172
    .line 2173
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 2174
    .line 2175
    .line 2176
    :cond_76
    :goto_3c
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2177
    .line 2178
    const/16 v8, 0x1a

    .line 2179
    .line 2180
    if-lt v7, v8, :cond_7b

    .line 2181
    .line 2182
    new-instance v7, Ljava/util/ArrayList;

    .line 2183
    .line 2184
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 2185
    .line 2186
    .line 2187
    const-string v9, "androidx.compose.ui.semantics.id"

    .line 2188
    .line 2189
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2190
    .line 2191
    .line 2192
    invoke-virtual {v1}, Lc5;->g()Ljava/lang/CharSequence;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v9

    .line 2196
    if-eqz v9, :cond_78

    .line 2197
    .line 2198
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 2199
    .line 2200
    .line 2201
    move-result v9

    .line 2202
    if-nez v9, :cond_77

    .line 2203
    .line 2204
    goto :goto_3d

    .line 2205
    :cond_77
    sget-object v9, Lzj6;->a:Lnk6;

    .line 2206
    .line 2207
    invoke-virtual {v2, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2208
    .line 2209
    .line 2210
    move-result v9

    .line 2211
    if-eqz v9, :cond_78

    .line 2212
    .line 2213
    const-string v9, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 2214
    .line 2215
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2216
    .line 2217
    .line 2218
    :cond_78
    :goto_3d
    sget-object v9, Ljk6;->A:Lnk6;

    .line 2219
    .line 2220
    invoke-virtual {v2, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2221
    .line 2222
    .line 2223
    move-result v9

    .line 2224
    if-eqz v9, :cond_79

    .line 2225
    .line 2226
    const-string v9, "androidx.compose.ui.semantics.testTag"

    .line 2227
    .line 2228
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2229
    .line 2230
    .line 2231
    :cond_79
    sget-object v9, Ljk6;->Q:Lnk6;

    .line 2232
    .line 2233
    invoke-virtual {v2, v9}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2234
    .line 2235
    .line 2236
    move-result v9

    .line 2237
    if-eqz v9, :cond_7a

    .line 2238
    .line 2239
    const-string v9, "androidx.compose.ui.semantics.shapeType"

    .line 2240
    .line 2241
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2242
    .line 2243
    .line 2244
    const-string v9, "androidx.compose.ui.semantics.shapeRect"

    .line 2245
    .line 2246
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2247
    .line 2248
    .line 2249
    const-string v9, "androidx.compose.ui.semantics.shapeCorners"

    .line 2250
    .line 2251
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2252
    .line 2253
    .line 2254
    const-string v9, "androidx.compose.ui.semantics.shapeRegion"

    .line 2255
    .line 2256
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2257
    .line 2258
    .line 2259
    :cond_7a
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2260
    .line 2261
    if-lt v9, v8, :cond_7b

    .line 2262
    .line 2263
    invoke-static {v3, v7}, Lr4;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/ArrayList;)V

    .line 2264
    .line 2265
    .line 2266
    :cond_7b
    sget-object v3, Ljk6;->c:Lnk6;

    .line 2267
    .line 2268
    invoke-static {v5, v3}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v3

    .line 2272
    check-cast v3, Lmq5;

    .line 2273
    .line 2274
    if-eqz v3, :cond_81

    .line 2275
    .line 2276
    iget v5, v3, Lmq5;->a:F

    .line 2277
    .line 2278
    iget-object v7, v3, Lmq5;->b:Lms0;

    .line 2279
    .line 2280
    sget-object v8, Lzj6;->i:Lnk6;

    .line 2281
    .line 2282
    invoke-virtual {v2, v8}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2283
    .line 2284
    .line 2285
    move-result v2

    .line 2286
    if-eqz v2, :cond_7c

    .line 2287
    .line 2288
    const-string v2, "android.widget.SeekBar"

    .line 2289
    .line 2290
    invoke-virtual {v1, v2}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 2291
    .line 2292
    .line 2293
    goto :goto_3e

    .line 2294
    :cond_7c
    const-string v2, "android.widget.ProgressBar"

    .line 2295
    .line 2296
    invoke-virtual {v1, v2}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 2297
    .line 2298
    .line 2299
    :goto_3e
    sget-object v2, Lmq5;->c:Lmq5;

    .line 2300
    .line 2301
    if-eq v3, v2, :cond_7d

    .line 2302
    .line 2303
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    .line 2304
    .line 2305
    .line 2306
    move-result v2

    .line 2307
    invoke-virtual {v7}, Lms0;->a()Ljava/lang/Comparable;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v3

    .line 2311
    check-cast v3, Ljava/lang/Number;

    .line 2312
    .line 2313
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 2314
    .line 2315
    .line 2316
    move-result v3

    .line 2317
    new-instance v9, Lb5;

    .line 2318
    .line 2319
    const/4 v15, 0x1

    .line 2320
    invoke-static {v15, v2, v3, v5}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v2

    .line 2324
    invoke-direct {v9, v2}, Lb5;-><init>(Ljava/lang/Object;)V

    .line 2325
    .line 2326
    .line 2327
    iget-object v2, v9, Lb5;->a:Ljava/lang/Object;

    .line 2328
    .line 2329
    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 2330
    .line 2331
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 2332
    .line 2333
    .line 2334
    :cond_7d
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v2

    .line 2338
    iget-object v2, v2, Lak6;->w:Ltp4;

    .line 2339
    .line 2340
    invoke-virtual {v2, v8}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2341
    .line 2342
    .line 2343
    move-result v2

    .line 2344
    if-eqz v2, :cond_81

    .line 2345
    .line 2346
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 2347
    .line 2348
    .line 2349
    move-result v2

    .line 2350
    if-eqz v2, :cond_81

    .line 2351
    .line 2352
    invoke-virtual {v7}, Lms0;->a()Ljava/lang/Comparable;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v2

    .line 2356
    check-cast v2, Ljava/lang/Number;

    .line 2357
    .line 2358
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2359
    .line 2360
    .line 2361
    move-result v2

    .line 2362
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    .line 2363
    .line 2364
    .line 2365
    move-result v3

    .line 2366
    cmpg-float v8, v2, v3

    .line 2367
    .line 2368
    if-gez v8, :cond_7e

    .line 2369
    .line 2370
    move v2, v3

    .line 2371
    :cond_7e
    cmpg-float v2, v5, v2

    .line 2372
    .line 2373
    if-gez v2, :cond_7f

    .line 2374
    .line 2375
    sget-object v2, Lw4;->h:Lw4;

    .line 2376
    .line 2377
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2378
    .line 2379
    .line 2380
    :cond_7f
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    .line 2381
    .line 2382
    .line 2383
    move-result v2

    .line 2384
    invoke-virtual {v7}, Lms0;->a()Ljava/lang/Comparable;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v3

    .line 2388
    check-cast v3, Ljava/lang/Number;

    .line 2389
    .line 2390
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 2391
    .line 2392
    .line 2393
    move-result v3

    .line 2394
    cmpl-float v7, v2, v3

    .line 2395
    .line 2396
    if-lez v7, :cond_80

    .line 2397
    .line 2398
    move v2, v3

    .line 2399
    :cond_80
    cmpl-float v2, v5, v2

    .line 2400
    .line 2401
    if-lez v2, :cond_81

    .line 2402
    .line 2403
    sget-object v2, Lw4;->i:Lw4;

    .line 2404
    .line 2405
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2406
    .line 2407
    .line 2408
    :cond_81
    invoke-static {v1, v14}, Lx91;->i(Lc5;Lfk6;)V

    .line 2409
    .line 2410
    .line 2411
    invoke-static {v1, v14}, Lrj1;->H(Lc5;Lfk6;)V

    .line 2412
    .line 2413
    .line 2414
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v2

    .line 2418
    sget-object v3, Ljk6;->g:Lnk6;

    .line 2419
    .line 2420
    iget-object v2, v2, Lak6;->w:Ltp4;

    .line 2421
    .line 2422
    invoke-virtual {v2, v3}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v2

    .line 2426
    if-nez v2, :cond_82

    .line 2427
    .line 2428
    move-object/from16 v2, v16

    .line 2429
    .line 2430
    :cond_82
    if-nez v2, :cond_8d

    .line 2431
    .line 2432
    invoke-virtual {v14}, Lfk6;->l()Lfk6;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v2

    .line 2436
    if-nez v2, :cond_83

    .line 2437
    .line 2438
    goto/16 :goto_42

    .line 2439
    .line 2440
    :cond_83
    invoke-virtual {v2}, Lfk6;->k()Lak6;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v3

    .line 2444
    sget-object v5, Ljk6;->e:Lnk6;

    .line 2445
    .line 2446
    iget-object v3, v3, Lak6;->w:Ltp4;

    .line 2447
    .line 2448
    invoke-virtual {v3, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v3

    .line 2452
    if-nez v3, :cond_84

    .line 2453
    .line 2454
    move-object/from16 v3, v16

    .line 2455
    .line 2456
    :cond_84
    if-eqz v3, :cond_8e

    .line 2457
    .line 2458
    invoke-virtual {v2}, Lfk6;->k()Lak6;

    .line 2459
    .line 2460
    .line 2461
    move-result-object v3

    .line 2462
    sget-object v5, Ljk6;->f:Lnk6;

    .line 2463
    .line 2464
    iget-object v3, v3, Lak6;->w:Ltp4;

    .line 2465
    .line 2466
    invoke-virtual {v3, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2467
    .line 2468
    .line 2469
    move-result-object v3

    .line 2470
    if-nez v3, :cond_85

    .line 2471
    .line 2472
    move-object/from16 v3, v16

    .line 2473
    .line 2474
    :cond_85
    check-cast v3, Lat0;

    .line 2475
    .line 2476
    if-eqz v3, :cond_86

    .line 2477
    .line 2478
    iget v5, v3, Lat0;->a:I

    .line 2479
    .line 2480
    if-ltz v5, :cond_8e

    .line 2481
    .line 2482
    iget v3, v3, Lat0;->b:I

    .line 2483
    .line 2484
    if-gez v3, :cond_86

    .line 2485
    .line 2486
    goto/16 :goto_42

    .line 2487
    .line 2488
    :cond_86
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v3

    .line 2492
    sget-object v5, Ljk6;->J:Lnk6;

    .line 2493
    .line 2494
    iget-object v3, v3, Lak6;->w:Ltp4;

    .line 2495
    .line 2496
    invoke-virtual {v3, v5}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2497
    .line 2498
    .line 2499
    move-result v3

    .line 2500
    if-nez v3, :cond_87

    .line 2501
    .line 2502
    goto/16 :goto_42

    .line 2503
    .line 2504
    :cond_87
    new-instance v3, Ljava/util/ArrayList;

    .line 2505
    .line 2506
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2507
    .line 2508
    .line 2509
    const/4 v7, 0x4

    .line 2510
    invoke-static {v7, v2}, Lfk6;->j(ILfk6;)Ljava/util/List;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v2

    .line 2514
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2515
    .line 2516
    .line 2517
    move-result v5

    .line 2518
    const/4 v7, 0x0

    .line 2519
    const/4 v8, 0x0

    .line 2520
    :goto_3f
    if-ge v7, v5, :cond_89

    .line 2521
    .line 2522
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v9

    .line 2526
    check-cast v9, Lfk6;

    .line 2527
    .line 2528
    invoke-virtual {v9}, Lfk6;->k()Lak6;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v10

    .line 2532
    sget-object v12, Ljk6;->J:Lnk6;

    .line 2533
    .line 2534
    iget-object v10, v10, Lak6;->w:Ltp4;

    .line 2535
    .line 2536
    invoke-virtual {v10, v12}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 2537
    .line 2538
    .line 2539
    move-result v10

    .line 2540
    if-eqz v10, :cond_88

    .line 2541
    .line 2542
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2543
    .line 2544
    .line 2545
    iget-object v9, v9, Lfk6;->c:Luy3;

    .line 2546
    .line 2547
    invoke-virtual {v9}, Luy3;->w()I

    .line 2548
    .line 2549
    .line 2550
    move-result v9

    .line 2551
    iget-object v10, v14, Lfk6;->c:Luy3;

    .line 2552
    .line 2553
    invoke-virtual {v10}, Luy3;->w()I

    .line 2554
    .line 2555
    .line 2556
    move-result v10

    .line 2557
    if-ge v9, v10, :cond_88

    .line 2558
    .line 2559
    add-int/lit8 v8, v8, 0x1

    .line 2560
    .line 2561
    :cond_88
    add-int/lit8 v7, v7, 0x1

    .line 2562
    .line 2563
    goto :goto_3f

    .line 2564
    :cond_89
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2565
    .line 2566
    .line 2567
    move-result v2

    .line 2568
    if-nez v2, :cond_8e

    .line 2569
    .line 2570
    invoke-static {v3}, Lrj1;->n(Ljava/util/ArrayList;)Z

    .line 2571
    .line 2572
    .line 2573
    move-result v2

    .line 2574
    if-eqz v2, :cond_8a

    .line 2575
    .line 2576
    const/16 v27, 0x0

    .line 2577
    .line 2578
    goto :goto_40

    .line 2579
    :cond_8a
    move/from16 v27, v8

    .line 2580
    .line 2581
    :goto_40
    if-eqz v2, :cond_8b

    .line 2582
    .line 2583
    move/from16 v29, v8

    .line 2584
    .line 2585
    goto :goto_41

    .line 2586
    :cond_8b
    const/16 v29, 0x0

    .line 2587
    .line 2588
    :goto_41
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v2

    .line 2592
    sget-object v3, Ljk6;->J:Lnk6;

    .line 2593
    .line 2594
    iget-object v2, v2, Lak6;->w:Ltp4;

    .line 2595
    .line 2596
    invoke-virtual {v2, v3}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v2

    .line 2600
    if-nez v2, :cond_8c

    .line 2601
    .line 2602
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2603
    .line 2604
    :cond_8c
    check-cast v2, Ljava/lang/Boolean;

    .line 2605
    .line 2606
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2607
    .line 2608
    .line 2609
    move-result v32

    .line 2610
    const/16 v31, 0x0

    .line 2611
    .line 2612
    const/16 v28, 0x1

    .line 2613
    .line 2614
    const/16 v30, 0x1

    .line 2615
    .line 2616
    invoke-static/range {v27 .. v32}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 2617
    .line 2618
    .line 2619
    move-result-object v2

    .line 2620
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 2621
    .line 2622
    .line 2623
    goto :goto_42

    .line 2624
    :cond_8d
    invoke-static {}, Lku4;->a()V

    .line 2625
    .line 2626
    .line 2627
    :cond_8e
    :goto_42
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v2

    .line 2631
    sget-object v3, Ljk6;->v:Lnk6;

    .line 2632
    .line 2633
    invoke-static {v2, v3}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2634
    .line 2635
    .line 2636
    move-result-object v2

    .line 2637
    check-cast v2, Lvg6;

    .line 2638
    .line 2639
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2640
    .line 2641
    .line 2642
    move-result-object v3

    .line 2643
    sget-object v5, Lzj6;->d:Lnk6;

    .line 2644
    .line 2645
    invoke-static {v3, v5}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v3

    .line 2649
    check-cast v3, Lh4;

    .line 2650
    .line 2651
    if-eqz v2, :cond_97

    .line 2652
    .line 2653
    if-eqz v3, :cond_97

    .line 2654
    .line 2655
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2656
    .line 2657
    .line 2658
    move-result-object v5

    .line 2659
    sget-object v7, Ljk6;->f:Lnk6;

    .line 2660
    .line 2661
    iget-object v5, v5, Lak6;->w:Ltp4;

    .line 2662
    .line 2663
    invoke-virtual {v5, v7}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v5

    .line 2667
    if-nez v5, :cond_8f

    .line 2668
    .line 2669
    move-object/from16 v5, v16

    .line 2670
    .line 2671
    :cond_8f
    if-nez v5, :cond_92

    .line 2672
    .line 2673
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v5

    .line 2677
    sget-object v7, Ljk6;->e:Lnk6;

    .line 2678
    .line 2679
    iget-object v5, v5, Lak6;->w:Ltp4;

    .line 2680
    .line 2681
    invoke-virtual {v5, v7}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2682
    .line 2683
    .line 2684
    move-result-object v5

    .line 2685
    if-nez v5, :cond_90

    .line 2686
    .line 2687
    move-object/from16 v5, v16

    .line 2688
    .line 2689
    :cond_90
    if-eqz v5, :cond_91

    .line 2690
    .line 2691
    goto :goto_43

    .line 2692
    :cond_91
    const-string v5, "android.widget.HorizontalScrollView"

    .line 2693
    .line 2694
    invoke-virtual {v1, v5}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 2695
    .line 2696
    .line 2697
    :cond_92
    :goto_43
    iget-object v5, v2, Lvg6;->b:Lsr2;

    .line 2698
    .line 2699
    invoke-interface {v5}, Lsr2;->b()Ljava/lang/Object;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v5

    .line 2703
    check-cast v5, Ljava/lang/Number;

    .line 2704
    .line 2705
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 2706
    .line 2707
    .line 2708
    move-result v5

    .line 2709
    cmpl-float v5, v5, p0

    .line 2710
    .line 2711
    if-lez v5, :cond_93

    .line 2712
    .line 2713
    const/4 v15, 0x1

    .line 2714
    invoke-virtual {v1, v15}, Lc5;->k(Z)V

    .line 2715
    .line 2716
    .line 2717
    :cond_93
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 2718
    .line 2719
    .line 2720
    move-result v5

    .line 2721
    if-eqz v5, :cond_97

    .line 2722
    .line 2723
    invoke-static {v2}, Loe;->y(Lvg6;)Z

    .line 2724
    .line 2725
    .line 2726
    move-result v5

    .line 2727
    sget-object v7, Ley3;->x:Ley3;

    .line 2728
    .line 2729
    if-eqz v5, :cond_95

    .line 2730
    .line 2731
    sget-object v5, Lw4;->h:Lw4;

    .line 2732
    .line 2733
    invoke-virtual {v1, v5}, Lc5;->b(Lw4;)V

    .line 2734
    .line 2735
    .line 2736
    move-object/from16 v5, v22

    .line 2737
    .line 2738
    iget-object v8, v5, Luy3;->U:Ley3;

    .line 2739
    .line 2740
    if-ne v8, v7, :cond_94

    .line 2741
    .line 2742
    sget-object v8, Lw4;->n:Lw4;

    .line 2743
    .line 2744
    goto :goto_44

    .line 2745
    :cond_94
    sget-object v8, Lw4;->p:Lw4;

    .line 2746
    .line 2747
    :goto_44
    invoke-virtual {v1, v8}, Lc5;->b(Lw4;)V

    .line 2748
    .line 2749
    .line 2750
    goto :goto_45

    .line 2751
    :cond_95
    move-object/from16 v5, v22

    .line 2752
    .line 2753
    :goto_45
    invoke-static {v2}, Loe;->x(Lvg6;)Z

    .line 2754
    .line 2755
    .line 2756
    move-result v2

    .line 2757
    if-eqz v2, :cond_97

    .line 2758
    .line 2759
    sget-object v2, Lw4;->i:Lw4;

    .line 2760
    .line 2761
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2762
    .line 2763
    .line 2764
    iget-object v2, v5, Luy3;->U:Ley3;

    .line 2765
    .line 2766
    if-ne v2, v7, :cond_96

    .line 2767
    .line 2768
    sget-object v2, Lw4;->p:Lw4;

    .line 2769
    .line 2770
    goto :goto_46

    .line 2771
    :cond_96
    sget-object v2, Lw4;->n:Lw4;

    .line 2772
    .line 2773
    :goto_46
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2774
    .line 2775
    .line 2776
    :cond_97
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v2

    .line 2780
    sget-object v5, Ljk6;->w:Lnk6;

    .line 2781
    .line 2782
    invoke-static {v2, v5}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v2

    .line 2786
    check-cast v2, Lvg6;

    .line 2787
    .line 2788
    if-eqz v2, :cond_9e

    .line 2789
    .line 2790
    if-eqz v3, :cond_9e

    .line 2791
    .line 2792
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v3

    .line 2796
    sget-object v5, Ljk6;->f:Lnk6;

    .line 2797
    .line 2798
    iget-object v3, v3, Lak6;->w:Ltp4;

    .line 2799
    .line 2800
    invoke-virtual {v3, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v3

    .line 2804
    if-nez v3, :cond_98

    .line 2805
    .line 2806
    move-object/from16 v3, v16

    .line 2807
    .line 2808
    :cond_98
    if-nez v3, :cond_9b

    .line 2809
    .line 2810
    invoke-virtual {v14}, Lfk6;->k()Lak6;

    .line 2811
    .line 2812
    .line 2813
    move-result-object v3

    .line 2814
    sget-object v5, Ljk6;->e:Lnk6;

    .line 2815
    .line 2816
    iget-object v3, v3, Lak6;->w:Ltp4;

    .line 2817
    .line 2818
    invoke-virtual {v3, v5}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2819
    .line 2820
    .line 2821
    move-result-object v3

    .line 2822
    if-nez v3, :cond_99

    .line 2823
    .line 2824
    move-object/from16 v3, v16

    .line 2825
    .line 2826
    :cond_99
    if-eqz v3, :cond_9a

    .line 2827
    .line 2828
    goto :goto_47

    .line 2829
    :cond_9a
    const-string v3, "android.widget.ScrollView"

    .line 2830
    .line 2831
    invoke-virtual {v1, v3}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 2832
    .line 2833
    .line 2834
    :cond_9b
    :goto_47
    iget-object v3, v2, Lvg6;->b:Lsr2;

    .line 2835
    .line 2836
    invoke-interface {v3}, Lsr2;->b()Ljava/lang/Object;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v3

    .line 2840
    check-cast v3, Ljava/lang/Number;

    .line 2841
    .line 2842
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 2843
    .line 2844
    .line 2845
    move-result v3

    .line 2846
    cmpl-float v3, v3, p0

    .line 2847
    .line 2848
    if-lez v3, :cond_9c

    .line 2849
    .line 2850
    const/4 v15, 0x1

    .line 2851
    invoke-virtual {v1, v15}, Lc5;->k(Z)V

    .line 2852
    .line 2853
    .line 2854
    :cond_9c
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 2855
    .line 2856
    .line 2857
    move-result v3

    .line 2858
    if-eqz v3, :cond_9e

    .line 2859
    .line 2860
    invoke-static {v2}, Loe;->y(Lvg6;)Z

    .line 2861
    .line 2862
    .line 2863
    move-result v3

    .line 2864
    if-eqz v3, :cond_9d

    .line 2865
    .line 2866
    sget-object v3, Lw4;->h:Lw4;

    .line 2867
    .line 2868
    invoke-virtual {v1, v3}, Lc5;->b(Lw4;)V

    .line 2869
    .line 2870
    .line 2871
    sget-object v3, Lw4;->o:Lw4;

    .line 2872
    .line 2873
    invoke-virtual {v1, v3}, Lc5;->b(Lw4;)V

    .line 2874
    .line 2875
    .line 2876
    :cond_9d
    invoke-static {v2}, Loe;->x(Lvg6;)Z

    .line 2877
    .line 2878
    .line 2879
    move-result v2

    .line 2880
    if-eqz v2, :cond_9e

    .line 2881
    .line 2882
    sget-object v2, Lw4;->i:Lw4;

    .line 2883
    .line 2884
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2885
    .line 2886
    .line 2887
    sget-object v2, Lw4;->m:Lw4;

    .line 2888
    .line 2889
    invoke-virtual {v1, v2}, Lc5;->b(Lw4;)V

    .line 2890
    .line 2891
    .line 2892
    :cond_9e
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2893
    .line 2894
    const/16 v3, 0x1d

    .line 2895
    .line 2896
    if-lt v2, v3, :cond_9f

    .line 2897
    .line 2898
    invoke-static {v1, v14}, Led1;->f(Lc5;Lfk6;)V

    .line 2899
    .line 2900
    .line 2901
    :cond_9f
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2902
    .line 2903
    .line 2904
    move-result-object v3

    .line 2905
    sget-object v5, Ljk6;->d:Lnk6;

    .line 2906
    .line 2907
    invoke-static {v3, v5}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2908
    .line 2909
    .line 2910
    move-result-object v3

    .line 2911
    check-cast v3, Ljava/lang/CharSequence;

    .line 2912
    .line 2913
    const/16 v5, 0x1c

    .line 2914
    .line 2915
    if-lt v2, v5, :cond_a0

    .line 2916
    .line 2917
    invoke-static {v4, v3}, Lq4;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 2918
    .line 2919
    .line 2920
    goto :goto_48

    .line 2921
    :cond_a0
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 2922
    .line 2923
    .line 2924
    move-result-object v2

    .line 2925
    const-string v5, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 2926
    .line 2927
    invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 2928
    .line 2929
    .line 2930
    :goto_48
    invoke-static {v14}, Lfd1;->o(Lfk6;)Z

    .line 2931
    .line 2932
    .line 2933
    move-result v2

    .line 2934
    if-eqz v2, :cond_ae

    .line 2935
    .line 2936
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v2

    .line 2940
    sget-object v3, Lzj6;->t:Lnk6;

    .line 2941
    .line 2942
    invoke-static {v2, v3}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2943
    .line 2944
    .line 2945
    move-result-object v2

    .line 2946
    check-cast v2, Lh4;

    .line 2947
    .line 2948
    if-eqz v2, :cond_a1

    .line 2949
    .line 2950
    new-instance v3, Lw4;

    .line 2951
    .line 2952
    const/high16 v5, 0x40000

    .line 2953
    .line 2954
    iget-object v2, v2, Lh4;->a:Ljava/lang/String;

    .line 2955
    .line 2956
    invoke-direct {v3, v5, v2}, Lw4;-><init>(ILjava/lang/String;)V

    .line 2957
    .line 2958
    .line 2959
    invoke-virtual {v1, v3}, Lc5;->b(Lw4;)V

    .line 2960
    .line 2961
    .line 2962
    :cond_a1
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2963
    .line 2964
    .line 2965
    move-result-object v2

    .line 2966
    sget-object v3, Lzj6;->u:Lnk6;

    .line 2967
    .line 2968
    invoke-static {v2, v3}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2969
    .line 2970
    .line 2971
    move-result-object v2

    .line 2972
    check-cast v2, Lh4;

    .line 2973
    .line 2974
    if-eqz v2, :cond_a2

    .line 2975
    .line 2976
    new-instance v3, Lw4;

    .line 2977
    .line 2978
    const/high16 v5, 0x80000

    .line 2979
    .line 2980
    iget-object v2, v2, Lh4;->a:Ljava/lang/String;

    .line 2981
    .line 2982
    invoke-direct {v3, v5, v2}, Lw4;-><init>(ILjava/lang/String;)V

    .line 2983
    .line 2984
    .line 2985
    invoke-virtual {v1, v3}, Lc5;->b(Lw4;)V

    .line 2986
    .line 2987
    .line 2988
    :cond_a2
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 2989
    .line 2990
    .line 2991
    move-result-object v2

    .line 2992
    sget-object v3, Lzj6;->v:Lnk6;

    .line 2993
    .line 2994
    invoke-static {v2, v3}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 2995
    .line 2996
    .line 2997
    move-result-object v2

    .line 2998
    check-cast v2, Lh4;

    .line 2999
    .line 3000
    if-eqz v2, :cond_a3

    .line 3001
    .line 3002
    new-instance v3, Lw4;

    .line 3003
    .line 3004
    const/high16 v5, 0x100000

    .line 3005
    .line 3006
    iget-object v2, v2, Lh4;->a:Ljava/lang/String;

    .line 3007
    .line 3008
    invoke-direct {v3, v5, v2}, Lw4;-><init>(ILjava/lang/String;)V

    .line 3009
    .line 3010
    .line 3011
    invoke-virtual {v1, v3}, Lc5;->b(Lw4;)V

    .line 3012
    .line 3013
    .line 3014
    :cond_a3
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 3015
    .line 3016
    .line 3017
    move-result-object v2

    .line 3018
    sget-object v3, Lzj6;->x:Lnk6;

    .line 3019
    .line 3020
    iget-object v2, v2, Lak6;->w:Ltp4;

    .line 3021
    .line 3022
    invoke-virtual {v2, v3}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 3023
    .line 3024
    .line 3025
    move-result v2

    .line 3026
    if-eqz v2, :cond_ae

    .line 3027
    .line 3028
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 3029
    .line 3030
    .line 3031
    move-result-object v2

    .line 3032
    invoke-virtual {v2, v3}, Lak6;->k(Lnk6;)Ljava/lang/Object;

    .line 3033
    .line 3034
    .line 3035
    move-result-object v2

    .line 3036
    check-cast v2, Ljava/util/List;

    .line 3037
    .line 3038
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 3039
    .line 3040
    .line 3041
    move-result v3

    .line 3042
    sget-object v5, Loe;->l0:Lxo4;

    .line 3043
    .line 3044
    iget v7, v5, Lxo4;->b:I

    .line 3045
    .line 3046
    if-ge v3, v7, :cond_ad

    .line 3047
    .line 3048
    new-instance v3, Lcz6;

    .line 3049
    .line 3050
    const/4 v13, 0x0

    .line 3051
    invoke-direct {v3, v13}, Lcz6;-><init>(I)V

    .line 3052
    .line 3053
    .line 3054
    invoke-static {}, Lv25;->a()Lhp4;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v7

    .line 3058
    move-object/from16 v8, v21

    .line 3059
    .line 3060
    iget-boolean v9, v8, Lcz6;->w:Z

    .line 3061
    .line 3062
    if-eqz v9, :cond_a4

    .line 3063
    .line 3064
    invoke-static {v8}, Lrg3;->e(Lcz6;)V

    .line 3065
    .line 3066
    .line 3067
    :cond_a4
    iget-object v9, v8, Lcz6;->x:[I

    .line 3068
    .line 3069
    iget v10, v8, Lcz6;->z:I

    .line 3070
    .line 3071
    invoke-static {v10, v6, v9}, Lie1;->q(II[I)I

    .line 3072
    .line 3073
    .line 3074
    move-result v9

    .line 3075
    if-ltz v9, :cond_a5

    .line 3076
    .line 3077
    const/4 v9, 0x1

    .line 3078
    goto :goto_49

    .line 3079
    :cond_a5
    const/4 v9, 0x0

    .line 3080
    :goto_49
    if-eqz v9, :cond_ab

    .line 3081
    .line 3082
    invoke-virtual {v8, v6}, Lcz6;->c(I)Ljava/lang/Object;

    .line 3083
    .line 3084
    .line 3085
    move-result-object v9

    .line 3086
    check-cast v9, Lhp4;

    .line 3087
    .line 3088
    const/16 v12, 0x10

    .line 3089
    .line 3090
    new-array v10, v12, [I

    .line 3091
    .line 3092
    iget-object v12, v5, Lxo4;->a:[I

    .line 3093
    .line 3094
    iget v5, v5, Lxo4;->b:I

    .line 3095
    .line 3096
    move-object v15, v10

    .line 3097
    const/4 v10, 0x0

    .line 3098
    const/4 v13, 0x0

    .line 3099
    :goto_4a
    if-ge v10, v5, :cond_a7

    .line 3100
    .line 3101
    aget v17, v12, v10

    .line 3102
    .line 3103
    move/from16 v18, v5

    .line 3104
    .line 3105
    add-int/lit8 v5, v13, 0x1

    .line 3106
    .line 3107
    move-object/from16 p0, v9

    .line 3108
    .line 3109
    array-length v9, v15

    .line 3110
    if-ge v9, v5, :cond_a6

    .line 3111
    .line 3112
    array-length v9, v15

    .line 3113
    const/16 v26, 0x3

    .line 3114
    .line 3115
    mul-int/lit8 v9, v9, 0x3

    .line 3116
    .line 3117
    const/16 v19, 0x2

    .line 3118
    .line 3119
    div-int/lit8 v9, v9, 0x2

    .line 3120
    .line 3121
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    .line 3122
    .line 3123
    .line 3124
    move-result v9

    .line 3125
    invoke-static {v15, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 3126
    .line 3127
    .line 3128
    move-result-object v9

    .line 3129
    move-object v15, v9

    .line 3130
    goto :goto_4b

    .line 3131
    :cond_a6
    const/16 v19, 0x2

    .line 3132
    .line 3133
    const/16 v26, 0x3

    .line 3134
    .line 3135
    :goto_4b
    aput v17, v15, v13

    .line 3136
    .line 3137
    add-int/lit8 v10, v10, 0x1

    .line 3138
    .line 3139
    move-object/from16 v9, p0

    .line 3140
    .line 3141
    move v13, v5

    .line 3142
    move/from16 v5, v18

    .line 3143
    .line 3144
    goto :goto_4a

    .line 3145
    :cond_a7
    move-object/from16 p0, v9

    .line 3146
    .line 3147
    new-instance v5, Ljava/util/ArrayList;

    .line 3148
    .line 3149
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 3150
    .line 3151
    .line 3152
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3153
    .line 3154
    .line 3155
    move-result v9

    .line 3156
    if-gtz v9, :cond_aa

    .line 3157
    .line 3158
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 3159
    .line 3160
    .line 3161
    move-result v2

    .line 3162
    if-gtz v2, :cond_a8

    .line 3163
    .line 3164
    goto :goto_4c

    .line 3165
    :cond_a8
    const/4 v9, 0x0

    .line 3166
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3167
    .line 3168
    .line 3169
    move-result-object v0

    .line 3170
    invoke-static {v0}, Lf21;->u(Ljava/lang/Object;)V

    .line 3171
    .line 3172
    .line 3173
    if-gtz v13, :cond_a9

    .line 3174
    .line 3175
    const-string v0, "Index must be between 0 and size"

    .line 3176
    .line 3177
    invoke-static {v0}, Lh;->l(Ljava/lang/String;)V

    .line 3178
    .line 3179
    .line 3180
    goto/16 :goto_18

    .line 3181
    .line 3182
    :cond_a9
    aget v0, v15, v9

    .line 3183
    .line 3184
    throw v16

    .line 3185
    :cond_aa
    const/4 v9, 0x0

    .line 3186
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3187
    .line 3188
    .line 3189
    move-result-object v0

    .line 3190
    invoke-static {v0}, Lf21;->u(Ljava/lang/Object;)V

    .line 3191
    .line 3192
    .line 3193
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3194
    .line 3195
    .line 3196
    throw v16

    .line 3197
    :cond_ab
    const/4 v9, 0x0

    .line 3198
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 3199
    .line 3200
    .line 3201
    move-result v10

    .line 3202
    if-gtz v10, :cond_ac

    .line 3203
    .line 3204
    :goto_4c
    iget-object v2, v11, Loe;->N:Lcz6;

    .line 3205
    .line 3206
    invoke-virtual {v2, v6, v3}, Lcz6;->e(ILjava/lang/Object;)V

    .line 3207
    .line 3208
    .line 3209
    invoke-virtual {v8, v6, v7}, Lcz6;->e(ILjava/lang/Object;)V

    .line 3210
    .line 3211
    .line 3212
    goto :goto_4d

    .line 3213
    :cond_ac
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3214
    .line 3215
    .line 3216
    move-result-object v0

    .line 3217
    invoke-static {v0}, Lf21;->u(Ljava/lang/Object;)V

    .line 3218
    .line 3219
    .line 3220
    invoke-virtual {v5, v9}, Lxo4;->c(I)I

    .line 3221
    .line 3222
    .line 3223
    throw v16

    .line 3224
    :cond_ad
    const-string v0, "Can\'t have more than "

    .line 3225
    .line 3226
    const-string v1, " custom actions for one widget"

    .line 3227
    .line 3228
    invoke-static {v7, v0, v1}, Lpb4;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v0

    .line 3232
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 3233
    .line 3234
    .line 3235
    goto/16 :goto_18

    .line 3236
    .line 3237
    :cond_ae
    :goto_4d
    invoke-static {v14, v0}, Lfd1;->p(Lfk6;Landroid/content/res/Resources;)Z

    .line 3238
    .line 3239
    .line 3240
    move-result v0

    .line 3241
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3242
    .line 3243
    const/16 v5, 0x1c

    .line 3244
    .line 3245
    if-lt v2, v5, :cond_af

    .line 3246
    .line 3247
    invoke-static {v4, v0}, Lq4;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 3248
    .line 3249
    .line 3250
    goto :goto_4e

    .line 3251
    :cond_af
    const/4 v15, 0x1

    .line 3252
    invoke-virtual {v1, v15, v0}, Lc5;->h(IZ)V

    .line 3253
    .line 3254
    .line 3255
    :goto_4e
    iget-object v0, v11, Loe;->Y:Lwo4;

    .line 3256
    .line 3257
    invoke-virtual {v0, v6}, Lwo4;->d(I)I

    .line 3258
    .line 3259
    .line 3260
    move-result v0

    .line 3261
    const/4 v8, -0x1

    .line 3262
    if-eq v0, v8, :cond_b0

    .line 3263
    .line 3264
    invoke-virtual/range {v20 .. v20}, Lje;->getAndroidViewsHandler()Llj;

    .line 3265
    .line 3266
    .line 3267
    move-object/from16 v2, v20

    .line 3268
    .line 3269
    invoke-virtual {v4, v2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 3270
    .line 3271
    .line 3272
    iget-object v0, v11, Loe;->a0:Ljava/lang/String;

    .line 3273
    .line 3274
    move-object/from16 v3, v16

    .line 3275
    .line 3276
    invoke-virtual {v11, v6, v1, v0, v3}, Loe;->j(ILc5;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 3277
    .line 3278
    .line 3279
    goto :goto_4f

    .line 3280
    :cond_b0
    move-object/from16 v2, v20

    .line 3281
    .line 3282
    :goto_4f
    iget-object v0, v11, Loe;->Z:Lwo4;

    .line 3283
    .line 3284
    invoke-virtual {v0, v6}, Lwo4;->d(I)I

    .line 3285
    .line 3286
    .line 3287
    move-result v0

    .line 3288
    if-eq v0, v8, :cond_b1

    .line 3289
    .line 3290
    invoke-virtual {v2}, Lje;->getAndroidViewsHandler()Llj;

    .line 3291
    .line 3292
    .line 3293
    :cond_b1
    invoke-virtual {v14}, Lfk6;->n()Lak6;

    .line 3294
    .line 3295
    .line 3296
    move-result-object v0

    .line 3297
    sget-object v2, Lkk6;->b:Lnk6;

    .line 3298
    .line 3299
    invoke-static {v0, v2}, Lz65;->z(Lak6;Lnk6;)Ljava/lang/Object;

    .line 3300
    .line 3301
    .line 3302
    move-result-object v0

    .line 3303
    check-cast v0, Ljava/lang/String;

    .line 3304
    .line 3305
    if-eqz v0, :cond_b2

    .line 3306
    .line 3307
    invoke-virtual {v1, v0}, Lc5;->i(Ljava/lang/CharSequence;)V

    .line 3308
    .line 3309
    .line 3310
    :cond_b2
    move-object v8, v1

    .line 3311
    :goto_50
    iget-boolean v0, v11, Loe;->K:Z

    .line 3312
    .line 3313
    if-eqz v0, :cond_b5

    .line 3314
    .line 3315
    iget v0, v11, Loe;->G:I

    .line 3316
    .line 3317
    if-ne v6, v0, :cond_b3

    .line 3318
    .line 3319
    iput-object v8, v11, Loe;->I:Lc5;

    .line 3320
    .line 3321
    :cond_b3
    iget v0, v11, Loe;->H:I

    .line 3322
    .line 3323
    if-ne v6, v0, :cond_b5

    .line 3324
    .line 3325
    iput-object v8, v11, Loe;->J:Lc5;

    .line 3326
    .line 3327
    goto :goto_51

    .line 3328
    :cond_b4
    move v6, v1

    .line 3329
    move-object/from16 v3, v16

    .line 3330
    .line 3331
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3332
    .line 3333
    const-string v1, "semanticsNode "

    .line 3334
    .line 3335
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3336
    .line 3337
    .line 3338
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3339
    .line 3340
    .line 3341
    const-string v1, " has null parent"

    .line 3342
    .line 3343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3344
    .line 3345
    .line 3346
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3347
    .line 3348
    .line 3349
    move-result-object v0

    .line 3350
    invoke-static {v0}, Lyb3;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 3351
    .line 3352
    .line 3353
    invoke-static {}, Lta1;->e()V

    .line 3354
    .line 3355
    .line 3356
    move-object v8, v3

    .line 3357
    :cond_b5
    :goto_51
    return-object v8

    .line 3358
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x(I)Lc5;
    .locals 5

    .line 1
    iget v0, p0, Lke;->C:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    iget-object v2, p0, Lke;->D:Lk4;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Ljp0;

    .line 13
    .line 14
    if-ne p1, v3, :cond_0

    .line 15
    .line 16
    iget p1, v2, Ljp0;->G:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget p1, v2, Ljp0;->H:I

    .line 20
    .line 21
    :goto_0
    if-ne p1, v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, p1}, Lke;->n(I)Lc5;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    :goto_1
    return-object v4

    .line 29
    :pswitch_0
    check-cast v2, Loe;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-eq p1, v0, :cond_3

    .line 33
    .line 34
    if-ne p1, v3, :cond_2

    .line 35
    .line 36
    iget p1, v2, Loe;->G:I

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lke;->n(I)Lc5;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const-string p0, "Unknown focus type: "

    .line 44
    .line 45
    invoke-static {p1, p0}, Lhl6;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    iget p1, v2, Loe;->H:I

    .line 54
    .line 55
    if-ne p1, v1, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    invoke-virtual {p0, p1}, Lke;->n(I)Lc5;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_2
    return-object v4

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
